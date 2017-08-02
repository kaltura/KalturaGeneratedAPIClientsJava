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
import com.kaltura.client.utils.GsonParser;
import java.util.List;
import java.util.Map;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class EntryContextDataResult extends ContextDataResult {

    private Boolean isSiteRestricted;
    private Boolean isCountryRestricted;
    private Boolean isSessionRestricted;
    private Boolean isIpAddressRestricted;
    private Boolean isUserAgentRestricted;
    private Integer previewLength;
    private Boolean isScheduledNow;
    private Boolean isAdmin;
	/**  http/rtmp/hdnetwork  */
    private String streamerType;
	/**  http/https, rtmp/rtmpe  */
    private String mediaProtocol;
    private String storageProfilesXML;
	/**  Array of messages as received from the access control rules that invalidated  */
    private List<StringHolder> accessControlMessages;
	/**  Array of actions as received from the access control rules that invalidated  */
    private List<RuleAction> accessControlActions;
	/**  Array of allowed flavor assets according to access control limitations and
	  requested tags  */
    private List<FlavorAsset> flavorAssets;
	/**  The duration of the entry in milliseconds  */
    private Integer msDuration;
	/**  Array of allowed flavor assets according to access control limitations and
	  requested tags  */
    private Map<String, PluginData> pluginData;

    // isSiteRestricted:
    public Boolean getIsSiteRestricted(){
        return this.isSiteRestricted;
    }
    public void setIsSiteRestricted(Boolean isSiteRestricted){
        this.isSiteRestricted = isSiteRestricted;
    }

    // isCountryRestricted:
    public Boolean getIsCountryRestricted(){
        return this.isCountryRestricted;
    }
    public void setIsCountryRestricted(Boolean isCountryRestricted){
        this.isCountryRestricted = isCountryRestricted;
    }

    // isSessionRestricted:
    public Boolean getIsSessionRestricted(){
        return this.isSessionRestricted;
    }
    public void setIsSessionRestricted(Boolean isSessionRestricted){
        this.isSessionRestricted = isSessionRestricted;
    }

    // isIpAddressRestricted:
    public Boolean getIsIpAddressRestricted(){
        return this.isIpAddressRestricted;
    }
    public void setIsIpAddressRestricted(Boolean isIpAddressRestricted){
        this.isIpAddressRestricted = isIpAddressRestricted;
    }

    // isUserAgentRestricted:
    public Boolean getIsUserAgentRestricted(){
        return this.isUserAgentRestricted;
    }
    public void setIsUserAgentRestricted(Boolean isUserAgentRestricted){
        this.isUserAgentRestricted = isUserAgentRestricted;
    }

    // previewLength:
    public Integer getPreviewLength(){
        return this.previewLength;
    }
    public void setPreviewLength(Integer previewLength){
        this.previewLength = previewLength;
    }

    // isScheduledNow:
    public Boolean getIsScheduledNow(){
        return this.isScheduledNow;
    }
    public void setIsScheduledNow(Boolean isScheduledNow){
        this.isScheduledNow = isScheduledNow;
    }

    // isAdmin:
    public Boolean getIsAdmin(){
        return this.isAdmin;
    }
    public void setIsAdmin(Boolean isAdmin){
        this.isAdmin = isAdmin;
    }

    // streamerType:
    public String getStreamerType(){
        return this.streamerType;
    }
    public void setStreamerType(String streamerType){
        this.streamerType = streamerType;
    }

    // mediaProtocol:
    public String getMediaProtocol(){
        return this.mediaProtocol;
    }
    public void setMediaProtocol(String mediaProtocol){
        this.mediaProtocol = mediaProtocol;
    }

    // storageProfilesXML:
    public String getStorageProfilesXML(){
        return this.storageProfilesXML;
    }
    public void setStorageProfilesXML(String storageProfilesXML){
        this.storageProfilesXML = storageProfilesXML;
    }

    // accessControlMessages:
    public List<StringHolder> getAccessControlMessages(){
        return this.accessControlMessages;
    }
    public void setAccessControlMessages(List<StringHolder> accessControlMessages){
        this.accessControlMessages = accessControlMessages;
    }

    // accessControlActions:
    public List<RuleAction> getAccessControlActions(){
        return this.accessControlActions;
    }
    public void setAccessControlActions(List<RuleAction> accessControlActions){
        this.accessControlActions = accessControlActions;
    }

    // flavorAssets:
    public List<FlavorAsset> getFlavorAssets(){
        return this.flavorAssets;
    }
    public void setFlavorAssets(List<FlavorAsset> flavorAssets){
        this.flavorAssets = flavorAssets;
    }

    // msDuration:
    public Integer getMsDuration(){
        return this.msDuration;
    }
    public void setMsDuration(Integer msDuration){
        this.msDuration = msDuration;
    }

    // pluginData:
    public Map<String, PluginData> getPluginData(){
        return this.pluginData;
    }
    public void setPluginData(Map<String, PluginData> pluginData){
        this.pluginData = pluginData;
    }


    public EntryContextDataResult() {
       super();
    }

    public EntryContextDataResult(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        isSiteRestricted = GsonParser.parseBoolean(jsonObject.get("isSiteRestricted"));
        isCountryRestricted = GsonParser.parseBoolean(jsonObject.get("isCountryRestricted"));
        isSessionRestricted = GsonParser.parseBoolean(jsonObject.get("isSessionRestricted"));
        isIpAddressRestricted = GsonParser.parseBoolean(jsonObject.get("isIpAddressRestricted"));
        isUserAgentRestricted = GsonParser.parseBoolean(jsonObject.get("isUserAgentRestricted"));
        previewLength = GsonParser.parseInt(jsonObject.get("previewLength"));
        isScheduledNow = GsonParser.parseBoolean(jsonObject.get("isScheduledNow"));
        isAdmin = GsonParser.parseBoolean(jsonObject.get("isAdmin"));
        streamerType = GsonParser.parseString(jsonObject.get("streamerType"));
        mediaProtocol = GsonParser.parseString(jsonObject.get("mediaProtocol"));
        storageProfilesXML = GsonParser.parseString(jsonObject.get("storageProfilesXML"));
        accessControlMessages = GsonParser.parseArray(jsonObject.getAsJsonArray("accessControlMessages"), StringHolder.class);
        accessControlActions = GsonParser.parseArray(jsonObject.getAsJsonArray("accessControlActions"), RuleAction.class);
        flavorAssets = GsonParser.parseArray(jsonObject.getAsJsonArray("flavorAssets"), FlavorAsset.class);
        msDuration = GsonParser.parseInt(jsonObject.get("msDuration"));
        pluginData = GsonParser.parseMap(jsonObject.getAsJsonObject("pluginData"), PluginData.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEntryContextDataResult");
        kparams.add("isSiteRestricted", this.isSiteRestricted);
        kparams.add("isCountryRestricted", this.isCountryRestricted);
        kparams.add("isSessionRestricted", this.isSessionRestricted);
        kparams.add("isIpAddressRestricted", this.isIpAddressRestricted);
        kparams.add("isUserAgentRestricted", this.isUserAgentRestricted);
        kparams.add("previewLength", this.previewLength);
        kparams.add("isScheduledNow", this.isScheduledNow);
        kparams.add("isAdmin", this.isAdmin);
        kparams.add("streamerType", this.streamerType);
        kparams.add("mediaProtocol", this.mediaProtocol);
        kparams.add("storageProfilesXML", this.storageProfilesXML);
        kparams.add("accessControlMessages", this.accessControlMessages);
        kparams.add("accessControlActions", this.accessControlActions);
        kparams.add("flavorAssets", this.flavorAssets);
        kparams.add("msDuration", this.msDuration);
        kparams.add("pluginData", this.pluginData);
        return kparams;
    }

}

