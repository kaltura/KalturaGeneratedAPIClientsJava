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

/**  Program-asset info  */
@SuppressWarnings("serial")
public class ProgramAsset extends Asset {

	/**  EPG channel identifier  */
    private Long epgChannelId;
	/**  EPG identifier  */
    private String epgId;
	/**  Ralated media identifier  */
    private Long relatedMediaId;
	/**  Unique identifier for the program  */
    private String crid;

    // epgChannelId:
    public Long getEpgChannelId(){
        return this.epgChannelId;
    }
    public void setEpgChannelId(Long epgChannelId){
        this.epgChannelId = epgChannelId;
    }

    // epgId:
    public String getEpgId(){
        return this.epgId;
    }
    public void setEpgId(String epgId){
        this.epgId = epgId;
    }

    // relatedMediaId:
    public Long getRelatedMediaId(){
        return this.relatedMediaId;
    }
    public void setRelatedMediaId(Long relatedMediaId){
        this.relatedMediaId = relatedMediaId;
    }

    // crid:
    public String getCrid(){
        return this.crid;
    }
    public void setCrid(String crid){
        this.crid = crid;
    }


    public ProgramAsset() {
       super();
    }

    public ProgramAsset(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        epgChannelId = GsonParser.parseLong(jsonObject.get("epgChannelId"));
        epgId = GsonParser.parseString(jsonObject.get("epgId"));
        relatedMediaId = GsonParser.parseLong(jsonObject.get("relatedMediaId"));
        crid = GsonParser.parseString(jsonObject.get("crid"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaProgramAsset");
        kparams.add("epgChannelId", this.epgChannelId);
        kparams.add("epgId", this.epgId);
        kparams.add("relatedMediaId", this.relatedMediaId);
        kparams.add("crid", this.crid);
        return kparams;
    }

}

