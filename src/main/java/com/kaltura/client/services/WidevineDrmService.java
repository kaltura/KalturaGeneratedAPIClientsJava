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

import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * WidevineDrmService serves as a license proxy to a Widevine license server
 * 
 * @param flavorAssetId 
 * @param referrer 64base encoded
 */
public class WidevineDrmService {
	
	public static class GetLicenseWidevineDrmBuilder extends RequestBuilder<String, String, GetLicenseWidevineDrmBuilder> {
		
		public GetLicenseWidevineDrmBuilder(String flavorAssetId, String referrer) {
			super(String.class, "widevine_widevinedrm", "getLicense");
			params.add("flavorAssetId", flavorAssetId);
			params.add("referrer", referrer);
		}
		
		public void flavorAssetId(String multirequestToken) {
			params.add("flavorAssetId", multirequestToken);
		}
		
		public void referrer(String multirequestToken) {
			params.add("referrer", multirequestToken);
		}
	}

	public static GetLicenseWidevineDrmBuilder getLicense(String flavorAssetId)  {
		return getLicense(flavorAssetId, null);
	}

	/**
	 * Get license for encrypted content playback
	 * 
	 * @param flavorAssetId 
	 * @param referrer 64base encoded
	 */
    public static GetLicenseWidevineDrmBuilder getLicense(String flavorAssetId, String referrer)  {
		return new GetLicenseWidevineDrmBuilder(flavorAssetId, referrer);
	}
}
