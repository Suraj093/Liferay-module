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

package com.max.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import com.max.model.Maxuser;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Maxuser in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class MaxuserCacheModel implements CacheModel<Maxuser>, Externalizable {

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof MaxuserCacheModel)) {
			return false;
		}

		MaxuserCacheModel maxuserCacheModel = (MaxuserCacheModel)object;

		if (maxUserId == maxuserCacheModel.maxUserId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, maxUserId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", maxUserId=");
		sb.append(maxUserId);
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
		sb.append(", maxUserFirstName=");
		sb.append(maxUserFirstName);
		sb.append(", maxUserLastName=");
		sb.append(maxUserLastName);
		sb.append(", maxUserContactNumber=");
		sb.append(maxUserContactNumber);
		sb.append(", maxUserEmailId=");
		sb.append(maxUserEmailId);
		sb.append(", maxUserDateOfBirth=");
		sb.append(maxUserDateOfBirth);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Maxuser toEntityModel() {
		MaxuserImpl maxuserImpl = new MaxuserImpl();

		if (uuid == null) {
			maxuserImpl.setUuid("");
		}
		else {
			maxuserImpl.setUuid(uuid);
		}

		maxuserImpl.setMaxUserId(maxUserId);
		maxuserImpl.setGroupId(groupId);
		maxuserImpl.setCompanyId(companyId);
		maxuserImpl.setUserId(userId);

		if (userName == null) {
			maxuserImpl.setUserName("");
		}
		else {
			maxuserImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			maxuserImpl.setCreateDate(null);
		}
		else {
			maxuserImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			maxuserImpl.setModifiedDate(null);
		}
		else {
			maxuserImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (maxUserFirstName == null) {
			maxuserImpl.setMaxUserFirstName("");
		}
		else {
			maxuserImpl.setMaxUserFirstName(maxUserFirstName);
		}

		if (maxUserLastName == null) {
			maxuserImpl.setMaxUserLastName("");
		}
		else {
			maxuserImpl.setMaxUserLastName(maxUserLastName);
		}

		if (maxUserContactNumber == null) {
			maxuserImpl.setMaxUserContactNumber("");
		}
		else {
			maxuserImpl.setMaxUserContactNumber(maxUserContactNumber);
		}

		if (maxUserEmailId == null) {
			maxuserImpl.setMaxUserEmailId("");
		}
		else {
			maxuserImpl.setMaxUserEmailId(maxUserEmailId);
		}

		if (maxUserDateOfBirth == null) {
			maxuserImpl.setMaxUserDateOfBirth("");
		}
		else {
			maxuserImpl.setMaxUserDateOfBirth(maxUserDateOfBirth);
		}

		maxuserImpl.resetOriginalValues();

		return maxuserImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		maxUserId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		maxUserFirstName = objectInput.readUTF();
		maxUserLastName = objectInput.readUTF();
		maxUserContactNumber = objectInput.readUTF();
		maxUserEmailId = objectInput.readUTF();
		maxUserDateOfBirth = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(maxUserId);

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

		if (maxUserFirstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxUserFirstName);
		}

		if (maxUserLastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxUserLastName);
		}

		if (maxUserContactNumber == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxUserContactNumber);
		}

		if (maxUserEmailId == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxUserEmailId);
		}

		if (maxUserDateOfBirth == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(maxUserDateOfBirth);
		}
	}

	public String uuid;
	public long maxUserId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String maxUserFirstName;
	public String maxUserLastName;
	public String maxUserContactNumber;
	public String maxUserEmailId;
	public String maxUserDateOfBirth;

}