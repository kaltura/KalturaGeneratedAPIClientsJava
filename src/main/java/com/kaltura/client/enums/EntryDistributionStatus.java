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
public enum EntryDistributionStatus implements EnumAsInt {
	PENDING(0),
	QUEUED(1),
	READY(2),
	DELETED(3),
	SUBMITTING(4),
	UPDATING(5),
	DELETING(6),
	ERROR_SUBMITTING(7),
	ERROR_UPDATING(8),
	ERROR_DELETING(9),
	REMOVED(10),
	IMPORT_SUBMITTING(11),
	IMPORT_UPDATING(12);

	private int value;

	EntryDistributionStatus(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static EntryDistributionStatus get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over EntryDistributionStatus defined values and compare the inner value with the given one:
		for(EntryDistributionStatus item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return EntryDistributionStatus.values().length > 0 ? EntryDistributionStatus.values()[0]: null;
   }
}
