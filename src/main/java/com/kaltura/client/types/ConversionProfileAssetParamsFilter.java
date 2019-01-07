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
import com.kaltura.client.types.AssetParamsFilter;
import com.kaltura.client.types.ConversionProfileFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConversionProfileAssetParamsFilter.Tokenizer.class)
public class ConversionProfileAssetParamsFilter extends ConversionProfileAssetParamsBaseFilter {
	
	public interface Tokenizer extends ConversionProfileAssetParamsBaseFilter.Tokenizer {
		ConversionProfileFilter.Tokenizer conversionProfileIdFilter();
		AssetParamsFilter.Tokenizer assetParamsIdFilter();
	}

	private ConversionProfileFilter conversionProfileIdFilter;
	private AssetParamsFilter assetParamsIdFilter;

	// conversionProfileIdFilter:
	public ConversionProfileFilter getConversionProfileIdFilter(){
		return this.conversionProfileIdFilter;
	}
	public void setConversionProfileIdFilter(ConversionProfileFilter conversionProfileIdFilter){
		this.conversionProfileIdFilter = conversionProfileIdFilter;
	}

	// assetParamsIdFilter:
	public AssetParamsFilter getAssetParamsIdFilter(){
		return this.assetParamsIdFilter;
	}
	public void setAssetParamsIdFilter(AssetParamsFilter assetParamsIdFilter){
		this.assetParamsIdFilter = assetParamsIdFilter;
	}


	public ConversionProfileAssetParamsFilter() {
		super();
	}

	public ConversionProfileAssetParamsFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conversionProfileIdFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("conversionProfileIdFilter"), ConversionProfileFilter.class);
		assetParamsIdFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("assetParamsIdFilter"), AssetParamsFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConversionProfileAssetParamsFilter");
		kparams.add("conversionProfileIdFilter", this.conversionProfileIdFilter);
		kparams.add("assetParamsIdFilter", this.assetParamsIdFilter);
		return kparams;
	}

}

