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

import com.kaltura.client.types.RatingCount;
import com.kaltura.client.types.RatingCountFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Allows user to manipulate their entry rating
 * 
 * @param entryId 
 * @param filter 
 * @param entryId 
 * @param rank 
 * @param entryId 
 */
public class RatingService {
	
	public static class CheckRatingRatingBuilder extends RequestBuilder<Integer, String, CheckRatingRatingBuilder> {
		
		public CheckRatingRatingBuilder(String entryId) {
			super(Integer.class, "rating_rating", "checkRating");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

    public static CheckRatingRatingBuilder checkRating(String entryId)  {
		return new CheckRatingRatingBuilder(entryId);
	}
	
	public static class GetRatingCountsRatingBuilder extends ListResponseRequestBuilder<RatingCount, RatingCount.Tokenizer, GetRatingCountsRatingBuilder> {
		
		public GetRatingCountsRatingBuilder(RatingCountFilter filter) {
			super(RatingCount.class, "rating_rating", "getRatingCounts");
			params.add("filter", filter);
		}
	}

    public static GetRatingCountsRatingBuilder getRatingCounts(RatingCountFilter filter)  {
		return new GetRatingCountsRatingBuilder(filter);
	}
	
	public static class RateRatingBuilder extends RequestBuilder<Integer, String, RateRatingBuilder> {
		
		public RateRatingBuilder(String entryId, int rank) {
			super(Integer.class, "rating_rating", "rate");
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

    public static RateRatingBuilder rate(String entryId, int rank)  {
		return new RateRatingBuilder(entryId, rank);
	}
	
	public static class RemoveRatingRatingBuilder extends RequestBuilder<Boolean, String, RemoveRatingRatingBuilder> {
		
		public RemoveRatingRatingBuilder(String entryId) {
			super(Boolean.class, "rating_rating", "removeRating");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

    public static RemoveRatingRatingBuilder removeRating(String entryId)  {
		return new RemoveRatingRatingBuilder(entryId);
	}
}
