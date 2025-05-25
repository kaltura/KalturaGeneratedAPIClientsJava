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
public enum EventNotificationEventObjectType implements EnumAsString {
	ENTRY("1"),
	CATEGORY("2"),
	ASSET("3"),
	FLAVORASSET("4"),
	THUMBASSET("5"),
	KUSER("8"),
	ACCESSCONTROL("9"),
	BATCHJOB("10"),
	BULKUPLOADRESULT("11"),
	CATEGORYKUSER("12"),
	CONVERSIONPROFILE2("14"),
	FLAVORPARAMS("15"),
	FLAVORPARAMSCONVERSIONPROFILE("16"),
	FLAVORPARAMSOUTPUT("17"),
	GENERICSYNDICATIONFEED("18"),
	KUSERTOUSERROLE("19"),
	PARTNER("20"),
	PERMISSION("21"),
	PERMISSIONITEM("22"),
	PERMISSIONTOPERMISSIONITEM("23"),
	SCHEDULER("24"),
	SCHEDULERCONFIG("25"),
	SCHEDULERSTATUS("26"),
	SCHEDULERWORKER("27"),
	STORAGEPROFILE("28"),
	SYNDICATIONFEED("29"),
	THUMBPARAMS("31"),
	THUMBPARAMSOUTPUT("32"),
	UPLOADTOKEN("33"),
	USERLOGINDATA("34"),
	USERROLE("35"),
	WIDGET("36"),
	CATEGORYENTRY("37"),
	LIVE_STREAM("38"),
	SERVER_NODE("39"),
	ENTRY_SERVER_NODE("40"),
	REACH_PROFILE("41"),
	ENTRY_VENDOR_TASK("42"),
	GROUPUSER("43"),
	AD_CUE_POINT("adCuePointEventNotifications.AdCuePoint"),
	ANNOTATION("annotationEventNotifications.Annotation"),
	ATTACHMENT_ASSET("attachmentAssetEventNotifications.AttachmentAsset"),
	CAPTION_ASSET("captionAssetEventNotifications.CaptionAsset"),
	CODE_CUE_POINT("codeCuePointEventNotifications.CodeCuePoint"),
	DISTRIBUTION_PROFILE("contentDistributionEventNotifications.DistributionProfile"),
	ENTRY_DISTRIBUTION("contentDistributionEventNotifications.EntryDistribution"),
	CUE_POINT("cuePointEventNotifications.CuePoint"),
	DROP_FOLDER("dropFolderEventNotifications.DropFolder"),
	DROP_FOLDER_FILE("dropFolderEventNotifications.DropFolderFile"),
	METADATA("metadataEventNotifications.Metadata"),
	SCHEDULE_EVENT("scheduleEventNotifications.ScheduleEvent"),
	SCHEDULE_EVENT_RESOURCE("scheduleEventNotifications.ScheduleEventResource"),
	SCHEDULE_RESOURCE("scheduleEventNotifications.ScheduleResource"),
	TRANSCRIPT_ASSET("transcriptAssetEventNotifications.TranscriptAsset"),
	VIRTUAL_EVENT("virtualEventEventNotifications.VirtualEvent");

	private String value;

	EventNotificationEventObjectType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static EventNotificationEventObjectType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over EventNotificationEventObjectType defined values and compare the inner value with the given one:
		for(EventNotificationEventObjectType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return EventNotificationEventObjectType.values().length > 0 ? EventNotificationEventObjectType.values()[0]: null;
   }
}
