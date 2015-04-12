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
package com.kaltura.client.types;

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaStatsEventType;
import com.kaltura.client.enums.KalturaStatsFeatureType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sun, 12 Apr 15 00:07:58 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Will hold data from the Kaltura UI components to be passed on to the reports and
  analytics system    */
@SuppressWarnings("serial")
public class KalturaStatsEvent extends KalturaObjectBase {
    public String clientVer;
    public KalturaStatsEventType eventType;
	/**  the client's timestamp of this event     */
    public double eventTimestamp = Double.MIN_VALUE;
	/**  a unique string generated by the client that will represent the client-side
	  session: the primary component will pass it on to other components that sprout
	  from it     */
    public String sessionId;
    public int partnerId = Integer.MIN_VALUE;
    public String entryId;
	/**  the UV cookie - creates in the operational system and should be passed on ofr
	  every event      */
    public String uniqueViewer;
    public String widgetId;
    public int uiconfId = Integer.MIN_VALUE;
	/**  the partner's user id      */
    public String userId;
	/**  the timestamp along the video when the event happend      */
    public int currentPoint = Integer.MIN_VALUE;
	/**  the duration of the video in milliseconds - will make it much faster than
	  quering the db for each entry      */
    public int duration = Integer.MIN_VALUE;
	/**  will be retrieved from the request of the user      */
    public String userIp;
	/**  the time in milliseconds the event took     */
    public int processDuration = Integer.MIN_VALUE;
	/**  the id of the GUI control - will be used in the future to better understand what
	  the user clicked     */
    public String controlId;
	/**  true if the user ever used seek in this session      */
    public boolean seek;
	/**  timestamp of the new point on the timeline of the video after the user seeks      */
    public int newPoint = Integer.MIN_VALUE;
	/**  the referrer of the client     */
    public String referrer;
	/**  will indicate if the event is thrown for the first video in the session     */
    public boolean isFirstInSession;
	/**  kaltura application name      */
    public String applicationId;
    public int contextId = Integer.MIN_VALUE;
    public KalturaStatsFeatureType featureType;

    public KalturaStatsEvent() {
    }

    public KalturaStatsEvent(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("clientVer")) {
                this.clientVer = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("eventType")) {
                this.eventType = KalturaStatsEventType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("eventTimestamp")) {
                this.eventTimestamp = ParseUtils.parseDouble(txt);
                continue;
            } else if (nodeName.equals("sessionId")) {
                this.sessionId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uniqueViewer")) {
                this.uniqueViewer = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("widgetId")) {
                this.widgetId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("uiconfId")) {
                this.uiconfId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("currentPoint")) {
                this.currentPoint = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("duration")) {
                this.duration = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userIp")) {
                this.userIp = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("processDuration")) {
                this.processDuration = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("controlId")) {
                this.controlId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("seek")) {
                this.seek = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("newPoint")) {
                this.newPoint = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("referrer")) {
                this.referrer = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("isFirstInSession")) {
                this.isFirstInSession = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("applicationId")) {
                this.applicationId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("contextId")) {
                this.contextId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("featureType")) {
                this.featureType = KalturaStatsFeatureType.get(ParseUtils.parseInt(txt));
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaStatsEvent");
        kparams.add("clientVer", this.clientVer);
        kparams.add("eventType", this.eventType);
        kparams.add("eventTimestamp", this.eventTimestamp);
        kparams.add("sessionId", this.sessionId);
        kparams.add("partnerId", this.partnerId);
        kparams.add("entryId", this.entryId);
        kparams.add("uniqueViewer", this.uniqueViewer);
        kparams.add("widgetId", this.widgetId);
        kparams.add("uiconfId", this.uiconfId);
        kparams.add("userId", this.userId);
        kparams.add("currentPoint", this.currentPoint);
        kparams.add("duration", this.duration);
        kparams.add("processDuration", this.processDuration);
        kparams.add("controlId", this.controlId);
        kparams.add("seek", this.seek);
        kparams.add("newPoint", this.newPoint);
        kparams.add("referrer", this.referrer);
        kparams.add("isFirstInSession", this.isFirstInSession);
        kparams.add("applicationId", this.applicationId);
        kparams.add("contextId", this.contextId);
        kparams.add("featureType", this.featureType);
        return kparams;
    }

}

