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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.BatchJobErrorTypes;
import com.kaltura.client.enums.EntryDistributionFlag;
import com.kaltura.client.enums.EntryDistributionStatus;
import com.kaltura.client.enums.EntryDistributionSunStatus;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class EntryDistribution extends ObjectBase {

	/**  Auto generated unique id  */
    private Integer id;
	/**  Entry distribution creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Entry distribution last update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
	/**  Entry distribution submission date as Unix timestamp (In seconds)  */
    private Integer submittedAt;
    private String entryId;
    private Integer partnerId;
    private Integer distributionProfileId;
    private EntryDistributionStatus status;
    private EntryDistributionSunStatus sunStatus;
    private EntryDistributionFlag dirtyStatus;
	/**  Comma separated thumbnail asset ids  */
    private String thumbAssetIds;
	/**  Comma separated flavor asset ids  */
    private String flavorAssetIds;
	/**  Comma separated asset ids  */
    private String assetIds;
	/**  Entry distribution publish time as Unix timestamp (In seconds)  */
    private Integer sunrise;
	/**  Entry distribution un-publish time as Unix timestamp (In seconds)  */
    private Integer sunset;
	/**  The id as returned from the distributed destination  */
    private String remoteId;
	/**  The plays as retrieved from the remote destination reports  */
    private Integer plays;
	/**  The views as retrieved from the remote destination reports  */
    private Integer views;
    private List<DistributionValidationError> validationErrors;
    private BatchJobErrorTypes errorType;
    private Integer errorNumber;
    private String errorDescription;
    private Boolean hasSubmitResultsLog;
    private Boolean hasSubmitSentDataLog;
    private Boolean hasUpdateResultsLog;
    private Boolean hasUpdateSentDataLog;
    private Boolean hasDeleteResultsLog;
    private Boolean hasDeleteSentDataLog;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // submittedAt:
    public Integer getSubmittedAt(){
        return this.submittedAt;
    }
    public void setSubmittedAt(Integer submittedAt){
        this.submittedAt = submittedAt;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // distributionProfileId:
    public Integer getDistributionProfileId(){
        return this.distributionProfileId;
    }
    public void setDistributionProfileId(Integer distributionProfileId){
        this.distributionProfileId = distributionProfileId;
    }

    // status:
    public EntryDistributionStatus getStatus(){
        return this.status;
    }
    public void setStatus(EntryDistributionStatus status){
        this.status = status;
    }

    // sunStatus:
    public EntryDistributionSunStatus getSunStatus(){
        return this.sunStatus;
    }
    public void setSunStatus(EntryDistributionSunStatus sunStatus){
        this.sunStatus = sunStatus;
    }

    // dirtyStatus:
    public EntryDistributionFlag getDirtyStatus(){
        return this.dirtyStatus;
    }
    public void setDirtyStatus(EntryDistributionFlag dirtyStatus){
        this.dirtyStatus = dirtyStatus;
    }

    // thumbAssetIds:
    public String getThumbAssetIds(){
        return this.thumbAssetIds;
    }
    public void setThumbAssetIds(String thumbAssetIds){
        this.thumbAssetIds = thumbAssetIds;
    }

    // flavorAssetIds:
    public String getFlavorAssetIds(){
        return this.flavorAssetIds;
    }
    public void setFlavorAssetIds(String flavorAssetIds){
        this.flavorAssetIds = flavorAssetIds;
    }

    // assetIds:
    public String getAssetIds(){
        return this.assetIds;
    }
    public void setAssetIds(String assetIds){
        this.assetIds = assetIds;
    }

    // sunrise:
    public Integer getSunrise(){
        return this.sunrise;
    }
    public void setSunrise(Integer sunrise){
        this.sunrise = sunrise;
    }

    // sunset:
    public Integer getSunset(){
        return this.sunset;
    }
    public void setSunset(Integer sunset){
        this.sunset = sunset;
    }

    // remoteId:
    public String getRemoteId(){
        return this.remoteId;
    }
    public void setRemoteId(String remoteId){
        this.remoteId = remoteId;
    }

    // plays:
    public Integer getPlays(){
        return this.plays;
    }
    public void setPlays(Integer plays){
        this.plays = plays;
    }

    // views:
    public Integer getViews(){
        return this.views;
    }
    public void setViews(Integer views){
        this.views = views;
    }

    // validationErrors:
    public List<DistributionValidationError> getValidationErrors(){
        return this.validationErrors;
    }
    public void setValidationErrors(List<DistributionValidationError> validationErrors){
        this.validationErrors = validationErrors;
    }

    // errorType:
    public BatchJobErrorTypes getErrorType(){
        return this.errorType;
    }
    public void setErrorType(BatchJobErrorTypes errorType){
        this.errorType = errorType;
    }

    // errorNumber:
    public Integer getErrorNumber(){
        return this.errorNumber;
    }
    public void setErrorNumber(Integer errorNumber){
        this.errorNumber = errorNumber;
    }

    // errorDescription:
    public String getErrorDescription(){
        return this.errorDescription;
    }
    public void setErrorDescription(String errorDescription){
        this.errorDescription = errorDescription;
    }

    // hasSubmitResultsLog:
    public Boolean getHasSubmitResultsLog(){
        return this.hasSubmitResultsLog;
    }
    public void setHasSubmitResultsLog(Boolean hasSubmitResultsLog){
        this.hasSubmitResultsLog = hasSubmitResultsLog;
    }

    // hasSubmitSentDataLog:
    public Boolean getHasSubmitSentDataLog(){
        return this.hasSubmitSentDataLog;
    }
    public void setHasSubmitSentDataLog(Boolean hasSubmitSentDataLog){
        this.hasSubmitSentDataLog = hasSubmitSentDataLog;
    }

    // hasUpdateResultsLog:
    public Boolean getHasUpdateResultsLog(){
        return this.hasUpdateResultsLog;
    }
    public void setHasUpdateResultsLog(Boolean hasUpdateResultsLog){
        this.hasUpdateResultsLog = hasUpdateResultsLog;
    }

    // hasUpdateSentDataLog:
    public Boolean getHasUpdateSentDataLog(){
        return this.hasUpdateSentDataLog;
    }
    public void setHasUpdateSentDataLog(Boolean hasUpdateSentDataLog){
        this.hasUpdateSentDataLog = hasUpdateSentDataLog;
    }

    // hasDeleteResultsLog:
    public Boolean getHasDeleteResultsLog(){
        return this.hasDeleteResultsLog;
    }
    public void setHasDeleteResultsLog(Boolean hasDeleteResultsLog){
        this.hasDeleteResultsLog = hasDeleteResultsLog;
    }

    // hasDeleteSentDataLog:
    public Boolean getHasDeleteSentDataLog(){
        return this.hasDeleteSentDataLog;
    }
    public void setHasDeleteSentDataLog(Boolean hasDeleteSentDataLog){
        this.hasDeleteSentDataLog = hasDeleteSentDataLog;
    }


    public EntryDistribution() {
       super();
    }

    public EntryDistribution(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        submittedAt = GsonParser.parseInt(jsonObject.get("submittedAt"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        distributionProfileId = GsonParser.parseInt(jsonObject.get("distributionProfileId"));
        status = EntryDistributionStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        sunStatus = EntryDistributionSunStatus.get(GsonParser.parseInt(jsonObject.get("sunStatus")));
        dirtyStatus = EntryDistributionFlag.get(GsonParser.parseInt(jsonObject.get("dirtyStatus")));
        thumbAssetIds = GsonParser.parseString(jsonObject.get("thumbAssetIds"));
        flavorAssetIds = GsonParser.parseString(jsonObject.get("flavorAssetIds"));
        assetIds = GsonParser.parseString(jsonObject.get("assetIds"));
        sunrise = GsonParser.parseInt(jsonObject.get("sunrise"));
        sunset = GsonParser.parseInt(jsonObject.get("sunset"));
        remoteId = GsonParser.parseString(jsonObject.get("remoteId"));
        plays = GsonParser.parseInt(jsonObject.get("plays"));
        views = GsonParser.parseInt(jsonObject.get("views"));
        validationErrors = GsonParser.parseArray(jsonObject.getAsJsonArray("validationErrors"), DistributionValidationError.class);
        errorType = BatchJobErrorTypes.get(GsonParser.parseInt(jsonObject.get("errorType")));
        errorNumber = GsonParser.parseInt(jsonObject.get("errorNumber"));
        errorDescription = GsonParser.parseString(jsonObject.get("errorDescription"));
        hasSubmitResultsLog = GsonParser.parseBoolean(jsonObject.get("hasSubmitResultsLog"));
        hasSubmitSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasSubmitSentDataLog"));
        hasUpdateResultsLog = GsonParser.parseBoolean(jsonObject.get("hasUpdateResultsLog"));
        hasUpdateSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasUpdateSentDataLog"));
        hasDeleteResultsLog = GsonParser.parseBoolean(jsonObject.get("hasDeleteResultsLog"));
        hasDeleteSentDataLog = GsonParser.parseBoolean(jsonObject.get("hasDeleteSentDataLog"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntryDistribution");
        kparams.add("entryId", this.entryId);
        kparams.add("distributionProfileId", this.distributionProfileId);
        kparams.add("thumbAssetIds", this.thumbAssetIds);
        kparams.add("flavorAssetIds", this.flavorAssetIds);
        kparams.add("assetIds", this.assetIds);
        kparams.add("sunrise", this.sunrise);
        kparams.add("sunset", this.sunset);
        kparams.add("validationErrors", this.validationErrors);
        return kparams;
    }

}

