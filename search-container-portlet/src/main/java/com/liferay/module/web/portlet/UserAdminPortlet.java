package com.liferay.module.web.portlet;

import com.liferay.module.web.constants.SearchContainerPortletKeys;
import javax.portlet.Portlet;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = { "com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.scopeable=true", "javax.portlet.display-name=User", "javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.portlet-title-based-navigation=true", "javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/user_admin/user_view.jsp",
		"javax.portlet.name=" + SearchContainerPortletKeys.USERSEARCHCONTAINER,
		"javax.portlet.resource-bundle=content.Language", "javax.portlet.security-role-ref=administrator",
		"javax.portlet.supports.mime-type=text/html", "com.liferay.portlet.add-default-resource=true"

}, service = Portlet.class

)

public class UserAdminPortlet extends MVCPortlet {

}
