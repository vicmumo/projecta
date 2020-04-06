create table Reinstatement_Reinstatement (
	uuid_ VARCHAR(75) null,
	reinstatementId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	createdby LONG,
	modifiedby VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	firstName VARCHAR(75) null,
	lastName VARCHAR(75) null,
	branchName VARCHAR(75) null,
	payrollNo VARCHAR(75) null,
	terminationReason VARCHAR(75) null,
	terminationCode VARCHAR(75) null,
	formerBranch VARCHAR(75) null
);