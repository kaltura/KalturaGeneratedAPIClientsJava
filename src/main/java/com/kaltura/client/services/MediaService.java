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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.Params;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BulkUpload;
import com.kaltura.client.types.BulkUploadEntryData;
import com.kaltura.client.types.BulkUploadJobData;
import com.kaltura.client.types.ConversionAttribute;
import com.kaltura.client.types.EntryReplacementOptions;
import com.kaltura.client.types.ExtendingItemMrssParameter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.MediaEntryFilter;
import com.kaltura.client.types.ModerationFlag;
import com.kaltura.client.types.Resource;
import com.kaltura.client.types.SearchResult;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Media service lets you upload and manage media files (images / videos &amp;
  audio)  */
public class MediaService {

	/**  Add entry  */
    public static RequestBuilder<MediaEntry> add(MediaEntry entry)  {
        Params kparams = new Params();
        kparams.add("entry", entry);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "add", kparams);
    }

    public static RequestBuilder<MediaEntry> addContent(String entryId)  {
        return addContent(entryId, null);
    }

	/**  Add content to media entry which is not yet associated with content (therefore
	  is in status NO_CONTENT).      If the requirement is to replace the entry's
	  associated content, use action updateContent.  */
    public static RequestBuilder<MediaEntry> addContent(String entryId, Resource resource)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addContent", kparams);
    }

	/**  Adds new media entry by importing an HTTP or FTP URL.   The entry will be queued
	  for import and then for conversion.   This action should be exposed only to the
	  batches  */
    public static RequestBuilder<MediaEntry> addFromBulk(MediaEntry mediaEntry, String url, int bulkUploadId)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("url", url);
        kparams.add("bulkUploadId", bulkUploadId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromBulk", kparams);
    }

    public static RequestBuilder<MediaEntry> addFromEntry(String sourceEntryId)  {
        return addFromEntry(sourceEntryId, null);
    }

    public static RequestBuilder<MediaEntry> addFromEntry(String sourceEntryId, MediaEntry mediaEntry)  {
        return addFromEntry(sourceEntryId, mediaEntry, Integer.MIN_VALUE);
    }

	/**  Copy entry into new entry  */
    public static RequestBuilder<MediaEntry> addFromEntry(String sourceEntryId, MediaEntry mediaEntry, int sourceFlavorParamsId)  {
        Params kparams = new Params();
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("sourceFlavorParamsId", sourceFlavorParamsId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromEntry", kparams);
    }

    public static RequestBuilder<MediaEntry> addFromFlavorAsset(String sourceFlavorAssetId)  {
        return addFromFlavorAsset(sourceFlavorAssetId, null);
    }

	/**  Copy flavor asset into new entry  */
    public static RequestBuilder<MediaEntry> addFromFlavorAsset(String sourceFlavorAssetId, MediaEntry mediaEntry)  {
        Params kparams = new Params();
        kparams.add("sourceFlavorAssetId", sourceFlavorAssetId);
        kparams.add("mediaEntry", mediaEntry);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromFlavorAsset", kparams);
    }

	/**  Add new entry after the file was recored on the server and the token id exists  */
    public static RequestBuilder<MediaEntry> addFromRecordedWebcam(MediaEntry mediaEntry, String webcamTokenId)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("webcamTokenId", webcamTokenId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromRecordedWebcam", kparams);
    }

    public static RequestBuilder<MediaEntry> addFromSearchResult()  {
        return addFromSearchResult(null);
    }

    public static RequestBuilder<MediaEntry> addFromSearchResult(MediaEntry mediaEntry)  {
        return addFromSearchResult(mediaEntry, null);
    }

	/**  Adds new media entry by importing the media file from a search provider.   This
	  action should be used with the search service result.  */
    public static RequestBuilder<MediaEntry> addFromSearchResult(MediaEntry mediaEntry, SearchResult searchResult)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("searchResult", searchResult);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromSearchResult", kparams);
    }

	/**  Add new entry after the specific media file was uploaded and the upload token id
	  exists  */
    public static RequestBuilder<MediaEntry> addFromUploadedFile(MediaEntry mediaEntry, String uploadTokenId)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("uploadTokenId", uploadTokenId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromUploadedFile", kparams);
    }

	/**  Adds new media entry by importing an HTTP or FTP URL.   The entry will be queued
	  for import and then for conversion.  */
    public static RequestBuilder<MediaEntry> addFromUrl(MediaEntry mediaEntry, String url)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("url", url);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "addFromUrl", kparams);
    }

	/**  Anonymously rank a media entry, no validation is done on duplicate rankings  */
    public static RequestBuilder<Void> anonymousRank(String entryId, int rank)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);

        return new NullRequestBuilder("media", "anonymousRank", kparams);
    }

	/**  Approve the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry playable)  */
    public static RequestBuilder<Void> approve(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("media", "approve", kparams);
    }

	/**  Approves media replacement  */
    public static RequestBuilder<MediaEntry> approveReplace(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "approveReplace", kparams);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileHolder fileData)  {
        return bulkUploadAdd(fileData, null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(File fileData)  {
        return bulkUploadAdd(new FileHolder(fileData), null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileHolder fileData, BulkUploadJobData bulkUploadData)  {
        return bulkUploadAdd(fileData, bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(File fileData, BulkUploadJobData bulkUploadData)  {
        return bulkUploadAdd(new FileHolder(fileData), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, null);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(File fileData, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
        return bulkUploadAdd(new FileHolder(fileData), bulkUploadData, bulkUploadEntryData);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize), bulkUploadData, bulkUploadEntryData);
    }

    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileInputStream fileData, String fileDataMimeType, String fileDataName, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
        return bulkUploadAdd(new FileHolder(fileData, fileDataMimeType, fileDataName), bulkUploadData, bulkUploadEntryData);
    }

	/**  Add new bulk upload batch job   Conversion profile id can be specified in the
	  API or in the CSV file, the one in the CSV file will be stronger.   If no
	  conversion profile was specified, partner's default will be used  */
    public static RequestBuilder<BulkUpload> bulkUploadAdd(FileHolder fileData, BulkUploadJobData bulkUploadData, BulkUploadEntryData bulkUploadEntryData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);
        kparams.add("bulkUploadData", bulkUploadData);
        kparams.add("bulkUploadEntryData", bulkUploadEntryData);

        return new RequestBuilder<BulkUpload>(BulkUpload.class, "media", "bulkUploadAdd", kparams, kfiles);
    }

	/**  Cancels media replacement  */
    public static RequestBuilder<MediaEntry> cancelReplace(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "cancelReplace", kparams);
    }

    public static RequestBuilder<Long> convert(String entryId)  {
        return convert(entryId, Integer.MIN_VALUE);
    }

    public static RequestBuilder<Long> convert(String entryId, int conversionProfileId)  {
        return convert(entryId, conversionProfileId, null);
    }

	/**  Convert entry  */
    public static RequestBuilder<Long> convert(String entryId, int conversionProfileId, List<ConversionAttribute> dynamicConversionAttributes)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("dynamicConversionAttributes", dynamicConversionAttributes);

        return new RequestBuilder<Long>(Long.class, "media", "convert", kparams);
    }

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  Count media entries by filter.  */
    public static RequestBuilder<Integer> count(MediaEntryFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "media", "count", kparams);
    }

	/**  Delete a media entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("media", "delete", kparams);
    }

	/**  Flag inappropriate media entry for moderation  */
    public static RequestBuilder<Void> flag(ModerationFlag moderationFlag)  {
        Params kparams = new Params();
        kparams.add("moderationFlag", moderationFlag);

        return new NullRequestBuilder("media", "flag", kparams);
    }

    public static RequestBuilder<MediaEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get media entry by ID.  */
    public static RequestBuilder<MediaEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "get", kparams);
    }

    public static RequestBuilder<String> getMrss(String entryId)  {
        return getMrss(entryId, null);
    }

    public static RequestBuilder<String> getMrss(String entryId, List<ExtendingItemMrssParameter> extendingItemsArray)  {
        return getMrss(entryId, extendingItemsArray, null);
    }

	/**  Get MRSS by entry id      XML will return as an escaped string  */
    public static RequestBuilder<String> getMrss(String entryId, List<ExtendingItemMrssParameter> extendingItemsArray, String features)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("extendingItemsArray", extendingItemsArray);
        kparams.add("features", features);

        return new RequestBuilder<String>(String.class, "media", "getMrss", kparams);
    }

    public static RequestBuilder<ListResponse<MediaEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<MediaEntry>> list(MediaEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List media entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<MediaEntry>> list(MediaEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<MediaEntry>(MediaEntry.class, "media", "list", kparams);
    }

    public static RequestBuilder<ListResponse<ModerationFlag>> listFlags(String entryId)  {
        return listFlags(entryId, null);
    }

	/**  List all pending flags for the media entry  */
    public static RequestBuilder<ListResponse<ModerationFlag>> listFlags(String entryId, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ModerationFlag>(ModerationFlag.class, "media", "listFlags", kparams);
    }

	/**  Reject the media entry and mark the pending flags (if any) as moderated (this
	  will make the entry non playable)  */
    public static RequestBuilder<Void> reject(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("media", "reject", kparams);
    }

	/**  Request a new conversion job, this can be used to convert the media entry to a
	  different format  */
    public static RequestBuilder<Integer> requestConversion(String entryId, String fileFormat)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("fileFormat", fileFormat);

        return new RequestBuilder<Integer>(Integer.class, "media", "requestConversion", kparams);
    }

	/**  Update media entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<MediaEntry> update(String entryId, MediaEntry mediaEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("mediaEntry", mediaEntry);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "update", kparams);
    }

    public static RequestBuilder<MediaEntry> updateContent(String entryId, Resource resource)  {
        return updateContent(entryId, resource, Integer.MIN_VALUE);
    }

    public static RequestBuilder<MediaEntry> updateContent(String entryId, Resource resource, int conversionProfileId)  {
        return updateContent(entryId, resource, conversionProfileId, null);
    }

	/**  Replace content associated with the media entry.  */
    public static RequestBuilder<MediaEntry> updateContent(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("advancedOptions", advancedOptions);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "updateContent", kparams);
    }

    public static RequestBuilder<MediaEntry> updateThumbnail(String entryId, int timeOffset)  {
        return updateThumbnail(entryId, timeOffset, Integer.MIN_VALUE);
    }

	/**  Update media entry thumbnail by a specified time offset (In seconds)   If flavor
	  params id not specified, source flavor will be used by default  */
    public static RequestBuilder<MediaEntry> updateThumbnail(String entryId, int timeOffset, int flavorParamsId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("timeOffset", timeOffset);
        kparams.add("flavorParamsId", flavorParamsId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "updateThumbnail", kparams);
    }

    public static RequestBuilder<MediaEntry> updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset)  {
        return updateThumbnailFromSourceEntry(entryId, sourceEntryId, timeOffset, Integer.MIN_VALUE);
    }

	/**  Update media entry thumbnail from a different entry by a specified time offset
	  (In seconds)   If flavor params id not specified, source flavor will be used by
	  default  */
    public static RequestBuilder<MediaEntry> updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset, int flavorParamsId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("timeOffset", timeOffset);
        kparams.add("flavorParamsId", flavorParamsId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "updateThumbnailFromSourceEntry", kparams);
    }

	/**  Update entry thumbnail using url  */
    public static RequestBuilder<BaseEntry> updateThumbnailFromUrl(String entryId, String url)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("url", url);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "media", "updateThumbnailFromUrl", kparams);
    }

    public static RequestBuilder<MediaEntry> updateThumbnailJpeg(String entryId, File fileData)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData));
    }

    public static RequestBuilder<MediaEntry> updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<MediaEntry> updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Update media entry thumbnail using a raw jpeg file  */
    public static RequestBuilder<MediaEntry> updateThumbnailJpeg(String entryId, FileHolder fileData)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "media", "updateThumbnailJpeg", kparams, kfiles);
    }

    public static RequestBuilder<String> upload(File fileData)  {
        return upload(new FileHolder(fileData));
    }

    public static RequestBuilder<String> upload(InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return upload(new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<String> upload(FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return upload(new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Upload a media file to Kaltura, then the file can be used to create a media
	  entry.  */
    public static RequestBuilder<String> upload(FileHolder fileData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<String>(String.class, "media", "upload", kparams, kfiles);
    }
}
