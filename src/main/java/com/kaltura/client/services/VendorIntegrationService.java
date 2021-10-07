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

import com.kaltura.client.types.IntegrationSetting;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class VendorIntegrationService {
	
	public static class AddVendorIntegrationBuilder extends RequestBuilder<IntegrationSetting, IntegrationSetting.Tokenizer, AddVendorIntegrationBuilder> {
		
		public AddVendorIntegrationBuilder(IntegrationSetting integration, String remoteId) {
			super(IntegrationSetting.class, "vendor_vendorintegration", "add");
			params.add("integration", integration);
			params.add("remoteId", remoteId);
		}
		
		public void remoteId(String multirequestToken) {
			params.add("remoteId", multirequestToken);
		}
	}

	/**
	 * Add new integration setting object
	 * 
	 * @param integration 
	 * @param remoteId 
	 */
    public static AddVendorIntegrationBuilder add(IntegrationSetting integration, String remoteId)  {
		return new AddVendorIntegrationBuilder(integration, remoteId);
	}
	
	public static class DeleteVendorIntegrationBuilder extends RequestBuilder<IntegrationSetting, IntegrationSetting.Tokenizer, DeleteVendorIntegrationBuilder> {
		
		public DeleteVendorIntegrationBuilder(int integrationId) {
			super(IntegrationSetting.class, "vendor_vendorintegration", "delete");
			params.add("integrationId", integrationId);
		}
		
		public void integrationId(String multirequestToken) {
			params.add("integrationId", multirequestToken);
		}
	}

	/**
	 * Delete integration object by ID
	 * 
	 * @param integrationId 
	 */
    public static DeleteVendorIntegrationBuilder delete(int integrationId)  {
		return new DeleteVendorIntegrationBuilder(integrationId);
	}
	
	public static class GetVendorIntegrationBuilder extends RequestBuilder<IntegrationSetting, IntegrationSetting.Tokenizer, GetVendorIntegrationBuilder> {
		
		public GetVendorIntegrationBuilder(int integrationId) {
			super(IntegrationSetting.class, "vendor_vendorintegration", "get");
			params.add("integrationId", integrationId);
		}
		
		public void integrationId(String multirequestToken) {
			params.add("integrationId", multirequestToken);
		}
	}

	/**
	 * Retrieve integration setting object by ID
	 * 
	 * @param integrationId 
	 */
    public static GetVendorIntegrationBuilder get(int integrationId)  {
		return new GetVendorIntegrationBuilder(integrationId);
	}
	
	public static class UpdateVendorIntegrationBuilder extends RequestBuilder<IntegrationSetting, IntegrationSetting.Tokenizer, UpdateVendorIntegrationBuilder> {
		
		public UpdateVendorIntegrationBuilder(int id, IntegrationSetting integrationSetting) {
			super(IntegrationSetting.class, "vendor_vendorintegration", "update");
			params.add("id", id);
			params.add("integrationSetting", integrationSetting);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update an existing vedor catalog item object
	 * 
	 * @param id 
	 * @param integrationSetting 
	 */
    public static UpdateVendorIntegrationBuilder update(int id, IntegrationSetting integrationSetting)  {
		return new UpdateVendorIntegrationBuilder(id, integrationSetting);
	}
	
	public static class UpdateStatusVendorIntegrationBuilder extends RequestBuilder<IntegrationSetting, IntegrationSetting.Tokenizer, UpdateStatusVendorIntegrationBuilder> {
		
		public UpdateStatusVendorIntegrationBuilder(int id, IntegrationSetting status) {
			super(IntegrationSetting.class, "vendor_vendorintegration", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update vendor catalog item status by id
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusVendorIntegrationBuilder updateStatus(int id, IntegrationSetting status)  {
		return new UpdateStatusVendorIntegrationBuilder(id, status);
	}
}
