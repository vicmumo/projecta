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

package ke.co.tamarix.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import java.io.Serializable;

import java.util.Map;
import java.util.Set;

import ke.co.tamarix.exception.NoSuchReinstatementException;
import ke.co.tamarix.model.Reinstatement;

/**
 * The persistence interface for the reinstatement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementUtil
 * @generated
 */
@ProviderType
public interface ReinstatementPersistence
	extends BasePersistence<Reinstatement> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ReinstatementUtil} to access the reinstatement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */
	@Override
	public Map<Serializable, Reinstatement> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys);

	/**
	 * Returns all the reinstatements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid(String uuid);

	/**
	 * Returns a range of all the reinstatements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @return the range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid(
		String uuid, int start, int end);

	/**
	 * Returns an ordered range of all the reinstatements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the reinstatements where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	public Reinstatement findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	public Reinstatement findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns the reinstatements before and after the current reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param reinstatementId the primary key of the current reinstatement
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	public Reinstatement[] findByUuid_PrevAndNext(
			long reinstatementId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Removes all the reinstatements where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of reinstatements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching reinstatements
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReinstatementException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	public Reinstatement findByUUID_G(String uuid, long groupId)
		throws NoSuchReinstatementException;

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the reinstatement where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the reinstatement that was removed
	 */
	public Reinstatement removeByUUID_G(String uuid, long groupId)
		throws NoSuchReinstatementException;

	/**
	 * Returns the number of reinstatements where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching reinstatements
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid_C(
		String uuid, long companyId);

	/**
	 * Returns a range of all the reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @return the range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end);

	/**
	 * Returns an ordered range of all the reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching reinstatements
	 */
	public java.util.List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	public Reinstatement findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	public Reinstatement findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	public Reinstatement fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns the reinstatements before and after the current reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param reinstatementId the primary key of the current reinstatement
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	public Reinstatement[] findByUuid_C_PrevAndNext(
			long reinstatementId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
				orderByComparator)
		throws NoSuchReinstatementException;

	/**
	 * Removes all the reinstatements where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching reinstatements
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Caches the reinstatement in the entity cache if it is enabled.
	 *
	 * @param reinstatement the reinstatement
	 */
	public void cacheResult(Reinstatement reinstatement);

	/**
	 * Caches the reinstatements in the entity cache if it is enabled.
	 *
	 * @param reinstatements the reinstatements
	 */
	public void cacheResult(java.util.List<Reinstatement> reinstatements);

	/**
	 * Creates a new reinstatement with the primary key. Does not add the reinstatement to the database.
	 *
	 * @param reinstatementId the primary key for the new reinstatement
	 * @return the new reinstatement
	 */
	public Reinstatement create(long reinstatementId);

	/**
	 * Removes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	public Reinstatement remove(long reinstatementId)
		throws NoSuchReinstatementException;

	public Reinstatement updateImpl(Reinstatement reinstatement);

	/**
	 * Returns the reinstatement with the primary key or throws a <code>NoSuchReinstatementException</code> if it could not be found.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	public Reinstatement findByPrimaryKey(long reinstatementId)
		throws NoSuchReinstatementException;

	/**
	 * Returns the reinstatement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement, or <code>null</code> if a reinstatement with the primary key could not be found
	 */
	public Reinstatement fetchByPrimaryKey(long reinstatementId);

	/**
	 * Returns all the reinstatements.
	 *
	 * @return the reinstatements
	 */
	public java.util.List<Reinstatement> findAll();

	/**
	 * Returns a range of all the reinstatements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @return the range of reinstatements
	 */
	public java.util.List<Reinstatement> findAll(int start, int end);

	/**
	 * Returns an ordered range of all the reinstatements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of reinstatements
	 */
	public java.util.List<Reinstatement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator);

	/**
	 * Returns an ordered range of all the reinstatements.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ReinstatementModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of reinstatements
	 * @param end the upper bound of the range of reinstatements (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of reinstatements
	 */
	public java.util.List<Reinstatement> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Reinstatement>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the reinstatements from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of reinstatements.
	 *
	 * @return the number of reinstatements
	 */
	public int countAll();

	@Override
	public Set<String> getBadColumnNames();

}