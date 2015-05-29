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
import com.kaltura.client.enums.KalturaPartnerGroupType;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 29 May 15 00:56:06 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaVarConsolePartnerFilter extends KalturaPartnerFilter {
	/**  Eq filter for the partner's group type        */
    public KalturaPartnerGroupType groupTypeEq;
	/**  In filter for the partner's group type        */
    public String groupTypeIn;
	/**  Filter for partner permissions- filter contains comma-separated string of
	  permission names which the returned partners should have.        */
    public String partnerPermissionsExist;

    public KalturaVarConsolePartnerFilter() {
    }

    public KalturaVarConsolePartnerFilter(Element node) throws KalturaApiException {
        super(node);
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("groupTypeEq")) {
                this.groupTypeEq = KalturaPartnerGroupType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("groupTypeIn")) {
                this.groupTypeIn = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerPermissionsExist")) {
                this.partnerPermissionsExist = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaVarConsolePartnerFilter");
        kparams.add("groupTypeEq", this.groupTypeEq);
        kparams.add("groupTypeIn", this.groupTypeIn);
        kparams.add("partnerPermissionsExist", this.partnerPermissionsExist);
        return kparams;
    }

}

