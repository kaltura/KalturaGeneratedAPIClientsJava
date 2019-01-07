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
// Copyright (C) 2006-2019  Kaltura Inc.
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
public enum SchedulerStatusType implements EnumAsInt {
	RUNNING_BATCHES_COUNT(1),
	RUNNING_BATCHES_CPU(2),
	RUNNING_BATCHES_MEMORY(3),
	RUNNING_BATCHES_NETWORK(4),
	RUNNING_BATCHES_DISC_IO(5),
	RUNNING_BATCHES_DISC_SPACE(6),
	RUNNING_BATCHES_IS_RUNNING(7),
	RUNNING_BATCHES_LAST_EXECUTION_TIME(8);

	private int value;

	SchedulerStatusType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static SchedulerStatusType get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over SchedulerStatusType defined values and compare the inner value with the given one:
		for(SchedulerStatusType item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return SchedulerStatusType.values().length > 0 ? SchedulerStatusType.values()[0]: null;
   }
}
