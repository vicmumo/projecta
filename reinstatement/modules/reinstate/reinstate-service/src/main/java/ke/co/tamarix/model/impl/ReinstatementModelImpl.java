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

package ke.co.tamarix.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

import ke.co.tamarix.model.Reinstatement;
import ke.co.tamarix.model.ReinstatementModel;
import ke.co.tamarix.model.ReinstatementSoap;

/**
 * The base model implementation for the Reinstatement service. Represents a row in the &quot;Reinstatement_Reinstatement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>ReinstatementModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link ReinstatementImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ReinstatementImpl
 * @generated
 */
@JSON(strict = true)
public class ReinstatementModelImpl
	extends BaseModelImpl<Reinstatement> implements ReinstatementModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a reinstatement model instance should use the <code>Reinstatement</code> interface instead.
	 */
	public static final String TABLE_NAME = "Reinstatement_Reinstatement";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"reinstatementId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"createdby", Types.BIGINT}, {"modifiedby", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"firstName", Types.VARCHAR}, {"lastName", Types.VARCHAR},
		{"branchName", Types.VARCHAR}, {"payrollNo", Types.VARCHAR},
		{"terminationReason", Types.VARCHAR},
		{"terminationCode", Types.VARCHAR}, {"formerBranch", Types.VARCHAR}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("reinstatementId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("createdby", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("modifiedby", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("firstName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("lastName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("branchName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("payrollNo", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("terminationReason", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("terminationCode", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("formerBranch", Types.VARCHAR);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Reinstatement_Reinstatement (uuid_ VARCHAR(75) null,reinstatementId LONG not null primary key,groupId LONG,companyId LONG,createdby LONG,modifiedby VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,firstName VARCHAR(75) null,lastName VARCHAR(75) null,branchName VARCHAR(75) null,payrollNo VARCHAR(75) null,terminationReason VARCHAR(75) null,terminationCode VARCHAR(75) null,formerBranch VARCHAR(75) null)";

	public static final String TABLE_SQL_DROP =
		"drop table Reinstatement_Reinstatement";

	public static final String ORDER_BY_JPQL =
		" ORDER BY reinstatement.reinstatementId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Reinstatement_Reinstatement.reinstatementId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(
		ke.co.tamarix.service.util.ServiceProps.get(
			"value.object.entity.cache.enabled.ke.co.tamarix.model.Reinstatement"),
		true);

	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(
		ke.co.tamarix.service.util.ServiceProps.get(
			"value.object.finder.cache.enabled.ke.co.tamarix.model.Reinstatement"),
		true);

	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(
		ke.co.tamarix.service.util.ServiceProps.get(
			"value.object.column.bitmask.enabled.ke.co.tamarix.model.Reinstatement"),
		true);

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long UUID_COLUMN_BITMASK = 4L;

	public static final long REINSTATEMENTID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Reinstatement toModel(ReinstatementSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Reinstatement model = new ReinstatementImpl();

		model.setUuid(soapModel.getUuid());
		model.setReinstatementId(soapModel.getReinstatementId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setCreatedby(soapModel.getCreatedby());
		model.setModifiedby(soapModel.getModifiedby());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setFirstName(soapModel.getFirstName());
		model.setLastName(soapModel.getLastName());
		model.setBranchName(soapModel.getBranchName());
		model.setPayrollNo(soapModel.getPayrollNo());
		model.setTerminationReason(soapModel.getTerminationReason());
		model.setTerminationCode(soapModel.getTerminationCode());
		model.setFormerBranch(soapModel.getFormerBranch());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Reinstatement> toModels(ReinstatementSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Reinstatement> models = new ArrayList<Reinstatement>(
			soapModels.length);

		for (ReinstatementSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(
		ke.co.tamarix.service.util.ServiceProps.get(
			"lock.expiration.time.ke.co.tamarix.model.Reinstatement"));

	public ReinstatementModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _reinstatementId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setReinstatementId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _reinstatementId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Reinstatement.class;
	}

	@Override
	public String getModelClassName() {
		return Reinstatement.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Reinstatement, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Reinstatement, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Reinstatement, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((Reinstatement)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Reinstatement, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Reinstatement, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Reinstatement)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Reinstatement, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Reinstatement, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Reinstatement>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Reinstatement.class.getClassLoader(), Reinstatement.class,
			ModelWrapper.class);

		try {
			Constructor<Reinstatement> constructor =
				(Constructor<Reinstatement>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Reinstatement, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Reinstatement, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Reinstatement, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Reinstatement, Object>>();
		Map<String, BiConsumer<Reinstatement, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Reinstatement, ?>>();

		attributeGetterFunctions.put(
			"uuid",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getUuid();
				}

			});
		attributeSetterBiConsumers.put(
			"uuid",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object uuidObject) {

					reinstatement.setUuid((String)uuidObject);
				}

			});
		attributeGetterFunctions.put(
			"reinstatementId",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getReinstatementId();
				}

			});
		attributeSetterBiConsumers.put(
			"reinstatementId",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object reinstatementIdObject) {

					reinstatement.setReinstatementId(
						(Long)reinstatementIdObject);
				}

			});
		attributeGetterFunctions.put(
			"groupId",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getGroupId();
				}

			});
		attributeSetterBiConsumers.put(
			"groupId",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object groupIdObject) {

					reinstatement.setGroupId((Long)groupIdObject);
				}

			});
		attributeGetterFunctions.put(
			"companyId",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getCompanyId();
				}

			});
		attributeSetterBiConsumers.put(
			"companyId",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object companyIdObject) {

					reinstatement.setCompanyId((Long)companyIdObject);
				}

			});
		attributeGetterFunctions.put(
			"createdby",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getCreatedby();
				}

			});
		attributeSetterBiConsumers.put(
			"createdby",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object createdbyObject) {

					reinstatement.setCreatedby((Long)createdbyObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedby",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getModifiedby();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedby",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object modifiedbyObject) {

					reinstatement.setModifiedby((String)modifiedbyObject);
				}

			});
		attributeGetterFunctions.put(
			"createDate",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getCreateDate();
				}

			});
		attributeSetterBiConsumers.put(
			"createDate",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object createDateObject) {

					reinstatement.setCreateDate((Date)createDateObject);
				}

			});
		attributeGetterFunctions.put(
			"modifiedDate",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getModifiedDate();
				}

			});
		attributeSetterBiConsumers.put(
			"modifiedDate",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object modifiedDateObject) {

					reinstatement.setModifiedDate((Date)modifiedDateObject);
				}

			});
		attributeGetterFunctions.put(
			"firstName",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getFirstName();
				}

			});
		attributeSetterBiConsumers.put(
			"firstName",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object firstNameObject) {

					reinstatement.setFirstName((String)firstNameObject);
				}

			});
		attributeGetterFunctions.put(
			"lastName",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getLastName();
				}

			});
		attributeSetterBiConsumers.put(
			"lastName",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object lastNameObject) {

					reinstatement.setLastName((String)lastNameObject);
				}

			});
		attributeGetterFunctions.put(
			"branchName",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getBranchName();
				}

			});
		attributeSetterBiConsumers.put(
			"branchName",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object branchNameObject) {

					reinstatement.setBranchName((String)branchNameObject);
				}

			});
		attributeGetterFunctions.put(
			"payrollNo",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getPayrollNo();
				}

			});
		attributeSetterBiConsumers.put(
			"payrollNo",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object payrollNoObject) {

					reinstatement.setPayrollNo((String)payrollNoObject);
				}

			});
		attributeGetterFunctions.put(
			"terminationReason",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getTerminationReason();
				}

			});
		attributeSetterBiConsumers.put(
			"terminationReason",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement,
					Object terminationReasonObject) {

					reinstatement.setTerminationReason(
						(String)terminationReasonObject);
				}

			});
		attributeGetterFunctions.put(
			"terminationCode",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getTerminationCode();
				}

			});
		attributeSetterBiConsumers.put(
			"terminationCode",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object terminationCodeObject) {

					reinstatement.setTerminationCode(
						(String)terminationCodeObject);
				}

			});
		attributeGetterFunctions.put(
			"formerBranch",
			new Function<Reinstatement, Object>() {

				@Override
				public Object apply(Reinstatement reinstatement) {
					return reinstatement.getFormerBranch();
				}

			});
		attributeSetterBiConsumers.put(
			"formerBranch",
			new BiConsumer<Reinstatement, Object>() {

				@Override
				public void accept(
					Reinstatement reinstatement, Object formerBranchObject) {

					reinstatement.setFormerBranch((String)formerBranchObject);
				}

			});

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getReinstatementId() {
		return _reinstatementId;
	}

	@Override
	public void setReinstatementId(long reinstatementId) {
		_reinstatementId = reinstatementId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getCreatedby() {
		return _createdby;
	}

	@Override
	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	@JSON
	@Override
	public String getModifiedby() {
		if (_modifiedby == null) {
			return "";
		}
		else {
			return _modifiedby;
		}
	}

	@Override
	public void setModifiedby(String modifiedby) {
		_modifiedby = modifiedby;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getFirstName() {
		if (_firstName == null) {
			return "";
		}
		else {
			return _firstName;
		}
	}

	@Override
	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	@JSON
	@Override
	public String getLastName() {
		if (_lastName == null) {
			return "";
		}
		else {
			return _lastName;
		}
	}

	@Override
	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	@JSON
	@Override
	public String getBranchName() {
		if (_branchName == null) {
			return "";
		}
		else {
			return _branchName;
		}
	}

	@Override
	public void setBranchName(String branchName) {
		_branchName = branchName;
	}

	@JSON
	@Override
	public String getPayrollNo() {
		if (_payrollNo == null) {
			return "";
		}
		else {
			return _payrollNo;
		}
	}

	@Override
	public void setPayrollNo(String payrollNo) {
		_payrollNo = payrollNo;
	}

	@JSON
	@Override
	public String getTerminationReason() {
		if (_terminationReason == null) {
			return "";
		}
		else {
			return _terminationReason;
		}
	}

	@Override
	public void setTerminationReason(String terminationReason) {
		_terminationReason = terminationReason;
	}

	@JSON
	@Override
	public String getTerminationCode() {
		if (_terminationCode == null) {
			return "";
		}
		else {
			return _terminationCode;
		}
	}

	@Override
	public void setTerminationCode(String terminationCode) {
		_terminationCode = terminationCode;
	}

	@JSON
	@Override
	public String getFormerBranch() {
		if (_formerBranch == null) {
			return "";
		}
		else {
			return _formerBranch;
		}
	}

	@Override
	public void setFormerBranch(String formerBranch) {
		_formerBranch = formerBranch;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Reinstatement.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Reinstatement.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Reinstatement toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Reinstatement>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		ReinstatementImpl reinstatementImpl = new ReinstatementImpl();

		reinstatementImpl.setUuid(getUuid());
		reinstatementImpl.setReinstatementId(getReinstatementId());
		reinstatementImpl.setGroupId(getGroupId());
		reinstatementImpl.setCompanyId(getCompanyId());
		reinstatementImpl.setCreatedby(getCreatedby());
		reinstatementImpl.setModifiedby(getModifiedby());
		reinstatementImpl.setCreateDate(getCreateDate());
		reinstatementImpl.setModifiedDate(getModifiedDate());
		reinstatementImpl.setFirstName(getFirstName());
		reinstatementImpl.setLastName(getLastName());
		reinstatementImpl.setBranchName(getBranchName());
		reinstatementImpl.setPayrollNo(getPayrollNo());
		reinstatementImpl.setTerminationReason(getTerminationReason());
		reinstatementImpl.setTerminationCode(getTerminationCode());
		reinstatementImpl.setFormerBranch(getFormerBranch());

		reinstatementImpl.resetOriginalValues();

		return reinstatementImpl;
	}

	@Override
	public int compareTo(Reinstatement reinstatement) {
		long primaryKey = reinstatement.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Reinstatement)) {
			return false;
		}

		Reinstatement reinstatement = (Reinstatement)obj;

		long primaryKey = reinstatement.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return ENTITY_CACHE_ENABLED;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return FINDER_CACHE_ENABLED;
	}

	@Override
	public void resetOriginalValues() {
		ReinstatementModelImpl reinstatementModelImpl = this;

		reinstatementModelImpl._originalUuid = reinstatementModelImpl._uuid;

		reinstatementModelImpl._originalGroupId =
			reinstatementModelImpl._groupId;

		reinstatementModelImpl._setOriginalGroupId = false;

		reinstatementModelImpl._originalCompanyId =
			reinstatementModelImpl._companyId;

		reinstatementModelImpl._setOriginalCompanyId = false;

		reinstatementModelImpl._setModifiedDate = false;

		reinstatementModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Reinstatement> toCacheModel() {
		ReinstatementCacheModel reinstatementCacheModel =
			new ReinstatementCacheModel();

		reinstatementCacheModel.uuid = getUuid();

		String uuid = reinstatementCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			reinstatementCacheModel.uuid = null;
		}

		reinstatementCacheModel.reinstatementId = getReinstatementId();

		reinstatementCacheModel.groupId = getGroupId();

		reinstatementCacheModel.companyId = getCompanyId();

		reinstatementCacheModel.createdby = getCreatedby();

		reinstatementCacheModel.modifiedby = getModifiedby();

		String modifiedby = reinstatementCacheModel.modifiedby;

		if ((modifiedby != null) && (modifiedby.length() == 0)) {
			reinstatementCacheModel.modifiedby = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			reinstatementCacheModel.createDate = createDate.getTime();
		}
		else {
			reinstatementCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			reinstatementCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			reinstatementCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		reinstatementCacheModel.firstName = getFirstName();

		String firstName = reinstatementCacheModel.firstName;

		if ((firstName != null) && (firstName.length() == 0)) {
			reinstatementCacheModel.firstName = null;
		}

		reinstatementCacheModel.lastName = getLastName();

		String lastName = reinstatementCacheModel.lastName;

		if ((lastName != null) && (lastName.length() == 0)) {
			reinstatementCacheModel.lastName = null;
		}

		reinstatementCacheModel.branchName = getBranchName();

		String branchName = reinstatementCacheModel.branchName;

		if ((branchName != null) && (branchName.length() == 0)) {
			reinstatementCacheModel.branchName = null;
		}

		reinstatementCacheModel.payrollNo = getPayrollNo();

		String payrollNo = reinstatementCacheModel.payrollNo;

		if ((payrollNo != null) && (payrollNo.length() == 0)) {
			reinstatementCacheModel.payrollNo = null;
		}

		reinstatementCacheModel.terminationReason = getTerminationReason();

		String terminationReason = reinstatementCacheModel.terminationReason;

		if ((terminationReason != null) && (terminationReason.length() == 0)) {
			reinstatementCacheModel.terminationReason = null;
		}

		reinstatementCacheModel.terminationCode = getTerminationCode();

		String terminationCode = reinstatementCacheModel.terminationCode;

		if ((terminationCode != null) && (terminationCode.length() == 0)) {
			reinstatementCacheModel.terminationCode = null;
		}

		reinstatementCacheModel.formerBranch = getFormerBranch();

		String formerBranch = reinstatementCacheModel.formerBranch;

		if ((formerBranch != null) && (formerBranch.length() == 0)) {
			reinstatementCacheModel.formerBranch = null;
		}

		return reinstatementCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Reinstatement, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Reinstatement, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Reinstatement, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Reinstatement)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Reinstatement, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Reinstatement, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Reinstatement, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Reinstatement)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Reinstatement>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private String _uuid;
	private String _originalUuid;
	private long _reinstatementId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _createdby;
	private String _modifiedby;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _firstName;
	private String _lastName;
	private String _branchName;
	private String _payrollNo;
	private String _terminationReason;
	private String _terminationCode;
	private String _formerBranch;
	private long _columnBitmask;
	private Reinstatement _escapedModel;

}