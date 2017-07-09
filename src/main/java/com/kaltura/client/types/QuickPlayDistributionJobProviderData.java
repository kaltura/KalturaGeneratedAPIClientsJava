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
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class QuickPlayDistributionJobProviderData extends ConfigurableDistributionJobProviderData {

    private String xml;
    private List<StringHolder> videoFilePaths;
    private List<StringHolder> thumbnailFilePaths;

    // xml:
    public String getXml(){
        return this.xml;
    }
    public void setXml(String xml){
        this.xml = xml;
    }

    // videoFilePaths:
    public List<StringHolder> getVideoFilePaths(){
        return this.videoFilePaths;
    }
    public void setVideoFilePaths(List<StringHolder> videoFilePaths){
        this.videoFilePaths = videoFilePaths;
    }

    // thumbnailFilePaths:
    public List<StringHolder> getThumbnailFilePaths(){
        return this.thumbnailFilePaths;
    }
    public void setThumbnailFilePaths(List<StringHolder> thumbnailFilePaths){
        this.thumbnailFilePaths = thumbnailFilePaths;
    }


    public QuickPlayDistributionJobProviderData() {
       super();
    }

    public QuickPlayDistributionJobProviderData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        xml = GsonParser.parseString(jsonObject.get("xml"));
        videoFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("videoFilePaths"), StringHolder.class);
        thumbnailFilePaths = GsonParser.parseArray(jsonObject.getAsJsonArray("thumbnailFilePaths"), StringHolder.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaQuickPlayDistributionJobProviderData");
        kparams.add("xml", this.xml);
        kparams.add("videoFilePaths", this.videoFilePaths);
        kparams.add("thumbnailFilePaths", this.thumbnailFilePaths);
        return kparams;
    }

}

