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

package ke.co.tamarix.service.persistence.impl;

import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;
import com.liferay.portal.spring.extender.service.ServiceReference;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import ke.co.tamarix.exception.NoSuchReinstatementException;
import ke.co.tamarix.model.Reinstatement;
import ke.co.tamarix.model.impl.ReinstatementImpl;
import ke.co.tamarix.model.impl.ReinstatementModelImpl;
import ke.co.tamarix.service.persistence.ReinstatementPersistence;

/**
 * The persistence implementation for the reinstatement service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReinstatementPersistenceImpl
	extends BasePersistenceImpl<Reinstatement>
	implements ReinstatementPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>ReinstatementUtil</code> to access the reinstatement persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		ReinstatementImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the reinstatements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching reinstatements
	 */
	@Override
	public List<Reinstatement> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Reinstatement> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

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
	@Override
	public List<Reinstatement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reinstatement> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Reinstatement> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Reinstatement> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<Reinstatement> list = null;

		if (useFinderCache) {
			list = (List<Reinstatement>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Reinstatement reinstatement : list) {
					if (!uuid.equals(reinstatement.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ReinstatementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				list = (List<Reinstatement>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement findByUuid_First(
			String uuid, OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByUuid_First(
			uuid, orderByComparator);

		if (reinstatement != null) {
			return reinstatement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchReinstatementException(msg.toString());
	}

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUuid_First(
		String uuid, OrderByComparator<Reinstatement> orderByComparator) {

		List<Reinstatement> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement findByUuid_Last(
			String uuid, OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByUuid_Last(uuid, orderByComparator);

		if (reinstatement != null) {
			return reinstatement;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append("}");

		throw new NoSuchReinstatementException(msg.toString());
	}

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUuid_Last(
		String uuid, OrderByComparator<Reinstatement> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<Reinstatement> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the reinstatements before and after the current reinstatement in the ordered set where uuid = &#63;.
	 *
	 * @param reinstatementId the primary key of the current reinstatement
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement[] findByUuid_PrevAndNext(
			long reinstatementId, String uuid,
			OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		uuid = Objects.toString(uuid, "");

		Reinstatement reinstatement = findByPrimaryKey(reinstatementId);

		Session session = null;

		try {
			session = openSession();

			Reinstatement[] array = new ReinstatementImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, reinstatement, uuid, orderByComparator, true);

			array[1] = reinstatement;

			array[2] = getByUuid_PrevAndNext(
				session, reinstatement, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Reinstatement getByUuid_PrevAndNext(
		Session session, Reinstatement reinstatement, String uuid,
		OrderByComparator<Reinstatement> orderByComparator, boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_REINSTATEMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ReinstatementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						reinstatement)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Reinstatement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the reinstatements where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (Reinstatement reinstatement :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(reinstatement);
		}
	}

	/**
	 * Returns the number of reinstatements where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching reinstatements
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"reinstatement.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(reinstatement.uuid IS NULL OR reinstatement.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchReinstatementException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement findByUUID_G(String uuid, long groupId)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByUUID_G(uuid, groupId);

		if (reinstatement == null) {
			StringBundler msg = new StringBundler(6);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("uuid=");
			msg.append(uuid);

			msg.append(", groupId=");
			msg.append(groupId);

			msg.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(msg.toString());
			}

			throw new NoSuchReinstatementException(msg.toString());
		}

		return reinstatement;
	}

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the reinstatement where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof Reinstatement) {
			Reinstatement reinstatement = (Reinstatement)result;

			if (!Objects.equals(uuid, reinstatement.getUuid()) ||
				(groupId != reinstatement.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_SELECT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				List<Reinstatement> list = q.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					Reinstatement reinstatement = list.get(0);

					result = reinstatement;

					cacheResult(reinstatement);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(
						_finderPathFetchByUUID_G, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Reinstatement)result;
		}
	}

	/**
	 * Removes the reinstatement where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the reinstatement that was removed
	 */
	@Override
	public Reinstatement removeByUUID_G(String uuid, long groupId)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = findByUUID_G(uuid, groupId);

		return remove(reinstatement);
	}

	/**
	 * Returns the number of reinstatements where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching reinstatements
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(groupId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"reinstatement.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(reinstatement.uuid IS NULL OR reinstatement.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"reinstatement.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching reinstatements
	 */
	@Override
	public List<Reinstatement> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

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
	@Override
	public List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reinstatement> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

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
	@Override
	public List<Reinstatement> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Reinstatement> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<Reinstatement> list = null;

		if (useFinderCache) {
			list = (List<Reinstatement>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (Reinstatement reinstatement : list) {
					if (!uuid.equals(reinstatement.getUuid()) ||
						(companyId != reinstatement.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				query.append(ReinstatementModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				list = (List<Reinstatement>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (reinstatement != null) {
			return reinstatement;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchReinstatementException(msg.toString());
	}

	/**
	 * Returns the first reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Reinstatement> orderByComparator) {

		List<Reinstatement> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement
	 * @throws NoSuchReinstatementException if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (reinstatement != null) {
			return reinstatement;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("uuid=");
		msg.append(uuid);

		msg.append(", companyId=");
		msg.append(companyId);

		msg.append("}");

		throw new NoSuchReinstatementException(msg.toString());
	}

	/**
	 * Returns the last reinstatement in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching reinstatement, or <code>null</code> if a matching reinstatement could not be found
	 */
	@Override
	public Reinstatement fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Reinstatement> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<Reinstatement> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

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
	@Override
	public Reinstatement[] findByUuid_C_PrevAndNext(
			long reinstatementId, String uuid, long companyId,
			OrderByComparator<Reinstatement> orderByComparator)
		throws NoSuchReinstatementException {

		uuid = Objects.toString(uuid, "");

		Reinstatement reinstatement = findByPrimaryKey(reinstatementId);

		Session session = null;

		try {
			session = openSession();

			Reinstatement[] array = new ReinstatementImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, reinstatement, uuid, companyId, orderByComparator,
				true);

			array[1] = reinstatement;

			array[2] = getByUuid_C_PrevAndNext(
				session, reinstatement, uuid, companyId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected Reinstatement getByUuid_C_PrevAndNext(
		Session session, Reinstatement reinstatement, String uuid,
		long companyId, OrderByComparator<Reinstatement> orderByComparator,
		boolean previous) {

		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			query = new StringBundler(4);
		}

		query.append(_SQL_SELECT_REINSTATEMENT_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			query.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			query.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(ReinstatementModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindUuid) {
			qPos.add(uuid);
		}

		qPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						reinstatement)) {

				qPos.add(orderByConditionValue);
			}
		}

		List<Reinstatement> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the reinstatements where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (Reinstatement reinstatement :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(reinstatement);
		}
	}

	/**
	 * Returns the number of reinstatements where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching reinstatements
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_REINSTATEMENT_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				query.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				query.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			query.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindUuid) {
					qPos.add(uuid);
				}

				qPos.add(companyId);

				count = (Long)q.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(finderPath, finderArgs);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"reinstatement.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(reinstatement.uuid IS NULL OR reinstatement.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"reinstatement.companyId = ?";

	public ReinstatementPersistenceImpl() {
		setModelClass(Reinstatement.class);

		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		try {
			Field field = BasePersistenceImpl.class.getDeclaredField(
				"_dbColumnNames");

			field.setAccessible(true);

			field.set(this, dbColumnNames);
		}
		catch (Exception exception) {
			if (_log.isDebugEnabled()) {
				_log.debug(exception, exception);
			}
		}
	}

	/**
	 * Caches the reinstatement in the entity cache if it is enabled.
	 *
	 * @param reinstatement the reinstatement
	 */
	@Override
	public void cacheResult(Reinstatement reinstatement) {
		entityCache.putResult(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementImpl.class, reinstatement.getPrimaryKey(),
			reinstatement);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {reinstatement.getUuid(), reinstatement.getGroupId()},
			reinstatement);

		reinstatement.resetOriginalValues();
	}

	/**
	 * Caches the reinstatements in the entity cache if it is enabled.
	 *
	 * @param reinstatements the reinstatements
	 */
	@Override
	public void cacheResult(List<Reinstatement> reinstatements) {
		for (Reinstatement reinstatement : reinstatements) {
			if (entityCache.getResult(
					ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
					ReinstatementImpl.class, reinstatement.getPrimaryKey()) ==
						null) {

				cacheResult(reinstatement);
			}
			else {
				reinstatement.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all reinstatements.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(ReinstatementImpl.class);

		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the reinstatement.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Reinstatement reinstatement) {
		entityCache.removeResult(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementImpl.class, reinstatement.getPrimaryKey());

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache((ReinstatementModelImpl)reinstatement, true);
	}

	@Override
	public void clearCache(List<Reinstatement> reinstatements) {
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Reinstatement reinstatement : reinstatements) {
			entityCache.removeResult(
				ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
				ReinstatementImpl.class, reinstatement.getPrimaryKey());

			clearUniqueFindersCache(
				(ReinstatementModelImpl)reinstatement, true);
		}
	}

	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
				ReinstatementImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		ReinstatementModelImpl reinstatementModelImpl) {

		Object[] args = new Object[] {
			reinstatementModelImpl.getUuid(),
			reinstatementModelImpl.getGroupId()
		};

		finderCache.putResult(
			_finderPathCountByUUID_G, args, Long.valueOf(1), false);
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, reinstatementModelImpl, false);
	}

	protected void clearUniqueFindersCache(
		ReinstatementModelImpl reinstatementModelImpl, boolean clearCurrent) {

		if (clearCurrent) {
			Object[] args = new Object[] {
				reinstatementModelImpl.getUuid(),
				reinstatementModelImpl.getGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}

		if ((reinstatementModelImpl.getColumnBitmask() &
			 _finderPathFetchByUUID_G.getColumnBitmask()) != 0) {

			Object[] args = new Object[] {
				reinstatementModelImpl.getOriginalUuid(),
				reinstatementModelImpl.getOriginalGroupId()
			};

			finderCache.removeResult(_finderPathCountByUUID_G, args);
			finderCache.removeResult(_finderPathFetchByUUID_G, args);
		}
	}

	/**
	 * Creates a new reinstatement with the primary key. Does not add the reinstatement to the database.
	 *
	 * @param reinstatementId the primary key for the new reinstatement
	 * @return the new reinstatement
	 */
	@Override
	public Reinstatement create(long reinstatementId) {
		Reinstatement reinstatement = new ReinstatementImpl();

		reinstatement.setNew(true);
		reinstatement.setPrimaryKey(reinstatementId);

		String uuid = PortalUUIDUtil.generate();

		reinstatement.setUuid(uuid);

		reinstatement.setCompanyId(CompanyThreadLocal.getCompanyId());

		return reinstatement;
	}

	/**
	 * Removes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement remove(long reinstatementId)
		throws NoSuchReinstatementException {

		return remove((Serializable)reinstatementId);
	}

	/**
	 * Removes the reinstatement with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the reinstatement
	 * @return the reinstatement that was removed
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement remove(Serializable primaryKey)
		throws NoSuchReinstatementException {

		Session session = null;

		try {
			session = openSession();

			Reinstatement reinstatement = (Reinstatement)session.get(
				ReinstatementImpl.class, primaryKey);

			if (reinstatement == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchReinstatementException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(reinstatement);
		}
		catch (NoSuchReinstatementException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Reinstatement removeImpl(Reinstatement reinstatement) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(reinstatement)) {
				reinstatement = (Reinstatement)session.get(
					ReinstatementImpl.class, reinstatement.getPrimaryKeyObj());
			}

			if (reinstatement != null) {
				session.delete(reinstatement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (reinstatement != null) {
			clearCache(reinstatement);
		}

		return reinstatement;
	}

	@Override
	public Reinstatement updateImpl(Reinstatement reinstatement) {
		boolean isNew = reinstatement.isNew();

		if (!(reinstatement instanceof ReinstatementModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(reinstatement.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					reinstatement);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in reinstatement proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom Reinstatement implementation " +
					reinstatement.getClass());
		}

		ReinstatementModelImpl reinstatementModelImpl =
			(ReinstatementModelImpl)reinstatement;

		if (Validator.isNull(reinstatement.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			reinstatement.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date now = new Date();

		if (isNew && (reinstatement.getCreateDate() == null)) {
			if (serviceContext == null) {
				reinstatement.setCreateDate(now);
			}
			else {
				reinstatement.setCreateDate(serviceContext.getCreateDate(now));
			}
		}

		if (!reinstatementModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				reinstatement.setModifiedDate(now);
			}
			else {
				reinstatement.setModifiedDate(
					serviceContext.getModifiedDate(now));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (reinstatement.isNew()) {
				session.save(reinstatement);

				reinstatement.setNew(false);
			}
			else {
				reinstatement = (Reinstatement)session.merge(reinstatement);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (!ReinstatementModelImpl.COLUMN_BITMASK_ENABLED) {
			finderCache.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}
		else if (isNew) {
			Object[] args = new Object[] {reinstatementModelImpl.getUuid()};

			finderCache.removeResult(_finderPathCountByUuid, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid, args);

			args = new Object[] {
				reinstatementModelImpl.getUuid(),
				reinstatementModelImpl.getCompanyId()
			};

			finderCache.removeResult(_finderPathCountByUuid_C, args);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindByUuid_C, args);

			finderCache.removeResult(_finderPathCountAll, FINDER_ARGS_EMPTY);
			finderCache.removeResult(
				_finderPathWithoutPaginationFindAll, FINDER_ARGS_EMPTY);
		}
		else {
			if ((reinstatementModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					reinstatementModelImpl.getOriginalUuid()
				};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);

				args = new Object[] {reinstatementModelImpl.getUuid()};

				finderCache.removeResult(_finderPathCountByUuid, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid, args);
			}

			if ((reinstatementModelImpl.getColumnBitmask() &
				 _finderPathWithoutPaginationFindByUuid_C.getColumnBitmask()) !=
					 0) {

				Object[] args = new Object[] {
					reinstatementModelImpl.getOriginalUuid(),
					reinstatementModelImpl.getOriginalCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);

				args = new Object[] {
					reinstatementModelImpl.getUuid(),
					reinstatementModelImpl.getCompanyId()
				};

				finderCache.removeResult(_finderPathCountByUuid_C, args);
				finderCache.removeResult(
					_finderPathWithoutPaginationFindByUuid_C, args);
			}
		}

		entityCache.putResult(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementImpl.class, reinstatement.getPrimaryKey(),
			reinstatement, false);

		clearUniqueFindersCache(reinstatementModelImpl, false);
		cacheUniqueFindersCache(reinstatementModelImpl);

		reinstatement.resetOriginalValues();

		return reinstatement;
	}

	/**
	 * Returns the reinstatement with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement findByPrimaryKey(Serializable primaryKey)
		throws NoSuchReinstatementException {

		Reinstatement reinstatement = fetchByPrimaryKey(primaryKey);

		if (reinstatement == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchReinstatementException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return reinstatement;
	}

	/**
	 * Returns the reinstatement with the primary key or throws a <code>NoSuchReinstatementException</code> if it could not be found.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement
	 * @throws NoSuchReinstatementException if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement findByPrimaryKey(long reinstatementId)
		throws NoSuchReinstatementException {

		return findByPrimaryKey((Serializable)reinstatementId);
	}

	/**
	 * Returns the reinstatement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the reinstatement
	 * @return the reinstatement, or <code>null</code> if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement fetchByPrimaryKey(Serializable primaryKey) {
		Serializable serializable = entityCache.getResult(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementImpl.class, primaryKey);

		if (serializable == nullModel) {
			return null;
		}

		Reinstatement reinstatement = (Reinstatement)serializable;

		if (reinstatement == null) {
			Session session = null;

			try {
				session = openSession();

				reinstatement = (Reinstatement)session.get(
					ReinstatementImpl.class, primaryKey);

				if (reinstatement != null) {
					cacheResult(reinstatement);
				}
				else {
					entityCache.putResult(
						ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
						ReinstatementImpl.class, primaryKey, nullModel);
				}
			}
			catch (Exception exception) {
				entityCache.removeResult(
					ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
					ReinstatementImpl.class, primaryKey);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return reinstatement;
	}

	/**
	 * Returns the reinstatement with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param reinstatementId the primary key of the reinstatement
	 * @return the reinstatement, or <code>null</code> if a reinstatement with the primary key could not be found
	 */
	@Override
	public Reinstatement fetchByPrimaryKey(long reinstatementId) {
		return fetchByPrimaryKey((Serializable)reinstatementId);
	}

	@Override
	public Map<Serializable, Reinstatement> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		if (primaryKeys.isEmpty()) {
			return Collections.emptyMap();
		}

		Map<Serializable, Reinstatement> map =
			new HashMap<Serializable, Reinstatement>();

		if (primaryKeys.size() == 1) {
			Iterator<Serializable> iterator = primaryKeys.iterator();

			Serializable primaryKey = iterator.next();

			Reinstatement reinstatement = fetchByPrimaryKey(primaryKey);

			if (reinstatement != null) {
				map.put(primaryKey, reinstatement);
			}

			return map;
		}

		Set<Serializable> uncachedPrimaryKeys = null;

		for (Serializable primaryKey : primaryKeys) {
			Serializable serializable = entityCache.getResult(
				ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
				ReinstatementImpl.class, primaryKey);

			if (serializable != nullModel) {
				if (serializable == null) {
					if (uncachedPrimaryKeys == null) {
						uncachedPrimaryKeys = new HashSet<Serializable>();
					}

					uncachedPrimaryKeys.add(primaryKey);
				}
				else {
					map.put(primaryKey, (Reinstatement)serializable);
				}
			}
		}

		if (uncachedPrimaryKeys == null) {
			return map;
		}

		StringBundler query = new StringBundler(
			uncachedPrimaryKeys.size() * 2 + 1);

		query.append(_SQL_SELECT_REINSTATEMENT_WHERE_PKS_IN);

		for (Serializable primaryKey : uncachedPrimaryKeys) {
			query.append((long)primaryKey);

			query.append(",");
		}

		query.setIndex(query.index() - 1);

		query.append(")");

		String sql = query.toString();

		Session session = null;

		try {
			session = openSession();

			Query q = session.createQuery(sql);

			for (Reinstatement reinstatement : (List<Reinstatement>)q.list()) {
				map.put(reinstatement.getPrimaryKeyObj(), reinstatement);

				cacheResult(reinstatement);

				uncachedPrimaryKeys.remove(reinstatement.getPrimaryKeyObj());
			}

			for (Serializable primaryKey : uncachedPrimaryKeys) {
				entityCache.putResult(
					ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
					ReinstatementImpl.class, primaryKey, nullModel);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		return map;
	}

	/**
	 * Returns all the reinstatements.
	 *
	 * @return the reinstatements
	 */
	@Override
	public List<Reinstatement> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

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
	@Override
	public List<Reinstatement> findAll(int start, int end) {
		return findAll(start, end, null);
	}

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
	@Override
	public List<Reinstatement> findAll(
		int start, int end,
		OrderByComparator<Reinstatement> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

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
	@Override
	public List<Reinstatement> findAll(
		int start, int end, OrderByComparator<Reinstatement> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<Reinstatement> list = null;

		if (useFinderCache) {
			list = (List<Reinstatement>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				query.append(_SQL_SELECT_REINSTATEMENT);

				appendOrderByComparator(
					query, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_REINSTATEMENT;

				sql = sql.concat(ReinstatementModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				list = (List<Reinstatement>)QueryUtil.list(
					q, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				if (useFinderCache) {
					finderCache.removeResult(finderPath, finderArgs);
				}

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the reinstatements from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (Reinstatement reinstatement : findAll()) {
			remove(reinstatement);
		}
	}

	/**
	 * Returns the number of reinstatements.
	 *
	 * @return the number of reinstatements
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_REINSTATEMENT);

				count = (Long)q.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				finderCache.removeResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY);

				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return ReinstatementModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the reinstatement persistence.
	 */
	public void afterPropertiesSet() {
		_finderPathWithPaginationFindAll = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findAll", new String[0]);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findAll", new String[0]);

		_finderPathCountAll = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0]);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid", new String[] {String.class.getName()},
			ReinstatementModelImpl.UUID_COLUMN_BITMASK);

		_finderPathCountByUuid = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()});

		_finderPathFetchByUUID_G = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			ReinstatementModelImpl.UUID_COLUMN_BITMASK |
			ReinstatementModelImpl.GROUPID_COLUMN_BITMASK);

		_finderPathCountByUUID_G = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()});

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED,
			ReinstatementImpl.class, FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			ReinstatementModelImpl.UUID_COLUMN_BITMASK |
			ReinstatementModelImpl.COMPANYID_COLUMN_BITMASK);

		_finderPathCountByUuid_C = new FinderPath(
			ReinstatementModelImpl.ENTITY_CACHE_ENABLED,
			ReinstatementModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()});
	}

	public void destroy() {
		entityCache.removeCache(ReinstatementImpl.class.getName());
		finderCache.removeCache(FINDER_CLASS_NAME_ENTITY);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		finderCache.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@ServiceReference(type = EntityCache.class)
	protected EntityCache entityCache;

	@ServiceReference(type = FinderCache.class)
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_REINSTATEMENT =
		"SELECT reinstatement FROM Reinstatement reinstatement";

	private static final String _SQL_SELECT_REINSTATEMENT_WHERE_PKS_IN =
		"SELECT reinstatement FROM Reinstatement reinstatement WHERE reinstatementId IN (";

	private static final String _SQL_SELECT_REINSTATEMENT_WHERE =
		"SELECT reinstatement FROM Reinstatement reinstatement WHERE ";

	private static final String _SQL_COUNT_REINSTATEMENT =
		"SELECT COUNT(reinstatement) FROM Reinstatement reinstatement";

	private static final String _SQL_COUNT_REINSTATEMENT_WHERE =
		"SELECT COUNT(reinstatement) FROM Reinstatement reinstatement WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "reinstatement.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No Reinstatement exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No Reinstatement exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		ReinstatementPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

}