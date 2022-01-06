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
public enum EventNotificationEventType implements EnumAsString {
	BATCH_JOB_STATUS("1"),
	OBJECT_ADDED("2"),
	OBJECT_CHANGED("3"),
	OBJECT_COPIED("4"),
	OBJECT_CREATED("5"),
	OBJECT_DATA_CHANGED("6"),
	OBJECT_DELETED("7"),
	OBJECT_ERASED("8"),
	OBJECT_READY_FOR_REPLACMENT("9"),
	OBJECT_SAVED("10"),
	OBJECT_UPDATED("11"),
	OBJECT_REPLACED("12"),
	OBJECT_READY_FOR_INDEX("13");

	private String value;

	EventNotificationEventType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static EventNotificationEventType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over EventNotificationEventType defined values and compare the inner value with the given one:
		for(EventNotificationEventType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return EventNotificationEventType.values().length > 0 ? EventNotificationEventType.values()[0]: null;
   }
}
