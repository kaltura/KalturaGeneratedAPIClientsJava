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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.types.*;
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 11 May 15 00:20:09 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Utility service for the Multi-publishers console    */
@SuppressWarnings("serial")
public class KalturaVarConsoleService extends KalturaServiceBase {
    public KalturaVarConsoleService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaPartnerUsageListResponse getPartnerUsage() throws KalturaApiException {
        return this.getPartnerUsage(null);
    }

    public KalturaPartnerUsageListResponse getPartnerUsage(KalturaPartnerFilter partnerFilter) throws KalturaApiException {
        return this.getPartnerUsage(partnerFilter, null);
    }

    public KalturaPartnerUsageListResponse getPartnerUsage(KalturaPartnerFilter partnerFilter, KalturaReportInputFilter usageFilter) throws KalturaApiException {
        return this.getPartnerUsage(partnerFilter, usageFilter, null);
    }

	/**  Function which calulates partner usage of a group of a VAR's sub-publishers     
	    */
    public KalturaPartnerUsageListResponse getPartnerUsage(KalturaPartnerFilter partnerFilter, KalturaReportInputFilter usageFilter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("usageFilter", usageFilter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("varconsole_varconsole", "getPartnerUsage", kparams, KalturaPartnerUsageListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerUsageListResponse.class, resultXmlElement);
    }

	/**  Function to change a sub-publisher's status     */
    public void updateStatus(int id, KalturaPartnerStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("varconsole_varconsole", "updateStatus", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
