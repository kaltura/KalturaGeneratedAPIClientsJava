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
import com.kaltura.client.types.Annotation;
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
 * Annotation service - Video Annotation
 * 
 * @param annotation 
 * @param fileData 
 * @param id 
 * @param entryId 
 * @param parentId 
 * @param filter 
 * @param id 
 * @param id 
 * @param filter 
 * @param pager 
 * @param filter 
 * @param pager 
 * @param id 
 * @param annotation 
 * @param id 
 * @param startTime 
 * @param endTime 
 * @param id 
 * @param status 
 */
public class AnnotationService {
	
	public static class AddAnnotationBuilder extends RequestBuilder<Annotation, Annotation.Tokenizer, AddAnnotationBuilder> {
		
		public AddAnnotationBuilder(CuePoint annotation) {
			super(Annotation.class, "annotation_annotation", "add");
			params.add("annotation", annotation);
		}
	}

	/**
	 * Allows you to add an annotation object associated with an entry
	 * 
	 * @param annotation 
	 */
    public static AddAnnotationBuilder add(CuePoint annotation)  {
		return new AddAnnotationBuilder(annotation);
	}
	
	public static class AddFromBulkAnnotationBuilder extends ListResponseRequestBuilder<CuePoint, CuePoint.Tokenizer, AddFromBulkAnnotationBuilder> {
		
		public AddFromBulkAnnotationBuilder(FileHolder fileData) {
			super(CuePoint.class, "annotation_annotation", "addFromBulk");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static AddFromBulkAnnotationBuilder addFromBulk(File fileData)  {
		return addFromBulk(new FileHolder(fileData));
	}

	public static AddFromBulkAnnotationBuilder addFromBulk(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static AddFromBulkAnnotationBuilder addFromBulk(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return addFromBulk(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Allows you to add multiple cue points objects by uploading XML that contains
	  multiple cue point definitions
	 * 
	 * @param fileData 
	 */
    public static AddFromBulkAnnotationBuilder addFromBulk(FileHolder fileData)  {
		return new AddFromBulkAnnotationBuilder(fileData);
	}
	
	public static class CloneAnnotationBuilder extends RequestBuilder<Annotation, Annotation.Tokenizer, CloneAnnotationBuilder> {
		
		public CloneAnnotationBuilder(String id, String entryId, String parentId) {
			super(Annotation.class, "annotation_annotation", "clone");
			params.add("id", id);
			params.add("entryId", entryId);
			params.add("parentId", parentId);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void parentId(String multirequestToken) {
			params.add("parentId", multirequestToken);
		}
	}

	public static CloneAnnotationBuilder clone(String id, String entryId)  {
		return clone(id, entryId, null);
	}

	/**
	 * Clone cuePoint with id to given entry
	 * 
	 * @param id 
	 * @param entryId 
	 * @param parentId 
	 */
    public static CloneAnnotationBuilder clone(String id, String entryId, String parentId)  {
		return new CloneAnnotationBuilder(id, entryId, parentId);
	}
	
	public static class CountAnnotationBuilder extends RequestBuilder<Integer, String, CountAnnotationBuilder> {
		
		public CountAnnotationBuilder(CuePointFilter filter) {
			super(Integer.class, "annotation_annotation", "count");
			params.add("filter", filter);
		}
	}

	public static CountAnnotationBuilder count()  {
		return count(null);
	}

	/**
	 * count cue point objects by filter
	 * 
	 * @param filter 
	 */
    public static CountAnnotationBuilder count(CuePointFilter filter)  {
		return new CountAnnotationBuilder(filter);
	}
	
	public static class DeleteAnnotationBuilder extends NullRequestBuilder {
		
		public DeleteAnnotationBuilder(String id) {
			super("annotation_annotation", "delete");
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
    public static DeleteAnnotationBuilder delete(String id)  {
		return new DeleteAnnotationBuilder(id);
	}
	
	public static class GetAnnotationBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, GetAnnotationBuilder> {
		
		public GetAnnotationBuilder(String id) {
			super(CuePoint.class, "annotation_annotation", "get");
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
    public static GetAnnotationBuilder get(String id)  {
		return new GetAnnotationBuilder(id);
	}
	
	public static class ListAnnotationBuilder extends ListResponseRequestBuilder<Annotation, Annotation.Tokenizer, ListAnnotationBuilder> {
		
		public ListAnnotationBuilder(CuePointFilter filter, FilterPager pager) {
			super(Annotation.class, "annotation_annotation", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListAnnotationBuilder list()  {
		return list(null);
	}

	public static ListAnnotationBuilder list(CuePointFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List annotation objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListAnnotationBuilder list(CuePointFilter filter, FilterPager pager)  {
		return new ListAnnotationBuilder(filter, pager);
	}
	
	public static class ServeBulkAnnotationBuilder extends ServeRequestBuilder {
		
		public ServeBulkAnnotationBuilder(CuePointFilter filter, FilterPager pager) {
			super("annotation_annotation", "serveBulk");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ServeBulkAnnotationBuilder serveBulk()  {
		return serveBulk(null);
	}

	public static ServeBulkAnnotationBuilder serveBulk(CuePointFilter filter)  {
		return serveBulk(filter, null);
	}

	/**
	 * Download multiple cue points objects as XML definitions
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ServeBulkAnnotationBuilder serveBulk(CuePointFilter filter, FilterPager pager)  {
		return new ServeBulkAnnotationBuilder(filter, pager);
	}
	
	public static class UpdateAnnotationBuilder extends RequestBuilder<Annotation, Annotation.Tokenizer, UpdateAnnotationBuilder> {
		
		public UpdateAnnotationBuilder(String id, CuePoint annotation) {
			super(Annotation.class, "annotation_annotation", "update");
			params.add("id", id);
			params.add("annotation", annotation);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update annotation by id
	 * 
	 * @param id 
	 * @param annotation 
	 */
    public static UpdateAnnotationBuilder update(String id, CuePoint annotation)  {
		return new UpdateAnnotationBuilder(id, annotation);
	}
	
	public static class UpdateCuePointsTimesAnnotationBuilder extends RequestBuilder<CuePoint, CuePoint.Tokenizer, UpdateCuePointsTimesAnnotationBuilder> {
		
		public UpdateCuePointsTimesAnnotationBuilder(String id, int startTime, int endTime) {
			super(CuePoint.class, "annotation_annotation", "updateCuePointsTimes");
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

	public static UpdateCuePointsTimesAnnotationBuilder updateCuePointsTimes(String id, int startTime)  {
		return updateCuePointsTimes(id, startTime, Integer.MIN_VALUE);
	}

    public static UpdateCuePointsTimesAnnotationBuilder updateCuePointsTimes(String id, int startTime, int endTime)  {
		return new UpdateCuePointsTimesAnnotationBuilder(id, startTime, endTime);
	}
	
	public static class UpdateStatusAnnotationBuilder extends NullRequestBuilder {
		
		public UpdateStatusAnnotationBuilder(String id, CuePointStatus status) {
			super("annotation_annotation", "updateStatus");
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
    public static UpdateStatusAnnotationBuilder updateStatus(String id, CuePointStatus status)  {
		return new UpdateStatusAnnotationBuilder(id, status);
	}
}
