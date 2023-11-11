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

package com.max.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link MaxuserService}.
 *
 * @author Brian Wing Shun Chan
 * @see MaxuserService
 * @generated
 */
public class MaxuserServiceWrapper
	implements MaxuserService, ServiceWrapper<MaxuserService> {

	public MaxuserServiceWrapper() {
		this(null);
	}

	public MaxuserServiceWrapper(MaxuserService maxuserService) {
		_maxuserService = maxuserService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _maxuserService.getOSGiServiceIdentifier();
	}

	@Override
	public MaxuserService getWrappedService() {
		return _maxuserService;
	}

	@Override
	public void setWrappedService(MaxuserService maxuserService) {
		_maxuserService = maxuserService;
	}

	private MaxuserService _maxuserService;

}