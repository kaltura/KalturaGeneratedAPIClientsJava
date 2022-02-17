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
// Copyright (C) 2006-2022  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(PodcastDistributionProfile.Tokenizer.class)
public class PodcastDistributionProfile extends DistributionProfile {
	
	public interface Tokenizer extends DistributionProfile.Tokenizer {
		String xsl();
		String feedId();
		String metadataProfileId();
	}

	private String xsl;
	private String feedId;
	private Integer metadataProfileId;

	// xsl:
	public String getXsl(){
		return this.xsl;
	}
	public void setXsl(String xsl){
		this.xsl = xsl;
	}

	public void xsl(String multirequestToken){
		setToken("xsl", multirequestToken);
	}

	// feedId:
	public String getFeedId(){
		return this.feedId;
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


	public PodcastDistributionProfile() {
		super();
	}

	public PodcastDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xsl = GsonParser.parseString(jsonObject.get("xsl"));
		feedId = GsonParser.parseString(jsonObject.get("feedId"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPodcastDistributionProfile");
		kparams.add("xsl", this.xsl);
		kparams.add("metadataProfileId", this.metadataProfileId);
		return kparams;
	}

}

