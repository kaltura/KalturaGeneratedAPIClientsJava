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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetServeOptions.Tokenizer.class)
public class AssetServeOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String download();
		String referrer();
	}

	private Boolean download;
	private String referrer;

	// download:
	public Boolean getDownload(){
		return this.download;
	}
	public void setDownload(Boolean download){
		this.download = download;
	}

	public void download(String multirequestToken){
		setToken("download", multirequestToken);
	}

	// referrer:
	public String getReferrer(){
		return this.referrer;
	}
	public void setReferrer(String referrer){
		this.referrer = referrer;
	}

	public void referrer(String multirequestToken){
		setToken("referrer", multirequestToken);
	}


	public AssetServeOptions() {
		super();
	}

	public AssetServeOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		download = GsonParser.parseBoolean(jsonObject.get("download"));
		referrer = GsonParser.parseString(jsonObject.get("referrer"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetServeOptions");
		kparams.add("download", this.download);
		kparams.add("referrer", this.referrer);
		return kparams;
	}

}

