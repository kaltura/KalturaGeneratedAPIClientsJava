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
// Copyright (C) 2006-2020  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EdgeServerNodeBaseFilter.Tokenizer.class)
public abstract class EdgeServerNodeBaseFilter extends DeliveryServerNodeFilter {
	
	public interface Tokenizer extends DeliveryServerNodeFilter.Tokenizer {
		String playbackDomainLike();
		String playbackDomainMultiLikeOr();
		String playbackDomainMultiLikeAnd();
	}

	private String playbackDomainLike;
	private String playbackDomainMultiLikeOr;
	private String playbackDomainMultiLikeAnd;

	// playbackDomainLike:
	public String getPlaybackDomainLike(){
		return this.playbackDomainLike;
	}
	public void setPlaybackDomainLike(String playbackDomainLike){
		this.playbackDomainLike = playbackDomainLike;
	}

	public void playbackDomainLike(String multirequestToken){
		setToken("playbackDomainLike", multirequestToken);
	}

	// playbackDomainMultiLikeOr:
	public String getPlaybackDomainMultiLikeOr(){
		return this.playbackDomainMultiLikeOr;
	}
	public void setPlaybackDomainMultiLikeOr(String playbackDomainMultiLikeOr){
		this.playbackDomainMultiLikeOr = playbackDomainMultiLikeOr;
	}

	public void playbackDomainMultiLikeOr(String multirequestToken){
		setToken("playbackDomainMultiLikeOr", multirequestToken);
	}

	// playbackDomainMultiLikeAnd:
	public String getPlaybackDomainMultiLikeAnd(){
		return this.playbackDomainMultiLikeAnd;
	}
	public void setPlaybackDomainMultiLikeAnd(String playbackDomainMultiLikeAnd){
		this.playbackDomainMultiLikeAnd = playbackDomainMultiLikeAnd;
	}

	public void playbackDomainMultiLikeAnd(String multirequestToken){
		setToken("playbackDomainMultiLikeAnd", multirequestToken);
	}


	public EdgeServerNodeBaseFilter() {
		super();
	}

	public EdgeServerNodeBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		playbackDomainLike = GsonParser.parseString(jsonObject.get("playbackDomainLike"));
		playbackDomainMultiLikeOr = GsonParser.parseString(jsonObject.get("playbackDomainMultiLikeOr"));
		playbackDomainMultiLikeAnd = GsonParser.parseString(jsonObject.get("playbackDomainMultiLikeAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEdgeServerNodeBaseFilter");
		kparams.add("playbackDomainLike", this.playbackDomainLike);
		kparams.add("playbackDomainMultiLikeOr", this.playbackDomainMultiLikeOr);
		kparams.add("playbackDomainMultiLikeAnd", this.playbackDomainMultiLikeAnd);
		return kparams;
	}

}

