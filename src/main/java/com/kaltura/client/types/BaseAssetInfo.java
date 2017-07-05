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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Slim asset info  */
@SuppressWarnings("serial")
public class BaseAssetInfo extends ObjectBase {

	/**  Unique identifier for the asset  */
    private Long id;
	/**  Identifies the asset type (EPG, Movie, TV Series, etc).               Possible
	  values: 0 – EPG linear programs, or any asset type ID according to the asset
	  types IDs defined in the system.  */
    private Integer type;
	/**  Asset name  */
    private String name;
	/**  Asset description  */
    private String description;
	/**  Collection of images details that can be used to represent this asset  */
    private List<MediaImage> images;
	/**  Files  */
    private List<MediaFile> mediaFiles;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // type:
    public Integer getType(){
        return this.type;
    }
    public void setType(Integer type){
        this.type = type;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // images:
    public List<MediaImage> getImages(){
        return this.images;
    }
    public void setImages(List<MediaImage> images){
        this.images = images;
    }

    // mediaFiles:
    public List<MediaFile> getMediaFiles(){
        return this.mediaFiles;
    }
    public void setMediaFiles(List<MediaFile> mediaFiles){
        this.mediaFiles = mediaFiles;
    }


    public BaseAssetInfo() {
       super();
    }

    public BaseAssetInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        type = GsonParser.parseInt(jsonObject.get("type"));
        name = GsonParser.parseString(jsonObject.get("name"));
        description = GsonParser.parseString(jsonObject.get("description"));
        images = GsonParser.parseArray(jsonObject.getAsJsonArray("images"), MediaImage.class);
        mediaFiles = GsonParser.parseArray(jsonObject.getAsJsonArray("mediaFiles"), MediaFile.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaBaseAssetInfo");
        kparams.add("type", this.type);
        kparams.add("name", this.name);
        kparams.add("description", this.description);
        kparams.add("images", this.images);
        kparams.add("mediaFiles", this.mediaFiles);
        return kparams;
    }

}

