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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum Language implements EnumAsString {
	AB("Abkhazian"),
	AA("Afar"),
	AF("Afrikaans"),
	SQ("Albanian"),
	AM("Amharic"),
	AR("Arabic"),
	HY("Armenian"),
	AS_("Assamese"),
	AY("Aymara"),
	AZ("Azerbaijani"),
	BA("Bashkir"),
	EU("Basque"),
	BN("Bengali (Bangla)"),
	DZ("Bhutani"),
	BH("Bihari"),
	BI("Bislama"),
	BR("Breton"),
	BG("Bulgarian"),
	MY("Burmese"),
	BE("Byelorussian (Belarusian)"),
	KM("Cambodian"),
	CA("Catalan"),
	ZH("Chinese"),
	CO("Corsican"),
	HR("Croatian"),
	CS("Czech"),
	DA("Danish"),
	NL("Dutch"),
	EN("English"),
	EN_US("English (American)"),
	EN_GB("English (British)"),
	EO("Esperanto"),
	ET("Estonian"),
	FO("Faeroese"),
	FA("Farsi"),
	FJ("Fiji"),
	FI("Finnish"),
	FR("French"),
	FY("Frisian"),
	GV("Gaelic (Manx)"),
	GD("Gaelic (Scottish)"),
	GL("Galician"),
	KA("Georgian"),
	DE("German"),
	EL("Greek"),
	KL("Greenlandic"),
	GN("Guarani"),
	GU("Gujarati"),
	HA("Hausa"),
	IW("Hebrew"),
	HI("Hindi"),
	HU("Hungarian"),
	IS("Icelandic"),
	IN("Indonesian"),
	IA("Interlingua"),
	IE("Interlingue"),
	IU("Inuktitut"),
	IK("Inupiak"),
	GA("Irish"),
	IT("Italian"),
	JA("Japanese"),
	JV("Javanese"),
	KN("Kannada"),
	KS("Kashmiri"),
	KK("Kazakh"),
	RW("Kinyarwanda (Ruanda)"),
	KY("Kirghiz"),
	RN("Kirundi (Rundi)"),
	KO("Korean"),
	KU("Kurdish"),
	LO("Laothian"),
	LA("Latin"),
	LV("Latvian (Lettish)"),
	LI("Limburgish ( Limburger)"),
	LN("Lingala"),
	LT("Lithuanian"),
	MK("Macedonian"),
	MG("Malagasy"),
	MS("Malay"),
	ML("Malayalam"),
	MT("Maltese"),
	MI("Maori"),
	MR("Marathi"),
	MO("Moldavian"),
	MN("Mongolian"),
	MU("Multilingual"),
	NA("Nauru"),
	NE("Nepali"),
	NO("Norwegian"),
	OC("Occitan"),
	OR_("Oriya"),
	OM("Oromo (Afan, Galla)"),
	PS("Pashto (Pushto)"),
	PL("Polish"),
	PT("Portuguese"),
	PA("Punjabi"),
	QU("Quechua"),
	RM("Rhaeto-Romance"),
	RO("Romanian"),
	RU("Russian"),
	SM("Samoan"),
	SG("Sangro"),
	SA("Sanskrit"),
	SR("Serbian"),
	SH("Serbo-Croatian"),
	ST("Sesotho"),
	TN("Setswana"),
	SN("Shona"),
	SD("Sindhi"),
	SI("Sinhalese"),
	SS("Siswati"),
	SK("Slovak"),
	SL("Slovenian"),
	SO("Somali"),
	ES("Spanish"),
	SU("Sundanese"),
	SW("Swahili (Kiswahili)"),
	SV("Swedish"),
	TL("Tagalog"),
	TG("Tajik"),
	TA("Tamil"),
	TT("Tatar"),
	TE("Telugu"),
	TH("Thai"),
	BO("Tibetan"),
	TI("Tigrinya"),
	TO("Tonga"),
	TS("Tsonga"),
	TR("Turkish"),
	TK("Turkmen"),
	TW("Twi"),
	UG("Uighur"),
	UK("Ukrainian"),
	UN("Undefined"),
	UR("Urdu"),
	UZ("Uzbek"),
	VI("Vietnamese"),
	VO("Volapuk"),
	CY("Welsh"),
	WO("Wolof"),
	XH("Xhosa"),
	JI("Yiddish"),
	YO("Yoruba"),
	ZU("Zulu");

	private String value;

	Language(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static Language get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over Language defined values and compare the inner value with the given one:
		for(Language item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return Language.values().length > 0 ? Language.values()[0]: null;
   }
}
