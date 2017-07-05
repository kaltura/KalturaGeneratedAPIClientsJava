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
import com.kaltura.client.types.DeliveryProfile;
import com.kaltura.client.types.DeliveryProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  delivery service is used to control delivery objects  */
public class DeliveryProfileService {

	/**  Add new delivery.  */
    public static RequestBuilder<DeliveryProfile> add(DeliveryProfile delivery)  {
        Params kparams = new Params();
        kparams.add("delivery", delivery);

        return new RequestBuilder<DeliveryProfile>(DeliveryProfile.class, "deliveryprofile", "add", kparams);
    }

	/**  Add delivery based on existing delivery.  Must provide valid sourceDeliveryId  */
    public static RequestBuilder<DeliveryProfile> clone(int deliveryId)  {
        Params kparams = new Params();
        kparams.add("deliveryId", deliveryId);

        return new RequestBuilder<DeliveryProfile>(DeliveryProfile.class, "deliveryprofile", "clone", kparams);
    }

	/**  Get delivery by id  */
    public static RequestBuilder<DeliveryProfile> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<DeliveryProfile>(DeliveryProfile.class, "deliveryprofile", "get", kparams);
    }

    public static RequestBuilder<ListResponse<DeliveryProfile>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<DeliveryProfile>> list(DeliveryProfileFilter filter)  {
        return list(filter, null);
    }

	/**  Retrieve a list of available delivery depends on the filter given  */
    public static RequestBuilder<ListResponse<DeliveryProfile>> list(DeliveryProfileFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<DeliveryProfile>(DeliveryProfile.class, "deliveryprofile", "list", kparams);
    }

	/**  Update exisiting delivery  */
    public static RequestBuilder<DeliveryProfile> update(String id, DeliveryProfile delivery)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("delivery", delivery);

        return new RequestBuilder<DeliveryProfile>(DeliveryProfile.class, "deliveryprofile", "update", kparams);
    }
}
