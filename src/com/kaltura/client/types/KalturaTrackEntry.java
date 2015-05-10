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
import com.kaltura.client.enums.KalturaTrackEntryEventType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sun, 10 May 15 08:35:21 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaTrackEntry extends KalturaObjectBase {
    public int id = Integer.MIN_VALUE;
    public KalturaTrackEntryEventType trackEventType;
    public String psVersion;
    public String context;
    public int partnerId = Integer.MIN_VALUE;
    public String entryId;
    public String hostName;
    public String userId;
    public String changedProperties;
    public String paramStr1;
    public String paramStr2;
    public String paramStr3;
    public String ks;
    public String description;
    public int createdAt = Integer.MIN_VALUE;
    public int updatedAt = Integer.MIN_VALUE;
    public String userIp;

    public KalturaTrackEntry() {
    }

    public KalturaTrackEntry(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("trackEventType")) {
                this.trackEventType = KalturaTrackEntryEventType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("psVersion")) {
                this.psVersion = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("context")) {
                this.context = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerId")) {
                this.partnerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("entryId")) {
                this.entryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("hostName")) {
                this.hostName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("userId")) {
                this.userId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("changedProperties")) {
                this.changedProperties = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("paramStr1")) {
                this.paramStr1 = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("paramStr2")) {
                this.paramStr2 = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("paramStr3")) {
                this.paramStr3 = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("ks")) {
                this.ks = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("createdAt")) {
                this.createdAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("updatedAt")) {
                this.updatedAt = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userIp")) {
                this.userIp = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaTrackEntry");
        kparams.add("id", this.id);
        kparams.add("trackEventType", this.trackEventType);
        kparams.add("psVersion", this.psVersion);
        kparams.add("context", this.context);
        kparams.add("partnerId", this.partnerId);
        kparams.add("entryId", this.entryId);
        kparams.add("hostName", this.hostName);
        kparams.add("userId", this.userId);
        kparams.add("changedProperties", this.changedProperties);
        kparams.add("paramStr1", this.paramStr1);
        kparams.add("paramStr2", this.paramStr2);
        kparams.add("paramStr3", this.paramStr3);
        kparams.add("ks", this.ks);
        kparams.add("description", this.description);
        kparams.add("createdAt", this.createdAt);
        kparams.add("updatedAt", this.updatedAt);
        kparams.add("userIp", this.userIp);
        return kparams;
    }

}

