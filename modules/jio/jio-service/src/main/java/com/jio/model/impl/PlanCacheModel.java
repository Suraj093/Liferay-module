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

package com.jio.model.impl;

import com.jio.model.Plan;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Plan in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class PlanCacheModel implements CacheModel<Plan>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof PlanCacheModel)) {
			return false;
		}

		PlanCacheModel planCacheModel = (PlanCacheModel)object;

		if (planId == planCacheModel.planId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, planId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(39);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", planId=");
		sb.append(planId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", price=");
		sb.append(price);
		sb.append(", validity=");
		sb.append(validity);
		sb.append(", InternetData=");
		sb.append(InternetData);
		sb.append(", subscription=");
		sb.append(subscription);
		sb.append(", planName=");
		sb.append(planName);
		sb.append(", voice=");
		sb.append(voice);
		sb.append(", sms=");
		sb.append(sms);
		sb.append(", is5GEnable=");
		sb.append(is5GEnable);
		sb.append(", isPlanActive=");
		sb.append(isPlanActive);
		sb.append(", planEffectiveDate=");
		sb.append(planEffectiveDate);
		sb.append(", planTermedDate=");
		sb.append(planTermedDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Plan toEntityModel() {
		PlanImpl planImpl = new PlanImpl();

		if (uuid == null) {
			planImpl.setUuid("");
		}
		else {
			planImpl.setUuid(uuid);
		}

		planImpl.setPlanId(planId);
		planImpl.setGroupId(groupId);
		planImpl.setCompanyId(companyId);
		planImpl.setUserId(userId);

		if (userName == null) {
			planImpl.setUserName("");
		}
		else {
			planImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			planImpl.setCreateDate(null);
		}
		else {
			planImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			planImpl.setModifiedDate(null);
		}
		else {
			planImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (price == null) {
			planImpl.setPrice("");
		}
		else {
			planImpl.setPrice(price);
		}

		if (validity == null) {
			planImpl.setValidity("");
		}
		else {
			planImpl.setValidity(validity);
		}

		if (InternetData == null) {
			planImpl.setInternetData("");
		}
		else {
			planImpl.setInternetData(InternetData);
		}

		if (subscription == null) {
			planImpl.setSubscription("");
		}
		else {
			planImpl.setSubscription(subscription);
		}

		if (planName == null) {
			planImpl.setPlanName("");
		}
		else {
			planImpl.setPlanName(planName);
		}

		if (voice == null) {
			planImpl.setVoice("");
		}
		else {
			planImpl.setVoice(voice);
		}

		if (sms == null) {
			planImpl.setSms("");
		}
		else {
			planImpl.setSms(sms);
		}

		planImpl.setIs5GEnable(is5GEnable);
		planImpl.setIsPlanActive(isPlanActive);

		if (planEffectiveDate == null) {
			planImpl.setPlanEffectiveDate("");
		}
		else {
			planImpl.setPlanEffectiveDate(planEffectiveDate);
		}

		if (planTermedDate == null) {
			planImpl.setPlanTermedDate("");
		}
		else {
			planImpl.setPlanTermedDate(planTermedDate);
		}

		planImpl.resetOriginalValues();

		return planImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		planId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		price = objectInput.readUTF();
		validity = objectInput.readUTF();
		InternetData = objectInput.readUTF();
		subscription = objectInput.readUTF();
		planName = objectInput.readUTF();
		voice = objectInput.readUTF();
		sms = objectInput.readUTF();

		is5GEnable = objectInput.readBoolean();

		isPlanActive = objectInput.readBoolean();
		planEffectiveDate = objectInput.readUTF();
		planTermedDate = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(planId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (price == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(price);
		}

		if (validity == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(validity);
		}

		if (InternetData == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(InternetData);
		}

		if (subscription == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(subscription);
		}

		if (planName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(planName);
		}

		if (voice == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(voice);
		}

		if (sms == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(sms);
		}

		objectOutput.writeBoolean(is5GEnable);

		objectOutput.writeBoolean(isPlanActive);

		if (planEffectiveDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(planEffectiveDate);
		}

		if (planTermedDate == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(planTermedDate);
		}
	}

	public String uuid;
	public long planId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String price;
	public String validity;
	public String InternetData;
	public String subscription;
	public String planName;
	public String voice;
	public String sms;
	public boolean is5GEnable;
	public boolean isPlanActive;
	public String planEffectiveDate;
	public String planTermedDate;

}