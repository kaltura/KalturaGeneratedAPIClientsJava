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
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Purchase extends PurchaseBase {

	/**  Identifier for paying currency, according to ISO 4217  */
    private String currency;
	/**  Net sum to charge – as a one-time transaction. Price must match the previously
	  provided price for the specified content.  */
    private Double price;
	/**  Identifier for a pre-entered payment method. If not provided – the
	  household’s default payment method is used  */
    private Integer paymentMethodId;
	/**  Identifier for a pre-associated payment gateway. If not provided – the
	  account’s default payment gateway is used  */
    private Integer paymentGatewayId;
	/**  Coupon code  */
    private String coupon;

    // currency:
    public String getCurrency(){
        return this.currency;
    }
    public void setCurrency(String currency){
        this.currency = currency;
    }

    // price:
    public Double getPrice(){
        return this.price;
    }
    public void setPrice(Double price){
        this.price = price;
    }

    // paymentMethodId:
    public Integer getPaymentMethodId(){
        return this.paymentMethodId;
    }
    public void setPaymentMethodId(Integer paymentMethodId){
        this.paymentMethodId = paymentMethodId;
    }

    // paymentGatewayId:
    public Integer getPaymentGatewayId(){
        return this.paymentGatewayId;
    }
    public void setPaymentGatewayId(Integer paymentGatewayId){
        this.paymentGatewayId = paymentGatewayId;
    }

    // coupon:
    public String getCoupon(){
        return this.coupon;
    }
    public void setCoupon(String coupon){
        this.coupon = coupon;
    }


    public Purchase() {
       super();
    }

    public Purchase(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        currency = GsonParser.parseString(jsonObject.get("currency"));
        price = GsonParser.parseDouble(jsonObject.get("price"));
        paymentMethodId = GsonParser.parseInt(jsonObject.get("paymentMethodId"));
        paymentGatewayId = GsonParser.parseInt(jsonObject.get("paymentGatewayId"));
        coupon = GsonParser.parseString(jsonObject.get("coupon"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPurchase");
        kparams.add("currency", this.currency);
        kparams.add("price", this.price);
        kparams.add("paymentMethodId", this.paymentMethodId);
        kparams.add("paymentGatewayId", this.paymentGatewayId);
        kparams.add("coupon", this.coupon);
        return kparams;
    }

}

