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
public enum AuditTrailObjectType implements EnumAsString {
	BATCH_JOB("BatchJob"),
	EMAIL_INGESTION_PROFILE("EmailIngestionProfile"),
	FILE_SYNC("FileSync"),
	KSHOW_KUSER("KshowKuser"),
	METADATA("Metadata"),
	METADATA_PROFILE("MetadataProfile"),
	PARTNER("Partner"),
	PERMISSION("Permission"),
	REACH_PROFILE("ReachProfile"),
	UPLOAD_TOKEN("UploadToken"),
	USER_LOGIN_DATA("UserLoginData"),
	USER_ROLE("UserRole"),
	ACCESS_CONTROL("accessControl"),
	CATEGORY("category"),
	CATEGORY_ENTRY("categoryEntry"),
	CONVERSION_PROFILE_2("conversionProfile2"),
	ENTRY("entry"),
	FLAVOR_ASSET("flavorAsset"),
	FLAVOR_PARAMS("flavorParams"),
	FLAVOR_PARAMS_CONVERSION_PROFILE("flavorParamsConversionProfile"),
	FLAVOR_PARAMS_OUTPUT("flavorParamsOutput"),
	KSHOW("kshow"),
	KUSER("kuser"),
	MEDIA_INFO("mediaInfo"),
	MODERATION("moderation"),
	ROUGHCUT("roughcutEntry"),
	SYNDICATION("syndicationFeed"),
	THUMBNAIL_ASSET("thumbAsset"),
	THUMBNAIL_PARAMS("thumbParams"),
	THUMBNAIL_PARAMS_OUTPUT("thumbParamsOutput"),
	UI_CONF("uiConf"),
	WIDGET("widget");

	private String value;

	AuditTrailObjectType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static AuditTrailObjectType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over AuditTrailObjectType defined values and compare the inner value with the given one:
		for(AuditTrailObjectType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return AuditTrailObjectType.values().length > 0 ? AuditTrailObjectType.values()[0]: null;
   }
}
