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
// Copyright (C) 2006-2021  Kaltura Inc.
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
public enum ConditionType implements EnumAsString {
	EVENT_NOTIFICATION_FIELD("eventNotification.BooleanField"),
	EVENT_NOTIFICATION_OBJECT_CHANGED("eventNotification.ObjectChanged"),
	METADATA_FIELD_CHANGED("metadata.FieldChanged"),
	METADATA_FIELD_COMPARE("metadata.FieldCompare"),
	METADATA_FIELD_MATCH("metadata.FieldMatch"),
	EVENT_CATEGORY_ENTRY("reach.CategoryEntry"),
	AUTHENTICATED("1"),
	COUNTRY("2"),
	IP_ADDRESS("3"),
	SITE("4"),
	USER_AGENT("5"),
	FIELD_MATCH("6"),
	FIELD_COMPARE("7"),
	ASSET_PROPERTIES_COMPARE("8"),
	USER_ROLE("9"),
	GEO_DISTANCE("10"),
	OR_OPERATOR("11"),
	HASH("12"),
	DELIVERY_PROFILE("13"),
	ACTIVE_EDGE_VALIDATE("14"),
	ANONYMOUS_IP("15"),
	ASSET_TYPE("16"),
	BOOLEAN("17"),
	HTTP_HEADER("18");

	private String value;

	ConditionType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ConditionType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ConditionType defined values and compare the inner value with the given one:
		for(ConditionType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ConditionType.values().length > 0 ? ConditionType.values()[0]: null;
   }
}
