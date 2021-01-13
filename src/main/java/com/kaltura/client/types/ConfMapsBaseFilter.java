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
// Copyright (C) 2006-2021  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ConfMapsBaseFilter.Tokenizer.class)
public abstract class ConfMapsBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String nameEqual();
		String relatedHostEqual();
		String versionEqual();
	}

	private String nameEqual;
	private String relatedHostEqual;
	private Integer versionEqual;

	// nameEqual:
	public String getNameEqual(){
		return this.nameEqual;
	}
	public void setNameEqual(String nameEqual){
		this.nameEqual = nameEqual;
	}

	public void nameEqual(String multirequestToken){
		setToken("nameEqual", multirequestToken);
	}

	// relatedHostEqual:
	public String getRelatedHostEqual(){
		return this.relatedHostEqual;
	}
	public void setRelatedHostEqual(String relatedHostEqual){
		this.relatedHostEqual = relatedHostEqual;
	}

	public void relatedHostEqual(String multirequestToken){
		setToken("relatedHostEqual", multirequestToken);
	}

	// versionEqual:
	public Integer getVersionEqual(){
		return this.versionEqual;
	}
	public void setVersionEqual(Integer versionEqual){
		this.versionEqual = versionEqual;
	}

	public void versionEqual(String multirequestToken){
		setToken("versionEqual", multirequestToken);
	}


	public ConfMapsBaseFilter() {
		super();
	}

	public ConfMapsBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		nameEqual = GsonParser.parseString(jsonObject.get("nameEqual"));
		relatedHostEqual = GsonParser.parseString(jsonObject.get("relatedHostEqual"));
		versionEqual = GsonParser.parseInt(jsonObject.get("versionEqual"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConfMapsBaseFilter");
		kparams.add("nameEqual", this.nameEqual);
		kparams.add("relatedHostEqual", this.relatedHostEqual);
		kparams.add("versionEqual", this.versionEqual);
		return kparams;
	}

}

