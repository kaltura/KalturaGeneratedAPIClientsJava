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
public enum VendorServiceTurnAroundTime implements EnumAsInt {
	BEST_EFFORT(-1),
	IMMEDIATE(0),
	ONE_BUSINESS_DAY(1),
	TWO_BUSINESS_DAYS(2),
	THREE_BUSINESS_DAYS(3),
	FOUR_BUSINESS_DAYS(4),
	FIVE_BUSINESS_DAYS(5),
	SIX_BUSINESS_DAYS(6),
	SEVEN_BUSINESS_DAYS(7),
	THIRTY_MINUTES(1800),
	TWO_HOURS(7200),
	THREE_HOURS(10800),
	SIX_HOURS(21600),
	EIGHT_HOURS(28800),
	TWELVE_HOURS(43200),
	TWENTY_FOUR_HOURS(86400),
	FORTY_EIGHT_HOURS(172800),
	FOUR_DAYS(345600),
	FIVE_DAYS(432000),
	TEN_DAYS(864000);

	private int value;

	VendorServiceTurnAroundTime(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static VendorServiceTurnAroundTime get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over VendorServiceTurnAroundTime defined values and compare the inner value with the given one:
		for(VendorServiceTurnAroundTime item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return VendorServiceTurnAroundTime.values().length > 0 ? VendorServiceTurnAroundTime.values()[0]: null;
   }
}
