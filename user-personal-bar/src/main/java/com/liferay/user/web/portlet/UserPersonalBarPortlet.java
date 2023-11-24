package com.liferay.user.web.portlet;

import com.liferay.user.web.constants.UserPersonalBarPortletKeys;
import com.liferay.user.web.constants.UserPersonalBarWebsKeys;

import java.io.IOException;

import com.liferay.application.list.PanelAppRegistry;
import com.liferay.application.list.PanelCategoryRegistry;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserNotificationDeliveryConstants;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.UserNotificationEventLocalService;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.Portal;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.site.util.RecentGroupManager;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author kushw
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.hidden",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=User Personal Bar",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.expiration-cache=0",
		"javax.portlet.init-param.template-path=/META-INF/resources/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + UserPersonalBarPortletKeys.USERPERSONALBAR,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user",
		"javax.portlet.version=3.0"
	},
	service = Portlet.class
)
public class UserPersonalBarPortlet extends MVCPortlet {
	
	@Override
	protected void doDispatch(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		
		ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(
				WebKeys.THEME_DISPLAY);
		
		User userBlock = themeDisplay.getUser();
		
		if(!userBlock.isGuestUser()) {
			renderRequest.setAttribute(UserPersonalBarWebsKeys.NOTIFICATION_COUNT, _getNotificationsCount(themeDisplay));
		}
		
		_recentGroupManager.addRecentGroup(
				_portal.getHttpServletRequest(renderRequest),
				themeDisplay.getScopeGroupId());
		
		super.doDispatch(renderRequest, renderResponse);
		
	}
	
	protected int _getNotificationsCount(ThemeDisplay themeDisplay) {
		
		if(_userNotificationEventLocalService == null) {
			return 0;
		}
		
		return _userNotificationEventLocalService.
				getArchivedUserNotificationEventsCount(themeDisplay.getUserId(), UserNotificationDeliveryConstants.TYPE_WEBSITE,true, false);
		
	}
	
	@Reference
	private Portal _portal;

	@Reference
	private RecentGroupManager _recentGroupManager;
	
	@Reference
	private UserNotificationEventLocalService
		_userNotificationEventLocalService;

	
}