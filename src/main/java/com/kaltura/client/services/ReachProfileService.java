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

import com.kaltura.client.enums.ReachProfileStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ReachProfile;
import com.kaltura.client.types.ReachProfileFilter;
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
 * Reach Profile Service
 * 
 * @param reachProfile 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param reachProfileId 
 * @param id 
 * @param reachProfile 
 * @param id 
 * @param status 
 */
public class ReachProfileService {
	
	public static class AddReachProfileBuilder extends RequestBuilder<ReachProfile, ReachProfile.Tokenizer, AddReachProfileBuilder> {
		
		public AddReachProfileBuilder(ReachProfile reachProfile) {
			super(ReachProfile.class, "reach_reachprofile", "add");
			params.add("reachProfile", reachProfile);
		}
	}

	/**
	 * Allows you to add a partner specific reach profile
	 * 
	 * @param reachProfile 
	 */
    public static AddReachProfileBuilder add(ReachProfile reachProfile)  {
		return new AddReachProfileBuilder(reachProfile);
	}
	
	public static class DeleteReachProfileBuilder extends NullRequestBuilder {
		
		public DeleteReachProfileBuilder(int id) {
			super("reach_reachprofile", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete vednor profile by id
	 * 
	 * @param id 
	 */
    public static DeleteReachProfileBuilder delete(int id)  {
		return new DeleteReachProfileBuilder(id);
	}
	
	public static class GetReachProfileBuilder extends RequestBuilder<ReachProfile, ReachProfile.Tokenizer, GetReachProfileBuilder> {
		
		public GetReachProfileBuilder(int id) {
			super(ReachProfile.class, "reach_reachprofile", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve specific reach profile by id
	 * 
	 * @param id 
	 */
    public static GetReachProfileBuilder get(int id)  {
		return new GetReachProfileBuilder(id);
	}
	
	public static class ListReachProfileBuilder extends ListResponseRequestBuilder<ReachProfile, ReachProfile.Tokenizer, ListReachProfileBuilder> {
		
		public ListReachProfileBuilder(ReachProfileFilter filter, FilterPager pager) {
			super(ReachProfile.class, "reach_reachprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListReachProfileBuilder list()  {
		return list(null);
	}

	public static ListReachProfileBuilder list(ReachProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaReachProfile objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListReachProfileBuilder list(ReachProfileFilter filter, FilterPager pager)  {
		return new ListReachProfileBuilder(filter, pager);
	}
	
	public static class SyncCreditReachProfileBuilder extends RequestBuilder<ReachProfile, ReachProfile.Tokenizer, SyncCreditReachProfileBuilder> {
		
		public SyncCreditReachProfileBuilder(int reachProfileId) {
			super(ReachProfile.class, "reach_reachprofile", "syncCredit");
			params.add("reachProfileId", reachProfileId);
		}
		
		public void reachProfileId(String multirequestToken) {
			params.add("reachProfileId", multirequestToken);
		}
	}

	/**
	 * sync vednor profile credit
	 * 
	 * @param reachProfileId 
	 */
    public static SyncCreditReachProfileBuilder syncCredit(int reachProfileId)  {
		return new SyncCreditReachProfileBuilder(reachProfileId);
	}
	
	public static class UpdateReachProfileBuilder extends RequestBuilder<ReachProfile, ReachProfile.Tokenizer, UpdateReachProfileBuilder> {
		
		public UpdateReachProfileBuilder(int id, ReachProfile reachProfile) {
			super(ReachProfile.class, "reach_reachprofile", "update");
			params.add("id", id);
			params.add("reachProfile", reachProfile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing reach profile object
	 * 
	 * @param id 
	 * @param reachProfile 
	 */
    public static UpdateReachProfileBuilder update(int id, ReachProfile reachProfile)  {
		return new UpdateReachProfileBuilder(id, reachProfile);
	}
	
	public static class UpdateStatusReachProfileBuilder extends RequestBuilder<ReachProfile, ReachProfile.Tokenizer, UpdateStatusReachProfileBuilder> {
		
		public UpdateStatusReachProfileBuilder(int id, ReachProfileStatus status) {
			super(ReachProfile.class, "reach_reachprofile", "updateStatus");
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
	 * Update reach profile status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusReachProfileBuilder updateStatus(int id, ReachProfileStatus status)  {
		return new UpdateStatusReachProfileBuilder(id, status);
	}
}
