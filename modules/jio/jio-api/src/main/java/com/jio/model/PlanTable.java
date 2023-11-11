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

package com.jio.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

import java.util.Date;

/**
 * The table class for the &quot;JIO_Plan&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Plan
 * @generated
 */
public class PlanTable extends BaseTable<PlanTable> {

	public static final PlanTable INSTANCE = new PlanTable();

	public final Column<PlanTable, String> uuid = createColumn(
		"uuid_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Long> planId = createColumn(
		"planId", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<PlanTable, Long> groupId = createColumn(
		"groupId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Long> companyId = createColumn(
		"companyId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Long> userId = createColumn(
		"userId", Long.class, Types.BIGINT, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> userName = createColumn(
		"userName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Date> createDate = createColumn(
		"createDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Date> modifiedDate = createColumn(
		"modifiedDate", Date.class, Types.TIMESTAMP, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> price = createColumn(
		"price", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> validity = createColumn(
		"validity", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> InternetData = createColumn(
		"InternetData", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> subscription = createColumn(
		"subscription", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> planName = createColumn(
		"planName", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> voice = createColumn(
		"voice", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> sms = createColumn(
		"sms", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Boolean> is5GEnable = createColumn(
		"is5GEnable", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<PlanTable, Boolean> isPlanActive = createColumn(
		"isPlanActive", Boolean.class, Types.BOOLEAN, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> planEffectiveDate = createColumn(
		"planEffectiveDate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<PlanTable, String> planTermedDate = createColumn(
		"planTermedDate", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private PlanTable() {
		super("JIO_Plan", PlanTable::new);
	}

}