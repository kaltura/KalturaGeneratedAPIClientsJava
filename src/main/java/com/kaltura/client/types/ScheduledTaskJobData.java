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
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ScheduledTaskJobData extends JobData {

    private Integer maxResults;
    private String resultsFilePath;
    private Integer referenceTime;

    // maxResults:
    public Integer getMaxResults(){
        return this.maxResults;
    }
    public void setMaxResults(Integer maxResults){
        this.maxResults = maxResults;
    }

    // resultsFilePath:
    public String getResultsFilePath(){
        return this.resultsFilePath;
    }
    public void setResultsFilePath(String resultsFilePath){
        this.resultsFilePath = resultsFilePath;
    }

    // referenceTime:
    public Integer getReferenceTime(){
        return this.referenceTime;
    }
    public void setReferenceTime(Integer referenceTime){
        this.referenceTime = referenceTime;
    }


    public ScheduledTaskJobData() {
       super();
    }

    public ScheduledTaskJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        maxResults = GsonParser.parseInt(jsonObject.get("maxResults"));
        resultsFilePath = GsonParser.parseString(jsonObject.get("resultsFilePath"));
        referenceTime = GsonParser.parseInt(jsonObject.get("referenceTime"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaScheduledTaskJobData");
        kparams.add("maxResults", this.maxResults);
        kparams.add("resultsFilePath", this.resultsFilePath);
        kparams.add("referenceTime", this.referenceTime);
        return kparams;
    }

}

