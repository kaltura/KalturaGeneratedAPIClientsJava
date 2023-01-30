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

import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.types.EntryDistribution;
import com.kaltura.client.types.EntryDistributionFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Entry Distribution service
 * 
 * @param entryDistribution 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param id 
 * @param id 
 * @param actionType 
 * @param id 
 * @param actionType 
 * @param id 
 * @param submitWhenReady 
 * @param id 
 * @param id 
 * @param id 
 * @param id 
 * @param entryDistribution 
 * @param id 
 */
public class EntryDistributionService {
	
	public static class AddEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, AddEntryDistributionBuilder> {
		
		public AddEntryDistributionBuilder(EntryDistribution entryDistribution) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "add");
			params.add("entryDistribution", entryDistribution);
		}
	}

	/**
	 * Add new Entry Distribution
	 * 
	 * @param entryDistribution 
	 */
    public static AddEntryDistributionBuilder add(EntryDistribution entryDistribution)  {
		return new AddEntryDistributionBuilder(entryDistribution);
	}
	
	public static class DeleteEntryDistributionBuilder extends NullRequestBuilder {
		
		public DeleteEntryDistributionBuilder(int id) {
			super("contentdistribution_entrydistribution", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Entry Distribution by id
	 * 
	 * @param id 
	 */
    public static DeleteEntryDistributionBuilder delete(int id)  {
		return new DeleteEntryDistributionBuilder(id);
	}
	
	public static class GetEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, GetEntryDistributionBuilder> {
		
		public GetEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Entry Distribution by id
	 * 
	 * @param id 
	 */
    public static GetEntryDistributionBuilder get(int id)  {
		return new GetEntryDistributionBuilder(id);
	}
	
	public static class ListEntryDistributionBuilder extends ListResponseRequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, ListEntryDistributionBuilder> {
		
		public ListEntryDistributionBuilder(EntryDistributionFilter filter, FilterPager pager) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListEntryDistributionBuilder list()  {
		return list(null);
	}

	public static ListEntryDistributionBuilder list(EntryDistributionFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all distribution providers
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListEntryDistributionBuilder list(EntryDistributionFilter filter, FilterPager pager)  {
		return new ListEntryDistributionBuilder(filter, pager);
	}
	
	public static class RetrySubmitEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, RetrySubmitEntryDistributionBuilder> {
		
		public RetrySubmitEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "retrySubmit");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retries last submit action
	 * 
	 * @param id 
	 */
    public static RetrySubmitEntryDistributionBuilder retrySubmit(int id)  {
		return new RetrySubmitEntryDistributionBuilder(id);
	}
	
	public static class ServeReturnedDataEntryDistributionBuilder extends ServeRequestBuilder {
		
		public ServeReturnedDataEntryDistributionBuilder(int id, DistributionAction actionType) {
			super("contentdistribution_entrydistribution", "serveReturnedData");
			params.add("id", id);
			params.add("actionType", actionType);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void actionType(String multirequestToken) {
			params.add("actionType", multirequestToken);
		}
	}

	/**
	 * Serves entry distribution returned data
	 * 
	 * @param id 
	 * @param actionType 
	 */
    public static ServeReturnedDataEntryDistributionBuilder serveReturnedData(int id, DistributionAction actionType)  {
		return new ServeReturnedDataEntryDistributionBuilder(id, actionType);
	}
	
	public static class ServeSentDataEntryDistributionBuilder extends ServeRequestBuilder {
		
		public ServeSentDataEntryDistributionBuilder(int id, DistributionAction actionType) {
			super("contentdistribution_entrydistribution", "serveSentData");
			params.add("id", id);
			params.add("actionType", actionType);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void actionType(String multirequestToken) {
			params.add("actionType", multirequestToken);
		}
	}

	/**
	 * Serves entry distribution sent data
	 * 
	 * @param id 
	 * @param actionType 
	 */
    public static ServeSentDataEntryDistributionBuilder serveSentData(int id, DistributionAction actionType)  {
		return new ServeSentDataEntryDistributionBuilder(id, actionType);
	}
	
	public static class SubmitAddEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, SubmitAddEntryDistributionBuilder> {
		
		public SubmitAddEntryDistributionBuilder(int id, boolean submitWhenReady) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "submitAdd");
			params.add("id", id);
			params.add("submitWhenReady", submitWhenReady);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void submitWhenReady(String multirequestToken) {
			params.add("submitWhenReady", multirequestToken);
		}
	}

	public static SubmitAddEntryDistributionBuilder submitAdd(int id)  {
		return submitAdd(id, false);
	}

	/**
	 * Submits Entry Distribution to the remote destination
	 * 
	 * @param id 
	 * @param submitWhenReady 
	 */
    public static SubmitAddEntryDistributionBuilder submitAdd(int id, boolean submitWhenReady)  {
		return new SubmitAddEntryDistributionBuilder(id, submitWhenReady);
	}
	
	public static class SubmitDeleteEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, SubmitDeleteEntryDistributionBuilder> {
		
		public SubmitDeleteEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "submitDelete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Deletes Entry Distribution from the remote destination
	 * 
	 * @param id 
	 */
    public static SubmitDeleteEntryDistributionBuilder submitDelete(int id)  {
		return new SubmitDeleteEntryDistributionBuilder(id);
	}
	
	public static class SubmitFetchReportEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, SubmitFetchReportEntryDistributionBuilder> {
		
		public SubmitFetchReportEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "submitFetchReport");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Submits Entry Distribution report request
	 * 
	 * @param id 
	 */
    public static SubmitFetchReportEntryDistributionBuilder submitFetchReport(int id)  {
		return new SubmitFetchReportEntryDistributionBuilder(id);
	}
	
	public static class SubmitUpdateEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, SubmitUpdateEntryDistributionBuilder> {
		
		public SubmitUpdateEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "submitUpdate");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Submits Entry Distribution changes to the remote destination
	 * 
	 * @param id 
	 */
    public static SubmitUpdateEntryDistributionBuilder submitUpdate(int id)  {
		return new SubmitUpdateEntryDistributionBuilder(id);
	}
	
	public static class UpdateEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, UpdateEntryDistributionBuilder> {
		
		public UpdateEntryDistributionBuilder(int id, EntryDistribution entryDistribution) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "update");
			params.add("id", id);
			params.add("entryDistribution", entryDistribution);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Entry Distribution by id
	 * 
	 * @param id 
	 * @param entryDistribution 
	 */
    public static UpdateEntryDistributionBuilder update(int id, EntryDistribution entryDistribution)  {
		return new UpdateEntryDistributionBuilder(id, entryDistribution);
	}
	
	public static class ValidateEntryDistributionBuilder extends RequestBuilder<EntryDistribution, EntryDistribution.Tokenizer, ValidateEntryDistributionBuilder> {
		
		public ValidateEntryDistributionBuilder(int id) {
			super(EntryDistribution.class, "contentdistribution_entrydistribution", "validate");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Validates Entry Distribution by id for submission
	 * 
	 * @param id 
	 */
    public static ValidateEntryDistributionBuilder validate(int id)  {
		return new ValidateEntryDistributionBuilder(id);
	}
}
