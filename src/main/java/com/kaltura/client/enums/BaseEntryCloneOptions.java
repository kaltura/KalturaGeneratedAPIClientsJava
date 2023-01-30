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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BaseEntryCloneOptions implements EnumAsString {
	AD_CUE_POINTS("adCuePoint.AD_CUE_POINTS"),
	ANNOTATION_CUE_POINTS("annotation.ANNOTATION_CUE_POINTS"),
	CODE_CUE_POINTS("codeCuePoint.CODE_CUE_POINTS"),
	THUMB_CUE_POINTS("thumbCuePoint.THUMB_CUE_POINTS"),
	USERS("1"),
	CATEGORIES("2"),
	CHILD_ENTRIES("3"),
	ACCESS_CONTROL("4"),
	METADATA("5"),
	FLAVORS("6"),
	CAPTIONS("7");

	private String value;

	BaseEntryCloneOptions(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static BaseEntryCloneOptions get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over BaseEntryCloneOptions defined values and compare the inner value with the given one:
		for(BaseEntryCloneOptions item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return BaseEntryCloneOptions.values().length > 0 ? BaseEntryCloneOptions.values()[0]: null;
   }
}
