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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.EntryType;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BaseEntryCloneOptionItem;
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.types.EntryContextDataParams;
import com.kaltura.client.types.EntryContextDataResult;
import com.kaltura.client.types.EntryReplacementOptions;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ModerationFlag;
import com.kaltura.client.types.PlaybackContext;
import com.kaltura.client.types.PlaybackContextOptions;
import com.kaltura.client.types.RemotePath;
import com.kaltura.client.types.Resource;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Base Entry Service
 * 
 * @param entry 
 * @param type 
 * @param entryId 
 * @param resource 
 * @param entry 
 * @param uploadTokenId 
 * @param type 
 * @param entryId 
 * @param rank 
 * @param entryId 
 * @param entryId Id of entry to clone
 * @param cloneOptions 
 * @param filter Entry filter
 * @param entryId Entry id to delete
 * @param entryId 
 * @param storageProfileId 
 * @param moderationFlag 
 * @param entryId Entry id
 * @param version Desired version of the data
 * @param entryIds Comma separated string of entry ids
 * @param entryId 
 * @param contextDataParams 
 * @param entryId 
 * @param contextDataParams 
 * @param entryId 
 * @param id 
 * @param shouldUpdate 
 * @param filter Entry filter
 * @param pager Pager
 * @param refId Entry Reference ID
 * @param pager Pager
 * @param entryId 
 * @param pager 
 * @param entryId 
 * @param entryId Entry id to update
 * @param baseEntry Base entry metadata to update
 * @param entryId Entry id to update
 * @param resource Resource to be used to replace entry content
 * @param conversionProfileId The conversion profile id to be used on the entry
 * @param advancedOptions Additional update content options
 * @param entryId Media entry id
 * @param sourceEntryId Media entry id
 * @param timeOffset Time offset (in seconds)
 * @param entryId Media entry id
 * @param url file url
 * @param entryId Media entry id
 * @param fileData Jpeg file data
 * @param fileData The file data
 */
public class BaseEntryService {
	
	public static class AddBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, AddBaseEntryBuilder> {
		
		public AddBaseEntryBuilder(BaseEntry entry, EntryType type) {
			super(BaseEntry.class, "baseentry", "add");
			params.add("entry", entry);
			params.add("type", type);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
	}

	public static AddBaseEntryBuilder add(BaseEntry entry)  {
		return add(entry, null);
	}

	/**
	 * Generic add entry, should be used when the uploaded entry type is not known.
	 * 
	 * @param entry 
	 * @param type 
	 */
    public static AddBaseEntryBuilder add(BaseEntry entry, EntryType type)  {
		return new AddBaseEntryBuilder(entry, type);
	}
	
	public static class AddContentBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, AddContentBaseEntryBuilder> {
		
		public AddContentBaseEntryBuilder(String entryId, Resource resource) {
			super(BaseEntry.class, "baseentry", "addContent");
			params.add("entryId", entryId);
			params.add("resource", resource);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Attach content resource to entry in status NO_MEDIA
	 * 
	 * @param entryId 
	 * @param resource 
	 */
    public static AddContentBaseEntryBuilder addContent(String entryId, Resource resource)  {
		return new AddContentBaseEntryBuilder(entryId, resource);
	}
	
	public static class AddFromUploadedFileBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, AddFromUploadedFileBaseEntryBuilder> {
		
		public AddFromUploadedFileBaseEntryBuilder(BaseEntry entry, String uploadTokenId, EntryType type) {
			super(BaseEntry.class, "baseentry", "addFromUploadedFile");
			params.add("entry", entry);
			params.add("uploadTokenId", uploadTokenId);
			params.add("type", type);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
	}

	public static AddFromUploadedFileBaseEntryBuilder addFromUploadedFile(BaseEntry entry, String uploadTokenId)  {
		return addFromUploadedFile(entry, uploadTokenId, null);
	}

	/**
	 * Generic add entry using an uploaded file, should be used when the uploaded entry
	  type is not known.
	 * 
	 * @param entry 
	 * @param uploadTokenId 
	 * @param type 
	 */
    public static AddFromUploadedFileBaseEntryBuilder addFromUploadedFile(BaseEntry entry, String uploadTokenId, EntryType type)  {
		return new AddFromUploadedFileBaseEntryBuilder(entry, uploadTokenId, type);
	}
	
	public static class AnonymousRankBaseEntryBuilder extends NullRequestBuilder {
		
		public AnonymousRankBaseEntryBuilder(String entryId, int rank) {
			super("baseentry", "anonymousRank");
			params.add("entryId", entryId);
			params.add("rank", rank);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void rank(String multirequestToken) {
			params.add("rank", multirequestToken);
		}
	}

	/**
	 * Anonymously rank an entry, no validation is done on duplicate rankings.
	 * 
	 * @param entryId 
	 * @param rank 
	 */
    public static AnonymousRankBaseEntryBuilder anonymousRank(String entryId, int rank)  {
		return new AnonymousRankBaseEntryBuilder(entryId, rank);
	}
	
	public static class ApproveBaseEntryBuilder extends NullRequestBuilder {
		
		public ApproveBaseEntryBuilder(String entryId) {
			super("baseentry", "approve");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Approve the entry and mark the pending flags (if any) as moderated (this will
	  make the entry playable).
	 * 
	 * @param entryId 
	 */
    public static ApproveBaseEntryBuilder approve(String entryId)  {
		return new ApproveBaseEntryBuilder(entryId);
	}
	
	public static class CloneBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, CloneBaseEntryBuilder> {
		
		public CloneBaseEntryBuilder(String entryId, List<BaseEntryCloneOptionItem> cloneOptions) {
			super(BaseEntry.class, "baseentry", "clone");
			params.add("entryId", entryId);
			params.add("cloneOptions", cloneOptions);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static CloneBaseEntryBuilder clone(String entryId)  {
		return clone(entryId, null);
	}

	/**
	 * Clone an entry with optional attributes to apply to the clone
	 * 
	 * @param entryId Id of entry to clone
	 * @param cloneOptions 
	 */
    public static CloneBaseEntryBuilder clone(String entryId, List<BaseEntryCloneOptionItem> cloneOptions)  {
		return new CloneBaseEntryBuilder(entryId, cloneOptions);
	}
	
	public static class CountBaseEntryBuilder extends RequestBuilder<Integer, String, CountBaseEntryBuilder> {
		
		public CountBaseEntryBuilder(BaseEntryFilter filter) {
			super(Integer.class, "baseentry", "count");
			params.add("filter", filter);
		}
	}

	public static CountBaseEntryBuilder count()  {
		return count(null);
	}

	/**
	 * Count base entries by filter.
	 * 
	 * @param filter Entry filter
	 */
    public static CountBaseEntryBuilder count(BaseEntryFilter filter)  {
		return new CountBaseEntryBuilder(filter);
	}
	
	public static class DeleteBaseEntryBuilder extends NullRequestBuilder {
		
		public DeleteBaseEntryBuilder(String entryId) {
			super("baseentry", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete an entry.
	 * 
	 * @param entryId Entry id to delete
	 */
    public static DeleteBaseEntryBuilder delete(String entryId)  {
		return new DeleteBaseEntryBuilder(entryId);
	}
	
	public static class ExportBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, ExportBaseEntryBuilder> {
		
		public ExportBaseEntryBuilder(String entryId, int storageProfileId) {
			super(BaseEntry.class, "baseentry", "export");
			params.add("entryId", entryId);
			params.add("storageProfileId", storageProfileId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void storageProfileId(String multirequestToken) {
			params.add("storageProfileId", multirequestToken);
		}
	}

    public static ExportBaseEntryBuilder export(String entryId, int storageProfileId)  {
		return new ExportBaseEntryBuilder(entryId, storageProfileId);
	}
	
	public static class FlagBaseEntryBuilder extends NullRequestBuilder {
		
		public FlagBaseEntryBuilder(ModerationFlag moderationFlag) {
			super("baseentry", "flag");
			params.add("moderationFlag", moderationFlag);
		}
	}

	/**
	 * Flag inappropriate entry for moderation.
	 * 
	 * @param moderationFlag 
	 */
    public static FlagBaseEntryBuilder flag(ModerationFlag moderationFlag)  {
		return new FlagBaseEntryBuilder(moderationFlag);
	}
	
	public static class GetBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, GetBaseEntryBuilder> {
		
		public GetBaseEntryBuilder(String entryId, int version) {
			super(BaseEntry.class, "baseentry", "get");
			params.add("entryId", entryId);
			params.add("version", version);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	public static GetBaseEntryBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**
	 * Get base entry by ID.
	 * 
	 * @param entryId Entry id
	 * @param version Desired version of the data
	 */
    public static GetBaseEntryBuilder get(String entryId, int version)  {
		return new GetBaseEntryBuilder(entryId, version);
	}
	
	public static class GetByIdsBaseEntryBuilder extends ArrayRequestBuilder<BaseEntry, BaseEntry.Tokenizer, GetByIdsBaseEntryBuilder> {
		
		public GetByIdsBaseEntryBuilder(String entryIds) {
			super(BaseEntry.class, "baseentry", "getByIds");
			params.add("entryIds", entryIds);
		}
		
		public void entryIds(String multirequestToken) {
			params.add("entryIds", multirequestToken);
		}
	}

	/**
	 * Get an array of KalturaBaseEntry objects by a comma-separated list of ids.
	 * 
	 * @param entryIds Comma separated string of entry ids
	 */
    public static GetByIdsBaseEntryBuilder getByIds(String entryIds)  {
		return new GetByIdsBaseEntryBuilder(entryIds);
	}
	
	public static class GetContextDataBaseEntryBuilder extends RequestBuilder<EntryContextDataResult, EntryContextDataResult.Tokenizer, GetContextDataBaseEntryBuilder> {
		
		public GetContextDataBaseEntryBuilder(String entryId, EntryContextDataParams contextDataParams) {
			super(EntryContextDataResult.class, "baseentry", "getContextData");
			params.add("entryId", entryId);
			params.add("contextDataParams", contextDataParams);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * This action delivers entry-related data, based on the user's context: access
	  control, restriction, playback format and storage information.
	 * 
	 * @param entryId 
	 * @param contextDataParams 
	 */
    public static GetContextDataBaseEntryBuilder getContextData(String entryId, EntryContextDataParams contextDataParams)  {
		return new GetContextDataBaseEntryBuilder(entryId, contextDataParams);
	}
	
	public static class GetPlaybackContextBaseEntryBuilder extends RequestBuilder<PlaybackContext, PlaybackContext.Tokenizer, GetPlaybackContextBaseEntryBuilder> {
		
		public GetPlaybackContextBaseEntryBuilder(String entryId, PlaybackContextOptions contextDataParams) {
			super(PlaybackContext.class, "baseentry", "getPlaybackContext");
			params.add("entryId", entryId);
			params.add("contextDataParams", contextDataParams);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * This action delivers all data relevant for player
	 * 
	 * @param entryId 
	 * @param contextDataParams 
	 */
    public static GetPlaybackContextBaseEntryBuilder getPlaybackContext(String entryId, PlaybackContextOptions contextDataParams)  {
		return new GetPlaybackContextBaseEntryBuilder(entryId, contextDataParams);
	}
	
	public static class GetRemotePathsBaseEntryBuilder extends ListResponseRequestBuilder<RemotePath, RemotePath.Tokenizer, GetRemotePathsBaseEntryBuilder> {
		
		public GetRemotePathsBaseEntryBuilder(String entryId) {
			super(RemotePath.class, "baseentry", "getRemotePaths");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Get remote storage existing paths for the asset.
	 * 
	 * @param entryId 
	 */
    public static GetRemotePathsBaseEntryBuilder getRemotePaths(String entryId)  {
		return new GetRemotePathsBaseEntryBuilder(entryId);
	}
	
	public static class IndexBaseEntryBuilder extends RequestBuilder<Integer, String, IndexBaseEntryBuilder> {
		
		public IndexBaseEntryBuilder(String id, boolean shouldUpdate) {
			super(Integer.class, "baseentry", "index");
			params.add("id", id);
			params.add("shouldUpdate", shouldUpdate);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void shouldUpdate(String multirequestToken) {
			params.add("shouldUpdate", multirequestToken);
		}
	}

	public static IndexBaseEntryBuilder index(String id)  {
		return index(id, true);
	}

	/**
	 * Index an entry by id.
	 * 
	 * @param id 
	 * @param shouldUpdate 
	 */
    public static IndexBaseEntryBuilder index(String id, boolean shouldUpdate)  {
		return new IndexBaseEntryBuilder(id, shouldUpdate);
	}
	
	public static class ListBaseEntryBuilder extends ListResponseRequestBuilder<BaseEntry, BaseEntry.Tokenizer, ListBaseEntryBuilder> {
		
		public ListBaseEntryBuilder(BaseEntryFilter filter, FilterPager pager) {
			super(BaseEntry.class, "baseentry", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListBaseEntryBuilder list()  {
		return list(null);
	}

	public static ListBaseEntryBuilder list(BaseEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List base entries by filter with paging support.
	 * 
	 * @param filter Entry filter
	 * @param pager Pager
	 */
    public static ListBaseEntryBuilder list(BaseEntryFilter filter, FilterPager pager)  {
		return new ListBaseEntryBuilder(filter, pager);
	}
	
	public static class ListByReferenceIdBaseEntryBuilder extends ListResponseRequestBuilder<BaseEntry, BaseEntry.Tokenizer, ListByReferenceIdBaseEntryBuilder> {
		
		public ListByReferenceIdBaseEntryBuilder(String refId, FilterPager pager) {
			super(BaseEntry.class, "baseentry", "listByReferenceId");
			params.add("refId", refId);
			params.add("pager", pager);
		}
		
		public void refId(String multirequestToken) {
			params.add("refId", multirequestToken);
		}
	}

	public static ListByReferenceIdBaseEntryBuilder listByReferenceId(String refId)  {
		return listByReferenceId(refId, null);
	}

	/**
	 * List base entries by filter according to reference id
	 * 
	 * @param refId Entry Reference ID
	 * @param pager Pager
	 */
    public static ListByReferenceIdBaseEntryBuilder listByReferenceId(String refId, FilterPager pager)  {
		return new ListByReferenceIdBaseEntryBuilder(refId, pager);
	}
	
	public static class ListFlagsBaseEntryBuilder extends ListResponseRequestBuilder<ModerationFlag, ModerationFlag.Tokenizer, ListFlagsBaseEntryBuilder> {
		
		public ListFlagsBaseEntryBuilder(String entryId, FilterPager pager) {
			super(ModerationFlag.class, "baseentry", "listFlags");
			params.add("entryId", entryId);
			params.add("pager", pager);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static ListFlagsBaseEntryBuilder listFlags(String entryId)  {
		return listFlags(entryId, null);
	}

	/**
	 * List all pending flags for the entry.
	 * 
	 * @param entryId 
	 * @param pager 
	 */
    public static ListFlagsBaseEntryBuilder listFlags(String entryId, FilterPager pager)  {
		return new ListFlagsBaseEntryBuilder(entryId, pager);
	}
	
	public static class RejectBaseEntryBuilder extends NullRequestBuilder {
		
		public RejectBaseEntryBuilder(String entryId) {
			super("baseentry", "reject");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Reject the entry and mark the pending flags (if any) as moderated (this will
	  make the entry non-playable).
	 * 
	 * @param entryId 
	 */
    public static RejectBaseEntryBuilder reject(String entryId)  {
		return new RejectBaseEntryBuilder(entryId);
	}
	
	public static class UpdateBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateBaseEntryBuilder> {
		
		public UpdateBaseEntryBuilder(String entryId, BaseEntry baseEntry) {
			super(BaseEntry.class, "baseentry", "update");
			params.add("entryId", entryId);
			params.add("baseEntry", baseEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update base entry. Only the properties that were set will be updated.
	 * 
	 * @param entryId Entry id to update
	 * @param baseEntry Base entry metadata to update
	 */
    public static UpdateBaseEntryBuilder update(String entryId, BaseEntry baseEntry)  {
		return new UpdateBaseEntryBuilder(entryId, baseEntry);
	}
	
	public static class UpdateContentBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateContentBaseEntryBuilder> {
		
		public UpdateContentBaseEntryBuilder(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions) {
			super(BaseEntry.class, "baseentry", "updateContent");
			params.add("entryId", entryId);
			params.add("resource", resource);
			params.add("conversionProfileId", conversionProfileId);
			params.add("advancedOptions", advancedOptions);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	public static UpdateContentBaseEntryBuilder updateContent(String entryId, Resource resource)  {
		return updateContent(entryId, resource, Integer.MIN_VALUE);
	}

	public static UpdateContentBaseEntryBuilder updateContent(String entryId, Resource resource, int conversionProfileId)  {
		return updateContent(entryId, resource, conversionProfileId, null);
	}

	/**
	 * Update the content resource associated with the entry.
	 * 
	 * @param entryId Entry id to update
	 * @param resource Resource to be used to replace entry content
	 * @param conversionProfileId The conversion profile id to be used on the entry
	 * @param advancedOptions Additional update content options
	 */
    public static UpdateContentBaseEntryBuilder updateContent(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions)  {
		return new UpdateContentBaseEntryBuilder(entryId, resource, conversionProfileId, advancedOptions);
	}
	
	public static class UpdateThumbnailFromSourceEntryBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateThumbnailFromSourceEntryBaseEntryBuilder> {
		
		public UpdateThumbnailFromSourceEntryBaseEntryBuilder(String entryId, String sourceEntryId, int timeOffset) {
			super(BaseEntry.class, "baseentry", "updateThumbnailFromSourceEntry");
			params.add("entryId", entryId);
			params.add("sourceEntryId", sourceEntryId);
			params.add("timeOffset", timeOffset);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void sourceEntryId(String multirequestToken) {
			params.add("sourceEntryId", multirequestToken);
		}
		
		public void timeOffset(String multirequestToken) {
			params.add("timeOffset", multirequestToken);
		}
	}

	/**
	 * Update entry thumbnail from a different entry by a specified time offset (in
	  seconds).
	 * 
	 * @param entryId Media entry id
	 * @param sourceEntryId Media entry id
	 * @param timeOffset Time offset (in seconds)
	 */
    public static UpdateThumbnailFromSourceEntryBaseEntryBuilder updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset)  {
		return new UpdateThumbnailFromSourceEntryBaseEntryBuilder(entryId, sourceEntryId, timeOffset);
	}
	
	public static class UpdateThumbnailFromUrlBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateThumbnailFromUrlBaseEntryBuilder> {
		
		public UpdateThumbnailFromUrlBaseEntryBuilder(String entryId, String url) {
			super(BaseEntry.class, "baseentry", "updateThumbnailFromUrl");
			params.add("entryId", entryId);
			params.add("url", url);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Update entry thumbnail using url.
	 * 
	 * @param entryId Media entry id
	 * @param url file url
	 */
    public static UpdateThumbnailFromUrlBaseEntryBuilder updateThumbnailFromUrl(String entryId, String url)  {
		return new UpdateThumbnailFromUrlBaseEntryBuilder(entryId, url);
	}
	
	public static class UpdateThumbnailJpegBaseEntryBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateThumbnailJpegBaseEntryBuilder> {
		
		public UpdateThumbnailJpegBaseEntryBuilder(String entryId, FileHolder fileData) {
			super(BaseEntry.class, "baseentry", "updateThumbnailJpeg");
			params.add("entryId", entryId);
			files = new Files();
			files.add("fileData", fileData);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static UpdateThumbnailJpegBaseEntryBuilder updateThumbnailJpeg(String entryId, File fileData)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData));
	}

	public static UpdateThumbnailJpegBaseEntryBuilder updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UpdateThumbnailJpegBaseEntryBuilder updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Update entry thumbnail using a raw jpeg file.
	 * 
	 * @param entryId Media entry id
	 * @param fileData Jpeg file data
	 */
    public static UpdateThumbnailJpegBaseEntryBuilder updateThumbnailJpeg(String entryId, FileHolder fileData)  {
		return new UpdateThumbnailJpegBaseEntryBuilder(entryId, fileData);
	}
	
	public static class UploadBaseEntryBuilder extends RequestBuilder<String, String, UploadBaseEntryBuilder> {
		
		public UploadBaseEntryBuilder(FileHolder fileData) {
			super(String.class, "baseentry", "upload");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static UploadBaseEntryBuilder upload(File fileData)  {
		return upload(new FileHolder(fileData));
	}

	public static UploadBaseEntryBuilder upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UploadBaseEntryBuilder upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Upload a file to Kaltura, that can be used to create an entry.
	 * 
	 * @param fileData The file data
	 */
    public static UploadBaseEntryBuilder upload(FileHolder fileData)  {
		return new UploadBaseEntryBuilder(fileData);
	}
}
