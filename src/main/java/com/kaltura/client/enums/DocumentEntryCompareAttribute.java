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
// Copyright (C) 2006-2020  Kaltura Inc.
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
public enum DocumentEntryCompareAttribute implements EnumAsString {
	ACCESS_CONTROL_ID("accessControlId"),
	CREATED_AT("createdAt"),
	END_DATE("endDate"),
	MODERATION_COUNT("moderationCount"),
	MODERATION_STATUS("moderationStatus"),
	PARTNER_ID("partnerId"),
	PARTNER_SORT_VALUE("partnerSortValue"),
	RANK("rank"),
	REPLACEMENT_STATUS("replacementStatus"),
	START_DATE("startDate"),
	STATUS("status"),
	TOTAL_RANK("totalRank"),
	TYPE("type"),
	UPDATED_AT("updatedAt");

	private String value;

	DocumentEntryCompareAttribute(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static DocumentEntryCompareAttribute get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over DocumentEntryCompareAttribute defined values and compare the inner value with the given one:
		for(DocumentEntryCompareAttribute item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return DocumentEntryCompareAttribute.values().length > 0 ? DocumentEntryCompareAttribute.values()[0]: null;
   }
}
