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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link ke.co.tamarix.service.http.ReinstatementServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReinstatementSoap implements Serializable {

	public static ReinstatementSoap toSoapModel(Reinstatement model) {
		ReinstatementSoap soapModel = new ReinstatementSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setReinstatementId(model.getReinstatementId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setCreatedby(model.getCreatedby());
		soapModel.setModifiedby(model.getModifiedby());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setFirstName(model.getFirstName());
		soapModel.setLastName(model.getLastName());
		soapModel.setBranchName(model.getBranchName());
		soapModel.setPayrollNo(model.getPayrollNo());
		soapModel.setTerminationReason(model.getTerminationReason());
		soapModel.setTerminationCode(model.getTerminationCode());
		soapModel.setFormerBranch(model.getFormerBranch());

		return soapModel;
	}

	public static ReinstatementSoap[] toSoapModels(Reinstatement[] models) {
		ReinstatementSoap[] soapModels = new ReinstatementSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static ReinstatementSoap[][] toSoapModels(Reinstatement[][] models) {
		ReinstatementSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new ReinstatementSoap[models.length][models[0].length];
		}
		else {
			soapModels = new ReinstatementSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static ReinstatementSoap[] toSoapModels(List<Reinstatement> models) {
		List<ReinstatementSoap> soapModels = new ArrayList<ReinstatementSoap>(
			models.size());

		for (Reinstatement model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new ReinstatementSoap[soapModels.size()]);
	}

	public ReinstatementSoap() {
	}

	public long getPrimaryKey() {
		return _reinstatementId;
	}

	public void setPrimaryKey(long pk) {
		setReinstatementId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getReinstatementId() {
		return _reinstatementId;
	}

	public void setReinstatementId(long reinstatementId) {
		_reinstatementId = reinstatementId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getCreatedby() {
		return _createdby;
	}

	public void setCreatedby(long createdby) {
		_createdby = createdby;
	}

	public String getModifiedby() {
		return _modifiedby;
	}

	public void setModifiedby(String modifiedby) {
		_modifiedby = modifiedby;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public String getFirstName() {
		return _firstName;
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		return _lastName;
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getBranchName() {
		return _branchName;
	}

	public void setBranchName(String branchName) {
		_branchName = branchName;
	}

	public String getPayrollNo() {
		return _payrollNo;
	}

	public void setPayrollNo(String payrollNo) {
		_payrollNo = payrollNo;
	}

	public String getTerminationReason() {
		return _terminationReason;
	}

	public void setTerminationReason(String terminationReason) {
		_terminationReason = terminationReason;
	}

	public String getTerminationCode() {
		return _terminationCode;
	}

	public void setTerminationCode(String terminationCode) {
		_terminationCode = terminationCode;
	}

	public String getFormerBranch() {
		return _formerBranch;
	}

	public void setFormerBranch(String formerBranch) {
		_formerBranch = formerBranch;
	}

	private String _uuid;
	private long _reinstatementId;
	private long _groupId;
	private long _companyId;
	private long _createdby;
	private String _modifiedby;
	private Date _createDate;
	private Date _modifiedDate;
	private String _firstName;
	private String _lastName;
	private String _branchName;
	private String _payrollNo;
	private String _terminationReason;
	private String _terminationCode;
	private String _formerBranch;

}