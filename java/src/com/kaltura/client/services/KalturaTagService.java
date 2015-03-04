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
 * @date Wed, 04 Mar 15 09:11:44 -0500
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Search object tags    */
@SuppressWarnings("serial")
public class KalturaTagService extends KalturaServiceBase {
    public KalturaTagService(KalturaClient client) {
        this.kalturaClient = client;
    }

    public KalturaTagListResponse search(KalturaTagFilter tagFilter) throws KalturaApiException {
        return this.search(tagFilter, null);
    }

    public KalturaTagListResponse search(KalturaTagFilter tagFilter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("tagFilter", tagFilter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("tagsearch_tag", "search", kparams, KalturaTagListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaTagListResponse.class, resultXmlElement);
    }

	/**  Action goes over all tags with instanceCount==0 and checks whether they need to
	  be removed from the DB. Returns number of removed tags.        */
    public int deletePending() throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        this.kalturaClient.queueServiceCall("tagsearch_tag", "deletePending", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

    public void indexCategoryEntryTags(int categoryId, String pcToDecrement, String pcToIncrement) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("categoryId", categoryId);
        kparams.add("pcToDecrement", pcToDecrement);
        kparams.add("pcToIncrement", pcToIncrement);
        this.kalturaClient.queueServiceCall("tagsearch_tag", "indexCategoryEntryTags", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
