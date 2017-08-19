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
public enum UiConfObjType implements EnumAsInt {
	PLAYER(1),
	CONTRIBUTION_WIZARD(2),
	SIMPLE_EDITOR(3),
	ADVANCED_EDITOR(4),
	PLAYLIST(5),
	APP_STUDIO(6),
	KRECORD(7),
	PLAYER_V3(8),
	KMC_ACCOUNT(9),
	KMC_ANALYTICS(10),
	KMC_CONTENT(11),
	KMC_DASHBOARD(12),
	KMC_LOGIN(13),
	PLAYER_SL(14),
	CLIENTSIDE_ENCODER(15),
	KMC_GENERAL(16),
	KMC_ROLES_AND_PERMISSIONS(17),
	CLIPPER(18),
	KSR(19),
	KUPLOAD(20),
	WEBCASTING(21);

	private int value;

	UiConfObjType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static UiConfObjType get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over UiConfObjType defined values and compare the inner value with the given one:
		for(UiConfObjType item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return UiConfObjType.values().length > 0 ? UiConfObjType.values()[0]: null;
   }
}
