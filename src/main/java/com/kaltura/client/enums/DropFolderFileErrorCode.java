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
public enum DropFolderFileErrorCode implements EnumAsString {
	ERROR_ADDING_BULK_UPLOAD("dropFolderXmlBulkUpload.ERROR_ADDING_BULK_UPLOAD"),
	ERROR_ADD_CONTENT_RESOURCE("dropFolderXmlBulkUpload.ERROR_ADD_CONTENT_RESOURCE"),
	ERROR_IN_BULK_UPLOAD("dropFolderXmlBulkUpload.ERROR_IN_BULK_UPLOAD"),
	ERROR_WRITING_TEMP_FILE("dropFolderXmlBulkUpload.ERROR_WRITING_TEMP_FILE"),
	LOCAL_FILE_WRONG_CHECKSUM("dropFolderXmlBulkUpload.LOCAL_FILE_WRONG_CHECKSUM"),
	LOCAL_FILE_WRONG_SIZE("dropFolderXmlBulkUpload.LOCAL_FILE_WRONG_SIZE"),
	MALFORMED_XML_FILE("dropFolderXmlBulkUpload.MALFORMED_XML_FILE"),
	XML_FILE_SIZE_EXCEED_LIMIT("dropFolderXmlBulkUpload.XML_FILE_SIZE_EXCEED_LIMIT"),
	ERROR_UPDATE_ENTRY("1"),
	ERROR_ADD_ENTRY("2"),
	FLAVOR_NOT_FOUND("3"),
	FLAVOR_MISSING_IN_FILE_NAME("4"),
	SLUG_REGEX_NO_MATCH("5"),
	ERROR_READING_FILE("6"),
	ERROR_DOWNLOADING_FILE("7"),
	ERROR_UPDATE_FILE("8"),
	ERROR_ADDING_CONTENT_PROCESSOR("10"),
	ERROR_IN_CONTENT_PROCESSOR("11"),
	ERROR_DELETING_FILE("12"),
	FILE_NO_MATCH("13");

	private String value;

	DropFolderFileErrorCode(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static DropFolderFileErrorCode get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over DropFolderFileErrorCode defined values and compare the inner value with the given one:
		for(DropFolderFileErrorCode item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return DropFolderFileErrorCode.values().length > 0 ? DropFolderFileErrorCode.values()[0]: null;
   }
}
