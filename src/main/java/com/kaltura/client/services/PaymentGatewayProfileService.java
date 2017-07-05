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
import com.kaltura.client.types.KeyValue;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PaymentGatewayConfiguration;
import com.kaltura.client.types.PaymentGatewayProfile;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PaymentGatewayProfileService {

	/**  Insert new payment gateway for partner  */
    public static RequestBuilder<PaymentGatewayProfile> add(PaymentGatewayProfile paymentGateway)  {
        Params kparams = new Params();
        kparams.add("paymentGateway", paymentGateway);

        return new RequestBuilder<PaymentGatewayProfile>(PaymentGatewayProfile.class, "paymentgatewayprofile", "add", kparams);
    }

	/**  Delete payment gateway by payment gateway id  */
    public static RequestBuilder<Boolean> delete(int paymentGatewayId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);

        return new RequestBuilder<Boolean>(Boolean.class, "paymentgatewayprofile", "delete", kparams);
    }

	/**  Generate payment gateway shared secret  */
    public static RequestBuilder<PaymentGatewayProfile> generateSharedSecret(int paymentGatewayId)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);

        return new RequestBuilder<PaymentGatewayProfile>(PaymentGatewayProfile.class, "paymentgatewayprofile", "generateSharedSecret", kparams);
    }

	/**  Gets the Payment Gateway Configuration for the payment gateway identifier given  */
    public static RequestBuilder<PaymentGatewayConfiguration> getConfiguration(String alias, String intent, List<KeyValue> extraParameters)  {
        Params kparams = new Params();
        kparams.add("alias", alias);
        kparams.add("intent", intent);
        kparams.add("extraParameters", extraParameters);

        return new RequestBuilder<PaymentGatewayConfiguration>(PaymentGatewayConfiguration.class, "paymentgatewayprofile", "getConfiguration", kparams);
    }

	/**  Returns all payment gateways for partner : id + name  */
    public static RequestBuilder<ListResponse<PaymentGatewayProfile>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<PaymentGatewayProfile>(PaymentGatewayProfile.class, "paymentgatewayprofile", "list", kparams);
    }

	/**  Update payment gateway details  */
    public static RequestBuilder<PaymentGatewayProfile> update(int paymentGatewayId, PaymentGatewayProfile paymentGateway)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("paymentGateway", paymentGateway);

        return new RequestBuilder<PaymentGatewayProfile>(PaymentGatewayProfile.class, "paymentgatewayprofile", "update", kparams);
    }
}
