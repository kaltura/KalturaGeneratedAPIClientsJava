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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(StreamContainer.Tokenizer.class)
public class StreamContainer extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String type();
		String trackIndex();
		String language();
		String channelIndex();
		String label();
		String channelLayout();
	}

	private String id;
	private String type;
	private Integer trackIndex;
	private String language;
	private Integer channelIndex;
	private String label;
	private String channelLayout;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// type:
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// trackIndex:
	public Integer getTrackIndex(){
		return this.trackIndex;
	}
	public void setTrackIndex(Integer trackIndex){
		this.trackIndex = trackIndex;
	}

	public void trackIndex(String multirequestToken){
		setToken("trackIndex", multirequestToken);
	}

	// language:
	public String getLanguage(){
		return this.language;
	}
	public void setLanguage(String language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// channelIndex:
	public Integer getChannelIndex(){
		return this.channelIndex;
	}
	public void setChannelIndex(Integer channelIndex){
		this.channelIndex = channelIndex;
	}

	public void channelIndex(String multirequestToken){
		setToken("channelIndex", multirequestToken);
	}

	// label:
	public String getLabel(){
		return this.label;
	}
	public void setLabel(String label){
		this.label = label;
	}

	public void label(String multirequestToken){
		setToken("label", multirequestToken);
	}

	// channelLayout:
	public String getChannelLayout(){
		return this.channelLayout;
	}
	public void setChannelLayout(String channelLayout){
		this.channelLayout = channelLayout;
	}

	public void channelLayout(String multirequestToken){
		setToken("channelLayout", multirequestToken);
	}


	public StreamContainer() {
		super();
	}

	public StreamContainer(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		type = GsonParser.parseString(jsonObject.get("type"));
		trackIndex = GsonParser.parseInt(jsonObject.get("trackIndex"));
		language = GsonParser.parseString(jsonObject.get("language"));
		channelIndex = GsonParser.parseInt(jsonObject.get("channelIndex"));
		label = GsonParser.parseString(jsonObject.get("label"));
		channelLayout = GsonParser.parseString(jsonObject.get("channelLayout"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaStreamContainer");
		kparams.add("id", this.id);
		kparams.add("type", this.type);
		kparams.add("trackIndex", this.trackIndex);
		kparams.add("language", this.language);
		kparams.add("channelIndex", this.channelIndex);
		kparams.add("label", this.label);
		kparams.add("channelLayout", this.channelLayout);
		return kparams;
	}

}

