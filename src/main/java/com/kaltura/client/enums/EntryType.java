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
public enum EntryType implements EnumAsString {
	AUTOMATIC("-1"),
	CONFERENCE_ENTRY_SERVER("conference.CONFERENCE_ENTRY_SERVER"),
	EXTERNAL_MEDIA("externalMedia.externalMedia"),
	ROOM("room.room"),
	SIP_ENTRY_SERVER("sip.SIP_ENTRY_SERVER"),
	MEDIA_CLIP("1"),
	MIX("2"),
	PLAYLIST("5"),
	DATA("6"),
	LIVE_STREAM("7"),
	LIVE_CHANNEL("8"),
	DOCUMENT("10");

	private String value;

	EntryType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static EntryType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over EntryType defined values and compare the inner value with the given one:
		for(EntryType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return EntryType.values().length > 0 ? EntryType.values()[0]: null;
   }
}
