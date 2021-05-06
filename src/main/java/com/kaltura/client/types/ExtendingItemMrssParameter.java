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
import com.kaltura.client.enums.MrssExtensionMode;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ObjectIdentifier;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ExtendingItemMrssParameter.Tokenizer.class)
public class ExtendingItemMrssParameter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String xpath();
		ObjectIdentifier.Tokenizer identifier();
		String extensionMode();
	}

	/**
	 * XPath for the extending item
	 */
	private String xpath;
	/**
	 * Object identifier
	 */
	private ObjectIdentifier identifier;
	/**
	 * Mode of extension - append to MRSS or replace the xpath content.
	 */
	private MrssExtensionMode extensionMode;

	// xpath:
	public String getXpath(){
		return this.xpath;
	}
	public void setXpath(String xpath){
		this.xpath = xpath;
	}

	public void xpath(String multirequestToken){
		setToken("xpath", multirequestToken);
	}

	// identifier:
	public ObjectIdentifier getIdentifier(){
		return this.identifier;
	}
	public void setIdentifier(ObjectIdentifier identifier){
		this.identifier = identifier;
	}

	// extensionMode:
	public MrssExtensionMode getExtensionMode(){
		return this.extensionMode;
	}
	public void setExtensionMode(MrssExtensionMode extensionMode){
		this.extensionMode = extensionMode;
	}

	public void extensionMode(String multirequestToken){
		setToken("extensionMode", multirequestToken);
	}


	public ExtendingItemMrssParameter() {
		super();
	}

	public ExtendingItemMrssParameter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xpath = GsonParser.parseString(jsonObject.get("xpath"));
		identifier = GsonParser.parseObject(jsonObject.getAsJsonObject("identifier"), ObjectIdentifier.class);
		extensionMode = MrssExtensionMode.get(GsonParser.parseInt(jsonObject.get("extensionMode")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExtendingItemMrssParameter");
		kparams.add("xpath", this.xpath);
		kparams.add("identifier", this.identifier);
		kparams.add("extensionMode", this.extensionMode);
		return kparams;
	}

}

