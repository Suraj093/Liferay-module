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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import com.max.exception.NoSuchMaxuserException;
import com.max.model.Maxuser;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the maxuser service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MaxuserUtil
 * @generated
 */
@ProviderType
public interface MaxuserPersistence extends BasePersistence<Maxuser> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link MaxuserUtil} to access the maxuser persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the maxusers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching maxusers
	 */
	public java.util.List<Maxuser> findByUuid(String uuid);

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
	public java.util.List<Maxuser> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Maxuser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where uuid = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public Maxuser[] findByUuid_PrevAndNext(
			long maxUserId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Removes all the maxusers where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of maxusers where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching maxusers
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMaxuserException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByUUID_G(String uuid, long groupId)
		throws NoSuchMaxuserException;

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the maxuser where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the maxuser where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the maxuser that was removed
	 */
	public Maxuser removeByUUID_G(String uuid, long groupId)
		throws NoSuchMaxuserException;

	/**
	 * Returns the number of maxusers where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching maxusers
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching maxusers
	 */
	public java.util.List<Maxuser> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the first maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the last maxuser in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public Maxuser[] findByUuid_C_PrevAndNext(
			long maxUserId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Removes all the maxusers where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of maxusers where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching maxusers
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the maxusers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the matching maxusers
	 */
	public java.util.List<Maxuser> findByCompanyId(long companyId);

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
	public java.util.List<Maxuser> findByCompanyId(
		long companyId, int start, int end);

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
	public java.util.List<Maxuser> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByCompanyId_First(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the first maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the last maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByCompanyId_Last(
			long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the last maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where companyId = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public Maxuser[] findByCompanyId_PrevAndNext(
			long maxUserId, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Removes all the maxusers where companyId = &#63; from the database.
	 *
	 * @param companyId the company ID
	 */
	public void removeByCompanyId(long companyId);

	/**
	 * Returns the number of maxusers where companyId = &#63;.
	 *
	 * @param companyId the company ID
	 * @return the number of matching maxusers
	 */
	public int countByCompanyId(long companyId);

	/**
	 * Returns all the maxusers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching maxusers
	 */
	public java.util.List<Maxuser> findByGroupId(long groupId);

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
	public java.util.List<Maxuser> findByGroupId(
		long groupId, int start, int end);

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
	public java.util.List<Maxuser> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findByGroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByGroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByGroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByGroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByGroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the maxusers before and after the current maxuser in the ordered set where groupId = &#63;.
	 *
	 * @param maxUserId the primary key of the current maxuser
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public Maxuser[] findByGroupId_PrevAndNext(
			long maxUserId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Removes all the maxusers where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeByGroupId(long groupId);

	/**
	 * Returns the number of maxusers where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching maxusers
	 */
	public int countByGroupId(long groupId);

	/**
	 * Returns all the maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @return the matching maxusers
	 */
	public java.util.List<Maxuser> findByG_M(long groupId, long maxUserId);

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
	public java.util.List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end);

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
	public java.util.List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findByG_M(
		long groupId, long maxUserId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByG_M_First(
			long groupId, long maxUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the first maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByG_M_First(
		long groupId, long maxUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser
	 * @throws NoSuchMaxuserException if a matching maxuser could not be found
	 */
	public Maxuser findByG_M_Last(
			long groupId, long maxUserId,
			com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
				orderByComparator)
		throws NoSuchMaxuserException;

	/**
	 * Returns the last maxuser in the ordered set where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public Maxuser fetchByG_M_Last(
		long groupId, long maxUserId,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

	/**
	 * Removes all the maxusers where groupId = &#63; and maxUserId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 */
	public void removeByG_M(long groupId, long maxUserId);

	/**
	 * Returns the number of maxusers where groupId = &#63; and maxUserId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param maxUserId the max user ID
	 * @return the number of matching maxusers
	 */
	public int countByG_M(long groupId, long maxUserId);

	/**
	 * Caches the maxuser in the entity cache if it is enabled.
	 *
	 * @param maxuser the maxuser
	 */
	public void cacheResult(Maxuser maxuser);

	/**
	 * Caches the maxusers in the entity cache if it is enabled.
	 *
	 * @param maxusers the maxusers
	 */
	public void cacheResult(java.util.List<Maxuser> maxusers);

	/**
	 * Creates a new maxuser with the primary key. Does not add the maxuser to the database.
	 *
	 * @param maxUserId the primary key for the new maxuser
	 * @return the new maxuser
	 */
	public Maxuser create(long maxUserId);

	/**
	 * Removes the maxuser with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser that was removed
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public Maxuser remove(long maxUserId) throws NoSuchMaxuserException;

	public Maxuser updateImpl(Maxuser maxuser);

	/**
	 * Returns the maxuser with the primary key or throws a <code>NoSuchMaxuserException</code> if it could not be found.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser
	 * @throws NoSuchMaxuserException if a maxuser with the primary key could not be found
	 */
	public Maxuser findByPrimaryKey(long maxUserId)
		throws NoSuchMaxuserException;

	/**
	 * Returns the maxuser with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser, or <code>null</code> if a maxuser with the primary key could not be found
	 */
	public Maxuser fetchByPrimaryKey(long maxUserId);

	/**
	 * Returns all the maxusers.
	 *
	 * @return the maxusers
	 */
	public java.util.List<Maxuser> findAll();

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
	public java.util.List<Maxuser> findAll(int start, int end);

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
	public java.util.List<Maxuser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator);

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
	public java.util.List<Maxuser> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Maxuser>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the maxusers from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of maxusers.
	 *
	 * @return the number of maxusers
	 */
	public int countAll();

}