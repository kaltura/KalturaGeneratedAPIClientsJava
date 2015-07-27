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
 * @date Mon, 27 Jul 15 12:55:52 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Distribution Profile service    */
@SuppressWarnings("serial")
public class KalturaDistributionProfileService extends KalturaServiceBase {
    public KalturaDistributionProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Distribution Profile     */
    public KalturaDistributionProfile add(KalturaDistributionProfile distributionProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("distributionProfile", distributionProfile);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "add", kparams, KalturaDistributionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfile.class, resultXmlElement);
    }

	/**  Get Distribution Profile by id     */
    public KalturaDistributionProfile get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "get", kparams, KalturaDistributionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfile.class, resultXmlElement);
    }

	/**  Update Distribution Profile by id     */
    public KalturaDistributionProfile update(int id, KalturaDistributionProfile distributionProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("distributionProfile", distributionProfile);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "update", kparams, KalturaDistributionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfile.class, resultXmlElement);
    }

	/**  Update Distribution Profile status by id     */
    public KalturaDistributionProfile updateStatus(int id, KalturaDistributionProfileStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "updateStatus", kparams, KalturaDistributionProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfile.class, resultXmlElement);
    }

	/**  Delete Distribution Profile by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaDistributionProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaDistributionProfileListResponse list(KalturaDistributionProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public KalturaDistributionProfileListResponse list(KalturaDistributionProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "list", kparams, KalturaDistributionProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfileListResponse.class, resultXmlElement);
    }

    public KalturaDistributionProfileListResponse listByPartner() throws KalturaApiException {
        return this.listByPartner(null);
    }

    public KalturaDistributionProfileListResponse listByPartner(KalturaPartnerFilter filter) throws KalturaApiException {
        return this.listByPartner(filter, null);
    }

    public KalturaDistributionProfileListResponse listByPartner(KalturaPartnerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("contentdistribution_distributionprofile", "listByPartner", kparams, KalturaDistributionProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaDistributionProfileListResponse.class, resultXmlElement);
    }
}
