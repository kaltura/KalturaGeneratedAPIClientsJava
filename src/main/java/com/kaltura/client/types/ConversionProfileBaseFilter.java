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
import com.kaltura.client.enums.ConversionProfileStatus;
import com.kaltura.client.enums.ConversionProfileType;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class ConversionProfileBaseFilter extends RelatedFilter {

    private Integer idEqual;
    private String idIn;
    private ConversionProfileStatus statusEqual;
    private String statusIn;
    private ConversionProfileType typeEqual;
    private String typeIn;
    private String nameEqual;
    private String systemNameEqual;
    private String systemNameIn;
    private String tagsMultiLikeOr;
    private String tagsMultiLikeAnd;
    private String defaultEntryIdEqual;
    private String defaultEntryIdIn;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // statusEqual:
    public ConversionProfileStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(ConversionProfileStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // typeEqual:
    public ConversionProfileType getTypeEqual(){
        return this.typeEqual;
    }
    public void setTypeEqual(ConversionProfileType typeEqual){
        this.typeEqual = typeEqual;
    }

    // typeIn:
    public String getTypeIn(){
        return this.typeIn;
    }
    public void setTypeIn(String typeIn){
        this.typeIn = typeIn;
    }

    // nameEqual:
    public String getNameEqual(){
        return this.nameEqual;
    }
    public void setNameEqual(String nameEqual){
        this.nameEqual = nameEqual;
    }

    // systemNameEqual:
    public String getSystemNameEqual(){
        return this.systemNameEqual;
    }
    public void setSystemNameEqual(String systemNameEqual){
        this.systemNameEqual = systemNameEqual;
    }

    // systemNameIn:
    public String getSystemNameIn(){
        return this.systemNameIn;
    }
    public void setSystemNameIn(String systemNameIn){
        this.systemNameIn = systemNameIn;
    }

    // tagsMultiLikeOr:
    public String getTagsMultiLikeOr(){
        return this.tagsMultiLikeOr;
    }
    public void setTagsMultiLikeOr(String tagsMultiLikeOr){
        this.tagsMultiLikeOr = tagsMultiLikeOr;
    }

    // tagsMultiLikeAnd:
    public String getTagsMultiLikeAnd(){
        return this.tagsMultiLikeAnd;
    }
    public void setTagsMultiLikeAnd(String tagsMultiLikeAnd){
        this.tagsMultiLikeAnd = tagsMultiLikeAnd;
    }

    // defaultEntryIdEqual:
    public String getDefaultEntryIdEqual(){
        return this.defaultEntryIdEqual;
    }
    public void setDefaultEntryIdEqual(String defaultEntryIdEqual){
        this.defaultEntryIdEqual = defaultEntryIdEqual;
    }

    // defaultEntryIdIn:
    public String getDefaultEntryIdIn(){
        return this.defaultEntryIdIn;
    }
    public void setDefaultEntryIdIn(String defaultEntryIdIn){
        this.defaultEntryIdIn = defaultEntryIdIn;
    }


    public ConversionProfileBaseFilter() {
       super();
    }

    public ConversionProfileBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        statusEqual = ConversionProfileStatus.get(GsonParser.parseString(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        typeEqual = ConversionProfileType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
        typeIn = GsonParser.parseString(jsonObject.get("typeIn"));
        nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
        systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
        systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));
        tagsMultiLikeOr = GsonParser.parseString(jsonObject.get("tagsMultiLikeOr"));
        tagsMultiLikeAnd = GsonParser.parseString(jsonObject.get("tagsMultiLikeAnd"));
        defaultEntryIdEqual = GsonParser.parseString(jsonObject.get("defaultEntryIdEqual"));
        defaultEntryIdIn = GsonParser.parseString(jsonObject.get("defaultEntryIdIn"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConversionProfileBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("typeEqual", this.typeEqual);
        kparams.add("typeIn", this.typeIn);
        kparams.add("nameEqual", this.nameEqual);
        kparams.add("systemNameEqual", this.systemNameEqual);
        kparams.add("systemNameIn", this.systemNameIn);
        kparams.add("tagsMultiLikeOr", this.tagsMultiLikeOr);
        kparams.add("tagsMultiLikeAnd", this.tagsMultiLikeAnd);
        kparams.add("defaultEntryIdEqual", this.defaultEntryIdEqual);
        kparams.add("defaultEntryIdIn", this.defaultEntryIdIn);
        return kparams;
    }

}

