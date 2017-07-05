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

import com.kaltura.client.Params;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.types.MediaEntryFilter;
import com.kaltura.client.types.MixEntry;
import com.kaltura.client.types.MixEntryFilter;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  A Mix is an XML unique format invented by Kaltura, it allows the user to create
  a mix of videos and images, in and out points, transitions, text overlays,
  soundtrack, effects and much more...  Mixing service lets you create a new mix,
  manage its metadata and make basic manipulations.  */
public class MixingService {

	/**  Adds a new mix.   If the dataContent is null, a default timeline will be
	  created.  */
    public static RequestBuilder<MixEntry> add(MixEntry mixEntry)  {
        Params kparams = new Params();
        kparams.add("mixEntry", mixEntry);

        return new RequestBuilder<MixEntry>(MixEntry.class, "mixing", "add", kparams);
    }

	/**  Anonymously rank a mix entry, no validation is done on duplicate rankings  */
    public static RequestBuilder<Void> anonymousRank(String entryId, int rank)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);

        return new NullRequestBuilder("mixing", "anonymousRank", kparams);
    }

	/**  Appends a media entry to a the end of the mix timeline, this will save the mix
	  timeline as a new version.  */
    public static RequestBuilder<MixEntry> appendMediaEntry(String mixEntryId, String mediaEntryId)  {
        Params kparams = new Params();
        kparams.add("mixEntryId", mixEntryId);
        kparams.add("mediaEntryId", mediaEntryId);

        return new RequestBuilder<MixEntry>(MixEntry.class, "mixing", "appendMediaEntry", kparams);
    }

	/**  Clones an existing mix.  */
    public static RequestBuilder<MixEntry> clone(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new RequestBuilder<MixEntry>(MixEntry.class, "mixing", "clone", kparams);
    }

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  Count mix entries by filter.  */
    public static RequestBuilder<Integer> count(MediaEntryFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "mixing", "count", kparams);
    }

	/**  Delete a mix entry.  */
    public static RequestBuilder<Void> delete(String entryId)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);

        return new NullRequestBuilder("mixing", "delete", kparams);
    }

    public static RequestBuilder<MixEntry> get(String entryId)  {
        return get(entryId, -1);
    }

	/**  Get mix entry by id.  */
    public static RequestBuilder<MixEntry> get(String entryId, int version)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("version", version);

        return new RequestBuilder<MixEntry>(MixEntry.class, "mixing", "get", kparams);
    }

	/**  Get the mixes in which the media entry is included  */
    public static RequestBuilder<List<MixEntry>> getMixesByMediaId(String mediaEntryId)  {
        Params kparams = new Params();
        kparams.add("mediaEntryId", mediaEntryId);

        return new ArrayRequestBuilder<MixEntry>(MixEntry.class, "mixing", "getMixesByMediaId", kparams);
    }

    public static RequestBuilder<List<MediaEntry>> getReadyMediaEntries(String mixId)  {
        return getReadyMediaEntries(mixId, -1);
    }

	/**  Get all ready media entries that exist in the given mix id  */
    public static RequestBuilder<List<MediaEntry>> getReadyMediaEntries(String mixId, int version)  {
        Params kparams = new Params();
        kparams.add("mixId", mixId);
        kparams.add("version", version);

        return new ArrayRequestBuilder<MediaEntry>(MediaEntry.class, "mixing", "getReadyMediaEntries", kparams);
    }

    public static RequestBuilder<ListResponse<MixEntry>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<MixEntry>> list(MixEntryFilter filter)  {
        return list(filter, null);
    }

	/**  List entries by filter with paging support.   Return parameter is an array of
	  mix entries.  */
    public static RequestBuilder<ListResponse<MixEntry>> list(MixEntryFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<MixEntry>(MixEntry.class, "mixing", "list", kparams);
    }

	/**  Update mix entry. Only the properties that were set will be updated.  */
    public static RequestBuilder<MixEntry> update(String entryId, MixEntry mixEntry)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("mixEntry", mixEntry);

        return new RequestBuilder<MixEntry>(MixEntry.class, "mixing", "update", kparams);
    }
}
