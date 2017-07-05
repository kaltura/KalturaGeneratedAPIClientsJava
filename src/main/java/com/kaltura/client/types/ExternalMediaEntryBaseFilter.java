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
import com.kaltura.client.enums.ExternalMediaSourceType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ExternalMediaEntryBaseFilter extends MediaEntryFilter {

    private ExternalMediaSourceType externalSourceTypeEqual;
    private String externalSourceTypeIn;
    private String assetParamsIdsMatchOr;
    private String assetParamsIdsMatchAnd;

    // externalSourceTypeEqual:
    public ExternalMediaSourceType getExternalSourceTypeEqual(){
        return this.externalSourceTypeEqual;
    }
    public void setExternalSourceTypeEqual(ExternalMediaSourceType externalSourceTypeEqual){
        this.externalSourceTypeEqual = externalSourceTypeEqual;
    }

    // externalSourceTypeIn:
    public String getExternalSourceTypeIn(){
        return this.externalSourceTypeIn;
    }
    public void setExternalSourceTypeIn(String externalSourceTypeIn){
        this.externalSourceTypeIn = externalSourceTypeIn;
    }

    // assetParamsIdsMatchOr:
    public String getAssetParamsIdsMatchOr(){
        return this.assetParamsIdsMatchOr;
    }
    public void setAssetParamsIdsMatchOr(String assetParamsIdsMatchOr){
        this.assetParamsIdsMatchOr = assetParamsIdsMatchOr;
    }

    // assetParamsIdsMatchAnd:
    public String getAssetParamsIdsMatchAnd(){
        return this.assetParamsIdsMatchAnd;
    }
    public void setAssetParamsIdsMatchAnd(String assetParamsIdsMatchAnd){
        this.assetParamsIdsMatchAnd = assetParamsIdsMatchAnd;
    }


    public ExternalMediaEntryBaseFilter() {
       super();
    }

    public ExternalMediaEntryBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        externalSourceTypeEqual = ExternalMediaSourceType.get(GsonParser.parseString(jsonObject.get("externalSourceTypeEqual")));
        externalSourceTypeIn = GsonParser.parseString(jsonObject.get("externalSourceTypeIn"));
        assetParamsIdsMatchOr = GsonParser.parseString(jsonObject.get("assetParamsIdsMatchOr"));
        assetParamsIdsMatchAnd = GsonParser.parseString(jsonObject.get("assetParamsIdsMatchAnd"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaExternalMediaEntryBaseFilter");
        kparams.add("externalSourceTypeEqual", this.externalSourceTypeEqual);
        kparams.add("externalSourceTypeIn", this.externalSourceTypeIn);
        kparams.add("assetParamsIdsMatchOr", this.assetParamsIdsMatchOr);
        kparams.add("assetParamsIdsMatchAnd", this.assetParamsIdsMatchAnd);
        return kparams;
    }

}

