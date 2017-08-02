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

/**  Used to ingest media that is already ingested to Kaltura system as a different
  entry in the past, the new created flavor asset will be ready immediately using
  a file sync of link type that will point to the existing file sync of the
  existing entry.  */
@SuppressWarnings("serial")
public class EntryResource extends ContentResource {

	/**  ID of the source entry  */
    private String entryId;
	/**  ID of the source flavor params, set to null to use the source flavor  */
    private Integer flavorParamsId;

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // flavorParamsId:
    public Integer getFlavorParamsId(){
        return this.flavorParamsId;
    }
    public void setFlavorParamsId(Integer flavorParamsId){
        this.flavorParamsId = flavorParamsId;
    }


    public EntryResource() {
       super();
    }

    public EntryResource(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        flavorParamsId = GsonParser.parseInt(jsonObject.get("flavorParamsId"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntryResource");
        kparams.add("entryId", this.entryId);
        kparams.add("flavorParamsId", this.flavorParamsId);
        return kparams;
    }

}

