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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BaseEntryOrderBy implements EnumAsString {
	CREATED_AT_ASC("+createdAt"),
	END_DATE_ASC("+endDate"),
	MODERATION_COUNT_ASC("+moderationCount"),
	NAME_ASC("+name"),
	PARTNER_SORT_VALUE_ASC("+partnerSortValue"),
	RANK_ASC("+rank"),
	RECENT_ASC("+recent"),
	START_DATE_ASC("+startDate"),
	TOTAL_RANK_ASC("+totalRank"),
	UPDATED_AT_ASC("+updatedAt"),
	WEIGHT_ASC("+weight"),
	CREATED_AT_DESC("-createdAt"),
	END_DATE_DESC("-endDate"),
	MODERATION_COUNT_DESC("-moderationCount"),
	NAME_DESC("-name"),
	PARTNER_SORT_VALUE_DESC("-partnerSortValue"),
	RANK_DESC("-rank"),
	RECENT_DESC("-recent"),
	START_DATE_DESC("-startDate"),
	TOTAL_RANK_DESC("-totalRank"),
	UPDATED_AT_DESC("-updatedAt"),
	WEIGHT_DESC("-weight");

	private String value;

	BaseEntryOrderBy(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static BaseEntryOrderBy get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over BaseEntryOrderBy defined values and compare the inner value with the given one:
		for(BaseEntryOrderBy item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return BaseEntryOrderBy.values().length > 0 ? BaseEntryOrderBy.values()[0]: null;
   }
}
