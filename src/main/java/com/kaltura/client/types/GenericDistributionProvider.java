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
import com.kaltura.client.enums.GenericDistributionProviderStatus;
import com.kaltura.client.utils.GsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class GenericDistributionProvider extends DistributionProvider {

	/**  Auto generated  */
    private Integer id;
	/**  Generic distribution provider creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Generic distribution provider last update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;
    private Integer partnerId;
    private Boolean isDefault;
    private GenericDistributionProviderStatus status;
    private String optionalFlavorParamsIds;
    private String requiredFlavorParamsIds;
    private List<DistributionThumbDimensions> optionalThumbDimensions;
    private List<DistributionThumbDimensions> requiredThumbDimensions;
    private String editableFields;
    private String mandatoryFields;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // isDefault:
    public Boolean getIsDefault(){
        return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault){
        this.isDefault = isDefault;
    }

    // status:
    public GenericDistributionProviderStatus getStatus(){
        return this.status;
    }
    public void setStatus(GenericDistributionProviderStatus status){
        this.status = status;
    }

    // optionalFlavorParamsIds:
    public String getOptionalFlavorParamsIds(){
        return this.optionalFlavorParamsIds;
    }
    public void setOptionalFlavorParamsIds(String optionalFlavorParamsIds){
        this.optionalFlavorParamsIds = optionalFlavorParamsIds;
    }

    // requiredFlavorParamsIds:
    public String getRequiredFlavorParamsIds(){
        return this.requiredFlavorParamsIds;
    }
    public void setRequiredFlavorParamsIds(String requiredFlavorParamsIds){
        this.requiredFlavorParamsIds = requiredFlavorParamsIds;
    }

    // optionalThumbDimensions:
    public List<DistributionThumbDimensions> getOptionalThumbDimensions(){
        return this.optionalThumbDimensions;
    }
    public void setOptionalThumbDimensions(List<DistributionThumbDimensions> optionalThumbDimensions){
        this.optionalThumbDimensions = optionalThumbDimensions;
    }

    // requiredThumbDimensions:
    public List<DistributionThumbDimensions> getRequiredThumbDimensions(){
        return this.requiredThumbDimensions;
    }
    public void setRequiredThumbDimensions(List<DistributionThumbDimensions> requiredThumbDimensions){
        this.requiredThumbDimensions = requiredThumbDimensions;
    }

    // editableFields:
    public String getEditableFields(){
        return this.editableFields;
    }
    public void setEditableFields(String editableFields){
        this.editableFields = editableFields;
    }

    // mandatoryFields:
    public String getMandatoryFields(){
        return this.mandatoryFields;
    }
    public void setMandatoryFields(String mandatoryFields){
        this.mandatoryFields = mandatoryFields;
    }


    public GenericDistributionProvider() {
       super();
    }

    public GenericDistributionProvider(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
        status = GenericDistributionProviderStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        optionalFlavorParamsIds = GsonParser.parseString(jsonObject.get("optionalFlavorParamsIds"));
        requiredFlavorParamsIds = GsonParser.parseString(jsonObject.get("requiredFlavorParamsIds"));
        optionalThumbDimensions = GsonParser.parseArray(jsonObject.getAsJsonArray("optionalThumbDimensions"), DistributionThumbDimensions.class);
        requiredThumbDimensions = GsonParser.parseArray(jsonObject.getAsJsonArray("requiredThumbDimensions"), DistributionThumbDimensions.class);
        editableFields = GsonParser.parseString(jsonObject.get("editableFields"));
        mandatoryFields = GsonParser.parseString(jsonObject.get("mandatoryFields"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaGenericDistributionProvider");
        kparams.add("isDefault", this.isDefault);
        kparams.add("optionalFlavorParamsIds", this.optionalFlavorParamsIds);
        kparams.add("requiredFlavorParamsIds", this.requiredFlavorParamsIds);
        kparams.add("optionalThumbDimensions", this.optionalThumbDimensions);
        kparams.add("requiredThumbDimensions", this.requiredThumbDimensions);
        kparams.add("editableFields", this.editableFields);
        kparams.add("mandatoryFields", this.mandatoryFields);
        return kparams;
    }

}

