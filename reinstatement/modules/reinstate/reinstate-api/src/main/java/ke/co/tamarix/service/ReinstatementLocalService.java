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

import aQute.bnd.annotation.ProviderType;

import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;

import ke.co.tamarix.model.Reinstatement;

/**
 * Provides the local service interface for Reinstatement. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface ReinstatementLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReinstatementLocalServiceUtil} to access the reinstatement local service. Add custom service methods to <code>ke.co.tamarix.service.impl.ReinstatementLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */

	/**
	 * Adds the reinstatement to the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Reinstatement addReinstatement(Reinstatement reinstatement);

	/**
	 * Creates a new reinstatement with the primary key. Does not add the reinstatement to the database.
	 *
	 * @param reinstatementId the primary key for the new reinstatement
	 * @return the new reinstatement
	 */
	@Transactional(enabled = false)
	public Reinstatement createReinstatement(long reinstatementId);

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Reinstatement deleteReinstatement(long reinstatementId)
		throws PortalException;

	/**
	 * Deletes the reinstatement from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Reinstatement deleteReinstatement(Reinstatement reinstatement);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Reinstatement fetchReinstatement(long reinstatementId);

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Reinstatement fetchReinstatementByUuidAndGroupId(
		String uuid, long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the reinstatement with the primary key.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws PortalException if a reinstatement with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Reinstatement getReinstatement(long reinstatementId)
		throws PortalException;

	/**
	 * Returns the reinstatement matching the UUID and group.
	 *
	 * @param uuid the reinstatement's UUID
	 * @param groupId the primary key of the group
	 * @return the matching reinstatement
	 * @throws PortalException if a matching reinstatement could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Reinstatement getReinstatementByUuidAndGroupId(
			String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Reinstatement> getReinstatements(int start, int end);

	/**
	 * Returns all the reinstatements matching the UUID and company.
	 *
	 * @param uuid the UUID of the reinstatements
	 * @param companyId the primary key of the company
	 * @return the matching reinstatements, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Reinstatement> getReinstatementsByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Reinstatement> getReinstatementsByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reinstatement> orderByComparator);

	/**
	 * Returns the number of reinstatements.
	 *
	 * @return the number of reinstatements
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getReinstatementsCount();

	/**
	 * Updates the reinstatement in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatement the reinstatement
	 * @return the reinstatement that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Reinstatement updateReinstatement(Reinstatement reinstatement);

}