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
package com.kaltura.client.services;

import com.kaltura.client.types.DistributionProvider;
import com.kaltura.client.types.DistributionProviderFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Distribution Provider service
 * 
 * @param filter 
 * @param pager 
 */
public class DistributionProviderService {
	
	public static class ListDistributionProviderBuilder extends ListResponseRequestBuilder<DistributionProvider, DistributionProvider.Tokenizer, ListDistributionProviderBuilder> {
		
		public ListDistributionProviderBuilder(DistributionProviderFilter filter, FilterPager pager) {
			super(DistributionProvider.class, "contentdistribution_distributionprovider", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDistributionProviderBuilder list()  {
		return list(null);
	}

	public static ListDistributionProviderBuilder list(DistributionProviderFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all distribution providers
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDistributionProviderBuilder list(DistributionProviderFilter filter, FilterPager pager)  {
		return new ListDistributionProviderBuilder(filter, pager);
	}
}
