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
	SPEFICIC_USER_ENGAGEMENT("12"),
	USER_TOP_CONTENT("13"),
	USER_CONTENT_DROPOFF("14"),
	USER_CONTENT_INTERACTIONS("15"),
	APPLICATIONS("16"),
	USER_USAGE("17"),
	SPECIFIC_USER_USAGE("18"),
	VAR_USAGE("19"),
	TOP_CREATORS("20"),
	PLATFORMS("21"),
	OPERATION_SYSTEM("22"),
	BROWSERS("23"),
	LIVE("24"),
	TOP_PLAYBACK_CONTEXT("25"),
	VPAAS_USAGE("26"),
	PARTNER_USAGE("201");

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
