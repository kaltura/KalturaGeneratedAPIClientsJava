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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class FeedItemInfo extends ObjectBase {

    private String itemXPath;
    private String itemPublishDateXPath;
    private String itemUniqueIdentifierXPath;
    private String itemContentFileSizeXPath;
    private String itemContentUrlXPath;
    private String itemContentBitrateXPath;
    private String itemHashXPath;
    private String itemContentXpath;
    private String contentBitrateAttributeName;

    // itemXPath:
    public String getItemXPath(){
        return this.itemXPath;
    }
    public void setItemXPath(String itemXPath){
        this.itemXPath = itemXPath;
    }

    // itemPublishDateXPath:
    public String getItemPublishDateXPath(){
        return this.itemPublishDateXPath;
    }
    public void setItemPublishDateXPath(String itemPublishDateXPath){
        this.itemPublishDateXPath = itemPublishDateXPath;
    }

    // itemUniqueIdentifierXPath:
    public String getItemUniqueIdentifierXPath(){
        return this.itemUniqueIdentifierXPath;
    }
    public void setItemUniqueIdentifierXPath(String itemUniqueIdentifierXPath){
        this.itemUniqueIdentifierXPath = itemUniqueIdentifierXPath;
    }

    // itemContentFileSizeXPath:
    public String getItemContentFileSizeXPath(){
        return this.itemContentFileSizeXPath;
    }
    public void setItemContentFileSizeXPath(String itemContentFileSizeXPath){
        this.itemContentFileSizeXPath = itemContentFileSizeXPath;
    }

    // itemContentUrlXPath:
    public String getItemContentUrlXPath(){
        return this.itemContentUrlXPath;
    }
    public void setItemContentUrlXPath(String itemContentUrlXPath){
        this.itemContentUrlXPath = itemContentUrlXPath;
    }

    // itemContentBitrateXPath:
    public String getItemContentBitrateXPath(){
        return this.itemContentBitrateXPath;
    }
    public void setItemContentBitrateXPath(String itemContentBitrateXPath){
        this.itemContentBitrateXPath = itemContentBitrateXPath;
    }

    // itemHashXPath:
    public String getItemHashXPath(){
        return this.itemHashXPath;
    }
    public void setItemHashXPath(String itemHashXPath){
        this.itemHashXPath = itemHashXPath;
    }

    // itemContentXpath:
    public String getItemContentXpath(){
        return this.itemContentXpath;
    }
    public void setItemContentXpath(String itemContentXpath){
        this.itemContentXpath = itemContentXpath;
    }

    // contentBitrateAttributeName:
    public String getContentBitrateAttributeName(){
        return this.contentBitrateAttributeName;
    }
    public void setContentBitrateAttributeName(String contentBitrateAttributeName){
        this.contentBitrateAttributeName = contentBitrateAttributeName;
    }


    public FeedItemInfo() {
       super();
    }

    public FeedItemInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        itemXPath = GsonParser.parseString(jsonObject.get("itemXPath"));
        itemPublishDateXPath = GsonParser.parseString(jsonObject.get("itemPublishDateXPath"));
        itemUniqueIdentifierXPath = GsonParser.parseString(jsonObject.get("itemUniqueIdentifierXPath"));
        itemContentFileSizeXPath = GsonParser.parseString(jsonObject.get("itemContentFileSizeXPath"));
        itemContentUrlXPath = GsonParser.parseString(jsonObject.get("itemContentUrlXPath"));
        itemContentBitrateXPath = GsonParser.parseString(jsonObject.get("itemContentBitrateXPath"));
        itemHashXPath = GsonParser.parseString(jsonObject.get("itemHashXPath"));
        itemContentXpath = GsonParser.parseString(jsonObject.get("itemContentXpath"));
        contentBitrateAttributeName = GsonParser.parseString(jsonObject.get("contentBitrateAttributeName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFeedItemInfo");
        kparams.add("itemXPath", this.itemXPath);
        kparams.add("itemPublishDateXPath", this.itemPublishDateXPath);
        kparams.add("itemUniqueIdentifierXPath", this.itemUniqueIdentifierXPath);
        kparams.add("itemContentFileSizeXPath", this.itemContentFileSizeXPath);
        kparams.add("itemContentUrlXPath", this.itemContentUrlXPath);
        kparams.add("itemContentBitrateXPath", this.itemContentBitrateXPath);
        kparams.add("itemHashXPath", this.itemHashXPath);
        kparams.add("itemContentXpath", this.itemContentXpath);
        kparams.add("contentBitrateAttributeName", this.contentBitrateAttributeName);
        return kparams;
    }

}

