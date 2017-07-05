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
import com.kaltura.client.enums.TransactionType;
import com.kaltura.client.enums.PaymentMethodType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Entitlement  */
@SuppressWarnings("serial")
public class Entitlement extends ObjectBase {

	/**  Entitlement type  */
    private TransactionType type;
	/**  Entitlement identifier  */
    private String entitlementId;
	/**  The current number of uses  */
    private Integer currentUses;
	/**  The end date of the entitlement  */
    private Long endDate;
	/**  Current date  */
    private Long currentDate;
	/**  The last date the item was viewed  */
    private Long lastViewDate;
	/**  Purchase date  */
    private Long purchaseDate;
	/**  Purchase identifier (for subscriptions and collections only)  */
    private Integer purchaseId;
	/**  Payment Method  */
    private PaymentMethodType paymentMethod;
	/**  The UDID of the device from which the purchase was made  */
    private String deviceUdid;
	/**  The name of the device from which the purchase was made  */
    private String deviceName;
	/**  Indicates whether a cancelation window period is enabled  */
    private Boolean isCancelationWindowEnabled;
	/**  The maximum number of uses available for this item (only for subscription and
	  PPV)  */
    private Integer maxUses;
	/**  The date of the next renewal (only for subscription)  */
    private Long nextRenewalDate;
	/**  Indicates whether the subscription is renewable in this purchase (only for
	  subscription)  */
    private Boolean isRenewableForPurchase;
	/**  Indicates whether a subscription is renewable (only for subscription)  */
    private Boolean isRenewable;
	/**  Media file identifier (only for PPV)  */
    private Integer mediaFileId;
	/**  Media identifier (only for PPV)  */
    private Integer mediaId;
	/**  Indicates whether the user is currently in his grace period entitlement  */
    private Boolean isInGracePeriod;

    // type:
    public TransactionType getType(){
        return this.type;
    }
    public void setType(TransactionType type){
        this.type = type;
    }

    // entitlementId:
    public String getEntitlementId(){
        return this.entitlementId;
    }
    public void setEntitlementId(String entitlementId){
        this.entitlementId = entitlementId;
    }

    // currentUses:
    public Integer getCurrentUses(){
        return this.currentUses;
    }
    public void setCurrentUses(Integer currentUses){
        this.currentUses = currentUses;
    }

    // endDate:
    public Long getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Long endDate){
        this.endDate = endDate;
    }

    // currentDate:
    public Long getCurrentDate(){
        return this.currentDate;
    }
    public void setCurrentDate(Long currentDate){
        this.currentDate = currentDate;
    }

    // lastViewDate:
    public Long getLastViewDate(){
        return this.lastViewDate;
    }
    public void setLastViewDate(Long lastViewDate){
        this.lastViewDate = lastViewDate;
    }

    // purchaseDate:
    public Long getPurchaseDate(){
        return this.purchaseDate;
    }
    public void setPurchaseDate(Long purchaseDate){
        this.purchaseDate = purchaseDate;
    }

    // purchaseId:
    public Integer getPurchaseId(){
        return this.purchaseId;
    }
    public void setPurchaseId(Integer purchaseId){
        this.purchaseId = purchaseId;
    }

    // paymentMethod:
    public PaymentMethodType getPaymentMethod(){
        return this.paymentMethod;
    }
    public void setPaymentMethod(PaymentMethodType paymentMethod){
        this.paymentMethod = paymentMethod;
    }

    // deviceUdid:
    public String getDeviceUdid(){
        return this.deviceUdid;
    }
    public void setDeviceUdid(String deviceUdid){
        this.deviceUdid = deviceUdid;
    }

    // deviceName:
    public String getDeviceName(){
        return this.deviceName;
    }
    public void setDeviceName(String deviceName){
        this.deviceName = deviceName;
    }

    // isCancelationWindowEnabled:
    public Boolean getIsCancelationWindowEnabled(){
        return this.isCancelationWindowEnabled;
    }
    public void setIsCancelationWindowEnabled(Boolean isCancelationWindowEnabled){
        this.isCancelationWindowEnabled = isCancelationWindowEnabled;
    }

    // maxUses:
    public Integer getMaxUses(){
        return this.maxUses;
    }
    public void setMaxUses(Integer maxUses){
        this.maxUses = maxUses;
    }

    // nextRenewalDate:
    public Long getNextRenewalDate(){
        return this.nextRenewalDate;
    }
    public void setNextRenewalDate(Long nextRenewalDate){
        this.nextRenewalDate = nextRenewalDate;
    }

    // isRenewableForPurchase:
    public Boolean getIsRenewableForPurchase(){
        return this.isRenewableForPurchase;
    }
    public void setIsRenewableForPurchase(Boolean isRenewableForPurchase){
        this.isRenewableForPurchase = isRenewableForPurchase;
    }

    // isRenewable:
    public Boolean getIsRenewable(){
        return this.isRenewable;
    }
    public void setIsRenewable(Boolean isRenewable){
        this.isRenewable = isRenewable;
    }

    // mediaFileId:
    public Integer getMediaFileId(){
        return this.mediaFileId;
    }
    public void setMediaFileId(Integer mediaFileId){
        this.mediaFileId = mediaFileId;
    }

    // mediaId:
    public Integer getMediaId(){
        return this.mediaId;
    }
    public void setMediaId(Integer mediaId){
        this.mediaId = mediaId;
    }

    // isInGracePeriod:
    public Boolean getIsInGracePeriod(){
        return this.isInGracePeriod;
    }
    public void setIsInGracePeriod(Boolean isInGracePeriod){
        this.isInGracePeriod = isInGracePeriod;
    }


    public Entitlement() {
       super();
    }

    public Entitlement(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        type = TransactionType.get(GsonParser.parseString(jsonObject.get("type")));
        entitlementId = GsonParser.parseString(jsonObject.get("entitlementId"));
        currentUses = GsonParser.parseInt(jsonObject.get("currentUses"));
        endDate = GsonParser.parseLong(jsonObject.get("endDate"));
        currentDate = GsonParser.parseLong(jsonObject.get("currentDate"));
        lastViewDate = GsonParser.parseLong(jsonObject.get("lastViewDate"));
        purchaseDate = GsonParser.parseLong(jsonObject.get("purchaseDate"));
        purchaseId = GsonParser.parseInt(jsonObject.get("purchaseId"));
        paymentMethod = PaymentMethodType.get(GsonParser.parseString(jsonObject.get("paymentMethod")));
        deviceUdid = GsonParser.parseString(jsonObject.get("deviceUdid"));
        deviceName = GsonParser.parseString(jsonObject.get("deviceName"));
        isCancelationWindowEnabled = GsonParser.parseBoolean(jsonObject.get("isCancelationWindowEnabled"));
        maxUses = GsonParser.parseInt(jsonObject.get("maxUses"));
        nextRenewalDate = GsonParser.parseLong(jsonObject.get("nextRenewalDate"));
        isRenewableForPurchase = GsonParser.parseBoolean(jsonObject.get("isRenewableForPurchase"));
        isRenewable = GsonParser.parseBoolean(jsonObject.get("isRenewable"));
        mediaFileId = GsonParser.parseInt(jsonObject.get("mediaFileId"));
        mediaId = GsonParser.parseInt(jsonObject.get("mediaId"));
        isInGracePeriod = GsonParser.parseBoolean(jsonObject.get("isInGracePeriod"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntitlement");
        return kparams;
    }

}

