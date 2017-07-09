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
public class YouTubeDistributionJobProviderData extends ConfigurableDistributionJobProviderData {

    private String videoAssetFilePath;
    private String thumbAssetFilePath;
    private String captionAssetIds;
    private String sftpDirectory;
    private String sftpMetadataFilename;
    private String currentPlaylists;
    private String newPlaylists;
    private String submitXml;
    private String updateXml;
    private String deleteXml;
    private String googleClientId;
    private String googleClientSecret;
    private String googleTokenData;

    // videoAssetFilePath:
    public String getVideoAssetFilePath(){
        return this.videoAssetFilePath;
    }
    public void setVideoAssetFilePath(String videoAssetFilePath){
        this.videoAssetFilePath = videoAssetFilePath;
    }

    // thumbAssetFilePath:
    public String getThumbAssetFilePath(){
        return this.thumbAssetFilePath;
    }
    public void setThumbAssetFilePath(String thumbAssetFilePath){
        this.thumbAssetFilePath = thumbAssetFilePath;
    }

    // captionAssetIds:
    public String getCaptionAssetIds(){
        return this.captionAssetIds;
    }
    public void setCaptionAssetIds(String captionAssetIds){
        this.captionAssetIds = captionAssetIds;
    }

    // sftpDirectory:
    public String getSftpDirectory(){
        return this.sftpDirectory;
    }
    public void setSftpDirectory(String sftpDirectory){
        this.sftpDirectory = sftpDirectory;
    }

    // sftpMetadataFilename:
    public String getSftpMetadataFilename(){
        return this.sftpMetadataFilename;
    }
    public void setSftpMetadataFilename(String sftpMetadataFilename){
        this.sftpMetadataFilename = sftpMetadataFilename;
    }

    // currentPlaylists:
    public String getCurrentPlaylists(){
        return this.currentPlaylists;
    }
    public void setCurrentPlaylists(String currentPlaylists){
        this.currentPlaylists = currentPlaylists;
    }

    // newPlaylists:
    public String getNewPlaylists(){
        return this.newPlaylists;
    }
    public void setNewPlaylists(String newPlaylists){
        this.newPlaylists = newPlaylists;
    }

    // submitXml:
    public String getSubmitXml(){
        return this.submitXml;
    }
    public void setSubmitXml(String submitXml){
        this.submitXml = submitXml;
    }

    // updateXml:
    public String getUpdateXml(){
        return this.updateXml;
    }
    public void setUpdateXml(String updateXml){
        this.updateXml = updateXml;
    }

    // deleteXml:
    public String getDeleteXml(){
        return this.deleteXml;
    }
    public void setDeleteXml(String deleteXml){
        this.deleteXml = deleteXml;
    }

    // googleClientId:
    public String getGoogleClientId(){
        return this.googleClientId;
    }
    public void setGoogleClientId(String googleClientId){
        this.googleClientId = googleClientId;
    }

    // googleClientSecret:
    public String getGoogleClientSecret(){
        return this.googleClientSecret;
    }
    public void setGoogleClientSecret(String googleClientSecret){
        this.googleClientSecret = googleClientSecret;
    }

    // googleTokenData:
    public String getGoogleTokenData(){
        return this.googleTokenData;
    }
    public void setGoogleTokenData(String googleTokenData){
        this.googleTokenData = googleTokenData;
    }


    public YouTubeDistributionJobProviderData() {
       super();
    }

    public YouTubeDistributionJobProviderData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        videoAssetFilePath = GsonParser.parseString(jsonObject.get("videoAssetFilePath"));
        thumbAssetFilePath = GsonParser.parseString(jsonObject.get("thumbAssetFilePath"));
        captionAssetIds = GsonParser.parseString(jsonObject.get("captionAssetIds"));
        sftpDirectory = GsonParser.parseString(jsonObject.get("sftpDirectory"));
        sftpMetadataFilename = GsonParser.parseString(jsonObject.get("sftpMetadataFilename"));
        currentPlaylists = GsonParser.parseString(jsonObject.get("currentPlaylists"));
        newPlaylists = GsonParser.parseString(jsonObject.get("newPlaylists"));
        submitXml = GsonParser.parseString(jsonObject.get("submitXml"));
        updateXml = GsonParser.parseString(jsonObject.get("updateXml"));
        deleteXml = GsonParser.parseString(jsonObject.get("deleteXml"));
        googleClientId = GsonParser.parseString(jsonObject.get("googleClientId"));
        googleClientSecret = GsonParser.parseString(jsonObject.get("googleClientSecret"));
        googleTokenData = GsonParser.parseString(jsonObject.get("googleTokenData"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaYouTubeDistributionJobProviderData");
        kparams.add("videoAssetFilePath", this.videoAssetFilePath);
        kparams.add("thumbAssetFilePath", this.thumbAssetFilePath);
        kparams.add("captionAssetIds", this.captionAssetIds);
        kparams.add("sftpDirectory", this.sftpDirectory);
        kparams.add("sftpMetadataFilename", this.sftpMetadataFilename);
        kparams.add("currentPlaylists", this.currentPlaylists);
        kparams.add("newPlaylists", this.newPlaylists);
        kparams.add("submitXml", this.submitXml);
        kparams.add("updateXml", this.updateXml);
        kparams.add("deleteXml", this.deleteXml);
        kparams.add("googleClientId", this.googleClientId);
        kparams.add("googleClientSecret", this.googleClientSecret);
        kparams.add("googleTokenData", this.googleTokenData);
        return kparams;
    }

}

