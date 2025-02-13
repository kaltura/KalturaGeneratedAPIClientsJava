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
@MultiRequestBuilder.Tokenizer(PodcastDistributionJobProviderData.Tokenizer.class)
public class PodcastDistributionJobProviderData extends DistributionJobProviderData {
	
	public interface Tokenizer extends DistributionJobProviderData.Tokenizer {
		String xml();
		String metadataProfileId();
		String distributionProfileId();
	}

	private String xml;
	private Integer metadataProfileId;
	private Integer distributionProfileId;

	// xml:
	public String getXml(){
		return this.xml;
	}
	public void setXml(String xml){
		this.xml = xml;
	}

	public void xml(String multirequestToken){
		setToken("xml", multirequestToken);
	}

	// metadataProfileId:
	public Integer getMetadataProfileId(){
		return this.metadataProfileId;
	}
	public void setMetadataProfileId(Integer metadataProfileId){
		this.metadataProfileId = metadataProfileId;
	}

	public void metadataProfileId(String multirequestToken){
		setToken("metadataProfileId", multirequestToken);
	}

	// distributionProfileId:
	public Integer getDistributionProfileId(){
		return this.distributionProfileId;
	}
	public void setDistributionProfileId(Integer distributionProfileId){
		this.distributionProfileId = distributionProfileId;
	}

	public void distributionProfileId(String multirequestToken){
		setToken("distributionProfileId", multirequestToken);
	}


	public PodcastDistributionJobProviderData() {
		super();
	}

	public PodcastDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xml = GsonParser.parseString(jsonObject.get("xml"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		distributionProfileId = GsonParser.parseInt(jsonObject.get("distributionProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPodcastDistributionJobProviderData");
		kparams.add("xml", this.xml);
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("distributionProfileId", this.distributionProfileId);
		return kparams;
	}

}

