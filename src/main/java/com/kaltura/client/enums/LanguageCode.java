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
// Copyright (C) 2006-2019  Kaltura Inc.
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
public enum LanguageCode implements EnumAsString {
	AA("aa"),
	AB("ab"),
	AF("af"),
	AM("am"),
	AR("ar"),
	AS_("as"),
	AY("ay"),
	AZ("az"),
	BA("ba"),
	BE("be"),
	BG("bg"),
	BH("bh"),
	BI("bi"),
	BN("bn"),
	BO("bo"),
	BR("br"),
	CA("ca"),
	CO("co"),
	CS("cs"),
	CY("cy"),
	DA("da"),
	DE("de"),
	DZ("dz"),
	EL("el"),
	EN("en"),
	EN_GB("en_gb"),
	EN_US("en_us"),
	EO("eo"),
	ES("es"),
	ET("et"),
	EU("eu"),
	FA("fa"),
	FI("fi"),
	FJ("fj"),
	FO("fo"),
	FR("fr"),
	FY("fy"),
	GA("ga"),
	GD("gd"),
	GL("gl"),
	GN("gn"),
	GU("gu"),
	GV("gv"),
	HA("ha"),
	HE("he"),
	HI("hi"),
	HR("hr"),
	HU("hu"),
	HY("hy"),
	IA("ia"),
	ID("id"),
	IE("ie"),
	IK("ik"),
	IN("in"),
	IS("is"),
	IT("it"),
	IU("iu"),
	IW("iw"),
	JA("ja"),
	JI("ji"),
	JV("jv"),
	KA("ka"),
	KK("kk"),
	KL("kl"),
	KM("km"),
	KN("kn"),
	KO("ko"),
	KS("ks"),
	KU("ku"),
	KY("ky"),
	LA("la"),
	LB("lb"),
	LI("li"),
	LN("ln"),
	LO("lo"),
	LT("lt"),
	LV("lv"),
	MG("mg"),
	MI("mi"),
	MK("mk"),
	ML("ml"),
	MN("mn"),
	MO("mo"),
	MR("mr"),
	MS("ms"),
	MT("mt"),
	MU("multilingual"),
	MY("my"),
	NA("na"),
	NE("ne"),
	NL("nl"),
	NO("no"),
	OC("oc"),
	OM("om"),
	OR_("or"),
	PA("pa"),
	PL("pl"),
	PS("ps"),
	PT("pt"),
	QU("qu"),
	RM("rm"),
	RN("rn"),
	RO("ro"),
	RU("ru"),
	RW("rw"),
	SA("sa"),
	SD("sd"),
	SG("sg"),
	SH("sh"),
	SI("si"),
	SK("sk"),
	SL("sl"),
	SM("sm"),
	SN("sn"),
	SO("so"),
	SQ("sq"),
	SR("sr"),
	SS("ss"),
	ST("st"),
	SU("su"),
	SV("sv"),
	SW("sw"),
	TA("ta"),
	TE("te"),
	TG("tg"),
	TH("th"),
	TI("ti"),
	TK("tk"),
	TL("tl"),
	TN("tn"),
	TO("to"),
	TR("tr"),
	TS("ts"),
	TT("tt"),
	TW("tw"),
	UG("ug"),
	UK("uk"),
	UR("ur"),
	UZ("uz"),
	VI("vi"),
	VO("vo"),
	WO("wo"),
	XH("xh"),
	YI("yi"),
	YO("yo"),
	ZH("zh"),
	ZU("zu");

	private String value;

	LanguageCode(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static LanguageCode get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over LanguageCode defined values and compare the inner value with the given one:
		for(LanguageCode item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return LanguageCode.values().length > 0 ? LanguageCode.values()[0]: null;
   }
}
