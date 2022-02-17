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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.types.VirusScanProfile;
import com.kaltura.client.types.VirusScanProfileFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Virus scan profile service
 * 
 * @param virusScanProfile 
 * @param virusScanProfileId 
 * @param virusScanProfileId 
 * @param filter 
 * @param pager 
 * @param flavorAssetId 
 * @param virusScanProfileId 
 * @param virusScanProfileId 
 * @param virusScanProfile Id
 */
public class VirusScanProfileService {
	
	public static class AddVirusScanProfileBuilder extends RequestBuilder<VirusScanProfile, VirusScanProfile.Tokenizer, AddVirusScanProfileBuilder> {
		
		public AddVirusScanProfileBuilder(VirusScanProfile virusScanProfile) {
			super(VirusScanProfile.class, "virusscan_virusscanprofile", "add");
			params.add("virusScanProfile", virusScanProfile);
		}
	}

	/**
	 * Allows you to add an virus scan profile object and virus scan profile content
	  associated with Kaltura object
	 * 
	 * @param virusScanProfile 
	 */
    public static AddVirusScanProfileBuilder add(VirusScanProfile virusScanProfile)  {
		return new AddVirusScanProfileBuilder(virusScanProfile);
	}
	
	public static class DeleteVirusScanProfileBuilder extends RequestBuilder<VirusScanProfile, VirusScanProfile.Tokenizer, DeleteVirusScanProfileBuilder> {
		
		public DeleteVirusScanProfileBuilder(int virusScanProfileId) {
			super(VirusScanProfile.class, "virusscan_virusscanprofile", "delete");
			params.add("virusScanProfileId", virusScanProfileId);
		}
		
		public void virusScanProfileId(String multirequestToken) {
			params.add("virusScanProfileId", multirequestToken);
		}
	}

	/**
	 * Mark the virus scan profile as deleted
	 * 
	 * @param virusScanProfileId 
	 */
    public static DeleteVirusScanProfileBuilder delete(int virusScanProfileId)  {
		return new DeleteVirusScanProfileBuilder(virusScanProfileId);
	}
	
	public static class GetVirusScanProfileBuilder extends RequestBuilder<VirusScanProfile, VirusScanProfile.Tokenizer, GetVirusScanProfileBuilder> {
		
		public GetVirusScanProfileBuilder(int virusScanProfileId) {
			super(VirusScanProfile.class, "virusscan_virusscanprofile", "get");
			params.add("virusScanProfileId", virusScanProfileId);
		}
		
		public void virusScanProfileId(String multirequestToken) {
			params.add("virusScanProfileId", multirequestToken);
		}
	}

	/**
	 * Retrieve an virus scan profile object by id
	 * 
	 * @param virusScanProfileId 
	 */
    public static GetVirusScanProfileBuilder get(int virusScanProfileId)  {
		return new GetVirusScanProfileBuilder(virusScanProfileId);
	}
	
	public static class ListVirusScanProfileBuilder extends ListResponseRequestBuilder<VirusScanProfile, VirusScanProfile.Tokenizer, ListVirusScanProfileBuilder> {
		
		public ListVirusScanProfileBuilder(VirusScanProfileFilter filter, FilterPager pager) {
			super(VirusScanProfile.class, "virusscan_virusscanprofile", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListVirusScanProfileBuilder list()  {
		return list(null);
	}

	public static ListVirusScanProfileBuilder list(VirusScanProfileFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List virus scan profile objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListVirusScanProfileBuilder list(VirusScanProfileFilter filter, FilterPager pager)  {
		return new ListVirusScanProfileBuilder(filter, pager);
	}
	
	public static class ScanVirusScanProfileBuilder extends RequestBuilder<Integer, String, ScanVirusScanProfileBuilder> {
		
		public ScanVirusScanProfileBuilder(String flavorAssetId, int virusScanProfileId) {
			super(Integer.class, "virusscan_virusscanprofile", "scan");
			params.add("flavorAssetId", flavorAssetId);
			params.add("virusScanProfileId", virusScanProfileId);
		}
		
		public void flavorAssetId(String multirequestToken) {
			params.add("flavorAssetId", multirequestToken);
		}
		
		public void virusScanProfileId(String multirequestToken) {
			params.add("virusScanProfileId", multirequestToken);
		}
	}

	public static ScanVirusScanProfileBuilder scan(String flavorAssetId)  {
		return scan(flavorAssetId, Integer.MIN_VALUE);
	}

	/**
	 * Scan flavor asset according to virus scan profile
	 * 
	 * @param flavorAssetId 
	 * @param virusScanProfileId 
	 */
    public static ScanVirusScanProfileBuilder scan(String flavorAssetId, int virusScanProfileId)  {
		return new ScanVirusScanProfileBuilder(flavorAssetId, virusScanProfileId);
	}
	
	public static class UpdateVirusScanProfileBuilder extends RequestBuilder<VirusScanProfile, VirusScanProfile.Tokenizer, UpdateVirusScanProfileBuilder> {
		
		public UpdateVirusScanProfileBuilder(int virusScanProfileId, VirusScanProfile virusScanProfile) {
			super(VirusScanProfile.class, "virusscan_virusscanprofile", "update");
			params.add("virusScanProfileId", virusScanProfileId);
			params.add("virusScanProfile", virusScanProfile);
		}
		
		public void virusScanProfileId(String multirequestToken) {
			params.add("virusScanProfileId", multirequestToken);
		}
	}

	/**
	 * Update existing virus scan profile, it is possible to update the virus scan
	  profile id too
	 * 
	 * @param virusScanProfileId 
	 * @param virusScanProfile Id
	 */
    public static UpdateVirusScanProfileBuilder update(int virusScanProfileId, VirusScanProfile virusScanProfile)  {
		return new UpdateVirusScanProfileBuilder(virusScanProfileId, virusScanProfile);
	}
}
