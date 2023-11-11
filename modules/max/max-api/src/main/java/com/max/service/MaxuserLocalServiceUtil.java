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

import com.liferay.petra.sql.dsl.query.DSLQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.OrderByComparator;

import com.max.model.Maxuser;

import java.io.Serializable;

import java.util.List;

/**
 * Provides the local service utility for Maxuser. This utility wraps
 * <code>com.max.service.impl.MaxuserLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see MaxuserLocalService
 * @generated
 */
public class MaxuserLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>com.max.service.impl.MaxuserLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static Maxuser addMaxUser(
		long userId, String firstName, String lastName, String contactNumber,
		String email, String dateOfBirth,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return getService().addMaxUser(
			userId, firstName, lastName, contactNumber, email, dateOfBirth,
			serviceContext);
	}

	/**
	 * Adds the maxuser to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaxuserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param maxuser the maxuser
	 * @return the maxuser that was added
	 */
	public static Maxuser addMaxuser(Maxuser maxuser) {
		return getService().addMaxuser(maxuser);
	}

	/**
	 * Creates a new maxuser with the primary key. Does not add the maxuser to the database.
	 *
	 * @param maxUserId the primary key for the new maxuser
	 * @return the new maxuser
	 */
	public static Maxuser createMaxuser(long maxUserId) {
		return getService().createMaxuser(maxUserId);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel createPersistedModel(
			Serializable primaryKeyObj)
		throws PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the maxuser with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaxuserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser that was removed
	 * @throws PortalException if a maxuser with the primary key could not be found
	 */
	public static Maxuser deleteMaxuser(long maxUserId) throws PortalException {
		return getService().deleteMaxuser(maxUserId);
	}

	/**
	 * Deletes the maxuser from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaxuserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param maxuser the maxuser
	 * @return the maxuser that was removed
	 */
	public static Maxuser deleteMaxuser(Maxuser maxuser) {
		return getService().deleteMaxuser(maxuser);
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel deletePersistedModel(
			PersistedModel persistedModel)
		throws PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static <T> T dslQuery(DSLQuery dslQuery) {
		return getService().dslQuery(dslQuery);
	}

	public static int dslQueryCount(DSLQuery dslQuery) {
		return getService().dslQueryCount(dslQuery);
	}

	public static DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> List<T> dynamicQuery(DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.max.model.impl.MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.max.model.impl.MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	public static <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static Maxuser fetchMaxuser(long maxUserId) {
		return getService().fetchMaxuser(maxUserId);
	}

	/**
	 * Returns the maxuser matching the UUID and group.
	 *
	 * @param uuid the maxuser's UUID
	 * @param groupId the primary key of the group
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	public static Maxuser fetchMaxuserByUuidAndGroupId(
		String uuid, long groupId) {

		return getService().fetchMaxuserByUuidAndGroupId(uuid, groupId);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the maxuser with the primary key.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser
	 * @throws PortalException if a maxuser with the primary key could not be found
	 */
	public static Maxuser getMaxuser(long maxUserId) throws PortalException {
		return getService().getMaxuser(maxUserId);
	}

	/**
	 * Returns the maxuser matching the UUID and group.
	 *
	 * @param uuid the maxuser's UUID
	 * @param groupId the primary key of the group
	 * @return the matching maxuser
	 * @throws PortalException if a matching maxuser could not be found
	 */
	public static Maxuser getMaxuserByUuidAndGroupId(String uuid, long groupId)
		throws PortalException {

		return getService().getMaxuserByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the maxusers.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.max.model.impl.MaxuserModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @return the range of maxusers
	 */
	public static List<Maxuser> getMaxusers(int start, int end) {
		return getService().getMaxusers(start, end);
	}

	public static List<Maxuser> getMaxUsers(long groupId) {
		return getService().getMaxUsers(groupId);
	}

	/**
	 * Returns all the maxusers matching the UUID and company.
	 *
	 * @param uuid the UUID of the maxusers
	 * @param companyId the primary key of the company
	 * @return the matching maxusers, or an empty list if no matches were found
	 */
	public static List<Maxuser> getMaxusersByUuidAndCompanyId(
		String uuid, long companyId) {

		return getService().getMaxusersByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of maxusers matching the UUID and company.
	 *
	 * @param uuid the UUID of the maxusers
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of maxusers
	 * @param end the upper bound of the range of maxusers (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching maxusers, or an empty list if no matches were found
	 */
	public static List<Maxuser> getMaxusersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Maxuser> orderByComparator) {

		return getService().getMaxusersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of maxusers.
	 *
	 * @return the number of maxusers
	 */
	public static int getMaxusersCount() {
		return getService().getMaxusersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the maxuser in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect MaxuserLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param maxuser the maxuser
	 * @return the maxuser that was updated
	 */
	public static Maxuser updateMaxuser(Maxuser maxuser) {
		return getService().updateMaxuser(maxuser);
	}

	public static MaxuserLocalService getService() {
		return _service;
	}

	private static volatile MaxuserLocalService _service;

}