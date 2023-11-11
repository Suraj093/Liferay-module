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
 * Provides a wrapper for {@link MaxuserLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see MaxuserLocalService
 * @generated
 */
public class MaxuserLocalServiceWrapper
	implements MaxuserLocalService, ServiceWrapper<MaxuserLocalService> {

	public MaxuserLocalServiceWrapper() {
		this(null);
	}

	public MaxuserLocalServiceWrapper(MaxuserLocalService maxuserLocalService) {
		_maxuserLocalService = maxuserLocalService;
	}

	@Override
	public com.max.model.Maxuser addMaxUser(
		long userId, String firstName, String lastName, String contactNumber,
		String email, String dateOfBirth,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _maxuserLocalService.addMaxUser(
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
	@Override
	public com.max.model.Maxuser addMaxuser(com.max.model.Maxuser maxuser) {
		return _maxuserLocalService.addMaxuser(maxuser);
	}

	/**
	 * Creates a new maxuser with the primary key. Does not add the maxuser to the database.
	 *
	 * @param maxUserId the primary key for the new maxuser
	 * @return the new maxuser
	 */
	@Override
	public com.max.model.Maxuser createMaxuser(long maxUserId) {
		return _maxuserLocalService.createMaxuser(maxUserId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.createPersistedModel(primaryKeyObj);
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
	@Override
	public com.max.model.Maxuser deleteMaxuser(long maxUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.deleteMaxuser(maxUserId);
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
	@Override
	public com.max.model.Maxuser deleteMaxuser(com.max.model.Maxuser maxuser) {
		return _maxuserLocalService.deleteMaxuser(maxuser);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _maxuserLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _maxuserLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _maxuserLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _maxuserLocalService.dynamicQuery(dynamicQuery);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _maxuserLocalService.dynamicQuery(dynamicQuery, start, end);
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
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _maxuserLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _maxuserLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _maxuserLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.max.model.Maxuser fetchMaxuser(long maxUserId) {
		return _maxuserLocalService.fetchMaxuser(maxUserId);
	}

	/**
	 * Returns the maxuser matching the UUID and group.
	 *
	 * @param uuid the maxuser's UUID
	 * @param groupId the primary key of the group
	 * @return the matching maxuser, or <code>null</code> if a matching maxuser could not be found
	 */
	@Override
	public com.max.model.Maxuser fetchMaxuserByUuidAndGroupId(
		String uuid, long groupId) {

		return _maxuserLocalService.fetchMaxuserByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _maxuserLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _maxuserLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _maxuserLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the maxuser with the primary key.
	 *
	 * @param maxUserId the primary key of the maxuser
	 * @return the maxuser
	 * @throws PortalException if a maxuser with the primary key could not be found
	 */
	@Override
	public com.max.model.Maxuser getMaxuser(long maxUserId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.getMaxuser(maxUserId);
	}

	/**
	 * Returns the maxuser matching the UUID and group.
	 *
	 * @param uuid the maxuser's UUID
	 * @param groupId the primary key of the group
	 * @return the matching maxuser
	 * @throws PortalException if a matching maxuser could not be found
	 */
	@Override
	public com.max.model.Maxuser getMaxuserByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.getMaxuserByUuidAndGroupId(uuid, groupId);
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
	@Override
	public java.util.List<com.max.model.Maxuser> getMaxusers(
		int start, int end) {

		return _maxuserLocalService.getMaxusers(start, end);
	}

	@Override
	public java.util.List<com.max.model.Maxuser> getMaxUsers(long groupId) {
		return _maxuserLocalService.getMaxUsers(groupId);
	}

	/**
	 * Returns all the maxusers matching the UUID and company.
	 *
	 * @param uuid the UUID of the maxusers
	 * @param companyId the primary key of the company
	 * @return the matching maxusers, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.max.model.Maxuser> getMaxusersByUuidAndCompanyId(
		String uuid, long companyId) {

		return _maxuserLocalService.getMaxusersByUuidAndCompanyId(
			uuid, companyId);
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
	@Override
	public java.util.List<com.max.model.Maxuser> getMaxusersByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.max.model.Maxuser>
			orderByComparator) {

		return _maxuserLocalService.getMaxusersByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of maxusers.
	 *
	 * @return the number of maxusers
	 */
	@Override
	public int getMaxusersCount() {
		return _maxuserLocalService.getMaxusersCount();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _maxuserLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _maxuserLocalService.getPersistedModel(primaryKeyObj);
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
	@Override
	public com.max.model.Maxuser updateMaxuser(com.max.model.Maxuser maxuser) {
		return _maxuserLocalService.updateMaxuser(maxuser);
	}

	@Override
	public MaxuserLocalService getWrappedService() {
		return _maxuserLocalService;
	}

	@Override
	public void setWrappedService(MaxuserLocalService maxuserLocalService) {
		_maxuserLocalService = maxuserLocalService;
	}

	private MaxuserLocalService _maxuserLocalService;

}