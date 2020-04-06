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

package ke.co.tamarix.model;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Reinstatement}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reinstatement
 * @generated
 */
public class ReinstatementWrapper
	implements ModelWrapper<Reinstatement>, Reinstatement {

	public ReinstatementWrapper(Reinstatement reinstatement) {
		_reinstatement = reinstatement;
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

		attributes.put("uuid", getUuid());
		attributes.put("reinstatementId", getReinstatementId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("createdby", getCreatedby());
		attributes.put("modifiedby", getModifiedby());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("lastName", getLastName());
		attributes.put("branchName", getBranchName());
		attributes.put("payrollNo", getPayrollNo());
		attributes.put("terminationReason", getTerminationReason());
		attributes.put("terminationCode", getTerminationCode());
		attributes.put("formerBranch", getFormerBranch());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long reinstatementId = (Long)attributes.get("reinstatementId");

		if (reinstatementId != null) {
			setReinstatementId(reinstatementId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long createdby = (Long)attributes.get("createdby");

		if (createdby != null) {
			setCreatedby(createdby);
		}

		String modifiedby = (String)attributes.get("modifiedby");

		if (modifiedby != null) {
			setModifiedby(modifiedby);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String lastName = (String)attributes.get("lastName");

		if (lastName != null) {
			setLastName(lastName);
		}

		String branchName = (String)attributes.get("branchName");

		if (branchName != null) {
			setBranchName(branchName);
		}

		String payrollNo = (String)attributes.get("payrollNo");

		if (payrollNo != null) {
			setPayrollNo(payrollNo);
		}

		String terminationReason = (String)attributes.get("terminationReason");

		if (terminationReason != null) {
			setTerminationReason(terminationReason);
		}

		String terminationCode = (String)attributes.get("terminationCode");

		if (terminationCode != null) {
			setTerminationCode(terminationCode);
		}

		String formerBranch = (String)attributes.get("formerBranch");

		if (formerBranch != null) {
			setFormerBranch(formerBranch);
		}
	}

	@Override
	public Object clone() {
		return new ReinstatementWrapper((Reinstatement)_reinstatement.clone());
	}

	@Override
	public int compareTo(ke.co.tamarix.model.Reinstatement reinstatement) {
		return _reinstatement.compareTo(reinstatement);
	}

	/**
	 * Returns the branch name of this reinstatement.
	 *
	 * @return the branch name of this reinstatement
	 */
	@Override
	public String getBranchName() {
		return _reinstatement.getBranchName();
	}

	/**
	 * Returns the company ID of this reinstatement.
	 *
	 * @return the company ID of this reinstatement
	 */
	@Override
	public long getCompanyId() {
		return _reinstatement.getCompanyId();
	}

	/**
	 * Returns the create date of this reinstatement.
	 *
	 * @return the create date of this reinstatement
	 */
	@Override
	public Date getCreateDate() {
		return _reinstatement.getCreateDate();
	}

	/**
	 * Returns the createdby of this reinstatement.
	 *
	 * @return the createdby of this reinstatement
	 */
	@Override
	public long getCreatedby() {
		return _reinstatement.getCreatedby();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _reinstatement.getExpandoBridge();
	}

	/**
	 * Returns the first name of this reinstatement.
	 *
	 * @return the first name of this reinstatement
	 */
	@Override
	public String getFirstName() {
		return _reinstatement.getFirstName();
	}

	/**
	 * Returns the former branch of this reinstatement.
	 *
	 * @return the former branch of this reinstatement
	 */
	@Override
	public String getFormerBranch() {
		return _reinstatement.getFormerBranch();
	}

	/**
	 * Returns the group ID of this reinstatement.
	 *
	 * @return the group ID of this reinstatement
	 */
	@Override
	public long getGroupId() {
		return _reinstatement.getGroupId();
	}

	/**
	 * Returns the last name of this reinstatement.
	 *
	 * @return the last name of this reinstatement
	 */
	@Override
	public String getLastName() {
		return _reinstatement.getLastName();
	}

	/**
	 * Returns the modifiedby of this reinstatement.
	 *
	 * @return the modifiedby of this reinstatement
	 */
	@Override
	public String getModifiedby() {
		return _reinstatement.getModifiedby();
	}

	/**
	 * Returns the modified date of this reinstatement.
	 *
	 * @return the modified date of this reinstatement
	 */
	@Override
	public Date getModifiedDate() {
		return _reinstatement.getModifiedDate();
	}

	/**
	 * Returns the payroll no of this reinstatement.
	 *
	 * @return the payroll no of this reinstatement
	 */
	@Override
	public String getPayrollNo() {
		return _reinstatement.getPayrollNo();
	}

	/**
	 * Returns the primary key of this reinstatement.
	 *
	 * @return the primary key of this reinstatement
	 */
	@Override
	public long getPrimaryKey() {
		return _reinstatement.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _reinstatement.getPrimaryKeyObj();
	}

	/**
	 * Returns the reinstatement ID of this reinstatement.
	 *
	 * @return the reinstatement ID of this reinstatement
	 */
	@Override
	public long getReinstatementId() {
		return _reinstatement.getReinstatementId();
	}

	/**
	 * Returns the termination code of this reinstatement.
	 *
	 * @return the termination code of this reinstatement
	 */
	@Override
	public String getTerminationCode() {
		return _reinstatement.getTerminationCode();
	}

	/**
	 * Returns the termination reason of this reinstatement.
	 *
	 * @return the termination reason of this reinstatement
	 */
	@Override
	public String getTerminationReason() {
		return _reinstatement.getTerminationReason();
	}

	/**
	 * Returns the uuid of this reinstatement.
	 *
	 * @return the uuid of this reinstatement
	 */
	@Override
	public String getUuid() {
		return _reinstatement.getUuid();
	}

	@Override
	public int hashCode() {
		return _reinstatement.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _reinstatement.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _reinstatement.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _reinstatement.isNew();
	}

	@Override
	public void persist() {
		_reinstatement.persist();
	}

	/**
	 * Sets the branch name of this reinstatement.
	 *
	 * @param branchName the branch name of this reinstatement
	 */
	@Override
	public void setBranchName(String branchName) {
		_reinstatement.setBranchName(branchName);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_reinstatement.setCachedModel(cachedModel);
	}

	/**
	 * Sets the company ID of this reinstatement.
	 *
	 * @param companyId the company ID of this reinstatement
	 */
	@Override
	public void setCompanyId(long companyId) {
		_reinstatement.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this reinstatement.
	 *
	 * @param createDate the create date of this reinstatement
	 */
	@Override
	public void setCreateDate(Date createDate) {
		_reinstatement.setCreateDate(createDate);
	}

	/**
	 * Sets the createdby of this reinstatement.
	 *
	 * @param createdby the createdby of this reinstatement
	 */
	@Override
	public void setCreatedby(long createdby) {
		_reinstatement.setCreatedby(createdby);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {

		_reinstatement.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_reinstatement.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_reinstatement.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	 * Sets the first name of this reinstatement.
	 *
	 * @param firstName the first name of this reinstatement
	 */
	@Override
	public void setFirstName(String firstName) {
		_reinstatement.setFirstName(firstName);
	}

	/**
	 * Sets the former branch of this reinstatement.
	 *
	 * @param formerBranch the former branch of this reinstatement
	 */
	@Override
	public void setFormerBranch(String formerBranch) {
		_reinstatement.setFormerBranch(formerBranch);
	}

	/**
	 * Sets the group ID of this reinstatement.
	 *
	 * @param groupId the group ID of this reinstatement
	 */
	@Override
	public void setGroupId(long groupId) {
		_reinstatement.setGroupId(groupId);
	}

	/**
	 * Sets the last name of this reinstatement.
	 *
	 * @param lastName the last name of this reinstatement
	 */
	@Override
	public void setLastName(String lastName) {
		_reinstatement.setLastName(lastName);
	}

	/**
	 * Sets the modifiedby of this reinstatement.
	 *
	 * @param modifiedby the modifiedby of this reinstatement
	 */
	@Override
	public void setModifiedby(String modifiedby) {
		_reinstatement.setModifiedby(modifiedby);
	}

	/**
	 * Sets the modified date of this reinstatement.
	 *
	 * @param modifiedDate the modified date of this reinstatement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		_reinstatement.setModifiedDate(modifiedDate);
	}

	@Override
	public void setNew(boolean n) {
		_reinstatement.setNew(n);
	}

	/**
	 * Sets the payroll no of this reinstatement.
	 *
	 * @param payrollNo the payroll no of this reinstatement
	 */
	@Override
	public void setPayrollNo(String payrollNo) {
		_reinstatement.setPayrollNo(payrollNo);
	}

	/**
	 * Sets the primary key of this reinstatement.
	 *
	 * @param primaryKey the primary key of this reinstatement
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		_reinstatement.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_reinstatement.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	 * Sets the reinstatement ID of this reinstatement.
	 *
	 * @param reinstatementId the reinstatement ID of this reinstatement
	 */
	@Override
	public void setReinstatementId(long reinstatementId) {
		_reinstatement.setReinstatementId(reinstatementId);
	}

	/**
	 * Sets the termination code of this reinstatement.
	 *
	 * @param terminationCode the termination code of this reinstatement
	 */
	@Override
	public void setTerminationCode(String terminationCode) {
		_reinstatement.setTerminationCode(terminationCode);
	}

	/**
	 * Sets the termination reason of this reinstatement.
	 *
	 * @param terminationReason the termination reason of this reinstatement
	 */
	@Override
	public void setTerminationReason(String terminationReason) {
		_reinstatement.setTerminationReason(terminationReason);
	}

	/**
	 * Sets the uuid of this reinstatement.
	 *
	 * @param uuid the uuid of this reinstatement
	 */
	@Override
	public void setUuid(String uuid) {
		_reinstatement.setUuid(uuid);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel
		<ke.co.tamarix.model.Reinstatement> toCacheModel() {

		return _reinstatement.toCacheModel();
	}

	@Override
	public ke.co.tamarix.model.Reinstatement toEscapedModel() {
		return new ReinstatementWrapper(_reinstatement.toEscapedModel());
	}

	@Override
	public String toString() {
		return _reinstatement.toString();
	}

	@Override
	public ke.co.tamarix.model.Reinstatement toUnescapedModel() {
		return new ReinstatementWrapper(_reinstatement.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _reinstatement.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ReinstatementWrapper)) {
			return false;
		}

		ReinstatementWrapper reinstatementWrapper = (ReinstatementWrapper)obj;

		if (Objects.equals(
				_reinstatement, reinstatementWrapper._reinstatement)) {

			return true;
		}

		return false;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return _reinstatement.getStagedModelType();
	}

	@Override
	public Reinstatement getWrappedModel() {
		return _reinstatement;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _reinstatement.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _reinstatement.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_reinstatement.resetOriginalValues();
	}

	private final Reinstatement _reinstatement;

}