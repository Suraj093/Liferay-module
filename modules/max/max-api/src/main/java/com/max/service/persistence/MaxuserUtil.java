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

package com.max.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.max.model.Maxuser;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the maxuser service. This utility wraps <code>com.max.service.persistence.impl.MaxuserPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaxuserPersistence
 * @generated
 */
public class MaxuserUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Maxuser maxuser) {
		getPersistence().clearCache(maxuser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Maxuser> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Maxuser> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Maxuser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Maxuser> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Maxuser update(Maxuser maxuser) {
		return getPersistence().update(maxuser);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Maxuser update(
		Maxuser maxuser, ServiceContext serviceContext) {

		return getPersistence().update(maxuser, serviceContext);
	}

	/**
	 * Returns all the maxusers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching maxusers
	 */
	public static List<Maxuser> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the maxusers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of matching maxusers
	 */
	public static List<Maxuser> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Maxuser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByUuid_First(
			String uuid, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUuid_First(
		String uuid, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByUuid_Last(
			String uuid, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUuid_Last(
		String uuid, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser[] findByUuid_PrevAndNext(
			long maxUserId, String uuid,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_PrevAndNext(
			maxUserId, uuid, orderByComparator);
	}

	/**
	 * Removes all the maxusers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of maxusers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching maxusers
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMaxuserException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByUUID_G(String uuid, long groupId)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the maxuser where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the maxuser that was removed
	 */
	public static Maxuser removeByUUID_G(String uuid, long groupId)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of maxusers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching maxusers
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching maxusers
	 */
	public static List<Maxuser> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of matching maxusers
	 */
	public static List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser[] findByUuid_C_PrevAndNext(
			long maxUserId, String uuid, long companyId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByUuid_C_PrevAndNext(
			maxUserId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the maxusers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching maxusers
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the maxusers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching maxusers
	 */
	public static List<Maxuser> findByCompanyId(long companyId) {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	 * Returns a range of all the maxusers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of matching maxusers
	 */
	public static List<Maxuser> findByCompanyId(
		long companyId, int start, int end) {

		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers where companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param companyId the company ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByCompanyId(
		long companyId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCompanyId(
			companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByCompanyId_First(
			long companyId, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the first maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByCompanyId_First(
		long companyId, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByCompanyId_First(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByCompanyId_Last(
			long companyId, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByCompanyId_Last(
		long companyId, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByCompanyId_Last(
			companyId, orderByComparator);
	}

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser[] findByCompanyId_PrevAndNext(
			long maxUserId, long companyId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByCompanyId_PrevAndNext(
			maxUserId, companyId, orderByComparator);
	}

	/**
	 * Removes all the maxusers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public static void removeByCompanyId(long companyId) {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	 * Returns the number of maxusers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching maxusers
	 */
	public static int countByCompanyId(long companyId) {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	 * Returns all the maxusers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching maxusers
	 */
	public static List<Maxuser> findByGroupId(long groupId) {
		return getPersistence().findByGroupId(groupId);
	}

	/**
	 * Returns a range of all the maxusers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of matching maxusers
	 */
	public static List<Maxuser> findByGroupId(
		long groupId, int start, int end) {

		return getPersistence().findByGroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByGroupId(
		long groupId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByGroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByGroupId_First(
			long groupId, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByGroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByGroupId_First(
		long groupId, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByGroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByGroupId_Last(
			long groupId, OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByGroupId_Last(
		long groupId, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByGroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser[] findByGroupId_PrevAndNext(
			long maxUserId, long groupId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByGroupId_PrevAndNext(
			maxUserId, groupId, orderByComparator);
	}

	/**
	 * Removes all the maxusers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeByGroupId(long groupId) {
		getPersistence().removeByGroupId(groupId);
	}

	/**
	 * Returns the number of maxusers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching maxusers
	 */
	public static int countByGroupId(long groupId) {
		return getPersistence().countByGroupId(groupId);
	}

	/**
	 * Returns all the maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @return the matching maxusers
	 */
	public static List<Maxuser> findByG_M(long groupId, long maxUserId) {
		return getPersistence().findByG_M(groupId, maxUserId);
	}

	/**
	 * Returns a range of all the maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of matching maxusers
	 */
	public static List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end) {

		return getPersistence().findByG_M(groupId, maxUserId, start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findByG_M(
			groupId, maxUserId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching maxusers
	 */
	public static List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByG_M(
			groupId, maxUserId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByG_M_First(
			long groupId, long maxUserId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByG_M_First(
			groupId, maxUserId, orderByComparator);
	}

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByG_M_First(
		long groupId, long maxUserId,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByG_M_First(
			groupId, maxUserId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public static Maxuser findByG_M_Last(
			long groupId, long maxUserId,
			OrderByComparator<Maxuser> orderByComparator)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByG_M_Last(
			groupId, maxUserId, orderByComparator);
	}

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchByG_M_Last(
		long groupId, long maxUserId,
		OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().fetchByG_M_Last(
			groupId, maxUserId, orderByComparator);
	}

	/**
	 * Removes all the maxusers where groupId = &#63; and maxUserId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 */
	public static void removeByG_M(long groupId, long maxUserId) {
		getPersistence().removeByG_M(groupId, maxUserId);
	}

	/**
	 * Returns the number of maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @return the number of matching maxusers
	 */
	public static int countByG_M(long groupId, long maxUserId) {
		return getPersistence().countByG_M(groupId, maxUserId);
	}

	/**
	 * Caches the maxuser in the entity cache if it is enabled.
	 *
	 * @param maxuser the maxuser
	 */
	public static void cacheResult(Maxuser maxuser) {
		getPersistence().cacheResult(maxuser);
	}

	/**
	 * Caches the maxusers in the entity cache if it is enabled.
	 *
	 * @param maxusers the maxusers
	 */
	public static void cacheResult(List<Maxuser> maxusers) {
		getPersistence().cacheResult(maxusers);
	}

	/**
	 * Creates a new maxuser with the primary key. Does not add the maxuser to the database.
	 *
	 * @param maxUserId the primary key for the new maxuser
	 * @return the new maxuser
	 */
	public static Maxuser create(long maxUserId) {
		return getPersistence().create(maxUserId);
	}

	/**
	 * Removes the maxuser with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser that was removed
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser remove(long maxUserId)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().remove(maxUserId);
	}

	public static Maxuser updateImpl(Maxuser maxuser) {
		return getPersistence().updateImpl(maxuser);
	}

	/**
	 * Returns the maxuser with the primary key or throws a <code>NoSuchMaxuserException</code> if it could not be found.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public static Maxuser findByPrimaryKey(long maxUserId)
		throws com.max.exception.NoSuchMaxuserException {

		return getPersistence().findByPrimaryKey(maxUserId);
	}

	/**
	 * Returns the maxuser with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser, or <code>null</code> if a maxuser with the primary key could not be found
	 */
	public static Maxuser fetchByPrimaryKey(long maxUserId) {
		return getPersistence().fetchByPrimaryKey(maxUserId);
	}

	/**
	 * Returns all the maxusers.
	 *
	 * @return the maxusers
	 */
	public static List<Maxuser> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the maxusers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of maxusers
	 */
	public static List<Maxuser> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the maxusers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of maxusers
	 */
	public static List<Maxuser> findAll(
		int start, int end, OrderByComparator<Maxuser> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the maxusers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of maxusers
	 */
	public static List<Maxuser> findAll(
		int start, int end, OrderByComparator<Maxuser> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the maxusers from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of maxusers.
	 *
	 * @return the number of maxusers
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static MaxuserPersistence getPersistence() {
		return _persistence;
	}

	private static volatile MaxuserPersistence _persistence;

}