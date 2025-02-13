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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SipEntryServerNode.Tokenizer.class)
public class SipEntryServerNode extends EntryServerNode {
	
	public interface Tokenizer extends EntryServerNode.Tokenizer {
		String sipRoomId();
		String sipPrimaryAdpId();
		String sipSecondaryAdpId();
	}

	private String sipRoomId;
	private String sipPrimaryAdpId;
	private String sipSecondaryAdpId;

	// sipRoomId:
	public String getSipRoomId(){
		return this.sipRoomId;
	}
	// sipPrimaryAdpId:
	public String getSipPrimaryAdpId(){
		return this.sipPrimaryAdpId;
	}
	// sipSecondaryAdpId:
	public String getSipSecondaryAdpId(){
		return this.sipSecondaryAdpId;
	}

	public SipEntryServerNode() {
		super();
	}

	public SipEntryServerNode(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sipRoomId = GsonParser.parseString(jsonObject.get("sipRoomId"));
		sipPrimaryAdpId = GsonParser.parseString(jsonObject.get("sipPrimaryAdpId"));
		sipSecondaryAdpId = GsonParser.parseString(jsonObject.get("sipSecondaryAdpId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSipEntryServerNode");
		return kparams;
	}

}

