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
import com.kaltura.client.types.Price;
import com.kaltura.client.types.Price;
import com.kaltura.client.enums.PurchaseStatus;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  PPV item price details  */
@SuppressWarnings("serial")
public class PPVItemPriceDetails extends ObjectBase {

	/**  The associated PPV module identifier  */
    private String ppvModuleId;
	/**  Denotes whether this object is available only as part of a subscription or can
	  be sold separately  */
    private Boolean isSubscriptionOnly;
	/**  The calculated price of the item after discounts (as part of a purchased
	  subscription by the user or by using a coupon)  */
    private Price price;
	/**  The full price of the item (with no discounts)  */
    private Price fullPrice;
	/**  Subscription purchase status  */
    private PurchaseStatus purchaseStatus;
	/**  The identifier of the relevant subscription  */
    private String subscriptionId;
	/**  The identifier of the relevant collection  */
    private String collectionId;
	/**  The identifier of the relevant pre paid  */
    private String prePaidId;
	/**  A list of the descriptions of the PPV module on different languages (language
	  code and translation)  */
    private List<TranslationToken> ppvDescriptions;
	/**  If the item already purchased - the identifier of the user (in the household)
	  who purchased this item  */
    private String purchaseUserId;
	/**  If the item already purchased - the identifier of the purchased file  */
    private Integer purchasedMediaFileId;
	/**  Related media files identifiers (different types)  */
    private List<IntegerValue> relatedMediaFileIds;
	/**  If the item already purchased - since when the user can start watching the item  */
    private Long startDate;
	/**  If the item already purchased - until when the user can watch the item  */
    private Long endDate;
	/**  Discount end date  */
    private Long discountEndDate;
	/**  If the item already purchased and played - the name of the device on which it
	  was first played  */
    private String firstDeviceName;
	/**  If waiver period is enabled - donates whether the user is still in the
	  cancelation window  */
    private Boolean isInCancelationPeriod;
	/**  The PPV product code  */
    private String ppvProductCode;

    // ppvModuleId:
    public String getPpvModuleId(){
        return this.ppvModuleId;
    }
    public void setPpvModuleId(String ppvModuleId){
        this.ppvModuleId = ppvModuleId;
    }

    // isSubscriptionOnly:
    public Boolean getIsSubscriptionOnly(){
        return this.isSubscriptionOnly;
    }
    public void setIsSubscriptionOnly(Boolean isSubscriptionOnly){
        this.isSubscriptionOnly = isSubscriptionOnly;
    }

    // price:
    public Price getPrice(){
        return this.price;
    }
    public void setPrice(Price price){
        this.price = price;
    }

    // fullPrice:
    public Price getFullPrice(){
        return this.fullPrice;
    }
    public void setFullPrice(Price fullPrice){
        this.fullPrice = fullPrice;
    }

    // purchaseStatus:
    public PurchaseStatus getPurchaseStatus(){
        return this.purchaseStatus;
    }
    public void setPurchaseStatus(PurchaseStatus purchaseStatus){
        this.purchaseStatus = purchaseStatus;
    }

    // subscriptionId:
    public String getSubscriptionId(){
        return this.subscriptionId;
    }
    public void setSubscriptionId(String subscriptionId){
        this.subscriptionId = subscriptionId;
    }

    // collectionId:
    public String getCollectionId(){
        return this.collectionId;
    }
    public void setCollectionId(String collectionId){
        this.collectionId = collectionId;
    }

    // prePaidId:
    public String getPrePaidId(){
        return this.prePaidId;
    }
    public void setPrePaidId(String prePaidId){
        this.prePaidId = prePaidId;
    }

    // ppvDescriptions:
    public List<TranslationToken> getPpvDescriptions(){
        return this.ppvDescriptions;
    }
    public void setPpvDescriptions(List<TranslationToken> ppvDescriptions){
        this.ppvDescriptions = ppvDescriptions;
    }

    // purchaseUserId:
    public String getPurchaseUserId(){
        return this.purchaseUserId;
    }
    public void setPurchaseUserId(String purchaseUserId){
        this.purchaseUserId = purchaseUserId;
    }

    // purchasedMediaFileId:
    public Integer getPurchasedMediaFileId(){
        return this.purchasedMediaFileId;
    }
    public void setPurchasedMediaFileId(Integer purchasedMediaFileId){
        this.purchasedMediaFileId = purchasedMediaFileId;
    }

    // relatedMediaFileIds:
    public List<IntegerValue> getRelatedMediaFileIds(){
        return this.relatedMediaFileIds;
    }
    public void setRelatedMediaFileIds(List<IntegerValue> relatedMediaFileIds){
        this.relatedMediaFileIds = relatedMediaFileIds;
    }

    // startDate:
    public Long getStartDate(){
        return this.startDate;
    }
    public void setStartDate(Long startDate){
        this.startDate = startDate;
    }

    // endDate:
    public Long getEndDate(){
        return this.endDate;
    }
    public void setEndDate(Long endDate){
        this.endDate = endDate;
    }

    // discountEndDate:
    public Long getDiscountEndDate(){
        return this.discountEndDate;
    }
    public void setDiscountEndDate(Long discountEndDate){
        this.discountEndDate = discountEndDate;
    }

    // firstDeviceName:
    public String getFirstDeviceName(){
        return this.firstDeviceName;
    }
    public void setFirstDeviceName(String firstDeviceName){
        this.firstDeviceName = firstDeviceName;
    }

    // isInCancelationPeriod:
    public Boolean getIsInCancelationPeriod(){
        return this.isInCancelationPeriod;
    }
    public void setIsInCancelationPeriod(Boolean isInCancelationPeriod){
        this.isInCancelationPeriod = isInCancelationPeriod;
    }

    // ppvProductCode:
    public String getPpvProductCode(){
        return this.ppvProductCode;
    }
    public void setPpvProductCode(String ppvProductCode){
        this.ppvProductCode = ppvProductCode;
    }


    public PPVItemPriceDetails() {
       super();
    }

    public PPVItemPriceDetails(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        ppvModuleId = GsonParser.parseString(jsonObject.get("ppvModuleId"));
        isSubscriptionOnly = GsonParser.parseBoolean(jsonObject.get("isSubscriptionOnly"));
        price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), Price.class);
        fullPrice = GsonParser.parseObject(jsonObject.getAsJsonObject("fullPrice"), Price.class);
        purchaseStatus = PurchaseStatus.get(GsonParser.parseString(jsonObject.get("purchaseStatus")));
        subscriptionId = GsonParser.parseString(jsonObject.get("subscriptionId"));
        collectionId = GsonParser.parseString(jsonObject.get("collectionId"));
        prePaidId = GsonParser.parseString(jsonObject.get("prePaidId"));
        ppvDescriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("ppvDescriptions"), TranslationToken.class);
        purchaseUserId = GsonParser.parseString(jsonObject.get("purchaseUserId"));
        purchasedMediaFileId = GsonParser.parseInt(jsonObject.get("purchasedMediaFileId"));
        relatedMediaFileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("relatedMediaFileIds"), IntegerValue.class);
        startDate = GsonParser.parseLong(jsonObject.get("startDate"));
        endDate = GsonParser.parseLong(jsonObject.get("endDate"));
        discountEndDate = GsonParser.parseLong(jsonObject.get("discountEndDate"));
        firstDeviceName = GsonParser.parseString(jsonObject.get("firstDeviceName"));
        isInCancelationPeriod = GsonParser.parseBoolean(jsonObject.get("isInCancelationPeriod"));
        ppvProductCode = GsonParser.parseString(jsonObject.get("ppvProductCode"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPPVItemPriceDetails");
        kparams.add("ppvModuleId", this.ppvModuleId);
        kparams.add("isSubscriptionOnly", this.isSubscriptionOnly);
        kparams.add("price", this.price);
        kparams.add("fullPrice", this.fullPrice);
        kparams.add("purchaseStatus", this.purchaseStatus);
        kparams.add("subscriptionId", this.subscriptionId);
        kparams.add("collectionId", this.collectionId);
        kparams.add("prePaidId", this.prePaidId);
        kparams.add("ppvDescriptions", this.ppvDescriptions);
        kparams.add("purchaseUserId", this.purchaseUserId);
        kparams.add("purchasedMediaFileId", this.purchasedMediaFileId);
        kparams.add("relatedMediaFileIds", this.relatedMediaFileIds);
        kparams.add("startDate", this.startDate);
        kparams.add("endDate", this.endDate);
        kparams.add("discountEndDate", this.discountEndDate);
        kparams.add("firstDeviceName", this.firstDeviceName);
        kparams.add("isInCancelationPeriod", this.isInCancelationPeriod);
        kparams.add("ppvProductCode", this.ppvProductCode);
        return kparams;
    }

}

