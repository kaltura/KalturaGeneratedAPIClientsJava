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
import com.kaltura.client.enums.DeleteFlavorsLogicType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeleteEntryFlavorsObjectTask.Tokenizer.class)
public class DeleteEntryFlavorsObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String deleteType();
		String flavorParamsIds();
	}

	/**
	 * The logic to use to choose the flavors for deletion
	 */
	private DeleteFlavorsLogicType deleteType;
	/**
	 * Comma separated list of flavor param ids to delete or keep
	 */
	private String flavorParamsIds;

	// deleteType:
	public DeleteFlavorsLogicType getDeleteType(){
		return this.deleteType;
	}
	public void setDeleteType(DeleteFlavorsLogicType deleteType){
		this.deleteType = deleteType;
	}

	public void deleteType(String multirequestToken){
		setToken("deleteType", multirequestToken);
	}

	// flavorParamsIds:
	public String getFlavorParamsIds(){
		return this.flavorParamsIds;
	}
	public void setFlavorParamsIds(String flavorParamsIds){
		this.flavorParamsIds = flavorParamsIds;
	}

	public void flavorParamsIds(String multirequestToken){
		setToken("flavorParamsIds", multirequestToken);
	}


	public DeleteEntryFlavorsObjectTask() {
		super();
	}

	public DeleteEntryFlavorsObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		deleteType = DeleteFlavorsLogicType.get(GsonParser.parseInt(jsonObject.get("deleteType")));
		flavorParamsIds = GsonParser.parseString(jsonObject.get("flavorParamsIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeleteEntryFlavorsObjectTask");
		kparams.add("deleteType", this.deleteType);
		kparams.add("flavorParamsIds", this.flavorParamsIds);
		return kparams;
	}

}

