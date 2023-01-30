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
public enum ESearchEntryOrderByFieldName implements EnumAsString {
	CREATED_AT("created_at"),
	END_DATE("end_date"),
	LAST_PLAYED_AT("last_played_at"),
	NAME("name"),
	PLAYS("plays"),
	PLAYS_LAST_1_DAY("plays_last_1_day"),
	PLAYS_LAST_30_DAYS("plays_last_30_days"),
	PLAYS_LAST_7_DAYS("plays_last_7_days"),
	RANK("rank"),
	START_DATE("start_date"),
	UPDATED_AT("updated_at"),
	VIEWS("views"),
	VIEWS_LAST_1_DAY("views_last_1_day"),
	VIEWS_LAST_30_DAYS("views_last_30_days"),
	VIEWS_LAST_7_DAYS("views_last_7_days"),
	VOTES("votes");

	private String value;

	ESearchEntryOrderByFieldName(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ESearchEntryOrderByFieldName get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ESearchEntryOrderByFieldName defined values and compare the inner value with the given one:
		for(ESearchEntryOrderByFieldName item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ESearchEntryOrderByFieldName.values().length > 0 ? ESearchEntryOrderByFieldName.values()[0]: null;
   }
}
