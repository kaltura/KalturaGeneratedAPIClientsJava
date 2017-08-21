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
// Copyright (C) 2006-2017  Kaltura Inc.
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
public enum LicenseType implements EnumAsInt {
	UNKNOWN(-1),
	NONE(0),
	COPYRIGHTED(1),
	PUBLIC_DOMAIN(2),
	CREATIVECOMMONS_ATTRIBUTION(3),
	CREATIVECOMMONS_ATTRIBUTION_SHARE_ALIKE(4),
	CREATIVECOMMONS_ATTRIBUTION_NO_DERIVATIVES(5),
	CREATIVECOMMONS_ATTRIBUTION_NON_COMMERCIAL(6),
	CREATIVECOMMONS_ATTRIBUTION_NON_COMMERCIAL_SHARE_ALIKE(7),
	CREATIVECOMMONS_ATTRIBUTION_NON_COMMERCIAL_NO_DERIVATIVES(8),
	GFDL(9),
	GPL(10),
	AFFERO_GPL(11),
	LGPL(12),
	BSD(13),
	APACHE(14),
	MOZILLA(15);

	private int value;

	LicenseType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static LicenseType get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over LicenseType defined values and compare the inner value with the given one:
		for(LicenseType item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return LicenseType.values().length > 0 ? LicenseType.values()[0]: null;
   }
}
