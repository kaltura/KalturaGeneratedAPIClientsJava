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
// Copyright (C) 2006-2022  Kaltura Inc.
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
public enum SourceType implements EnumAsString {
	LIMELIGHT_LIVE("limeLight.LIVE_STREAM"),
	VELOCIX_LIVE("velocix.VELOCIX_LIVE"),
	FILE("1"),
	WEBCAM("2"),
	URL("5"),
	SEARCH_PROVIDER("6"),
	AKAMAI_LIVE("29"),
	MANUAL_LIVE_STREAM("30"),
	AKAMAI_UNIVERSAL_LIVE("31"),
	LIVE_STREAM("32"),
	LIVE_CHANNEL("33"),
	RECORDED_LIVE("34"),
	CLIP("35"),
	KALTURA_RECORDED_LIVE("36"),
	LECTURE_CAPTURE("37"),
	LIVE_STREAM_ONTEXTDATA_CAPTIONS("42");

	private String value;

	SourceType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static SourceType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over SourceType defined values and compare the inner value with the given one:
		for(SourceType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return SourceType.values().length > 0 ? SourceType.values()[0]: null;
   }
}
