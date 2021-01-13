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
// Copyright (C) 2006-2021  Kaltura Inc.
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
public enum StatsEventType implements EnumAsInt {
	WIDGET_LOADED(1),
	MEDIA_LOADED(2),
	PLAY(3),
	PLAY_REACHED_25(4),
	PLAY_REACHED_50(5),
	PLAY_REACHED_75(6),
	PLAY_REACHED_100(7),
	OPEN_EDIT(8),
	OPEN_VIRAL(9),
	OPEN_DOWNLOAD(10),
	OPEN_REPORT(11),
	BUFFER_START(12),
	BUFFER_END(13),
	OPEN_FULL_SCREEN(14),
	CLOSE_FULL_SCREEN(15),
	REPLAY(16),
	SEEK(17),
	OPEN_UPLOAD(18),
	SAVE_PUBLISH(19),
	CLOSE_EDITOR(20),
	PRE_BUMPER_PLAYED(21),
	POST_BUMPER_PLAYED(22),
	BUMPER_CLICKED(23),
	PREROLL_STARTED(24),
	MIDROLL_STARTED(25),
	POSTROLL_STARTED(26),
	OVERLAY_STARTED(27),
	PREROLL_CLICKED(28),
	MIDROLL_CLICKED(29),
	POSTROLL_CLICKED(30),
	OVERLAY_CLICKED(31),
	PREROLL_25(32),
	PREROLL_50(33),
	PREROLL_75(34),
	MIDROLL_25(35),
	MIDROLL_50(36),
	MIDROLL_75(37),
	POSTROLL_25(38),
	POSTROLL_50(39),
	POSTROLL_75(40);

	private int value;

	StatsEventType(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static StatsEventType get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over StatsEventType defined values and compare the inner value with the given one:
		for(StatsEventType item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return StatsEventType.values().length > 0 ? StatsEventType.values()[0]: null;
   }
}
