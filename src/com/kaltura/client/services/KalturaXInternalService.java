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
import org.w3c.dom.Element;
import com.kaltura.client.utils.ParseUtils;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Mon, 27 Jul 15 12:00:30 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Internal Service is used for actions that are used internally in Kaltura
  applications and might be changed in the future without any notice.    */
@SuppressWarnings("serial")
public class KalturaXInternalService extends KalturaServiceBase {
    public KalturaXInternalService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public String xAddBulkDownload(String entryIds) throws KalturaApiException {
        return this.xAddBulkDownload(entryIds, "");
    }

	/**  Creates new download job for multiple entry ids (comma separated), an email will
	  be sent when the job is done   This sevice support the following entries:    -
	  MediaEntry   - Video will be converted using the flavor params id   - Audio will
	  be downloaded as MP3   - Image will be downloaded as Jpeg   - MixEntry will be
	  flattened using the flavor params id   - Other entry types are not supported  
	  Returns the admin email that the email message will be sent to      */
    public String xAddBulkDownload(String entryIds, String flavorParamsId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryIds", entryIds);
        kparams.add("flavorParamsId", flavorParamsId);
        this.kalturaClient.queueServiceCall("xinternal", "xAddBulkDownload", kparams);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseString(resultText);
    }
}
