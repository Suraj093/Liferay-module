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

package com.max.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;max_user&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Maxuser
 * @generated
 */
public class MaxuserTable extends BaseTable<MaxuserTable> {

	public static final MaxuserTable INSTANCE = new MaxuserTable();

	public final Column<MaxuserTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, Long> maxUserId = createColumn(
		"maxUserId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<MaxuserTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> maxUserFirstName = createColumn(
		"maxUserFirstName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> maxUserLastName = createColumn(
		"maxUserLastName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> maxUserContactNumber =
		createColumn(
			"maxUserContactNumber", String.class, Types.VARCHAR,
			Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> maxUserEmailId = createColumn(
		"maxUserEmailId", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<MaxuserTable, String> maxUserDateOfBirth = createColumn(
		"maxUserDateOfBirth", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private MaxuserTable() {
		super("max_user", MaxuserTable::new);
	}

}