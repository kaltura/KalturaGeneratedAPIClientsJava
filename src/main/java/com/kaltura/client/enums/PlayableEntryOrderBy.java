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
public enum PlayableEntryOrderBy implements EnumAsString {
	CREATED_AT_ASC("+createdAt"),
	DURATION_ASC("+duration"),
	END_DATE_ASC("+endDate"),
	LAST_PLAYED_AT_ASC("+lastPlayedAt"),
	MODERATION_COUNT_ASC("+moderationCount"),
	NAME_ASC("+name"),
	PARTNER_SORT_VALUE_ASC("+partnerSortValue"),
	PLAYS_ASC("+plays"),
	RANK_ASC("+rank"),
	RECENT_ASC("+recent"),
	START_DATE_ASC("+startDate"),
	TOTAL_RANK_ASC("+totalRank"),
	UPDATED_AT_ASC("+updatedAt"),
	VIEWS_ASC("+views"),
	WEIGHT_ASC("+weight"),
	CREATED_AT_DESC("-createdAt"),
	DURATION_DESC("-duration"),
	END_DATE_DESC("-endDate"),
	LAST_PLAYED_AT_DESC("-lastPlayedAt"),
	MODERATION_COUNT_DESC("-moderationCount"),
	NAME_DESC("-name"),
	PARTNER_SORT_VALUE_DESC("-partnerSortValue"),
	PLAYS_DESC("-plays"),
	RANK_DESC("-rank"),
	RECENT_DESC("-recent"),
	START_DATE_DESC("-startDate"),
	TOTAL_RANK_DESC("-totalRank"),
	UPDATED_AT_DESC("-updatedAt"),
	VIEWS_DESC("-views"),
	WEIGHT_DESC("-weight");

	private String value;

	PlayableEntryOrderBy(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static PlayableEntryOrderBy get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over PlayableEntryOrderBy defined values and compare the inner value with the given one:
		for(PlayableEntryOrderBy item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return PlayableEntryOrderBy.values().length > 0 ? PlayableEntryOrderBy.values()[0]: null;
   }
}
