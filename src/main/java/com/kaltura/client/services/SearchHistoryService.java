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

import com.kaltura.client.types.ESearchHistory;
import com.kaltura.client.types.ESearchHistoryFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class SearchHistoryService {
	
	public static class DeleteSearchHistoryBuilder extends NullRequestBuilder {
		
		public DeleteSearchHistoryBuilder(String searchTerm) {
			super("searchhistory_searchhistory", "delete");
			params.add("searchTerm", searchTerm);
		}
		
		public void searchTerm(String multirequestToken) {
			params.add("searchTerm", multirequestToken);
		}
	}

    public static DeleteSearchHistoryBuilder delete(String searchTerm)  {
		return new DeleteSearchHistoryBuilder(searchTerm);
	}
	
	public static class ListSearchHistoryBuilder extends ListResponseRequestBuilder<ESearchHistory, ESearchHistory.Tokenizer, ListSearchHistoryBuilder> {
		
		public ListSearchHistoryBuilder(ESearchHistoryFilter filter) {
			super(ESearchHistory.class, "searchhistory_searchhistory", "list");
			params.add("filter", filter);
		}
	}

	public static ListSearchHistoryBuilder list()  {
		return list(null);
	}

    public static ListSearchHistoryBuilder list(ESearchHistoryFilter filter)  {
		return new ListSearchHistoryBuilder(filter);
	}
}
