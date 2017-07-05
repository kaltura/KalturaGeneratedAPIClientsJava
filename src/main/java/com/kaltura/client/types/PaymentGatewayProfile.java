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
import java.util.Map;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Payment gateway profile  */
@SuppressWarnings("serial")
public class PaymentGatewayProfile extends PaymentGatewayBaseProfile {

	/**  Payment gateway is active status  */
    private Integer isActive;
	/**  Payment gateway adapter URL  */
    private String adapterUrl;
	/**  Payment gateway transact URL  */
    private String transactUrl;
	/**  Payment gateway status URL  */
    private String statusUrl;
	/**  Payment gateway renew URL  */
    private String renewUrl;
	/**  Payment gateway extra parameters  */
    private Map<String, StringValue> paymentGatewayeSettings;
	/**  Payment gateway external identifier  */
    private String externalIdentifier;
	/**  Pending Interval in minutes  */
    private Integer pendingInterval;
	/**  Pending Retries  */
    private Integer pendingRetries;
	/**  Shared Secret  */
    private String sharedSecret;
	/**  Renew Interval Minutes  */
    private Integer renewIntervalMinutes;
	/**  Renew Start Minutes  */
    private Integer renewStartMinutes;

    // isActive:
    public Integer getIsActive(){
        return this.isActive;
    }
    public void setIsActive(Integer isActive){
        this.isActive = isActive;
    }

    // adapterUrl:
    public String getAdapterUrl(){
        return this.adapterUrl;
    }
    public void setAdapterUrl(String adapterUrl){
        this.adapterUrl = adapterUrl;
    }

    // transactUrl:
    public String getTransactUrl(){
        return this.transactUrl;
    }
    public void setTransactUrl(String transactUrl){
        this.transactUrl = transactUrl;
    }

    // statusUrl:
    public String getStatusUrl(){
        return this.statusUrl;
    }
    public void setStatusUrl(String statusUrl){
        this.statusUrl = statusUrl;
    }

    // renewUrl:
    public String getRenewUrl(){
        return this.renewUrl;
    }
    public void setRenewUrl(String renewUrl){
        this.renewUrl = renewUrl;
    }

    // paymentGatewayeSettings:
    public Map<String, StringValue> getPaymentGatewayeSettings(){
        return this.paymentGatewayeSettings;
    }
    public void setPaymentGatewayeSettings(Map<String, StringValue> paymentGatewayeSettings){
        this.paymentGatewayeSettings = paymentGatewayeSettings;
    }

    // externalIdentifier:
    public String getExternalIdentifier(){
        return this.externalIdentifier;
    }
    public void setExternalIdentifier(String externalIdentifier){
        this.externalIdentifier = externalIdentifier;
    }

    // pendingInterval:
    public Integer getPendingInterval(){
        return this.pendingInterval;
    }
    public void setPendingInterval(Integer pendingInterval){
        this.pendingInterval = pendingInterval;
    }

    // pendingRetries:
    public Integer getPendingRetries(){
        return this.pendingRetries;
    }
    public void setPendingRetries(Integer pendingRetries){
        this.pendingRetries = pendingRetries;
    }

    // sharedSecret:
    public String getSharedSecret(){
        return this.sharedSecret;
    }
    public void setSharedSecret(String sharedSecret){
        this.sharedSecret = sharedSecret;
    }

    // renewIntervalMinutes:
    public Integer getRenewIntervalMinutes(){
        return this.renewIntervalMinutes;
    }
    public void setRenewIntervalMinutes(Integer renewIntervalMinutes){
        this.renewIntervalMinutes = renewIntervalMinutes;
    }

    // renewStartMinutes:
    public Integer getRenewStartMinutes(){
        return this.renewStartMinutes;
    }
    public void setRenewStartMinutes(Integer renewStartMinutes){
        this.renewStartMinutes = renewStartMinutes;
    }


    public PaymentGatewayProfile() {
       super();
    }

    public PaymentGatewayProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        isActive = GsonParser.parseInt(jsonObject.get("isActive"));
        adapterUrl = GsonParser.parseString(jsonObject.get("adapterUrl"));
        transactUrl = GsonParser.parseString(jsonObject.get("transactUrl"));
        statusUrl = GsonParser.parseString(jsonObject.get("statusUrl"));
        renewUrl = GsonParser.parseString(jsonObject.get("renewUrl"));
        paymentGatewayeSettings = GsonParser.parseMap(jsonObject.getAsJsonObject("paymentGatewayeSettings"), StringValue.class);
        externalIdentifier = GsonParser.parseString(jsonObject.get("externalIdentifier"));
        pendingInterval = GsonParser.parseInt(jsonObject.get("pendingInterval"));
        pendingRetries = GsonParser.parseInt(jsonObject.get("pendingRetries"));
        sharedSecret = GsonParser.parseString(jsonObject.get("sharedSecret"));
        renewIntervalMinutes = GsonParser.parseInt(jsonObject.get("renewIntervalMinutes"));
        renewStartMinutes = GsonParser.parseInt(jsonObject.get("renewStartMinutes"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPaymentGatewayProfile");
        kparams.add("isActive", this.isActive);
        kparams.add("adapterUrl", this.adapterUrl);
        kparams.add("transactUrl", this.transactUrl);
        kparams.add("statusUrl", this.statusUrl);
        kparams.add("renewUrl", this.renewUrl);
        kparams.add("paymentGatewayeSettings", this.paymentGatewayeSettings);
        kparams.add("externalIdentifier", this.externalIdentifier);
        kparams.add("pendingInterval", this.pendingInterval);
        kparams.add("pendingRetries", this.pendingRetries);
        kparams.add("sharedSecret", this.sharedSecret);
        kparams.add("renewIntervalMinutes", this.renewIntervalMinutes);
        kparams.add("renewStartMinutes", this.renewStartMinutes);
        return kparams;
    }

}

