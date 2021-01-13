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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlayerDeliveryType.Tokenizer.class)
public class PlayerDeliveryType extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String label();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> flashvars();
		String minVersion();
		String enabledByDefault();
	}

	private String id;
	private String label;
	private List<KeyValue> flashvars;
	private String minVersion;
	private Boolean enabledByDefault;

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

	// flashvars:
	public List<KeyValue> getFlashvars(){
		return this.flashvars;
	}
	public void setFlashvars(List<KeyValue> flashvars){
		this.flashvars = flashvars;
	}

	// minVersion:
	public String getMinVersion(){
		return this.minVersion;
	}
	public void setMinVersion(String minVersion){
		this.minVersion = minVersion;
	}

	public void minVersion(String multirequestToken){
		setToken("minVersion", multirequestToken);
	}

	// enabledByDefault:
	public Boolean getEnabledByDefault(){
		return this.enabledByDefault;
	}
	public void setEnabledByDefault(Boolean enabledByDefault){
		this.enabledByDefault = enabledByDefault;
	}

	public void enabledByDefault(String multirequestToken){
		setToken("enabledByDefault", multirequestToken);
	}


	public PlayerDeliveryType() {
		super();
	}

	public PlayerDeliveryType(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		label = GsonParser.parseString(jsonObject.get("label"));
		flashvars = GsonParser.parseArray(jsonObject.getAsJsonArray("flashvars"), KeyValue.class);
		minVersion = GsonParser.parseString(jsonObject.get("minVersion"));
		enabledByDefault = GsonParser.parseBoolean(jsonObject.get("enabledByDefault"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlayerDeliveryType");
		kparams.add("id", this.id);
		kparams.add("label", this.label);
		kparams.add("flashvars", this.flashvars);
		kparams.add("minVersion", this.minVersion);
		kparams.add("enabledByDefault", this.enabledByDefault);
		return kparams;
	}

}

