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
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 13 May 15 00:22:53 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Flavor Params    */
@SuppressWarnings("serial")
public class KalturaFlavorParamsService extends KalturaServiceBase {
    public KalturaFlavorParamsService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Flavor Params     */
    public KalturaFlavorParams add(KalturaFlavorParams flavorParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("flavorParams", flavorParams);
        this.kalturaClient.queueServiceCall("flavorparams", "add", kparams, KalturaFlavorParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFlavorParams.class, resultXmlElement);
    }

	/**  Get Flavor Params by ID     */
    public KalturaFlavorParams get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("flavorparams", "get", kparams, KalturaFlavorParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFlavorParams.class, resultXmlElement);
    }

	/**  Update Flavor Params by ID     */
    public KalturaFlavorParams update(int id, KalturaFlavorParams flavorParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("flavorParams", flavorParams);
        this.kalturaClient.queueServiceCall("flavorparams", "update", kparams, KalturaFlavorParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFlavorParams.class, resultXmlElement);
    }

	/**  Delete Flavor Params by ID     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("flavorparams", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaFlavorParamsListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaFlavorParamsListResponse list(KalturaFlavorParamsFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Flavor Params by filter with paging support (By default - all system
	  default params will be listed too)     */
    public KalturaFlavorParamsListResponse list(KalturaFlavorParamsFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("flavorparams", "list", kparams, KalturaFlavorParamsListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFlavorParamsListResponse.class, resultXmlElement);
    }

	/**  Get Flavor Params by Conversion Profile ID     */
    public List<KalturaFlavorParams> getByConversionProfileId(int conversionProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("conversionProfileId", conversionProfileId);
        this.kalturaClient.queueServiceCall("flavorparams", "getByConversionProfileId", kparams, KalturaFlavorParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaFlavorParams.class, resultXmlElement);
    }
}
