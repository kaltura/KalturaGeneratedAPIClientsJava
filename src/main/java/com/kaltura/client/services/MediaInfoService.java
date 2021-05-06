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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.types.MediaInfo;
import com.kaltura.client.types.MediaInfoFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Media Info service
 * 
 * @param filter 
 * @param pager 
 */
public class MediaInfoService {
	
	public static class ListMediaInfoBuilder extends ListResponseRequestBuilder<MediaInfo, MediaInfo.Tokenizer, ListMediaInfoBuilder> {
		
		public ListMediaInfoBuilder(MediaInfoFilter filter, FilterPager pager) {
			super(MediaInfo.class, "mediainfo", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListMediaInfoBuilder list()  {
		return list(null);
	}

	public static ListMediaInfoBuilder list(MediaInfoFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List media info objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListMediaInfoBuilder list(MediaInfoFilter filter, FilterPager pager)  {
		return new ListMediaInfoBuilder(filter, pager);
	}
}
