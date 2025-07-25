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
public enum AssetType implements EnumAsString {
	FLAVOR("1"),
	THUMBNAIL("2"),
	LIVE("3"),
	ATTACHMENT("attachment.Attachment"),
	CAPTION("caption.Caption"),
	DOCUMENT("document.Document"),
	IMAGE("document.Image"),
	PDF("document.PDF"),
	SWF("document.SWF"),
	MARKDOWN("markdown.Markdown"),
	TIMED_THUMB_ASSET("thumbCuePoint.timedThumb"),
	TRANSCRIPT("transcript.Transcript"),
	WIDEVINE_FLAVOR("widevine.WidevineFlavor");

	private String value;

	AssetType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static AssetType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over AssetType defined values and compare the inner value with the given one:
		for(AssetType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return AssetType.values().length > 0 ? AssetType.values()[0]: null;
   }
}
