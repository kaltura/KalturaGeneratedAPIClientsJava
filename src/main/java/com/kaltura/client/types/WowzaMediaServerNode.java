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
@MultiRequestBuilder.Tokenizer(WowzaMediaServerNode.Tokenizer.class)
public class WowzaMediaServerNode extends MediaServerNode {
	
	public interface Tokenizer extends MediaServerNode.Tokenizer {
		String appPrefix();
		String transcoder();
		String GPUID();
		String liveServicePort();
		String liveServiceProtocol();
		String liveServiceInternalDomain();
	}

	/**  Wowza Media server app prefix  */
	private String appPrefix;
	/**  Wowza Media server transcoder configuration overide  */
	private String transcoder;
	/**  Wowza Media server GPU index id  */
	private Integer GPUID;
	/**  Live service port  */
	private Integer liveServicePort;
	/**  Live service protocol  */
	private String liveServiceProtocol;
	/**  Wowza media server live service internal domain  */
	private String liveServiceInternalDomain;

	// appPrefix:
	public String getAppPrefix(){
		return this.appPrefix;
	}
	public void setAppPrefix(String appPrefix){
		this.appPrefix = appPrefix;
	}

	public void appPrefix(String multirequestToken){
		setToken("appPrefix", multirequestToken);
	}

	// transcoder:
	public String getTranscoder(){
		return this.transcoder;
	}
	public void setTranscoder(String transcoder){
		this.transcoder = transcoder;
	}

	public void transcoder(String multirequestToken){
		setToken("transcoder", multirequestToken);
	}

	// GPUID:
	public Integer getGPUID(){
		return this.GPUID;
	}
	public void setGPUID(Integer GPUID){
		this.GPUID = GPUID;
	}

	public void GPUID(String multirequestToken){
		setToken("GPUID", multirequestToken);
	}

	// liveServicePort:
	public Integer getLiveServicePort(){
		return this.liveServicePort;
	}
	public void setLiveServicePort(Integer liveServicePort){
		this.liveServicePort = liveServicePort;
	}

	public void liveServicePort(String multirequestToken){
		setToken("liveServicePort", multirequestToken);
	}

	// liveServiceProtocol:
	public String getLiveServiceProtocol(){
		return this.liveServiceProtocol;
	}
	public void setLiveServiceProtocol(String liveServiceProtocol){
		this.liveServiceProtocol = liveServiceProtocol;
	}

	public void liveServiceProtocol(String multirequestToken){
		setToken("liveServiceProtocol", multirequestToken);
	}

	// liveServiceInternalDomain:
	public String getLiveServiceInternalDomain(){
		return this.liveServiceInternalDomain;
	}
	public void setLiveServiceInternalDomain(String liveServiceInternalDomain){
		this.liveServiceInternalDomain = liveServiceInternalDomain;
	}

	public void liveServiceInternalDomain(String multirequestToken){
		setToken("liveServiceInternalDomain", multirequestToken);
	}


	public WowzaMediaServerNode() {
		super();
	}

	public WowzaMediaServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		appPrefix = GsonParser.parseString(jsonObject.get("appPrefix"));
		transcoder = GsonParser.parseString(jsonObject.get("transcoder"));
		GPUID = GsonParser.parseInt(jsonObject.get("GPUID"));
		liveServicePort = GsonParser.parseInt(jsonObject.get("liveServicePort"));
		liveServiceProtocol = GsonParser.parseString(jsonObject.get("liveServiceProtocol"));
		liveServiceInternalDomain = GsonParser.parseString(jsonObject.get("liveServiceInternalDomain"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWowzaMediaServerNode");
		kparams.add("appPrefix", this.appPrefix);
		kparams.add("transcoder", this.transcoder);
		kparams.add("GPUID", this.GPUID);
		kparams.add("liveServicePort", this.liveServicePort);
		kparams.add("liveServiceProtocol", this.liveServiceProtocol);
		kparams.add("liveServiceInternalDomain", this.liveServiceInternalDomain);
		return kparams;
	}

}

