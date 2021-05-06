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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchResult.Tokenizer.class)
public abstract class ESearchResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		RequestBuilder.ListTokenizer<ESearchHighlight.Tokenizer> highlight();
		RequestBuilder.ListTokenizer<ESearchItemDataResult.Tokenizer> itemsData();
	}

	private List<ESearchHighlight> highlight;
	private List<ESearchItemDataResult> itemsData;

	// highlight:
	public List<ESearchHighlight> getHighlight(){
		return this.highlight;
	}
	public void setHighlight(List<ESearchHighlight> highlight){
		this.highlight = highlight;
	}

	// itemsData:
	public List<ESearchItemDataResult> getItemsData(){
		return this.itemsData;
	}
	public void setItemsData(List<ESearchItemDataResult> itemsData){
		this.itemsData = itemsData;
	}


	public ESearchResult() {
		super();
	}

	public ESearchResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		highlight = GsonParser.parseArray(jsonObject.getAsJsonArray("highlight"), ESearchHighlight.class);
		itemsData = GsonParser.parseArray(jsonObject.getAsJsonArray("itemsData"), ESearchItemDataResult.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchResult");
		kparams.add("highlight", this.highlight);
		kparams.add("itemsData", this.itemsData);
		return kparams;
	}

}

