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

import com.kaltura.client.enums.KeyManagementPolicyObjectType;
import com.kaltura.client.types.KeyManagementPolicy;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class KeyManagementPolicyService {
	
	public static class GetKeyManagementPolicyBuilder extends RequestBuilder<KeyManagementPolicy, KeyManagementPolicy.Tokenizer, GetKeyManagementPolicyBuilder> {
		
		public GetKeyManagementPolicyBuilder(KeyManagementPolicyObjectType objectType, String objectId) {
			super(KeyManagementPolicy.class, "drm_keymanagementpolicy", "get");
			params.add("objectType", objectType);
			params.add("objectId", objectId);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
	}

    public static GetKeyManagementPolicyBuilder get(KeyManagementPolicyObjectType objectType, String objectId)  {
		return new GetKeyManagementPolicyBuilder(objectType, objectId);
	}
	
	public static class UpdateKeyManagementPolicyBuilder extends RequestBuilder<KeyManagementPolicy, KeyManagementPolicy.Tokenizer, UpdateKeyManagementPolicyBuilder> {
		
		public UpdateKeyManagementPolicyBuilder(KeyManagementPolicyObjectType objectType, String objectId, KeyManagementPolicy keyManagementPolicy) {
			super(KeyManagementPolicy.class, "drm_keymanagementpolicy", "update");
			params.add("objectType", objectType);
			params.add("objectId", objectId);
			params.add("keyManagementPolicy", keyManagementPolicy);
		}
		
		public void objectType(String multirequestToken) {
			params.add("objectType", multirequestToken);
		}
		
		public void objectId(String multirequestToken) {
			params.add("objectId", multirequestToken);
		}
	}

    public static UpdateKeyManagementPolicyBuilder update(KeyManagementPolicyObjectType objectType, String objectId, KeyManagementPolicy keyManagementPolicy)  {
		return new UpdateKeyManagementPolicyBuilder(objectType, objectId, keyManagementPolicy);
	}
}
