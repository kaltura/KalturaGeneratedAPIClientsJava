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
import com.kaltura.client.enums.*;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Wed, 02 Sep 15 01:07:21 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Live Channel service lets you manage live channels    */
@SuppressWarnings("serial")
public class KalturaLiveChannelService extends KalturaServiceBase {
    public KalturaLiveChannelService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds new live channel.     */
    public KalturaLiveChannel add(KalturaLiveChannel liveChannel) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("liveChannel", liveChannel);
        this.kalturaClient.queueServiceCall("livechannel", "add", kparams, KalturaLiveChannel.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannel.class, resultXmlElement);
    }

	/**  Get live channel by ID.     */
    public KalturaLiveChannel get(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livechannel", "get", kparams, KalturaLiveChannel.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannel.class, resultXmlElement);
    }

	/**  Update live channel. Only the properties that were set will be updated.     */
    public KalturaLiveChannel update(String id, KalturaLiveChannel liveChannel) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        kparams.add("liveChannel", liveChannel);
        this.kalturaClient.queueServiceCall("livechannel", "update", kparams, KalturaLiveChannel.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannel.class, resultXmlElement);
    }

	/**  Delete a live channel.     */
    public void delete(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livechannel", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaLiveChannelListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaLiveChannelListResponse list(KalturaLiveChannelFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List live channels by filter with paging support.     */
    public KalturaLiveChannelListResponse list(KalturaLiveChannelFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("livechannel", "list", kparams, KalturaLiveChannelListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveChannelListResponse.class, resultXmlElement);
    }

	/**  Delivering the status of a live channel (on-air/offline)     */
    public boolean isLive(String id) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("id", id);
        this.kalturaClient.queueServiceCall("livechannel", "isLive", kparams);
        if (this.kalturaClient.isMultiRequest())
            return false;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseBool(resultText);
    }

    public KalturaLiveEntry appendRecording(String entryId, String assetId, KalturaMediaServerIndex mediaServerIndex, KalturaDataCenterContentResource resource, double duration) throws KalturaApiException {
        return this.appendRecording(entryId, assetId, mediaServerIndex, resource, duration, false);
    }

	/**  Append recorded video to live entry     */
    public KalturaLiveEntry appendRecording(String entryId, String assetId, KalturaMediaServerIndex mediaServerIndex, KalturaDataCenterContentResource resource, double duration, boolean isLastChunk) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("assetId", assetId);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("resource", resource);
        kparams.add("duration", duration);
        kparams.add("isLastChunk", isLastChunk);
        this.kalturaClient.queueServiceCall("livechannel", "appendRecording", kparams, KalturaLiveEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveEntry.class, resultXmlElement);
    }

    public KalturaLiveEntry registerMediaServer(String entryId, String hostname, KalturaMediaServerIndex mediaServerIndex) throws KalturaApiException {
        return this.registerMediaServer(entryId, hostname, mediaServerIndex, null);
    }

	/**  Register media server to live entry     */
    public KalturaLiveEntry registerMediaServer(String entryId, String hostname, KalturaMediaServerIndex mediaServerIndex, String applicationName) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        kparams.add("applicationName", applicationName);
        this.kalturaClient.queueServiceCall("livechannel", "registerMediaServer", kparams, KalturaLiveEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveEntry.class, resultXmlElement);
    }

	/**  Unregister media server from live entry     */
    public KalturaLiveEntry unregisterMediaServer(String entryId, String hostname, KalturaMediaServerIndex mediaServerIndex) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("hostname", hostname);
        kparams.add("mediaServerIndex", mediaServerIndex);
        this.kalturaClient.queueServiceCall("livechannel", "unregisterMediaServer", kparams, KalturaLiveEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaLiveEntry.class, resultXmlElement);
    }

	/**  Validates all registered media servers     */
    public void validateRegisteredMediaServers(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("livechannel", "validateRegisteredMediaServers", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
