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
// Copyright (C) 2006-2020  Kaltura Inc.
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
public enum CatalogItemLanguage implements EnumAsString {
	AR("Arabic"),
	YUE("Cantonese"),
	ZH("Chinese"),
	DA("Danish"),
	NL("Dutch"),
	EN("English"),
	EN_US("English (American)"),
	EN_GB("English (British)"),
	FI("Finnish"),
	FR("French"),
	FR_CA("French (Canada)"),
	GD("Gaelic (Scottish)"),
	DE("German"),
	EL("Greek"),
	HE("Hebrew"),
	HI("Hindi"),
	HU("Hungarian"),
	IS("Icelandic"),
	IN("Indonesian"),
	GA("Irish"),
	IT("Italian"),
	JA("Japanese"),
	KO("Korean"),
	ML("Malayalam"),
	CMN("Mandarin Chinese"),
	NO("Norwegian"),
	PL("Polish"),
	PT("Portuguese"),
	PT_BR("Portuguese (Brazil)"),
	RO("Romanian"),
	RU("Russian"),
	ES("Spanish"),
	ES_XL("Spanish (Latin America)"),
	SV("Swedish"),
	ZH_TW("Taiwanese Mandarin"),
	TA("Tamil"),
	TH("Thai"),
	TR("Turkish"),
	UK("Ukrainian"),
	UR("Urdu"),
	VI("Vietnamese"),
	CY("Welsh"),
	ZU("Zulu");

	private String value;

	CatalogItemLanguage(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static CatalogItemLanguage get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over CatalogItemLanguage defined values and compare the inner value with the given one:
		for(CatalogItemLanguage item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return CatalogItemLanguage.values().length > 0 ? CatalogItemLanguage.values()[0]: null;
   }
}
