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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.enums.CuePointStatus;
import com.kaltura.client.types.CuePoint;
import com.kaltura.client.types.CuePointFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Cue Point service
 * 
 * @param cuePoint 
 * @param fileData 
 * @param id 
 * @param entryId 
 * @param filter 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param id 
 * @param cuePoint 
 * @param id 
 * @param startTime 
 * @param endTime 
 * @param id 
 * @param status 
 */
public class CuePointService {
	
	public static class AddCuePointBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, AddCuePointBuilder> {
		
		public AddCuePointBuilder(CuePoint cuePoint) {
			super(CuePoint.class, "cuepoint_cuepoint", "add");
			params.add("cuePoint", cuePoint);
		}
	}

	/**
	 * Allows you to add an cue point object associated with an entry
	 * 
	 * @param cuePoint 
	 */
    public static AddCuePointBuilder add(CuePoint cuePoint)  {
		return new AddCuePointBuilder(cuePoint);
	}
	
	public static class AddFromBulkCuePointBuilder extends ListResponseRequestBuilder<CuePoint, CuePoint.Tokenizer, AddFromBulkCuePointBuilder> {
		
		public AddFromBulkCuePointBuilder(FileHolder fileData) {
			super(CuePoint.class, "cuepoint_cuepoint", "addFromBulk");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static AddFromBulkCuePointBuilder addFromBulk(File fileData)  {
		return addFromBulk(new FileHolder(fileData));
	}

	public static AddFromBulkCuePointBuilder addFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static AddFromBulkCuePointBuilder addFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Allows you to add multiple cue points objects by uploading XML that contains
	  multiple cue point definitions
	 * 
	 * @param fileData 
	 */
    public static AddFromBulkCuePointBuilder addFromBulk(FileHolder fileData)  {
		return new AddFromBulkCuePointBuilder(fileData);
	}
	
	public static class CloneCuePointBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, CloneCuePointBuilder> {
		
		public CloneCuePointBuilder(String id, String entryId) {
			super(CuePoint.class, "cuepoint_cuepoint", "clone");
			params.add("id", id);
			params.add("entryId", entryId);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Clone cuePoint with id to given entry
	 * 
	 * @param id 
	 * @param entryId 
	 */
    public static CloneCuePointBuilder clone(String id, String entryId)  {
		return new CloneCuePointBuilder(id, entryId);
	}
	
	public static class CountCuePointBuilder extends RequestBuilder<Integer, String, CountCuePointBuilder> {
		
		public CountCuePointBuilder(CuePointFilter filter) {
			super(Integer.class, "cuepoint_cuepoint", "count");
			params.add("filter", filter);
		}
	}

	public static CountCuePointBuilder count()  {
		return count(null);
	}

	/**
	 * count cue point objects by filter
	 * 
	 * @param filter 
	 */
    public static CountCuePointBuilder count(CuePointFilter filter)  {
		return new CountCuePointBuilder(filter);
	}
	
	public static class DeleteCuePointBuilder extends NullRequestBuilder {
		
		public DeleteCuePointBuilder(String id) {
			super("cuepoint_cuepoint", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * delete cue point by id, and delete all children cue points
	 * 
	 * @param id 
	 */
    public static DeleteCuePointBuilder delete(String id)  {
		return new DeleteCuePointBuilder(id);
	}
	
	public static class GetCuePointBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, GetCuePointBuilder> {
		
		public GetCuePointBuilder(String id) {
			super(CuePoint.class, "cuepoint_cuepoint", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve an CuePoint object by id
	 * 
	 * @param id 
	 */
    public static GetCuePointBuilder get(String id)  {
		return new GetCuePointBuilder(id);
	}
	
	public static class ListCuePointBuilder extends ListResponseRequestBuilder<CuePoint, CuePoint.Tokenizer, ListCuePointBuilder> {
		
		public ListCuePointBuilder(CuePointFilter filter, FilterPager pager) {
			super(CuePoint.class, "cuepoint_cuepoint", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListCuePointBuilder list()  {
		return list(null);
	}

	public static ListCuePointBuilder list(CuePointFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List cue point objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListCuePointBuilder list(CuePointFilter filter, FilterPager pager)  {
		return new ListCuePointBuilder(filter, pager);
	}
	
	public static class ServeBulkCuePointBuilder extends ServeRequestBuilder {
		
		public ServeBulkCuePointBuilder(CuePointFilter filter, FilterPager pager) {
			super("cuepoint_cuepoint", "serveBulk");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ServeBulkCuePointBuilder serveBulk()  {
		return serveBulk(null);
	}

	public static ServeBulkCuePointBuilder serveBulk(CuePointFilter filter)  {
		return serveBulk(filter, null);
	}

	/**
	 * Download multiple cue points objects as XML definitions
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ServeBulkCuePointBuilder serveBulk(CuePointFilter filter, FilterPager pager)  {
		return new ServeBulkCuePointBuilder(filter, pager);
	}
	
	public static class UpdateCuePointBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, UpdateCuePointBuilder> {
		
		public UpdateCuePointBuilder(String id, CuePoint cuePoint) {
			super(CuePoint.class, "cuepoint_cuepoint", "update");
			params.add("id", id);
			params.add("cuePoint", cuePoint);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update cue point by id
	 * 
	 * @param id 
	 * @param cuePoint 
	 */
    public static UpdateCuePointBuilder update(String id, CuePoint cuePoint)  {
		return new UpdateCuePointBuilder(id, cuePoint);
	}
	
	public static class UpdateCuePointsTimesCuePointBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, UpdateCuePointsTimesCuePointBuilder> {
		
		public UpdateCuePointsTimesCuePointBuilder(String id, int startTime, int endTime) {
			super(CuePoint.class, "cuepoint_cuepoint", "updateCuePointsTimes");
			params.add("id", id);
			params.add("startTime", startTime);
			params.add("endTime", endTime);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void startTime(String multirequestToken) {
			params.add("startTime", multirequestToken);
		}
		
		public void endTime(String multirequestToken) {
			params.add("endTime", multirequestToken);
		}
	}

	public static UpdateCuePointsTimesCuePointBuilder updateCuePointsTimes(String id, int startTime)  {
		return updateCuePointsTimes(id, startTime, Integer.MIN_VALUE);
	}

    public static UpdateCuePointsTimesCuePointBuilder updateCuePointsTimes(String id, int startTime, int endTime)  {
		return new UpdateCuePointsTimesCuePointBuilder(id, startTime, endTime);
	}
	
	public static class UpdateStatusCuePointBuilder extends NullRequestBuilder {
		
		public UpdateStatusCuePointBuilder(String id, CuePointStatus status) {
			super("cuepoint_cuepoint", "updateStatus");
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
	 * Update cuePoint status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusCuePointBuilder updateStatus(String id, CuePointStatus status)  {
		return new UpdateStatusCuePointBuilder(id, status);
	}
}
