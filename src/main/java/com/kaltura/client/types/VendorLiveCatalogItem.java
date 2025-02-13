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
@MultiRequestBuilder.Tokenizer(VendorLiveCatalogItem.Tokenizer.class)
public class VendorLiveCatalogItem extends VendorCaptionsCatalogItem {
	
	public interface Tokenizer extends VendorCaptionsCatalogItem.Tokenizer {
		String minimalRefundTime();
		String minimalOrderTime();
		String durationLimit();
	}

	private Integer minimalRefundTime;
	private Integer minimalOrderTime;
	private Integer durationLimit;

	// minimalRefundTime:
	public Integer getMinimalRefundTime(){
		return this.minimalRefundTime;
	}
	public void setMinimalRefundTime(Integer minimalRefundTime){
		this.minimalRefundTime = minimalRefundTime;
	}

	public void minimalRefundTime(String multirequestToken){
		setToken("minimalRefundTime", multirequestToken);
	}

	// minimalOrderTime:
	public Integer getMinimalOrderTime(){
		return this.minimalOrderTime;
	}
	public void setMinimalOrderTime(Integer minimalOrderTime){
		this.minimalOrderTime = minimalOrderTime;
	}

	public void minimalOrderTime(String multirequestToken){
		setToken("minimalOrderTime", multirequestToken);
	}

	// durationLimit:
	public Integer getDurationLimit(){
		return this.durationLimit;
	}
	public void setDurationLimit(Integer durationLimit){
		this.durationLimit = durationLimit;
	}

	public void durationLimit(String multirequestToken){
		setToken("durationLimit", multirequestToken);
	}


	public VendorLiveCatalogItem() {
		super();
	}

	public VendorLiveCatalogItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		minimalRefundTime = GsonParser.parseInt(jsonObject.get("minimalRefundTime"));
		minimalOrderTime = GsonParser.parseInt(jsonObject.get("minimalOrderTime"));
		durationLimit = GsonParser.parseInt(jsonObject.get("durationLimit"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorLiveCatalogItem");
		kparams.add("minimalRefundTime", this.minimalRefundTime);
		kparams.add("minimalOrderTime", this.minimalOrderTime);
		kparams.add("durationLimit", this.durationLimit);
		return kparams;
	}

}

