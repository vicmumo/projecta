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

import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.util.HashUtil;
import com.liferay.portal.kernel.util.StringBundler;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

import ke.co.tamarix.model.Reinstatement;

/**
 * The cache model class for representing Reinstatement in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class ReinstatementCacheModel
	implements CacheModel<Reinstatement>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof ReinstatementCacheModel)) {
			return false;
		}

		ReinstatementCacheModel reinstatementCacheModel =
			(ReinstatementCacheModel)obj;

		if (reinstatementId == reinstatementCacheModel.reinstatementId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, reinstatementId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", reinstatementId=");
		sb.append(reinstatementId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", createdby=");
		sb.append(createdby);
		sb.append(", modifiedby=");
		sb.append(modifiedby);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", firstName=");
		sb.append(firstName);
		sb.append(", lastName=");
		sb.append(lastName);
		sb.append(", branchName=");
		sb.append(branchName);
		sb.append(", payrollNo=");
		sb.append(payrollNo);
		sb.append(", terminationReason=");
		sb.append(terminationReason);
		sb.append(", terminationCode=");
		sb.append(terminationCode);
		sb.append(", formerBranch=");
		sb.append(formerBranch);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Reinstatement toEntityModel() {
		ReinstatementImpl reinstatementImpl = new ReinstatementImpl();

		if (uuid == null) {
			reinstatementImpl.setUuid("");
		}
		else {
			reinstatementImpl.setUuid(uuid);
		}

		reinstatementImpl.setReinstatementId(reinstatementId);
		reinstatementImpl.setGroupId(groupId);
		reinstatementImpl.setCompanyId(companyId);
		reinstatementImpl.setCreatedby(createdby);

		if (modifiedby == null) {
			reinstatementImpl.setModifiedby("");
		}
		else {
			reinstatementImpl.setModifiedby(modifiedby);
		}

		if (createDate == Long.MIN_VALUE) {
			reinstatementImpl.setCreateDate(null);
		}
		else {
			reinstatementImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			reinstatementImpl.setModifiedDate(null);
		}
		else {
			reinstatementImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (firstName == null) {
			reinstatementImpl.setFirstName("");
		}
		else {
			reinstatementImpl.setFirstName(firstName);
		}

		if (lastName == null) {
			reinstatementImpl.setLastName("");
		}
		else {
			reinstatementImpl.setLastName(lastName);
		}

		if (branchName == null) {
			reinstatementImpl.setBranchName("");
		}
		else {
			reinstatementImpl.setBranchName(branchName);
		}

		if (payrollNo == null) {
			reinstatementImpl.setPayrollNo("");
		}
		else {
			reinstatementImpl.setPayrollNo(payrollNo);
		}

		if (terminationReason == null) {
			reinstatementImpl.setTerminationReason("");
		}
		else {
			reinstatementImpl.setTerminationReason(terminationReason);
		}

		if (terminationCode == null) {
			reinstatementImpl.setTerminationCode("");
		}
		else {
			reinstatementImpl.setTerminationCode(terminationCode);
		}

		if (formerBranch == null) {
			reinstatementImpl.setFormerBranch("");
		}
		else {
			reinstatementImpl.setFormerBranch(formerBranch);
		}

		reinstatementImpl.resetOriginalValues();

		return reinstatementImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		reinstatementId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		createdby = objectInput.readLong();
		modifiedby = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		firstName = objectInput.readUTF();
		lastName = objectInput.readUTF();
		branchName = objectInput.readUTF();
		payrollNo = objectInput.readUTF();
		terminationReason = objectInput.readUTF();
		terminationCode = objectInput.readUTF();
		formerBranch = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(reinstatementId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(createdby);

		if (modifiedby == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(modifiedby);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (firstName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(firstName);
		}

		if (lastName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(lastName);
		}

		if (branchName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(branchName);
		}

		if (payrollNo == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(payrollNo);
		}

		if (terminationReason == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(terminationReason);
		}

		if (terminationCode == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(terminationCode);
		}

		if (formerBranch == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(formerBranch);
		}
	}

	public String uuid;
	public long reinstatementId;
	public long groupId;
	public long companyId;
	public long createdby;
	public String modifiedby;
	public long createDate;
	public long modifiedDate;
	public String firstName;
	public String lastName;
	public String branchName;
	public String payrollNo;
	public String terminationReason;
	public String terminationCode;
	public String formerBranch;

}