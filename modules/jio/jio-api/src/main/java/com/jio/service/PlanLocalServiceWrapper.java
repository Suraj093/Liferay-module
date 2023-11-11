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

package com.jio.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link PlanLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see PlanLocalService
 * @generated
 */
public class PlanLocalServiceWrapper
	implements PlanLocalService, ServiceWrapper<PlanLocalService> {

	public PlanLocalServiceWrapper() {
		this(null);
	}

	public PlanLocalServiceWrapper(PlanLocalService planLocalService) {
		_planLocalService = planLocalService;
	}

	@Override
	public com.jio.model.Plan addPlan(
		long userId, String price, String validity, String InternetData,
		java.util.List<String> subscription, String planName, String voice,
		String sms, boolean is5GEnable, boolean isPlanActive,
		String planEffectiveDate, String planTermedDate,
		com.liferay.portal.kernel.service.ServiceContext serviceContext) {

		return _planLocalService.addPlan(
			userId, price, validity, InternetData, subscription, planName,
			voice, sms, is5GEnable, isPlanActive, planEffectiveDate,
			planTermedDate, serviceContext);
	}

	/**
	 * Adds the plan to the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param plan the plan
	 * @return the plan that was added
	 */
	@Override
	public com.jio.model.Plan addPlan(com.jio.model.Plan plan) {
		return _planLocalService.addPlan(plan);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new plan with the primary key. Does not add the plan to the database.
	 *
	 * @param planId the primary key for the new plan
	 * @return the new plan
	 */
	@Override
	public com.jio.model.Plan createPlan(long planId) {
		return _planLocalService.createPlan(planId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the plan with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param planId the primary key of the plan
	 * @return the plan that was removed
	 * @throws PortalException if a plan with the primary key could not be found
	 */
	@Override
	public com.jio.model.Plan deletePlan(long planId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.deletePlan(planId);
	}

	/**
	 * Deletes the plan from the database. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param plan the plan
	 * @return the plan that was removed
	 */
	@Override
	public com.jio.model.Plan deletePlan(com.jio.model.Plan plan) {
		return _planLocalService.deletePlan(plan);
	}

	@Override
	public <T> T dslQuery(com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {
		return _planLocalService.dslQuery(dslQuery);
	}

	@Override
	public int dslQueryCount(
		com.liferay.petra.sql.dsl.query.DSLQuery dslQuery) {

		return _planLocalService.dslQueryCount(dslQuery);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _planLocalService.dynamicQuery();
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

		return _planLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.jio.model.impl.PlanModelImpl</code>.
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

		return _planLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.jio.model.impl.PlanModelImpl</code>.
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

		return _planLocalService.dynamicQuery(
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

		return _planLocalService.dynamicQueryCount(dynamicQuery);
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

		return _planLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.jio.model.Plan fetchPlan(long planId) {
		return _planLocalService.fetchPlan(planId);
	}

	/**
	 * Returns the plan matching the UUID and group.
	 *
	 * @param uuid the plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching plan, or <code>null</code> if a matching plan could not be found
	 */
	@Override
	public com.jio.model.Plan fetchPlanByUuidAndGroupId(
		String uuid, long groupId) {

		return _planLocalService.fetchPlanByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _planLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _planLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _planLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _planLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the plan with the primary key.
	 *
	 * @param planId the primary key of the plan
	 * @return the plan
	 * @throws PortalException if a plan with the primary key could not be found
	 */
	@Override
	public com.jio.model.Plan getPlan(long planId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.getPlan(planId);
	}

	/**
	 * Returns the plan matching the UUID and group.
	 *
	 * @param uuid the plan's UUID
	 * @param groupId the primary key of the group
	 * @return the matching plan
	 * @throws PortalException if a matching plan could not be found
	 */
	@Override
	public com.jio.model.Plan getPlanByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _planLocalService.getPlanByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the plans.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>com.jio.model.impl.PlanModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @return the range of plans
	 */
	@Override
	public java.util.List<com.jio.model.Plan> getPlans(int start, int end) {
		return _planLocalService.getPlans(start, end);
	}

	/**
	 * Returns all the plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the plans
	 * @param companyId the primary key of the company
	 * @return the matching plans, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.jio.model.Plan> getPlansByUuidAndCompanyId(
		String uuid, long companyId) {

		return _planLocalService.getPlansByUuidAndCompanyId(uuid, companyId);
	}

	/**
	 * Returns a range of plans matching the UUID and company.
	 *
	 * @param uuid the UUID of the plans
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of plans
	 * @param end the upper bound of the range of plans (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching plans, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<com.jio.model.Plan> getPlansByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.jio.model.Plan>
			orderByComparator) {

		return _planLocalService.getPlansByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of plans.
	 *
	 * @return the number of plans
	 */
	@Override
	public int getPlansCount() {
		return _planLocalService.getPlansCount();
	}

	/**
	 * Updates the plan in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * <p>
	 * <strong>Important:</strong> Inspect PlanLocalServiceImpl for overloaded versions of the method. If provided, use these entry points to the API, as the implementation logic may require the additional parameters defined there.
	 * </p>
	 *
	 * @param plan the plan
	 * @return the plan that was updated
	 */
	@Override
	public com.jio.model.Plan updatePlan(com.jio.model.Plan plan) {
		return _planLocalService.updatePlan(plan);
	}

	@Override
	public PlanLocalService getWrappedService() {
		return _planLocalService;
	}

	@Override
	public void setWrappedService(PlanLocalService planLocalService) {
		_planLocalService = planLocalService;
	}

	private PlanLocalService _planLocalService;

}