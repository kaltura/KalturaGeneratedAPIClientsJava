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
@MultiRequestBuilder.Tokenizer(BusinessProcessServerFilter.Tokenizer.class)
public class BusinessProcessServerFilter extends BusinessProcessServerBaseFilter {
	
	public interface Tokenizer extends BusinessProcessServerBaseFilter.Tokenizer {
		String currentDcOrExternal();
		String currentDc();
	}

	private Boolean currentDcOrExternal;
	private Boolean currentDc;

	// currentDcOrExternal:
	public Boolean getCurrentDcOrExternal(){
		return this.currentDcOrExternal;
	}
	public void setCurrentDcOrExternal(Boolean currentDcOrExternal){
		this.currentDcOrExternal = currentDcOrExternal;
	}

	public void currentDcOrExternal(String multirequestToken){
		setToken("currentDcOrExternal", multirequestToken);
	}

	// currentDc:
	public Boolean getCurrentDc(){
		return this.currentDc;
	}
	public void setCurrentDc(Boolean currentDc){
		this.currentDc = currentDc;
	}

	public void currentDc(String multirequestToken){
		setToken("currentDc", multirequestToken);
	}


	public BusinessProcessServerFilter() {
		super();
	}

	public BusinessProcessServerFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		currentDcOrExternal = GsonParser.parseBoolean(jsonObject.get("currentDcOrExternal"));
		currentDc = GsonParser.parseBoolean(jsonObject.get("currentDc"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBusinessProcessServerFilter");
		kparams.add("currentDcOrExternal", this.currentDcOrExternal);
		kparams.add("currentDc", this.currentDc);
		return kparams;
	}

}

