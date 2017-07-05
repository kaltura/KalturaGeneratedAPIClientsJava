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

/**  Favorite request filter  */
@SuppressWarnings("serial")
public class FavoriteFilter extends Filter {

	/**  Media type to filter by the favorite assets  */
    private Integer mediaTypeIn;
	/**  Media identifiers from which to filter the favorite assets  */
    private String mediaIdIn;

    // mediaTypeIn:
    public Integer getMediaTypeIn(){
        return this.mediaTypeIn;
    }
    public void setMediaTypeIn(Integer mediaTypeIn){
        this.mediaTypeIn = mediaTypeIn;
    }

    // mediaIdIn:
    public String getMediaIdIn(){
        return this.mediaIdIn;
    }
    public void setMediaIdIn(String mediaIdIn){
        this.mediaIdIn = mediaIdIn;
    }


    public FavoriteFilter() {
       super();
    }

    public FavoriteFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        mediaTypeIn = GsonParser.parseInt(jsonObject.get("mediaTypeIn"));
        mediaIdIn = GsonParser.parseString(jsonObject.get("mediaIdIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFavoriteFilter");
        kparams.add("mediaTypeIn", this.mediaTypeIn);
        kparams.add("mediaIdIn", this.mediaIdIn);
        return kparams;
    }

}

