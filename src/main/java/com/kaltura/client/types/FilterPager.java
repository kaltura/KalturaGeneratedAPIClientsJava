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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  The KalturaFilterPager object enables paging management to be applied upon
  service list actions  */
@SuppressWarnings("serial")
public class FilterPager extends ObjectBase {

	/**  The number of objects to retrieve. Possible range 1 ≤ value ≤ 50. If omitted
	  or value &amp;lt; 1 - will be set to 25. If a value &amp;gt; 50 provided –
	  will be set to 50  */
    private Integer pageSize;
	/**  The page number for which {pageSize} of objects should be retrieved  */
    private Integer pageIndex;

    // pageSize:
    public Integer getPageSize(){
        return this.pageSize;
    }
    public void setPageSize(Integer pageSize){
        this.pageSize = pageSize;
    }

    // pageIndex:
    public Integer getPageIndex(){
        return this.pageIndex;
    }
    public void setPageIndex(Integer pageIndex){
        this.pageIndex = pageIndex;
    }


    public FilterPager() {
       super();
    }

    public FilterPager(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        pageSize = GsonParser.parseInt(jsonObject.get("pageSize"));
        pageIndex = GsonParser.parseInt(jsonObject.get("pageIndex"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFilterPager");
        kparams.add("pageSize", this.pageSize);
        kparams.add("pageIndex", this.pageIndex);
        return kparams;
    }

}

