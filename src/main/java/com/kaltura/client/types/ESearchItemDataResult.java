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
// Copyright (C) 2006-2018  Kaltura Inc.
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
@MultiRequestBuilder.Tokenizer(ESearchItemDataResult.Tokenizer.class)
public class ESearchItemDataResult extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String totalCount();
		RequestBuilder.ListTokenizer<ESearchItemData.Tokenizer> items();
		String itemsType();
	}

	private Integer totalCount;
	private List<ESearchItemData> items;
	private String itemsType;

	// totalCount:
	public Integer getTotalCount(){
		return this.totalCount;
	}
	public void setTotalCount(Integer totalCount){
		this.totalCount = totalCount;
	}

	public void totalCount(String multirequestToken){
		setToken("totalCount", multirequestToken);
	}

	// items:
	public List<ESearchItemData> getItems(){
		return this.items;
	}
	public void setItems(List<ESearchItemData> items){
		this.items = items;
	}

	// itemsType:
	public String getItemsType(){
		return this.itemsType;
	}
	public void setItemsType(String itemsType){
		this.itemsType = itemsType;
	}

	public void itemsType(String multirequestToken){
		setToken("itemsType", multirequestToken);
	}


	public ESearchItemDataResult() {
		super();
	}

	public ESearchItemDataResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		totalCount = GsonParser.parseInt(jsonObject.get("totalCount"));
		items = GsonParser.parseArray(jsonObject.getAsJsonArray("items"), ESearchItemData.class);
		itemsType = GsonParser.parseString(jsonObject.get("itemsType"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchItemDataResult");
		kparams.add("totalCount", this.totalCount);
		kparams.add("items", this.items);
		kparams.add("itemsType", this.itemsType);
		return kparams;
	}

}

