package com.demo.action;

import com.demo.constants.DemoPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.PortletURLFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.BaseMVCActionCommand;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.servlet.SessionMessages;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.max.service.MaxuserLocalService;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletRequest;
import javax.portlet.PortletURL;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(immediate = true, property = { "javax.portlet.name=" + DemoPortletKeys.DEMO_PORTLET_ID,
		"mvc.command.name=register" },

		service = MVCActionCommand.class)

public class RegisterUserMVCActionCommand extends BaseMVCActionCommand {
	
	private static final Log _log = LogFactoryUtil.getLog(RegisterUserMVCActionCommand.class);

	@Override
	protected void doProcessAction(ActionRequest actionRequest, ActionResponse actionResponse) throws Exception {
		
		_log.info("In doProcessAction method :: ");
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
		
		ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long userId = themeDisplay.getUserId();
		
		String firstName = ParamUtil.getString(actionRequest, "firstName");
		String lastName = ParamUtil.getString(actionRequest, "lastName");
		String phoneNumber = ParamUtil.getString(actionRequest, "contactNumber");
		String email = ParamUtil.getString(actionRequest, "email");
		String dateOfBirth = ParamUtil.getString(actionRequest, "dob");
		
		try {
			
			_maxLocalService.addMaxUser(userId, firstName, lastName, phoneNumber, email, 
					dateOfBirth, serviceContext);
			hideDefaultSuccessMessage(actionRequest);
			SessionMessages.add(actionRequest, "success");
			actionResponse.getRenderParameters().setValue("mvcRenderCommandName","/user/table");
			
		} catch (Exception e) {
			_log.error("Having some issue while saving data :: " + e.getMessage());
			SessionErrors.add(actionRequest, "error");
			actionResponse.getRenderParameters().setValue("mvcPath", "/view.jsp");
		}
				
	}

	
	@Reference
	MaxuserLocalService _maxLocalService;

}
