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

package com.max.service.impl;

import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.service.ServiceContext;
import com.max.model.Maxuser;
import com.max.service.base.MaxuserLocalServiceBaseImpl;

import java.util.Date;
import java.util.List;

import org.osgi.service.component.annotations.Component;

/**
 * @author Brian Wing Shun Chan
 */
@Component(
	property = "model.class.name=com.max.model.Maxuser",
	service = AopService.class
)
public class MaxuserLocalServiceImpl extends MaxuserLocalServiceBaseImpl {
	
	private static final Log _log = LogFactoryUtil.getLog(MaxuserLocalServiceImpl.class);
	
	public Maxuser addMaxUser(long userId, String firstName, String lastName, String contactNumber,
			String email, String dateOfBirth, ServiceContext serviceContext) {
		
		long scopeGroupId = serviceContext.getScopeGroupId();
		
		Date now = new Date();
		
		User user = null;
		String userFullName = null;
		
		try {
			user = userLocalService.getUser(userId);
			userFullName = user.getFullName();
			if(userFullName == null || userFullName.isEmpty()) {
				userFullName = "Guest";
			}
		} catch (PortalException e) {
			_log.error("User not found :: " + e.getMessage());
			e.printStackTrace();
		}
		long maxUserId = counterLocalService.increment();
		Maxuser maxUserEntry = maxuserPersistence.create(maxUserId);
		maxUserEntry.setUuid(serviceContext.getUuid());
		maxUserEntry.setMaxUserId(maxUserId);
		maxUserEntry.setGroupId(scopeGroupId);
		maxUserEntry.setCompanyId(serviceContext.getCompanyId());
		maxUserEntry.setUserId(userId);
		maxUserEntry.setUserName(user.getFullName());
		maxUserEntry.setCreateDate(now);
		maxUserEntry.setModifiedDate(now);
		maxUserEntry.setMaxUserFirstName(firstName);
		maxUserEntry.setMaxUserLastName(lastName);
		maxUserEntry.setMaxUserContactNumber(contactNumber);
		maxUserEntry.setMaxUserEmailId(email);
		maxUserEntry.setMaxUserDateOfBirth(dateOfBirth);
		maxUserEntry.setMaxUserUuid(serviceContext.getUuid());
		
		Maxuser latestMaxUserEntry = maxuserPersistence.update(maxUserEntry);
		
		return latestMaxUserEntry;
		
	}
	
	public List<Maxuser> getMaxUsers(long groupId) {
		
		_log.info("In get user by company id method :: ");
		
		List<Maxuser> findBygroupId = maxuserPersistence.findByGroupId(groupId);
		
		_log.info("In get user by company id :: " + findBygroupId);

		return findBygroupId;
	}
	
}