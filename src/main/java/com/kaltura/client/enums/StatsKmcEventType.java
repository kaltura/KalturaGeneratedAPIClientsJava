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
public enum StatsKmcEventType implements EnumAsInt {
	CONTENT_PAGE_VIEW(1001),
	CONTENT_ADD_PLAYLIST(1010),
	CONTENT_EDIT_PLAYLIST(1011),
	CONTENT_DELETE_PLAYLIST(1012),
	CONTENT_EDIT_ENTRY(1013),
	CONTENT_CHANGE_THUMBNAIL(1014),
	CONTENT_ADD_TAGS(1015),
	CONTENT_REMOVE_TAGS(1016),
	CONTENT_ADD_ADMIN_TAGS(1017),
	CONTENT_REMOVE_ADMIN_TAGS(1018),
	CONTENT_DOWNLOAD(1019),
	CONTENT_APPROVE_MODERATION(1020),
	CONTENT_REJECT_MODERATION(1021),
	CONTENT_BULK_UPLOAD(1022),
	CONTENT_ADMIN_KCW_UPLOAD(1023),
	ACCOUNT_CHANGE_PARTNER_INFO(1030),
	ACCOUNT_CHANGE_LOGIN_INFO(1031),
	ACCOUNT_CONTACT_US_USAGE(1032),
	ACCOUNT_UPDATE_SERVER_SETTINGS(1033),
	ACCOUNT_ACCOUNT_OVERVIEW(1034),
	ACCOUNT_ACCESS_CONTROL(1035),
	ACCOUNT_TRANSCODING_SETTINGS(1036),
	ACCOUNT_ACCOUNT_UPGRADE(1037),
	ACCOUNT_SAVE_SERVER_SETTINGS(1038),
	ACCOUNT_ACCESS_CONTROL_DELETE(1039),
	ACCOUNT_SAVE_TRANSCODING_SETTINGS(1040),
	LOGIN(1041),
	DASHBOARD_IMPORT_CONTENT(1042),
	DASHBOARD_UPDATE_CONTENT(1043),
	DASHBOARD_ACCOUNT_CONTACT_US(1044),
	DASHBOARD_VIEW_REPORTS(1045),
	DASHBOARD_EMBED_PLAYER(1046),
	DASHBOARD_EMBED_PLAYLIST(1047),
	DASHBOARD_CUSTOMIZE_PLAYERS(1048),
	APP_STUDIO_NEW_PLAYER_SINGLE_VIDEO(1050),
	APP_STUDIO_NEW_PLAYER_PLAYLIST(1051),
	APP_STUDIO_NEW_PLAYER_MULTI_TAB_PLAYLIST(1052),
	APP_STUDIO_EDIT_PLAYER_SINGLE_VIDEO(1053),
	APP_STUDIO_EDIT_PLAYER_PLAYLIST(1054),
	APP_STUDIO_EDIT_PLAYER_MULTI_TAB_PLAYLIST(1055),
	APP_STUDIO_DUPLICATE_PLAYER(1056),
	CONTENT_CONTENT_GO_TO_PAGE(1057),
	CONTENT_DELETE_ITEM(1058),
	CONTENT_DELETE_MIX(1059),
	REPORTS_AND_ANALYTICS_BANDWIDTH_USAGE_TAB(1070),
	REPORTS_AND_ANALYTICS_CONTENT_REPORTS_TAB(1071),
	REPORTS_AND_ANALYTICS_USERS_AND_COMMUNITY_REPORTS_TAB(1072),
	REPORTS_AND_ANALYTICS_TOP_CONTRIBUTORS(1073),
	REPORTS_AND_ANALYTICS_MAP_OVERLAYS(1074),
	REPORTS_AND_ANALYTICS_TOP_SYNDICATIONS(1075),
	REPORTS_AND_ANALYTICS_TOP_CONTENT(1076),
	REPORTS_AND_ANALYTICS_CONTENT_DROPOFF(1077),
	REPORTS_AND_ANALYTICS_CONTENT_INTERACTIONS(1078),
	REPORTS_AND_ANALYTICS_CONTENT_CONTRIBUTIONS(1079),
	REPORTS_AND_ANALYTICS_VIDEO_DRILL_DOWN(1080),
	REPORTS_AND_ANALYTICS_CONTENT_DRILL_DOWN_INTERACTION(1081),
	REPORTS_AND_ANALYTICS_CONTENT_CONTRIBUTIONS_DRILLDOWN(1082),
	REPORTS_AND_ANALYTICS_VIDEO_DRILL_DOWN_DROPOFF(1083),
	REPORTS_AND_ANALYTICS_MAP_OVERLAYS_DRILLDOWN(1084),
	REPORTS_AND_ANALYTICS_TOP_SYNDICATIONS_DRILL_DOWN(1085),
	REPORTS_AND_ANALYTICS_BANDWIDTH_USAGE_VIEW_MONTHLY(1086),
	REPORTS_AND_ANALYTICS_BANDWIDTH_USAGE_VIEW_YEARLY(1087),
	CONTENT_ENTRY_DRILLDOWN(1088),
	CONTENT_OPEN_PREVIEW_AND_EMBED(1089);

	private int value;

	StatsKmcEventType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static StatsKmcEventType get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over StatsKmcEventType defined values and compare the inner value with the given one:
		for(StatsKmcEventType item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return StatsKmcEventType.values().length > 0 ? StatsKmcEventType.values()[0]: null;
   }
}
