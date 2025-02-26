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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Reinstatement. This utility wraps
 * <code>ke.co.tamarix.service.impl.ReinstatementLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementLocalService
 * @generated
 */
public class ReinstatementLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>ke.co.tamarix.service.impl.ReinstatementLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the reinstatement to the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was added
	 */
	public static ke.co.tamarix.model.Reinstatement addReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return getService().addReinstatement(reinstatement);
	}

	/**
	 * Creates a new reinstatement with the primary key. Does not add the reinstatement to the database.
	 *
	 * @param reinstatementId the primary key for the new reinstatement
	 * @return the new reinstatement
	 */
	public static ke.co.tamarix.model.Reinstatement createReinstatement(
		long reinstatementId) {

		return getService().createReinstatement(reinstatementId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	public static ke.co.tamarix.model.Reinstatement deleteReinstatement(
			long reinstatementId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteReinstatement(reinstatementId);
	}

	/**
	 * Deletes the reinstatement from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was removed
	 */
	public static ke.co.tamarix.model.Reinstatement deleteReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return getService().deleteReinstatement(reinstatement);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

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
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ke.co.tamarix.model.Reinstatement fetchReinstatement(
		long reinstatementId) {

		return getService().fetchReinstatement(reinstatementId);
	}

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public static ke.co.tamarix.model.Reinstatement
		fetchReinstatementByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchReinstatementByUuidAndGroupId(uuid, groupId);
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
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the reinstatement with the primary key.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	public static ke.co.tamarix.model.Reinstatement getReinstatement(
			long reinstatementId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getReinstatement(reinstatementId);
	}

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement
	 * @throws PortalException if a matching reinstatement could not be found
	 */
	public static ke.co.tamarix.model.Reinstatement
			getReinstatementByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getReinstatementByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<ke.co.tamarix.model.Reinstatement>
		getReinstatements(int start, int end) {

		return getService().getReinstatements(start, end);
	}

	/**
	 * Returns all the reinstatements matching the UUID and company.
	 *
	 * @param uuid the UUID of the reinstatements
	 * @param companyId the primary key of the company
	 * @return the matching reinstatements, or an empty list if no matches were found
	 */
	public static java.util.List<ke.co.tamarix.model.Reinstatement>
		getReinstatementsByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getReinstatementsByUuidAndCompanyId(
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
	public static java.util.List<ke.co.tamarix.model.Reinstatement>
		getReinstatementsByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<ke.co.tamarix.model.Reinstatement> orderByComparator) {

		return getService().getReinstatementsByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of reinstatements.
	 *
	 * @return the number of reinstatements
	 */
	public static int getReinstatementsCount() {
		return getService().getReinstatementsCount();
	}

	/**
	 * Updates the reinstatement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was updated
	 */
	public static ke.co.tamarix.model.Reinstatement updateReinstatement(
		ke.co.tamarix.model.Reinstatement reinstatement) {

		return getService().updateReinstatement(reinstatement);
	}

	public static ReinstatementLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<ReinstatementLocalService, ReinstatementLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(
			ReinstatementLocalService.class);

		ServiceTracker<ReinstatementLocalService, ReinstatementLocalService>
			serviceTracker =
				new ServiceTracker
					<ReinstatementLocalService, ReinstatementLocalService>(
						bundle.getBundleContext(),
						ReinstatementLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}