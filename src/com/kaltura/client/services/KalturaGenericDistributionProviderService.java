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
 * @date Fri, 19 Jun 15 00:23:29 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Generic Distribution Provider service    */
@SuppressWarnings("serial")
public class KalturaGenericDistributionProviderService extends KalturaServiceBase {
    public KalturaGenericDistributionProviderService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Generic Distribution Provider     */
    public KalturaGenericDistributionProvider add(KalturaGenericDistributionProvider genericDistributionProvider) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("genericDistributionProvider", genericDistributionProvider);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovider", "add", kparams, KalturaGenericDistributionProvider.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Get Generic Distribution Provider by id     */
    public KalturaGenericDistributionProvider get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovider", "get", kparams, KalturaGenericDistributionProvider.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Update Generic Distribution Provider by id     */
    public KalturaGenericDistributionProvider update(int id, KalturaGenericDistributionProvider genericDistributionProvider) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("genericDistributionProvider", genericDistributionProvider);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovider", "update", kparams, KalturaGenericDistributionProvider.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProvider.class, resultXmlElement);
    }

	/**  Delete Generic Distribution Provider by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovider", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaGenericDistributionProviderListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaGenericDistributionProviderListResponse list(KalturaGenericDistributionProviderFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List all distribution providers     */
    public KalturaGenericDistributionProviderListResponse list(KalturaGenericDistributionProviderFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("contentdistribution_genericdistributionprovider", "list", kparams, KalturaGenericDistributionProviderListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaGenericDistributionProviderListResponse.class, resultXmlElement);
    }
}
