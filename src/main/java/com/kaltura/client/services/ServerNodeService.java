// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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

import com.kaltura.client.enums.ServerNodeStatus;
import com.kaltura.client.types.FilterPager;
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

/**
 * Server Node service
 * 
 * @param serverNode 
 * @param serverNodeId 
 * @param serverNodeId 
 * @param serverNodeId 
 * @param serverNodeId 
 * @param hostName 
 * @param protocol 
 * @param deliveryFormat 
 * @param deliveryType 
 * @param filter 
 * @param pager 
 * @param serverNodeId 
 * @param hostName 
 * @param serverNode 
 * @param serverNodeStatus 
 * @param serverNodeId 
 * @param serverNode Id
 */
public class ServerNodeService {
	
	public static class AddServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, AddServerNodeBuilder> {
		
		public AddServerNodeBuilder(ServerNode serverNode) {
			super(ServerNode.class, "servernode", "add");
			params.add("serverNode", serverNode);
		}
	}

	/**
	 * Adds a server node to the Kaltura DB.
	 * 
	 * @param serverNode 
	 */
    public static AddServerNodeBuilder add(ServerNode serverNode)  {
		return new AddServerNodeBuilder(serverNode);
	}
	
	public static class DeleteServerNodeBuilder extends NullRequestBuilder {
		
		public DeleteServerNodeBuilder(String serverNodeId) {
			super("servernode", "delete");
			params.add("serverNodeId", serverNodeId);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * delete server node by id
	 * 
	 * @param serverNodeId 
	 */
    public static DeleteServerNodeBuilder delete(String serverNodeId)  {
		return new DeleteServerNodeBuilder(serverNodeId);
	}
	
	public static class DisableServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, DisableServerNodeBuilder> {
		
		public DisableServerNodeBuilder(String serverNodeId) {
			super(ServerNode.class, "servernode", "disable");
			params.add("serverNodeId", serverNodeId);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * Disable server node by id
	 * 
	 * @param serverNodeId 
	 */
    public static DisableServerNodeBuilder disable(String serverNodeId)  {
		return new DisableServerNodeBuilder(serverNodeId);
	}
	
	public static class EnableServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, EnableServerNodeBuilder> {
		
		public EnableServerNodeBuilder(String serverNodeId) {
			super(ServerNode.class, "servernode", "enable");
			params.add("serverNodeId", serverNodeId);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * Enable server node by id
	 * 
	 * @param serverNodeId 
	 */
    public static EnableServerNodeBuilder enable(String serverNodeId)  {
		return new EnableServerNodeBuilder(serverNodeId);
	}
	
	public static class GetServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, GetServerNodeBuilder> {
		
		public GetServerNodeBuilder(int serverNodeId) {
			super(ServerNode.class, "servernode", "get");
			params.add("serverNodeId", serverNodeId);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * Get server node by id
	 * 
	 * @param serverNodeId 
	 */
    public static GetServerNodeBuilder get(int serverNodeId)  {
		return new GetServerNodeBuilder(serverNodeId);
	}
	
	public static class GetFullPathServerNodeBuilder extends RequestBuilder<String, String, GetFullPathServerNodeBuilder> {
		
		public GetFullPathServerNodeBuilder(String hostName, String protocol, String deliveryFormat, String deliveryType) {
			super(String.class, "servernode", "getFullPath");
			params.add("hostName", hostName);
			params.add("protocol", protocol);
			params.add("deliveryFormat", deliveryFormat);
			params.add("deliveryType", deliveryType);
		}
		
		public void hostName(String multirequestToken) {
			params.add("hostName", multirequestToken);
		}
		
		public void protocol(String multirequestToken) {
			params.add("protocol", multirequestToken);
		}
		
		public void deliveryFormat(String multirequestToken) {
			params.add("deliveryFormat", multirequestToken);
		}
		
		public void deliveryType(String multirequestToken) {
			params.add("deliveryType", multirequestToken);
		}
	}

	public static GetFullPathServerNodeBuilder getFullPath(String hostName)  {
		return getFullPath(hostName, "http");
	}

	public static GetFullPathServerNodeBuilder getFullPath(String hostName, String protocol)  {
		return getFullPath(hostName, protocol, null);
	}

	public static GetFullPathServerNodeBuilder getFullPath(String hostName, String protocol, String deliveryFormat)  {
		return getFullPath(hostName, protocol, deliveryFormat, null);
	}

	/**
	 * Get the edge server node full path
	 * 
	 * @param hostName 
	 * @param protocol 
	 * @param deliveryFormat 
	 * @param deliveryType 
	 */
    public static GetFullPathServerNodeBuilder getFullPath(String hostName, String protocol, String deliveryFormat, String deliveryType)  {
		return new GetFullPathServerNodeBuilder(hostName, protocol, deliveryFormat, deliveryType);
	}
	
	public static class ListServerNodeBuilder extends ListResponseRequestBuilder<ServerNode, ServerNode.Tokenizer, ListServerNodeBuilder> {
		
		public ListServerNodeBuilder(ServerNodeFilter filter, FilterPager pager) {
			super(ServerNode.class, "servernode", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListServerNodeBuilder list()  {
		return list(null);
	}

	public static ListServerNodeBuilder list(ServerNodeFilter filter)  {
		return list(filter, null);
	}

    public static ListServerNodeBuilder list(ServerNodeFilter filter, FilterPager pager)  {
		return new ListServerNodeBuilder(filter, pager);
	}
	
	public static class MarkOfflineServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, MarkOfflineServerNodeBuilder> {
		
		public MarkOfflineServerNodeBuilder(String serverNodeId) {
			super(ServerNode.class, "servernode", "markOffline");
			params.add("serverNodeId", serverNodeId);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * Mark server node offline
	 * 
	 * @param serverNodeId 
	 */
    public static MarkOfflineServerNodeBuilder markOffline(String serverNodeId)  {
		return new MarkOfflineServerNodeBuilder(serverNodeId);
	}
	
	public static class ReportStatusServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, ReportStatusServerNodeBuilder> {
		
		public ReportStatusServerNodeBuilder(String hostName, ServerNode serverNode, ServerNodeStatus serverNodeStatus) {
			super(ServerNode.class, "servernode", "reportStatus");
			params.add("hostName", hostName);
			params.add("serverNode", serverNode);
			params.add("serverNodeStatus", serverNodeStatus);
		}
		
		public void hostName(String multirequestToken) {
			params.add("hostName", multirequestToken);
		}
		
		public void serverNodeStatus(String multirequestToken) {
			params.add("serverNodeStatus", multirequestToken);
		}
	}

	public static ReportStatusServerNodeBuilder reportStatus(String hostName)  {
		return reportStatus(hostName, null);
	}

	public static ReportStatusServerNodeBuilder reportStatus(String hostName, ServerNode serverNode)  {
		return reportStatus(hostName, serverNode, ServerNodeStatus.get(1));
	}

	/**
	 * Update server node status
	 * 
	 * @param hostName 
	 * @param serverNode 
	 * @param serverNodeStatus 
	 */
    public static ReportStatusServerNodeBuilder reportStatus(String hostName, ServerNode serverNode, ServerNodeStatus serverNodeStatus)  {
		return new ReportStatusServerNodeBuilder(hostName, serverNode, serverNodeStatus);
	}
	
	public static class UpdateServerNodeBuilder extends RequestBuilder<ServerNode, ServerNode.Tokenizer, UpdateServerNodeBuilder> {
		
		public UpdateServerNodeBuilder(int serverNodeId, ServerNode serverNode) {
			super(ServerNode.class, "servernode", "update");
			params.add("serverNodeId", serverNodeId);
			params.add("serverNode", serverNode);
		}
		
		public void serverNodeId(String multirequestToken) {
			params.add("serverNodeId", multirequestToken);
		}
	}

	/**
	 * Update server node by id
	 * 
	 * @param serverNodeId 
	 * @param serverNode Id
	 */
    public static UpdateServerNodeBuilder update(int serverNodeId, ServerNode serverNode)  {
		return new UpdateServerNodeBuilder(serverNodeId, serverNode);
	}
}
