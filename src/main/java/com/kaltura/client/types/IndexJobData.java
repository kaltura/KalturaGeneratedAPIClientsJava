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
import com.kaltura.client.types.Filter;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class IndexJobData extends JobData {

	/**  The filter should return the list of objects that need to be reindexed.  */
    private Filter filter;
	/**  Indicates the last id that reindexed, used when the batch crached, to re-run
	  from the last crash point.  */
    private Integer lastIndexId;
	/**  Indicates the last depth that reindexed, used when the batch crached, to re-run
	  from the last crash point.  */
    private Integer lastIndexDepth;
	/**  Indicates that the object columns and attributes values should be recalculated
	  before reindexed.  */
    private Boolean shouldUpdate;

    // filter:
    public Filter getFilter(){
        return this.filter;
    }
    public void setFilter(Filter filter){
        this.filter = filter;
    }

    // lastIndexId:
    public Integer getLastIndexId(){
        return this.lastIndexId;
    }
    public void setLastIndexId(Integer lastIndexId){
        this.lastIndexId = lastIndexId;
    }

    // lastIndexDepth:
    public Integer getLastIndexDepth(){
        return this.lastIndexDepth;
    }
    public void setLastIndexDepth(Integer lastIndexDepth){
        this.lastIndexDepth = lastIndexDepth;
    }

    // shouldUpdate:
    public Boolean getShouldUpdate(){
        return this.shouldUpdate;
    }
    public void setShouldUpdate(Boolean shouldUpdate){
        this.shouldUpdate = shouldUpdate;
    }


    public IndexJobData() {
       super();
    }

    public IndexJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), Filter.class);
        lastIndexId = GsonParser.parseInt(jsonObject.get("lastIndexId"));
        lastIndexDepth = GsonParser.parseInt(jsonObject.get("lastIndexDepth"));
        shouldUpdate = GsonParser.parseBoolean(jsonObject.get("shouldUpdate"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaIndexJobData");
        kparams.add("filter", this.filter);
        kparams.add("lastIndexId", this.lastIndexId);
        kparams.add("lastIndexDepth", this.lastIndexDepth);
        kparams.add("shouldUpdate", this.shouldUpdate);
        return kparams;
    }

}

