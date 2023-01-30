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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IdeticDistributionJobProviderData.Tokenizer.class)
public class IdeticDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String thumbnailUrl();
		String flavorAssetUrl();
	}

	private String thumbnailUrl;
	private String flavorAssetUrl;

	// thumbnailUrl:
	public String getThumbnailUrl(){
		return this.thumbnailUrl;
	}
	public void setThumbnailUrl(String thumbnailUrl){
		this.thumbnailUrl = thumbnailUrl;
	}

	public void thumbnailUrl(String multirequestToken){
		setToken("thumbnailUrl", multirequestToken);
	}

	// flavorAssetUrl:
	public String getFlavorAssetUrl(){
		return this.flavorAssetUrl;
	}
	public void setFlavorAssetUrl(String flavorAssetUrl){
		this.flavorAssetUrl = flavorAssetUrl;
	}

	public void flavorAssetUrl(String multirequestToken){
		setToken("flavorAssetUrl", multirequestToken);
	}


	public IdeticDistributionJobProviderData() {
		super();
	}

	public IdeticDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		thumbnailUrl = GsonParser.parseString(jsonObject.get("thumbnailUrl"));
		flavorAssetUrl = GsonParser.parseString(jsonObject.get("flavorAssetUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIdeticDistributionJobProviderData");
		kparams.add("thumbnailUrl", this.thumbnailUrl);
		kparams.add("flavorAssetUrl", this.flavorAssetUrl);
		return kparams;
	}

}

