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

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Reinstatement service. Represents a row in the &quot;Reinstatement_Reinstatement&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>ke.co.tamarix.model.impl.ReinstatementModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>ke.co.tamarix.model.impl.ReinstatementImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Reinstatement
 * @generated
 */
@ProviderType
public interface ReinstatementModel
	extends BaseModel<Reinstatement>, ShardedModel, StagedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a reinstatement model instance should use the {@link Reinstatement} interface instead.
	 */

	/**
	 * Returns the primary key of this reinstatement.
	 *
	 * @return the primary key of this reinstatement
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this reinstatement.
	 *
	 * @param primaryKey the primary key of this reinstatement
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this reinstatement.
	 *
	 * @return the uuid of this reinstatement
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this reinstatement.
	 *
	 * @param uuid the uuid of this reinstatement
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the reinstatement ID of this reinstatement.
	 *
	 * @return the reinstatement ID of this reinstatement
	 */
	public long getReinstatementId();

	/**
	 * Sets the reinstatement ID of this reinstatement.
	 *
	 * @param reinstatementId the reinstatement ID of this reinstatement
	 */
	public void setReinstatementId(long reinstatementId);

	/**
	 * Returns the group ID of this reinstatement.
	 *
	 * @return the group ID of this reinstatement
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this reinstatement.
	 *
	 * @param groupId the group ID of this reinstatement
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this reinstatement.
	 *
	 * @return the company ID of this reinstatement
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this reinstatement.
	 *
	 * @param companyId the company ID of this reinstatement
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the createdby of this reinstatement.
	 *
	 * @return the createdby of this reinstatement
	 */
	public long getCreatedby();

	/**
	 * Sets the createdby of this reinstatement.
	 *
	 * @param createdby the createdby of this reinstatement
	 */
	public void setCreatedby(long createdby);

	/**
	 * Returns the modifiedby of this reinstatement.
	 *
	 * @return the modifiedby of this reinstatement
	 */
	@AutoEscape
	public String getModifiedby();

	/**
	 * Sets the modifiedby of this reinstatement.
	 *
	 * @param modifiedby the modifiedby of this reinstatement
	 */
	public void setModifiedby(String modifiedby);

	/**
	 * Returns the create date of this reinstatement.
	 *
	 * @return the create date of this reinstatement
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this reinstatement.
	 *
	 * @param createDate the create date of this reinstatement
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this reinstatement.
	 *
	 * @return the modified date of this reinstatement
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this reinstatement.
	 *
	 * @param modifiedDate the modified date of this reinstatement
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the first name of this reinstatement.
	 *
	 * @return the first name of this reinstatement
	 */
	@AutoEscape
	public String getFirstName();

	/**
	 * Sets the first name of this reinstatement.
	 *
	 * @param firstName the first name of this reinstatement
	 */
	public void setFirstName(String firstName);

	/**
	 * Returns the last name of this reinstatement.
	 *
	 * @return the last name of this reinstatement
	 */
	@AutoEscape
	public String getLastName();

	/**
	 * Sets the last name of this reinstatement.
	 *
	 * @param lastName the last name of this reinstatement
	 */
	public void setLastName(String lastName);

	/**
	 * Returns the branch name of this reinstatement.
	 *
	 * @return the branch name of this reinstatement
	 */
	@AutoEscape
	public String getBranchName();

	/**
	 * Sets the branch name of this reinstatement.
	 *
	 * @param branchName the branch name of this reinstatement
	 */
	public void setBranchName(String branchName);

	/**
	 * Returns the payroll no of this reinstatement.
	 *
	 * @return the payroll no of this reinstatement
	 */
	@AutoEscape
	public String getPayrollNo();

	/**
	 * Sets the payroll no of this reinstatement.
	 *
	 * @param payrollNo the payroll no of this reinstatement
	 */
	public void setPayrollNo(String payrollNo);

	/**
	 * Returns the termination reason of this reinstatement.
	 *
	 * @return the termination reason of this reinstatement
	 */
	@AutoEscape
	public String getTerminationReason();

	/**
	 * Sets the termination reason of this reinstatement.
	 *
	 * @param terminationReason the termination reason of this reinstatement
	 */
	public void setTerminationReason(String terminationReason);

	/**
	 * Returns the termination code of this reinstatement.
	 *
	 * @return the termination code of this reinstatement
	 */
	@AutoEscape
	public String getTerminationCode();

	/**
	 * Sets the termination code of this reinstatement.
	 *
	 * @param terminationCode the termination code of this reinstatement
	 */
	public void setTerminationCode(String terminationCode);

	/**
	 * Returns the former branch of this reinstatement.
	 *
	 * @return the former branch of this reinstatement
	 */
	@AutoEscape
	public String getFormerBranch();

	/**
	 * Sets the former branch of this reinstatement.
	 *
	 * @param formerBranch the former branch of this reinstatement
	 */
	public void setFormerBranch(String formerBranch);

	/**
	 * Returns the contract ID of this reinstatement.
	 *
	 * @return the contract ID of this reinstatement
	 */
	@AutoEscape
	public String getContractId();

	/**
	 * Sets the contract ID of this reinstatement.
	 *
	 * @param contractId the contract ID of this reinstatement
	 */
	public void setContractId(String contractId);

	/**
	 * Returns the entity ID of this reinstatement.
	 *
	 * @return the entity ID of this reinstatement
	 */
	@AutoEscape
	public String getEntityId();

	/**
	 * Sets the entity ID of this reinstatement.
	 *
	 * @param entityId the entity ID of this reinstatement
	 */
	public void setEntityId(String entityId);

	/**
	 * Returns the approval date of this reinstatement.
	 *
	 * @return the approval date of this reinstatement
	 */
	@AutoEscape
	public String getApprovalDate();

	/**
	 * Sets the approval date of this reinstatement.
	 *
	 * @param approvalDate the approval date of this reinstatement
	 */
	public void setApprovalDate(String approvalDate);

	/**
	 * Returns the comments of this reinstatement.
	 *
	 * @return the comments of this reinstatement
	 */
	@AutoEscape
	public String getComments();

	/**
	 * Sets the comments of this reinstatement.
	 *
	 * @param comments the comments of this reinstatement
	 */
	public void setComments(String comments);

	/**
	 * Returns the approver contract number of this reinstatement.
	 *
	 * @return the approver contract number of this reinstatement
	 */
	@AutoEscape
	public String getApproverContractNumber();

	/**
	 * Sets the approver contract number of this reinstatement.
	 *
	 * @param approverContractNumber the approver contract number of this reinstatement
	 */
	public void setApproverContractNumber(String approverContractNumber);

	/**
	 * Returns the agent verdict of this reinstatement.
	 *
	 * @return the agent verdict of this reinstatement
	 */
	@AutoEscape
	public String getAgentVerdict();

	/**
	 * Sets the agent verdict of this reinstatement.
	 *
	 * @param agentVerdict the agent verdict of this reinstatement
	 */
	public void setAgentVerdict(String agentVerdict);

	/**
	 * Returns the agent action of this reinstatement.
	 *
	 * @return the agent action of this reinstatement
	 */
	@AutoEscape
	public String getAgentAction();

	/**
	 * Sets the agent action of this reinstatement.
	 *
	 * @param agentAction the agent action of this reinstatement
	 */
	public void setAgentAction(String agentAction);

	/**
	 * Returns the processed flag of this reinstatement.
	 *
	 * @return the processed flag of this reinstatement
	 */
	@AutoEscape
	public String getProcessedFlag();

	/**
	 * Sets the processed flag of this reinstatement.
	 *
	 * @param processedFlag the processed flag of this reinstatement
	 */
	public void setProcessedFlag(String processedFlag);

	/**
	 * Returns the error reason of this reinstatement.
	 *
	 * @return the error reason of this reinstatement
	 */
	@AutoEscape
	public String getErrorReason();

	/**
	 * Sets the error reason of this reinstatement.
	 *
	 * @param errorReason the error reason of this reinstatement
	 */
	public void setErrorReason(String errorReason);

	/**
	 * Returns the assignment status of this reinstatement.
	 *
	 * @return the assignment status of this reinstatement
	 */
	@AutoEscape
	public String getAssignmentStatus();

	/**
	 * Sets the assignment status of this reinstatement.
	 *
	 * @param assignmentStatus the assignment status of this reinstatement
	 */
	public void setAssignmentStatus(String assignmentStatus);

	/**
	 * Returns the capacity of this reinstatement.
	 *
	 * @return the capacity of this reinstatement
	 */
	@AutoEscape
	public String getCapacity();

	/**
	 * Sets the capacity of this reinstatement.
	 *
	 * @param capacity the capacity of this reinstatement
	 */
	public void setCapacity(String capacity);

	/**
	 * Returns the position ID of this reinstatement.
	 *
	 * @return the position ID of this reinstatement
	 */
	@AutoEscape
	public String getPositionId();

	/**
	 * Sets the position ID of this reinstatement.
	 *
	 * @param positionId the position ID of this reinstatement
	 */
	public void setPositionId(String positionId);

	/**
	 * Returns the org ID of this reinstatement.
	 *
	 * @return the org ID of this reinstatement
	 */
	@AutoEscape
	public String getOrgId();

	/**
	 * Sets the org ID of this reinstatement.
	 *
	 * @param orgId the org ID of this reinstatement
	 */
	public void setOrgId(String orgId);

	/**
	 * Returns the history start date of this reinstatement.
	 *
	 * @return the history start date of this reinstatement
	 */
	@AutoEscape
	public String getHistoryStartDate();

	/**
	 * Sets the history start date of this reinstatement.
	 *
	 * @param historyStartDate the history start date of this reinstatement
	 */
	public void setHistoryStartDate(String historyStartDate);

	/**
	 * Returns the old org ID of this reinstatement.
	 *
	 * @return the old org ID of this reinstatement
	 */
	@AutoEscape
	public String getOldOrgId();

	/**
	 * Sets the old org ID of this reinstatement.
	 *
	 * @param oldOrgId the old org ID of this reinstatement
	 */
	public void setOldOrgId(String oldOrgId);

	/**
	 * Returns the old position ID of this reinstatement.
	 *
	 * @return the old position ID of this reinstatement
	 */
	@AutoEscape
	public String getOldPositionId();

	/**
	 * Sets the old position ID of this reinstatement.
	 *
	 * @param oldPositionId the old position ID of this reinstatement
	 */
	public void setOldPositionId(String oldPositionId);

	/**
	 * Returns the contract effective end date of this reinstatement.
	 *
	 * @return the contract effective end date of this reinstatement
	 */
	@AutoEscape
	public String getContractEffectiveEndDate();

	/**
	 * Sets the contract effective end date of this reinstatement.
	 *
	 * @param contractEffectiveEndDate the contract effective end date of this reinstatement
	 */
	public void setContractEffectiveEndDate(String contractEffectiveEndDate);

	/**
	 * Returns the application tye of this reinstatement.
	 *
	 * @return the application tye of this reinstatement
	 */
	@AutoEscape
	public String getApplicationTye();

	/**
	 * Sets the application tye of this reinstatement.
	 *
	 * @param applicationTye the application tye of this reinstatement
	 */
	public void setApplicationTye(String applicationTye);

	/**
	 * Returns the application category of this reinstatement.
	 *
	 * @return the application category of this reinstatement
	 */
	@AutoEscape
	public String getApplicationCategory();

	/**
	 * Sets the application category of this reinstatement.
	 *
	 * @param applicationCategory the application category of this reinstatement
	 */
	public void setApplicationCategory(String applicationCategory);

	/**
	 * Returns the firstapprover of this reinstatement.
	 *
	 * @return the firstapprover of this reinstatement
	 */
	@AutoEscape
	public String getFirstapprover();

	/**
	 * Sets the firstapprover of this reinstatement.
	 *
	 * @param firstapprover the firstapprover of this reinstatement
	 */
	public void setFirstapprover(String firstapprover);

	/**
	 * Returns the secondapprover of this reinstatement.
	 *
	 * @return the secondapprover of this reinstatement
	 */
	@AutoEscape
	public String getSecondapprover();

	/**
	 * Sets the secondapprover of this reinstatement.
	 *
	 * @param secondapprover the secondapprover of this reinstatement
	 */
	public void setSecondapprover(String secondapprover);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(ke.co.tamarix.model.Reinstatement reinstatement);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ke.co.tamarix.model.Reinstatement> toCacheModel();

	@Override
	public ke.co.tamarix.model.Reinstatement toEscapedModel();

	@Override
	public ke.co.tamarix.model.Reinstatement toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();

}