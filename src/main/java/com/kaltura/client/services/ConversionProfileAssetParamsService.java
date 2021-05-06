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
package com.kaltura.client.services;

import com.kaltura.client.types.ConversionProfileAssetParams;
import com.kaltura.client.types.ConversionProfileAssetParamsFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Manage the connection between Conversion Profiles and Asset Params
 * 
 * @param filter 
 * @param pager 
 * @param conversionProfileId 
 * @param assetParamsId 
 * @param conversionProfileAssetParams 
 */
public class ConversionProfileAssetParamsService {
	
	public static class ListConversionProfileAssetParamsBuilder extends ListResponseRequestBuilder<ConversionProfileAssetParams, ConversionProfileAssetParams.Tokenizer, ListConversionProfileAssetParamsBuilder> {
		
		public ListConversionProfileAssetParamsBuilder(ConversionProfileAssetParamsFilter filter, FilterPager pager) {
			super(ConversionProfileAssetParams.class, "conversionprofileassetparams", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListConversionProfileAssetParamsBuilder list()  {
		return list(null);
	}

	public static ListConversionProfileAssetParamsBuilder list(ConversionProfileAssetParamsFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Lists asset parmas of conversion profile by ID
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListConversionProfileAssetParamsBuilder list(ConversionProfileAssetParamsFilter filter, FilterPager pager)  {
		return new ListConversionProfileAssetParamsBuilder(filter, pager);
	}
	
	public static class UpdateConversionProfileAssetParamsBuilder extends RequestBuilder<ConversionProfileAssetParams, ConversionProfileAssetParams.Tokenizer, UpdateConversionProfileAssetParamsBuilder> {
		
		public UpdateConversionProfileAssetParamsBuilder(int conversionProfileId, int assetParamsId, ConversionProfileAssetParams conversionProfileAssetParams) {
			super(ConversionProfileAssetParams.class, "conversionprofileassetparams", "update");
			params.add("conversionProfileId", conversionProfileId);
			params.add("assetParamsId", assetParamsId);
			params.add("conversionProfileAssetParams", conversionProfileAssetParams);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
		
		public void assetParamsId(String multirequestToken) {
			params.add("assetParamsId", multirequestToken);
		}
	}

	/**
	 * Update asset parmas of conversion profile by ID
	 * 
	 * @param conversionProfileId 
	 * @param assetParamsId 
	 * @param conversionProfileAssetParams 
	 */
    public static UpdateConversionProfileAssetParamsBuilder update(int conversionProfileId, int assetParamsId, ConversionProfileAssetParams conversionProfileAssetParams)  {
		return new UpdateConversionProfileAssetParamsBuilder(conversionProfileId, assetParamsId, conversionProfileAssetParams);
	}
}
