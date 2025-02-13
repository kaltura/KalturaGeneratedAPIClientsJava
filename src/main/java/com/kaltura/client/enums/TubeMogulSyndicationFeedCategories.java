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
public enum TubeMogulSyndicationFeedCategories implements EnumAsString {
	ANIMALS_AND_PETS("Animals &amp; Pets"),
	ARTS_AND_ANIMATION("Arts &amp; Animation"),
	AUTOS("Autos"),
	COMEDY("Comedy"),
	COMMERCIALS_PROMOTIONAL("Commercials/Promotional"),
	ENTERTAINMENT("Entertainment"),
	FAMILY_AND_KIDS("Family &amp; Kids"),
	HOW_TO_INSTRUCTIONAL_DIY("How To/Instructional/DIY"),
	MUSIC("Music"),
	NEWS_AND_BLOGS("News &amp; Blogs"),
	SCIENCE_AND_TECHNOLOGY("Science &amp; Technology"),
	SPORTS("Sports"),
	TRAVEL_AND_PLACES("Travel &amp; Places"),
	VIDEO_GAMES("Video Games"),
	VLOGS_PEOPLE("Vlogs &amp; People");

	private String value;

	TubeMogulSyndicationFeedCategories(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static TubeMogulSyndicationFeedCategories get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over TubeMogulSyndicationFeedCategories defined values and compare the inner value with the given one:
		for(TubeMogulSyndicationFeedCategories item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return TubeMogulSyndicationFeedCategories.values().length > 0 ? TubeMogulSyndicationFeedCategories.values()[0]: null;
   }
}
