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
	formerBranch VARCHAR(75) null,
	contractId VARCHAR(75) null,
	entityId VARCHAR(75) null,
	approvalDate VARCHAR(75) null,
	comments VARCHAR(75) null,
	approverContractNumber VARCHAR(75) null,
	agentVerdict VARCHAR(75) null,
	agentAction VARCHAR(75) null,
	processedFlag VARCHAR(75) null,
	errorReason VARCHAR(75) null,
	assignmentStatus VARCHAR(75) null,
	capacity VARCHAR(75) null,
	positionId VARCHAR(75) null,
	orgId VARCHAR(75) null,
	historyStartDate VARCHAR(75) null,
	oldOrgId VARCHAR(75) null,
	oldPositionId VARCHAR(75) null,
	contractEffectiveEndDate VARCHAR(75) null,
	applicationTye VARCHAR(75) null,
	applicationCategory VARCHAR(75) null,
	firstapprover VARCHAR(75) null,
	secondapprover VARCHAR(75) null
);