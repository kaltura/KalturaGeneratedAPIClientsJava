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
public enum ESearchEntryFieldName implements EnumAsString {
	ENTRY_ID("_id"),
	ENTRY_ACCESS_CONTROL_ID("access_control_id"),
	ENTRY_ADMIN_TAGS("admin_tags"),
	ENTRY_CATEGORIES("categories"),
	ENTRY_CATEGORY_NAME("categories.name"),
	ENTRY_CATEGORY_IDS("category_ids"),
	ENTRY_CONVERSION_PROFILE_ID("conversion_profile_id"),
	ENTRY_CREATED_AT("created_at"),
	ENTRY_CREATOR_ID("creator_kuser_id"),
	ENTRY_CREDIT("credit"),
	ENTRY_DESCRIPTION("description"),
	ENTRY_END_DATE("end_date"),
	ENTRY_ENTITLED_USER_EDIT("entitled_kusers_edit"),
	ENTRY_ENTITLED_USER_PUBLISH("entitled_kusers_publish"),
	ENTRY_TYPE("entry_type"),
	ENTRY_EXTERNAL_SOURCE_TYPE("external_source_type"),
	ENTRY_USER_ID("kuser_id"),
	ENTRY_LENGTH_IN_MSECS("length_in_msecs"),
	ENTRY_MEDIA_TYPE("media_type"),
	ENTRY_MODERATION_STATUS("moderation_status"),
	ENTRY_NAME("name"),
	ENTRY_PARENT_ENTRY_ID("parent_id"),
	ENTRY_PUSH_PUBLISH("push_publish"),
	ENTRY_RECORDED_ENTRY_ID("recorded_entry_id"),
	ENTRY_REDIRECT_ENTRY_ID("redirect_entry_id"),
	ENTRY_REFERENCE_ID("reference_id"),
	ENTRY_SITE_URL("site_url"),
	ENTRY_SOURCE_TYPE("source_type"),
	ENTRY_START_DATE("start_date"),
	ENTRY_TAGS("tags"),
	ENTRY_TEMPLATE_ENTRY_ID("template_entry_id"),
	ENTRY_UPDATED_AT("updated_at"),
	ENTRY_VIEWS("views"),
	ENTRY_VOTES("votes");

	private String value;

	ESearchEntryFieldName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ESearchEntryFieldName get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ESearchEntryFieldName defined values and compare the inner value with the given one:
		for(ESearchEntryFieldName item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ESearchEntryFieldName.values().length > 0 ? ESearchEntryFieldName.values()[0]: null;
   }
}
