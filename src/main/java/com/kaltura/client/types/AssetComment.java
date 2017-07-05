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
import com.kaltura.client.enums.AssetType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Asset Comment  */
@SuppressWarnings("serial")
public class AssetComment extends ObjectBase {

	/**  Comment ID  */
    private Integer id;
	/**  Asset identifier  */
    private String assetId;
	/**  Asset Type  */
    private AssetType assetType;
	/**  Header  */
    private String header;
	/**  Sub Header  */
    private String subHeader;
	/**  Text  */
    private String text;
	/**  CreateDate  */
    private Long createDate;
	/**  Writer  */
    private String writer;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // assetId:
    public String getAssetId(){
        return this.assetId;
    }
    public void setAssetId(String assetId){
        this.assetId = assetId;
    }

    // assetType:
    public AssetType getAssetType(){
        return this.assetType;
    }
    public void setAssetType(AssetType assetType){
        this.assetType = assetType;
    }

    // header:
    public String getHeader(){
        return this.header;
    }
    public void setHeader(String header){
        this.header = header;
    }

    // subHeader:
    public String getSubHeader(){
        return this.subHeader;
    }
    public void setSubHeader(String subHeader){
        this.subHeader = subHeader;
    }

    // text:
    public String getText(){
        return this.text;
    }
    public void setText(String text){
        this.text = text;
    }

    // createDate:
    public Long getCreateDate(){
        return this.createDate;
    }
    public void setCreateDate(Long createDate){
        this.createDate = createDate;
    }

    // writer:
    public String getWriter(){
        return this.writer;
    }
    public void setWriter(String writer){
        this.writer = writer;
    }


    public AssetComment() {
       super();
    }

    public AssetComment(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        assetId = GsonParser.parseString(jsonObject.get("assetId"));
        assetType = AssetType.get(GsonParser.parseString(jsonObject.get("assetType")));
        header = GsonParser.parseString(jsonObject.get("header"));
        subHeader = GsonParser.parseString(jsonObject.get("subHeader"));
        text = GsonParser.parseString(jsonObject.get("text"));
        createDate = GsonParser.parseLong(jsonObject.get("createDate"));
        writer = GsonParser.parseString(jsonObject.get("writer"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAssetComment");
        kparams.add("id", this.id);
        kparams.add("assetId", this.assetId);
        kparams.add("assetType", this.assetType);
        kparams.add("header", this.header);
        kparams.add("subHeader", this.subHeader);
        kparams.add("text", this.text);
        kparams.add("createDate", this.createDate);
        kparams.add("writer", this.writer);
        return kparams;
    }

}

