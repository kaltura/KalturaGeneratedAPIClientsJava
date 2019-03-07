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

import com.kaltura.client.types.EntryVendorTask;
import com.kaltura.client.types.EntryVendorTaskFilter;
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
 * Entry Vendor Task Service
 * 
 * @param id vendor task id
 * @param abortReason 
 * @param entryVendorTask 
 * @param id vendor task id to approve
 * @param filter A filter used to exclude specific tasks
 * @param id vendor task id
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param id vendor task id to reject
 * @param rejectReason 
 * @param id - the requested file id
 * @param id vendor task id to update
 * @param entryVendorTask evntry vendor task to update
 * @param id vendor task id to update
 * @param entryVendorTask evntry vendor task to update
 */
public class EntryVendorTaskService {
	
	public static class AbortEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, AbortEntryVendorTaskBuilder> {
		
		public AbortEntryVendorTaskBuilder(int id, String abortReason) {
			super(EntryVendorTask.class, "reach_entryvendortask", "abort");
			params.add("id", id);
			params.add("abortReason", abortReason);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void abortReason(String multirequestToken) {
			params.add("abortReason", multirequestToken);
		}
	}

	public static AbortEntryVendorTaskBuilder abort(int id)  {
		return abort(id, null);
	}

	/**
	 * Cancel entry task. will only occur for task in PENDING or PENDING_MODERATION
	  status
	 * 
	 * @param id vendor task id
	 * @param abortReason 
	 */
    public static AbortEntryVendorTaskBuilder abort(int id, String abortReason)  {
		return new AbortEntryVendorTaskBuilder(id, abortReason);
	}
	
	public static class AddEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, AddEntryVendorTaskBuilder> {
		
		public AddEntryVendorTaskBuilder(EntryVendorTask entryVendorTask) {
			super(EntryVendorTask.class, "reach_entryvendortask", "add");
			params.add("entryVendorTask", entryVendorTask);
		}
	}

	/**
	 * Allows you to add a entry vendor task
	 * 
	 * @param entryVendorTask 
	 */
    public static AddEntryVendorTaskBuilder add(EntryVendorTask entryVendorTask)  {
		return new AddEntryVendorTaskBuilder(entryVendorTask);
	}
	
	public static class ApproveEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, ApproveEntryVendorTaskBuilder> {
		
		public ApproveEntryVendorTaskBuilder(int id) {
			super(EntryVendorTask.class, "reach_entryvendortask", "approve");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Approve entry vendor task for execution.
	 * 
	 * @param id vendor task id to approve
	 */
    public static ApproveEntryVendorTaskBuilder approve(int id)  {
		return new ApproveEntryVendorTaskBuilder(id);
	}
	
	public static class ExportToCsvEntryVendorTaskBuilder extends RequestBuilder<String, String, ExportToCsvEntryVendorTaskBuilder> {
		
		public ExportToCsvEntryVendorTaskBuilder(EntryVendorTaskFilter filter) {
			super(String.class, "reach_entryvendortask", "exportToCsv");
			params.add("filter", filter);
		}
	}

	/**
	 * add batch job that sends an email with a link to download an updated CSV that
	  contains list of users
	 * 
	 * @param filter A filter used to exclude specific tasks
	 */
    public static ExportToCsvEntryVendorTaskBuilder exportToCsv(EntryVendorTaskFilter filter)  {
		return new ExportToCsvEntryVendorTaskBuilder(filter);
	}
	
	public static class ExtendAccessKeyEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, ExtendAccessKeyEntryVendorTaskBuilder> {
		
		public ExtendAccessKeyEntryVendorTaskBuilder(int id) {
			super(EntryVendorTask.class, "reach_entryvendortask", "extendAccessKey");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Extend access key in case the existing one has expired.
	 * 
	 * @param id vendor task id
	 */
    public static ExtendAccessKeyEntryVendorTaskBuilder extendAccessKey(int id)  {
		return new ExtendAccessKeyEntryVendorTaskBuilder(id);
	}
	
	public static class GetEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, GetEntryVendorTaskBuilder> {
		
		public GetEntryVendorTaskBuilder(int id) {
			super(EntryVendorTask.class, "reach_entryvendortask", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve specific entry vendor task by id
	 * 
	 * @param id 
	 */
    public static GetEntryVendorTaskBuilder get(int id)  {
		return new GetEntryVendorTaskBuilder(id);
	}
	
	public static class GetJobsEntryVendorTaskBuilder extends ListResponseRequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, GetJobsEntryVendorTaskBuilder> {
		
		public GetJobsEntryVendorTaskBuilder(EntryVendorTaskFilter filter, FilterPager pager) {
			super(EntryVendorTask.class, "reach_entryvendortask", "getJobs");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static GetJobsEntryVendorTaskBuilder getJobs()  {
		return getJobs(null);
	}

	public static GetJobsEntryVendorTaskBuilder getJobs(EntryVendorTaskFilter filter)  {
		return getJobs(filter, null);
	}

	/**
	 * get KalturaEntryVendorTask objects for specific vendor partner
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static GetJobsEntryVendorTaskBuilder getJobs(EntryVendorTaskFilter filter, FilterPager pager)  {
		return new GetJobsEntryVendorTaskBuilder(filter, pager);
	}
	
	public static class ListEntryVendorTaskBuilder extends ListResponseRequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, ListEntryVendorTaskBuilder> {
		
		public ListEntryVendorTaskBuilder(EntryVendorTaskFilter filter, FilterPager pager) {
			super(EntryVendorTask.class, "reach_entryvendortask", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListEntryVendorTaskBuilder list()  {
		return list(null);
	}

	public static ListEntryVendorTaskBuilder list(EntryVendorTaskFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List KalturaEntryVendorTask objects
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListEntryVendorTaskBuilder list(EntryVendorTaskFilter filter, FilterPager pager)  {
		return new ListEntryVendorTaskBuilder(filter, pager);
	}
	
	public static class RejectEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, RejectEntryVendorTaskBuilder> {
		
		public RejectEntryVendorTaskBuilder(int id, String rejectReason) {
			super(EntryVendorTask.class, "reach_entryvendortask", "reject");
			params.add("id", id);
			params.add("rejectReason", rejectReason);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void rejectReason(String multirequestToken) {
			params.add("rejectReason", multirequestToken);
		}
	}

	public static RejectEntryVendorTaskBuilder reject(int id)  {
		return reject(id, null);
	}

	/**
	 * Reject entry vendor task for execution.
	 * 
	 * @param id vendor task id to reject
	 * @param rejectReason 
	 */
    public static RejectEntryVendorTaskBuilder reject(int id, String rejectReason)  {
		return new RejectEntryVendorTaskBuilder(id, rejectReason);
	}
	
	public static class ServeCsvEntryVendorTaskBuilder extends RequestBuilder<String, String, ServeCsvEntryVendorTaskBuilder> {
		
		public ServeCsvEntryVendorTaskBuilder(String id) {
			super(String.class, "reach_entryvendortask", "serveCsv");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Will serve a requested csv
	 * 
	 * @param id - the requested file id
	 */
    public static ServeCsvEntryVendorTaskBuilder serveCsv(String id)  {
		return new ServeCsvEntryVendorTaskBuilder(id);
	}
	
	public static class UpdateEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, UpdateEntryVendorTaskBuilder> {
		
		public UpdateEntryVendorTaskBuilder(int id, EntryVendorTask entryVendorTask) {
			super(EntryVendorTask.class, "reach_entryvendortask", "update");
			params.add("id", id);
			params.add("entryVendorTask", entryVendorTask);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update entry vendor task. Only the properties that were set will be updated.
	 * 
	 * @param id vendor task id to update
	 * @param entryVendorTask evntry vendor task to update
	 */
    public static UpdateEntryVendorTaskBuilder update(int id, EntryVendorTask entryVendorTask)  {
		return new UpdateEntryVendorTaskBuilder(id, entryVendorTask);
	}
	
	public static class UpdateJobEntryVendorTaskBuilder extends RequestBuilder<EntryVendorTask, EntryVendorTask.Tokenizer, UpdateJobEntryVendorTaskBuilder> {
		
		public UpdateJobEntryVendorTaskBuilder(int id, EntryVendorTask entryVendorTask) {
			super(EntryVendorTask.class, "reach_entryvendortask", "updateJob");
			params.add("id", id);
			params.add("entryVendorTask", entryVendorTask);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update entry vendor task. Only the properties that were set will be updated.
	 * 
	 * @param id vendor task id to update
	 * @param entryVendorTask evntry vendor task to update
	 */
    public static UpdateJobEntryVendorTaskBuilder updateJob(int id, EntryVendorTask entryVendorTask)  {
		return new UpdateJobEntryVendorTaskBuilder(id, entryVendorTask);
	}
}
