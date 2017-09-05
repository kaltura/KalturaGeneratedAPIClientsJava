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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FairplayEntryContextPluginData.Tokenizer.class)
public class FairplayEntryContextPluginData extends PluginData {
	
	public interface Tokenizer extends PluginData.Tokenizer {
		String publicCertificate();
	}

	/**  For fairplay (and maybe in the future other drm providers) we need to return a
	  public certificate to encrypt   the request from the player to the server.  */
	private String publicCertificate;

	// publicCertificate:
	public String getPublicCertificate(){
		return this.publicCertificate;
	}
	public void setPublicCertificate(String publicCertificate){
		this.publicCertificate = publicCertificate;
	}

	public void publicCertificate(String multirequestToken){
		setToken("publicCertificate", multirequestToken);
	}


	public FairplayEntryContextPluginData() {
		super();
	}

	public FairplayEntryContextPluginData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		publicCertificate = GsonParser.parseString(jsonObject.get("publicCertificate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFairplayEntryContextPluginData");
		kparams.add("publicCertificate", this.publicCertificate);
		return kparams;
	}

}

