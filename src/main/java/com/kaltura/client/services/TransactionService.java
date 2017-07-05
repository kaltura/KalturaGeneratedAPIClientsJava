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
import com.kaltura.client.types.ExternalReceipt;
import com.kaltura.client.types.Purchase;
import com.kaltura.client.types.PurchaseSession;
import com.kaltura.client.types.Transaction;
import com.kaltura.client.types.TransactionStatus;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class TransactionService {

	/**  Retrieve the purchase session identifier  */
    public static RequestBuilder<Long> getPurchaseSessionId(PurchaseSession purchaseSession)  {
        Params kparams = new Params();
        kparams.add("purchaseSession", purchaseSession);

        return new RequestBuilder<Long>(Long.class, "transaction", "getPurchaseSessionId", kparams);
    }

	/**  Purchase specific product or subscription for a household. Upon successful
	  charge entitlements to use the requested product or subscription are granted.  */
    public static RequestBuilder<Transaction> purchase(Purchase purchase)  {
        Params kparams = new Params();
        kparams.add("purchase", purchase);

        return new RequestBuilder<Transaction>(Transaction.class, "transaction", "purchase", kparams);
    }

	/**  This method shall set the waiver flag on the user entitlement table and the
	  waiver date field to the current date.  */
    public static RequestBuilder<Boolean> setWaiver(int assetId, TransactionType transactionType)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("transactionType", transactionType);

        return new RequestBuilder<Boolean>(Boolean.class, "transaction", "setWaiver", kparams);
    }

	/**  Updates a pending purchase transaction state.  */
    public static RequestBuilder<Void> updateStatus(String paymentGatewayId, String externalTransactionId, String signature, TransactionStatus status)  {
        Params kparams = new Params();
        kparams.add("paymentGatewayId", paymentGatewayId);
        kparams.add("externalTransactionId", externalTransactionId);
        kparams.add("signature", signature);
        kparams.add("status", status);

        return new NullRequestBuilder("transaction", "updateStatus", kparams);
    }

	/**  Verifies PPV/Subscription/Collection client purchase (such as InApp) and
	  entitles the user.  */
    public static RequestBuilder<Transaction> validateReceipt(ExternalReceipt externalReceipt)  {
        Params kparams = new Params();
        kparams.add("externalReceipt", externalReceipt);

        return new RequestBuilder<Transaction>(Transaction.class, "transaction", "validateReceipt", kparams);
    }
}
