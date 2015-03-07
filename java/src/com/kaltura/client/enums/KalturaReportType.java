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
 * @date Sat, 07 Mar 15 12:17:53 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum KalturaReportType implements KalturaEnumAsInt {
    TOP_CONTENT (1),
    CONTENT_DROPOFF (2),
    CONTENT_INTERACTIONS (3),
    MAP_OVERLAY (4),
    TOP_CONTRIBUTORS (5),
    TOP_SYNDICATION (6),
    CONTENT_CONTRIBUTIONS (7),
    USER_ENGAGEMENT (11),
    SPEFICIC_USER_ENGAGEMENT (12),
    USER_TOP_CONTENT (13),
    USER_CONTENT_DROPOFF (14),
    USER_CONTENT_INTERACTIONS (15),
    APPLICATIONS (16),
    USER_USAGE (17),
    SPECIFIC_USER_USAGE (18),
    VAR_USAGE (19),
    TOP_CREATORS (20),
    PLATFORMS (21),
    OPERATION_SYSTEM (22),
    BROWSERS (23),
    LIVE (24),
    TOP_PLAYBACK_CONTEXT (25),
    PARTNER_USAGE (201);

    public int hashCode;

    KalturaReportType(int hashCode) {
        this.hashCode = hashCode;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    public void setHashCode(int hashCode) {
        this.hashCode = hashCode;
    }

    public static KalturaReportType get(int hashCode) {
        switch(hashCode) {
            case 1: return TOP_CONTENT;
            case 2: return CONTENT_DROPOFF;
            case 3: return CONTENT_INTERACTIONS;
            case 4: return MAP_OVERLAY;
            case 5: return TOP_CONTRIBUTORS;
            case 6: return TOP_SYNDICATION;
            case 7: return CONTENT_CONTRIBUTIONS;
            case 11: return USER_ENGAGEMENT;
            case 12: return SPEFICIC_USER_ENGAGEMENT;
            case 13: return USER_TOP_CONTENT;
            case 14: return USER_CONTENT_DROPOFF;
            case 15: return USER_CONTENT_INTERACTIONS;
            case 16: return APPLICATIONS;
            case 17: return USER_USAGE;
            case 18: return SPECIFIC_USER_USAGE;
            case 19: return VAR_USAGE;
            case 20: return TOP_CREATORS;
            case 21: return PLATFORMS;
            case 22: return OPERATION_SYSTEM;
            case 23: return BROWSERS;
            case 24: return LIVE;
            case 25: return TOP_PLAYBACK_CONTEXT;
            case 201: return PARTNER_USAGE;
            default: return TOP_CONTENT;
        }
    }
}
