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

import com.kaltura.client.KalturaClient;
import com.kaltura.client.KalturaServiceBase;
import com.kaltura.client.enums.*;
import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import java.util.List;
import com.kaltura.client.types.*;
import com.kaltura.client.utils.ParseUtils;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Business-process case service lets you get information about processes  */
@SuppressWarnings("serial")
public class KalturaBusinessProcessCaseService extends KalturaServiceBase {
    public KalturaBusinessProcessCaseService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Abort business-process case  */
    public void abort(KalturaEventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("businessProcessStartNotificationTemplateId", businessProcessStartNotificationTemplateId);
        this.kalturaClient.queueServiceCall("businessprocessnotification_businessprocesscase", "abort", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  list business-process cases  */
    public List<KalturaBusinessProcessCase> list(KalturaEventNotificationEventObjectType objectType, String objectId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        this.kalturaClient.queueServiceCall("businessprocessnotification_businessprocesscase", "list", kparams, KalturaBusinessProcessCase.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaBusinessProcessCase.class, resultXmlElement);
    }

	/**  Server business-process case diagram  */
    public String serveDiagram(KalturaEventNotificationEventObjectType objectType, String objectId, int businessProcessStartNotificationTemplateId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("objectType", objectType);
        kparams.add("objectId", objectId);
        kparams.add("businessProcessStartNotificationTemplateId", businessProcessStartNotificationTemplateId);
        this.kalturaClient.queueServiceCall("businessprocessnotification_businessprocesscase", "serveDiagram", kparams);
        return this.kalturaClient.serve();
    }
}
