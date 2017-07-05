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
// Copyright (C) 2006-2017  Kaltura Inc.
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

import com.kaltura.client.Params;
import com.kaltura.client.enums.PartnerStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.types.ReportInputFilter;
import com.kaltura.client.types.VarPartnerUsageItem;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Utility service for the Multi-publishers console  */
public class VarConsoleService {

    public static RequestBuilder<ListResponse<VarPartnerUsageItem>> getPartnerUsage()  {
        return getPartnerUsage(null);
    }

    public static RequestBuilder<ListResponse<VarPartnerUsageItem>> getPartnerUsage(PartnerFilter partnerFilter)  {
        return getPartnerUsage(partnerFilter, null);
    }

    public static RequestBuilder<ListResponse<VarPartnerUsageItem>> getPartnerUsage(PartnerFilter partnerFilter, ReportInputFilter usageFilter)  {
        return getPartnerUsage(partnerFilter, usageFilter, null);
    }

	/**  Function which calulates partner usage of a group of a VAR's sub-publishers  */
    public static RequestBuilder<ListResponse<VarPartnerUsageItem>> getPartnerUsage(PartnerFilter partnerFilter, ReportInputFilter usageFilter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("usageFilter", usageFilter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<VarPartnerUsageItem>(VarPartnerUsageItem.class, "varconsole_varconsole", "getPartnerUsage", kparams);
    }

	/**  Function to change a sub-publisher's status  */
    public static RequestBuilder<Void> updateStatus(int id, PartnerStatus status)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("status", status);

        return new NullRequestBuilder("varconsole_varconsole", "updateStatus", kparams);
    }
}
