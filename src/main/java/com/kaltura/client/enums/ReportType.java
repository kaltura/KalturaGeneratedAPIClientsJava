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
// Copyright (C) 2006-2022  Kaltura Inc.
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
public enum ReportType implements EnumAsString {
	QUIZ("quiz.QUIZ"),
	QUIZ_AGGREGATE_BY_QUESTION("quiz.QUIZ_AGGREGATE_BY_QUESTION"),
	QUIZ_USER_AGGREGATE_BY_QUESTION("quiz.QUIZ_USER_AGGREGATE_BY_QUESTION"),
	QUIZ_USER_PERCENTAGE("quiz.QUIZ_USER_PERCENTAGE"),
	TOP_CONTENT("1"),
	CONTENT_DROPOFF("2"),
	CONTENT_INTERACTIONS("3"),
	MAP_OVERLAY("4"),
	TOP_CONTRIBUTORS("5"),
	TOP_SYNDICATION("6"),
	CONTENT_CONTRIBUTIONS("7"),
	USER_ENGAGEMENT("11"),
	SPECIFIC_USER_ENGAGEMENT("12"),
	USER_TOP_CONTENT("13"),
	USER_CONTENT_DROPOFF("14"),
	USER_CONTENT_INTERACTIONS("15"),
	APPLICATIONS("16"),
	USER_USAGE("17"),
	SPECIFIC_USER_USAGE("18"),
	VAR_USAGE("19"),
	TOP_CREATORS("20"),
	PLATFORMS("21"),
	OPERATING_SYSTEM("22"),
	BROWSERS("23"),
	LIVE("24"),
	TOP_PLAYBACK_CONTEXT("25"),
	VPAAS_USAGE("26"),
	ENTRY_USAGE("27"),
	REACH_USAGE("28"),
	TOP_CUSTOM_VAR1("29"),
	MAP_OVERLAY_CITY("30"),
	OPERATING_SYSTEM_FAMILIES("32"),
	BROWSERS_FAMILIES("33"),
	USER_ENGAGEMENT_TIMELINE("34"),
	UNIQUE_USERS_PLAY("35"),
	MAP_OVERLAY_COUNTRY("36"),
	MAP_OVERLAY_REGION("37"),
	TOP_CONTENT_CREATOR("38"),
	TOP_CONTENT_CONTRIBUTORS("39"),
	APP_DOMAIN_UNIQUE_ACTIVE_USERS("40"),
	TOP_SOURCES("41"),
	VPAAS_USAGE_MULTI("42"),
	PERCENTILES("43"),
	CONTENT_REPORT_REASONS("44"),
	PLAYER_RELATED_INTERACTIONS("45"),
	PLAYBACK_RATE("46"),
	TOP_USER_CONTENT("47"),
	USER_HIGHLIGHTS("48"),
	USER_INTERACTIVE_VIDEO("49"),
	INTERACTIVE_VIDEO_TOP_NODES("50"),
	LATEST_PLAYED_ENTRIES("51"),
	CATEGORY_HIGHLIGHTS("52"),
	SUB_CATEGORIES("53"),
	INTERACTIVE_VIDEO_NODE_TOP_HOTSPOTS("54"),
	INTERCATIVE_VIDEO_NODE_SWITCH_TOP_HOTSPOTS("55"),
	INTERACTIVE_VIDEO_HOTSPOT_CLICKED_PERCENTILES("56"),
	INTERACTIVE_VIDEO_NODE_SWITCH_HOTSPOT_CLICKED_PERCENTILES("57"),
	TOP_CUSTOM_VAR2("58"),
	TOP_CUSTOM_VAR3("59"),
	SELF_SERVE_USAGE("60"),
	FLAVOR_PARAMS_TRANSCODING_USAGE("61"),
	PLAYER_HIGHLIGHTS("62"),
	PARTNER_USAGE_HIGHLIGHTS("63"),
	CDN_BANDWIDTH_USAGE("64"),
	REACH_CATALOG_USAGE("65"),
	REACH_PROFILE_USAGE("66"),
	PARTNER_USAGE("201"),
	MAP_OVERLAY_COUNTRY_REALTIME("10001"),
	MAP_OVERLAY_REGION_REALTIME("10002"),
	MAP_OVERLAY_CITY_REALTIME("10003"),
	PLATFORMS_REALTIME("10004"),
	USERS_OVERVIEW_REALTIME("10005"),
	QOS_OVERVIEW_REALTIME("10006"),
	DISCOVERY_REALTIME("10007"),
	ENTRY_LEVEL_USERS_DISCOVERY_REALTIME("10008"),
	ENTRY_LEVEL_USERS_STATUS_REALTIME("10009"),
	PLATFORMS_DISCOVERY_REALTIME("10010"),
	PLAYBACK_TYPE_REALTIME("10011"),
	CONTENT_REALTIME("10012"),
	DISCOVERY_VIEW_REALTIME("10013"),
	TOP_ENDED_BROADCAST_ENTRIES("10014"),
	TOP_LIVE_NOW_ENTRIES("10015"),
	CONTENT_DROPOFF_VPAAS("20001"),
	TOP_SYNDICATION_VPAAS("20002"),
	USER_TOP_CONTENT_VPAAS("20003"),
	USER_USAGE_VPAAS("20004"),
	PLATFORMS_VPAAS("20005"),
	OPERATING_SYSTEM_VPAAS("20006"),
	BROWSERS_VPAAS("20007"),
	OPERATING_SYSTEM_FAMILIES_VPAAS("20008"),
	BROWSERS_FAMILIES_VPAAS("20009"),
	USER_ENGAGEMENT_TIMELINE_VPAAS("20010"),
	UNIQUE_USERS_PLAY_VPAAS("20011"),
	MAP_OVERLAY_COUNTRY_VPAAS("20012"),
	MAP_OVERLAY_REGION_VPAAS("20013"),
	MAP_OVERLAY_CITY_VPAAS("20014"),
	TOP_CONTENT_CREATOR_VPAAS("20015"),
	TOP_CONTENT_CONTRIBUTORS_VPAAS("20016"),
	TOP_SOURCES_VPAAS("20017"),
	CONTENT_REPORT_REASONS_VPAAS("20018"),
	PLAYER_RELATED_INTERACTIONS_VPAAS("20019"),
	PLAYBACK_RATE_VPAAS("20020"),
	PARTNER_USAGE_VPAAS("20021"),
	TOP_PLAYBACK_CONTEXT_VPAAS("20022"),
	SELF_SERVE_USAGE_VPAAS("20023"),
	QOE_OVERVIEW("30001"),
	QOE_EXPERIENCE("30002"),
	QOE_EXPERIENCE_PLATFORMS("30003"),
	QOE_EXPERIENCE_COUNTRY("30004"),
	QOE_EXPERIENCE_REGION("30005"),
	QOE_EXPERIENCE_CITY("30006"),
	QOE_EXPERIENCE_BROWSERS_FAMILIES("30007"),
	QOE_EXPERIENCE_BROWSERS("30008"),
	QOE_EXPERIENCE_OPERATING_SYSTEM_FAMILIES("30009"),
	QOE_EXPERIENCE_OPERATING_SYSTEM("30010"),
	QOE_EXPERIENCE_PLAYER_VERSION("30011"),
	QOE_EXPERIENCE_ENTRY("30012"),
	QOE_EXPERIENCE_ISP("30013"),
	QOE_ENGAGEMENT("30014"),
	QOE_ENGAGEMENT_PLATFORMS("30015"),
	QOE_ENGAGEMENT_COUNTRY("30016"),
	QOE_ENGAGEMENT_REGION("30017"),
	QOE_ENGAGEMENT_CITY("30018"),
	QOE_ENGAGEMENT_BROWSERS_FAMILIES("30019"),
	QOE_ENGAGEMENT_BROWSERS("30020"),
	QOE_ENGAGEMENT_OPERATING_SYSTEM_FAMILIES("30021"),
	QOE_ENGAGEMENT_OPERATING_SYSTEM("30022"),
	QOE_ENGAGEMENT_PLAYER_VERSION("30023"),
	QOE_ENGAGEMENT_ENTRY("30024"),
	QOE_ENGAGEMENT_ISP("30025"),
	QOE_STREAM_QUALITY("30026"),
	QOE_STREAM_QUALITY_PLATFORMS("30027"),
	QOE_STREAM_QUALITY_COUNTRY("30028"),
	QOE_STREAM_QUALITY_REGION("30029"),
	QOE_STREAM_QUALITY_CITY("30030"),
	QOE_STREAM_QUALITY_BROWSERS_FAMILIES("30031"),
	QOE_STREAM_QUALITY_BROWSERS("30032"),
	QOE_STREAM_QUALITY_OPERATING_SYSTEM_FAMILIES("30033"),
	QOE_STREAM_QUALITY_OPERATING_SYSTEM("30034"),
	QOE_STREAM_QUALITY_PLAYER_VERSION("30035"),
	QOE_STREAM_QUALITY_ENTRY("30036"),
	QOE_STREAM_QUALITY_ISP("30037"),
	QOE_ERROR_TRACKING("30038"),
	QOE_ERROR_TRACKING_CODES("30039"),
	QOE_ERROR_TRACKING_PLATFORMS("30040"),
	QOE_ERROR_TRACKING_BROWSERS_FAMILIES("30041"),
	QOE_ERROR_TRACKING_BROWSERS("30042"),
	QOE_ERROR_TRACKING_OPERATING_SYSTEM_FAMILIES("30043"),
	QOE_ERROR_TRACKING_OPERATING_SYSTEM("30044"),
	QOE_ERROR_TRACKING_PLAYER_VERSION("30045"),
	QOE_ERROR_TRACKING_ENTRY("30046"),
	QOE_VOD_SESSION_FLOW("30047"),
	QOE_LIVE_SESSION_FLOW("30048"),
	QOE_EXPERIENCE_CUSTOM_VAR1("30049"),
	QOE_EXPERIENCE_CUSTOM_VAR2("30050"),
	QOE_EXPERIENCE_CUSTOM_VAR3("30051"),
	QOE_ENGAGEMENT_CUSTOM_VAR1("30052"),
	QOE_ENGAGEMENT_CUSTOM_VAR2("30053"),
	QOE_ENGAGEMENT_CUSTOM_VAR3("30054"),
	QOE_STREAM_QUALITY_CUSTOM_VAR1("30055"),
	QOE_STREAM_QUALITY_CUSTOM_VAR2("30056"),
	QOE_STREAM_QUALITY_CUSTOM_VAR3("30057"),
	QOE_ERROR_TRACKING_CUSTOM_VAR1("30058"),
	QOE_ERROR_TRACKING_CUSTOM_VAR2("30059"),
	QOE_ERROR_TRACKING_CUSTOM_VAR3("30060"),
	QOE_EXPERIENCE_APPLICATION_VERSION("30061"),
	QOE_ENGAGEMENT_APPLICATION_VERSION("30062"),
	QOE_STREAM_QUALITY_APPLICATION_VERSION("30063"),
	QOE_ERROR_TRACKING_APPLICATION_VERSION("30064"),
	HIGHLIGHTS_WEBCAST("40001"),
	ENGAGEMENT_WEBCAST("40002"),
	QUALITY_WEBCAST("40003"),
	MAP_OVERLAY_COUNTRY_WEBCAST("40004"),
	MAP_OVERLAY_REGION_WEBCAST("40005"),
	MAP_OVERLAY_CITY_WEBCAST("40006"),
	PLATFORMS_WEBCAST("40007"),
	TOP_DOMAINS_WEBCAST("40008"),
	TOP_USERS_WEBCAST("40009"),
	ENGAGEMENT_BREAKDOWN_WEBCAST("40010"),
	ENGAGMENT_TIMELINE_WEBCAST("40011"),
	ENGAGEMENT_TOOLS_WEBCAST("40012"),
	REACTIONS_BREAKDOWN_WEBCAST("40013"),
	VE_HIGHLIGHTS("50000"),
	VE_REGISTERED_PLATFORMS("50001"),
	VE_REGISTERED_INDUSTRY("50002"),
	VE_REGISTERED_ROLES("50003"),
	VE_REGISTERED_COUNTRIES("50004"),
	VE_REGISTERED_WORLD_REGIONS("50005");

	private String value;

	ReportType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ReportType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ReportType defined values and compare the inner value with the given one:
		for(ReportType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ReportType.values().length > 0 ? ReportType.values()[0]: null;
   }
}
