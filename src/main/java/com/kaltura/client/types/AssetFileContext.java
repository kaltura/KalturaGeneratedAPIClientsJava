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

@SuppressWarnings("serial")
public class AssetFileContext extends ObjectBase {

	/**  viewLifeCycle  */
    private String viewLifeCycle;
	/**  fullLifeCycle  */
    private String fullLifeCycle;
	/**  isOfflinePlayBack  */
    private Boolean isOfflinePlayBack;

    // viewLifeCycle:
    public String getViewLifeCycle(){
        return this.viewLifeCycle;
    }
    public void setViewLifeCycle(String viewLifeCycle){
        this.viewLifeCycle = viewLifeCycle;
    }

    // fullLifeCycle:
    public String getFullLifeCycle(){
        return this.fullLifeCycle;
    }
    public void setFullLifeCycle(String fullLifeCycle){
        this.fullLifeCycle = fullLifeCycle;
    }

    // isOfflinePlayBack:
    public Boolean getIsOfflinePlayBack(){
        return this.isOfflinePlayBack;
    }
    public void setIsOfflinePlayBack(Boolean isOfflinePlayBack){
        this.isOfflinePlayBack = isOfflinePlayBack;
    }


    public AssetFileContext() {
       super();
    }

    public AssetFileContext(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        viewLifeCycle = GsonParser.parseString(jsonObject.get("viewLifeCycle"));
        fullLifeCycle = GsonParser.parseString(jsonObject.get("fullLifeCycle"));
        isOfflinePlayBack = GsonParser.parseBoolean(jsonObject.get("isOfflinePlayBack"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAssetFileContext");
        return kparams;
    }

}

