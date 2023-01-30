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
public enum YahooSyndicationFeedCategories implements EnumAsString {
	ACTION("Action"),
	ANIMALS("Animals"),
	ART_AND_ANIMATION("Art &amp; Animation"),
	COMMERCIALS("Commercials"),
	ENTERTAINMENT_AND_TV("Entertainment &amp; TV"),
	FAMILY("Family"),
	FOOD("Food"),
	FUNNY_VIDEOS("Funny Videos"),
	GAMES("Games"),
	HEALTH_AND_BEAUTY("Health &amp; Beauty"),
	HOW_TO("How-To"),
	MOVIES_AND_SHORTS("Movies &amp; Shorts"),
	MUSIC("Music"),
	NEWS_AND_POLITICS("News &amp; Politics"),
	PEOPLE_AND_VLOGS("People &amp; Vlogs"),
	PRODUCTS_AND_TECH("Products &amp; Tech."),
	SCIENCE_AND_ENVIRONMENT("Science &amp; Environment"),
	SPORTS("Sports"),
	TRANSPORTATION("Transportation"),
	TRAVEL("Travel");

	private String value;

	YahooSyndicationFeedCategories(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static YahooSyndicationFeedCategories get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over YahooSyndicationFeedCategories defined values and compare the inner value with the given one:
		for(YahooSyndicationFeedCategories item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return YahooSyndicationFeedCategories.values().length > 0 ? YahooSyndicationFeedCategories.values()[0]: null;
   }
}
