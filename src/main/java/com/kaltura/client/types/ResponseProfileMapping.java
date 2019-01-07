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
// Copyright (C) 2006-2019  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ResponseProfileMapping.Tokenizer.class)
public class ResponseProfileMapping extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String parentProperty();
		String filterProperty();
		String allowNull();
	}

	private String parentProperty;
	private String filterProperty;
	private Boolean allowNull;

	// parentProperty:
	public String getParentProperty(){
		return this.parentProperty;
	}
	public void setParentProperty(String parentProperty){
		this.parentProperty = parentProperty;
	}

	public void parentProperty(String multirequestToken){
		setToken("parentProperty", multirequestToken);
	}

	// filterProperty:
	public String getFilterProperty(){
		return this.filterProperty;
	}
	public void setFilterProperty(String filterProperty){
		this.filterProperty = filterProperty;
	}

	public void filterProperty(String multirequestToken){
		setToken("filterProperty", multirequestToken);
	}

	// allowNull:
	public Boolean getAllowNull(){
		return this.allowNull;
	}
	public void setAllowNull(Boolean allowNull){
		this.allowNull = allowNull;
	}

	public void allowNull(String multirequestToken){
		setToken("allowNull", multirequestToken);
	}


	public ResponseProfileMapping() {
		super();
	}

	public ResponseProfileMapping(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		parentProperty = GsonParser.parseString(jsonObject.get("parentProperty"));
		filterProperty = GsonParser.parseString(jsonObject.get("filterProperty"));
		allowNull = GsonParser.parseBoolean(jsonObject.get("allowNull"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaResponseProfileMapping");
		kparams.add("parentProperty", this.parentProperty);
		kparams.add("filterProperty", this.filterProperty);
		kparams.add("allowNull", this.allowNull);
		return kparams;
	}

}

