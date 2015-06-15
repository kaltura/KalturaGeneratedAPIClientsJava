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
// Copyright (C) 2006-2015  Kaltura Inc.
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
 * @date Mon, 15 Jun 15 00:32:50 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaEntryReplacementStatus implements KalturaEnumAsString {
    NONE ("0"),
    APPROVED_BUT_NOT_READY ("1"),
    READY_BUT_NOT_APPROVED ("2"),
    NOT_READY_AND_NOT_APPROVED ("3"),
    FAILED ("4");

    public String hashCode;

    KalturaEntryReplacementStatus(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaEntryReplacementStatus get(String hashCode) {
        if (hashCode.equals("0"))
        {
           return NONE;
        }
        else 
        if (hashCode.equals("1"))
        {
           return APPROVED_BUT_NOT_READY;
        }
        else 
        if (hashCode.equals("2"))
        {
           return READY_BUT_NOT_APPROVED;
        }
        else 
        if (hashCode.equals("3"))
        {
           return NOT_READY_AND_NOT_APPROVED;
        }
        else 
        if (hashCode.equals("4"))
        {
           return FAILED;
        }
        else 
        {
           return NONE;
        }
    }
}
