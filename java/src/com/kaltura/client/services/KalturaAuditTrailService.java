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
// Copyright (C) 2006-2011  Kaltura Inc.
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
 * @date Tue, 16 Dec 14 10:44:09 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Audit Trail service    */
@SuppressWarnings("serial")
public class KalturaAuditTrailService extends KalturaServiceBase {
    public KalturaAuditTrailService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Allows you to add an audit trail object and audit trail content associated with
	  Kaltura object     */
    public KalturaAuditTrail add(KalturaAuditTrail auditTrail) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("auditTrail", auditTrail);
        this.kalturaClient.queueServiceCall("audit_audittrail", "add", kparams, KalturaAuditTrail.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAuditTrail.class, resultXmlElement);
    }

	/**  Retrieve an audit trail object by id     */
    public KalturaAuditTrail get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("audit_audittrail", "get", kparams, KalturaAuditTrail.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAuditTrail.class, resultXmlElement);
    }

    public KalturaAuditTrailListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaAuditTrailListResponse list(KalturaAuditTrailFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List audit trail objects by filter and pager     */
    public KalturaAuditTrailListResponse list(KalturaAuditTrailFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("audit_audittrail", "list", kparams, KalturaAuditTrailListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaAuditTrailListResponse.class, resultXmlElement);
    }
}
