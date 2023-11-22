package com.dummy.pannel.application.list;

import com.dummy.pannel.constants.DummyPanelCategoryKeys;
import com.dummy.pannel.constants.DummyPortletKeys;

import com.liferay.application.list.BasePanelApp;
import com.liferay.application.list.PanelApp;
import com.liferay.portal.kernel.model.Portlet;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Suraj Kushwaha
 */
@Component(
	immediate = true,
	property = {
		"panel.app.order:Integer=100",
		"panel.category.key=" + DummyPanelCategoryKeys.CONTROL_PANEL_CATEGORY
	},
	service = PanelApp.class
)
public class DummyPanelApp extends BasePanelApp {

	@Override
	public String getPortletId() {
		return DummyPortletKeys.DUMMY;
	}

	@Override
	public Portlet getPortlet() {
		return _portlet;
	}

	@Reference(
		target = "(javax.portlet.name=" + DummyPortletKeys.DUMMY + ")",
		unbind = "-"
	)
	
	private Portlet _portlet;
	
}