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
// Copyright (C) 2006-2020  Kaltura Inc.
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

import com.kaltura.client.types.Interactivity;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class InteractivityService {
	
	public static class AddInteractivityBuilder extends RequestBuilder<Interactivity, Interactivity.Tokenizer, AddInteractivityBuilder> {
		
		public AddInteractivityBuilder(String entryId, Interactivity kalturaInteractivity) {
			super(Interactivity.class, "interactivity_interactivity", "add");
			params.add("entryId", entryId);
			params.add("kalturaInteractivity", kalturaInteractivity);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Add a interactivity object
	 * 
	 * @param entryId 
	 * @param kalturaInteractivity 
	 */
    public static AddInteractivityBuilder add(String entryId, Interactivity kalturaInteractivity)  {
		return new AddInteractivityBuilder(entryId, kalturaInteractivity);
	}
	
	public static class DeleteInteractivityBuilder extends NullRequestBuilder {
		
		public DeleteInteractivityBuilder(String entryId) {
			super("interactivity_interactivity", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a interactivity object by entry id
	 * 
	 * @param entryId 
	 */
    public static DeleteInteractivityBuilder delete(String entryId)  {
		return new DeleteInteractivityBuilder(entryId);
	}
	
	public static class GetInteractivityBuilder extends RequestBuilder<Interactivity, Interactivity.Tokenizer, GetInteractivityBuilder> {
		
		public GetInteractivityBuilder(String entryId) {
			super(Interactivity.class, "interactivity_interactivity", "get");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Retrieve a interactivity object by entry id
	 * 
	 * @param entryId 
	 */
    public static GetInteractivityBuilder get(String entryId)  {
		return new GetInteractivityBuilder(entryId);
	}
	
	public static class UpdateInteractivityBuilder extends RequestBuilder<Interactivity, Interactivity.Tokenizer, UpdateInteractivityBuilder> {
		
		public UpdateInteractivityBuilder(String entryId, int version, Interactivity kalturaInteractivity) {
			super(Interactivity.class, "interactivity_interactivity", "update");
			params.add("entryId", entryId);
			params.add("version", version);
			params.add("kalturaInteractivity", kalturaInteractivity);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	/**
	 * Update an existing interactivity object
	 * 
	 * @param entryId 
	 * @param version 
	 * @param kalturaInteractivity 
	 */
    public static UpdateInteractivityBuilder update(String entryId, int version, Interactivity kalturaInteractivity)  {
		return new UpdateInteractivityBuilder(entryId, version, kalturaInteractivity);
	}
}
