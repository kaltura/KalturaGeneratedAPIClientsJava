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
import com.kaltura.client.enums.EntryType;
import com.kaltura.client.types.BaseEntry;
import com.kaltura.client.types.BaseEntryCloneOptionItem;
import com.kaltura.client.types.BaseEntryFilter;
import com.kaltura.client.types.EntryContextDataParams;
import com.kaltura.client.types.EntryContextDataResult;
import com.kaltura.client.types.EntryReplacementOptions;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Base Entry Service  */
public class BaseEntryService {

    public static RequestBuilder<BaseEntry> add(BaseEntry entry)  {
        return add(entry, null);
    }

	/**  Generic add entry, should be used when the uploaded entry type is not known.  */
    public static RequestBuilder<BaseEntry> add(BaseEntry entry, EntryType type)  {
        Params kparams = new Params();
        kparams.add("entry", entry);
        kparams.add("type", type);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "add", kparams);
    }

	/**  Attach content resource to entry in status NO_MEDIA  */
    public static RequestBuilder<BaseEntry> addContent(String entryId, Resource resource)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "addContent", kparams);
    }

    public static RequestBuilder<BaseEntry> addFromUploadedFile(BaseEntry entry, String uploadTokenId)  {
        return addFromUploadedFile(entry, uploadTokenId, null);
    }

	/**  Generic add entry using an uploaded file, should be used when the uploaded entry
	  type is not known.  */
    public static RequestBuilder<BaseEntry> addFromUploadedFile(BaseEntry entry, String uploadTokenId, EntryType type)  {
        Params kparams = new Params();
        kparams.add("entry", entry);
        kparams.add("uploadTokenId", uploadTokenId);
        kparams.add("type", type);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "addFromUploadedFile", kparams);
    }

	/**  Anonymously rank an entry, no validation is done on duplicate rankings.  */
    public static RequestBuilder<Void> anonymousRank(String entryId, int rank)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);

        return new NullRequestBuilder("baseentry", "anonymousRank", kparams);
    }

	/**  Approve the entry and mark the pending flags (if any) as moderated (this will
	  make the entry playable).  */
    public static RequestBuilder<Void> approve(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("baseentry", "approve", kparams);
    }

    public static RequestBuilder<BaseEntry> clone(String entryId)  {
        return clone(entryId, null);
    }

	/**  Clone an entry with optional attributes to apply to the clone  */
    public static RequestBuilder<BaseEntry> clone(String entryId, List<BaseEntryCloneOptionItem> cloneOptions)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("cloneOptions", cloneOptions);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "clone", kparams);
    }

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  Count base entries by filter.  */
    public static RequestBuilder<Integer> count(BaseEntryFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "baseentry", "count", kparams);
    }

	/**  Delete an entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("baseentry", "delete", kparams);
    }

    public static RequestBuilder<BaseEntry> export(String entryId, int storageProfileId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("storageProfileId", storageProfileId);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "export", kparams);
    }

	/**  Flag inappropriate entry for moderation.  */
    public static RequestBuilder<Void> flag(ModerationFlag moderationFlag)  {
        Params kparams = new Params();
        kparams.add("moderationFlag", moderationFlag);

        return new NullRequestBuilder("baseentry", "flag", kparams);
    }

    public static RequestBuilder<BaseEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get base entry by ID.  */
    public static RequestBuilder<BaseEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "get", kparams);
    }

	/**  Get an array of KalturaBaseEntry objects by a comma-separated list of ids.  */
    public static RequestBuilder<List<BaseEntry>> getByIds(String entryIds)  {
        Params kparams = new Params();
        kparams.add("entryIds", entryIds);

        return new ArrayRequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "getByIds", kparams);
    }

	/**  This action delivers entry-related data, based on the user's context: access
	  control, restriction, playback format and storage information.  */
    public static RequestBuilder<EntryContextDataResult> getContextData(String entryId, EntryContextDataParams contextDataParams)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("contextDataParams", contextDataParams);

        return new RequestBuilder<EntryContextDataResult>(EntryContextDataResult.class, "baseentry", "getContextData", kparams);
    }

	/**  This action delivers all data relevant for player  */
    public static RequestBuilder<PlaybackContext> getPlaybackContext(String entryId, PlaybackContextOptions contextDataParams)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("contextDataParams", contextDataParams);

        return new RequestBuilder<PlaybackContext>(PlaybackContext.class, "baseentry", "getPlaybackContext", kparams);
    }

	/**  Get remote storage existing paths for the asset.  */
    public static RequestBuilder<ListResponse<RemotePath>> getRemotePaths(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new ListResponseRequestBuilder<RemotePath>(RemotePath.class, "baseentry", "getRemotePaths", kparams);
    }

    public static RequestBuilder<Integer> index(String id)  {
        return index(id, true);
    }

	/**  Index an entry by id.  */
    public static RequestBuilder<Integer> index(String id, boolean shouldUpdate)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("shouldUpdate", shouldUpdate);

        return new RequestBuilder<Integer>(Integer.class, "baseentry", "index", kparams);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> list(BaseEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List base entries by filter with paging support.  */
    public static RequestBuilder<ListResponse<BaseEntry>> list(BaseEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "list", kparams);
    }

    public static RequestBuilder<ListResponse<BaseEntry>> listByReferenceId(String refId)  {
        return listByReferenceId(refId, null);
    }

	/**  List base entries by filter according to reference id  */
    public static RequestBuilder<ListResponse<BaseEntry>> listByReferenceId(String refId, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("refId", refId);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "listByReferenceId", kparams);
    }

    public static RequestBuilder<ListResponse<ModerationFlag>> listFlags(String entryId)  {
        return listFlags(entryId, null);
    }

	/**  List all pending flags for the entry.  */
    public static RequestBuilder<ListResponse<ModerationFlag>> listFlags(String entryId, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ModerationFlag>(ModerationFlag.class, "baseentry", "listFlags", kparams);
    }

	/**  Reject the entry and mark the pending flags (if any) as moderated (this will
	  make the entry non-playable).  */
    public static RequestBuilder<Void> reject(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("baseentry", "reject", kparams);
    }

	/**  Update base entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<BaseEntry> update(String entryId, BaseEntry baseEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("baseEntry", baseEntry);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "update", kparams);
    }

    public static RequestBuilder<BaseEntry> updateContent(String entryId, Resource resource)  {
        return updateContent(entryId, resource, Integer.MIN_VALUE);
    }

    public static RequestBuilder<BaseEntry> updateContent(String entryId, Resource resource, int conversionProfileId)  {
        return updateContent(entryId, resource, conversionProfileId, null);
    }

	/**  Update the content resource associated with the entry.  */
    public static RequestBuilder<BaseEntry> updateContent(String entryId, Resource resource, int conversionProfileId, EntryReplacementOptions advancedOptions)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("resource", resource);
        kparams.add("conversionProfileId", conversionProfileId);
        kparams.add("advancedOptions", advancedOptions);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "updateContent", kparams);
    }

	/**  Update entry thumbnail from a different entry by a specified time offset (in
	  seconds).  */
    public static RequestBuilder<BaseEntry> updateThumbnailFromSourceEntry(String entryId, String sourceEntryId, int timeOffset)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("sourceEntryId", sourceEntryId);
        kparams.add("timeOffset", timeOffset);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "updateThumbnailFromSourceEntry", kparams);
    }

	/**  Update entry thumbnail using url.  */
    public static RequestBuilder<BaseEntry> updateThumbnailFromUrl(String entryId, String url)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("url", url);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "updateThumbnailFromUrl", kparams);
    }

    public static RequestBuilder<BaseEntry> updateThumbnailJpeg(String entryId, File fileData)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData));
    }

    public static RequestBuilder<BaseEntry> updateThumbnailJpeg(String entryId, InputStream fileData, String fileDataMimeType, String fileDataName, long fileDataSize)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName, fileDataSize));
    }

    public static RequestBuilder<BaseEntry> updateThumbnailJpeg(String entryId, FileInputStream fileData, String fileDataMimeType, String fileDataName)  {
        return updateThumbnailJpeg(entryId, new FileHolder(fileData, fileDataMimeType, fileDataName));
    }

	/**  Update entry thumbnail using a raw jpeg file.  */
    public static RequestBuilder<BaseEntry> updateThumbnailJpeg(String entryId, FileHolder fileData)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<BaseEntry>(BaseEntry.class, "baseentry", "updateThumbnailJpeg", kparams, kfiles);
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

	/**  Upload a file to Kaltura, that can be used to create an entry.  */
    public static RequestBuilder<String> upload(FileHolder fileData)  {
        Params kparams = new Params();
        Files kfiles = new Files();
        kfiles.add("fileData", fileData);

        return new RequestBuilder<String>(String.class, "baseentry", "upload", kparams, kfiles);
    }
}
