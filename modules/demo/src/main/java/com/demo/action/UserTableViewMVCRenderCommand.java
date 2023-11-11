package com.demo.action;

import com.demo.constants.DemoPortletKeys;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import com.max.model.Maxuser;
import com.max.service.MaxuserLocalService;
import com.max.service.MaxuserLocalServiceUtil;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.PortletRequest;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, property = { "javax.portlet.name=" + DemoPortletKeys.DEMO_PORTLET_ID,
		"mvc.command.name=/user/table" },

		service = MVCRenderCommand.class)

public class UserTableViewMVCRenderCommand implements MVCRenderCommand {
	
	private static final Log _log = LogFactoryUtil.getLog(UserTableViewMVCRenderCommand.class);

	@Reference
	MaxuserLocalService _maxLocalService;


	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		_log.info("User table render method :: ");
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		
		long scopeGroupId = themeDisplay.getScopeGroupId();
		
		List<Maxuser> maxUsers = _maxLocalService.getMaxUsers(scopeGroupId);
		
		if(maxUsers !=  null) {
			renderRequest.setAttribute("data", maxUsers);
		}
		
		
				
		return "/viewlist.jsp";
	}
	

}
