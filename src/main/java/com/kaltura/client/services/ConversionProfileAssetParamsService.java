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
// Copyright (C) 2006-2017  Kaltura Inc.
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

import com.kaltura.client.Params;
import com.kaltura.client.types.ConversionProfileAssetParams;
import com.kaltura.client.types.ConversionProfileAssetParamsFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage the connection between Conversion Profiles and Asset Params  */
public class ConversionProfileAssetParamsService {

    public static RequestBuilder<ListResponse<ConversionProfileAssetParams>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ConversionProfileAssetParams>> list(ConversionProfileAssetParamsFilter filter)  {
        return list(filter, null);
    }

	/**  Lists asset parmas of conversion profile by ID  */
    public static RequestBuilder<ListResponse<ConversionProfileAssetParams>> list(ConversionProfileAssetParamsFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ConversionProfileAssetParams>(ConversionProfileAssetParams.class, "conversionprofileassetparams", "list", kparams);
    }

	/**  Update asset parmas of conversion profile by ID  */
    public static RequestBuilder<ConversionProfileAssetParams> update(int conversionProfileId, int assetParamsId, ConversionProfileAssetParams conversionProfileAssetParams)  {
        Params kparams = new Params();
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("assetParamsId", assetParamsId);
        kparams.add("conversionProfileAssetParams", conversionProfileAssetParams);

        return new RequestBuilder<ConversionProfileAssetParams>(ConversionProfileAssetParams.class, "conversionprofileassetparams", "update", kparams);
    }
}
