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
// Copyright (C) 2006-2020  Kaltura Inc.
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

import com.kaltura.client.enums.VendorCatalogItemStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.VendorCatalogItem;
import com.kaltura.client.types.VendorCatalogItemFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Vendor Catalog Item Service
 * 
 * @param vendorCatalogItem 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param vendorCatalogItem 
 * @param id 
 * @param status 
 */
public class VendorCatalogItemService {
	
	public static class AddVendorCatalogItemBuilder extends RequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, AddVendorCatalogItemBuilder> {
		
		public AddVendorCatalogItemBuilder(VendorCatalogItem vendorCatalogItem) {
			super(VendorCatalogItem.class, "reach_vendorcatalogitem", "add");
			params.add("vendorCatalogItem", vendorCatalogItem);
		}
	}

	/**
	 * Allows you to add an service catalog item
	 * 
	 * @param vendorCatalogItem 
	 */
    public static AddVendorCatalogItemBuilder add(VendorCatalogItem vendorCatalogItem)  {
		return new AddVendorCatalogItemBuilder(vendorCatalogItem);
	}
	
	public static class DeleteVendorCatalogItemBuilder extends NullRequestBuilder {
		
		public DeleteVendorCatalogItemBuilder(int id) {
			super("reach_vendorcatalogitem", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete vedor catalog item object
	 * 
	 * @param id 
	 */
    public static DeleteVendorCatalogItemBuilder delete(int id)  {
		return new DeleteVendorCatalogItemBuilder(id);
	}
	
	public static class GetVendorCatalogItemBuilder extends RequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, GetVendorCatalogItemBuilder> {
		
		public GetVendorCatalogItemBuilder(int id) {
			super(VendorCatalogItem.class, "reach_vendorcatalogitem", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve specific catalog item by id
	 * 
	 * @param id 
	 */
    public static GetVendorCatalogItemBuilder get(int id)  {
		return new GetVendorCatalogItemBuilder(id);
	}
	
	public static class ListVendorCatalogItemBuilder extends ListResponseRequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, ListVendorCatalogItemBuilder> {
		
		public ListVendorCatalogItemBuilder(VendorCatalogItemFilter filter, FilterPager pager) {
			super(VendorCatalogItem.class, "reach_vendorcatalogitem", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListVendorCatalogItemBuilder list()  {
		return list(null);
	}

	public static ListVendorCatalogItemBuilder list(VendorCatalogItemFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaVendorCatalogItem objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListVendorCatalogItemBuilder list(VendorCatalogItemFilter filter, FilterPager pager)  {
		return new ListVendorCatalogItemBuilder(filter, pager);
	}
	
	public static class UpdateVendorCatalogItemBuilder extends RequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, UpdateVendorCatalogItemBuilder> {
		
		public UpdateVendorCatalogItemBuilder(int id, VendorCatalogItem vendorCatalogItem) {
			super(VendorCatalogItem.class, "reach_vendorcatalogitem", "update");
			params.add("id", id);
			params.add("vendorCatalogItem", vendorCatalogItem);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing vedor catalog item object
	 * 
	 * @param id 
	 * @param vendorCatalogItem 
	 */
    public static UpdateVendorCatalogItemBuilder update(int id, VendorCatalogItem vendorCatalogItem)  {
		return new UpdateVendorCatalogItemBuilder(id, vendorCatalogItem);
	}
	
	public static class UpdateStatusVendorCatalogItemBuilder extends RequestBuilder<VendorCatalogItem, VendorCatalogItem.Tokenizer, UpdateStatusVendorCatalogItemBuilder> {
		
		public UpdateStatusVendorCatalogItemBuilder(int id, VendorCatalogItemStatus status) {
			super(VendorCatalogItem.class, "reach_vendorcatalogitem", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

	/**
	 * Update vendor catalog item status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusVendorCatalogItemBuilder updateStatus(int id, VendorCatalogItemStatus status)  {
		return new UpdateStatusVendorCatalogItemBuilder(id, status);
	}
}
