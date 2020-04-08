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
		attributes.put("contractId", getContractId());
		attributes.put("entityId", getEntityId());
		attributes.put("approvalDate", getApprovalDate());
		attributes.put("comments", getComments());
		attributes.put("approverContractNumber", getApproverContractNumber());
		attributes.put("agentVerdict", getAgentVerdict());
		attributes.put("agentAction", getAgentAction());
		attributes.put("processedFlag", getProcessedFlag());
		attributes.put("errorReason", getErrorReason());
		attributes.put("assignmentStatus", getAssignmentStatus());
		attributes.put("capacity", getCapacity());
		attributes.put("positionId", getPositionId());
		attributes.put("orgId", getOrgId());
		attributes.put("historyStartDate", getHistoryStartDate());
		attributes.put("oldOrgId", getOldOrgId());
		attributes.put("oldPositionId", getOldPositionId());
		attributes.put(
			"contractEffectiveEndDate", getContractEffectiveEndDate());
		attributes.put("applicationTye", getApplicationTye());
		attributes.put("applicationCategory", getApplicationCategory());

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

		String contractId = (String)attributes.get("contractId");

		if (contractId != null) {
			setContractId(contractId);
		}

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String approvalDate = (String)attributes.get("approvalDate");

		if (approvalDate != null) {
			setApprovalDate(approvalDate);
		}

		String comments = (String)attributes.get("comments");

		if (comments != null) {
			setComments(comments);
		}

		String approverContractNumber = (String)attributes.get(
			"approverContractNumber");

		if (approverContractNumber != null) {
			setApproverContractNumber(approverContractNumber);
		}

		String agentVerdict = (String)attributes.get("agentVerdict");

		if (agentVerdict != null) {
			setAgentVerdict(agentVerdict);
		}

		String agentAction = (String)attributes.get("agentAction");

		if (agentAction != null) {
			setAgentAction(agentAction);
		}

		String processedFlag = (String)attributes.get("processedFlag");

		if (processedFlag != null) {
			setProcessedFlag(processedFlag);
		}

		String errorReason = (String)attributes.get("errorReason");

		if (errorReason != null) {
			setErrorReason(errorReason);
		}

		String assignmentStatus = (String)attributes.get("assignmentStatus");

		if (assignmentStatus != null) {
			setAssignmentStatus(assignmentStatus);
		}

		String capacity = (String)attributes.get("capacity");

		if (capacity != null) {
			setCapacity(capacity);
		}

		String positionId = (String)attributes.get("positionId");

		if (positionId != null) {
			setPositionId(positionId);
		}

		String orgId = (String)attributes.get("orgId");

		if (orgId != null) {
			setOrgId(orgId);
		}

		String historyStartDate = (String)attributes.get("historyStartDate");

		if (historyStartDate != null) {
			setHistoryStartDate(historyStartDate);
		}

		String oldOrgId = (String)attributes.get("oldOrgId");

		if (oldOrgId != null) {
			setOldOrgId(oldOrgId);
		}

		String oldPositionId = (String)attributes.get("oldPositionId");

		if (oldPositionId != null) {
			setOldPositionId(oldPositionId);
		}

		String contractEffectiveEndDate = (String)attributes.get(
			"contractEffectiveEndDate");

		if (contractEffectiveEndDate != null) {
			setContractEffectiveEndDate(contractEffectiveEndDate);
		}

		String applicationTye = (String)attributes.get("applicationTye");

		if (applicationTye != null) {
			setApplicationTye(applicationTye);
		}

		String applicationCategory = (String)attributes.get(
			"applicationCategory");

		if (applicationCategory != null) {
			setApplicationCategory(applicationCategory);
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
	 * Returns the agent action of this reinstatement.
	 *
	 * @return the agent action of this reinstatement
	 */
	@Override
	public String getAgentAction() {
		return _reinstatement.getAgentAction();
	}

	/**
	 * Returns the agent verdict of this reinstatement.
	 *
	 * @return the agent verdict of this reinstatement
	 */
	@Override
	public String getAgentVerdict() {
		return _reinstatement.getAgentVerdict();
	}

	/**
	 * Returns the application category of this reinstatement.
	 *
	 * @return the application category of this reinstatement
	 */
	@Override
	public String getApplicationCategory() {
		return _reinstatement.getApplicationCategory();
	}

	/**
	 * Returns the application tye of this reinstatement.
	 *
	 * @return the application tye of this reinstatement
	 */
	@Override
	public String getApplicationTye() {
		return _reinstatement.getApplicationTye();
	}

	/**
	 * Returns the approval date of this reinstatement.
	 *
	 * @return the approval date of this reinstatement
	 */
	@Override
	public String getApprovalDate() {
		return _reinstatement.getApprovalDate();
	}

	/**
	 * Returns the approver contract number of this reinstatement.
	 *
	 * @return the approver contract number of this reinstatement
	 */
	@Override
	public String getApproverContractNumber() {
		return _reinstatement.getApproverContractNumber();
	}

	/**
	 * Returns the assignment status of this reinstatement.
	 *
	 * @return the assignment status of this reinstatement
	 */
	@Override
	public String getAssignmentStatus() {
		return _reinstatement.getAssignmentStatus();
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
	 * Returns the capacity of this reinstatement.
	 *
	 * @return the capacity of this reinstatement
	 */
	@Override
	public String getCapacity() {
		return _reinstatement.getCapacity();
	}

	/**
	 * Returns the comments of this reinstatement.
	 *
	 * @return the comments of this reinstatement
	 */
	@Override
	public String getComments() {
		return _reinstatement.getComments();
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
	 * Returns the contract effective end date of this reinstatement.
	 *
	 * @return the contract effective end date of this reinstatement
	 */
	@Override
	public String getContractEffectiveEndDate() {
		return _reinstatement.getContractEffectiveEndDate();
	}

	/**
	 * Returns the contract ID of this reinstatement.
	 *
	 * @return the contract ID of this reinstatement
	 */
	@Override
	public String getContractId() {
		return _reinstatement.getContractId();
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

	/**
	 * Returns the entity ID of this reinstatement.
	 *
	 * @return the entity ID of this reinstatement
	 */
	@Override
	public String getEntityId() {
		return _reinstatement.getEntityId();
	}

	/**
	 * Returns the error reason of this reinstatement.
	 *
	 * @return the error reason of this reinstatement
	 */
	@Override
	public String getErrorReason() {
		return _reinstatement.getErrorReason();
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
	 * Returns the history start date of this reinstatement.
	 *
	 * @return the history start date of this reinstatement
	 */
	@Override
	public String getHistoryStartDate() {
		return _reinstatement.getHistoryStartDate();
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
	 * Returns the old org ID of this reinstatement.
	 *
	 * @return the old org ID of this reinstatement
	 */
	@Override
	public String getOldOrgId() {
		return _reinstatement.getOldOrgId();
	}

	/**
	 * Returns the old position ID of this reinstatement.
	 *
	 * @return the old position ID of this reinstatement
	 */
	@Override
	public String getOldPositionId() {
		return _reinstatement.getOldPositionId();
	}

	/**
	 * Returns the org ID of this reinstatement.
	 *
	 * @return the org ID of this reinstatement
	 */
	@Override
	public String getOrgId() {
		return _reinstatement.getOrgId();
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
	 * Returns the position ID of this reinstatement.
	 *
	 * @return the position ID of this reinstatement
	 */
	@Override
	public String getPositionId() {
		return _reinstatement.getPositionId();
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
	 * Returns the processed flag of this reinstatement.
	 *
	 * @return the processed flag of this reinstatement
	 */
	@Override
	public String getProcessedFlag() {
		return _reinstatement.getProcessedFlag();
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
	 * Sets the agent action of this reinstatement.
	 *
	 * @param agentAction the agent action of this reinstatement
	 */
	@Override
	public void setAgentAction(String agentAction) {
		_reinstatement.setAgentAction(agentAction);
	}

	/**
	 * Sets the agent verdict of this reinstatement.
	 *
	 * @param agentVerdict the agent verdict of this reinstatement
	 */
	@Override
	public void setAgentVerdict(String agentVerdict) {
		_reinstatement.setAgentVerdict(agentVerdict);
	}

	/**
	 * Sets the application category of this reinstatement.
	 *
	 * @param applicationCategory the application category of this reinstatement
	 */
	@Override
	public void setApplicationCategory(String applicationCategory) {
		_reinstatement.setApplicationCategory(applicationCategory);
	}

	/**
	 * Sets the application tye of this reinstatement.
	 *
	 * @param applicationTye the application tye of this reinstatement
	 */
	@Override
	public void setApplicationTye(String applicationTye) {
		_reinstatement.setApplicationTye(applicationTye);
	}

	/**
	 * Sets the approval date of this reinstatement.
	 *
	 * @param approvalDate the approval date of this reinstatement
	 */
	@Override
	public void setApprovalDate(String approvalDate) {
		_reinstatement.setApprovalDate(approvalDate);
	}

	/**
	 * Sets the approver contract number of this reinstatement.
	 *
	 * @param approverContractNumber the approver contract number of this reinstatement
	 */
	@Override
	public void setApproverContractNumber(String approverContractNumber) {
		_reinstatement.setApproverContractNumber(approverContractNumber);
	}

	/**
	 * Sets the assignment status of this reinstatement.
	 *
	 * @param assignmentStatus the assignment status of this reinstatement
	 */
	@Override
	public void setAssignmentStatus(String assignmentStatus) {
		_reinstatement.setAssignmentStatus(assignmentStatus);
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
	 * Sets the capacity of this reinstatement.
	 *
	 * @param capacity the capacity of this reinstatement
	 */
	@Override
	public void setCapacity(String capacity) {
		_reinstatement.setCapacity(capacity);
	}

	/**
	 * Sets the comments of this reinstatement.
	 *
	 * @param comments the comments of this reinstatement
	 */
	@Override
	public void setComments(String comments) {
		_reinstatement.setComments(comments);
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
	 * Sets the contract effective end date of this reinstatement.
	 *
	 * @param contractEffectiveEndDate the contract effective end date of this reinstatement
	 */
	@Override
	public void setContractEffectiveEndDate(String contractEffectiveEndDate) {
		_reinstatement.setContractEffectiveEndDate(contractEffectiveEndDate);
	}

	/**
	 * Sets the contract ID of this reinstatement.
	 *
	 * @param contractId the contract ID of this reinstatement
	 */
	@Override
	public void setContractId(String contractId) {
		_reinstatement.setContractId(contractId);
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

	/**
	 * Sets the entity ID of this reinstatement.
	 *
	 * @param entityId the entity ID of this reinstatement
	 */
	@Override
	public void setEntityId(String entityId) {
		_reinstatement.setEntityId(entityId);
	}

	/**
	 * Sets the error reason of this reinstatement.
	 *
	 * @param errorReason the error reason of this reinstatement
	 */
	@Override
	public void setErrorReason(String errorReason) {
		_reinstatement.setErrorReason(errorReason);
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
	 * Sets the history start date of this reinstatement.
	 *
	 * @param historyStartDate the history start date of this reinstatement
	 */
	@Override
	public void setHistoryStartDate(String historyStartDate) {
		_reinstatement.setHistoryStartDate(historyStartDate);
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
	 * Sets the old org ID of this reinstatement.
	 *
	 * @param oldOrgId the old org ID of this reinstatement
	 */
	@Override
	public void setOldOrgId(String oldOrgId) {
		_reinstatement.setOldOrgId(oldOrgId);
	}

	/**
	 * Sets the old position ID of this reinstatement.
	 *
	 * @param oldPositionId the old position ID of this reinstatement
	 */
	@Override
	public void setOldPositionId(String oldPositionId) {
		_reinstatement.setOldPositionId(oldPositionId);
	}

	/**
	 * Sets the org ID of this reinstatement.
	 *
	 * @param orgId the org ID of this reinstatement
	 */
	@Override
	public void setOrgId(String orgId) {
		_reinstatement.setOrgId(orgId);
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
	 * Sets the position ID of this reinstatement.
	 *
	 * @param positionId the position ID of this reinstatement
	 */
	@Override
	public void setPositionId(String positionId) {
		_reinstatement.setPositionId(positionId);
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
	 * Sets the processed flag of this reinstatement.
	 *
	 * @param processedFlag the processed flag of this reinstatement
	 */
	@Override
	public void setProcessedFlag(String processedFlag) {
		_reinstatement.setProcessedFlag(processedFlag);
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