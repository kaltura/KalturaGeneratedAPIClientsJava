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

import com.kaltura.client.types.StringValue;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PexipService {
	
	public static class GenerateSipUrlPexipBuilder extends RequestBuilder<String, String, GenerateSipUrlPexipBuilder> {
		
		public GenerateSipUrlPexipBuilder(String entryId, boolean regenerate, int sourceType) {
			super(String.class, "sip_pexip", "generateSipUrl");
			params.add("entryId", entryId);
			params.add("regenerate", regenerate);
			params.add("sourceType", sourceType);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void regenerate(String multirequestToken) {
			params.add("regenerate", multirequestToken);
		}
		
		public void sourceType(String multirequestToken) {
			params.add("sourceType", multirequestToken);
		}
	}

	public static GenerateSipUrlPexipBuilder generateSipUrl(String entryId)  {
		return generateSipUrl(entryId, false);
	}

	public static GenerateSipUrlPexipBuilder generateSipUrl(String entryId, boolean regenerate)  {
		return generateSipUrl(entryId, regenerate, 1);
	}

    public static GenerateSipUrlPexipBuilder generateSipUrl(String entryId, boolean regenerate, int sourceType)  {
		return new GenerateSipUrlPexipBuilder(entryId, regenerate, sourceType);
	}
	
	public static class HandleIncomingCallPexipBuilder extends NullRequestBuilder {
		
		public HandleIncomingCallPexipBuilder() {
			super("sip_pexip", "handleIncomingCall");
		}
	}

    public static HandleIncomingCallPexipBuilder handleIncomingCall()  {
		return new HandleIncomingCallPexipBuilder();
	}
	
	public static class ListRoomsPexipBuilder extends ArrayRequestBuilder<StringValue, StringValue.Tokenizer, ListRoomsPexipBuilder> {
		
		public ListRoomsPexipBuilder(int offset, int pageSize, boolean activeOnly) {
			super(StringValue.class, "sip_pexip", "listRooms");
			params.add("offset", offset);
			params.add("pageSize", pageSize);
			params.add("activeOnly", activeOnly);
		}
		
		public void offset(String multirequestToken) {
			params.add("offset", multirequestToken);
		}
		
		public void pageSize(String multirequestToken) {
			params.add("pageSize", multirequestToken);
		}
		
		public void activeOnly(String multirequestToken) {
			params.add("activeOnly", multirequestToken);
		}
	}

	public static ListRoomsPexipBuilder listRooms()  {
		return listRooms(0);
	}

	public static ListRoomsPexipBuilder listRooms(int offset)  {
		return listRooms(offset, 500);
	}

	public static ListRoomsPexipBuilder listRooms(int offset, int pageSize)  {
		return listRooms(offset, pageSize, false);
	}

    public static ListRoomsPexipBuilder listRooms(int offset, int pageSize, boolean activeOnly)  {
		return new ListRoomsPexipBuilder(offset, pageSize, activeOnly);
	}
}
