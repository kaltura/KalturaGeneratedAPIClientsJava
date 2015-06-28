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
import com.kaltura.client.enums.KalturaBatchJobType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Sun, 28 Jun 15 09:32:26 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaWorkerQueueFilter extends KalturaObjectBase {
    public int schedulerId = Integer.MIN_VALUE;
    public int workerId = Integer.MIN_VALUE;
    public KalturaBatchJobType jobType;
    public KalturaBatchJobFilter filter;

    public KalturaWorkerQueueFilter() {
    }

    public KalturaWorkerQueueFilter(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("schedulerId")) {
                this.schedulerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("workerId")) {
                this.workerId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("jobType")) {
                this.jobType = KalturaBatchJobType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("filter")) {
                this.filter = ParseUtils.parseObject(KalturaBatchJobFilter.class, aNode);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaWorkerQueueFilter");
        kparams.add("schedulerId", this.schedulerId);
        kparams.add("workerId", this.workerId);
        kparams.add("jobType", this.jobType);
        kparams.add("filter", this.filter);
        return kparams;
    }

}

