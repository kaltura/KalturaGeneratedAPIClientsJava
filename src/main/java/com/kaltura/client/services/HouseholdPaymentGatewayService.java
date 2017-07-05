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
import com.kaltura.client.types.HouseholdPaymentGateway;
import com.kaltura.client.types.KeyValue;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PaymentGatewayConfiguration;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HouseholdPaymentGatewayService {

	/**  Disable payment-gateway on the household  */
    public static RequestBuilder<Boolean> delete(int paymentGatewayId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentgateway", "delete", kparams);
    }

	/**  Enable a payment-gateway provider for the household.  */
    public static RequestBuilder<Boolean> set(int paymentGatewayId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentgateway", "set", kparams);
    }

	/**  Get a household’s billing account identifier (charge ID) for a given payment
	  gateway  */
    public static RequestBuilder<String> getChargeID(String paymentGatewayExternalId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayExternalId", paymentGatewayExternalId);

        return new RequestBuilder<String>(String.class, "householdpaymentgateway", "getChargeID", kparams);
    }

	/**  Gets the Payment Gateway Configuration for the payment gateway identifier given  */
    public static RequestBuilder<PaymentGatewayConfiguration> invoke(int paymentGatewayId, String intent, List<KeyValue> extraParameters)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("intent", intent);
        kparams.add("extraParameters", extraParameters);

        return new RequestBuilder<PaymentGatewayConfiguration>(PaymentGatewayConfiguration.class, "householdpaymentgateway", "invoke", kparams);
    }

	/**  Get a list of all configured Payment Gateways providers available for the
	  account. For each payment is provided with the household associated payment
	  methods.  */
    public static RequestBuilder<ListResponse<HouseholdPaymentGateway>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<HouseholdPaymentGateway>(HouseholdPaymentGateway.class, "householdpaymentgateway", "list", kparams);
    }

	/**  Set user billing account identifier (charge ID), for a specific household and a
	  specific payment gateway  */
    public static RequestBuilder<Boolean> setChargeID(String paymentGatewayExternalId, String chargeId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayExternalId", paymentGatewayExternalId);
        kparams.add("chargeId", chargeId);

        return new RequestBuilder<Boolean>(Boolean.class, "householdpaymentgateway", "setChargeID", kparams);
    }
}
