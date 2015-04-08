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
 * @date Wed, 08 Apr 15 00:51:22 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  A Mix is an XML unique format invented by Kaltura, it allows the user to create
  a mix of videos and images, in and out points, transitions, text overlays,
  soundtrack, effects and much more...  Mixing service lets you create a new mix,
  manage its metadata and make basic manipulations.       */
@SuppressWarnings("serial")
public class KalturaMixingService extends KalturaServiceBase {
    public KalturaMixingService(KalturaClient client) {
        this.kalturaClient = client;
    }

	/**  Adds a new mix.   If the dataContent is null, a default timeline will be
	  created.     */
    public KalturaMixEntry add(KalturaMixEntry mixEntry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mixEntry", mixEntry);
        this.kalturaClient.queueServiceCall("mixing", "add", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixEntry.class, resultXmlElement);
    }

    public KalturaMixEntry get(String entryId) throws KalturaApiException {
        return this.get(entryId, -1);
    }

	/**  Get mix entry by id.     */
    public KalturaMixEntry get(String entryId, int version) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("version", version);
        this.kalturaClient.queueServiceCall("mixing", "get", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixEntry.class, resultXmlElement);
    }

	/**  Update mix entry. Only the properties that were set will be updated.     */
    public KalturaMixEntry update(String entryId, KalturaMixEntry mixEntry) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("mixEntry", mixEntry);
        this.kalturaClient.queueServiceCall("mixing", "update", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixEntry.class, resultXmlElement);
    }

	/**  Delete a mix entry.     */
    public void delete(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("mixing", "delete", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }

    public KalturaMixListResponse list() throws KalturaApiException {
        return this.list(null);
    }

    public KalturaMixListResponse list(KalturaMixEntryFilter filter) throws KalturaApiException {
        return this.list(filter, null);
    }

	/**  List entries by filter with paging support.   Return parameter is an array of
	  mix entries.     */
    public KalturaMixListResponse list(KalturaMixEntryFilter filter, KalturaFilterPager pager) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        kparams.add("pager", pager);
        this.kalturaClient.queueServiceCall("mixing", "list", kparams, KalturaMixListResponse.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixListResponse.class, resultXmlElement);
    }

    public int count() throws KalturaApiException {
        return this.count(null);
    }

	/**  Count mix entries by filter.     */
    public int count(KalturaMediaEntryFilter filter) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("filter", filter);
        this.kalturaClient.queueServiceCall("mixing", "count", kparams);
        if (this.kalturaClient.isMultiRequest())
            return 0;
        Element resultXmlElement = this.kalturaClient.doQueue();
        String resultText = resultXmlElement.getTextContent();
        return ParseUtils.parseInt(resultText);
    }

	/**  Clones an existing mix.     */
    public KalturaMixEntry clone(String entryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        this.kalturaClient.queueServiceCall("mixing", "clone", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixEntry.class, resultXmlElement);
    }

	/**  Appends a media entry to a the end of the mix timeline, this will save the mix
	  timeline as a new version.     */
    public KalturaMixEntry appendMediaEntry(String mixEntryId, String mediaEntryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mixEntryId", mixEntryId);
        kparams.add("mediaEntryId", mediaEntryId);
        this.kalturaClient.queueServiceCall("mixing", "appendMediaEntry", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseObject(KalturaMixEntry.class, resultXmlElement);
    }

	/**  Get the mixes in which the media entry is included     */
    public List<KalturaMixEntry> getMixesByMediaId(String mediaEntryId) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mediaEntryId", mediaEntryId);
        this.kalturaClient.queueServiceCall("mixing", "getMixesByMediaId", kparams, KalturaMixEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaMixEntry.class, resultXmlElement);
    }

    public List<KalturaMediaEntry> getReadyMediaEntries(String mixId) throws KalturaApiException {
        return this.getReadyMediaEntries(mixId, -1);
    }

	/**  Get all ready media entries that exist in the given mix id     */
    public List<KalturaMediaEntry> getReadyMediaEntries(String mixId, int version) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("mixId", mixId);
        kparams.add("version", version);
        this.kalturaClient.queueServiceCall("mixing", "getReadyMediaEntries", kparams, KalturaMediaEntry.class);
        if (this.kalturaClient.isMultiRequest())
            return null;
        Element resultXmlElement = this.kalturaClient.doQueue();
        return ParseUtils.parseArray(KalturaMediaEntry.class, resultXmlElement);
    }

	/**  Anonymously rank a mix entry, no validation is done on duplicate rankings     */
    public void anonymousRank(String entryId, int rank) throws KalturaApiException {
        KalturaParams kparams = new KalturaParams();
        kparams.add("entryId", entryId);
        kparams.add("rank", rank);
        this.kalturaClient.queueServiceCall("mixing", "anonymousRank", kparams);
        if (this.kalturaClient.isMultiRequest())
            return ;
        this.kalturaClient.doQueue();
    }
}
