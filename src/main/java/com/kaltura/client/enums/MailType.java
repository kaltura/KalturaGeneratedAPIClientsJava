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
public enum MailType implements EnumAsString {
	MAIL_TYPE_KALTURA_NEWSLETTER("10"),
	MAIL_TYPE_ADDED_TO_FAVORITES("11"),
	MAIL_TYPE_ADDED_TO_CLIP_FAVORITES("12"),
	MAIL_TYPE_NEW_COMMENT_IN_PROFILE("13"),
	MAIL_TYPE_CLIP_ADDED_YOUR_KALTURA("20"),
	MAIL_TYPE_VIDEO_ADDED("21"),
	MAIL_TYPE_ROUGHCUT_CREATED("22"),
	MAIL_TYPE_ADDED_KALTURA_TO_YOUR_FAVORITES("23"),
	MAIL_TYPE_NEW_COMMENT_IN_KALTURA("24"),
	MAIL_TYPE_CLIP_ADDED("30"),
	MAIL_TYPE_VIDEO_CREATED("31"),
	MAIL_TYPE_ADDED_KALTURA_TO_HIS_FAVORITES("32"),
	MAIL_TYPE_NEW_COMMENT_IN_KALTURA_YOU_CONTRIBUTED("33"),
	MAIL_TYPE_CLIP_CONTRIBUTED("40"),
	MAIL_TYPE_ROUGHCUT_CREATED_SUBSCRIBED("41"),
	MAIL_TYPE_ADDED_KALTURA_TO_HIS_FAVORITES_SUBSCRIBED("42"),
	MAIL_TYPE_NEW_COMMENT_IN_KALTURA_YOU_SUBSCRIBED("43"),
	MAIL_TYPE_REGISTER_CONFIRM("50"),
	MAIL_TYPE_PASSWORD_RESET("51"),
	MAIL_TYPE_LOGIN_MAIL_RESET("52"),
	MAIL_TYPE_REGISTER_CONFIRM_VIDEO_SERVICE("54"),
	MAIL_TYPE_VIDEO_READY("60"),
	MAIL_TYPE_VIDEO_IS_READY("62"),
	MAIL_TYPE_BULK_DOWNLOAD_READY("63"),
	MAIL_TYPE_BULKUPLOAD_FINISHED("64"),
	MAIL_TYPE_BULKUPLOAD_FAILED("65"),
	MAIL_TYPE_BULKUPLOAD_ABORTED("66"),
	MAIL_TYPE_NOTIFY_ERR("70"),
	MAIL_TYPE_ACCOUNT_UPGRADE_CONFIRM("80"),
	MAIL_TYPE_VIDEO_SERVICE_NOTICE("81"),
	MAIL_TYPE_VIDEO_SERVICE_NOTICE_LIMIT_REACHED("82"),
	MAIL_TYPE_VIDEO_SERVICE_NOTICE_ACCOUNT_LOCKED("83"),
	MAIL_TYPE_VIDEO_SERVICE_NOTICE_ACCOUNT_DELETED("84"),
	MAIL_TYPE_VIDEO_SERVICE_NOTICE_UPGRADE_OFFER("85"),
	MAIL_TYPE_ACCOUNT_REACTIVE_CONFIRM("86"),
	MAIL_TYPE_EXTENDED_FREE_TRIAL_ENDS_WARNING("87"),
	MAIL_TYPE_SYSTEM_USER_RESET_PASSWORD("110"),
	MAIL_TYPE_SYSTEM_USER_RESET_PASSWORD_SUCCESS("111"),
	MAIL_TYPE_SYSTEM_USER_NEW_PASSWORD("112"),
	MAIL_TYPE_SYSTEM_USER_CREDENTIALS_SAVED("113"),
	MAIL_TYPE_LIVE_REPORT_EXPORT_SUCCESS("130"),
	MAIL_TYPE_LIVE_REPORT_EXPORT_FAILURE("131"),
	MAIL_TYPE_LIVE_REPORT_EXPORT_ABORT("132"),
	MAIL_TYPE_USERS_CSV("133"),
	MAIL_TYPE_OBJECTS_CSV("135"),
	MAIL_TYPE_REPORT_EXPORT_SUCCESS("136"),
	MAIL_TYPE_REPORT_EXPORT_FAILURE("137"),
	MAIL_TYPE_REPORT_EXPORT_ABORT("138"),
	MAIL_TYPE_SIP_FAILURE("139");

	private String value;

	MailType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static MailType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over MailType defined values and compare the inner value with the given one:
		for(MailType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return MailType.values().length > 0 ? MailType.values()[0]: null;
   }
}
