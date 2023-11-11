/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.jio.service.impl;

import com.jio.model.Plan;
import com.jio.service.base.PlanLocalServiceBaseImpl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.jio.model.Plan", service = AopService.class
)
public class PlanLocalServiceImpl extends PlanLocalServiceBaseImpl {
	
	private static final Log _log = LogFactoryUtil.getLog(PlanLocalServiceImpl.class);
	
	public Plan addPlan(long userId, String price,String validity,String InternetData,
			List<String> subscription,String planName,String voice,String sms,boolean is5GEnable,
			boolean isPlanActive,String planEffectiveDate,String planTermedDate,
			ServiceContext serviceContext) {
		
		long scopeGroupId = serviceContext.getScopeGroupId();
		User user = null;
		try {
			user = userLocalService.getUserById(userId);
			if(user == null) {
				user = userLocalService.getUserById(serviceContext.getCompanyId(), userId);
			}
		} catch (PortalException e) {
			_log.info("User not found exception :: " + e.getMessage());
			e.printStackTrace();
		}
		
		Date now = new Date();
		
		long planId = counterLocalService.increment();
		
		Plan planEntry = planPersistence.create(planId);
		planEntry.setUuid(serviceContext.getUuid());
		planEntry.setPlanId(planId);
		planEntry.setGroupId(scopeGroupId);
		planEntry.setCompanyId(user.getCompanyId());
		planEntry.setUserName(user.getFullName());
		planEntry.setCreateDate(serviceContext.getCreateDate());
		planEntry.setModifiedDate(serviceContext.getModifiedDate());
		planEntry.setExpandoBridgeAttributes(serviceContext);
		planEntry.setPrice(price);
		planEntry.setValidity(validity);
		planEntry.setInternetData(InternetData);
		for(String subscriptions : subscription) {
			planEntry.setSubscription(subscriptions);
		}
		planEntry.setPlanName(planName);
		planEntry.setVoice(voice);
		planEntry.setSms(sms);
		planEntry.setIs5GEnable(is5GEnable);
		planEntry.setPlanEffectiveDate(planEffectiveDate);
		planEntry.setPlanTermedDate(planTermedDate);
		planEntry.setIsPlanActive(isPlanActive);
		
		return planEntry;
		
	}
	
}