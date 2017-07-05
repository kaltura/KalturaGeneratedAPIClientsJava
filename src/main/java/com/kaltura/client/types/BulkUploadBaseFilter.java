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
import com.kaltura.client.enums.BatchJobStatus;
import com.kaltura.client.enums.BulkUploadObjectType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class BulkUploadBaseFilter extends Filter {

    private Integer uploadedOnGreaterThanOrEqual;
    private Integer uploadedOnLessThanOrEqual;
    private Integer uploadedOnEqual;
    private String statusIn;
    private BatchJobStatus statusEqual;
    private BulkUploadObjectType bulkUploadObjectTypeEqual;
    private String bulkUploadObjectTypeIn;

    // uploadedOnGreaterThanOrEqual:
    public Integer getUploadedOnGreaterThanOrEqual(){
        return this.uploadedOnGreaterThanOrEqual;
    }
    public void setUploadedOnGreaterThanOrEqual(Integer uploadedOnGreaterThanOrEqual){
        this.uploadedOnGreaterThanOrEqual = uploadedOnGreaterThanOrEqual;
    }

    // uploadedOnLessThanOrEqual:
    public Integer getUploadedOnLessThanOrEqual(){
        return this.uploadedOnLessThanOrEqual;
    }
    public void setUploadedOnLessThanOrEqual(Integer uploadedOnLessThanOrEqual){
        this.uploadedOnLessThanOrEqual = uploadedOnLessThanOrEqual;
    }

    // uploadedOnEqual:
    public Integer getUploadedOnEqual(){
        return this.uploadedOnEqual;
    }
    public void setUploadedOnEqual(Integer uploadedOnEqual){
        this.uploadedOnEqual = uploadedOnEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // statusEqual:
    public BatchJobStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(BatchJobStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // bulkUploadObjectTypeEqual:
    public BulkUploadObjectType getBulkUploadObjectTypeEqual(){
        return this.bulkUploadObjectTypeEqual;
    }
    public void setBulkUploadObjectTypeEqual(BulkUploadObjectType bulkUploadObjectTypeEqual){
        this.bulkUploadObjectTypeEqual = bulkUploadObjectTypeEqual;
    }

    // bulkUploadObjectTypeIn:
    public String getBulkUploadObjectTypeIn(){
        return this.bulkUploadObjectTypeIn;
    }
    public void setBulkUploadObjectTypeIn(String bulkUploadObjectTypeIn){
        this.bulkUploadObjectTypeIn = bulkUploadObjectTypeIn;
    }


    public BulkUploadBaseFilter() {
       super();
    }

    public BulkUploadBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        uploadedOnGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("uploadedOnGreaterThanOrEqual"));
        uploadedOnLessThanOrEqual = GsonParser.parseInt(jsonObject.get("uploadedOnLessThanOrEqual"));
        uploadedOnEqual = GsonParser.parseInt(jsonObject.get("uploadedOnEqual"));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        statusEqual = BatchJobStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        bulkUploadObjectTypeEqual = BulkUploadObjectType.get(GsonParser.parseString(jsonObject.get("bulkUploadObjectTypeEqual")));
        bulkUploadObjectTypeIn = GsonParser.parseString(jsonObject.get("bulkUploadObjectTypeIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBulkUploadBaseFilter");
        kparams.add("uploadedOnGreaterThanOrEqual", this.uploadedOnGreaterThanOrEqual);
        kparams.add("uploadedOnLessThanOrEqual", this.uploadedOnLessThanOrEqual);
        kparams.add("uploadedOnEqual", this.uploadedOnEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("bulkUploadObjectTypeEqual", this.bulkUploadObjectTypeEqual);
        kparams.add("bulkUploadObjectTypeIn", this.bulkUploadObjectTypeIn);
        return kparams;
    }

}

