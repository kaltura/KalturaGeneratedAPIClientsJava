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
import com.kaltura.client.types.FileContainer;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TransformMetadataJobData.Tokenizer.class)
public class TransformMetadataJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		FileContainer.Tokenizer srcXsl();
		String srcVersion();
		String destVersion();
		String destXsdPath();
		String metadataProfileId();
	}

	private FileContainer srcXsl;
	private Integer srcVersion;
	private Integer destVersion;
	private String destXsdPath;
	private Integer metadataProfileId;

	// srcXsl:
	public FileContainer getSrcXsl(){
		return this.srcXsl;
	}
	public void setSrcXsl(FileContainer srcXsl){
		this.srcXsl = srcXsl;
	}

	// srcVersion:
	public Integer getSrcVersion(){
		return this.srcVersion;
	}
	public void setSrcVersion(Integer srcVersion){
		this.srcVersion = srcVersion;
	}

	public void srcVersion(String multirequestToken){
		setToken("srcVersion", multirequestToken);
	}

	// destVersion:
	public Integer getDestVersion(){
		return this.destVersion;
	}
	public void setDestVersion(Integer destVersion){
		this.destVersion = destVersion;
	}

	public void destVersion(String multirequestToken){
		setToken("destVersion", multirequestToken);
	}

	// destXsdPath:
	public String getDestXsdPath(){
		return this.destXsdPath;
	}
	public void setDestXsdPath(String destXsdPath){
		this.destXsdPath = destXsdPath;
	}

	public void destXsdPath(String multirequestToken){
		setToken("destXsdPath", multirequestToken);
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


	public TransformMetadataJobData() {
		super();
	}

	public TransformMetadataJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		srcXsl = GsonParser.parseObject(jsonObject.getAsJsonObject("srcXsl"), FileContainer.class);
		srcVersion = GsonParser.parseInt(jsonObject.get("srcVersion"));
		destVersion = GsonParser.parseInt(jsonObject.get("destVersion"));
		destXsdPath = GsonParser.parseString(jsonObject.get("destXsdPath"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTransformMetadataJobData");
		kparams.add("srcXsl", this.srcXsl);
		kparams.add("srcVersion", this.srcVersion);
		kparams.add("destVersion", this.destVersion);
		kparams.add("destXsdPath", this.destXsdPath);
		kparams.add("metadataProfileId", this.metadataProfileId);
		return kparams;
	}

}

