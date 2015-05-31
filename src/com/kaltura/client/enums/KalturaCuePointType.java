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
 * @date Sun, 31 May 15 06:03:12 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaCuePointType implements KalturaEnumAsString {
    AD ("adCuePoint.Ad"),
    ANNOTATION ("annotation.Annotation"),
    CODE ("codeCuePoint.Code"),
    EVENT ("eventCuePoint.Event");

    public String hashCode;

    KalturaCuePointType(String hashCode) {
        this.hashCode = hashCode;
    }

    public String getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(String hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaCuePointType get(String hashCode) {
        if (hashCode.equals("adCuePoint.Ad"))
        {
           return AD;
        }
        else 
        if (hashCode.equals("annotation.Annotation"))
        {
           return ANNOTATION;
        }
        else 
        if (hashCode.equals("codeCuePoint.Code"))
        {
           return CODE;
        }
        else 
        if (hashCode.equals("eventCuePoint.Event"))
        {
           return EVENT;
        }
        else 
        {
           return AD;
        }
    }
}
