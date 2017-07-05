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
import com.kaltura.client.types.BaseSyndicationFeed;
import com.kaltura.client.types.BaseSyndicationFeedFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.SyndicationFeedEntryCount;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add &amp; Manage Syndication Feeds  */
public class SyndicationFeedService {

	/**  Add new Syndication Feed  */
    public static RequestBuilder<BaseSyndicationFeed> add(BaseSyndicationFeed syndicationFeed)  {
        Params kparams = new Params();
        kparams.add("syndicationFeed", syndicationFeed);

        return new RequestBuilder<BaseSyndicationFeed>(BaseSyndicationFeed.class, "syndicationfeed", "add", kparams);
    }

	/**  Delete Syndication Feed by ID  */
    public static RequestBuilder<Void> delete(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("syndicationfeed", "delete", kparams);
    }

	/**  Get Syndication Feed by ID  */
    public static RequestBuilder<BaseSyndicationFeed> get(String id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<BaseSyndicationFeed>(BaseSyndicationFeed.class, "syndicationfeed", "get", kparams);
    }

	/**  get entry count for a syndication feed  */
    public static RequestBuilder<SyndicationFeedEntryCount> getEntryCount(String feedId)  {
        Params kparams = new Params();
        kparams.add("feedId", feedId);

        return new RequestBuilder<SyndicationFeedEntryCount>(SyndicationFeedEntryCount.class, "syndicationfeed", "getEntryCount", kparams);
    }

    public static RequestBuilder<ListResponse<BaseSyndicationFeed>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<BaseSyndicationFeed>> list(BaseSyndicationFeedFilter filter)  {
        return list(filter, null);
    }

	/**  List Syndication Feeds by filter with paging support  */
    public static RequestBuilder<ListResponse<BaseSyndicationFeed>> list(BaseSyndicationFeedFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<BaseSyndicationFeed>(BaseSyndicationFeed.class, "syndicationfeed", "list", kparams);
    }

	/**  request conversion for all entries that doesnt have the required flavor param  
	  returns a comma-separated ids of conversion jobs  */
    public static RequestBuilder<String> requestConversion(String feedId)  {
        Params kparams = new Params();
        kparams.add("feedId", feedId);

        return new RequestBuilder<String>(String.class, "syndicationfeed", "requestConversion", kparams);
    }

	/**  Update Syndication Feed by ID  */
    public static RequestBuilder<BaseSyndicationFeed> update(String id, BaseSyndicationFeed syndicationFeed)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("syndicationFeed", syndicationFeed);

        return new RequestBuilder<BaseSyndicationFeed>(BaseSyndicationFeed.class, "syndicationfeed", "update", kparams);
    }
}
