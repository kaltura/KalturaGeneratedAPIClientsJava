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

/**  Filtering recordings  */
@SuppressWarnings("serial")
public class RecordingFilter extends Filter {

	/**  Recording Statuses  */
    private String statusIn;
	/**  KSQL expression  */
    private String filterExpression;

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // filterExpression:
    public String getFilterExpression(){
        return this.filterExpression;
    }
    public void setFilterExpression(String filterExpression){
        this.filterExpression = filterExpression;
    }


    public RecordingFilter() {
       super();
    }

    public RecordingFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        filterExpression = GsonParser.parseString(jsonObject.get("filterExpression"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaRecordingFilter");
        kparams.add("statusIn", this.statusIn);
        kparams.add("filterExpression", this.filterExpression);
        return kparams;
    }

}

