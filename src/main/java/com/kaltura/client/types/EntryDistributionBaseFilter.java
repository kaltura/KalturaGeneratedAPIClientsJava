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
import com.kaltura.client.enums.EntryDistributionStatus;
import com.kaltura.client.enums.EntryDistributionFlag;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class EntryDistributionBaseFilter extends RelatedFilter {

    private Integer idEqual;
    private String idIn;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private Integer submittedAtGreaterThanOrEqual;
    private Integer submittedAtLessThanOrEqual;
    private String entryIdEqual;
    private String entryIdIn;
    private Integer distributionProfileIdEqual;
    private String distributionProfileIdIn;
    private EntryDistributionStatus statusEqual;
    private String statusIn;
    private EntryDistributionFlag dirtyStatusEqual;
    private String dirtyStatusIn;
    private Integer sunriseGreaterThanOrEqual;
    private Integer sunriseLessThanOrEqual;
    private Integer sunsetGreaterThanOrEqual;
    private Integer sunsetLessThanOrEqual;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // updatedAtGreaterThanOrEqual:
    public Integer getUpdatedAtGreaterThanOrEqual(){
        return this.updatedAtGreaterThanOrEqual;
    }
    public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
        this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
    }

    // updatedAtLessThanOrEqual:
    public Integer getUpdatedAtLessThanOrEqual(){
        return this.updatedAtLessThanOrEqual;
    }
    public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
        this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
    }

    // submittedAtGreaterThanOrEqual:
    public Integer getSubmittedAtGreaterThanOrEqual(){
        return this.submittedAtGreaterThanOrEqual;
    }
    public void setSubmittedAtGreaterThanOrEqual(Integer submittedAtGreaterThanOrEqual){
        this.submittedAtGreaterThanOrEqual = submittedAtGreaterThanOrEqual;
    }

    // submittedAtLessThanOrEqual:
    public Integer getSubmittedAtLessThanOrEqual(){
        return this.submittedAtLessThanOrEqual;
    }
    public void setSubmittedAtLessThanOrEqual(Integer submittedAtLessThanOrEqual){
        this.submittedAtLessThanOrEqual = submittedAtLessThanOrEqual;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // entryIdIn:
    public String getEntryIdIn(){
        return this.entryIdIn;
    }
    public void setEntryIdIn(String entryIdIn){
        this.entryIdIn = entryIdIn;
    }

    // distributionProfileIdEqual:
    public Integer getDistributionProfileIdEqual(){
        return this.distributionProfileIdEqual;
    }
    public void setDistributionProfileIdEqual(Integer distributionProfileIdEqual){
        this.distributionProfileIdEqual = distributionProfileIdEqual;
    }

    // distributionProfileIdIn:
    public String getDistributionProfileIdIn(){
        return this.distributionProfileIdIn;
    }
    public void setDistributionProfileIdIn(String distributionProfileIdIn){
        this.distributionProfileIdIn = distributionProfileIdIn;
    }

    // statusEqual:
    public EntryDistributionStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(EntryDistributionStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // dirtyStatusEqual:
    public EntryDistributionFlag getDirtyStatusEqual(){
        return this.dirtyStatusEqual;
    }
    public void setDirtyStatusEqual(EntryDistributionFlag dirtyStatusEqual){
        this.dirtyStatusEqual = dirtyStatusEqual;
    }

    // dirtyStatusIn:
    public String getDirtyStatusIn(){
        return this.dirtyStatusIn;
    }
    public void setDirtyStatusIn(String dirtyStatusIn){
        this.dirtyStatusIn = dirtyStatusIn;
    }

    // sunriseGreaterThanOrEqual:
    public Integer getSunriseGreaterThanOrEqual(){
        return this.sunriseGreaterThanOrEqual;
    }
    public void setSunriseGreaterThanOrEqual(Integer sunriseGreaterThanOrEqual){
        this.sunriseGreaterThanOrEqual = sunriseGreaterThanOrEqual;
    }

    // sunriseLessThanOrEqual:
    public Integer getSunriseLessThanOrEqual(){
        return this.sunriseLessThanOrEqual;
    }
    public void setSunriseLessThanOrEqual(Integer sunriseLessThanOrEqual){
        this.sunriseLessThanOrEqual = sunriseLessThanOrEqual;
    }

    // sunsetGreaterThanOrEqual:
    public Integer getSunsetGreaterThanOrEqual(){
        return this.sunsetGreaterThanOrEqual;
    }
    public void setSunsetGreaterThanOrEqual(Integer sunsetGreaterThanOrEqual){
        this.sunsetGreaterThanOrEqual = sunsetGreaterThanOrEqual;
    }

    // sunsetLessThanOrEqual:
    public Integer getSunsetLessThanOrEqual(){
        return this.sunsetLessThanOrEqual;
    }
    public void setSunsetLessThanOrEqual(Integer sunsetLessThanOrEqual){
        this.sunsetLessThanOrEqual = sunsetLessThanOrEqual;
    }


    public EntryDistributionBaseFilter() {
       super();
    }

    public EntryDistributionBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        submittedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("submittedAtGreaterThanOrEqual"));
        submittedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("submittedAtLessThanOrEqual"));
        entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
        entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
        distributionProfileIdEqual = GsonParser.parseInt(jsonObject.get("distributionProfileIdEqual"));
        distributionProfileIdIn = GsonParser.parseString(jsonObject.get("distributionProfileIdIn"));
        statusEqual = EntryDistributionStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        dirtyStatusEqual = EntryDistributionFlag.get(GsonParser.parseInt(jsonObject.get("dirtyStatusEqual")));
        dirtyStatusIn = GsonParser.parseString(jsonObject.get("dirtyStatusIn"));
        sunriseGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("sunriseGreaterThanOrEqual"));
        sunriseLessThanOrEqual = GsonParser.parseInt(jsonObject.get("sunriseLessThanOrEqual"));
        sunsetGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("sunsetGreaterThanOrEqual"));
        sunsetLessThanOrEqual = GsonParser.parseInt(jsonObject.get("sunsetLessThanOrEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntryDistributionBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("submittedAtGreaterThanOrEqual", this.submittedAtGreaterThanOrEqual);
        kparams.add("submittedAtLessThanOrEqual", this.submittedAtLessThanOrEqual);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("entryIdIn", this.entryIdIn);
        kparams.add("distributionProfileIdEqual", this.distributionProfileIdEqual);
        kparams.add("distributionProfileIdIn", this.distributionProfileIdIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("dirtyStatusEqual", this.dirtyStatusEqual);
        kparams.add("dirtyStatusIn", this.dirtyStatusIn);
        kparams.add("sunriseGreaterThanOrEqual", this.sunriseGreaterThanOrEqual);
        kparams.add("sunriseLessThanOrEqual", this.sunriseLessThanOrEqual);
        kparams.add("sunsetGreaterThanOrEqual", this.sunsetGreaterThanOrEqual);
        kparams.add("sunsetLessThanOrEqual", this.sunsetLessThanOrEqual);
        return kparams;
    }

}

