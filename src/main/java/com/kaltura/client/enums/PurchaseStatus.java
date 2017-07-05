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
public enum PurchaseStatus implements EnumAsString {
    PPV_PURCHASED("ppv_purchased"),
    FREE("free"),
    FOR_PURCHASE_SUBSCRIPTION_ONLY("for_purchase_subscription_only"),
    SUBSCRIPTION_PURCHASED("subscription_purchased"),
    FOR_PURCHASE("for_purchase"),
    SUBSCRIPTION_PURCHASED_WRONG_CURRENCY("subscription_purchased_wrong_currency"),
    PRE_PAID_PURCHASED("pre_paid_purchased"),
    GEO_COMMERCE_BLOCKED("geo_commerce_blocked"),
    ENTITLED_TO_PREVIEW_MODULE("entitled_to_preview_module"),
    FIRST_DEVICE_LIMITATION("first_device_limitation"),
    COLLECTION_PURCHASED("collection_purchased"),
    USER_SUSPENDED("user_suspended"),
    NOT_FOR_PURCHASE("not_for_purchase");

    private String value;

    PurchaseStatus(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PurchaseStatus get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over PurchaseStatus defined values and compare the inner value with the given one:
        for(PurchaseStatus item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return PurchaseStatus.values().length > 0 ? PurchaseStatus.values()[0]: null;
   }
}
