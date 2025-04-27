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
@MultiRequestBuilder.Tokenizer(VendorLiveCaptionCatalogItem.Tokenizer.class)
public class VendorLiveCaptionCatalogItem extends VendorLiveCatalogItem {
	
	public interface Tokenizer extends VendorLiveCatalogItem.Tokenizer {
		String startTimeBuffer();
		String endTimeBuffer();
	}

	/**
	 * How long before the live stream start should service activate? (in secs)
	 */
	private Integer startTimeBuffer;
	/**
	 * How long after the live stream end should service de-activate? (in secs)
	 */
	private Integer endTimeBuffer;

	// startTimeBuffer:
	public Integer getStartTimeBuffer(){
		return this.startTimeBuffer;
	}
	public void setStartTimeBuffer(Integer startTimeBuffer){
		this.startTimeBuffer = startTimeBuffer;
	}

	public void startTimeBuffer(String multirequestToken){
		setToken("startTimeBuffer", multirequestToken);
	}

	// endTimeBuffer:
	public Integer getEndTimeBuffer(){
		return this.endTimeBuffer;
	}
	public void setEndTimeBuffer(Integer endTimeBuffer){
		this.endTimeBuffer = endTimeBuffer;
	}

	public void endTimeBuffer(String multirequestToken){
		setToken("endTimeBuffer", multirequestToken);
	}


	public VendorLiveCaptionCatalogItem() {
		super();
	}

	public VendorLiveCaptionCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		startTimeBuffer = GsonParser.parseInt(jsonObject.get("startTimeBuffer"));
		endTimeBuffer = GsonParser.parseInt(jsonObject.get("endTimeBuffer"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorLiveCaptionCatalogItem");
		kparams.add("startTimeBuffer", this.startTimeBuffer);
		kparams.add("endTimeBuffer", this.endTimeBuffer);
		return kparams;
	}

}

