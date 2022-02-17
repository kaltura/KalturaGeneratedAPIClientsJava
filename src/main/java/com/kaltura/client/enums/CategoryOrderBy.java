// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2022  Kaltura Inc.
//
// This program is free software: you can redistribute it and/or modify
// it under the terms of the GNU Affero General Public License as
// published by the Free Software Foundation, either version 3 of the
// License, or (at your option) any later version.
//
// This program is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU Affero General Public License for more details.
//
// You should have received a copy of the GNU Affero General Public License
// along with this program.  If not, see <http://www.gnu.org/licenses/>.
//
// @ignore
// ===================================================================================================
package com.kaltura.client.enums;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum CategoryOrderBy implements EnumAsString {
	CREATED_AT_ASC("+createdAt"),
	DEPTH_ASC("+depth"),
	DIRECT_ENTRIES_COUNT_ASC("+directEntriesCount"),
	DIRECT_SUB_CATEGORIES_COUNT_ASC("+directSubCategoriesCount"),
	ENTRIES_COUNT_ASC("+entriesCount"),
	FULL_NAME_ASC("+fullName"),
	MEMBERS_COUNT_ASC("+membersCount"),
	NAME_ASC("+name"),
	PARTNER_SORT_VALUE_ASC("+partnerSortValue"),
	UPDATED_AT_ASC("+updatedAt"),
	CREATED_AT_DESC("-createdAt"),
	DEPTH_DESC("-depth"),
	DIRECT_ENTRIES_COUNT_DESC("-directEntriesCount"),
	DIRECT_SUB_CATEGORIES_COUNT_DESC("-directSubCategoriesCount"),
	ENTRIES_COUNT_DESC("-entriesCount"),
	FULL_NAME_DESC("-fullName"),
	MEMBERS_COUNT_DESC("-membersCount"),
	NAME_DESC("-name"),
	PARTNER_SORT_VALUE_DESC("-partnerSortValue"),
	UPDATED_AT_DESC("-updatedAt");

	private String value;

	CategoryOrderBy(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static CategoryOrderBy get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over CategoryOrderBy defined values and compare the inner value with the given one:
		for(CategoryOrderBy item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return CategoryOrderBy.values().length > 0 ? CategoryOrderBy.values()[0]: null;
   }
}
