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
 * @date Sun, 29 Mar 15 09:55:04 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  partner service allows you to change/manage your partner personal details and
  settings as well    */
@SuppressWarnings("serial")
public class KalturaPartnerService extends KalturaServiceBase {
    public KalturaPartnerService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaPartner register(KalturaPartner partner) throws KalturaApiException {
        return this.register(partner, "");
    }

    public KalturaPartner register(KalturaPartner partner, String cmsPassword) throws KalturaApiException {
        return this.register(partner, cmsPassword, Integer.MIN_VALUE);
    }

    public KalturaPartner register(KalturaPartner partner, String cmsPassword, int templatePartnerId) throws KalturaApiException {
        return this.register(partner, cmsPassword, templatePartnerId, false);
    }

	/**  Create a new Partner object     */
    public KalturaPartner register(KalturaPartner partner, String cmsPassword, int templatePartnerId, boolean silent) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partner", partner);
        kparams.add("cmsPassword", cmsPassword);
        kparams.add("templatePartnerId", templatePartnerId);
        kparams.add("silent", silent);
        this.kalturaClient.queueServiceCall("partner", "register", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

    public KalturaPartner update(KalturaPartner partner) throws KalturaApiException {
        return this.update(partner, false);
    }

	/**  Update details and settings of an existing partner     */
    public KalturaPartner update(KalturaPartner partner, boolean allowEmpty) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partner", partner);
        kparams.add("allowEmpty", allowEmpty);
        this.kalturaClient.queueServiceCall("partner", "update", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

    public KalturaPartner get() throws KalturaApiException {
        return this.get(Integer.MIN_VALUE);
    }

	/**  Retrieve partner object by Id     */
    public KalturaPartner get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("partner", "get", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

	/**  Retrieve partner secret and admin secret     */
    public KalturaPartner getSecrets(int partnerId, String adminEmail, String cmsPassword) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerId", partnerId);
        kparams.add("adminEmail", adminEmail);
        kparams.add("cmsPassword", cmsPassword);
        this.kalturaClient.queueServiceCall("partner", "getSecrets", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

	/**  Retrieve all info attributed to the partner   This action expects no parameters.
	  It returns information for the current KS partnerId.     */
    public KalturaPartner getInfo() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("partner", "getInfo", kparams, KalturaPartner.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartner.class, resultXmlElement);
    }

    public KalturaPartnerUsage getUsage() throws KalturaApiException {
        return this.getUsage();
    }

    public KalturaPartnerUsage getUsage(int year) throws KalturaApiException {
        return this.getUsage(year, 1);
    }

    public KalturaPartnerUsage getUsage(int year, int month) throws KalturaApiException {
        return this.getUsage(year, month, null);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package   Additional data returned is a graph points of streaming usage in a
	  timeframe   The resolution can be "days" or "months"     */
    public KalturaPartnerUsage getUsage(int year, int month, KalturaReportInterval resolution) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("year", year);
        kparams.add("month", month);
        kparams.add("resolution", resolution);
        this.kalturaClient.queueServiceCall("partner", "getUsage", kparams, KalturaPartnerUsage.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerUsage.class, resultXmlElement);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package     */
    public KalturaPartnerStatistics getStatistics() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("partner", "getStatistics", kparams, KalturaPartnerStatistics.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerStatistics.class, resultXmlElement);
    }

    public KalturaPartnerListResponse listPartnersForUser() throws KalturaApiException {
        return this.listPartnersForUser(null);
    }

    public KalturaPartnerListResponse listPartnersForUser(KalturaPartnerFilter partnerFilter) throws KalturaApiException {
        return this.listPartnersForUser(partnerFilter, null);
    }

	/**  Retrieve a list of partner objects which the current user is allowed to access. 
	     */
    public KalturaPartnerListResponse listPartnersForUser(KalturaPartnerFilter partnerFilter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("partner", "listPartnersForUser", kparams, KalturaPartnerListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerListResponse.class, resultXmlElement);
    }

    public KalturaPartnerListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaPartnerListResponse list(KalturaPartnerFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List partners by filter with paging support   Current implementation will only
	  list the sub partners of the partner initiating the api call (using the current
	  KS).   This action is only partially implemented to support listing sub partners
	  of a VAR partner.     */
    public KalturaPartnerListResponse list(KalturaPartnerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("partner", "list", kparams, KalturaPartnerListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaPartnerListResponse.class, resultXmlElement);
    }

	/**  List partner's current processes' statuses     */
    public KalturaFeatureStatusListResponse listFeatureStatus() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("partner", "listFeatureStatus", kparams, KalturaFeatureStatusListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFeatureStatusListResponse.class, resultXmlElement);
    }

    public int count() throws KalturaApiException {
        return this.count(null);
    }

	/**  Count partner's existing sub-publishers (count includes the partner itself).     */
    public int count(KalturaPartnerFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("partner", "count", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }
}
