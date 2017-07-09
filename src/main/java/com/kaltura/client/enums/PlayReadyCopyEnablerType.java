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
public enum PlayReadyCopyEnablerType implements EnumAsString {
    CSS("3CAF2814-A7AB-467C-B4DF-54ACC56C66DC"),
    PRINTER("3CF2E054-F4D5-46cd-85A6-FCD152AD5FBE"),
    DEVICE("6848955D-516B-4EB0-90E8-8F6D5A77B85F"),
    CLIPBOARD("6E76C588-C3A9-47ea-A875-546D5209FF38"),
    SDC("79F78A0D-0B69-401e-8A90-8BEF30BCE192"),
    SDC_PREVIEW("81BD9AD4-A720-4ea1-B510-5D4E6FFB6A4D"),
    AACS("C3CF56E0-7FF2-4491-809F-53E21D3ABF07"),
    HELIX("CCB0B4E3-8B46-409e-A998-82556E3F5AF4"),
    CPRM("CDD801AD-A577-48DB-950E-46D5F1592FAE"),
    PC("CE480EDE-516B-40B3-90E1-D6CFC47630C5"),
    SDC_LIMITED("E6785609-64CC-4bfa-B82D-6B619733B746"),
    ORANGE_BOOK_CD("EC930B7D-1F2D-4682-A38B-8AB977721D0D");

    private String value;

    PlayReadyCopyEnablerType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PlayReadyCopyEnablerType get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over PlayReadyCopyEnablerType defined values and compare the inner value with the given one:
        for(PlayReadyCopyEnablerType item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return PlayReadyCopyEnablerType.values().length > 0 ? PlayReadyCopyEnablerType.values()[0]: null;
   }
}
