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

@SuppressWarnings("serial")
public abstract class WidgetBaseFilter extends Filter {

    private String idEqual;
    private String idIn;
    private String sourceWidgetIdEqual;
    private String rootWidgetIdEqual;
    private Integer partnerIdEqual;
    private String entryIdEqual;
    private Integer uiConfIdEqual;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer updatedAtGreaterThanOrEqual;
    private Integer updatedAtLessThanOrEqual;
    private String partnerDataLike;

    // idEqual:
    public String getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(String idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // sourceWidgetIdEqual:
    public String getSourceWidgetIdEqual(){
        return this.sourceWidgetIdEqual;
    }
    public void setSourceWidgetIdEqual(String sourceWidgetIdEqual){
        this.sourceWidgetIdEqual = sourceWidgetIdEqual;
    }

    // rootWidgetIdEqual:
    public String getRootWidgetIdEqual(){
        return this.rootWidgetIdEqual;
    }
    public void setRootWidgetIdEqual(String rootWidgetIdEqual){
        this.rootWidgetIdEqual = rootWidgetIdEqual;
    }

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // uiConfIdEqual:
    public Integer getUiConfIdEqual(){
        return this.uiConfIdEqual;
    }
    public void setUiConfIdEqual(Integer uiConfIdEqual){
        this.uiConfIdEqual = uiConfIdEqual;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // updatedAtGreaterThanOrEqual:
    public Integer getUpdatedAtGreaterThanOrEqual(){
        return this.updatedAtGreaterThanOrEqual;
    }
    public void setUpdatedAtGreaterThanOrEqual(Integer updatedAtGreaterThanOrEqual){
        this.updatedAtGreaterThanOrEqual = updatedAtGreaterThanOrEqual;
    }

    // updatedAtLessThanOrEqual:
    public Integer getUpdatedAtLessThanOrEqual(){
        return this.updatedAtLessThanOrEqual;
    }
    public void setUpdatedAtLessThanOrEqual(Integer updatedAtLessThanOrEqual){
        this.updatedAtLessThanOrEqual = updatedAtLessThanOrEqual;
    }

    // partnerDataLike:
    public String getPartnerDataLike(){
        return this.partnerDataLike;
    }
    public void setPartnerDataLike(String partnerDataLike){
        this.partnerDataLike = partnerDataLike;
    }


    public WidgetBaseFilter() {
       super();
    }

    public WidgetBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        sourceWidgetIdEqual = GsonParser.parseString(jsonObject.get("sourceWidgetIdEqual"));
        rootWidgetIdEqual = GsonParser.parseString(jsonObject.get("rootWidgetIdEqual"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
        uiConfIdEqual = GsonParser.parseInt(jsonObject.get("uiConfIdEqual"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        updatedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtGreaterThanOrEqual"));
        updatedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("updatedAtLessThanOrEqual"));
        partnerDataLike = GsonParser.parseString(jsonObject.get("partnerDataLike"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaWidgetBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("sourceWidgetIdEqual", this.sourceWidgetIdEqual);
        kparams.add("rootWidgetIdEqual", this.rootWidgetIdEqual);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("uiConfIdEqual", this.uiConfIdEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("updatedAtGreaterThanOrEqual", this.updatedAtGreaterThanOrEqual);
        kparams.add("updatedAtLessThanOrEqual", this.updatedAtLessThanOrEqual);
        kparams.add("partnerDataLike", this.partnerDataLike);
        return kparams;
    }

}

