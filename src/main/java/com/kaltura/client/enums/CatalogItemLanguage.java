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
public enum CatalogItemLanguage implements EnumAsString {
	AF("Afrikaans"),
	AR("Arabic"),
	AUTO_DETECT("Auto Detect"),
	AZ("Azerbaijani"),
	BA("Bashkir"),
	EU("Basque"),
	BN("Bengali (Bangla)"),
	BS("Bosnian"),
	BG("Bulgarian"),
	MY("Burmese"),
	BE("Byelorussian (Belarusian)"),
	KM("Cambodian"),
	YUE("Cantonese"),
	CA("Catalan"),
	ZH("Chinese"),
	HR("Croatian"),
	CS("Czech"),
	DA("Danish"),
	NL("Dutch"),
	EN("English"),
	EN_US("English (American)"),
	EN_AU("English (Australian)"),
	EN_GB("English (British)"),
	EO("Esperanto"),
	ET("Estonian"),
	FA("Farsi"),
	FI("Finnish"),
	FR("French"),
	FR_CA("French (Canada)"),
	GD("Gaelic (Scottish)"),
	GL("Galician"),
	KA("Georgian"),
	DE("German"),
	EL("Greek"),
	GU("Gujarati"),
	HE("Hebrew"),
	HI("Hindi"),
	HU("Hungarian"),
	IS("Icelandic"),
	IN("Indonesian"),
	IA("Interlingua"),
	GA("Irish"),
	IT("Italian"),
	JA("Japanese"),
	JV("Javanese"),
	KN("Kannada"),
	KK("Kazakh"),
	KO("Korean"),
	LO("Laothian"),
	LV("Latvian (Lettish)"),
	LT("Lithuanian"),
	MK("Macedonian"),
	MS("Malay"),
	ML("Malayalam"),
	CMN("Mandarin Chinese"),
	MR("Marathi"),
	MN("Mongolian"),
	NE("Nepali"),
	NO("Norwegian"),
	FA_IR("Persian (Iran)"),
	PL("Polish"),
	PT("Portuguese"),
	PT_BR("Portuguese (Brazil)"),
	PA("Punjabi"),
	RO("Romanian"),
	RU("Russian"),
	SR("Serbian"),
	ZH_CN("Simplified Chinese"),
	SI("Sinhalese"),
	SK("Slovak"),
	SK_SK("Slovakian"),
	SL("Slovenian"),
	ES("Spanish"),
	ES_XL("Spanish (Latin America)"),
	SU("Sundanese"),
	SW("Swahili (Kiswahili)"),
	SV("Swedish"),
	TL("Tagalog"),
	ZH_TW("Taiwanese Mandarin"),
	TA("Tamil"),
	TE("Telugu"),
	TH("Thai"),
	ZH_HK("Traditional Chinese"),
	TR("Turkish"),
	UG("Uighur"),
	UK("Ukrainian"),
	UR("Urdu"),
	UZ("Uzbek"),
	VI("Vietnamese"),
	CY("Welsh"),
	XH("Xhosa"),
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
