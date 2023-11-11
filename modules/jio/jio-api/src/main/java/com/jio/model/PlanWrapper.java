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

package com.jio.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Plan}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Plan
 * @generated
 */
public class PlanWrapper
	extends BaseModelWrapper<Plan> implements ModelWrapper<Plan>, Plan {

	public PlanWrapper(Plan plan) {
		super(plan);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("planId", getPlanId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("price", getPrice());
		attributes.put("validity", getValidity());
		attributes.put("InternetData", getInternetData());
		attributes.put("subscription", getSubscription());
		attributes.put("planName", getPlanName());
		attributes.put("voice", getVoice());
		attributes.put("sms", getSms());
		attributes.put("is5GEnable", getIs5GEnable());
		attributes.put("isPlanActive", getIsPlanActive());
		attributes.put("planEffectiveDate", getPlanEffectiveDate());
		attributes.put("planTermedDate", getPlanTermedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long planId = (Long)attributes.get("planId");

		if (planId != null) {
			setPlanId(planId);
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

		String price = (String)attributes.get("price");

		if (price != null) {
			setPrice(price);
		}

		String validity = (String)attributes.get("validity");

		if (validity != null) {
			setValidity(validity);
		}

		String InternetData = (String)attributes.get("InternetData");

		if (InternetData != null) {
			setInternetData(InternetData);
		}

		String subscription = (String)attributes.get("subscription");

		if (subscription != null) {
			setSubscription(subscription);
		}

		String planName = (String)attributes.get("planName");

		if (planName != null) {
			setPlanName(planName);
		}

		String voice = (String)attributes.get("voice");

		if (voice != null) {
			setVoice(voice);
		}

		String sms = (String)attributes.get("sms");

		if (sms != null) {
			setSms(sms);
		}

		Boolean is5GEnable = (Boolean)attributes.get("is5GEnable");

		if (is5GEnable != null) {
			setIs5GEnable(is5GEnable);
		}

		Boolean isPlanActive = (Boolean)attributes.get("isPlanActive");

		if (isPlanActive != null) {
			setIsPlanActive(isPlanActive);
		}

		String planEffectiveDate = (String)attributes.get("planEffectiveDate");

		if (planEffectiveDate != null) {
			setPlanEffectiveDate(planEffectiveDate);
		}

		String planTermedDate = (String)attributes.get("planTermedDate");

		if (planTermedDate != null) {
			setPlanTermedDate(planTermedDate);
		}
	}

	@Override
	public Plan cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this plan.
	 *
	 * @return the company ID of this plan
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this plan.
	 *
	 * @return the create date of this plan
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this plan.
	 *
	 * @return the group ID of this plan
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the internet data of this plan.
	 *
	 * @return the internet data of this plan
	 */
	@Override
	public String getInternetData() {
		return model.getInternetData();
	}

	/**
	 * Returns the is5g enable of this plan.
	 *
	 * @return the is5g enable of this plan
	 */
	@Override
	public Boolean getIs5GEnable() {
		return model.getIs5GEnable();
	}

	/**
	 * Returns the is plan active of this plan.
	 *
	 * @return the is plan active of this plan
	 */
	@Override
	public Boolean getIsPlanActive() {
		return model.getIsPlanActive();
	}

	/**
	 * Returns the modified date of this plan.
	 *
	 * @return the modified date of this plan
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the plan effective date of this plan.
	 *
	 * @return the plan effective date of this plan
	 */
	@Override
	public String getPlanEffectiveDate() {
		return model.getPlanEffectiveDate();
	}

	/**
	 * Returns the plan ID of this plan.
	 *
	 * @return the plan ID of this plan
	 */
	@Override
	public long getPlanId() {
		return model.getPlanId();
	}

	/**
	 * Returns the plan name of this plan.
	 *
	 * @return the plan name of this plan
	 */
	@Override
	public String getPlanName() {
		return model.getPlanName();
	}

	/**
	 * Returns the plan termed date of this plan.
	 *
	 * @return the plan termed date of this plan
	 */
	@Override
	public String getPlanTermedDate() {
		return model.getPlanTermedDate();
	}

	/**
	 * Returns the price of this plan.
	 *
	 * @return the price of this plan
	 */
	@Override
	public String getPrice() {
		return model.getPrice();
	}

	/**
	 * Returns the primary key of this plan.
	 *
	 * @return the primary key of this plan
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sms of this plan.
	 *
	 * @return the sms of this plan
	 */
	@Override
	public String getSms() {
		return model.getSms();
	}

	/**
	 * Returns the subscription of this plan.
	 *
	 * @return the subscription of this plan
	 */
	@Override
	public String getSubscription() {
		return model.getSubscription();
	}

	/**
	 * Returns the user ID of this plan.
	 *
	 * @return the user ID of this plan
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this plan.
	 *
	 * @return the user name of this plan
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this plan.
	 *
	 * @return the user uuid of this plan
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this plan.
	 *
	 * @return the uuid of this plan
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the validity of this plan.
	 *
	 * @return the validity of this plan
	 */
	@Override
	public String getValidity() {
		return model.getValidity();
	}

	/**
	 * Returns the voice of this plan.
	 *
	 * @return the voice of this plan
	 */
	@Override
	public String getVoice() {
		return model.getVoice();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this plan.
	 *
	 * @param companyId the company ID of this plan
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this plan.
	 *
	 * @param createDate the create date of this plan
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this plan.
	 *
	 * @param groupId the group ID of this plan
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the internet data of this plan.
	 *
	 * @param InternetData the internet data of this plan
	 */
	@Override
	public void setInternetData(String InternetData) {
		model.setInternetData(InternetData);
	}

	/**
	 * Sets the is5g enable of this plan.
	 *
	 * @param is5GEnable the is5g enable of this plan
	 */
	@Override
	public void setIs5GEnable(Boolean is5GEnable) {
		model.setIs5GEnable(is5GEnable);
	}

	/**
	 * Sets the is plan active of this plan.
	 *
	 * @param isPlanActive the is plan active of this plan
	 */
	@Override
	public void setIsPlanActive(Boolean isPlanActive) {
		model.setIsPlanActive(isPlanActive);
	}

	/**
	 * Sets the modified date of this plan.
	 *
	 * @param modifiedDate the modified date of this plan
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the plan effective date of this plan.
	 *
	 * @param planEffectiveDate the plan effective date of this plan
	 */
	@Override
	public void setPlanEffectiveDate(String planEffectiveDate) {
		model.setPlanEffectiveDate(planEffectiveDate);
	}

	/**
	 * Sets the plan ID of this plan.
	 *
	 * @param planId the plan ID of this plan
	 */
	@Override
	public void setPlanId(long planId) {
		model.setPlanId(planId);
	}

	/**
	 * Sets the plan name of this plan.
	 *
	 * @param planName the plan name of this plan
	 */
	@Override
	public void setPlanName(String planName) {
		model.setPlanName(planName);
	}

	/**
	 * Sets the plan termed date of this plan.
	 *
	 * @param planTermedDate the plan termed date of this plan
	 */
	@Override
	public void setPlanTermedDate(String planTermedDate) {
		model.setPlanTermedDate(planTermedDate);
	}

	/**
	 * Sets the price of this plan.
	 *
	 * @param price the price of this plan
	 */
	@Override
	public void setPrice(String price) {
		model.setPrice(price);
	}

	/**
	 * Sets the primary key of this plan.
	 *
	 * @param primaryKey the primary key of this plan
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sms of this plan.
	 *
	 * @param sms the sms of this plan
	 */
	@Override
	public void setSms(String sms) {
		model.setSms(sms);
	}

	/**
	 * Sets the subscription of this plan.
	 *
	 * @param subscription the subscription of this plan
	 */
	@Override
	public void setSubscription(String subscription) {
		model.setSubscription(subscription);
	}

	/**
	 * Sets the user ID of this plan.
	 *
	 * @param userId the user ID of this plan
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this plan.
	 *
	 * @param userName the user name of this plan
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this plan.
	 *
	 * @param userUuid the user uuid of this plan
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this plan.
	 *
	 * @param uuid the uuid of this plan
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the validity of this plan.
	 *
	 * @param validity the validity of this plan
	 */
	@Override
	public void setValidity(String validity) {
		model.setValidity(validity);
	}

	/**
	 * Sets the voice of this plan.
	 *
	 * @param voice the voice of this plan
	 */
	@Override
	public void setVoice(String voice) {
		model.setVoice(voice);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected PlanWrapper wrap(Plan plan) {
		return new PlanWrapper(plan);
	}

}