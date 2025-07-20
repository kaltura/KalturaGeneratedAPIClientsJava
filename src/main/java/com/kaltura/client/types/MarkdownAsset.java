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
// Copyright (C) 2006-2023  Kaltura Inc.
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
import com.kaltura.client.enums.MarkdownProviderType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MarkdownAsset.Tokenizer.class)
public class MarkdownAsset extends AttachmentAsset {
	
	public interface Tokenizer extends AttachmentAsset.Tokenizer {
		String accuracy();
		String providerType();
	}

	/**
	 * The percentage accuracy of the markdown - values between 0 and 100
	 */
	private Integer accuracy;
	/**
	 * The provider of the markdown
	 */
	private MarkdownProviderType providerType;

	// accuracy:
	public Integer getAccuracy(){
		return this.accuracy;
	}
	public void setAccuracy(Integer accuracy){
		this.accuracy = accuracy;
	}

	public void accuracy(String multirequestToken){
		setToken("accuracy", multirequestToken);
	}

	// providerType:
	public MarkdownProviderType getProviderType(){
		return this.providerType;
	}
	public void setProviderType(MarkdownProviderType providerType){
		this.providerType = providerType;
	}

	public void providerType(String multirequestToken){
		setToken("providerType", multirequestToken);
	}


	public MarkdownAsset() {
		super();
	}

	public MarkdownAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		accuracy = GsonParser.parseInt(jsonObject.get("accuracy"));
		providerType = MarkdownProviderType.get(GsonParser.parseString(jsonObject.get("providerType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMarkdownAsset");
		kparams.add("accuracy", this.accuracy);
		kparams.add("providerType", this.providerType);
		return kparams;
	}

}

