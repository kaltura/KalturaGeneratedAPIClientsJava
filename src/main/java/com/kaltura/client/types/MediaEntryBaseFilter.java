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
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.enums.SourceType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class MediaEntryBaseFilter extends PlayableEntryFilter {

    private MediaType mediaTypeEqual;
    private String mediaTypeIn;
    private SourceType sourceTypeEqual;
    private SourceType sourceTypeNotEqual;
    private String sourceTypeIn;
    private String sourceTypeNotIn;
    private Integer mediaDateGreaterThanOrEqual;
    private Integer mediaDateLessThanOrEqual;
    private String flavorParamsIdsMatchOr;
    private String flavorParamsIdsMatchAnd;

    // mediaTypeEqual:
    public MediaType getMediaTypeEqual(){
        return this.mediaTypeEqual;
    }
    public void setMediaTypeEqual(MediaType mediaTypeEqual){
        this.mediaTypeEqual = mediaTypeEqual;
    }

    // mediaTypeIn:
    public String getMediaTypeIn(){
        return this.mediaTypeIn;
    }
    public void setMediaTypeIn(String mediaTypeIn){
        this.mediaTypeIn = mediaTypeIn;
    }

    // sourceTypeEqual:
    public SourceType getSourceTypeEqual(){
        return this.sourceTypeEqual;
    }
    public void setSourceTypeEqual(SourceType sourceTypeEqual){
        this.sourceTypeEqual = sourceTypeEqual;
    }

    // sourceTypeNotEqual:
    public SourceType getSourceTypeNotEqual(){
        return this.sourceTypeNotEqual;
    }
    public void setSourceTypeNotEqual(SourceType sourceTypeNotEqual){
        this.sourceTypeNotEqual = sourceTypeNotEqual;
    }

    // sourceTypeIn:
    public String getSourceTypeIn(){
        return this.sourceTypeIn;
    }
    public void setSourceTypeIn(String sourceTypeIn){
        this.sourceTypeIn = sourceTypeIn;
    }

    // sourceTypeNotIn:
    public String getSourceTypeNotIn(){
        return this.sourceTypeNotIn;
    }
    public void setSourceTypeNotIn(String sourceTypeNotIn){
        this.sourceTypeNotIn = sourceTypeNotIn;
    }

    // mediaDateGreaterThanOrEqual:
    public Integer getMediaDateGreaterThanOrEqual(){
        return this.mediaDateGreaterThanOrEqual;
    }
    public void setMediaDateGreaterThanOrEqual(Integer mediaDateGreaterThanOrEqual){
        this.mediaDateGreaterThanOrEqual = mediaDateGreaterThanOrEqual;
    }

    // mediaDateLessThanOrEqual:
    public Integer getMediaDateLessThanOrEqual(){
        return this.mediaDateLessThanOrEqual;
    }
    public void setMediaDateLessThanOrEqual(Integer mediaDateLessThanOrEqual){
        this.mediaDateLessThanOrEqual = mediaDateLessThanOrEqual;
    }

    // flavorParamsIdsMatchOr:
    public String getFlavorParamsIdsMatchOr(){
        return this.flavorParamsIdsMatchOr;
    }
    public void setFlavorParamsIdsMatchOr(String flavorParamsIdsMatchOr){
        this.flavorParamsIdsMatchOr = flavorParamsIdsMatchOr;
    }

    // flavorParamsIdsMatchAnd:
    public String getFlavorParamsIdsMatchAnd(){
        return this.flavorParamsIdsMatchAnd;
    }
    public void setFlavorParamsIdsMatchAnd(String flavorParamsIdsMatchAnd){
        this.flavorParamsIdsMatchAnd = flavorParamsIdsMatchAnd;
    }


    public MediaEntryBaseFilter() {
       super();
    }

    public MediaEntryBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        mediaTypeEqual = MediaType.get(GsonParser.parseInt(jsonObject.get("mediaTypeEqual")));
        mediaTypeIn = GsonParser.parseString(jsonObject.get("mediaTypeIn"));
        sourceTypeEqual = SourceType.get(GsonParser.parseString(jsonObject.get("sourceTypeEqual")));
        sourceTypeNotEqual = SourceType.get(GsonParser.parseString(jsonObject.get("sourceTypeNotEqual")));
        sourceTypeIn = GsonParser.parseString(jsonObject.get("sourceTypeIn"));
        sourceTypeNotIn = GsonParser.parseString(jsonObject.get("sourceTypeNotIn"));
        mediaDateGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("mediaDateGreaterThanOrEqual"));
        mediaDateLessThanOrEqual = GsonParser.parseInt(jsonObject.get("mediaDateLessThanOrEqual"));
        flavorParamsIdsMatchOr = GsonParser.parseString(jsonObject.get("flavorParamsIdsMatchOr"));
        flavorParamsIdsMatchAnd = GsonParser.parseString(jsonObject.get("flavorParamsIdsMatchAnd"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaMediaEntryBaseFilter");
        kparams.add("mediaTypeEqual", this.mediaTypeEqual);
        kparams.add("mediaTypeIn", this.mediaTypeIn);
        kparams.add("sourceTypeEqual", this.sourceTypeEqual);
        kparams.add("sourceTypeNotEqual", this.sourceTypeNotEqual);
        kparams.add("sourceTypeIn", this.sourceTypeIn);
        kparams.add("sourceTypeNotIn", this.sourceTypeNotIn);
        kparams.add("mediaDateGreaterThanOrEqual", this.mediaDateGreaterThanOrEqual);
        kparams.add("mediaDateLessThanOrEqual", this.mediaDateLessThanOrEqual);
        kparams.add("flavorParamsIdsMatchOr", this.flavorParamsIdsMatchOr);
        kparams.add("flavorParamsIdsMatchAnd", this.flavorParamsIdsMatchAnd);
        return kparams;
    }

}

