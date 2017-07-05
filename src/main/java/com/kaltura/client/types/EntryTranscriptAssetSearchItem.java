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

@SuppressWarnings("serial")
public class EntryTranscriptAssetSearchItem extends SearchItem {

    private String contentLike;
    private String contentMultiLikeOr;
    private String contentMultiLikeAnd;

    // contentLike:
    public String getContentLike(){
        return this.contentLike;
    }
    public void setContentLike(String contentLike){
        this.contentLike = contentLike;
    }

    // contentMultiLikeOr:
    public String getContentMultiLikeOr(){
        return this.contentMultiLikeOr;
    }
    public void setContentMultiLikeOr(String contentMultiLikeOr){
        this.contentMultiLikeOr = contentMultiLikeOr;
    }

    // contentMultiLikeAnd:
    public String getContentMultiLikeAnd(){
        return this.contentMultiLikeAnd;
    }
    public void setContentMultiLikeAnd(String contentMultiLikeAnd){
        this.contentMultiLikeAnd = contentMultiLikeAnd;
    }


    public EntryTranscriptAssetSearchItem() {
       super();
    }

    public EntryTranscriptAssetSearchItem(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        contentLike = GsonParser.parseString(jsonObject.get("contentLike"));
        contentMultiLikeOr = GsonParser.parseString(jsonObject.get("contentMultiLikeOr"));
        contentMultiLikeAnd = GsonParser.parseString(jsonObject.get("contentMultiLikeAnd"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntryTranscriptAssetSearchItem");
        kparams.add("contentLike", this.contentLike);
        kparams.add("contentMultiLikeOr", this.contentMultiLikeOr);
        kparams.add("contentMultiLikeAnd", this.contentMultiLikeAnd);
        return kparams;
    }

}

