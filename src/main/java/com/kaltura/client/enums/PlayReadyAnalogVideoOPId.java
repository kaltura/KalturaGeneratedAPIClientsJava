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
public enum PlayReadyAnalogVideoOPId implements EnumAsString {
    EXPLICIT_ANALOG_TV("2098DE8D-7DDD-4BAB-96C6-32EBB6FABEA3"),
    BEST_EFFORT_EXPLICIT_ANALOG_TV("225CD36F-F132-49EF-BA8C-C91EA28E4369"),
    IMAGE_CONSTRAINT_VIDEO("811C5110-46C8-4C6E-8163-C0482A15D47E"),
    AGC_AND_COLOR_STRIPE("C3FD11C6-F8B7-4D20-B008-1DB17D61F2DA"),
    IMAGE_CONSTRAINT_MONITOR("D783A191-E083-4BAF-B2DA-E69F910B3772");

    private String value;

    PlayReadyAnalogVideoOPId(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PlayReadyAnalogVideoOPId get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over PlayReadyAnalogVideoOPId defined values and compare the inner value with the given one:
        for(PlayReadyAnalogVideoOPId item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return PlayReadyAnalogVideoOPId.values().length > 0 ? PlayReadyAnalogVideoOPId.values()[0]: null;
   }
}
