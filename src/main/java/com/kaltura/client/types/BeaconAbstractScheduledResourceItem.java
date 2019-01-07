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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.ESearchItemType;
import com.kaltura.client.types.ESearchRange;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(BeaconAbstractScheduledResourceItem.Tokenizer.class)
public abstract class BeaconAbstractScheduledResourceItem extends BeaconScheduledResourceBaseItem {
	
	public interface Tokenizer extends BeaconScheduledResourceBaseItem.Tokenizer {
		String searchTerm();
		String itemType();
		ESearchRange.Tokenizer range();
	}

	private String searchTerm;
	private ESearchItemType itemType;
	private ESearchRange range;

	// searchTerm:
	public String getSearchTerm(){
		return this.searchTerm;
	}
	public void setSearchTerm(String searchTerm){
		this.searchTerm = searchTerm;
	}

	public void searchTerm(String multirequestToken){
		setToken("searchTerm", multirequestToken);
	}

	// itemType:
	public ESearchItemType getItemType(){
		return this.itemType;
	}
	public void setItemType(ESearchItemType itemType){
		this.itemType = itemType;
	}

	public void itemType(String multirequestToken){
		setToken("itemType", multirequestToken);
	}

	// range:
	public ESearchRange getRange(){
		return this.range;
	}
	public void setRange(ESearchRange range){
		this.range = range;
	}


	public BeaconAbstractScheduledResourceItem() {
		super();
	}

	public BeaconAbstractScheduledResourceItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchTerm = GsonParser.parseString(jsonObject.get("searchTerm"));
		itemType = ESearchItemType.get(GsonParser.parseInt(jsonObject.get("itemType")));
		range = GsonParser.parseObject(jsonObject.getAsJsonObject("range"), ESearchRange.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaBeaconAbstractScheduledResourceItem");
		kparams.add("searchTerm", this.searchTerm);
		kparams.add("itemType", this.itemType);
		kparams.add("range", this.range);
		return kparams;
	}

}

