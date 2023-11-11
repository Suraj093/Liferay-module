package com.liferay.custom.form.portlet;

import com.liferay.custom.form.constants.LiferayCustomFormPortletKeys;
import com.liferay.custom.form.util.LiferayCustomFormUtil;
import com.liferay.dynamic.data.mapping.model.DDMFormInstance;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author kushw
 */
@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css", "com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=LiferayCustomForm", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + LiferayCustomFormPortletKeys.LIFERAYCUSTOMFORM,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user" }, service = Portlet.class)
public class LiferayCustomFormPortlet extends MVCPortlet {

	private static final Log _log = LogFactoryUtil.getLog(LiferayCustomFormPortlet.class);

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		
		_log.info("In doView method :: ");

		String formName = LiferayCustomFormUtil.getFormName(renderRequest);
		_log.info("Form name :: " + formName);

		String refererUrl = LiferayCustomFormUtil.getRefererUrl(renderRequest);
		_log.info("Referer Url :: " + refererUrl);
		
		Long formMappingId = LiferayCustomFormUtil.getFormMappingId(renderRequest);
		_log.info("Form mapping id :: " + formMappingId);

		super.doView(renderRequest, renderResponse);
	}

}