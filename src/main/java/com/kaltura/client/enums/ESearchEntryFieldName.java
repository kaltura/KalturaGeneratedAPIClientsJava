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
// Copyright (C) 2006-2023  Kaltura Inc.
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
	ACCESS_CONTROL_ID("access_control_id"),
	ADMIN_TAGS("admin_tags"),
	CAPTIONS_CONTENT("captions_content"),
	CONVERSION_PROFILE_ID("conversion_profile_id"),
	CREATED_AT("created_at"),
	CREATOR_ID("creator_kuser_id"),
	CREDIT("credit"),
	DESCRIPTION("description"),
	DISPLAY_IN_SEARCH("display_in_search"),
	END_DATE("end_date"),
	ENTITLED_USER_EDIT("entitled_kusers_edit"),
	ENTITLED_USER_PUBLISH("entitled_kusers_publish"),
	ENTITLED_USER_VIEW("entitled_kusers_view"),
	ENTRY_TYPE("entry_type"),
	EXTERNAL_SOURCE_TYPE("external_source_type"),
	ID("id"),
	IS_LIVE("is_live"),
	IS_QUIZ("is_quiz"),
	USER_ID("kuser_id"),
	LAST_PLAYED_AT("last_played_at"),
	LENGTH_IN_MSECS("length_in_msecs"),
	MEDIA_TYPE("media_type"),
	MODERATION_STATUS("moderation_status"),
	NAME("name"),
	PARENT_ENTRY_ID("parent_id"),
	PARTNER_SORT_VALUE("partner_sort_value"),
	PLAYS("plays"),
	PUSH_PUBLISH("push_publish"),
	RANK("rank"),
	RECORDED_ENTRY_ID("recorded_entry_id"),
	REDIRECT_ENTRY_ID("redirect_entry_id"),
	REFERENCE_ID("reference_id"),
	ROOT_ID("root_id"),
	SITE_URL("site_url"),
	SOURCE_TYPE("source_type"),
	START_DATE("start_date"),
	TAGS("tags"),
	TEMPLATE_ENTRY_ID("template_entry_id"),
	UPDATED_AT("updated_at"),
	USER_NAMES("user_names"),
	VOTES("votes");

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
