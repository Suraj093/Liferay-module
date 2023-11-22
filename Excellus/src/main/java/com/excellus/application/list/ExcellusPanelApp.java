package com.excellus.application.list;

import com.excellus.constants.ExcellusPanelCategoryKeys;
import com.excellus.constants.ExcellusPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author kushw
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + ExcellusPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class ExcellusPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return ExcellusPortletKeys.EXCELLUS;
	}
	
	@Override
	public Portlet getPortlet() {
		return _portlet;
	}
	@Reference(
		target = "(javax.portlet.name=" + ExcellusPortletKeys.EXCELLUS + ")",
		unbind = "-"
	)

	private Portlet _portlet;
}