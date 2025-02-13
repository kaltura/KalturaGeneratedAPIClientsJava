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

import com.kaltura.client.types.Bumper;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class BumperService {
	
	public static class AddBumperBuilder extends RequestBuilder<Bumper, Bumper.Tokenizer, AddBumperBuilder> {
		
		public AddBumperBuilder(String entryId, Bumper bumper) {
			super(Bumper.class, "bumper_bumper", "add");
			params.add("entryId", entryId);
			params.add("bumper", bumper);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Adds a bumper to an entry
	 * 
	 * @param entryId 
	 * @param bumper 
	 */
    public static AddBumperBuilder add(String entryId, Bumper bumper)  {
		return new AddBumperBuilder(entryId, bumper);
	}
	
	public static class DeleteBumperBuilder extends RequestBuilder<Bumper, Bumper.Tokenizer, DeleteBumperBuilder> {
		
		public DeleteBumperBuilder(String entryId) {
			super(Bumper.class, "bumper_bumper", "delete");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Delete bumper by EntryId
	 * 
	 * @param entryId 
	 */
    public static DeleteBumperBuilder delete(String entryId)  {
		return new DeleteBumperBuilder(entryId);
	}
	
	public static class GetBumperBuilder extends RequestBuilder<Bumper, Bumper.Tokenizer, GetBumperBuilder> {
		
		public GetBumperBuilder(String entryId) {
			super(Bumper.class, "bumper_bumper", "get");
			params.add("entryId", entryId);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Allows to get the bumper
	 * 
	 * @param entryId 
	 */
    public static GetBumperBuilder get(String entryId)  {
		return new GetBumperBuilder(entryId);
	}
	
	public static class UpdateBumperBuilder extends RequestBuilder<Bumper, Bumper.Tokenizer, UpdateBumperBuilder> {
		
		public UpdateBumperBuilder(String entryId, Bumper bumper) {
			super(Bumper.class, "bumper_bumper", "update");
			params.add("entryId", entryId);
			params.add("bumper", bumper);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
	}

	/**
	 * Allows to update a bumper
	 * 
	 * @param entryId 
	 * @param bumper 
	 */
    public static UpdateBumperBuilder update(String entryId, Bumper bumper)  {
		return new UpdateBumperBuilder(entryId, bumper);
	}
}
