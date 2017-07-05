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
import com.kaltura.client.types.Tag;
import com.kaltura.client.types.TagFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search object tags  */
public class TagService {

	/**  Action goes over all tags with instanceCount==0 and checks whether they need to
	  be removed from the DB. Returns number of removed tags.  */
    public static RequestBuilder<Integer> deletePending()  {
        Params kparams = new Params();

        return new RequestBuilder<Integer>(Integer.class, "tagsearch_tag", "deletePending", kparams);
    }

    public static RequestBuilder<Void> indexCategoryEntryTags(int categoryId, String pcToDecrement, String pcToIncrement)  {
        Params kparams = new Params();
        kparams.add("categoryId", categoryId);
        kparams.add("pcToDecrement", pcToDecrement);
        kparams.add("pcToIncrement", pcToIncrement);

        return new NullRequestBuilder("tagsearch_tag", "indexCategoryEntryTags", kparams);
    }

    public static RequestBuilder<ListResponse<Tag>> search(TagFilter tagFilter)  {
        return search(tagFilter, null);
    }

    public static RequestBuilder<ListResponse<Tag>> search(TagFilter tagFilter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("tagFilter", tagFilter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Tag>(Tag.class, "tagsearch_tag", "search", kparams);
    }
}
