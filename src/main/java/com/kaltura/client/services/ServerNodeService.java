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
package com.kaltura.client.services;

import com.kaltura.client.Params;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ServerNode;
import com.kaltura.client.types.ServerNodeFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Server Node service  */
public class ServerNodeService {

	/**  Adds a server node to the Kaltura DB.  */
    public static RequestBuilder<ServerNode> add(ServerNode serverNode)  {
        Params kparams = new Params();
        kparams.add("serverNode", serverNode);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "add", kparams);
    }

	/**  delete server node by id  */
    public static RequestBuilder<Void> delete(String serverNodeId)  {
        Params kparams = new Params();
        kparams.add("serverNodeId", serverNodeId);

        return new NullRequestBuilder("servernode", "delete", kparams);
    }

	/**  Disable server node by id  */
    public static RequestBuilder<ServerNode> disable(String serverNodeId)  {
        Params kparams = new Params();
        kparams.add("serverNodeId", serverNodeId);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "disable", kparams);
    }

	/**  Enable server node by id  */
    public static RequestBuilder<ServerNode> enable(String serverNodeId)  {
        Params kparams = new Params();
        kparams.add("serverNodeId", serverNodeId);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "enable", kparams);
    }

	/**  Get server node by id  */
    public static RequestBuilder<ServerNode> get(int serverNodeId)  {
        Params kparams = new Params();
        kparams.add("serverNodeId", serverNodeId);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "get", kparams);
    }

    public static RequestBuilder<ListResponse<ServerNode>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<ServerNode>> list(ServerNodeFilter filter)  {
        return list(filter, null);
    }

    public static RequestBuilder<ListResponse<ServerNode>> list(ServerNodeFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<ServerNode>(ServerNode.class, "servernode", "list", kparams);
    }

    public static RequestBuilder<ServerNode> reportStatus(String hostName)  {
        return reportStatus(hostName, null);
    }

	/**  Update server node status  */
    public static RequestBuilder<ServerNode> reportStatus(String hostName, ServerNode serverNode)  {
        Params kparams = new Params();
        kparams.add("hostName", hostName);
        kparams.add("serverNode", serverNode);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "reportStatus", kparams);
    }

	/**  Update server node by id  */
    public static RequestBuilder<ServerNode> update(int serverNodeId, ServerNode serverNode)  {
        Params kparams = new Params();
        kparams.add("serverNodeId", serverNodeId);
        kparams.add("serverNode", serverNode);

        return new RequestBuilder<ServerNode>(ServerNode.class, "servernode", "update", kparams);
    }
}
