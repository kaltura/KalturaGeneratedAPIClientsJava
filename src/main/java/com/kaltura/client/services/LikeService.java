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
import com.kaltura.client.types.Like;
import com.kaltura.client.types.LikeFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Allows user to 'like' or 'unlike' and entry  */
public class LikeService {
	
	public static class CheckLikeExistsLikeBuilder extends RequestBuilder<Boolean, String, CheckLikeExistsLikeBuilder> {
		
		public CheckLikeExistsLikeBuilder(String entryId, String userId) {
			super(Boolean.class, "like_like", "checkLikeExists");
			params.add("entryId", entryId);
			params.add("userId", userId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	public static CheckLikeExistsLikeBuilder checkLikeExists(String entryId)  {
		return checkLikeExists(entryId, null);
	}

    public static CheckLikeExistsLikeBuilder checkLikeExists(String entryId, String userId)  {
		return new CheckLikeExistsLikeBuilder(entryId, userId);
	}
	
	public static class LikeLikeBuilder extends RequestBuilder<Boolean, String, LikeLikeBuilder> {
		
		public LikeLikeBuilder(String entryId) {
			super(Boolean.class, "like_like", "like");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

    public static LikeLikeBuilder like(String entryId)  {
		return new LikeLikeBuilder(entryId);
	}
	
	public static class ListLikeBuilder extends ListResponseRequestBuilder<Like, Like.Tokenizer, ListLikeBuilder> {
		
		public ListLikeBuilder(LikeFilter filter, FilterPager pager) {
			super(Like.class, "like_like", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListLikeBuilder list()  {
		return list(null);
	}

	public static ListLikeBuilder list(LikeFilter filter)  {
		return list(filter, null);
	}

    public static ListLikeBuilder list(LikeFilter filter, FilterPager pager)  {
		return new ListLikeBuilder(filter, pager);
	}
	
	public static class UnlikeLikeBuilder extends RequestBuilder<Boolean, String, UnlikeLikeBuilder> {
		
		public UnlikeLikeBuilder(String entryId) {
			super(Boolean.class, "like_like", "unlike");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

    public static UnlikeLikeBuilder unlike(String entryId)  {
		return new UnlikeLikeBuilder(entryId);
	}
}
