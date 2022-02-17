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
import com.kaltura.client.enums.ContainerFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ThumbParamsBaseFilter.Tokenizer.class)
public abstract class ThumbParamsBaseFilter extends AssetParamsFilter {
	
	public interface Tokenizer extends AssetParamsFilter.Tokenizer {
		String formatEqual();
	}

	private ContainerFormat formatEqual;

	// formatEqual:
	public ContainerFormat getFormatEqual(){
		return this.formatEqual;
	}
	public void setFormatEqual(ContainerFormat formatEqual){
		this.formatEqual = formatEqual;
	}

	public void formatEqual(String multirequestToken){
		setToken("formatEqual", multirequestToken);
	}


	public ThumbParamsBaseFilter() {
		super();
	}

	public ThumbParamsBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		formatEqual = ContainerFormat.get(GsonParser.parseString(jsonObject.get("formatEqual")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaThumbParamsBaseFilter");
		kparams.add("formatEqual", this.formatEqual);
		return kparams;
	}

}

