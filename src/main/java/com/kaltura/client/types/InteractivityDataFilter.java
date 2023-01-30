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
import com.kaltura.client.types.InteractivityInteractionFilter;
import com.kaltura.client.types.InteractivityNodeFilter;
import com.kaltura.client.types.InteractivityRootFilter;
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
@MultiRequestBuilder.Tokenizer(InteractivityDataFilter.Tokenizer.class)
public class InteractivityDataFilter extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		InteractivityRootFilter.Tokenizer rootFilter();
		InteractivityNodeFilter.Tokenizer nodeFilter();
		InteractivityInteractionFilter.Tokenizer interactionFilter();
	}

	private InteractivityRootFilter rootFilter;
	private InteractivityNodeFilter nodeFilter;
	private InteractivityInteractionFilter interactionFilter;

	// rootFilter:
	public InteractivityRootFilter getRootFilter(){
		return this.rootFilter;
	}
	public void setRootFilter(InteractivityRootFilter rootFilter){
		this.rootFilter = rootFilter;
	}

	// nodeFilter:
	public InteractivityNodeFilter getNodeFilter(){
		return this.nodeFilter;
	}
	public void setNodeFilter(InteractivityNodeFilter nodeFilter){
		this.nodeFilter = nodeFilter;
	}

	// interactionFilter:
	public InteractivityInteractionFilter getInteractionFilter(){
		return this.interactionFilter;
	}
	public void setInteractionFilter(InteractivityInteractionFilter interactionFilter){
		this.interactionFilter = interactionFilter;
	}


	public InteractivityDataFilter() {
		super();
	}

	public InteractivityDataFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		rootFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("rootFilter"), InteractivityRootFilter.class);
		nodeFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("nodeFilter"), InteractivityNodeFilter.class);
		interactionFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("interactionFilter"), InteractivityInteractionFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaInteractivityDataFilter");
		kparams.add("rootFilter", this.rootFilter);
		kparams.add("nodeFilter", this.nodeFilter);
		kparams.add("interactionFilter", this.interactionFilter);
		return kparams;
	}

}

