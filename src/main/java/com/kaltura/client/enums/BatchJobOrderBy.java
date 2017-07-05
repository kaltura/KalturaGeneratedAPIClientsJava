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
public enum BatchJobOrderBy implements EnumAsString {
    CREATED_AT_ASC("+createdAt"),
    ESTIMATED_EFFORT_ASC("+estimatedEffort"),
    EXECUTION_ATTEMPTS_ASC("+executionAttempts"),
    FINISH_TIME_ASC("+finishTime"),
    LOCK_VERSION_ASC("+lockVersion"),
    PRIORITY_ASC("+priority"),
    QUEUE_TIME_ASC("+queueTime"),
    STATUS_ASC("+status"),
    UPDATED_AT_ASC("+updatedAt"),
    CREATED_AT_DESC("-createdAt"),
    ESTIMATED_EFFORT_DESC("-estimatedEffort"),
    EXECUTION_ATTEMPTS_DESC("-executionAttempts"),
    FINISH_TIME_DESC("-finishTime"),
    LOCK_VERSION_DESC("-lockVersion"),
    PRIORITY_DESC("-priority"),
    QUEUE_TIME_DESC("-queueTime"),
    STATUS_DESC("-status"),
    UPDATED_AT_DESC("-updatedAt");

    private String value;

    BatchJobOrderBy(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static BatchJobOrderBy get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over BatchJobOrderBy defined values and compare the inner value with the given one:
        for(BatchJobOrderBy item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return BatchJobOrderBy.values().length > 0 ? BatchJobOrderBy.values()[0]: null;
   }
}
