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
@MultiRequestBuilder.Tokenizer(ESearchMetadataOrderByItem.Tokenizer.class)
public class ESearchMetadataOrderByItem extends ESearchOrderByItem {
	
	public interface Tokenizer extends ESearchOrderByItem.Tokenizer {
		String xpath();
		String metadataProfileId();
	}

	private String xpath;
	private Integer metadataProfileId;

	// xpath:
	public String getXpath(){
		return this.xpath;
	}
	public void setXpath(String xpath){
		this.xpath = xpath;
	}

	public void xpath(String multirequestToken){
		setToken("xpath", multirequestToken);
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


	public ESearchMetadataOrderByItem() {
		super();
	}

	public ESearchMetadataOrderByItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		xpath = GsonParser.parseString(jsonObject.get("xpath"));
		metadataProfileId = GsonParser.parseInt(jsonObject.get("metadataProfileId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchMetadataOrderByItem");
		kparams.add("xpath", this.xpath);
		kparams.add("metadataProfileId", this.metadataProfileId);
		return kparams;
	}

}

