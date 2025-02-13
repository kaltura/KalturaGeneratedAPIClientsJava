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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MetroPcsDistributionJobProviderData.Tokenizer.class)
public class MetroPcsDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String assetLocalPaths();
		String thumbUrls();
	}

	private String assetLocalPaths;
	private String thumbUrls;

	// assetLocalPaths:
	public String getAssetLocalPaths(){
		return this.assetLocalPaths;
	}
	public void setAssetLocalPaths(String assetLocalPaths){
		this.assetLocalPaths = assetLocalPaths;
	}

	public void assetLocalPaths(String multirequestToken){
		setToken("assetLocalPaths", multirequestToken);
	}

	// thumbUrls:
	public String getThumbUrls(){
		return this.thumbUrls;
	}
	public void setThumbUrls(String thumbUrls){
		this.thumbUrls = thumbUrls;
	}

	public void thumbUrls(String multirequestToken){
		setToken("thumbUrls", multirequestToken);
	}


	public MetroPcsDistributionJobProviderData() {
		super();
	}

	public MetroPcsDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetLocalPaths = GsonParser.parseString(jsonObject.get("assetLocalPaths"));
		thumbUrls = GsonParser.parseString(jsonObject.get("thumbUrls"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMetroPcsDistributionJobProviderData");
		kparams.add("assetLocalPaths", this.assetLocalPaths);
		kparams.add("thumbUrls", this.thumbUrls);
		return kparams;
	}

}

