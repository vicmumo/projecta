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

package ke.co.tamarix.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link ReinstatementLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementLocalService
 * @generated
 */
public class ReinstatementLocalServiceWrapper
	implements ReinstatementLocalService,
			   ServiceWrapper<ReinstatementLocalService> {

	public ReinstatementLocalServiceWrapper(
		ReinstatementLocalService reinstatementLocalService) {

		_reinstatementLocalService = reinstatementLocalService;
	}

	/**
	 * Adds the reinstatement to the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was added
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement addReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return _reinstatementLocalService.addReinstatement(reinstatement);
	}

	/**
	 * Creates a new reinstatement with the primary key. Does not add the reinstatement to the database.
	 *
	 * @param reinstatementId the primary key for the new reinstatement
	 * @return the new reinstatement
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement createReinstatement(
		long reinstatementId) {

		return _reinstatementLocalService.createReinstatement(reinstatementId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reinstatementLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement deleteReinstatement(
			long reinstatementId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reinstatementLocalService.deleteReinstatement(reinstatementId);
	}

	/**
	 * Deletes the reinstatement from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was removed
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement deleteReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return _reinstatementLocalService.deleteReinstatement(reinstatement);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _reinstatementLocalService.dynamicQuery();
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

		return _reinstatementLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ke.co.tamarix.model.impl.ReinstatementModelImpl</code>.
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

		return _reinstatementLocalService.dynamicQuery(
			dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ke.co.tamarix.model.impl.ReinstatementModelImpl</code>.
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

		return _reinstatementLocalService.dynamicQuery(
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

		return _reinstatementLocalService.dynamicQueryCount(dynamicQuery);
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

		return _reinstatementLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public ke.co.tamarix.model.Reinstatement fetchReinstatement(
		long reinstatementId) {

		return _reinstatementLocalService.fetchReinstatement(reinstatementId);
	}

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement fetchReinstatementByUuidAndGroupId(
		String uuid, long groupId) {

		return _reinstatementLocalService.fetchReinstatementByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _reinstatementLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _reinstatementLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _reinstatementLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _reinstatementLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reinstatementLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reinstatement with the primary key.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement getReinstatement(
			long reinstatementId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reinstatementLocalService.getReinstatement(reinstatementId);
	}

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement
	 * @throws PortalException if a matching reinstatement could not be found
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement getReinstatementByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _reinstatementLocalService.getReinstatementByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the reinstatements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ke.co.tamarix.model.impl.ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @return the range of reinstatements
	 */
	@Override
	public java.util.List<ke.co.tamarix.model.Reinstatement> getReinstatements(
		int start, int end) {

		return _reinstatementLocalService.getReinstatements(start, end);
	}

	/**
	 * Returns all the reinstatements matching the UUID and company.
	 *
	 * @param uuid the UUID of the reinstatements
	 * @param companyId the primary key of the company
	 * @return the matching reinstatements, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ke.co.tamarix.model.Reinstatement>
		getReinstatementsByUuidAndCompanyId(String uuid, long companyId) {

		return _reinstatementLocalService.getReinstatementsByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of reinstatements matching the UUID and company.
	 *
	 * @param uuid the UUID of the reinstatements
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching reinstatements, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<ke.co.tamarix.model.Reinstatement>
		getReinstatementsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ke.co.tamarix.model.Reinstatement> orderByComparator) {

		return _reinstatementLocalService.getReinstatementsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reinstatements.
	 *
	 * @return the number of reinstatements
	 */
	@Override
	public int getReinstatementsCount() {
		return _reinstatementLocalService.getReinstatementsCount();
	}

	/**
	 * Updates the reinstatement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was updated
	 */
	@Override
	public ke.co.tamarix.model.Reinstatement updateReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return _reinstatementLocalService.updateReinstatement(reinstatement);
	}

	@Override
	public ReinstatementLocalService getWrappedService() {
		return _reinstatementLocalService;
	}

	@Override
	public void setWrappedService(
		ReinstatementLocalService reinstatementLocalService) {

		_reinstatementLocalService = reinstatementLocalService;
	}

	private ReinstatementLocalService _reinstatementLocalService;

}