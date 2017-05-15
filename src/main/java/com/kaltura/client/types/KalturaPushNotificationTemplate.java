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
// Copyright (C) 2006-2017  Kaltura Inc.
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
import com.kaltura.client.enums.KalturaResponseType;
import java.util.ArrayList;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaPushNotificationTemplate extends KalturaEventNotificationTemplate {
	/**  Define the content dynamic parameters  */
    public ArrayList<KalturaPushEventNotificationParameter> queueNameParameters;
	/**  Define the content dynamic parameters  */
    public ArrayList<KalturaPushEventNotificationParameter> queueKeyParameters;
	/**  Kaltura API object type  */
    public String apiObjectType;
	/**  Kaltura Object format  */
    public KalturaResponseType objectFormat;
	/**  Kaltura response-profile id  */
    public int responseProfileId = Integer.MIN_VALUE;

    public KalturaPushNotificationTemplate() {
    }

    public KalturaPushNotificationTemplate(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("queueNameParameters")) {
                this.queueNameParameters = ParseUtils.parseArray(KalturaPushEventNotificationParameter.class, aNode);
                continue;
            } else if (nodeName.equals("queueKeyParameters")) {
                this.queueKeyParameters = ParseUtils.parseArray(KalturaPushEventNotificationParameter.class, aNode);
                continue;
            } else if (nodeName.equals("apiObjectType")) {
                this.apiObjectType = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("objectFormat")) {
                this.objectFormat = KalturaResponseType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("responseProfileId")) {
                this.responseProfileId = ParseUtils.parseInt(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() throws KalturaApiException {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaPushNotificationTemplate");
        kparams.add("queueNameParameters", this.queueNameParameters);
        kparams.add("queueKeyParameters", this.queueKeyParameters);
        kparams.add("apiObjectType", this.apiObjectType);
        kparams.add("objectFormat", this.objectFormat);
        kparams.add("responseProfileId", this.responseProfileId);
        return kparams;
    }

}

