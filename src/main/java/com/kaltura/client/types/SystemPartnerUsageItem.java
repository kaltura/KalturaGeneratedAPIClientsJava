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
import com.kaltura.client.enums.PartnerStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SystemPartnerUsageItem extends ObjectBase {

	/**  Partner ID  */
    private Integer partnerId;
	/**  Partner name  */
    private String partnerName;
	/**  Partner status  */
    private PartnerStatus partnerStatus;
	/**  Partner package  */
    private Integer partnerPackage;
	/**  Partner creation date (Unix timestamp)  */
    private Integer partnerCreatedAt;
	/**  Number of player loads in the specific date range  */
    private Integer views;
	/**  Number of plays in the specific date range  */
    private Integer plays;
	/**  Number of new entries created during specific date range  */
    private Integer entriesCount;
	/**  Total number of entries  */
    private Integer totalEntriesCount;
	/**  Number of new video entries created during specific date range  */
    private Integer videoEntriesCount;
	/**  Number of new image entries created during specific date range  */
    private Integer imageEntriesCount;
	/**  Number of new audio entries created during specific date range  */
    private Integer audioEntriesCount;
	/**  Number of new mix entries created during specific date range  */
    private Integer mixEntriesCount;
	/**  The total bandwidth usage during the given date range (in MB)  */
    private Double bandwidth;
	/**  The total storage consumption (in MB)  */
    private Double totalStorage;
	/**  The change in storage consumption (new uploads) during the given date range (in
	  MB)  */
    private Double storage;
	/**  The peak amount of storage consumption during the given date range for the
	  specific publisher  */
    private Double peakStorage;
	/**  The average amount of storage consumption during the given date range for the
	  specific publisher  */
    private Double avgStorage;
	/**  The combined amount of bandwidth and storage consumed during the given date
	  range for the specific publisher  */
    private Double combinedBandwidthStorage;
	/**  Amount of deleted storage in MB  */
    private Double deletedStorage;
	/**  Amount of transcoding usage in MB  */
    private Double transcodingUsage;

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // partnerName:
    public String getPartnerName(){
        return this.partnerName;
    }
    public void setPartnerName(String partnerName){
        this.partnerName = partnerName;
    }

    // partnerStatus:
    public PartnerStatus getPartnerStatus(){
        return this.partnerStatus;
    }
    public void setPartnerStatus(PartnerStatus partnerStatus){
        this.partnerStatus = partnerStatus;
    }

    // partnerPackage:
    public Integer getPartnerPackage(){
        return this.partnerPackage;
    }
    public void setPartnerPackage(Integer partnerPackage){
        this.partnerPackage = partnerPackage;
    }

    // partnerCreatedAt:
    public Integer getPartnerCreatedAt(){
        return this.partnerCreatedAt;
    }
    public void setPartnerCreatedAt(Integer partnerCreatedAt){
        this.partnerCreatedAt = partnerCreatedAt;
    }

    // views:
    public Integer getViews(){
        return this.views;
    }
    public void setViews(Integer views){
        this.views = views;
    }

    // plays:
    public Integer getPlays(){
        return this.plays;
    }
    public void setPlays(Integer plays){
        this.plays = plays;
    }

    // entriesCount:
    public Integer getEntriesCount(){
        return this.entriesCount;
    }
    public void setEntriesCount(Integer entriesCount){
        this.entriesCount = entriesCount;
    }

    // totalEntriesCount:
    public Integer getTotalEntriesCount(){
        return this.totalEntriesCount;
    }
    public void setTotalEntriesCount(Integer totalEntriesCount){
        this.totalEntriesCount = totalEntriesCount;
    }

    // videoEntriesCount:
    public Integer getVideoEntriesCount(){
        return this.videoEntriesCount;
    }
    public void setVideoEntriesCount(Integer videoEntriesCount){
        this.videoEntriesCount = videoEntriesCount;
    }

    // imageEntriesCount:
    public Integer getImageEntriesCount(){
        return this.imageEntriesCount;
    }
    public void setImageEntriesCount(Integer imageEntriesCount){
        this.imageEntriesCount = imageEntriesCount;
    }

    // audioEntriesCount:
    public Integer getAudioEntriesCount(){
        return this.audioEntriesCount;
    }
    public void setAudioEntriesCount(Integer audioEntriesCount){
        this.audioEntriesCount = audioEntriesCount;
    }

    // mixEntriesCount:
    public Integer getMixEntriesCount(){
        return this.mixEntriesCount;
    }
    public void setMixEntriesCount(Integer mixEntriesCount){
        this.mixEntriesCount = mixEntriesCount;
    }

    // bandwidth:
    public Double getBandwidth(){
        return this.bandwidth;
    }
    public void setBandwidth(Double bandwidth){
        this.bandwidth = bandwidth;
    }

    // totalStorage:
    public Double getTotalStorage(){
        return this.totalStorage;
    }
    public void setTotalStorage(Double totalStorage){
        this.totalStorage = totalStorage;
    }

    // storage:
    public Double getStorage(){
        return this.storage;
    }
    public void setStorage(Double storage){
        this.storage = storage;
    }

    // peakStorage:
    public Double getPeakStorage(){
        return this.peakStorage;
    }
    public void setPeakStorage(Double peakStorage){
        this.peakStorage = peakStorage;
    }

    // avgStorage:
    public Double getAvgStorage(){
        return this.avgStorage;
    }
    public void setAvgStorage(Double avgStorage){
        this.avgStorage = avgStorage;
    }

    // combinedBandwidthStorage:
    public Double getCombinedBandwidthStorage(){
        return this.combinedBandwidthStorage;
    }
    public void setCombinedBandwidthStorage(Double combinedBandwidthStorage){
        this.combinedBandwidthStorage = combinedBandwidthStorage;
    }

    // deletedStorage:
    public Double getDeletedStorage(){
        return this.deletedStorage;
    }
    public void setDeletedStorage(Double deletedStorage){
        this.deletedStorage = deletedStorage;
    }

    // transcodingUsage:
    public Double getTranscodingUsage(){
        return this.transcodingUsage;
    }
    public void setTranscodingUsage(Double transcodingUsage){
        this.transcodingUsage = transcodingUsage;
    }


    public SystemPartnerUsageItem() {
       super();
    }

    public SystemPartnerUsageItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        partnerName = GsonParser.parseString(jsonObject.get("partnerName"));
        partnerStatus = PartnerStatus.get(GsonParser.parseInt(jsonObject.get("partnerStatus")));
        partnerPackage = GsonParser.parseInt(jsonObject.get("partnerPackage"));
        partnerCreatedAt = GsonParser.parseInt(jsonObject.get("partnerCreatedAt"));
        views = GsonParser.parseInt(jsonObject.get("views"));
        plays = GsonParser.parseInt(jsonObject.get("plays"));
        entriesCount = GsonParser.parseInt(jsonObject.get("entriesCount"));
        totalEntriesCount = GsonParser.parseInt(jsonObject.get("totalEntriesCount"));
        videoEntriesCount = GsonParser.parseInt(jsonObject.get("videoEntriesCount"));
        imageEntriesCount = GsonParser.parseInt(jsonObject.get("imageEntriesCount"));
        audioEntriesCount = GsonParser.parseInt(jsonObject.get("audioEntriesCount"));
        mixEntriesCount = GsonParser.parseInt(jsonObject.get("mixEntriesCount"));
        bandwidth = GsonParser.parseDouble(jsonObject.get("bandwidth"));
        totalStorage = GsonParser.parseDouble(jsonObject.get("totalStorage"));
        storage = GsonParser.parseDouble(jsonObject.get("storage"));
        peakStorage = GsonParser.parseDouble(jsonObject.get("peakStorage"));
        avgStorage = GsonParser.parseDouble(jsonObject.get("avgStorage"));
        combinedBandwidthStorage = GsonParser.parseDouble(jsonObject.get("combinedBandwidthStorage"));
        deletedStorage = GsonParser.parseDouble(jsonObject.get("deletedStorage"));
        transcodingUsage = GsonParser.parseDouble(jsonObject.get("transcodingUsage"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSystemPartnerUsageItem");
        kparams.add("partnerId", this.partnerId);
        kparams.add("partnerName", this.partnerName);
        kparams.add("partnerStatus", this.partnerStatus);
        kparams.add("partnerPackage", this.partnerPackage);
        kparams.add("partnerCreatedAt", this.partnerCreatedAt);
        kparams.add("views", this.views);
        kparams.add("plays", this.plays);
        kparams.add("entriesCount", this.entriesCount);
        kparams.add("totalEntriesCount", this.totalEntriesCount);
        kparams.add("videoEntriesCount", this.videoEntriesCount);
        kparams.add("imageEntriesCount", this.imageEntriesCount);
        kparams.add("audioEntriesCount", this.audioEntriesCount);
        kparams.add("mixEntriesCount", this.mixEntriesCount);
        kparams.add("bandwidth", this.bandwidth);
        kparams.add("totalStorage", this.totalStorage);
        kparams.add("storage", this.storage);
        kparams.add("peakStorage", this.peakStorage);
        kparams.add("avgStorage", this.avgStorage);
        kparams.add("combinedBandwidthStorage", this.combinedBandwidthStorage);
        kparams.add("deletedStorage", this.deletedStorage);
        kparams.add("transcodingUsage", this.transcodingUsage);
        return kparams;
    }

}

