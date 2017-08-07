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
import com.kaltura.client.enums.MediaParserType;
import com.kaltura.client.types.ObjectBase;
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
public class AssetParams extends ObjectBase {

	/**  The id of the Flavor Params  */
    private Integer id;
    private Integer partnerId;
	/**  The name of the Flavor Params  */
    private String name;
	/**  System name of the Flavor Params  */
    private String systemName;
	/**  The description of the Flavor Params  */
    private String description;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  True if those Flavor Params are part of system defaults  */
    private Boolean isSystemDefault;
	/**  The Flavor Params tags are used to identify the flavor for different usage (e.g.
	  web, hd, mobile)  */
    private String tags;
	/**  Array of partner permisison names that required for using this asset params  */
    private List<StringHolder> requiredPermissions;
	/**  Id of remote storage profile that used to get the source, zero indicates Kaltura
	  data center  */
    private Integer sourceRemoteStorageProfileId;
	/**  Comma seperated ids of remote storage profiles that the flavor distributed to,
	  the distribution done by the conversion engine  */
    private Integer remoteStorageProfileIds;
	/**  Media parser type to be used for post-conversion validation  */
    private MediaParserType mediaParserType;
	/**  Comma seperated ids of source flavor params this flavor is created from  */
    private String sourceAssetParamsIds;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // isSystemDefault:
    public Boolean getIsSystemDefault(){
        return this.isSystemDefault;
    }
    public void setIsSystemDefault(Boolean isSystemDefault){
        this.isSystemDefault = isSystemDefault;
    }

    // tags:
    public String getTags(){
        return this.tags;
    }
    public void setTags(String tags){
        this.tags = tags;
    }

    // requiredPermissions:
    public List<StringHolder> getRequiredPermissions(){
        return this.requiredPermissions;
    }
    public void setRequiredPermissions(List<StringHolder> requiredPermissions){
        this.requiredPermissions = requiredPermissions;
    }

    // sourceRemoteStorageProfileId:
    public Integer getSourceRemoteStorageProfileId(){
        return this.sourceRemoteStorageProfileId;
    }
    public void setSourceRemoteStorageProfileId(Integer sourceRemoteStorageProfileId){
        this.sourceRemoteStorageProfileId = sourceRemoteStorageProfileId;
    }

    // remoteStorageProfileIds:
    public Integer getRemoteStorageProfileIds(){
        return this.remoteStorageProfileIds;
    }
    public void setRemoteStorageProfileIds(Integer remoteStorageProfileIds){
        this.remoteStorageProfileIds = remoteStorageProfileIds;
    }

    // mediaParserType:
    public MediaParserType getMediaParserType(){
        return this.mediaParserType;
    }
    public void setMediaParserType(MediaParserType mediaParserType){
        this.mediaParserType = mediaParserType;
    }

    // sourceAssetParamsIds:
    public String getSourceAssetParamsIds(){
        return this.sourceAssetParamsIds;
    }
    public void setSourceAssetParamsIds(String sourceAssetParamsIds){
        this.sourceAssetParamsIds = sourceAssetParamsIds;
    }


    public AssetParams() {
       super();
    }

    public AssetParams(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        isSystemDefault = GsonParser.parseBoolean(jsonObject.get("isSystemDefault"));
        tags = GsonParser.parseString(jsonObject.get("tags"));
        requiredPermissions = GsonParser.parseArray(jsonObject.getAsJsonArray("requiredPermissions"), StringHolder.class);
        sourceRemoteStorageProfileId = GsonParser.parseInt(jsonObject.get("sourceRemoteStorageProfileId"));
        remoteStorageProfileIds = GsonParser.parseInt(jsonObject.get("remoteStorageProfileIds"));
        mediaParserType = MediaParserType.get(GsonParser.parseString(jsonObject.get("mediaParserType")));
        sourceAssetParamsIds = GsonParser.parseString(jsonObject.get("sourceAssetParamsIds"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAssetParams");
        kparams.add("partnerId", this.partnerId);
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("tags", this.tags);
        kparams.add("requiredPermissions", this.requiredPermissions);
        kparams.add("sourceRemoteStorageProfileId", this.sourceRemoteStorageProfileId);
        kparams.add("remoteStorageProfileIds", this.remoteStorageProfileIds);
        kparams.add("mediaParserType", this.mediaParserType);
        kparams.add("sourceAssetParamsIds", this.sourceAssetParamsIds);
        return kparams;
    }

}

