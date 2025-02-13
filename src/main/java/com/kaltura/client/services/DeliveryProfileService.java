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

import com.kaltura.client.types.DeliveryProfile;
import com.kaltura.client.types.DeliveryProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * delivery service is used to control delivery objects
 * 
 * @param delivery 
 * @param deliveryId 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param delivery 
 */
public class DeliveryProfileService {
	
	public static class AddDeliveryProfileBuilder extends RequestBuilder<DeliveryProfile, DeliveryProfile.Tokenizer, AddDeliveryProfileBuilder> {
		
		public AddDeliveryProfileBuilder(DeliveryProfile delivery) {
			super(DeliveryProfile.class, "deliveryprofile", "add");
			params.add("delivery", delivery);
		}
	}

	/**
	 * Add new delivery.
	 * 
	 * @param delivery 
	 */
    public static AddDeliveryProfileBuilder add(DeliveryProfile delivery)  {
		return new AddDeliveryProfileBuilder(delivery);
	}
	
	public static class CloneDeliveryProfileBuilder extends RequestBuilder<DeliveryProfile, DeliveryProfile.Tokenizer, CloneDeliveryProfileBuilder> {
		
		public CloneDeliveryProfileBuilder(int deliveryId) {
			super(DeliveryProfile.class, "deliveryprofile", "clone");
			params.add("deliveryId", deliveryId);
		}
		
		public void deliveryId(String multirequestToken) {
			params.add("deliveryId", multirequestToken);
		}
	}

	/**
	 * Add delivery based on existing delivery.  Must provide valid sourceDeliveryId
	 * 
	 * @param deliveryId 
	 */
    public static CloneDeliveryProfileBuilder clone(int deliveryId)  {
		return new CloneDeliveryProfileBuilder(deliveryId);
	}
	
	public static class GetDeliveryProfileBuilder extends RequestBuilder<DeliveryProfile, DeliveryProfile.Tokenizer, GetDeliveryProfileBuilder> {
		
		public GetDeliveryProfileBuilder(String id) {
			super(DeliveryProfile.class, "deliveryprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get delivery by id
	 * 
	 * @param id 
	 */
    public static GetDeliveryProfileBuilder get(String id)  {
		return new GetDeliveryProfileBuilder(id);
	}
	
	public static class ListDeliveryProfileBuilder extends ListResponseRequestBuilder<DeliveryProfile, DeliveryProfile.Tokenizer, ListDeliveryProfileBuilder> {
		
		public ListDeliveryProfileBuilder(DeliveryProfileFilter filter, FilterPager pager) {
			super(DeliveryProfile.class, "deliveryprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDeliveryProfileBuilder list()  {
		return list(null);
	}

	public static ListDeliveryProfileBuilder list(DeliveryProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * Retrieve a list of available delivery depends on the filter given
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDeliveryProfileBuilder list(DeliveryProfileFilter filter, FilterPager pager)  {
		return new ListDeliveryProfileBuilder(filter, pager);
	}
	
	public static class UpdateDeliveryProfileBuilder extends RequestBuilder<DeliveryProfile, DeliveryProfile.Tokenizer, UpdateDeliveryProfileBuilder> {
		
		public UpdateDeliveryProfileBuilder(String id, DeliveryProfile delivery) {
			super(DeliveryProfile.class, "deliveryprofile", "update");
			params.add("id", id);
			params.add("delivery", delivery);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update existing delivery profile
	 * 
	 * @param id 
	 * @param delivery 
	 */
    public static UpdateDeliveryProfileBuilder update(String id, DeliveryProfile delivery)  {
		return new UpdateDeliveryProfileBuilder(id, delivery);
	}
}
