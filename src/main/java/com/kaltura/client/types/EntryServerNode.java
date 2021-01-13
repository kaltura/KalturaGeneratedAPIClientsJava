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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.EntryServerNodeStatus;
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryServerNode.Tokenizer.class)
public abstract class EntryServerNode extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String entryId();
		String serverNodeId();
		String partnerId();
		String createdAt();
		String updatedAt();
		String status();
		String serverType();
	}

	/**
	 * unique auto-generated identifier
	 */
	private Integer id;
	private String entryId;
	private Integer serverNodeId;
	private Integer partnerId;
	private Integer createdAt;
	private Integer updatedAt;
	private EntryServerNodeStatus status;
	private EntryServerNodeType serverType;

	// id:
	public Integer getId(){
		return this.id;
	}
	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	// serverNodeId:
	public Integer getServerNodeId(){
		return this.serverNodeId;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// status:
	public EntryServerNodeStatus getStatus(){
		return this.status;
	}
	// serverType:
	public EntryServerNodeType getServerType(){
		return this.serverType;
	}

	public EntryServerNode() {
		super();
	}

	public EntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		serverNodeId = GsonParser.parseInt(jsonObject.get("serverNodeId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		status = EntryServerNodeStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		serverType = EntryServerNodeType.get(GsonParser.parseString(jsonObject.get("serverType")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryServerNode");
		return kparams;
	}

}

