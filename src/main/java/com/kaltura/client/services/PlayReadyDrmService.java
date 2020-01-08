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

import com.kaltura.client.types.PlayReadyContentKey;
import com.kaltura.client.types.PlayReadyLicenseDetails;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PlayReadyDrmService {
	
	public static class GenerateKeyPlayReadyDrmBuilder extends RequestBuilder<PlayReadyContentKey, PlayReadyContentKey.Tokenizer, GenerateKeyPlayReadyDrmBuilder> {
		
		public GenerateKeyPlayReadyDrmBuilder() {
			super(PlayReadyContentKey.class, "playready_playreadydrm", "generateKey");
		}
	}

	/**
	 * Generate key id and content key for PlayReady encryption
	 */
    public static GenerateKeyPlayReadyDrmBuilder generateKey()  {
		return new GenerateKeyPlayReadyDrmBuilder();
	}
	
	public static class GetContentKeysPlayReadyDrmBuilder extends ArrayRequestBuilder<PlayReadyContentKey, PlayReadyContentKey.Tokenizer, GetContentKeysPlayReadyDrmBuilder> {
		
		public GetContentKeysPlayReadyDrmBuilder(String keyIds) {
			super(PlayReadyContentKey.class, "playready_playreadydrm", "getContentKeys");
			params.add("keyIds", keyIds);
		}
		
		public void keyIds(String multirequestToken) {
			params.add("keyIds", multirequestToken);
		}
	}

	/**
	 * Get content keys for input key ids
	 * 
	 * @param keyIds - comma separated key id's
	 */
    public static GetContentKeysPlayReadyDrmBuilder getContentKeys(String keyIds)  {
		return new GetContentKeysPlayReadyDrmBuilder(keyIds);
	}
	
	public static class GetEntryContentKeyPlayReadyDrmBuilder extends RequestBuilder<PlayReadyContentKey, PlayReadyContentKey.Tokenizer, GetEntryContentKeyPlayReadyDrmBuilder> {
		
		public GetEntryContentKeyPlayReadyDrmBuilder(String entryId, boolean createIfMissing) {
			super(PlayReadyContentKey.class, "playready_playreadydrm", "getEntryContentKey");
			params.add("entryId", entryId);
			params.add("createIfMissing", createIfMissing);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void createIfMissing(String multirequestToken) {
			params.add("createIfMissing", multirequestToken);
		}
	}

	public static GetEntryContentKeyPlayReadyDrmBuilder getEntryContentKey(String entryId)  {
		return getEntryContentKey(entryId, false);
	}

	/**
	 * Get content key and key id for the given entry
	 * 
	 * @param entryId 
	 * @param createIfMissing 
	 */
    public static GetEntryContentKeyPlayReadyDrmBuilder getEntryContentKey(String entryId, boolean createIfMissing)  {
		return new GetEntryContentKeyPlayReadyDrmBuilder(entryId, createIfMissing);
	}
	
	public static class GetLicenseDetailsPlayReadyDrmBuilder extends RequestBuilder<PlayReadyLicenseDetails, PlayReadyLicenseDetails.Tokenizer, GetLicenseDetailsPlayReadyDrmBuilder> {
		
		public GetLicenseDetailsPlayReadyDrmBuilder(String keyId, String deviceId, int deviceType, String entryId, String referrer) {
			super(PlayReadyLicenseDetails.class, "playready_playreadydrm", "getLicenseDetails");
			params.add("keyId", keyId);
			params.add("deviceId", deviceId);
			params.add("deviceType", deviceType);
			params.add("entryId", entryId);
			params.add("referrer", referrer);
		}
		
		public void keyId(String multirequestToken) {
			params.add("keyId", multirequestToken);
		}
		
		public void deviceId(String multirequestToken) {
			params.add("deviceId", multirequestToken);
		}
		
		public void deviceType(String multirequestToken) {
			params.add("deviceType", multirequestToken);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void referrer(String multirequestToken) {
			params.add("referrer", multirequestToken);
		}
	}

	public static GetLicenseDetailsPlayReadyDrmBuilder getLicenseDetails(String keyId, String deviceId, int deviceType)  {
		return getLicenseDetails(keyId, deviceId, deviceType, null);
	}

	public static GetLicenseDetailsPlayReadyDrmBuilder getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId)  {
		return getLicenseDetails(keyId, deviceId, deviceType, entryId, null);
	}

	/**
	 * Get Play Ready policy and dates for license creation
	 * 
	 * @param keyId 
	 * @param deviceId 
	 * @param deviceType 
	 * @param entryId 
	 * @param referrer 64base encoded
	 */
    public static GetLicenseDetailsPlayReadyDrmBuilder getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId, String referrer)  {
		return new GetLicenseDetailsPlayReadyDrmBuilder(keyId, deviceId, deviceType, entryId, referrer);
	}
}
