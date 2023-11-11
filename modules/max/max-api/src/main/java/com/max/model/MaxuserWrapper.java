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

package com.max.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Maxuser}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Maxuser
 * @generated
 */
public class MaxuserWrapper
	extends BaseModelWrapper<Maxuser>
	implements Maxuser, ModelWrapper<Maxuser> {

	public MaxuserWrapper(Maxuser maxuser) {
		super(maxuser);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("maxUserId", getMaxUserId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("maxUserFirstName", getMaxUserFirstName());
		attributes.put("maxUserLastName", getMaxUserLastName());
		attributes.put("maxUserContactNumber", getMaxUserContactNumber());
		attributes.put("maxUserEmailId", getMaxUserEmailId());
		attributes.put("maxUserDateOfBirth", getMaxUserDateOfBirth());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long maxUserId = (Long)attributes.get("maxUserId");

		if (maxUserId != null) {
			setMaxUserId(maxUserId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String maxUserFirstName = (String)attributes.get("maxUserFirstName");

		if (maxUserFirstName != null) {
			setMaxUserFirstName(maxUserFirstName);
		}

		String maxUserLastName = (String)attributes.get("maxUserLastName");

		if (maxUserLastName != null) {
			setMaxUserLastName(maxUserLastName);
		}

		String maxUserContactNumber = (String)attributes.get(
			"maxUserContactNumber");

		if (maxUserContactNumber != null) {
			setMaxUserContactNumber(maxUserContactNumber);
		}

		String maxUserEmailId = (String)attributes.get("maxUserEmailId");

		if (maxUserEmailId != null) {
			setMaxUserEmailId(maxUserEmailId);
		}

		String maxUserDateOfBirth = (String)attributes.get(
			"maxUserDateOfBirth");

		if (maxUserDateOfBirth != null) {
			setMaxUserDateOfBirth(maxUserDateOfBirth);
		}
	}

	@Override
	public Maxuser cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this maxuser.
	 *
	 * @return the company ID of this maxuser
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this maxuser.
	 *
	 * @return the create date of this maxuser
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this maxuser.
	 *
	 * @return the group ID of this maxuser
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the max user contact number of this maxuser.
	 *
	 * @return the max user contact number of this maxuser
	 */
	@Override
	public String getMaxUserContactNumber() {
		return model.getMaxUserContactNumber();
	}

	/**
	 * Returns the max user date of birth of this maxuser.
	 *
	 * @return the max user date of birth of this maxuser
	 */
	@Override
	public String getMaxUserDateOfBirth() {
		return model.getMaxUserDateOfBirth();
	}

	/**
	 * Returns the max user email ID of this maxuser.
	 *
	 * @return the max user email ID of this maxuser
	 */
	@Override
	public String getMaxUserEmailId() {
		return model.getMaxUserEmailId();
	}

	/**
	 * Returns the max user first name of this maxuser.
	 *
	 * @return the max user first name of this maxuser
	 */
	@Override
	public String getMaxUserFirstName() {
		return model.getMaxUserFirstName();
	}

	/**
	 * Returns the max user ID of this maxuser.
	 *
	 * @return the max user ID of this maxuser
	 */
	@Override
	public long getMaxUserId() {
		return model.getMaxUserId();
	}

	/**
	 * Returns the max user last name of this maxuser.
	 *
	 * @return the max user last name of this maxuser
	 */
	@Override
	public String getMaxUserLastName() {
		return model.getMaxUserLastName();
	}

	/**
	 * Returns the max user uuid of this maxuser.
	 *
	 * @return the max user uuid of this maxuser
	 */
	@Override
	public String getMaxUserUuid() {
		return model.getMaxUserUuid();
	}

	/**
	 * Returns the modified date of this maxuser.
	 *
	 * @return the modified date of this maxuser
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this maxuser.
	 *
	 * @return the primary key of this maxuser
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this maxuser.
	 *
	 * @return the user ID of this maxuser
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this maxuser.
	 *
	 * @return the user name of this maxuser
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this maxuser.
	 *
	 * @return the user uuid of this maxuser
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this maxuser.
	 *
	 * @return the uuid of this maxuser
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this maxuser.
	 *
	 * @param companyId the company ID of this maxuser
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this maxuser.
	 *
	 * @param createDate the create date of this maxuser
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this maxuser.
	 *
	 * @param groupId the group ID of this maxuser
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the max user contact number of this maxuser.
	 *
	 * @param maxUserContactNumber the max user contact number of this maxuser
	 */
	@Override
	public void setMaxUserContactNumber(String maxUserContactNumber) {
		model.setMaxUserContactNumber(maxUserContactNumber);
	}

	/**
	 * Sets the max user date of birth of this maxuser.
	 *
	 * @param maxUserDateOfBirth the max user date of birth of this maxuser
	 */
	@Override
	public void setMaxUserDateOfBirth(String maxUserDateOfBirth) {
		model.setMaxUserDateOfBirth(maxUserDateOfBirth);
	}

	/**
	 * Sets the max user email ID of this maxuser.
	 *
	 * @param maxUserEmailId the max user email ID of this maxuser
	 */
	@Override
	public void setMaxUserEmailId(String maxUserEmailId) {
		model.setMaxUserEmailId(maxUserEmailId);
	}

	/**
	 * Sets the max user first name of this maxuser.
	 *
	 * @param maxUserFirstName the max user first name of this maxuser
	 */
	@Override
	public void setMaxUserFirstName(String maxUserFirstName) {
		model.setMaxUserFirstName(maxUserFirstName);
	}

	/**
	 * Sets the max user ID of this maxuser.
	 *
	 * @param maxUserId the max user ID of this maxuser
	 */
	@Override
	public void setMaxUserId(long maxUserId) {
		model.setMaxUserId(maxUserId);
	}

	/**
	 * Sets the max user last name of this maxuser.
	 *
	 * @param maxUserLastName the max user last name of this maxuser
	 */
	@Override
	public void setMaxUserLastName(String maxUserLastName) {
		model.setMaxUserLastName(maxUserLastName);
	}

	/**
	 * Sets the max user uuid of this maxuser.
	 *
	 * @param maxUserUuid the max user uuid of this maxuser
	 */
	@Override
	public void setMaxUserUuid(String maxUserUuid) {
		model.setMaxUserUuid(maxUserUuid);
	}

	/**
	 * Sets the modified date of this maxuser.
	 *
	 * @param modifiedDate the modified date of this maxuser
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this maxuser.
	 *
	 * @param primaryKey the primary key of this maxuser
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this maxuser.
	 *
	 * @param userId the user ID of this maxuser
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this maxuser.
	 *
	 * @param userName the user name of this maxuser
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this maxuser.
	 *
	 * @param userUuid the user uuid of this maxuser
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this maxuser.
	 *
	 * @param uuid the uuid of this maxuser
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected MaxuserWrapper wrap(Maxuser maxuser) {
		return new MaxuserWrapper(maxuser);
	}

}