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
// Copyright (C) 2006-2020  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(CompareMetadataCondition.Tokenizer.class)
public class CompareMetadataCondition extends CompareCondition {
	
	public interface Tokenizer extends CompareCondition.Tokenizer {
		String xPath();
		String profileId();
		String profileSystemName();
	}

	/**
	 * May contain the full xpath to the field in three formats   1. Slashed xPath,
	  e.g. /metadata/myElementName   2. Using local-name function, e.g.
	  /[local-name()='metadata']/[local-name()='myElementName']   3. Using only the
	  field name, e.g. myElementName, it will be searched as //myElementName
	 */
	private String xPath;
	/**
	 * Metadata profile id
	 */
	private Integer profileId;
	/**
	 * Metadata profile system name
	 */
	private String profileSystemName;

	// xPath:
	public String getXPath(){
		return this.xPath;
	}
	public void setXPath(String xPath){
		this.xPath = xPath;
	}

	public void xPath(String multirequestToken){
		setToken("xPath", multirequestToken);
	}

	// profileId:
	public Integer getProfileId(){
		return this.profileId;
	}
	public void setProfileId(Integer profileId){
		this.profileId = profileId;
	}

	public void profileId(String multirequestToken){
		setToken("profileId", multirequestToken);
	}

	// profileSystemName:
	public String getProfileSystemName(){
		return this.profileSystemName;
	}
	public void setProfileSystemName(String profileSystemName){
		this.profileSystemName = profileSystemName;
	}

	public void profileSystemName(String multirequestToken){
		setToken("profileSystemName", multirequestToken);
	}


	public CompareMetadataCondition() {
		super();
	}

	public CompareMetadataCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xPath = GsonParser.parseString(jsonObject.get("xPath"));
		profileId = GsonParser.parseInt(jsonObject.get("profileId"));
		profileSystemName = GsonParser.parseString(jsonObject.get("profileSystemName"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCompareMetadataCondition");
		kparams.add("xPath", this.xPath);
		kparams.add("profileId", this.profileId);
		kparams.add("profileSystemName", this.profileSystemName);
		return kparams;
	}

}

