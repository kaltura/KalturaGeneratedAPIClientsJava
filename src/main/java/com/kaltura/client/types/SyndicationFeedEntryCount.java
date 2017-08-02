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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SyndicationFeedEntryCount extends ObjectBase {

	/**  the total count of entries that should appear in the feed without flavor
	  filtering  */
    private Integer totalEntryCount;
	/**  count of entries that will appear in the feed (including all relevant filters)  */
    private Integer actualEntryCount;
	/**  count of entries that requires transcoding in order to be included in feed  */
    private Integer requireTranscodingCount;

    // totalEntryCount:
    public Integer getTotalEntryCount(){
        return this.totalEntryCount;
    }
    public void setTotalEntryCount(Integer totalEntryCount){
        this.totalEntryCount = totalEntryCount;
    }

    // actualEntryCount:
    public Integer getActualEntryCount(){
        return this.actualEntryCount;
    }
    public void setActualEntryCount(Integer actualEntryCount){
        this.actualEntryCount = actualEntryCount;
    }

    // requireTranscodingCount:
    public Integer getRequireTranscodingCount(){
        return this.requireTranscodingCount;
    }
    public void setRequireTranscodingCount(Integer requireTranscodingCount){
        this.requireTranscodingCount = requireTranscodingCount;
    }


    public SyndicationFeedEntryCount() {
       super();
    }

    public SyndicationFeedEntryCount(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        totalEntryCount = GsonParser.parseInt(jsonObject.get("totalEntryCount"));
        actualEntryCount = GsonParser.parseInt(jsonObject.get("actualEntryCount"));
        requireTranscodingCount = GsonParser.parseInt(jsonObject.get("requireTranscodingCount"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSyndicationFeedEntryCount");
        kparams.add("totalEntryCount", this.totalEntryCount);
        kparams.add("actualEntryCount", this.actualEntryCount);
        kparams.add("requireTranscodingCount", this.requireTranscodingCount);
        return kparams;
    }

}

