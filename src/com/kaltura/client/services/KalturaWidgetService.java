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
 * @date Sun, 28 Jun 15 00:10:34 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  widget service for full widget management    */
@SuppressWarnings("serial")
public class KalturaWidgetService extends KalturaServiceBase {
    public KalturaWidgetService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new widget, can be attached to entry or kshow   SourceWidget is ignored.     */
    public KalturaWidget add(KalturaWidget widget) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("widget", widget);
        this.kalturaClient.queueServiceCall("widget", "add", kparams, KalturaWidget.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaWidget.class, resultXmlElement);
    }

	/**  Update exisiting widget      */
    public KalturaWidget update(String id, KalturaWidget widget) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("widget", widget);
        this.kalturaClient.queueServiceCall("widget", "update", kparams, KalturaWidget.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaWidget.class, resultXmlElement);
    }

	/**  Get widget by id     */
    public KalturaWidget get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("widget", "get", kparams, KalturaWidget.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaWidget.class, resultXmlElement);
    }

	/**  Add widget based on existing widget.   Must provide valid sourceWidgetId     */
    public KalturaWidget clone(KalturaWidget widget) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("widget", widget);
        this.kalturaClient.queueServiceCall("widget", "clone", kparams, KalturaWidget.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaWidget.class, resultXmlElement);
    }

    public KalturaWidgetListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaWidgetListResponse list(KalturaWidgetFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  Retrieve a list of available widget depends on the filter given     */
    public KalturaWidgetListResponse list(KalturaWidgetFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("widget", "list", kparams, KalturaWidgetListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaWidgetListResponse.class, resultXmlElement);
    }
}
