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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Object which contains contextual entry-related data.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryContextDataParams.Tokenizer.class)
public class EntryContextDataParams extends AccessControlScope {
	
	public interface Tokenizer extends AccessControlScope.Tokenizer {
		String flavorAssetId();
		String flavorTags();
		String streamerType();
		String mediaProtocol();
	}

	/**
	 * Id of the current flavor.
	 */
	private String flavorAssetId;
	/**
	 * The tags of the flavors that should be used for playback.
	 */
	private String flavorTags;
	/**
	 * Playback streamer type: RTMP, HTTP, appleHttps, rtsp, sl.
	 */
	private String streamerType;
	/**
	 * Protocol of the specific media object.
	 */
	private String mediaProtocol;

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

	// flavorTags:
	public String getFlavorTags(){
		return this.flavorTags;
	}
	public void setFlavorTags(String flavorTags){
		this.flavorTags = flavorTags;
	}

	public void flavorTags(String multirequestToken){
		setToken("flavorTags", multirequestToken);
	}

	// streamerType:
	public String getStreamerType(){
		return this.streamerType;
	}
	public void setStreamerType(String streamerType){
		this.streamerType = streamerType;
	}

	public void streamerType(String multirequestToken){
		setToken("streamerType", multirequestToken);
	}

	// mediaProtocol:
	public String getMediaProtocol(){
		return this.mediaProtocol;
	}
	public void setMediaProtocol(String mediaProtocol){
		this.mediaProtocol = mediaProtocol;
	}

	public void mediaProtocol(String multirequestToken){
		setToken("mediaProtocol", multirequestToken);
	}


	public EntryContextDataParams() {
		super();
	}

	public EntryContextDataParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		flavorAssetId = GsonParser.parseString(jsonObject.get("flavorAssetId"));
		flavorTags = GsonParser.parseString(jsonObject.get("flavorTags"));
		streamerType = GsonParser.parseString(jsonObject.get("streamerType"));
		mediaProtocol = GsonParser.parseString(jsonObject.get("mediaProtocol"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryContextDataParams");
		kparams.add("flavorAssetId", this.flavorAssetId);
		kparams.add("flavorTags", this.flavorTags);
		kparams.add("streamerType", this.streamerType);
		kparams.add("mediaProtocol", this.mediaProtocol);
		return kparams;
	}

}

