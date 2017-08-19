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
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StorageJobData.Tokenizer.class)
public class StorageJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String serverUrl();
		String serverUsername();
		String serverPassword();
		String serverPrivateKey();
		String serverPublicKey();
		String serverPassPhrase();
		String ftpPassiveMode();
		String srcFileSyncLocalPath();
		String srcFileSyncId();
		String destFileSyncStoredPath();
	}

	private String serverUrl;
	private String serverUsername;
	private String serverPassword;
	private String serverPrivateKey;
	private String serverPublicKey;
	private String serverPassPhrase;
	private Boolean ftpPassiveMode;
	private String srcFileSyncLocalPath;
	private String srcFileSyncId;
	private String destFileSyncStoredPath;

	// serverUrl:
	public String getServerUrl(){
		return this.serverUrl;
	}
	public void setServerUrl(String serverUrl){
		this.serverUrl = serverUrl;
	}

	public void serverUrl(String multirequestToken){
		setToken("serverUrl", multirequestToken);
	}

	// serverUsername:
	public String getServerUsername(){
		return this.serverUsername;
	}
	public void setServerUsername(String serverUsername){
		this.serverUsername = serverUsername;
	}

	public void serverUsername(String multirequestToken){
		setToken("serverUsername", multirequestToken);
	}

	// serverPassword:
	public String getServerPassword(){
		return this.serverPassword;
	}
	public void setServerPassword(String serverPassword){
		this.serverPassword = serverPassword;
	}

	public void serverPassword(String multirequestToken){
		setToken("serverPassword", multirequestToken);
	}

	// serverPrivateKey:
	public String getServerPrivateKey(){
		return this.serverPrivateKey;
	}
	public void setServerPrivateKey(String serverPrivateKey){
		this.serverPrivateKey = serverPrivateKey;
	}

	public void serverPrivateKey(String multirequestToken){
		setToken("serverPrivateKey", multirequestToken);
	}

	// serverPublicKey:
	public String getServerPublicKey(){
		return this.serverPublicKey;
	}
	public void setServerPublicKey(String serverPublicKey){
		this.serverPublicKey = serverPublicKey;
	}

	public void serverPublicKey(String multirequestToken){
		setToken("serverPublicKey", multirequestToken);
	}

	// serverPassPhrase:
	public String getServerPassPhrase(){
		return this.serverPassPhrase;
	}
	public void setServerPassPhrase(String serverPassPhrase){
		this.serverPassPhrase = serverPassPhrase;
	}

	public void serverPassPhrase(String multirequestToken){
		setToken("serverPassPhrase", multirequestToken);
	}

	// ftpPassiveMode:
	public Boolean getFtpPassiveMode(){
		return this.ftpPassiveMode;
	}
	public void setFtpPassiveMode(Boolean ftpPassiveMode){
		this.ftpPassiveMode = ftpPassiveMode;
	}

	public void ftpPassiveMode(String multirequestToken){
		setToken("ftpPassiveMode", multirequestToken);
	}

	// srcFileSyncLocalPath:
	public String getSrcFileSyncLocalPath(){
		return this.srcFileSyncLocalPath;
	}
	public void setSrcFileSyncLocalPath(String srcFileSyncLocalPath){
		this.srcFileSyncLocalPath = srcFileSyncLocalPath;
	}

	public void srcFileSyncLocalPath(String multirequestToken){
		setToken("srcFileSyncLocalPath", multirequestToken);
	}

	// srcFileSyncId:
	public String getSrcFileSyncId(){
		return this.srcFileSyncId;
	}
	public void setSrcFileSyncId(String srcFileSyncId){
		this.srcFileSyncId = srcFileSyncId;
	}

	public void srcFileSyncId(String multirequestToken){
		setToken("srcFileSyncId", multirequestToken);
	}

	// destFileSyncStoredPath:
	public String getDestFileSyncStoredPath(){
		return this.destFileSyncStoredPath;
	}
	public void setDestFileSyncStoredPath(String destFileSyncStoredPath){
		this.destFileSyncStoredPath = destFileSyncStoredPath;
	}

	public void destFileSyncStoredPath(String multirequestToken){
		setToken("destFileSyncStoredPath", multirequestToken);
	}


	public StorageJobData() {
		super();
	}

	public StorageJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serverUrl = GsonParser.parseString(jsonObject.get("serverUrl"));
		serverUsername = GsonParser.parseString(jsonObject.get("serverUsername"));
		serverPassword = GsonParser.parseString(jsonObject.get("serverPassword"));
		serverPrivateKey = GsonParser.parseString(jsonObject.get("serverPrivateKey"));
		serverPublicKey = GsonParser.parseString(jsonObject.get("serverPublicKey"));
		serverPassPhrase = GsonParser.parseString(jsonObject.get("serverPassPhrase"));
		ftpPassiveMode = GsonParser.parseBoolean(jsonObject.get("ftpPassiveMode"));
		srcFileSyncLocalPath = GsonParser.parseString(jsonObject.get("srcFileSyncLocalPath"));
		srcFileSyncId = GsonParser.parseString(jsonObject.get("srcFileSyncId"));
		destFileSyncStoredPath = GsonParser.parseString(jsonObject.get("destFileSyncStoredPath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStorageJobData");
		kparams.add("serverUrl", this.serverUrl);
		kparams.add("serverUsername", this.serverUsername);
		kparams.add("serverPassword", this.serverPassword);
		kparams.add("serverPrivateKey", this.serverPrivateKey);
		kparams.add("serverPublicKey", this.serverPublicKey);
		kparams.add("serverPassPhrase", this.serverPassPhrase);
		kparams.add("ftpPassiveMode", this.ftpPassiveMode);
		kparams.add("srcFileSyncLocalPath", this.srcFileSyncLocalPath);
		kparams.add("srcFileSyncId", this.srcFileSyncId);
		kparams.add("destFileSyncStoredPath", this.destFileSyncStoredPath);
		return kparams;
	}

}

