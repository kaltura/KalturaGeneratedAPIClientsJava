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

import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Tag;
import com.kaltura.client.types.TagFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Search object tags
 * 
 * @param categoryId 
 * @param pcToDecrement 
 * @param pcToIncrement 
 * @param tagFilter 
 * @param pager 
 */
public class TagService {
	
	public static class DeletePendingTagBuilder extends RequestBuilder<Integer, String, DeletePendingTagBuilder> {
		
		public DeletePendingTagBuilder() {
			super(Integer.class, "tagsearch_tag", "deletePending");
		}
	}

	/**
	 * Action goes over all tags with instanceCount==0 and checks whether they need to
	  be removed from the DB. Returns number of removed tags.
	 */
    public static DeletePendingTagBuilder deletePending()  {
		return new DeletePendingTagBuilder();
	}
	
	public static class IndexCategoryEntryTagsTagBuilder extends NullRequestBuilder {
		
		public IndexCategoryEntryTagsTagBuilder(int categoryId, String pcToDecrement, String pcToIncrement) {
			super("tagsearch_tag", "indexCategoryEntryTags");
			params.add("categoryId", categoryId);
			params.add("pcToDecrement", pcToDecrement);
			params.add("pcToIncrement", pcToIncrement);
		}
		
		public void categoryId(String multirequestToken) {
			params.add("categoryId", multirequestToken);
		}
		
		public void pcToDecrement(String multirequestToken) {
			params.add("pcToDecrement", multirequestToken);
		}
		
		public void pcToIncrement(String multirequestToken) {
			params.add("pcToIncrement", multirequestToken);
		}
	}

    public static IndexCategoryEntryTagsTagBuilder indexCategoryEntryTags(int categoryId, String pcToDecrement, String pcToIncrement)  {
		return new IndexCategoryEntryTagsTagBuilder(categoryId, pcToDecrement, pcToIncrement);
	}
	
	public static class SearchTagBuilder extends ListResponseRequestBuilder<Tag, Tag.Tokenizer, SearchTagBuilder> {
		
		public SearchTagBuilder(TagFilter tagFilter, FilterPager pager) {
			super(Tag.class, "tagsearch_tag", "search");
			params.add("tagFilter", tagFilter);
			params.add("pager", pager);
		}
	}

	public static SearchTagBuilder search(TagFilter tagFilter)  {
		return search(tagFilter, null);
	}

    public static SearchTagBuilder search(TagFilter tagFilter, FilterPager pager)  {
		return new SearchTagBuilder(tagFilter, pager);
	}
}
