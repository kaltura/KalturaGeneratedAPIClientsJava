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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.MetadataObjectType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ExecuteMetadataXsltObjectTask.Tokenizer.class)
public class ExecuteMetadataXsltObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String metadataProfileId();
		String metadataObjectType();
		String xslt();
	}

	/**
	 * Metadata profile id to lookup the metadata object
	 */
	private Integer metadataProfileId;
	/**
	 * Metadata object type to lookup the metadata object
	 */
	private MetadataObjectType metadataObjectType;
	/**
	 * The XSLT to execute
	 */
	private String xslt;

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

	// metadataObjectType:
	public MetadataObjectType getMetadataObjectType(){
		return this.metadataObjectType;
	}
	public void setMetadataObjectType(MetadataObjectType metadataObjectType){
		this.metadataObjectType = metadataObjectType;
	}

	public void metadataObjectType(String multirequestToken){
		setToken("metadataObjectType", multirequestToken);
	}

	// xslt:
	public String getXslt(){
		return this.xslt;
	}
	public void setXslt(String xslt){
		this.xslt = xslt;
	}

	public void xslt(String multirequestToken){
		setToken("xslt", multirequestToken);
	}


	public ExecuteMetadataXsltObjectTask() {
		super();
	}

	public ExecuteMetadataXsltObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));
		metadataObjectType = MetadataObjectType.get(GsonParser.parseString(jsonObject.get("metadataObjectType")));
		xslt = GsonParser.parseString(jsonObject.get("xslt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExecuteMetadataXsltObjectTask");
		kparams.add("metadataProfileId", this.metadataProfileId);
		kparams.add("metadataObjectType", this.metadataObjectType);
		kparams.add("xslt", this.xslt);
		return kparams;
	}

}

