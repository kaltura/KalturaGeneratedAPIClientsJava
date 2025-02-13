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

import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.types.ReportInputFilter;
import com.kaltura.client.types.VarPartnerUsageItem;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Utility service for the Multi-publishers console
 * 
 * @param partnerFilter 
 * @param usageFilter 
 * @param pager 
 * @param id 
 * @param status 
 */
public class VarConsoleService {
	
	public static class GetPartnerUsageVarConsoleBuilder extends ListResponseRequestBuilder<VarPartnerUsageItem, VarPartnerUsageItem.Tokenizer, GetPartnerUsageVarConsoleBuilder> {
		
		public GetPartnerUsageVarConsoleBuilder(PartnerFilter partnerFilter, ReportInputFilter usageFilter, FilterPager pager) {
			super(VarPartnerUsageItem.class, "varconsole_varconsole", "getPartnerUsage");
			params.add("partnerFilter", partnerFilter);
			params.add("usageFilter", usageFilter);
			params.add("pager", pager);
		}
	}

	public static GetPartnerUsageVarConsoleBuilder getPartnerUsage()  {
		return getPartnerUsage(null);
	}

	public static GetPartnerUsageVarConsoleBuilder getPartnerUsage(PartnerFilter partnerFilter)  {
		return getPartnerUsage(partnerFilter, null);
	}

	public static GetPartnerUsageVarConsoleBuilder getPartnerUsage(PartnerFilter partnerFilter, ReportInputFilter usageFilter)  {
		return getPartnerUsage(partnerFilter, usageFilter, null);
	}

	/**
	 * Function which calulates partner usage of a group of a VAR's sub-publishers
	 * 
	 * @param partnerFilter 
	 * @param usageFilter 
	 * @param pager 
	 */
    public static GetPartnerUsageVarConsoleBuilder getPartnerUsage(PartnerFilter partnerFilter, ReportInputFilter usageFilter, FilterPager pager)  {
		return new GetPartnerUsageVarConsoleBuilder(partnerFilter, usageFilter, pager);
	}
	
	public static class UpdateStatusVarConsoleBuilder extends NullRequestBuilder {
		
		public UpdateStatusVarConsoleBuilder(int id, PartnerStatus status) {
			super("varconsole_varconsole", "updateStatus");
			params.add("id", id);
			params.add("status", status);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void status(String multirequestToken) {
			params.add("status", multirequestToken);
		}
	}

	/**
	 * Function to change a sub-publisher's status
	 * 
	 * @param id 
	 * @param status 
	 */
    public static UpdateStatusVarConsoleBuilder updateStatus(int id, PartnerStatus status)  {
		return new UpdateStatusVarConsoleBuilder(id, status);
	}
}
