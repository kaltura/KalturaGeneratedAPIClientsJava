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
public class Asset extends ObjectBase {

	/**  The ID of the Flavor Asset  */
    private String id;
	/**  The entry ID of the Flavor Asset  */
    private String entryId;
    private Integer partnerId;
	/**  The version of the Flavor Asset  */
    private Integer version;
	/**  The size (in KBytes) of the Flavor Asset  */
    private Integer size;
	/**  Tags used to identify the Flavor Asset in various scenarios  */
    private String tags;
	/**  The file extension  */
    private String fileExt;
    private Integer createdAt;
    private Integer updatedAt;
    private Integer deletedAt;
	/**  System description, error message, warnings and failure cause.  */
    private String description;
	/**  Partner private data  */
    private String partnerData;
	/**  Partner friendly description  */
    private String partnerDescription;
	/**  Comma separated list of source flavor params ids  */
    private String actualSourceAssetParamsIds;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // entryId:
    public String getEntryId(){
        return this.entryId;
    }
    public void setEntryId(String entryId){
        this.entryId = entryId;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // version:
    public Integer getVersion(){
        return this.version;
    }
    public void setVersion(Integer version){
        this.version = version;
    }

    // size:
    public Integer getSize(){
        return this.size;
    }
    public void setSize(Integer size){
        this.size = size;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // fileExt:
    public String getFileExt(){
        return this.fileExt;
    }
    public void setFileExt(String fileExt){
        this.fileExt = fileExt;
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

    // deletedAt:
    public Integer getDeletedAt(){
        return this.deletedAt;
    }
    public void setDeletedAt(Integer deletedAt){
        this.deletedAt = deletedAt;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // partnerData:
    public String getPartnerData(){
        return this.partnerData;
    }
    public void setPartnerData(String partnerData){
        this.partnerData = partnerData;
    }

    // partnerDescription:
    public String getPartnerDescription(){
        return this.partnerDescription;
    }
    public void setPartnerDescription(String partnerDescription){
        this.partnerDescription = partnerDescription;
    }

    // actualSourceAssetParamsIds:
    public String getActualSourceAssetParamsIds(){
        return this.actualSourceAssetParamsIds;
    }
    public void setActualSourceAssetParamsIds(String actualSourceAssetParamsIds){
        this.actualSourceAssetParamsIds = actualSourceAssetParamsIds;
    }


    public Asset() {
       super();
    }

    public Asset(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        entryId = GsonParser.parseString(jsonObject.get("entryId"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        version = GsonParser.parseInt(jsonObject.get("version"));
        size = GsonParser.parseInt(jsonObject.get("size"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        fileExt = GsonParser.parseString(jsonObject.get("fileExt"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
        deletedAt = GsonParser.parseInt(jsonObject.get("deletedAt"));
        description = GsonParser.parseString(jsonObject.get("description"));
        partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
        partnerDescription = GsonParser.parseString(jsonObject.get("partnerDescription"));
        actualSourceAssetParamsIds = GsonParser.parseString(jsonObject.get("actualSourceAssetParamsIds"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAsset");
        kparams.add("tags", this.tags);
        kparams.add("fileExt", this.fileExt);
        kparams.add("partnerData", this.partnerData);
        kparams.add("partnerDescription", this.partnerDescription);
        kparams.add("actualSourceAssetParamsIds", this.actualSourceAssetParamsIds);
        return kparams;
    }

}

