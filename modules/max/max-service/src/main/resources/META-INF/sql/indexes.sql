create index IX_9BC15C9C on max_user (companyId);
create index IX_5A0C891C on max_user (groupId, maxUserId);
create index IX_6DC87F00 on max_user (uuid_[$COLUMN_LENGTH:75$], companyId);
create unique index IX_6D64C582 on max_user (uuid_[$COLUMN_LENGTH:75$], groupId);