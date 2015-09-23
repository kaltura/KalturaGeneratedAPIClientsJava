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
 * @date Wed, 23 Sep 15 00:46:01 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Add & Manage Thumb Params    */
@SuppressWarnings("serial")
public class KalturaThumbParamsService extends KalturaServiceBase {
    public KalturaThumbParamsService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new Thumb Params     */
    public KalturaThumbParams add(KalturaThumbParams thumbParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("thumbParams", thumbParams);
        this.kalturaClient.queueServiceCall("thumbparams", "add", kparams, KalturaThumbParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbParams.class, resultXmlElement);
    }

	/**  Get Thumb Params by ID     */
    public KalturaThumbParams get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("thumbparams", "get", kparams, KalturaThumbParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbParams.class, resultXmlElement);
    }

	/**  Update Thumb Params by ID     */
    public KalturaThumbParams update(int id, KalturaThumbParams thumbParams) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("thumbParams", thumbParams);
        this.kalturaClient.queueServiceCall("thumbparams", "update", kparams, KalturaThumbParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbParams.class, resultXmlElement);
    }

	/**  Delete Thumb Params by ID     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("thumbparams", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaThumbParamsListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaThumbParamsListResponse list(KalturaThumbParamsFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List Thumb Params by filter with paging support (By default - all system default
	  params will be listed too)     */
    public KalturaThumbParamsListResponse list(KalturaThumbParamsFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("thumbparams", "list", kparams, KalturaThumbParamsListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaThumbParamsListResponse.class, resultXmlElement);
    }

	/**  Get Thumb Params by Conversion Profile ID     */
    public List<KalturaThumbParams> getByConversionProfileId(int conversionProfileId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("conversionProfileId", conversionProfileId);
        this.kalturaClient.queueServiceCall("thumbparams", "getByConversionProfileId", kparams, KalturaThumbParams.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaThumbParams.class, resultXmlElement);
    }
}
