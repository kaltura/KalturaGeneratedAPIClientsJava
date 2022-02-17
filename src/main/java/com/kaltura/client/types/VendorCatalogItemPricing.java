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
import com.kaltura.client.enums.VendorCatalogItemPriceFunction;
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
@MultiRequestBuilder.Tokenizer(VendorCatalogItemPricing.Tokenizer.class)
public class VendorCatalogItemPricing extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String pricePerUnit();
		String priceFunction();
	}

	private Double pricePerUnit;
	private VendorCatalogItemPriceFunction priceFunction;

	// pricePerUnit:
	public Double getPricePerUnit(){
		return this.pricePerUnit;
	}
	public void setPricePerUnit(Double pricePerUnit){
		this.pricePerUnit = pricePerUnit;
	}

	public void pricePerUnit(String multirequestToken){
		setToken("pricePerUnit", multirequestToken);
	}

	// priceFunction:
	public VendorCatalogItemPriceFunction getPriceFunction(){
		return this.priceFunction;
	}
	public void setPriceFunction(VendorCatalogItemPriceFunction priceFunction){
		this.priceFunction = priceFunction;
	}

	public void priceFunction(String multirequestToken){
		setToken("priceFunction", multirequestToken);
	}


	public VendorCatalogItemPricing() {
		super();
	}

	public VendorCatalogItemPricing(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		pricePerUnit = GsonParser.parseDouble(jsonObject.get("pricePerUnit"));
		priceFunction = VendorCatalogItemPriceFunction.get(GsonParser.parseString(jsonObject.get("priceFunction")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCatalogItemPricing");
		kparams.add("pricePerUnit", this.pricePerUnit);
		kparams.add("priceFunction", this.priceFunction);
		return kparams;
	}

}

