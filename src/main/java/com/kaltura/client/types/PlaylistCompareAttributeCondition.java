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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.PlaylistCompareAttribute;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Auto-generated class.  Used to search KalturaPlaylist attributes. Use
  KalturaPlaylistCompareAttribute enum to provide attribute name. /
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PlaylistCompareAttributeCondition.Tokenizer.class)
public class PlaylistCompareAttributeCondition extends SearchComparableAttributeCondition {
	
	public interface Tokenizer extends SearchComparableAttributeCondition.Tokenizer {
		String attribute();
	}

	private PlaylistCompareAttribute attribute;

	// attribute:
	public PlaylistCompareAttribute getAttribute(){
		return this.attribute;
	}
	public void setAttribute(PlaylistCompareAttribute attribute){
		this.attribute = attribute;
	}

	public void attribute(String multirequestToken){
		setToken("attribute", multirequestToken);
	}


	public PlaylistCompareAttributeCondition() {
		super();
	}

	public PlaylistCompareAttributeCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		attribute = PlaylistCompareAttribute.get(GsonParser.parseString(jsonObject.get("attribute")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPlaylistCompareAttributeCondition");
		kparams.add("attribute", this.attribute);
		return kparams;
	}

}

