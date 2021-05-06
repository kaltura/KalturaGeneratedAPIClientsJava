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
public enum FileSyncOrderBy implements EnumAsString {
	CREATED_AT_ASC("+createdAt"),
	FILE_SIZE_ASC("+fileSize"),
	READY_AT_ASC("+readyAt"),
	SYNC_TIME_ASC("+syncTime"),
	UPDATED_AT_ASC("+updatedAt"),
	VERSION_ASC("+version"),
	CREATED_AT_DESC("-createdAt"),
	FILE_SIZE_DESC("-fileSize"),
	READY_AT_DESC("-readyAt"),
	SYNC_TIME_DESC("-syncTime"),
	UPDATED_AT_DESC("-updatedAt"),
	VERSION_DESC("-version");

	private String value;

	FileSyncOrderBy(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static FileSyncOrderBy get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over FileSyncOrderBy defined values and compare the inner value with the given one:
		for(FileSyncOrderBy item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return FileSyncOrderBy.values().length > 0 ? FileSyncOrderBy.values()[0]: null;
   }
}
