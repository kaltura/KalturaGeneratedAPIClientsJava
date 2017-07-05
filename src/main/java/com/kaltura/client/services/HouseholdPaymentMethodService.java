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
package com.kaltura.client.services;

import com.kaltura.client.Params;
import com.kaltura.client.types.HouseholdPaymentMethod;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HouseholdPaymentMethodService {

	/**  Force remove of a payment method of the household.  */
    public static RequestBuilder<Boolean> forceRemove(int paymentGatewayId, int paymentMethodId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("paymentMethodId", paymentMethodId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentmethod", "forceRemove", kparams);
    }

	/**  Get a list of all configured Payment Gateways providers available for the
	  account. For each payment is provided with the household associated payment
	  methods.  */
    public static RequestBuilder<ListResponse<HouseholdPaymentMethod>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<HouseholdPaymentMethod>(HouseholdPaymentMethod.class, "householdpaymentmethod", "list", kparams);
    }

	/**  Removes a payment method of the household.  */
    public static RequestBuilder<Boolean> remove(int paymentGatewayId, int paymentMethodId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("paymentMethodId", paymentMethodId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentmethod", "remove", kparams);
    }

	/**  Set a payment method as default for the household.  */
    public static RequestBuilder<Boolean> setAsDefault(int paymentGatewayId, int paymentMethodId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("paymentMethodId", paymentMethodId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentmethod", "setAsDefault", kparams);
    }
}
