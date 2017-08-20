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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BatchJobType implements EnumAsString {
	PARSE_MULTI_LANGUAGE_CAPTION_ASSET("caption.parsemultilanguagecaptionasset"),
	PARSE_CAPTION_ASSET("captionSearch.parseCaptionAsset"),
	DISTRIBUTION_DELETE("contentDistribution.DistributionDelete"),
	CONVERT("0"),
	DISTRIBUTION_DISABLE("contentDistribution.DistributionDisable"),
	DISTRIBUTION_ENABLE("contentDistribution.DistributionEnable"),
	DISTRIBUTION_FETCH_REPORT("contentDistribution.DistributionFetchReport"),
	DISTRIBUTION_SUBMIT("contentDistribution.DistributionSubmit"),
	DISTRIBUTION_SYNC("contentDistribution.DistributionSync"),
	DISTRIBUTION_UPDATE("contentDistribution.DistributionUpdate"),
	DROP_FOLDER_CONTENT_PROCESSOR("dropFolder.DropFolderContentProcessor"),
	DROP_FOLDER_WATCHER("dropFolder.DropFolderWatcher"),
	EVENT_NOTIFICATION_HANDLER("eventNotification.EventNotificationHandler"),
	INTEGRATION("integration.Integration"),
	SCHEDULED_TASK("scheduledTask.ScheduledTask"),
	INDEX_TAGS("tagSearch.IndexTagsByPrivacyContext"),
	TAG_RESOLVE("tagSearch.TagResolve"),
	VIRUS_SCAN("virusScan.VirusScan"),
	WIDEVINE_REPOSITORY_SYNC("widevine.WidevineRepositorySync"),
	IMPORT("1"),
	DELETE("2"),
	FLATTEN("3"),
	BULKUPLOAD("4"),
	DVDCREATOR("5"),
	DOWNLOAD("6"),
	OOCONVERT("7"),
	CONVERT_PROFILE("10"),
	POSTCONVERT("11"),
	EXTRACT_MEDIA("14"),
	MAIL("15"),
	NOTIFICATION("16"),
	CLEANUP("17"),
	SCHEDULER_HELPER("18"),
	BULKDOWNLOAD("19"),
	DB_CLEANUP("20"),
	PROVISION_PROVIDE("21"),
	CONVERT_COLLECTION("22"),
	STORAGE_EXPORT("23"),
	PROVISION_DELETE("24"),
	STORAGE_DELETE("25"),
	EMAIL_INGESTION("26"),
	METADATA_IMPORT("27"),
	METADATA_TRANSFORM("28"),
	FILESYNC_IMPORT("29"),
	CAPTURE_THUMB("30"),
	DELETE_FILE("31"),
	INDEX("32"),
	MOVE_CATEGORY_ENTRIES("33"),
	COPY("34"),
	CONCAT("35"),
	CONVERT_LIVE_SEGMENT("36"),
	COPY_PARTNER("37"),
	VALIDATE_LIVE_MEDIA_SERVERS("38"),
	SYNC_CATEGORY_PRIVACY_CONTEXT("39"),
	LIVE_REPORT_EXPORT("40"),
	RECALCULATE_CACHE("41"),
	LIVE_TO_VOD("42");

	private String value;

	BatchJobType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static BatchJobType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over BatchJobType defined values and compare the inner value with the given one:
		for(BatchJobType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return BatchJobType.values().length > 0 ? BatchJobType.values()[0]: null;
   }
}
