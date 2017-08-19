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
public enum ITunesSyndicationFeedCategories implements EnumAsString {
	ARTS("Arts"),
	ARTS_DESIGN("Arts/Design"),
	ARTS_FASHION_BEAUTY("Arts/Fashion &amp; Beauty"),
	ARTS_FOOD("Arts/Food"),
	ARTS_LITERATURE("Arts/Literature"),
	ARTS_PERFORMING_ARTS("Arts/Performing Arts"),
	ARTS_VISUAL_ARTS("Arts/Visual Arts"),
	BUSINESS("Business"),
	BUSINESS_BUSINESS_NEWS("Business/Business News"),
	BUSINESS_CAREERS("Business/Careers"),
	BUSINESS_INVESTING("Business/Investing"),
	BUSINESS_MANAGEMENT_MARKETING("Business/Management &amp; Marketing"),
	BUSINESS_SHOPPING("Business/Shopping"),
	COMEDY("Comedy"),
	EDUCATION("Education"),
	EDUCATION_TECHNOLOGY("Education/Education Technology"),
	EDUCATION_HIGHER_EDUCATION("Education/Higher Education"),
	EDUCATION_K_12("Education/K-12"),
	EDUCATION_LANGUAGE_COURSES("Education/Language Courses"),
	EDUCATION_TRAINING("Education/Training"),
	GAMES_HOBBIES("Games &amp; Hobbies"),
	GAMES_HOBBIES_AUTOMOTIVE("Games &amp; Hobbies/Automotive"),
	GAMES_HOBBIES_AVIATION("Games &amp; Hobbies/Aviation"),
	GAMES_HOBBIES_HOBBIES("Games &amp; Hobbies/Hobbies"),
	GAMES_HOBBIES_OTHER_GAMES("Games &amp; Hobbies/Other Games"),
	GAMES_HOBBIES_VIDEO_GAMES("Games &amp; Hobbies/Video Games"),
	GOVERNMENT_ORGANIZATIONS("Government &amp; Organizations"),
	GOVERNMENT_ORGANIZATIONS_LOCAL("Government &amp; Organizations/Local"),
	GOVERNMENT_ORGANIZATIONS_NATIONAL("Government &amp; Organizations/National"),
	GOVERNMENT_ORGANIZATIONS_NON_PROFIT("Government &amp; Organizations/Non-Profit"),
	GOVERNMENT_ORGANIZATIONS_REGIONAL("Government &amp; Organizations/Regional"),
	HEALTH("Health"),
	HEALTH_ALTERNATIVE_HEALTH("Health/Alternative Health"),
	HEALTH_FITNESS_NUTRITION("Health/Fitness &amp; Nutrition"),
	HEALTH_SELF_HELP("Health/Self-Help"),
	HEALTH_SEXUALITY("Health/Sexuality"),
	KIDS_FAMILY("Kids &amp; Family"),
	MUSIC("Music"),
	NEWS_POLITICS("News &amp; Politics"),
	RELIGION_SPIRITUALITY("Religion &amp; Spirituality"),
	RELIGION_SPIRITUALITY_BUDDHISM("Religion &amp; Spirituality/Buddhism"),
	RELIGION_SPIRITUALITY_CHRISTIANITY("Religion &amp; Spirituality/Christianity"),
	RELIGION_SPIRITUALITY_HINDUISM("Religion &amp; Spirituality/Hinduism"),
	RELIGION_SPIRITUALITY_ISLAM("Religion &amp; Spirituality/Islam"),
	RELIGION_SPIRITUALITY_JUDAISM("Religion &amp; Spirituality/Judaism"),
	RELIGION_SPIRITUALITY_OTHER("Religion &amp; Spirituality/Other"),
	RELIGION_SPIRITUALITY_SPIRITUALITY("Religion &amp; Spirituality/Spirituality"),
	SCIENCE_MEDICINE("Science &amp; Medicine"),
	SCIENCE_MEDICINE_MEDICINE("Science &amp; Medicine/Medicine"),
	SCIENCE_MEDICINE_NATURAL_SCIENCES("Science &amp; Medicine/Natural Sciences"),
	SCIENCE_MEDICINE_SOCIAL_SCIENCES("Science &amp; Medicine/Social Sciences"),
	SOCIETY_CULTURE("Society &amp; Culture"),
	SOCIETY_CULTURE_HISTORY("Society &amp; Culture/History"),
	SOCIETY_CULTURE_PERSONAL_JOURNALS("Society &amp; Culture/Personal Journals"),
	SOCIETY_CULTURE_PHILOSOPHY("Society &amp; Culture/Philosophy"),
	SOCIETY_CULTURE_PLACES_TRAVEL("Society &amp; Culture/Places &amp; Travel"),
	SPORTS_RECREATION("Sports &amp; Recreation"),
	SPORTS_RECREATION_AMATEUR("Sports &amp; Recreation/Amateur"),
	SPORTS_RECREATION_COLLEGE_HIGH_SCHOOL("Sports &amp; Recreation/College &amp; High School"),
	SPORTS_RECREATION_OUTDOOR("Sports &amp; Recreation/Outdoor"),
	SPORTS_RECREATION_PROFESSIONAL("Sports &amp; Recreation/Professional"),
	TV_FILM("TV &amp; Film"),
	TECHNOLOGY("Technology"),
	TECHNOLOGY_GADGETS("Technology/Gadgets"),
	TECHNOLOGY_PODCASTING("Technology/Podcasting"),
	TECHNOLOGY_SOFTWARE_HOW_TO("Technology/Software How-To"),
	TECHNOLOGY_TECH_NEWS("Technology/Tech News");

	private String value;

	ITunesSyndicationFeedCategories(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ITunesSyndicationFeedCategories get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ITunesSyndicationFeedCategories defined values and compare the inner value with the given one:
		for(ITunesSyndicationFeedCategories item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ITunesSyndicationFeedCategories.values().length > 0 ? ITunesSyndicationFeedCategories.values()[0]: null;
   }
}
