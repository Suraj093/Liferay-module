create table max_user (
	uuid_ VARCHAR(75) null,
	maxUserId LONG not null primary key,
	groupId LONG,
	companyId LONG,
	userId LONG,
	userName VARCHAR(75) null,
	createDate DATE null,
	modifiedDate DATE null,
	maxUserFirstName VARCHAR(75) null,
	maxUserLastName VARCHAR(75) null,
	maxUserContactNumber VARCHAR(75) null,
	maxUserEmailId VARCHAR(75) null,
	maxUserDateOfBirth VARCHAR(75) null
);