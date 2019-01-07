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
package com.kaltura.client.services;

import com.kaltura.client.enums.DistributionProfileStatus;
import com.kaltura.client.types.DistributionProfile;
import com.kaltura.client.types.DistributionProfileFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.PartnerFilter;
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
 * Distribution Profile service
 * 
 * @param distributionProfile 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param id 
 * @param distributionProfile 
 * @param id 
 * @param status 
 */
public class DistributionProfileService {
	
	public static class AddDistributionProfileBuilder extends RequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, AddDistributionProfileBuilder> {
		
		public AddDistributionProfileBuilder(DistributionProfile distributionProfile) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "add");
			params.add("distributionProfile", distributionProfile);
		}
	}

	/**
	 * Add new Distribution Profile
	 * 
	 * @param distributionProfile 
	 */
    public static AddDistributionProfileBuilder add(DistributionProfile distributionProfile)  {
		return new AddDistributionProfileBuilder(distributionProfile);
	}
	
	public static class DeleteDistributionProfileBuilder extends NullRequestBuilder {
		
		public DeleteDistributionProfileBuilder(int id) {
			super("contentdistribution_distributionprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Distribution Profile by id
	 * 
	 * @param id 
	 */
    public static DeleteDistributionProfileBuilder delete(int id)  {
		return new DeleteDistributionProfileBuilder(id);
	}
	
	public static class GetDistributionProfileBuilder extends RequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, GetDistributionProfileBuilder> {
		
		public GetDistributionProfileBuilder(int id) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Distribution Profile by id
	 * 
	 * @param id 
	 */
    public static GetDistributionProfileBuilder get(int id)  {
		return new GetDistributionProfileBuilder(id);
	}
	
	public static class ListDistributionProfileBuilder extends ListResponseRequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, ListDistributionProfileBuilder> {
		
		public ListDistributionProfileBuilder(DistributionProfileFilter filter, FilterPager pager) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListDistributionProfileBuilder list()  {
		return list(null);
	}

	public static ListDistributionProfileBuilder list(DistributionProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all distribution providers
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListDistributionProfileBuilder list(DistributionProfileFilter filter, FilterPager pager)  {
		return new ListDistributionProfileBuilder(filter, pager);
	}
	
	public static class ListByPartnerDistributionProfileBuilder extends ListResponseRequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, ListByPartnerDistributionProfileBuilder> {
		
		public ListByPartnerDistributionProfileBuilder(PartnerFilter filter, FilterPager pager) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "listByPartner");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListByPartnerDistributionProfileBuilder listByPartner()  {
		return listByPartner(null);
	}

	public static ListByPartnerDistributionProfileBuilder listByPartner(PartnerFilter filter)  {
		return listByPartner(filter, null);
	}

    public static ListByPartnerDistributionProfileBuilder listByPartner(PartnerFilter filter, FilterPager pager)  {
		return new ListByPartnerDistributionProfileBuilder(filter, pager);
	}
	
	public static class UpdateDistributionProfileBuilder extends RequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, UpdateDistributionProfileBuilder> {
		
		public UpdateDistributionProfileBuilder(int id, DistributionProfile distributionProfile) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "update");
			params.add("id", id);
			params.add("distributionProfile", distributionProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Distribution Profile by id
	 * 
	 * @param id 
	 * @param distributionProfile 
	 */
    public static UpdateDistributionProfileBuilder update(int id, DistributionProfile distributionProfile)  {
		return new UpdateDistributionProfileBuilder(id, distributionProfile);
	}
	
	public static class UpdateStatusDistributionProfileBuilder extends RequestBuilder<DistributionProfile, DistributionProfile.Tokenizer, UpdateStatusDistributionProfileBuilder> {
		
		public UpdateStatusDistributionProfileBuilder(int id, DistributionProfileStatus status) {
			super(DistributionProfile.class, "contentdistribution_distributionprofile", "updateStatus");
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
	 * Update Distribution Profile status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusDistributionProfileBuilder updateStatus(int id, DistributionProfileStatus status)  {
		return new UpdateStatusDistributionProfileBuilder(id, status);
	}
}
