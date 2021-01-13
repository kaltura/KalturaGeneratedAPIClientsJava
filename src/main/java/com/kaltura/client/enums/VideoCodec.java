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
public enum VideoCodec implements EnumAsString {
	NONE(""),
	APCH("apch"),
	APCN("apcn"),
	APCO("apco"),
	APCS("apcs"),
	COPY("copy"),
	DNXHD("dnxhd"),
	DV("dv"),
	FLV("flv"),
	H263("h263"),
	H264("h264"),
	H264B("h264b"),
	H264H("h264h"),
	H264M("h264m"),
	H265("h265"),
	MPEG2("mpeg2"),
	MPEG4("mpeg4"),
	THEORA("theora"),
	VP6("vp6"),
	VP8("vp8"),
	VP9("vp9"),
	WMV2("wmv2"),
	WMV3("wmv3"),
	WVC1A("wvc1a");

	private String value;

	VideoCodec(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static VideoCodec get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over VideoCodec defined values and compare the inner value with the given one:
		for(VideoCodec item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return VideoCodec.values().length > 0 ? VideoCodec.values()[0]: null;
   }
}
