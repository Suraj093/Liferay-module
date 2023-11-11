package com.liferay.custom.form.util;

import com.liferay.custom.form.portlet.LiferayCustomFormPortlet;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.PortalUtil;

import javax.portlet.PortletRequest;
import javax.servlet.http.HttpServletRequest;

public class LiferayCustomFormUtil {

	private static final Log _log = LogFactoryUtil.getLog(LiferayCustomFormUtil.class);

	public static String getFormName(PortletRequest request) {
		// first check form_name in the query string
		String formName = ParamUtil.getString(getHttpServletRequest(request), "form_name");

		// else find in the attribute in the success case
		if (formName == null || formName.isEmpty()) {
			if (null != getHttpServletRequest(request).getAttribute("form_name")) {
				formName = (String) getHttpServletRequest(request).getAttribute("form_name");
			}
		}

		// finally check formName in the exception case set in the render parameters
		if (formName == null || formName.isEmpty()) {
			formName = ParamUtil.getString(request, "form_name");
		}

		return formName;
	}

	public static String getRefererUrl(PortletRequest request) {

		String refererUrl = ParamUtil.getString(request, "refererUrl");
		String refererUrlAttributes = (String) getHttpServletRequest(request).getAttribute("refererUrl");
		_log.info("RefererUrl inside form util from request attribute :: " + refererUrlAttributes);
		_log.info("RefererUrl inside form util 1 :: " + refererUrl);

		if (refererUrl == null || refererUrl.isEmpty()) {
			refererUrl = ParamUtil.getString(getHttpServletRequest(request), "refererUrl");
		}

		if (refererUrl == null || refererUrl.isEmpty()) {
			refererUrl = (String) getHttpServletRequest(request).getAttribute("refererUrl");
		}

		_log.info("RefererUrl inside form util 2 :: " + refererUrl);

		if (refererUrl == null || refererUrl.isEmpty()) {
			refererUrl = getHttpServletRequest(request).getHeader("refererUrl");
		}

		_log.info("RefererUrl inside form util 3 :: " + refererUrl);

		return refererUrl;

	}

	public static Long getFormMappingId(PortletRequest request) {

		Long formMappingId = ParamUtil.getLong(getHttpServletRequest(request), "fmi");

		if (formMappingId == null || formMappingId == 0) {
			if (null != getHttpServletRequest(request).getAttribute("fmi")) {
				formMappingId = (Long) getHttpServletRequest(request).getAttribute("fmi");
			}
		}

		if (formMappingId == null || formMappingId == 0) {
			formMappingId = ParamUtil.getLong(request, "fmi");
		}

		return formMappingId;

	}

	private static HttpServletRequest getHttpServletRequest(PortletRequest request) {
		return PortalUtil.getOriginalServletRequest(PortalUtil.getHttpServletRequest(request));
	}

}
