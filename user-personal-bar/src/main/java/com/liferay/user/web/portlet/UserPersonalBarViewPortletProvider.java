package com.liferay.user.web.portlet;

import com.liferay.admin.kernel.util.PortalUserPersonalBarApplicationType;
import com.liferay.portal.kernel.portlet.BasePortletProvider;
import com.liferay.portal.kernel.portlet.PortletProvider;
import com.liferay.user.web.constants.UserPersonalBarPortletKeys;

import org.osgi.service.component.annotations.Component;

@Component(immediate = true, property = "model.class.name="
		+ PortalUserPersonalBarApplicationType.UserPersonalBar.CLASS_NAME, 
		service = PortletProvider.class)

public class UserPersonalBarViewPortletProvider extends BasePortletProvider{

	@Override
	public String getPortletName() {
		return UserPersonalBarPortletKeys.USERPERSONALBAR;
	}

	@Override
	public Action[] getSupportedActions() {
		return _supportedActions;
	}
	
	private final Action[] _supportedActions = {Action.VIEW};

}
