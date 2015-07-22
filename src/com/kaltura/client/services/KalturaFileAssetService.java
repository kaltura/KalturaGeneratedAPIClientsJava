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
 * @date Wed, 22 Jul 15 00:34:41 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage file assets    */
@SuppressWarnings("serial")
public class KalturaFileAssetService extends KalturaServiceBase {
    public KalturaFileAssetService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new file asset     */
    public KalturaFileAsset add(KalturaFileAsset fileAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("fileAsset", fileAsset);
        this.kalturaClient.queueServiceCall("fileasset", "add", kparams, KalturaFileAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFileAsset.class, resultXmlElement);
    }

	/**  Get file asset by id     */
    public KalturaFileAsset get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("fileasset", "get", kparams, KalturaFileAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFileAsset.class, resultXmlElement);
    }

	/**  Update file asset by id     */
    public KalturaFileAsset update(int id, KalturaFileAsset fileAsset) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("fileAsset", fileAsset);
        this.kalturaClient.queueServiceCall("fileasset", "update", kparams, KalturaFileAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFileAsset.class, resultXmlElement);
    }

	/**  Delete file asset by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("fileasset", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

	/**  Serve file asset by id     */
    public String serve(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("fileasset", "serve", kparams);
        return this.kalturaClient.serve();
    }

	/**  Set content of file asset        */
    public KalturaFileAsset setContent(String id, KalturaContentResource contentResource) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("contentResource", contentResource);
        this.kalturaClient.queueServiceCall("fileasset", "setContent", kparams, KalturaFileAsset.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFileAsset.class, resultXmlElement);
    }

    public KalturaFileAssetListResponse list(KalturaFileAssetFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List file assets by filter and pager     */
    public KalturaFileAssetListResponse list(KalturaFileAssetFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("fileasset", "list", kparams, KalturaFileAssetListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaFileAssetListResponse.class, resultXmlElement);
    }
}
