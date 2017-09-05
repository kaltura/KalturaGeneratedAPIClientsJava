// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platfroms allow them to do with
// text.
//
// Copyright (C) 2006-2017  Kaltura Inc.
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
public enum ESearchCategoryFieldName implements EnumAsString {
	CATEGORY_CONTRIBUTION_POLICY("contribution_policy"),
	CATEGORY_CREATED_AT("created_at"),
	CATEGORY_DEPTH("depth"),
	CATEGORY_DESCRIPTION("description"),
	CATEGORY_DIRECT_ENTRIES_COUNT("direct_entries_count"),
	CATEGORY_DIRECT_SUB_CATEGORIES_COUNT("direct_sub_categories_count"),
	CATEGORY_DISPLAY_IN_SEARCH("display_in_search"),
	CATEGORY_ENTRIES_COUNT("entries_count"),
	CATEGORY_FULL_IDS("full_ids"),
	CATEGORY_FULL_NAME("full_name"),
	CATEGORY_INHERITANCE_TYPE("inheritance_type"),
	CATEGORY_INHERITED_PARENT_ID("inherited_parent_id"),
	CATEGORY_KUSER_ID("kuser_id"),
	CATEGORY_KUSER_IDS("kuser_ids"),
	CATEGORY_MEMBERS_COUNT("members_count"),
	CATEGORY_MODERATION("moderation"),
	CATEGORY_NAME("name"),
	CATEGORY_PARENT_ID("parent_id"),
	CATEGORY_PENDING_ENTRIES_COUNT("pending_entries_count"),
	CATEGORY_PENDING_MEMBERS_COUNT("pending_members_count"),
	CATEGORY_PRIVACY("privacy"),
	CATEGORY_PRIVACY_CONTEXT("privacy_context"),
	CATEGORY_PRIVACY_CONTEXTS("privacy_contexts"),
	CATEGORY_REFERENCE_ID("reference_id"),
	CATEGORY_TAGS("tags"),
	CATEGORY_UPDATED_AT("updated_at");

	private String value;

	ESearchCategoryFieldName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ESearchCategoryFieldName get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ESearchCategoryFieldName defined values and compare the inner value with the given one:
		for(ESearchCategoryFieldName item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ESearchCategoryFieldName.values().length > 0 ? ESearchCategoryFieldName.values()[0]: null;
   }
}
