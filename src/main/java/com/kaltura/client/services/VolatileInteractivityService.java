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

import com.kaltura.client.types.VolatileInteractivity;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class VolatileInteractivityService {
	
	public static class AddVolatileInteractivityBuilder extends RequestBuilder<VolatileInteractivity, VolatileInteractivity.Tokenizer, AddVolatileInteractivityBuilder> {
		
		public AddVolatileInteractivityBuilder(String entryId, VolatileInteractivity kalturaVolatileInteractivity) {
			super(VolatileInteractivity.class, "interactivity_volatileinteractivity", "add");
			params.add("entryId", entryId);
			params.add("kalturaVolatileInteractivity", kalturaVolatileInteractivity);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * add a volatile interactivity object
	 * 
	 * @param entryId 
	 * @param kalturaVolatileInteractivity 
	 */
    public static AddVolatileInteractivityBuilder add(String entryId, VolatileInteractivity kalturaVolatileInteractivity)  {
		return new AddVolatileInteractivityBuilder(entryId, kalturaVolatileInteractivity);
	}
	
	public static class DeleteVolatileInteractivityBuilder extends NullRequestBuilder {
		
		public DeleteVolatileInteractivityBuilder(String entryId) {
			super("interactivity_volatileinteractivity", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete a volatile interactivity object by entry id
	 * 
	 * @param entryId 
	 */
    public static DeleteVolatileInteractivityBuilder delete(String entryId)  {
		return new DeleteVolatileInteractivityBuilder(entryId);
	}
	
	public static class GetVolatileInteractivityBuilder extends RequestBuilder<VolatileInteractivity, VolatileInteractivity.Tokenizer, GetVolatileInteractivityBuilder> {
		
		public GetVolatileInteractivityBuilder(String entryId) {
			super(VolatileInteractivity.class, "interactivity_volatileinteractivity", "get");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Retrieve a volatile interactivity object by entry id
	 * 
	 * @param entryId 
	 */
    public static GetVolatileInteractivityBuilder get(String entryId)  {
		return new GetVolatileInteractivityBuilder(entryId);
	}
	
	public static class UpdateVolatileInteractivityBuilder extends RequestBuilder<VolatileInteractivity, VolatileInteractivity.Tokenizer, UpdateVolatileInteractivityBuilder> {
		
		public UpdateVolatileInteractivityBuilder(String entryId, int version, VolatileInteractivity kalturaVolatileInteractivity) {
			super(VolatileInteractivity.class, "interactivity_volatileinteractivity", "update");
			params.add("entryId", entryId);
			params.add("version", version);
			params.add("kalturaVolatileInteractivity", kalturaVolatileInteractivity);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void version(String multirequestToken) {
			params.add("version", multirequestToken);
		}
	}

	/**
	 * Update a volatile interactivity object
	 * 
	 * @param entryId 
	 * @param version 
	 * @param kalturaVolatileInteractivity 
	 */
    public static UpdateVolatileInteractivityBuilder update(String entryId, int version, VolatileInteractivity kalturaVolatileInteractivity)  {
		return new UpdateVolatileInteractivityBuilder(entryId, version, kalturaVolatileInteractivity);
	}
}
