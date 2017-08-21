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
public enum DeliveryProfileType implements EnumAsString {
	EDGE_CAST_HTTP("edgeCast.EDGE_CAST_HTTP"),
	EDGE_CAST_RTMP("edgeCast.EDGE_CAST_RTMP"),
	KONTIKI_HTTP("kontiki.KONTIKI_HTTP"),
	VELOCIX_HDS("velocix.VELOCIX_HDS"),
	VELOCIX_HLS("velocix.VELOCIX_HLS"),
	APPLE_HTTP("1"),
	HDS("3"),
	HTTP("4"),
	RTMP("5"),
	RTSP("6"),
	SILVER_LIGHT("7"),
	AKAMAI_HLS_DIRECT("10"),
	AKAMAI_HLS_MANIFEST("11"),
	AKAMAI_HD("12"),
	AKAMAI_HDS("13"),
	AKAMAI_HTTP("14"),
	AKAMAI_RTMP("15"),
	AKAMAI_RTSP("16"),
	AKAMAI_SS("17"),
	GENERIC_HLS("21"),
	GENERIC_HDS("23"),
	GENERIC_HTTP("24"),
	GENERIC_HLS_MANIFEST("25"),
	GENERIC_HDS_MANIFEST("26"),
	GENERIC_SS("27"),
	GENERIC_RTMP("28"),
	LEVEL3_HLS("31"),
	LEVEL3_HTTP("34"),
	LEVEL3_RTMP("35"),
	LIMELIGHT_HTTP("44"),
	LIMELIGHT_RTMP("45"),
	LOCAL_PATH_APPLE_HTTP("51"),
	LOCAL_PATH_HDS("53"),
	LOCAL_PATH_HTTP("54"),
	LOCAL_PATH_RTMP("55"),
	VOD_PACKAGER_HLS("61"),
	VOD_PACKAGER_HDS("63"),
	VOD_PACKAGER_MSS("67"),
	VOD_PACKAGER_DASH("68"),
	LIVE_HLS("1001"),
	LIVE_HDS("1002"),
	LIVE_DASH("1003"),
	LIVE_RTMP("1005"),
	LIVE_HLS_TO_MULTICAST("1006"),
	LIVE_PACKAGER_HLS("1007"),
	LIVE_PACKAGER_HDS("1008"),
	LIVE_PACKAGER_DASH("1009"),
	LIVE_PACKAGER_MSS("1010"),
	LIVE_AKAMAI_HDS("1013");

	private String value;

	DeliveryProfileType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static DeliveryProfileType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over DeliveryProfileType defined values and compare the inner value with the given one:
		for(DeliveryProfileType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return DeliveryProfileType.values().length > 0 ? DeliveryProfileType.values()[0]: null;
   }
}
