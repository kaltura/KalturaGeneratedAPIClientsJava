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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadEntryData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.ConversionAttribute;
import com.kaltura.client.types.EntryReplacementOptions;
import com.kaltura.client.types.ExtendingItemMrssParameter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.MediaEntryFilter;
import com.kaltura.client.types.MediaEsearchExportToCsvJobData;
import com.kaltura.client.types.ModerationFlag;
import com.kaltura.client.types.Resource;
import com.kaltura.client.types.SearchResult;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;
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
 * Media service lets you upload and manage media files (images / videos &amp;
  audio)
 * 
 * @param entry 
 * @param entryId 
 * @param resource 
 * @param mediaEntry Media entry metadata
 * @param url An HTTP or FTP URL
 * @param bulkUploadId The id of the bulk upload job
 * @param sourceEntryId Media entry id to copy from
 * @param mediaEntry Media entry metadata
 * @param sourceFlavorParamsId The flavor to be used as the new entry source, source flavor will be used if not
 * specified
 * @param sourceFlavorAssetId Flavor asset id to be used as the new entry source
 * @param mediaEntry Media entry metadata
 * @param mediaEntry Media entry metadata
 * @param webcamTokenId Token id for the recorded webcam file
 * @param mediaEntry Media entry metadata
 * @param searchResult Result object from search service
 * @param mediaEntry Media entry metadata
 * @param uploadTokenId Upload token id
 * @param mediaEntry Media entry metadata
 * @param url An HTTP or FTP URL
 * @param entryId 
 * @param rank 
 * @param entryId 
 * @param entryId Media entry id to replace
 * @param fileData 
 * @param bulkUploadData 
 * @param bulkUploadEntryData 
 * @param entryId Media entry id to cancel
 * @param entryId Media entry id
 * @param conversionProfileId 
 * @param dynamicConversionAttributes 
 * @param filter Media entry filter
 * @param entryId Media entry id to delete
 * @param data job data indicating filter to pass to the job
 * @param moderationFlag 
 * @param entryId Media entry id
 * @param version Desired version of the data
 * @param entryId Entry id
 * @param extendingItemsArray 
 * @param features 
 * @param entryId Entry id
 * @param filter Media entry filter
 * @param pager Pager
 * @param entryId 
 * @param pager 
 * @param entryId 
 * @param entryId Media entry id
 * @param fileFormat Format to convert
 * @param entryId Media entry id to update
 * @param mediaEntry Media entry metadata to update
 * @param entryId Media entry id to update
 * @param resource Resource to be used to replace entry media content
 * @param conversionProfileId The conversion profile id to be used on the entry
 * @param advancedOptions Additional update content options
 * @param entryId Media entry id
 * @param timeOffset Time offset (in seconds)
 * @param flavorParamsId The flavor params id to be used
 * @param entryId Media entry id
 * @param sourceEntryId Media entry id
 * @param timeOffset Time offset (in seconds)
 * @param flavorParamsId The flavor params id to be used
 * @param entryId Media entry id
 * @param url file url
 * @param entryId Media entry id
 * @param fileData Jpeg file data
 * @param fileData The file data
 */
public class MediaService {
	
	public static class AddMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddMediaBuilder> {
		
		public AddMediaBuilder(MediaEntry entry) {
			super(MediaEntry.class, "media", "add");
			params.add("entry", entry);
		}
	}

	/**
	 * Add entry
	 * 
	 * @param entry 
	 */
    public static AddMediaBuilder add(MediaEntry entry)  {
		return new AddMediaBuilder(entry);
	}
	
	public static class AddContentMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddContentMediaBuilder> {
		
		public AddContentMediaBuilder(String entryId, Resource resource) {
			super(MediaEntry.class, "media", "addContent");
			params.add("entryId", entryId);
			params.add("resource", resource);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static AddContentMediaBuilder addContent(String entryId)  {
		return addContent(entryId, null);
	}

	/**
	 * Add content to media entry which is not yet associated with content (therefore
	  is in status NO_CONTENT).      If the requirement is to replace the entry's
	  associated content, use action updateContent.
	 * 
	 * @param entryId 
	 * @param resource 
	 */
    public static AddContentMediaBuilder addContent(String entryId, Resource resource)  {
		return new AddContentMediaBuilder(entryId, resource);
	}
	
	public static class AddFromBulkMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromBulkMediaBuilder> {
		
		public AddFromBulkMediaBuilder(MediaEntry mediaEntry, String url, int bulkUploadId) {
			super(MediaEntry.class, "media", "addFromBulk");
			params.add("mediaEntry", mediaEntry);
			params.add("url", url);
			params.add("bulkUploadId", bulkUploadId);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
		
		public void bulkUploadId(String multirequestToken) {
			params.add("bulkUploadId", multirequestToken);
		}
	}

	/**
	 * Adds new media entry by importing an HTTP or FTP URL.   The entry will be queued
	  for import and then for conversion.   This action should be exposed only to the
	  batches
	 * 
	 * @param mediaEntry Media entry metadata
	 * @param url An HTTP or FTP URL
	 * @param bulkUploadId The id of the bulk upload job
	 */
    public static AddFromBulkMediaBuilder addFromBulk(MediaEntry mediaEntry, String url, int bulkUploadId)  {
		return new AddFromBulkMediaBuilder(mediaEntry, url, bulkUploadId);
	}
	
	public static class AddFromEntryMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromEntryMediaBuilder> {
		
		public AddFromEntryMediaBuilder(String sourceEntryId, MediaEntry mediaEntry, int sourceFlavorParamsId) {
			super(MediaEntry.class, "media", "addFromEntry");
			params.add("sourceEntryId", sourceEntryId);
			params.add("mediaEntry", mediaEntry);
			params.add("sourceFlavorParamsId", sourceFlavorParamsId);
		}
		
		public void sourceEntryId(String multirequestToken) {
			params.add("sourceEntryId", multirequestToken);
		}
		
		public void sourceFlavorParamsId(String multirequestToken) {
			params.add("sourceFlavorParamsId", multirequestToken);
		}
	}

	public static AddFromEntryMediaBuilder addFromEntry(String sourceEntryId)  {
		return addFromEntry(sourceEntryId, null);
	}

	public static AddFromEntryMediaBuilder addFromEntry(String sourceEntryId, MediaEntry mediaEntry)  {
		return addFromEntry(sourceEntryId, mediaEntry, Integer.MIN_VALUE);
	}

	/**
	 * Copy entry into new entry
	 * 
	 * @param sourceEntryId Media entry id to copy from
	 * @param mediaEntry Media entry metadata
	 * @param sourceFlavorParamsId The flavor to be used as the new entry source, source flavor will be used if not
	 * specified
	 */
    public static AddFromEntryMediaBuilder addFromEntry(String sourceEntryId, MediaEntry mediaEntry, int sourceFlavorParamsId)  {
		return new AddFromEntryMediaBuilder(sourceEntryId, mediaEntry, sourceFlavorParamsId);
	}
	
	public static class AddFromFlavorAssetMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromFlavorAssetMediaBuilder> {
		
		public AddFromFlavorAssetMediaBuilder(String sourceFlavorAssetId, MediaEntry mediaEntry) {
			super(MediaEntry.class, "media", "addFromFlavorAsset");
			params.add("sourceFlavorAssetId", sourceFlavorAssetId);
			params.add("mediaEntry", mediaEntry);
		}
		
		public void sourceFlavorAssetId(String multirequestToken) {
			params.add("sourceFlavorAssetId", multirequestToken);
		}
	}

	public static AddFromFlavorAssetMediaBuilder addFromFlavorAsset(String sourceFlavorAssetId)  {
		return addFromFlavorAsset(sourceFlavorAssetId, null);
	}

	/**
	 * Copy flavor asset into new entry
	 * 
	 * @param sourceFlavorAssetId Flavor asset id to be used as the new entry source
	 * @param mediaEntry Media entry metadata
	 */
    public static AddFromFlavorAssetMediaBuilder addFromFlavorAsset(String sourceFlavorAssetId, MediaEntry mediaEntry)  {
		return new AddFromFlavorAssetMediaBuilder(sourceFlavorAssetId, mediaEntry);
	}
	
	public static class AddFromRecordedWebcamMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromRecordedWebcamMediaBuilder> {
		
		public AddFromRecordedWebcamMediaBuilder(MediaEntry mediaEntry, String webcamTokenId) {
			super(MediaEntry.class, "media", "addFromRecordedWebcam");
			params.add("mediaEntry", mediaEntry);
			params.add("webcamTokenId", webcamTokenId);
		}
		
		public void webcamTokenId(String multirequestToken) {
			params.add("webcamTokenId", multirequestToken);
		}
	}

	/**
	 * Add new entry after the file was recorded on the server and the token id exists
	 * 
	 * @param mediaEntry Media entry metadata
	 * @param webcamTokenId Token id for the recorded webcam file
	 */
    public static AddFromRecordedWebcamMediaBuilder addFromRecordedWebcam(MediaEntry mediaEntry, String webcamTokenId)  {
		return new AddFromRecordedWebcamMediaBuilder(mediaEntry, webcamTokenId);
	}
	
	public static class AddFromSearchResultMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromSearchResultMediaBuilder> {
		
		public AddFromSearchResultMediaBuilder(MediaEntry mediaEntry, SearchResult searchResult) {
			super(MediaEntry.class, "media", "addFromSearchResult");
			params.add("mediaEntry", mediaEntry);
			params.add("searchResult", searchResult);
		}
	}

	public static AddFromSearchResultMediaBuilder addFromSearchResult()  {
		return addFromSearchResult(null);
	}

	public static AddFromSearchResultMediaBuilder addFromSearchResult(MediaEntry mediaEntry)  {
		return addFromSearchResult(mediaEntry, null);
	}

	/**
	 * Adds new media entry by importing the media file from a search provider.   This
	  action should be used with the search service result.
	 * 
	 * @param mediaEntry Media entry metadata
	 * @param searchResult Result object from search service
	 */
    public static AddFromSearchResultMediaBuilder addFromSearchResult(MediaEntry mediaEntry, SearchResult searchResult)  {
		return new AddFromSearchResultMediaBuilder(mediaEntry, searchResult);
	}
	
	public static class AddFromUploadedFileMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromUploadedFileMediaBuilder> {
		
		public AddFromUploadedFileMediaBuilder(MediaEntry mediaEntry, String uploadTokenId) {
			super(MediaEntry.class, "media", "addFromUploadedFile");
			params.add("mediaEntry", mediaEntry);
			params.add("uploadTokenId", uploadTokenId);
		}
		
		public void uploadTokenId(String multirequestToken) {
			params.add("uploadTokenId", multirequestToken);
		}
	}

	/**
	 * Add new entry after the specific media file was uploaded and the upload token id
	  exists
	 * 
	 * @param mediaEntry Media entry metadata
	 * @param uploadTokenId Upload token id
	 */
    public static AddFromUploadedFileMediaBuilder addFromUploadedFile(MediaEntry mediaEntry, String uploadTokenId)  {
		return new AddFromUploadedFileMediaBuilder(mediaEntry, uploadTokenId);
	}
	
	public static class AddFromUrlMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, AddFromUrlMediaBuilder> {
		
		public AddFromUrlMediaBuilder(MediaEntry mediaEntry, String url) {
			super(MediaEntry.class, "media", "addFromUrl");
			params.add("mediaEntry", mediaEntry);
			params.add("url", url);
		}
		
		public void url(String multirequestToken) {
			params.add("url", multirequestToken);
		}
	}

	/**
	 * Adds new media entry by importing an HTTP or FTP URL.   The entry will be queued
	  for import and then for conversion.
	 * 
	 * @param mediaEntry Media entry metadata
	 * @param url An HTTP or FTP URL
	 */
    public static AddFromUrlMediaBuilder addFromUrl(MediaEntry mediaEntry, String url)  {
		return new AddFromUrlMediaBuilder(mediaEntry, url);
	}
	
	public static class AnonymousRankMediaBuilder extends NullRequestBuilder {
		
		public AnonymousRankMediaBuilder(String entryId, int rank) {
			super("media", "anonymousRank");
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
	 * Anonymously rank a media entry, no validation is done on duplicate rankings
	 * 
	 * @param entryId 
	 * @param rank 
	 */
    public static AnonymousRankMediaBuilder anonymousRank(String entryId, int rank)  {
		return new AnonymousRankMediaBuilder(entryId, rank);
	}
	
	public static class ApproveMediaBuilder extends NullRequestBuilder {
		
		public ApproveMediaBuilder(String entryId) {
			super("media", "approve");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Approve the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry playable)
	 * 
	 * @param entryId 
	 */
    public static ApproveMediaBuilder approve(String entryId)  {
		return new ApproveMediaBuilder(entryId);
	}
	
	public static class ApproveReplaceMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, ApproveReplaceMediaBuilder> {
		
		public ApproveReplaceMediaBuilder(String entryId) {
			super(MediaEntry.class, "media", "approveReplace");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Approves media replacement
	 * 
	 * @param entryId Media entry id to replace
	 */
    public static ApproveReplaceMediaBuilder approveReplace(String entryId)  {
		return new ApproveReplaceMediaBuilder(entryId);
	}
	
	public static class BulkUploadAddMediaBuilder extends RequestBuilder<BulkUpload, BulkUpload.Tokenizer, BulkUploadAddMediaBuilder> {
		
		public BulkUploadAddMediaBuilder(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData) {
			super(BulkUpload.class, "media", "bulkUploadAdd");
			files = new Files();
			files.add("fileData", fileData);
			params.add("bulkUploadData", bulkUploadData);
			params.add("bulkUploadEntryData", bulkUploadEntryData);
		}
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(FileHolder fileData)  {
		return bulkUploadAdd(fileData, null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(File fileData)  {
		return bulkUploadAdd(new FileHolder(fileData), null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
		return bulkUploadAdd(fileData, bulkUploadData, null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(File fileData, BulkUploadJobData bulkUploadData)  {
		return bulkUploadAdd(new FileHolder(fileData), bulkUploadData, null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(File fileData, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
		return bulkUploadAdd(new FileHolder(fileData), bulkUploadData, bulkUploadEntryData);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadEntryData);
	}

	public static BulkUploadAddMediaBuilder bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
		return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadEntryData);
	}

	/**
	 * Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used
	 * 
	 * @param fileData 
	 * @param bulkUploadData 
	 * @param bulkUploadEntryData 
	 */
    public static BulkUploadAddMediaBuilder bulkUploadAdd(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
		return new BulkUploadAddMediaBuilder(fileData, bulkUploadData, bulkUploadEntryData);
	}
	
	public static class CancelReplaceMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, CancelReplaceMediaBuilder> {
		
		public CancelReplaceMediaBuilder(String entryId) {
			super(MediaEntry.class, "media", "cancelReplace");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Cancels media replacement
	 * 
	 * @param entryId Media entry id to cancel
	 */
    public static CancelReplaceMediaBuilder cancelReplace(String entryId)  {
		return new CancelReplaceMediaBuilder(entryId);
	}
	
	public static class ConvertMediaBuilder extends RequestBuilder<Long, String, ConvertMediaBuilder> {
		
		public ConvertMediaBuilder(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes) {
			super(Long.class, "media", "convert");
			params.add("entryId", entryId);
			params.add("conversionProfileId", conversionProfileId);
			params.add("dynamicConversionAttributes", dynamicConversionAttributes);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void conversionProfileId(String multirequestToken) {
			params.add("conversionProfileId", multirequestToken);
		}
	}

	public static ConvertMediaBuilder convert(String entryId)  {
		return convert(entryId, Integer.MIN_VALUE);
	}

	public static ConvertMediaBuilder convert(String entryId, int conversionProfileId)  {
		return convert(entryId, conversionProfileId, null);
	}

	/**
	 * Convert entry
	 * 
	 * @param entryId Media entry id
	 * @param conversionProfileId 
	 * @param dynamicConversionAttributes 
	 */
    public static ConvertMediaBuilder convert(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes)  {
		return new ConvertMediaBuilder(entryId, conversionProfileId, dynamicConversionAttributes);
	}
	
	public static class CountMediaBuilder extends RequestBuilder<Integer, String, CountMediaBuilder> {
		
		public CountMediaBuilder(MediaEntryFilter filter) {
			super(Integer.class, "media", "count");
			params.add("filter", filter);
		}
	}

	public static CountMediaBuilder count()  {
		return count(null);
	}

	/**
	 * Count media entries by filter.
	 * 
	 * @param filter Media entry filter
	 */
    public static CountMediaBuilder count(MediaEntryFilter filter)  {
		return new CountMediaBuilder(filter);
	}
	
	public static class DeleteMediaBuilder extends NullRequestBuilder {
		
		public DeleteMediaBuilder(String entryId) {
			super("media", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a media entry.
	 * 
	 * @param entryId Media entry id to delete
	 */
    public static DeleteMediaBuilder delete(String entryId)  {
		return new DeleteMediaBuilder(entryId);
	}
	
	public static class ExportToCsvMediaBuilder extends RequestBuilder<String, String, ExportToCsvMediaBuilder> {
		
		public ExportToCsvMediaBuilder(MediaEsearchExportToCsvJobData data) {
			super(String.class, "media", "exportToCsv");
			params.add("data", data);
		}
	}

	/**
	 * Creates a batch job that sends an email with a link to download a CSV containing
	  a list of entries
	 * 
	 * @param data job data indicating filter to pass to the job
	 */
    public static ExportToCsvMediaBuilder exportToCsv(MediaEsearchExportToCsvJobData data)  {
		return new ExportToCsvMediaBuilder(data);
	}
	
	public static class FlagMediaBuilder extends NullRequestBuilder {
		
		public FlagMediaBuilder(ModerationFlag moderationFlag) {
			super("media", "flag");
			params.add("moderationFlag", moderationFlag);
		}
	}

	/**
	 * Flag inappropriate media entry for moderation
	 * 
	 * @param moderationFlag 
	 */
    public static FlagMediaBuilder flag(ModerationFlag moderationFlag)  {
		return new FlagMediaBuilder(moderationFlag);
	}
	
	public static class GetMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, GetMediaBuilder> {
		
		public GetMediaBuilder(String entryId, int version) {
			super(MediaEntry.class, "media", "get");
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

	public static GetMediaBuilder get(String entryId)  {
		return get(entryId, -1);
	}

	/**
	 * Get media entry by ID.
	 * 
	 * @param entryId Media entry id
	 * @param version Desired version of the data
	 */
    public static GetMediaBuilder get(String entryId, int version)  {
		return new GetMediaBuilder(entryId, version);
	}
	
	public static class GetMrssMediaBuilder extends RequestBuilder<String, String, GetMrssMediaBuilder> {
		
		public GetMrssMediaBuilder(String entryId, List<ExtendingItemMrssParameter> extendingItemsArray, String features) {
			super(String.class, "media", "getMrss");
			params.add("entryId", entryId);
			params.add("extendingItemsArray", extendingItemsArray);
			params.add("features", features);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void features(String multirequestToken) {
			params.add("features", multirequestToken);
		}
	}

	public static GetMrssMediaBuilder getMrss(String entryId)  {
		return getMrss(entryId, null);
	}

	public static GetMrssMediaBuilder getMrss(String entryId, List<ExtendingItemMrssParameter> extendingItemsArray)  {
		return getMrss(entryId, extendingItemsArray, null);
	}

	/**
	 * Get MRSS by entry id      XML will return as an escaped string
	 * 
	 * @param entryId Entry id
	 * @param extendingItemsArray 
	 * @param features 
	 */
    public static GetMrssMediaBuilder getMrss(String entryId, List<ExtendingItemMrssParameter> extendingItemsArray, String features)  {
		return new GetMrssMediaBuilder(entryId, extendingItemsArray, features);
	}
	
	public static class GetVolumeMapMediaBuilder extends ServeRequestBuilder {
		
		public GetVolumeMapMediaBuilder(String entryId) {
			super("media", "getVolumeMap");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Get volume map by entry id
	 * 
	 * @param entryId Entry id
	 */
    public static GetVolumeMapMediaBuilder getVolumeMap(String entryId)  {
		return new GetVolumeMapMediaBuilder(entryId);
	}
	
	public static class ListMediaBuilder extends ListResponseRequestBuilder<MediaEntry, MediaEntry.Tokenizer, ListMediaBuilder> {
		
		public ListMediaBuilder(MediaEntryFilter filter, FilterPager pager) {
			super(MediaEntry.class, "media", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListMediaBuilder list()  {
		return list(null);
	}

	public static ListMediaBuilder list(MediaEntryFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List media entries by filter with paging support.
	 * 
	 * @param filter Media entry filter
	 * @param pager Pager
	 */
    public static ListMediaBuilder list(MediaEntryFilter filter, FilterPager pager)  {
		return new ListMediaBuilder(filter, pager);
	}
	
	public static class ListFlagsMediaBuilder extends ListResponseRequestBuilder<ModerationFlag, ModerationFlag.Tokenizer, ListFlagsMediaBuilder> {
		
		public ListFlagsMediaBuilder(String entryId, FilterPager pager) {
			super(ModerationFlag.class, "media", "listFlags");
			params.add("entryId", entryId);
			params.add("pager", pager);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static ListFlagsMediaBuilder listFlags(String entryId)  {
		return listFlags(entryId, null);
	}

	/**
	 * List all pending flags for the media entry
	 * 
	 * @param entryId 
	 * @param pager 
	 */
    public static ListFlagsMediaBuilder listFlags(String entryId, FilterPager pager)  {
		return new ListFlagsMediaBuilder(entryId, pager);
	}
	
	public static class RejectMediaBuilder extends NullRequestBuilder {
		
		public RejectMediaBuilder(String entryId) {
			super("media", "reject");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Reject the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry non playable)
	 * 
	 * @param entryId 
	 */
    public static RejectMediaBuilder reject(String entryId)  {
		return new RejectMediaBuilder(entryId);
	}
	
	public static class RequestConversionMediaBuilder extends RequestBuilder<Integer, String, RequestConversionMediaBuilder> {
		
		public RequestConversionMediaBuilder(String entryId, String fileFormat) {
			super(Integer.class, "media", "requestConversion");
			params.add("entryId", entryId);
			params.add("fileFormat", fileFormat);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void fileFormat(String multirequestToken) {
			params.add("fileFormat", multirequestToken);
		}
	}

	/**
	 * Request a new conversion job, this can be used to convert the media entry to a
	  different format
	 * 
	 * @param entryId Media entry id
	 * @param fileFormat Format to convert
	 */
    public static RequestConversionMediaBuilder requestConversion(String entryId, String fileFormat)  {
		return new RequestConversionMediaBuilder(entryId, fileFormat);
	}
	
	public static class UpdateMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, UpdateMediaBuilder> {
		
		public UpdateMediaBuilder(String entryId, MediaEntry mediaEntry) {
			super(MediaEntry.class, "media", "update");
			params.add("entryId", entryId);
			params.add("mediaEntry", mediaEntry);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Update media entry. Only the properties that were set will be updated.
	 * 
	 * @param entryId Media entry id to update
	 * @param mediaEntry Media entry metadata to update
	 */
    public static UpdateMediaBuilder update(String entryId, MediaEntry mediaEntry)  {
		return new UpdateMediaBuilder(entryId, mediaEntry);
	}
	
	public static class UpdateContentMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, UpdateContentMediaBuilder> {
		
		public UpdateContentMediaBuilder(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions) {
			super(MediaEntry.class, "media", "updateContent");
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

	public static UpdateContentMediaBuilder updateContent(String entryId, Resource resource)  {
		return updateContent(entryId, resource, Integer.MIN_VALUE);
	}

	public static UpdateContentMediaBuilder updateContent(String entryId, Resource resource, int conversionProfileId)  {
		return updateContent(entryId, resource, conversionProfileId, null);
	}

	/**
	 * Replace content associated with the media entry.
	 * 
	 * @param entryId Media entry id to update
	 * @param resource Resource to be used to replace entry media content
	 * @param conversionProfileId The conversion profile id to be used on the entry
	 * @param advancedOptions Additional update content options
	 */
    public static UpdateContentMediaBuilder updateContent(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions)  {
		return new UpdateContentMediaBuilder(entryId, resource, conversionProfileId, advancedOptions);
	}
	
	public static class UpdateThumbnailMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, UpdateThumbnailMediaBuilder> {
		
		public UpdateThumbnailMediaBuilder(String entryId, int timeOffset, int flavorParamsId) {
			super(MediaEntry.class, "media", "updateThumbnail");
			params.add("entryId", entryId);
			params.add("timeOffset", timeOffset);
			params.add("flavorParamsId", flavorParamsId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void timeOffset(String multirequestToken) {
			params.add("timeOffset", multirequestToken);
		}
		
		public void flavorParamsId(String multirequestToken) {
			params.add("flavorParamsId", multirequestToken);
		}
	}

	public static UpdateThumbnailMediaBuilder updateThumbnail(String entryId, int timeOffset)  {
		return updateThumbnail(entryId, timeOffset, Integer.MIN_VALUE);
	}

	/**
	 * Update media entry thumbnail by a specified time offset (In seconds)   If flavor
	  params id not specified, source flavor will be used by default
	 * 
	 * @param entryId Media entry id
	 * @param timeOffset Time offset (in seconds)
	 * @param flavorParamsId The flavor params id to be used
	 */
    public static UpdateThumbnailMediaBuilder updateThumbnail(String entryId, int timeOffset, int flavorParamsId)  {
		return new UpdateThumbnailMediaBuilder(entryId, timeOffset, flavorParamsId);
	}
	
	public static class UpdateThumbnailFromSourceEntryMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, UpdateThumbnailFromSourceEntryMediaBuilder> {
		
		public UpdateThumbnailFromSourceEntryMediaBuilder(String entryId, String sourceEntryId, int timeOffset, int flavorParamsId) {
			super(MediaEntry.class, "media", "updateThumbnailFromSourceEntry");
			params.add("entryId", entryId);
			params.add("sourceEntryId", sourceEntryId);
			params.add("timeOffset", timeOffset);
			params.add("flavorParamsId", flavorParamsId);
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
		
		public void flavorParamsId(String multirequestToken) {
			params.add("flavorParamsId", multirequestToken);
		}
	}

	public static UpdateThumbnailFromSourceEntryMediaBuilder updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset)  {
		return updateThumbnailFromSourceEntry(entryId, sourceEntryId, timeOffset, Integer.MIN_VALUE);
	}

	/**
	 * Update media entry thumbnail from a different entry by a specified time offset
	  (In seconds)   If flavor params id not specified, source flavor will be used by
	  default
	 * 
	 * @param entryId Media entry id
	 * @param sourceEntryId Media entry id
	 * @param timeOffset Time offset (in seconds)
	 * @param flavorParamsId The flavor params id to be used
	 */
    public static UpdateThumbnailFromSourceEntryMediaBuilder updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset, int flavorParamsId)  {
		return new UpdateThumbnailFromSourceEntryMediaBuilder(entryId, sourceEntryId, timeOffset, flavorParamsId);
	}
	
	public static class UpdateThumbnailFromUrlMediaBuilder extends RequestBuilder<BaseEntry, BaseEntry.Tokenizer, UpdateThumbnailFromUrlMediaBuilder> {
		
		public UpdateThumbnailFromUrlMediaBuilder(String entryId, String url) {
			super(BaseEntry.class, "media", "updateThumbnailFromUrl");
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
	 * Update entry thumbnail using URL
	 * 
	 * @param entryId Media entry id
	 * @param url file url
	 */
    public static UpdateThumbnailFromUrlMediaBuilder updateThumbnailFromUrl(String entryId, String url)  {
		return new UpdateThumbnailFromUrlMediaBuilder(entryId, url);
	}
	
	public static class UpdateThumbnailJpegMediaBuilder extends RequestBuilder<MediaEntry, MediaEntry.Tokenizer, UpdateThumbnailJpegMediaBuilder> {
		
		public UpdateThumbnailJpegMediaBuilder(String entryId, FileHolder fileData) {
			super(MediaEntry.class, "media", "updateThumbnailJpeg");
			params.add("entryId", entryId);
			files = new Files();
			files.add("fileData", fileData);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	public static UpdateThumbnailJpegMediaBuilder updateThumbnailJpeg(String entryId, File fileData)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData));
	}

	public static UpdateThumbnailJpegMediaBuilder updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UpdateThumbnailJpegMediaBuilder updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Update media entry thumbnail using a raw jpeg file
	 * 
	 * @param entryId Media entry id
	 * @param fileData Jpeg file data
	 */
    public static UpdateThumbnailJpegMediaBuilder updateThumbnailJpeg(String entryId, FileHolder fileData)  {
		return new UpdateThumbnailJpegMediaBuilder(entryId, fileData);
	}
	
	public static class UploadMediaBuilder extends RequestBuilder<String, String, UploadMediaBuilder> {
		
		public UploadMediaBuilder(FileHolder fileData) {
			super(String.class, "media", "upload");
			files = new Files();
			files.add("fileData", fileData);
		}
	}

	public static UploadMediaBuilder upload(File fileData)  {
		return upload(new FileHolder(fileData));
	}

	public static UploadMediaBuilder upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
	}

	public static UploadMediaBuilder upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
		return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
	}

	/**
	 * Upload a media file to Kaltura, then the file can be used to create a media
	  entry.
	 * 
	 * @param fileData The file data
	 */
    public static UploadMediaBuilder upload(FileHolder fileData)  {
		return new UploadMediaBuilder(fileData);
	}
}
