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

import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Synacor HBO Service
 * 
 * @param distributionProfileId 
 * @param hash 
 */
public class SynacorHboService {
	
	public static class GetFeedSynacorHboBuilder extends ServeRequestBuilder {
		
		public GetFeedSynacorHboBuilder(int distributionProfileId, String hash) {
			super("synacorhbodistribution_synacorhbo", "getFeed");
			params.add("distributionProfileId", distributionProfileId);
			params.add("hash", hash);
		}
		
		public void distributionProfileId(String multirequestToken) {
			params.add("distributionProfileId", multirequestToken);
		}
		
		public void hash(String multirequestToken) {
			params.add("hash", multirequestToken);
		}
	}

    public static GetFeedSynacorHboBuilder getFeed(int distributionProfileId, String hash)  {
		return new GetFeedSynacorHboBuilder(distributionProfileId, hash);
	}
}
