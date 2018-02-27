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
// Copyright (C) 2006-2018  Kaltura Inc.
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

import com.kaltura.client.types.DrmLicenseAccessDetails;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Retrieve information and invoke actions on Flavor Asset
 * 
 * @param entryId 
 * @param flavorIds 
 * @param referrer 
 */
public class DrmLicenseAccessService {
	
	public static class GetAccessDrmLicenseAccessBuilder extends RequestBuilder<DrmLicenseAccessDetails, DrmLicenseAccessDetails.Tokenizer, GetAccessDrmLicenseAccessBuilder> {
		
		public GetAccessDrmLicenseAccessBuilder(String entryId, String flavorIds, String referrer) {
			super(DrmLicenseAccessDetails.class, "drm_drmlicenseaccess", "getAccess");
			params.add("entryId", entryId);
			params.add("flavorIds", flavorIds);
			params.add("referrer", referrer);
		}
		
		public void entryId(String multirequestToken) {
			params.add("entryId", multirequestToken);
		}
		
		public void flavorIds(String multirequestToken) {
			params.add("flavorIds", multirequestToken);
		}
		
		public void referrer(String multirequestToken) {
			params.add("referrer", multirequestToken);
		}
	}

	/**
	 * getAccessAction      input: flavor ids, drmProvider      Get Access Action
	 * 
	 * @param entryId 
	 * @param flavorIds 
	 * @param referrer 
	 */
    public static GetAccessDrmLicenseAccessBuilder getAccess(String entryId, String flavorIds, String referrer)  {
		return new GetAccessDrmLicenseAccessBuilder(entryId, flavorIds, referrer);
	}
}
