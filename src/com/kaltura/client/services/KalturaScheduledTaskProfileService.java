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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Thu, 30 Jul 15 07:27:25 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Schedule task service lets you create and manage scheduled task profiles    */
@SuppressWarnings("serial")
public class KalturaScheduledTaskProfileService extends KalturaServiceBase {
    public KalturaScheduledTaskProfileService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add a new scheduled task profile     */
    public KalturaScheduledTaskProfile add(KalturaScheduledTaskProfile scheduledTaskProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "add", kparams, KalturaScheduledTaskProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Retrieve a scheduled task profile by id     */
    public KalturaScheduledTaskProfile get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "get", kparams, KalturaScheduledTaskProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Update an existing scheduled task profile     */
    public KalturaScheduledTaskProfile update(int id, KalturaScheduledTaskProfile scheduledTaskProfile) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("scheduledTaskProfile", scheduledTaskProfile);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "update", kparams, KalturaScheduledTaskProfile.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduledTaskProfile.class, resultXmlElement);
    }

	/**  Delete a scheduled task profile     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaScheduledTaskProfileListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaScheduledTaskProfileListResponse list(KalturaScheduledTaskProfileFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List scheduled task profiles     */
    public KalturaScheduledTaskProfileListResponse list(KalturaScheduledTaskProfileFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "list", kparams, KalturaScheduledTaskProfileListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaScheduledTaskProfileListResponse.class, resultXmlElement);
    }

    public int requestDryRun(int scheduledTaskProfileId) throws KalturaApiException {
        return this.requestDryRun(scheduledTaskProfileId, 500);
    }

    public int requestDryRun(int scheduledTaskProfileId, int maxResults) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("scheduledTaskProfileId", scheduledTaskProfileId);
        kparams.add("maxResults", maxResults);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "requestDryRun", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public KalturaObjectListResponse getDryRunResults(int requestId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("requestId", requestId);
        this.kalturaClient.queueServiceCall("scheduledtask_scheduledtaskprofile", "getDryRunResults", kparams, KalturaObjectListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaObjectListResponse.class, resultXmlElement);
    }
}
