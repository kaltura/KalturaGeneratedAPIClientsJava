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
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class FtpDistributionProfile extends ConfigurableDistributionProfile {

    private DistributionProtocol protocol;
    private String host;
    private Integer port;
    private String basePath;
    private String username;
    private String password;
    private String passphrase;
    private String sftpPublicKey;
    private String sftpPrivateKey;
    private Boolean disableMetadata;
    private String metadataXslt;
    private String metadataFilenameXslt;
    private String flavorAssetFilenameXslt;
    private String thumbnailAssetFilenameXslt;
    private String assetFilenameXslt;
    private String asperaPublicKey;
    private String asperaPrivateKey;
    private Boolean sendMetadataAfterAssets;

    // protocol:
    public DistributionProtocol getProtocol(){
        return this.protocol;
    }
    public void setProtocol(DistributionProtocol protocol){
        this.protocol = protocol;
    }

    // host:
    public String getHost(){
        return this.host;
    }
    public void setHost(String host){
        this.host = host;
    }

    // port:
    public Integer getPort(){
        return this.port;
    }
    public void setPort(Integer port){
        this.port = port;
    }

    // basePath:
    public String getBasePath(){
        return this.basePath;
    }
    public void setBasePath(String basePath){
        this.basePath = basePath;
    }

    // username:
    public String getUsername(){
        return this.username;
    }
    public void setUsername(String username){
        this.username = username;
    }

    // password:
    public String getPassword(){
        return this.password;
    }
    public void setPassword(String password){
        this.password = password;
    }

    // passphrase:
    public String getPassphrase(){
        return this.passphrase;
    }
    public void setPassphrase(String passphrase){
        this.passphrase = passphrase;
    }

    // sftpPublicKey:
    public String getSftpPublicKey(){
        return this.sftpPublicKey;
    }
    public void setSftpPublicKey(String sftpPublicKey){
        this.sftpPublicKey = sftpPublicKey;
    }

    // sftpPrivateKey:
    public String getSftpPrivateKey(){
        return this.sftpPrivateKey;
    }
    public void setSftpPrivateKey(String sftpPrivateKey){
        this.sftpPrivateKey = sftpPrivateKey;
    }

    // disableMetadata:
    public Boolean getDisableMetadata(){
        return this.disableMetadata;
    }
    public void setDisableMetadata(Boolean disableMetadata){
        this.disableMetadata = disableMetadata;
    }

    // metadataXslt:
    public String getMetadataXslt(){
        return this.metadataXslt;
    }
    public void setMetadataXslt(String metadataXslt){
        this.metadataXslt = metadataXslt;
    }

    // metadataFilenameXslt:
    public String getMetadataFilenameXslt(){
        return this.metadataFilenameXslt;
    }
    public void setMetadataFilenameXslt(String metadataFilenameXslt){
        this.metadataFilenameXslt = metadataFilenameXslt;
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

    // sendMetadataAfterAssets:
    public Boolean getSendMetadataAfterAssets(){
        return this.sendMetadataAfterAssets;
    }
    public void setSendMetadataAfterAssets(Boolean sendMetadataAfterAssets){
        this.sendMetadataAfterAssets = sendMetadataAfterAssets;
    }


    public FtpDistributionProfile() {
       super();
    }

    public FtpDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
        host = GsonParser.parseString(jsonObject.get("host"));
        port = GsonParser.parseInt(jsonObject.get("port"));
        basePath = GsonParser.parseString(jsonObject.get("basePath"));
        username = GsonParser.parseString(jsonObject.get("username"));
        password = GsonParser.parseString(jsonObject.get("password"));
        passphrase = GsonParser.parseString(jsonObject.get("passphrase"));
        sftpPublicKey = GsonParser.parseString(jsonObject.get("sftpPublicKey"));
        sftpPrivateKey = GsonParser.parseString(jsonObject.get("sftpPrivateKey"));
        disableMetadata = GsonParser.parseBoolean(jsonObject.get("disableMetadata"));
        metadataXslt = GsonParser.parseString(jsonObject.get("metadataXslt"));
        metadataFilenameXslt = GsonParser.parseString(jsonObject.get("metadataFilenameXslt"));
        flavorAssetFilenameXslt = GsonParser.parseString(jsonObject.get("flavorAssetFilenameXslt"));
        thumbnailAssetFilenameXslt = GsonParser.parseString(jsonObject.get("thumbnailAssetFilenameXslt"));
        assetFilenameXslt = GsonParser.parseString(jsonObject.get("assetFilenameXslt"));
        asperaPublicKey = GsonParser.parseString(jsonObject.get("asperaPublicKey"));
        asperaPrivateKey = GsonParser.parseString(jsonObject.get("asperaPrivateKey"));
        sendMetadataAfterAssets = GsonParser.parseBoolean(jsonObject.get("sendMetadataAfterAssets"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaFtpDistributionProfile");
        kparams.add("protocol", this.protocol);
        kparams.add("host", this.host);
        kparams.add("port", this.port);
        kparams.add("basePath", this.basePath);
        kparams.add("username", this.username);
        kparams.add("password", this.password);
        kparams.add("passphrase", this.passphrase);
        kparams.add("sftpPublicKey", this.sftpPublicKey);
        kparams.add("sftpPrivateKey", this.sftpPrivateKey);
        kparams.add("disableMetadata", this.disableMetadata);
        kparams.add("metadataXslt", this.metadataXslt);
        kparams.add("metadataFilenameXslt", this.metadataFilenameXslt);
        kparams.add("flavorAssetFilenameXslt", this.flavorAssetFilenameXslt);
        kparams.add("thumbnailAssetFilenameXslt", this.thumbnailAssetFilenameXslt);
        kparams.add("assetFilenameXslt", this.assetFilenameXslt);
        kparams.add("asperaPublicKey", this.asperaPublicKey);
        kparams.add("asperaPrivateKey", this.asperaPrivateKey);
        kparams.add("sendMetadataAfterAssets", this.sendMetadataAfterAssets);
        return kparams;
    }

}

