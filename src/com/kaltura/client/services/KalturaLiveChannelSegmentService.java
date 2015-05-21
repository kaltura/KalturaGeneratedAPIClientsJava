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
 * @date Thu, 21 May 15 07:32:20 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Manage live channel segments    */
@SuppressWarnings("serial")
public class KalturaLiveChannelSegmentService extends KalturaServiceBase {
    public KalturaLiveChannelSegmentService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Add new live channel segment     */
    public KalturaLiveChannelSegment add(KalturaLiveChannelSegment liveChannelSegment) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("liveChannelSegment", liveChannelSegment);
        this.kalturaClient.queueServiceCall("livechannelsegment", "add", kparams, KalturaLiveChannelSegment.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannelSegment.class, resultXmlElement);
    }

	/**  Get live channel segment by id     */
    public KalturaLiveChannelSegment get(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livechannelsegment", "get", kparams, KalturaLiveChannelSegment.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannelSegment.class, resultXmlElement);
    }

	/**  Update live channel segment by id     */
    public KalturaLiveChannelSegment update(int id, KalturaLiveChannelSegment liveChannelSegment) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("liveChannelSegment", liveChannelSegment);
        this.kalturaClient.queueServiceCall("livechannelsegment", "update", kparams, KalturaLiveChannelSegment.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannelSegment.class, resultXmlElement);
    }

	/**  Delete live channel segment by id     */
    public void delete(int id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livechannelsegment", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaLiveChannelSegmentListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaLiveChannelSegmentListResponse list(KalturaLiveChannelSegmentFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List live channel segments by filter and pager     */
    public KalturaLiveChannelSegmentListResponse list(KalturaLiveChannelSegmentFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("livechannelsegment", "list", kparams, KalturaLiveChannelSegmentListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannelSegmentListResponse.class, resultXmlElement);
    }
}
