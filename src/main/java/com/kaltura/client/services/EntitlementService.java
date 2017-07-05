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
import com.kaltura.client.enums.TransactionType;
import com.kaltura.client.types.Entitlement;
import com.kaltura.client.types.EntitlementFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class EntitlementService {

	/**  Immediately cancel a subscription, PPV or collection. Cancel is possible only if
	  within cancellation window and content not already consumed  */
    public static RequestBuilder<Boolean> cancel(int assetId, TransactionType transactionType)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("transactionType", transactionType);

        return new RequestBuilder<Boolean>(Boolean.class, "entitlement", "cancel", kparams);
    }

	/**  Cancel a household service subscription at the next renewal. The subscription
	  stays valid till the next renewal.  */
    public static RequestBuilder<Void> cancelRenewal(String subscriptionId)  {
        Params kparams = new Params();
        kparams.add("subscriptionId", subscriptionId);

        return new NullRequestBuilder("entitlement", "cancelRenewal", kparams);
    }

	/**  Reconcile the user household&amp;#39;s entitlements with an external
	  entitlements source. This request is frequency protected to avoid too frequent
	  calls per household.  */
    public static RequestBuilder<Boolean> externalReconcile()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "entitlement", "externalReconcile", kparams);
    }

	/**  Immediately cancel a subscription, PPV or collection. Cancel applies regardless
	  of cancellation window and content consumption status  */
    public static RequestBuilder<Boolean> forceCancel(int assetId, TransactionType transactionType)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("transactionType", transactionType);

        return new RequestBuilder<Boolean>(Boolean.class, "entitlement", "forceCancel", kparams);
    }

    public static RequestBuilder<Boolean> grant(int productId, TransactionType productType, boolean history)  {
        return grant(productId, productType, history, 0);
    }

	/**  Grant household for an entitlement for a PPV or Subscription.  */
    public static RequestBuilder<Boolean> grant(int productId, TransactionType productType, boolean history, int contentId)  {
        Params kparams = new Params();
        kparams.add("productId", productId);
        kparams.add("productType", productType);
        kparams.add("history", history);
        kparams.add("contentId", contentId);

        return new RequestBuilder<Boolean>(Boolean.class, "entitlement", "grant", kparams);
    }

    public static RequestBuilder<ListResponse<Entitlement>> list(EntitlementFilter filter)  {
        return list(filter, null);
    }

	/**  Gets all the entitled media items for a household  */
    public static RequestBuilder<ListResponse<Entitlement>> list(EntitlementFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Entitlement>(Entitlement.class, "entitlement", "list", kparams);
    }
}
