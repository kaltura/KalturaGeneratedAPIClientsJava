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

import com.google.gson.annotations.SerializedName;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BookmarkActionType implements EnumAsString {
    HIT("HIT"),
    PLAY("PLAY"),
    STOP("STOP"),
    PAUSE("PAUSE"),
    FIRST_PLAY("FIRST_PLAY"),
    SWOOSH("SWOOSH"),
    FULL_SCREEN("FULL_SCREEN"),
    SEND_TO_FRIEND("SEND_TO_FRIEND"),
    LOAD("LOAD"),
    FULL_SCREEN_EXIT("FULL_SCREEN_EXIT"),
    FINISH("FINISH"),
    ERROR("ERROR"),
    BITRATE_CHANGE("BITRATE_CHANGE"),
    NONE("NONE");

    private String value;

    BookmarkActionType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static BookmarkActionType get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over BookmarkActionType defined values and compare the inner value with the given one:
        for(BookmarkActionType item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return BookmarkActionType.values().length > 0 ? BookmarkActionType.values()[0]: null;
   }
}
