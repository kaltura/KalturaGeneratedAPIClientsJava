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
import com.kaltura.client.enums.DistributionProtocol;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class HuluDistributionProfile extends ConfigurableDistributionProfile {

    private String sftpHost;
    private String sftpLogin;
    private String sftpPass;
    private String seriesChannel;
    private String seriesPrimaryCategory;
    private List<StringHolder> seriesAdditionalCategories;
    private String seasonNumber;
    private String seasonSynopsis;
    private String seasonTuneInInformation;
    private String videoMediaType;
    private Boolean disableEpisodeNumberCustomValidation;
    private DistributionProtocol protocol;
    private String asperaHost;
    private String asperaLogin;
    private String asperaPass;
    private Integer port;
    private String passphrase;
    private String asperaPublicKey;
    private String asperaPrivateKey;

    // sftpHost:
    public String getSftpHost(){
        return this.sftpHost;
    }
    public void setSftpHost(String sftpHost){
        this.sftpHost = sftpHost;
    }

    // sftpLogin:
    public String getSftpLogin(){
        return this.sftpLogin;
    }
    public void setSftpLogin(String sftpLogin){
        this.sftpLogin = sftpLogin;
    }

    // sftpPass:
    public String getSftpPass(){
        return this.sftpPass;
    }
    public void setSftpPass(String sftpPass){
        this.sftpPass = sftpPass;
    }

    // seriesChannel:
    public String getSeriesChannel(){
        return this.seriesChannel;
    }
    public void setSeriesChannel(String seriesChannel){
        this.seriesChannel = seriesChannel;
    }

    // seriesPrimaryCategory:
    public String getSeriesPrimaryCategory(){
        return this.seriesPrimaryCategory;
    }
    public void setSeriesPrimaryCategory(String seriesPrimaryCategory){
        this.seriesPrimaryCategory = seriesPrimaryCategory;
    }

    // seriesAdditionalCategories:
    public List<StringHolder> getSeriesAdditionalCategories(){
        return this.seriesAdditionalCategories;
    }
    public void setSeriesAdditionalCategories(List<StringHolder> seriesAdditionalCategories){
        this.seriesAdditionalCategories = seriesAdditionalCategories;
    }

    // seasonNumber:
    public String getSeasonNumber(){
        return this.seasonNumber;
    }
    public void setSeasonNumber(String seasonNumber){
        this.seasonNumber = seasonNumber;
    }

    // seasonSynopsis:
    public String getSeasonSynopsis(){
        return this.seasonSynopsis;
    }
    public void setSeasonSynopsis(String seasonSynopsis){
        this.seasonSynopsis = seasonSynopsis;
    }

    // seasonTuneInInformation:
    public String getSeasonTuneInInformation(){
        return this.seasonTuneInInformation;
    }
    public void setSeasonTuneInInformation(String seasonTuneInInformation){
        this.seasonTuneInInformation = seasonTuneInInformation;
    }

    // videoMediaType:
    public String getVideoMediaType(){
        return this.videoMediaType;
    }
    public void setVideoMediaType(String videoMediaType){
        this.videoMediaType = videoMediaType;
    }

    // disableEpisodeNumberCustomValidation:
    public Boolean getDisableEpisodeNumberCustomValidation(){
        return this.disableEpisodeNumberCustomValidation;
    }
    public void setDisableEpisodeNumberCustomValidation(Boolean disableEpisodeNumberCustomValidation){
        this.disableEpisodeNumberCustomValidation = disableEpisodeNumberCustomValidation;
    }

    // protocol:
    public DistributionProtocol getProtocol(){
        return this.protocol;
    }
    public void setProtocol(DistributionProtocol protocol){
        this.protocol = protocol;
    }

    // asperaHost:
    public String getAsperaHost(){
        return this.asperaHost;
    }
    public void setAsperaHost(String asperaHost){
        this.asperaHost = asperaHost;
    }

    // asperaLogin:
    public String getAsperaLogin(){
        return this.asperaLogin;
    }
    public void setAsperaLogin(String asperaLogin){
        this.asperaLogin = asperaLogin;
    }

    // asperaPass:
    public String getAsperaPass(){
        return this.asperaPass;
    }
    public void setAsperaPass(String asperaPass){
        this.asperaPass = asperaPass;
    }

    // port:
    public Integer getPort(){
        return this.port;
    }
    public void setPort(Integer port){
        this.port = port;
    }

    // passphrase:
    public String getPassphrase(){
        return this.passphrase;
    }
    public void setPassphrase(String passphrase){
        this.passphrase = passphrase;
    }

    // asperaPublicKey:
    public String getAsperaPublicKey(){
        return this.asperaPublicKey;
    }
    public void setAsperaPublicKey(String asperaPublicKey){
        this.asperaPublicKey = asperaPublicKey;
    }

    // asperaPrivateKey:
    public String getAsperaPrivateKey(){
        return this.asperaPrivateKey;
    }
    public void setAsperaPrivateKey(String asperaPrivateKey){
        this.asperaPrivateKey = asperaPrivateKey;
    }


    public HuluDistributionProfile() {
       super();
    }

    public HuluDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        sftpHost = GsonParser.parseString(jsonObject.get("sftpHost"));
        sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
        sftpPass = GsonParser.parseString(jsonObject.get("sftpPass"));
        seriesChannel = GsonParser.parseString(jsonObject.get("seriesChannel"));
        seriesPrimaryCategory = GsonParser.parseString(jsonObject.get("seriesPrimaryCategory"));
        seriesAdditionalCategories = GsonParser.parseArray(jsonObject.getAsJsonArray("seriesAdditionalCategories"), StringHolder.class);
        seasonNumber = GsonParser.parseString(jsonObject.get("seasonNumber"));
        seasonSynopsis = GsonParser.parseString(jsonObject.get("seasonSynopsis"));
        seasonTuneInInformation = GsonParser.parseString(jsonObject.get("seasonTuneInInformation"));
        videoMediaType = GsonParser.parseString(jsonObject.get("videoMediaType"));
        disableEpisodeNumberCustomValidation = GsonParser.parseBoolean(jsonObject.get("disableEpisodeNumberCustomValidation"));
        protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
        asperaHost = GsonParser.parseString(jsonObject.get("asperaHost"));
        asperaLogin = GsonParser.parseString(jsonObject.get("asperaLogin"));
        asperaPass = GsonParser.parseString(jsonObject.get("asperaPass"));
        port = GsonParser.parseInt(jsonObject.get("port"));
        passphrase = GsonParser.parseString(jsonObject.get("passphrase"));
        asperaPublicKey = GsonParser.parseString(jsonObject.get("asperaPublicKey"));
        asperaPrivateKey = GsonParser.parseString(jsonObject.get("asperaPrivateKey"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaHuluDistributionProfile");
        kparams.add("sftpHost", this.sftpHost);
        kparams.add("sftpLogin", this.sftpLogin);
        kparams.add("sftpPass", this.sftpPass);
        kparams.add("seriesChannel", this.seriesChannel);
        kparams.add("seriesPrimaryCategory", this.seriesPrimaryCategory);
        kparams.add("seriesAdditionalCategories", this.seriesAdditionalCategories);
        kparams.add("seasonNumber", this.seasonNumber);
        kparams.add("seasonSynopsis", this.seasonSynopsis);
        kparams.add("seasonTuneInInformation", this.seasonTuneInInformation);
        kparams.add("videoMediaType", this.videoMediaType);
        kparams.add("disableEpisodeNumberCustomValidation", this.disableEpisodeNumberCustomValidation);
        kparams.add("protocol", this.protocol);
        kparams.add("asperaHost", this.asperaHost);
        kparams.add("asperaLogin", this.asperaLogin);
        kparams.add("asperaPass", this.asperaPass);
        kparams.add("port", this.port);
        kparams.add("passphrase", this.passphrase);
        kparams.add("asperaPublicKey", this.asperaPublicKey);
        kparams.add("asperaPrivateKey", this.asperaPrivateKey);
        return kparams;
    }

}

