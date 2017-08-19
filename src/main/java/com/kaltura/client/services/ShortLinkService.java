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
import com.kaltura.client.types.ShortLink;
import com.kaltura.client.types.ShortLinkFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Short link service  */
public class ShortLinkService {
	
	public static class AddShortLinkBuilder extends RequestBuilder<ShortLink, ShortLink.Tokenizer, AddShortLinkBuilder> {
		
		public AddShortLinkBuilder(ShortLink shortLink) {
			super(ShortLink.class, "shortlink_shortlink", "add");
			params.add("shortLink", shortLink);
		}
	}

	/**  Allows you to add a short link object  */
    public static AddShortLinkBuilder add(ShortLink shortLink)  {
		return new AddShortLinkBuilder(shortLink);
	}
	
	public static class DeleteShortLinkBuilder extends RequestBuilder<ShortLink, ShortLink.Tokenizer, DeleteShortLinkBuilder> {
		
		public DeleteShortLinkBuilder(String id) {
			super(ShortLink.class, "shortlink_shortlink", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Mark the short link as deleted  */
    public static DeleteShortLinkBuilder delete(String id)  {
		return new DeleteShortLinkBuilder(id);
	}
	
	public static class GetShortLinkBuilder extends RequestBuilder<ShortLink, ShortLink.Tokenizer, GetShortLinkBuilder> {
		
		public GetShortLinkBuilder(String id) {
			super(ShortLink.class, "shortlink_shortlink", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Retrieve an short link object by id  */
    public static GetShortLinkBuilder get(String id)  {
		return new GetShortLinkBuilder(id);
	}
	
	public static class GotoShortLinkBuilder extends ServeRequestBuilder {
		
		public GotoShortLinkBuilder(String id, boolean proxy) {
			super("shortlink_shortlink", "goto");
			params.add("id", id);
			params.add("proxy", proxy);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void proxy(String multirequestToken) {
			params.add("proxy", multirequestToken);
		}
	}

	public static GotoShortLinkBuilder goto_(String id)  {
		return goto_(id, false);
	}

	/**  Serves short link  */
    public static GotoShortLinkBuilder goto_(String id, boolean proxy)  {
		return new GotoShortLinkBuilder(id, proxy);
	}
	
	public static class ListShortLinkBuilder extends ListResponseRequestBuilder<ShortLink, ShortLink.Tokenizer, ListShortLinkBuilder> {
		
		public ListShortLinkBuilder(ShortLinkFilter filter, FilterPager pager) {
			super(ShortLink.class, "shortlink_shortlink", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListShortLinkBuilder list()  {
		return list(null);
	}

	public static ListShortLinkBuilder list(ShortLinkFilter filter)  {
		return list(filter, null);
	}

	/**  List short link objects by filter and pager  */
    public static ListShortLinkBuilder list(ShortLinkFilter filter, FilterPager pager)  {
		return new ListShortLinkBuilder(filter, pager);
	}
	
	public static class UpdateShortLinkBuilder extends RequestBuilder<ShortLink, ShortLink.Tokenizer, UpdateShortLinkBuilder> {
		
		public UpdateShortLinkBuilder(String id, ShortLink shortLink) {
			super(ShortLink.class, "shortlink_shortlink", "update");
			params.add("id", id);
			params.add("shortLink", shortLink);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**  Update exisitng short link  */
    public static UpdateShortLinkBuilder update(String id, ShortLink shortLink)  {
		return new UpdateShortLinkBuilder(id, shortLink);
	}
}
