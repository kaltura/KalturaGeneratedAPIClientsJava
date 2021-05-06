// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConvertJobData.Tokenizer.class)
public class ConvertJobData extends ConvartableJobData {
	
	public interface Tokenizer extends ConvartableJobData.Tokenizer {
		String destFileSyncLocalPath();
		String destFileSyncRemoteUrl();
		String logFileSyncLocalPath();
		String logFileSyncRemoteUrl();
		String flavorAssetId();
		String remoteMediaId();
		String customData();
		RequestBuilder.ListTokenizer<DestFileSyncDescriptor.Tokenizer> extraDestFileSyncs();
		String engineMessage();
		String destFileSyncSharedPath();
		String userCpu();
	}

	private String destFileSyncLocalPath;
	private String destFileSyncRemoteUrl;
	private String logFileSyncLocalPath;
	private String logFileSyncRemoteUrl;
	private String flavorAssetId;
	private String remoteMediaId;
	private String customData;
	private List<DestFileSyncDescriptor> extraDestFileSyncs;
	private String engineMessage;
	private String destFileSyncSharedPath;
	private Integer userCpu;

	// destFileSyncLocalPath:
	public String getDestFileSyncLocalPath(){
		return this.destFileSyncLocalPath;
	}
	public void setDestFileSyncLocalPath(String destFileSyncLocalPath){
		this.destFileSyncLocalPath = destFileSyncLocalPath;
	}

	public void destFileSyncLocalPath(String multirequestToken){
		setToken("destFileSyncLocalPath", multirequestToken);
	}

	// destFileSyncRemoteUrl:
	public String getDestFileSyncRemoteUrl(){
		return this.destFileSyncRemoteUrl;
	}
	public void setDestFileSyncRemoteUrl(String destFileSyncRemoteUrl){
		this.destFileSyncRemoteUrl = destFileSyncRemoteUrl;
	}

	public void destFileSyncRemoteUrl(String multirequestToken){
		setToken("destFileSyncRemoteUrl", multirequestToken);
	}

	// logFileSyncLocalPath:
	public String getLogFileSyncLocalPath(){
		return this.logFileSyncLocalPath;
	}
	public void setLogFileSyncLocalPath(String logFileSyncLocalPath){
		this.logFileSyncLocalPath = logFileSyncLocalPath;
	}

	public void logFileSyncLocalPath(String multirequestToken){
		setToken("logFileSyncLocalPath", multirequestToken);
	}

	// logFileSyncRemoteUrl:
	public String getLogFileSyncRemoteUrl(){
		return this.logFileSyncRemoteUrl;
	}
	public void setLogFileSyncRemoteUrl(String logFileSyncRemoteUrl){
		this.logFileSyncRemoteUrl = logFileSyncRemoteUrl;
	}

	public void logFileSyncRemoteUrl(String multirequestToken){
		setToken("logFileSyncRemoteUrl", multirequestToken);
	}

	// flavorAssetId:
	public String getFlavorAssetId(){
		return this.flavorAssetId;
	}
	public void setFlavorAssetId(String flavorAssetId){
		this.flavorAssetId = flavorAssetId;
	}

	public void flavorAssetId(String multirequestToken){
		setToken("flavorAssetId", multirequestToken);
	}

	// remoteMediaId:
	public String getRemoteMediaId(){
		return this.remoteMediaId;
	}
	public void setRemoteMediaId(String remoteMediaId){
		this.remoteMediaId = remoteMediaId;
	}

	public void remoteMediaId(String multirequestToken){
		setToken("remoteMediaId", multirequestToken);
	}

	// customData:
	public String getCustomData(){
		return this.customData;
	}
	public void setCustomData(String customData){
		this.customData = customData;
	}

	public void customData(String multirequestToken){
		setToken("customData", multirequestToken);
	}

	// extraDestFileSyncs:
	public List<DestFileSyncDescriptor> getExtraDestFileSyncs(){
		return this.extraDestFileSyncs;
	}
	public void setExtraDestFileSyncs(List<DestFileSyncDescriptor> extraDestFileSyncs){
		this.extraDestFileSyncs = extraDestFileSyncs;
	}

	// engineMessage:
	public String getEngineMessage(){
		return this.engineMessage;
	}
	public void setEngineMessage(String engineMessage){
		this.engineMessage = engineMessage;
	}

	public void engineMessage(String multirequestToken){
		setToken("engineMessage", multirequestToken);
	}

	// destFileSyncSharedPath:
	public String getDestFileSyncSharedPath(){
		return this.destFileSyncSharedPath;
	}
	public void setDestFileSyncSharedPath(String destFileSyncSharedPath){
		this.destFileSyncSharedPath = destFileSyncSharedPath;
	}

	public void destFileSyncSharedPath(String multirequestToken){
		setToken("destFileSyncSharedPath", multirequestToken);
	}

	// userCpu:
	public Integer getUserCpu(){
		return this.userCpu;
	}
	public void setUserCpu(Integer userCpu){
		this.userCpu = userCpu;
	}

	public void userCpu(String multirequestToken){
		setToken("userCpu", multirequestToken);
	}


	public ConvertJobData() {
		super();
	}

	public ConvertJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		destFileSyncLocalPath = GsonParser.parseString(jsonObject.get("destFileSyncLocalPath"));
		destFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("destFileSyncRemoteUrl"));
		logFileSyncLocalPath = GsonParser.parseString(jsonObject.get("logFileSyncLocalPath"));
		logFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("logFileSyncRemoteUrl"));
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		remoteMediaId = GsonParser.parseString(jsonObject.get("remoteMediaId"));
		customData = GsonParser.parseString(jsonObject.get("customData"));
		extraDestFileSyncs = GsonParser.parseArray(jsonObject.getAsJsonArray("extraDestFileSyncs"), DestFileSyncDescriptor.class);
		engineMessage = GsonParser.parseString(jsonObject.get("engineMessage"));
		destFileSyncSharedPath = GsonParser.parseString(jsonObject.get("destFileSyncSharedPath"));
		userCpu = GsonParser.parseInt(jsonObject.get("userCpu"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConvertJobData");
		kparams.add("destFileSyncLocalPath", this.destFileSyncLocalPath);
		kparams.add("destFileSyncRemoteUrl", this.destFileSyncRemoteUrl);
		kparams.add("logFileSyncLocalPath", this.logFileSyncLocalPath);
		kparams.add("logFileSyncRemoteUrl", this.logFileSyncRemoteUrl);
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("remoteMediaId", this.remoteMediaId);
		kparams.add("customData", this.customData);
		kparams.add("extraDestFileSyncs", this.extraDestFileSyncs);
		kparams.add("engineMessage", this.engineMessage);
		kparams.add("destFileSyncSharedPath", this.destFileSyncSharedPath);
		kparams.add("userCpu", this.userCpu);
		return kparams;
	}

}

