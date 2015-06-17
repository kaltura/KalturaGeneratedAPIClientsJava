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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 17 Jun 15 00:23:42 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  System partner service    */
@SuppressWarnings("serial")
public class KalturaSystemPartnerService extends KalturaServiceBase {
    public KalturaSystemPartnerService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Retrieve all info about partner   This service gets partner id as parameter and
	  accessable to the admin console partner only     */
    public KalturaPartner get(int partnerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "get", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

    public KalturaSystemPartnerUsageListResponse getUsage() throws KalturaApiException {
        return this.getUsage(null);
    }

    public KalturaSystemPartnerUsageListResponse getUsage(KalturaPartnerFilter partnerFilter) throws KalturaApiException {
        return this.getUsage(partnerFilter, null);
    }

    public KalturaSystemPartnerUsageListResponse getUsage(KalturaPartnerFilter partnerFilter, KalturaSystemPartnerUsageFilter usageFilter) throws KalturaApiException {
        return this.getUsage(partnerFilter, usageFilter, null);
    }

    public KalturaSystemPartnerUsageListResponse getUsage(KalturaPartnerFilter partnerFilter, KalturaSystemPartnerUsageFilter usageFilter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("usageFilter", usageFilter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getUsage", kparams, KalturaSystemPartnerUsageListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSystemPartnerUsageListResponse.class, resultXmlElement);
    }

    public KalturaPartnerListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaPartnerListResponse list(KalturaPartnerFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

    public KalturaPartnerListResponse list(KalturaPartnerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "list", kparams, KalturaPartnerListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerListResponse.class, resultXmlElement);
    }

    public void updateStatus(int partnerId, KalturaPartnerStatus status, String reason) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        kparams.add("status", status);
        kparams.add("reason", reason);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "updateStatus", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public String getAdminSession(int partnerId) throws KalturaApiException {
        return this.getAdminSession(partnerId, null);
    }

    public String getAdminSession(int partnerId, String userId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        kparams.add("userId", userId);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getAdminSession", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }

    public void updateConfiguration(int partnerId, KalturaSystemPartnerConfiguration configuration) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        kparams.add("configuration", configuration);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "updateConfiguration", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaSystemPartnerConfiguration getConfiguration(int partnerId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getConfiguration", kparams, KalturaSystemPartnerConfiguration.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaSystemPartnerConfiguration.class, resultXmlElement);
    }

    public List<KalturaSystemPartnerPackage> getPackages() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getPackages", kparams, KalturaSystemPartnerPackage.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaSystemPartnerPackage.class, resultXmlElement);
    }

    public List<KalturaSystemPartnerPackage> getPackagesClassOfService() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getPackagesClassOfService", kparams, KalturaSystemPartnerPackage.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaSystemPartnerPackage.class, resultXmlElement);
    }

    public List<KalturaSystemPartnerPackage> getPackagesVertical() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getPackagesVertical", kparams, KalturaSystemPartnerPackage.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaSystemPartnerPackage.class, resultXmlElement);
    }

    public List<KalturaPlayerEmbedCodeType> getPlayerEmbedCodeTypes() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getPlayerEmbedCodeTypes", kparams, KalturaPlayerEmbedCodeType.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaPlayerEmbedCodeType.class, resultXmlElement);
    }

    public List<KalturaPlayerDeliveryType> getPlayerDeliveryTypes() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "getPlayerDeliveryTypes", kparams, KalturaPlayerDeliveryType.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaPlayerDeliveryType.class, resultXmlElement);
    }

    public void resetUserPassword(String userId, int partnerId, String newPassword) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("userId", userId);
        kparams.add("partnerId", partnerId);
        kparams.add("newPassword", newPassword);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "resetUserPassword", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaUserLoginDataListResponse listUserLoginData() throws KalturaApiException {
        return this.listUserLoginData(null);
    }

    public KalturaUserLoginDataListResponse listUserLoginData(KalturaUserLoginDataFilter filter) throws KalturaApiException {
        return this.listUserLoginData(filter, null);
    }

    public KalturaUserLoginDataListResponse listUserLoginData(KalturaUserLoginDataFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("systempartner_systempartner", "listUserLoginData", kparams, KalturaUserLoginDataListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaUserLoginDataListResponse.class, resultXmlElement);
    }
}
