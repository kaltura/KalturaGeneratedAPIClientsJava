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
public enum DrmKeyManagementPolicy implements EnumAsInt {
	UNKNOWN(0),
	CLEAR(1),
	SHARED_KEY(2),
	ALL_VIDEO(3),
	SD_HD(4),
	SD_HD_UHD(5),
	SD_HD_UHD1_UHD2(6),
	SD_HD1_HD2_UHD1_UHD2(7),
	SD_HD1_HD2_UHD(8),
	SDHD1_HD2_UHD(9),
	SDHD1_HD2_UHD1_UHD2(10);

	private int value;

	DrmKeyManagementPolicy(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static DrmKeyManagementPolicy get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over DrmKeyManagementPolicy defined values and compare the inner value with the given one:
		for(DrmKeyManagementPolicy item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return DrmKeyManagementPolicy.values().length > 0 ? DrmKeyManagementPolicy.values()[0]: null;
   }
}
