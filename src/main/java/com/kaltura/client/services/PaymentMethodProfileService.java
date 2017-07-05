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
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PaymentMethodProfile;
import com.kaltura.client.types.PaymentMethodProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PaymentMethodProfileService {

	/**  TBD  */
    public static RequestBuilder<PaymentMethodProfile> add(PaymentMethodProfile paymentMethod)  {
        Params kparams = new Params();
        kparams.add("paymentMethod", paymentMethod);

        return new RequestBuilder<PaymentMethodProfile>(PaymentMethodProfile.class, "paymentmethodprofile", "add", kparams);
    }

	/**  Delete payment method profile  */
    public static RequestBuilder<Boolean> delete(int paymentMethodId)  {
        Params kparams = new Params();
        kparams.add("paymentMethodId", paymentMethodId);

        return new RequestBuilder<Boolean>(Boolean.class, "paymentmethodprofile", "delete", kparams);
    }

	/**  TBD  */
    public static RequestBuilder<ListResponse<PaymentMethodProfile>> list(PaymentMethodProfileFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<PaymentMethodProfile>(PaymentMethodProfile.class, "paymentmethodprofile", "list", kparams);
    }

	/**  Update payment method  */
    public static RequestBuilder<PaymentMethodProfile> update(int paymentMethodId, PaymentMethodProfile paymentMethod)  {
        Params kparams = new Params();
        kparams.add("paymentMethodId", paymentMethodId);
        kparams.add("paymentMethod", paymentMethod);

        return new RequestBuilder<PaymentMethodProfile>(PaymentMethodProfile.class, "paymentmethodprofile", "update", kparams);
    }
}
