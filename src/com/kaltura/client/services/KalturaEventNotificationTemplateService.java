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
 * @date Mon, 27 Apr 15 13:11:14 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Event notification template service lets you create and manage event
  notification templates    */
@SuppressWarnings("serial")
public class KalturaEventNotificationTemplateService extends KalturaServiceBase {
    public KalturaEventNotificationTemplateService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add a new event notification template object     */
    public KalturaEventNotificationTemplate add(KalturaEventNotificationTemplate eventNotificationTemplate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "add", kparams, KalturaEventNotificationTemplate.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplate.class, resultXmlElement);
    }

    public KalturaEventNotificationTemplate clone(int id) throws KalturaApiException {
        return this.clone(id, null);
    }

	/**  Allows you to clone exiting event notification template object and create a new
	  one with similar configuration     */
    public KalturaEventNotificationTemplate clone(int id, KalturaEventNotificationTemplate eventNotificationTemplate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "clone", kparams, KalturaEventNotificationTemplate.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Retrieve an event notification template object by id     */
    public KalturaEventNotificationTemplate get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "get", kparams, KalturaEventNotificationTemplate.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Update an existing event notification template object     */
    public KalturaEventNotificationTemplate update(int id, KalturaEventNotificationTemplate eventNotificationTemplate) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("eventNotificationTemplate", eventNotificationTemplate);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "update", kparams, KalturaEventNotificationTemplate.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Update event notification template status by id     */
    public KalturaEventNotificationTemplate updateStatus(int id, KalturaEventNotificationTemplateStatus status) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("status", status);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "updateStatus", kparams, KalturaEventNotificationTemplate.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplate.class, resultXmlElement);
    }

	/**  Delete an event notification template object     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaEventNotificationTemplateListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaEventNotificationTemplateListResponse list(KalturaEventNotificationTemplateFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  list event notification template objects     */
    public KalturaEventNotificationTemplateListResponse list(KalturaEventNotificationTemplateFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "list", kparams, KalturaEventNotificationTemplateListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplateListResponse.class, resultXmlElement);
    }

    public KalturaEventNotificationTemplateListResponse listByPartner() throws KalturaApiException {
        return this.listByPartner(null);
    }

    public KalturaEventNotificationTemplateListResponse listByPartner(KalturaPartnerFilter filter) throws KalturaApiException {
        return this.listByPartner(filter, null);
    }

    public KalturaEventNotificationTemplateListResponse listByPartner(KalturaPartnerFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "listByPartner", kparams, KalturaEventNotificationTemplateListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplateListResponse.class, resultXmlElement);
    }

	/**  Dispatch event notification object by id     */
    public int dispatch(int id, KalturaEventNotificationScope scope) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("scope", scope);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "dispatch", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public KalturaEventNotificationTemplateListResponse listTemplates() throws KalturaApiException {
        return this.listTemplates(null);
    }

    public KalturaEventNotificationTemplateListResponse listTemplates(KalturaEventNotificationTemplateFilter filter) throws KalturaApiException {
        return this.listTemplates(filter, null);
    }

	/**  Action lists the template partner event notification templates.     */
    public KalturaEventNotificationTemplateListResponse listTemplates(KalturaEventNotificationTemplateFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("eventnotification_eventnotificationtemplate", "listTemplates", kparams, KalturaEventNotificationTemplateListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaEventNotificationTemplateListResponse.class, resultXmlElement);
    }
}
