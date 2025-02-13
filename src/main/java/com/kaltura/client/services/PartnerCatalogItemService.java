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
package com.kaltura.client.services;

import com.kaltura.client.types.VendorCatalogItem;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Partner Catalog Item Service
 * 
 * @param id source catalog item to assign to partner
 * @param id source catalog item to remove
 */
public class PartnerCatalogItemService {
	
	public static class AddPartnerCatalogItemBuilder extends RequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, AddPartnerCatalogItemBuilder> {
		
		public AddPartnerCatalogItemBuilder(int id) {
			super(VendorCatalogItem.class, "reach_partnercatalogitem", "add");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Assign existing catalogItem to specific account
	 * 
	 * @param id source catalog item to assign to partner
	 */
    public static AddPartnerCatalogItemBuilder add(int id)  {
		return new AddPartnerCatalogItemBuilder(id);
	}
	
	public static class DeletePartnerCatalogItemBuilder extends NullRequestBuilder {
		
		public DeletePartnerCatalogItemBuilder(int id) {
			super("reach_partnercatalogitem", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Remove existing catalogItem from specific account
	 * 
	 * @param id source catalog item to remove
	 */
    public static DeletePartnerCatalogItemBuilder delete(int id)  {
		return new DeletePartnerCatalogItemBuilder(id);
	}
}
