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

package com.jio.service.persistence;

import com.jio.exception.NoSuchPlanException;
import com.jio.model.Plan;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the plan service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PlanUtil
 * @generated
 */
@ProviderType
public interface PlanPersistence extends BasePersistence<Plan> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link PlanUtil} to access the plan persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching plans
	 */
	public java.util.List<Plan> findByUuid(String uuid);

	/**
	 * Returns a range of all the plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @return the range of matching plans
	 */
	public java.util.List<Plan> findByUuid(String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plans
	 */
	public java.util.List<Plan> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plans where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plans
	 */
	public java.util.List<Plan> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan
	 * @throws NoSuchPlanException if a matching plan could not be found
	 */
	public Plan findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Returns the first plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns the last plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan
	 * @throws NoSuchPlanException if a matching plan could not be found
	 */
	public Plan findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Returns the last plan in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns the plans before and after the current plan in the ordered set where uuid = &#63;.
	 *
	 * @param planId the primary key of the current plan
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan
	 * @throws NoSuchPlanException if a plan with the primary key could not be found
	 */
	public Plan[] findByUuid_PrevAndNext(
			long planId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Removes all the plans where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of plans where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching plans
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the plan where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchPlanException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan
	 * @throws NoSuchPlanException if a matching plan could not be found
	 */
	public Plan findByUUID_G(String uuid, long groupId)
		throws NoSuchPlanException;

	/**
	 * Returns the plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the plan where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the plan where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the plan that was removed
	 */
	public Plan removeByUUID_G(String uuid, long groupId)
		throws NoSuchPlanException;

	/**
	 * Returns the number of plans where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching plans
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching plans
	 */
	public java.util.List<Plan> findByUuid_C(String uuid, long companyId);

	/**
	 * Returns a range of all the plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @return the range of matching plans
	 */
	public java.util.List<Plan> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching plans
	 */
	public java.util.List<Plan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plans where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching plans
	 */
	public java.util.List<Plan> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan
	 * @throws NoSuchPlanException if a matching plan could not be found
	 */
	public Plan findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Returns the first plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns the last plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan
	 * @throws NoSuchPlanException if a matching plan could not be found
	 */
	public Plan findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Returns the last plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching plan, or <code>null</code> if a matching plan could not be found
	 */
	public Plan fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns the plans before and after the current plan in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param planId the primary key of the current plan
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next plan
	 * @throws NoSuchPlanException if a plan with the primary key could not be found
	 */
	public Plan[] findByUuid_C_PrevAndNext(
			long planId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Plan>
				orderByComparator)
		throws NoSuchPlanException;

	/**
	 * Removes all the plans where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of plans where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching plans
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the plan in the entity cache if it is enabled.
	 *
	 * @param plan the plan
	 */
	public void cacheResult(Plan plan);

	/**
	 * Caches the plans in the entity cache if it is enabled.
	 *
	 * @param plans the plans
	 */
	public void cacheResult(java.util.List<Plan> plans);

	/**
	 * Creates a new plan with the primary key. Does not add the plan to the database.
	 *
	 * @param planId the primary key for the new plan
	 * @return the new plan
	 */
	public Plan create(long planId);

	/**
	 * Removes the plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param planId the primary key of the plan
	 * @return the plan that was removed
	 * @throws NoSuchPlanException if a plan with the primary key could not be found
	 */
	public Plan remove(long planId) throws NoSuchPlanException;

	public Plan updateImpl(Plan plan);

	/**
	 * Returns the plan with the primary key or throws a <code>NoSuchPlanException</code> if it could not be found.
	 *
	 * @param planId the primary key of the plan
	 * @return the plan
	 * @throws NoSuchPlanException if a plan with the primary key could not be found
	 */
	public Plan findByPrimaryKey(long planId) throws NoSuchPlanException;

	/**
	 * Returns the plan with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param planId the primary key of the plan
	 * @return the plan, or <code>null</code> if a plan with the primary key could not be found
	 */
	public Plan fetchByPrimaryKey(long planId);

	/**
	 * Returns all the plans.
	 *
	 * @return the plans
	 */
	public java.util.List<Plan> findAll();

	/**
	 * Returns a range of all the plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @return the range of plans
	 */
	public java.util.List<Plan> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of plans
	 */
	public java.util.List<Plan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator);

	/**
	 * Returns an ordered range of all the plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>PlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of plans
	 */
	public java.util.List<Plan> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Plan>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the plans from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of plans.
	 *
	 * @return the number of plans
	 */
	public int countAll();

}