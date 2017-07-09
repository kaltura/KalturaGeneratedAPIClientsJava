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
public class VerizonVcastDistributionProfile extends ConfigurableDistributionProfile {

    private String ftpHost;
    private String ftpLogin;
    private String ftpPass;
    private String providerName;
    private String providerId;
    private String entitlement;
    private String priority;
    private String allowStreaming;
    private String streamingPriceCode;
    private String allowDownload;
    private String downloadPriceCode;

    // ftpHost:
    public String getFtpHost(){
        return this.ftpHost;
    }
    public void setFtpHost(String ftpHost){
        this.ftpHost = ftpHost;
    }

    // ftpLogin:
    public String getFtpLogin(){
        return this.ftpLogin;
    }
    public void setFtpLogin(String ftpLogin){
        this.ftpLogin = ftpLogin;
    }

    // ftpPass:
    public String getFtpPass(){
        return this.ftpPass;
    }
    public void setFtpPass(String ftpPass){
        this.ftpPass = ftpPass;
    }

    // providerName:
    public String getProviderName(){
        return this.providerName;
    }
    public void setProviderName(String providerName){
        this.providerName = providerName;
    }

    // providerId:
    public String getProviderId(){
        return this.providerId;
    }
    public void setProviderId(String providerId){
        this.providerId = providerId;
    }

    // entitlement:
    public String getEntitlement(){
        return this.entitlement;
    }
    public void setEntitlement(String entitlement){
        this.entitlement = entitlement;
    }

    // priority:
    public String getPriority(){
        return this.priority;
    }
    public void setPriority(String priority){
        this.priority = priority;
    }

    // allowStreaming:
    public String getAllowStreaming(){
        return this.allowStreaming;
    }
    public void setAllowStreaming(String allowStreaming){
        this.allowStreaming = allowStreaming;
    }

    // streamingPriceCode:
    public String getStreamingPriceCode(){
        return this.streamingPriceCode;
    }
    public void setStreamingPriceCode(String streamingPriceCode){
        this.streamingPriceCode = streamingPriceCode;
    }

    // allowDownload:
    public String getAllowDownload(){
        return this.allowDownload;
    }
    public void setAllowDownload(String allowDownload){
        this.allowDownload = allowDownload;
    }

    // downloadPriceCode:
    public String getDownloadPriceCode(){
        return this.downloadPriceCode;
    }
    public void setDownloadPriceCode(String downloadPriceCode){
        this.downloadPriceCode = downloadPriceCode;
    }


    public VerizonVcastDistributionProfile() {
       super();
    }

    public VerizonVcastDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        ftpHost = GsonParser.parseString(jsonObject.get("ftpHost"));
        ftpLogin = GsonParser.parseString(jsonObject.get("ftpLogin"));
        ftpPass = GsonParser.parseString(jsonObject.get("ftpPass"));
        providerName = GsonParser.parseString(jsonObject.get("providerName"));
        providerId = GsonParser.parseString(jsonObject.get("providerId"));
        entitlement = GsonParser.parseString(jsonObject.get("entitlement"));
        priority = GsonParser.parseString(jsonObject.get("priority"));
        allowStreaming = GsonParser.parseString(jsonObject.get("allowStreaming"));
        streamingPriceCode = GsonParser.parseString(jsonObject.get("streamingPriceCode"));
        allowDownload = GsonParser.parseString(jsonObject.get("allowDownload"));
        downloadPriceCode = GsonParser.parseString(jsonObject.get("downloadPriceCode"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaVerizonVcastDistributionProfile");
        kparams.add("ftpHost", this.ftpHost);
        kparams.add("ftpLogin", this.ftpLogin);
        kparams.add("ftpPass", this.ftpPass);
        kparams.add("providerName", this.providerName);
        kparams.add("providerId", this.providerId);
        kparams.add("entitlement", this.entitlement);
        kparams.add("priority", this.priority);
        kparams.add("allowStreaming", this.allowStreaming);
        kparams.add("streamingPriceCode", this.streamingPriceCode);
        kparams.add("allowDownload", this.allowDownload);
        kparams.add("downloadPriceCode", this.downloadPriceCode);
        return kparams;
    }

}

