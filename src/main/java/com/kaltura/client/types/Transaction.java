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
import com.kaltura.client.types.ObjectBase;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class Transaction extends ObjectBase {

	/**  Kaltura unique ID representing the transaction  */
    private String id;
	/**  Transaction reference ID received from the payment gateway.               Value
	  is available only if the payment gateway provides this information.  */
    private String paymentGatewayReferenceId;
	/**  Response ID received from by the payment gateway.               Value is
	  available only if the payment gateway provides this information.  */
    private String paymentGatewayResponseId;
	/**  Transaction state: OK/Pending/Failed  */
    private String state;
	/**  Adapter failure reason code              Insufficient funds = 20, Invalid
	  account = 21, User unknown = 22, Reason unknown = 23, Unknown payment gateway
	  response = 24,              No response from payment gateway = 25, Exceeded
	  retry limit = 26, Illegal client request = 27, Expired = 28  */
    private Integer failReasonCode;
	/**  Entitlement creation date  */
    private Integer createdAt;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // paymentGatewayReferenceId:
    public String getPaymentGatewayReferenceId(){
        return this.paymentGatewayReferenceId;
    }
    public void setPaymentGatewayReferenceId(String paymentGatewayReferenceId){
        this.paymentGatewayReferenceId = paymentGatewayReferenceId;
    }

    // paymentGatewayResponseId:
    public String getPaymentGatewayResponseId(){
        return this.paymentGatewayResponseId;
    }
    public void setPaymentGatewayResponseId(String paymentGatewayResponseId){
        this.paymentGatewayResponseId = paymentGatewayResponseId;
    }

    // state:
    public String getState(){
        return this.state;
    }
    public void setState(String state){
        this.state = state;
    }

    // failReasonCode:
    public Integer getFailReasonCode(){
        return this.failReasonCode;
    }
    public void setFailReasonCode(Integer failReasonCode){
        this.failReasonCode = failReasonCode;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }


    public Transaction() {
       super();
    }

    public Transaction(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        paymentGatewayReferenceId = GsonParser.parseString(jsonObject.get("paymentGatewayReferenceId"));
        paymentGatewayResponseId = GsonParser.parseString(jsonObject.get("paymentGatewayResponseId"));
        state = GsonParser.parseString(jsonObject.get("state"));
        failReasonCode = GsonParser.parseInt(jsonObject.get("failReasonCode"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaTransaction");
        kparams.add("id", this.id);
        kparams.add("paymentGatewayReferenceId", this.paymentGatewayReferenceId);
        kparams.add("paymentGatewayResponseId", this.paymentGatewayResponseId);
        kparams.add("state", this.state);
        kparams.add("failReasonCode", this.failReasonCode);
        kparams.add("createdAt", this.createdAt);
        return kparams;
    }

}

