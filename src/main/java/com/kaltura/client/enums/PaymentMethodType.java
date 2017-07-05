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
public enum PaymentMethodType implements EnumAsString {
    UNKNOWN("unknown"),
    CREDIT_CARD("credit_card"),
    SMS("sms"),
    PAY_PAL("pay_pal"),
    DEBIT_CARD("debit_card"),
    IDEAL("ideal"),
    INCASO("incaso"),
    GIFT("gift"),
    VISA("visa"),
    MASTER_CARD("master_card"),
    IN_APP("in_app"),
    M1("m1"),
    CHANGE_SUBSCRIPTION("change_subscription"),
    OFFLINE("offline");

    private String value;

    PaymentMethodType(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public static PaymentMethodType get(String value) {
        if(value == null)
        {
        	return null;
        }
        
        // goes over PaymentMethodType defined values and compare the inner value with the given one:
        for(PaymentMethodType item: values()) {
            if(item.getValue().equals(value)) {
                return item;
            }
        }
        // in case the requested value was not found in the enum values, we return the first item as default.
        return PaymentMethodType.values().length > 0 ? PaymentMethodType.values()[0]: null;
   }
}
