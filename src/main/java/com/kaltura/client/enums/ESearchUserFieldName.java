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
public enum ESearchUserFieldName implements EnumAsString {
	USER_CREATED_AT("created_at"),
	USER_EMAIL("email"),
	USER_FIRST_NAME("first_name"),
	USER_GROUP_IDS("group_ids"),
	USER_TYPE("kuser_type"),
	USER_LAST_NAME("last_name"),
	USER_PERMISSION_NAMES("permission_names"),
	USER_ROLE_IDS("role_ids"),
	USER_SCREEN_NAME("screen_name"),
	USER_TAGS("tags"),
	USER_UPDATED_AT("updated_at");

	private String value;

	ESearchUserFieldName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ESearchUserFieldName get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ESearchUserFieldName defined values and compare the inner value with the given one:
		for(ESearchUserFieldName item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ESearchUserFieldName.values().length > 0 ? ESearchUserFieldName.values()[0]: null;
   }
}
