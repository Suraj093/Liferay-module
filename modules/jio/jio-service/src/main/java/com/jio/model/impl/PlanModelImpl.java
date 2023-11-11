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
import com.jio.model.PlanModel;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Plan service. Represents a row in the &quot;JIO_Plan&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>PlanModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PlanImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanImpl
 * @generated
 */
@JSON(strict = true)
public class PlanModelImpl extends BaseModelImpl<Plan> implements PlanModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a plan model instance should use the <code>Plan</code> interface instead.
	 */
	public static final String TABLE_NAME = "JIO_Plan";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"planId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"price", Types.VARCHAR}, {"validity", Types.VARCHAR},
		{"InternetData", Types.VARCHAR}, {"subscription", Types.VARCHAR},
		{"planName", Types.VARCHAR}, {"voice", Types.VARCHAR},
		{"sms", Types.VARCHAR}, {"is5GEnable", Types.BOOLEAN},
		{"isPlanActive", Types.BOOLEAN}, {"planEffectiveDate", Types.VARCHAR},
		{"planTermedDate", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("planId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("price", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("validity", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("InternetData", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subscription", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("planName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("voice", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("sms", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("is5GEnable", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("isPlanActive", Types.BOOLEAN);
		TABLE_COLUMNS_MAP.put("planEffectiveDate", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("planTermedDate", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table JIO_Plan (uuid_ VARCHAR(75) null,planId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,price VARCHAR(75) null,validity VARCHAR(75) null,InternetData VARCHAR(75) null,subscription VARCHAR(75) null,planName VARCHAR(75) null,voice VARCHAR(75) null,sms VARCHAR(75) null,is5GEnable BOOLEAN,isPlanActive BOOLEAN,planEffectiveDate VARCHAR(75) null,planTermedDate VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP = "drop table JIO_Plan";

	public static final String ORDER_BY_JPQL = " ORDER BY plan.planId ASC";

	public static final String ORDER_BY_SQL = " ORDER BY JIO_Plan.planId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GROUPID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long UUID_COLUMN_BITMASK = 4L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long PLANID_COLUMN_BITMASK = 8L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public PlanModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _planId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setPlanId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _planId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Plan.class;
	}

	@Override
	public String getModelClassName() {
		return Plan.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Plan, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Plan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Plan, Object> attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Plan)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Plan, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Plan, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept((Plan)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Plan, Object>> getAttributeGetterFunctions() {
		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Plan, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static final Map<String, Function<Plan, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Plan, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Plan, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Plan, Object>>();
		Map<String, BiConsumer<Plan, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Plan, ?>>();

		attributeGetterFunctions.put("uuid", Plan::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Plan, String>)Plan::setUuid);
		attributeGetterFunctions.put("planId", Plan::getPlanId);
		attributeSetterBiConsumers.put(
			"planId", (BiConsumer<Plan, Long>)Plan::setPlanId);
		attributeGetterFunctions.put("groupId", Plan::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Plan, Long>)Plan::setGroupId);
		attributeGetterFunctions.put("companyId", Plan::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId", (BiConsumer<Plan, Long>)Plan::setCompanyId);
		attributeGetterFunctions.put("userId", Plan::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Plan, Long>)Plan::setUserId);
		attributeGetterFunctions.put("userName", Plan::getUserName);
		attributeSetterBiConsumers.put(
			"userName", (BiConsumer<Plan, String>)Plan::setUserName);
		attributeGetterFunctions.put("createDate", Plan::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate", (BiConsumer<Plan, Date>)Plan::setCreateDate);
		attributeGetterFunctions.put("modifiedDate", Plan::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate", (BiConsumer<Plan, Date>)Plan::setModifiedDate);
		attributeGetterFunctions.put("price", Plan::getPrice);
		attributeSetterBiConsumers.put(
			"price", (BiConsumer<Plan, String>)Plan::setPrice);
		attributeGetterFunctions.put("validity", Plan::getValidity);
		attributeSetterBiConsumers.put(
			"validity", (BiConsumer<Plan, String>)Plan::setValidity);
		attributeGetterFunctions.put("InternetData", Plan::getInternetData);
		attributeSetterBiConsumers.put(
			"InternetData", (BiConsumer<Plan, String>)Plan::setInternetData);
		attributeGetterFunctions.put("subscription", Plan::getSubscription);
		attributeSetterBiConsumers.put(
			"subscription", (BiConsumer<Plan, String>)Plan::setSubscription);
		attributeGetterFunctions.put("planName", Plan::getPlanName);
		attributeSetterBiConsumers.put(
			"planName", (BiConsumer<Plan, String>)Plan::setPlanName);
		attributeGetterFunctions.put("voice", Plan::getVoice);
		attributeSetterBiConsumers.put(
			"voice", (BiConsumer<Plan, String>)Plan::setVoice);
		attributeGetterFunctions.put("sms", Plan::getSms);
		attributeSetterBiConsumers.put(
			"sms", (BiConsumer<Plan, String>)Plan::setSms);
		attributeGetterFunctions.put("is5GEnable", Plan::getIs5GEnable);
		attributeSetterBiConsumers.put(
			"is5GEnable", (BiConsumer<Plan, Boolean>)Plan::setIs5GEnable);
		attributeGetterFunctions.put("isPlanActive", Plan::getIsPlanActive);
		attributeSetterBiConsumers.put(
			"isPlanActive", (BiConsumer<Plan, Boolean>)Plan::setIsPlanActive);
		attributeGetterFunctions.put(
			"planEffectiveDate", Plan::getPlanEffectiveDate);
		attributeSetterBiConsumers.put(
			"planEffectiveDate",
			(BiConsumer<Plan, String>)Plan::setPlanEffectiveDate);
		attributeGetterFunctions.put("planTermedDate", Plan::getPlanTermedDate);
		attributeSetterBiConsumers.put(
			"planTermedDate",
			(BiConsumer<Plan, String>)Plan::setPlanTermedDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_uuid = uuid;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public String getOriginalUuid() {
		return getColumnOriginalValue("uuid_");
	}

	@JSON
	@Override
	public long getPlanId() {
		return _planId;
	}

	@Override
	public void setPlanId(long planId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_planId = planId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalGroupId() {
		return GetterUtil.getLong(this.<Long>getColumnOriginalValue("groupId"));
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalCompanyId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("companyId"));
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getPrice() {
		if (_price == null) {
			return "";
		}
		else {
			return _price;
		}
	}

	@Override
	public void setPrice(String price) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_price = price;
	}

	@JSON
	@Override
	public String getValidity() {
		if (_validity == null) {
			return "";
		}
		else {
			return _validity;
		}
	}

	@Override
	public void setValidity(String validity) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_validity = validity;
	}

	@JSON
	@Override
	public String getInternetData() {
		if (_InternetData == null) {
			return "";
		}
		else {
			return _InternetData;
		}
	}

	@Override
	public void setInternetData(String InternetData) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_InternetData = InternetData;
	}

	@JSON
	@Override
	public String getSubscription() {
		if (_subscription == null) {
			return "";
		}
		else {
			return _subscription;
		}
	}

	@Override
	public void setSubscription(String subscription) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_subscription = subscription;
	}

	@JSON
	@Override
	public String getPlanName() {
		if (_planName == null) {
			return "";
		}
		else {
			return _planName;
		}
	}

	@Override
	public void setPlanName(String planName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_planName = planName;
	}

	@JSON
	@Override
	public String getVoice() {
		if (_voice == null) {
			return "";
		}
		else {
			return _voice;
		}
	}

	@Override
	public void setVoice(String voice) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_voice = voice;
	}

	@JSON
	@Override
	public String getSms() {
		if (_sms == null) {
			return "";
		}
		else {
			return _sms;
		}
	}

	@Override
	public void setSms(String sms) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sms = sms;
	}

	@JSON
	@Override
	public Boolean getIs5GEnable() {
		return _is5GEnable;
	}

	@Override
	public void setIs5GEnable(Boolean is5GEnable) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_is5GEnable = is5GEnable;
	}

	@JSON
	@Override
	public Boolean getIsPlanActive() {
		return _isPlanActive;
	}

	@Override
	public void setIsPlanActive(Boolean isPlanActive) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_isPlanActive = isPlanActive;
	}

	@JSON
	@Override
	public String getPlanEffectiveDate() {
		if (_planEffectiveDate == null) {
			return "";
		}
		else {
			return _planEffectiveDate;
		}
	}

	@Override
	public void setPlanEffectiveDate(String planEffectiveDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_planEffectiveDate = planEffectiveDate;
	}

	@JSON
	@Override
	public String getPlanTermedDate() {
		if (_planTermedDate == null) {
			return "";
		}
		else {
			return _planTermedDate;
		}
	}

	@Override
	public void setPlanTermedDate(String planTermedDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_planTermedDate = planTermedDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Plan.class.getName()));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Plan.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Plan toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Plan>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		PlanImpl planImpl = new PlanImpl();

		planImpl.setUuid(getUuid());
		planImpl.setPlanId(getPlanId());
		planImpl.setGroupId(getGroupId());
		planImpl.setCompanyId(getCompanyId());
		planImpl.setUserId(getUserId());
		planImpl.setUserName(getUserName());
		planImpl.setCreateDate(getCreateDate());
		planImpl.setModifiedDate(getModifiedDate());
		planImpl.setPrice(getPrice());
		planImpl.setValidity(getValidity());
		planImpl.setInternetData(getInternetData());
		planImpl.setSubscription(getSubscription());
		planImpl.setPlanName(getPlanName());
		planImpl.setVoice(getVoice());
		planImpl.setSms(getSms());
		planImpl.setIs5GEnable(getIs5GEnable());
		planImpl.setIsPlanActive(getIsPlanActive());
		planImpl.setPlanEffectiveDate(getPlanEffectiveDate());
		planImpl.setPlanTermedDate(getPlanTermedDate());

		planImpl.resetOriginalValues();

		return planImpl;
	}

	@Override
	public Plan cloneWithOriginalValues() {
		PlanImpl planImpl = new PlanImpl();

		planImpl.setUuid(this.<String>getColumnOriginalValue("uuid_"));
		planImpl.setPlanId(this.<Long>getColumnOriginalValue("planId"));
		planImpl.setGroupId(this.<Long>getColumnOriginalValue("groupId"));
		planImpl.setCompanyId(this.<Long>getColumnOriginalValue("companyId"));
		planImpl.setUserId(this.<Long>getColumnOriginalValue("userId"));
		planImpl.setUserName(this.<String>getColumnOriginalValue("userName"));
		planImpl.setCreateDate(this.<Date>getColumnOriginalValue("createDate"));
		planImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		planImpl.setPrice(this.<String>getColumnOriginalValue("price"));
		planImpl.setValidity(this.<String>getColumnOriginalValue("validity"));
		planImpl.setInternetData(
			this.<String>getColumnOriginalValue("InternetData"));
		planImpl.setSubscription(
			this.<String>getColumnOriginalValue("subscription"));
		planImpl.setPlanName(this.<String>getColumnOriginalValue("planName"));
		planImpl.setVoice(this.<String>getColumnOriginalValue("voice"));
		planImpl.setSms(this.<String>getColumnOriginalValue("sms"));
		planImpl.setIs5GEnable(
			this.<Boolean>getColumnOriginalValue("is5GEnable"));
		planImpl.setIsPlanActive(
			this.<Boolean>getColumnOriginalValue("isPlanActive"));
		planImpl.setPlanEffectiveDate(
			this.<String>getColumnOriginalValue("planEffectiveDate"));
		planImpl.setPlanTermedDate(
			this.<String>getColumnOriginalValue("planTermedDate"));

		return planImpl;
	}

	@Override
	public int compareTo(Plan plan) {
		long primaryKey = plan.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof Plan)) {
			return false;
		}

		Plan plan = (Plan)object;

		long primaryKey = plan.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<Plan> toCacheModel() {
		PlanCacheModel planCacheModel = new PlanCacheModel();

		planCacheModel.uuid = getUuid();

		String uuid = planCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			planCacheModel.uuid = null;
		}

		planCacheModel.planId = getPlanId();

		planCacheModel.groupId = getGroupId();

		planCacheModel.companyId = getCompanyId();

		planCacheModel.userId = getUserId();

		planCacheModel.userName = getUserName();

		String userName = planCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			planCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			planCacheModel.createDate = createDate.getTime();
		}
		else {
			planCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			planCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			planCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		planCacheModel.price = getPrice();

		String price = planCacheModel.price;

		if ((price != null) && (price.length() == 0)) {
			planCacheModel.price = null;
		}

		planCacheModel.validity = getValidity();

		String validity = planCacheModel.validity;

		if ((validity != null) && (validity.length() == 0)) {
			planCacheModel.validity = null;
		}

		planCacheModel.InternetData = getInternetData();

		String InternetData = planCacheModel.InternetData;

		if ((InternetData != null) && (InternetData.length() == 0)) {
			planCacheModel.InternetData = null;
		}

		planCacheModel.subscription = getSubscription();

		String subscription = planCacheModel.subscription;

		if ((subscription != null) && (subscription.length() == 0)) {
			planCacheModel.subscription = null;
		}

		planCacheModel.planName = getPlanName();

		String planName = planCacheModel.planName;

		if ((planName != null) && (planName.length() == 0)) {
			planCacheModel.planName = null;
		}

		planCacheModel.voice = getVoice();

		String voice = planCacheModel.voice;

		if ((voice != null) && (voice.length() == 0)) {
			planCacheModel.voice = null;
		}

		planCacheModel.sms = getSms();

		String sms = planCacheModel.sms;

		if ((sms != null) && (sms.length() == 0)) {
			planCacheModel.sms = null;
		}

		Boolean is5GEnable = getIs5GEnable();

		if (is5GEnable != null) {
			planCacheModel.is5GEnable = is5GEnable;
		}

		Boolean isPlanActive = getIsPlanActive();

		if (isPlanActive != null) {
			planCacheModel.isPlanActive = isPlanActive;
		}

		planCacheModel.planEffectiveDate = getPlanEffectiveDate();

		String planEffectiveDate = planCacheModel.planEffectiveDate;

		if ((planEffectiveDate != null) && (planEffectiveDate.length() == 0)) {
			planCacheModel.planEffectiveDate = null;
		}

		planCacheModel.planTermedDate = getPlanTermedDate();

		String planTermedDate = planCacheModel.planTermedDate;

		if ((planTermedDate != null) && (planTermedDate.length() == 0)) {
			planCacheModel.planTermedDate = null;
		}

		return planCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Plan, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Plan, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Plan, Object> attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply((Plan)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Plan>
			_escapedModelProxyProviderFunction =
				ProxyUtil.getProxyProviderFunction(
					Plan.class, ModelWrapper.class);

	}

	private String _uuid;
	private long _planId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _price;
	private String _validity;
	private String _InternetData;
	private String _subscription;
	private String _planName;
	private String _voice;
	private String _sms;
	private Boolean _is5GEnable;
	private Boolean _isPlanActive;
	private String _planEffectiveDate;
	private String _planTermedDate;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<Plan, Object> function = _attributeGetterFunctions.get(
			columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((Plan)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("uuid_", _uuid);
		_columnOriginalValues.put("planId", _planId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("price", _price);
		_columnOriginalValues.put("validity", _validity);
		_columnOriginalValues.put("InternetData", _InternetData);
		_columnOriginalValues.put("subscription", _subscription);
		_columnOriginalValues.put("planName", _planName);
		_columnOriginalValues.put("voice", _voice);
		_columnOriginalValues.put("sms", _sms);
		_columnOriginalValues.put("is5GEnable", _is5GEnable);
		_columnOriginalValues.put("isPlanActive", _isPlanActive);
		_columnOriginalValues.put("planEffectiveDate", _planEffectiveDate);
		_columnOriginalValues.put("planTermedDate", _planTermedDate);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("uuid_", "uuid");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("uuid_", 1L);

		columnBitmasks.put("planId", 2L);

		columnBitmasks.put("groupId", 4L);

		columnBitmasks.put("companyId", 8L);

		columnBitmasks.put("userId", 16L);

		columnBitmasks.put("userName", 32L);

		columnBitmasks.put("createDate", 64L);

		columnBitmasks.put("modifiedDate", 128L);

		columnBitmasks.put("price", 256L);

		columnBitmasks.put("validity", 512L);

		columnBitmasks.put("InternetData", 1024L);

		columnBitmasks.put("subscription", 2048L);

		columnBitmasks.put("planName", 4096L);

		columnBitmasks.put("voice", 8192L);

		columnBitmasks.put("sms", 16384L);

		columnBitmasks.put("is5GEnable", 32768L);

		columnBitmasks.put("isPlanActive", 65536L);

		columnBitmasks.put("planEffectiveDate", 131072L);

		columnBitmasks.put("planTermedDate", 262144L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private Plan _escapedModel;

}