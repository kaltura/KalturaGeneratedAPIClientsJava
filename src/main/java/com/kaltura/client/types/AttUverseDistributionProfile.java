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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class AttUverseDistributionProfile extends ConfigurableDistributionProfile {

    private String feedUrl;
    private String ftpHost;
    private String ftpUsername;
    private String ftpPassword;
    private String ftpPath;
    private String channelTitle;
    private String flavorAssetFilenameXslt;
    private String thumbnailAssetFilenameXslt;
    private String assetFilenameXslt;

    // feedUrl:
    public String getFeedUrl(){
        return this.feedUrl;
    }
    public void setFeedUrl(String feedUrl){
        this.feedUrl = feedUrl;
    }

    // ftpHost:
    public String getFtpHost(){
        return this.ftpHost;
    }
    public void setFtpHost(String ftpHost){
        this.ftpHost = ftpHost;
    }

    // ftpUsername:
    public String getFtpUsername(){
        return this.ftpUsername;
    }
    public void setFtpUsername(String ftpUsername){
        this.ftpUsername = ftpUsername;
    }

    // ftpPassword:
    public String getFtpPassword(){
        return this.ftpPassword;
    }
    public void setFtpPassword(String ftpPassword){
        this.ftpPassword = ftpPassword;
    }

    // ftpPath:
    public String getFtpPath(){
        return this.ftpPath;
    }
    public void setFtpPath(String ftpPath){
        this.ftpPath = ftpPath;
    }

    // channelTitle:
    public String getChannelTitle(){
        return this.channelTitle;
    }
    public void setChannelTitle(String channelTitle){
        this.channelTitle = channelTitle;
    }

    // flavorAssetFilenameXslt:
    public String getFlavorAssetFilenameXslt(){
        return this.flavorAssetFilenameXslt;
    }
    public void setFlavorAssetFilenameXslt(String flavorAssetFilenameXslt){
        this.flavorAssetFilenameXslt = flavorAssetFilenameXslt;
    }

    // thumbnailAssetFilenameXslt:
    public String getThumbnailAssetFilenameXslt(){
        return this.thumbnailAssetFilenameXslt;
    }
    public void setThumbnailAssetFilenameXslt(String thumbnailAssetFilenameXslt){
        this.thumbnailAssetFilenameXslt = thumbnailAssetFilenameXslt;
    }

    // assetFilenameXslt:
    public String getAssetFilenameXslt(){
        return this.assetFilenameXslt;
    }
    public void setAssetFilenameXslt(String assetFilenameXslt){
        this.assetFilenameXslt = assetFilenameXslt;
    }


    public AttUverseDistributionProfile() {
       super();
    }

    public AttUverseDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
        ftpHost = GsonParser.parseString(jsonObject.get("ftpHost"));
        ftpUsername = GsonParser.parseString(jsonObject.get("ftpUsername"));
        ftpPassword = GsonParser.parseString(jsonObject.get("ftpPassword"));
        ftpPath = GsonParser.parseString(jsonObject.get("ftpPath"));
        channelTitle = GsonParser.parseString(jsonObject.get("channelTitle"));
        flavorAssetFilenameXslt = GsonParser.parseString(jsonObject.get("flavorAssetFilenameXslt"));
        thumbnailAssetFilenameXslt = GsonParser.parseString(jsonObject.get("thumbnailAssetFilenameXslt"));
        assetFilenameXslt = GsonParser.parseString(jsonObject.get("assetFilenameXslt"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAttUverseDistributionProfile");
        kparams.add("ftpHost", this.ftpHost);
        kparams.add("ftpUsername", this.ftpUsername);
        kparams.add("ftpPassword", this.ftpPassword);
        kparams.add("ftpPath", this.ftpPath);
        kparams.add("channelTitle", this.channelTitle);
        kparams.add("flavorAssetFilenameXslt", this.flavorAssetFilenameXslt);
        kparams.add("thumbnailAssetFilenameXslt", this.thumbnailAssetFilenameXslt);
        kparams.add("assetFilenameXslt", this.assetFilenameXslt);
        return kparams;
    }

}

