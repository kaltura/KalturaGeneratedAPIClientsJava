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
 * @date Sun, 24 May 15 00:21:03 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Entry Distribution service    */
@SuppressWarnings("serial")
public class KalturaEntryDistributionService extends KalturaServiceBase {
    public KalturaEntryDistributionService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Entry Distribution     */
    public KalturaEntryDistribution add(KalturaEntryDistribution entryDistribution) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryDistribution", entryDistribution);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "add", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Get Entry Distribution by id     */
    public KalturaEntryDistribution get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "get", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Validates Entry Distribution by id for submission     */
    public KalturaEntryDistribution validate(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "validate", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Update Entry Distribution by id     */
    public KalturaEntryDistribution update(int id, KalturaEntryDistribution entryDistribution) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("entryDistribution", entryDistribution);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "update", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Delete Entry Distribution by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaEntryDistributionListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaEntryDistributionListResponse list(KalturaEntryDistributionFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public KalturaEntryDistributionListResponse list(KalturaEntryDistributionFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "list", kparams, KalturaEntryDistributionListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistributionListResponse.class, resultXmlElement);
    }

    public KalturaEntryDistribution submitAdd(int id) throws KalturaApiException {
        return this.submitAdd(id, false);
    }

	/**  Submits Entry Distribution to the remote destination     */
    public KalturaEntryDistribution submitAdd(int id, boolean submitWhenReady) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("submitWhenReady", submitWhenReady);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "submitAdd", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Submits Entry Distribution changes to the remote destination     */
    public KalturaEntryDistribution submitUpdate(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "submitUpdate", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Submits Entry Distribution report request     */
    public KalturaEntryDistribution submitFetchReport(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "submitFetchReport", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Deletes Entry Distribution from the remote destination     */
    public KalturaEntryDistribution submitDelete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "submitDelete", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Retries last submit action     */
    public KalturaEntryDistribution retrySubmit(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "retrySubmit", kparams, KalturaEntryDistribution.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEntryDistribution.class, resultXmlElement);
    }

	/**  Serves entry distribution sent data     */
    public String serveSentData(int id, KalturaDistributionAction actionType) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("actionType", actionType);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "serveSentData", kparams);
        return this.kalturaClient.serve();
    }

	/**  Serves entry distribution returned data     */
    public String serveReturnedData(int id, KalturaDistributionAction actionType) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("actionType", actionType);
        this.kalturaClient.queueServiceCall("contentdistribution_entrydistribution", "serveReturnedData", kparams);
        return this.kalturaClient.serve();
    }
}
