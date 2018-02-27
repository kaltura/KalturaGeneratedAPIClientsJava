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
// Copyright (C) 2006-2018  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EdgeServerNode.Tokenizer.class)
public class EdgeServerNode extends DeliveryServerNode {
	
	public interface Tokenizer extends DeliveryServerNode.Tokenizer {
		String playbackDomain();
		String config();
	}

	/**
	 * Delivery server playback Domain
	 */
	private String playbackDomain;
	/**
	 * Overdie edge server default configuration - json format
	 */
	private String config;

	// playbackDomain:
	public String getPlaybackDomain(){
		return this.playbackDomain;
	}
	public void setPlaybackDomain(String playbackDomain){
		this.playbackDomain = playbackDomain;
	}

	public void playbackDomain(String multirequestToken){
		setToken("playbackDomain", multirequestToken);
	}

	// config:
	public String getConfig(){
		return this.config;
	}
	public void setConfig(String config){
		this.config = config;
	}

	public void config(String multirequestToken){
		setToken("config", multirequestToken);
	}


	public EdgeServerNode() {
		super();
	}

	public EdgeServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playbackDomain = GsonParser.parseString(jsonObject.get("playbackDomain"));
		config = GsonParser.parseString(jsonObject.get("config"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEdgeServerNode");
		kparams.add("playbackDomain", this.playbackDomain);
		kparams.add("config", this.config);
		return kparams;
	}

}

