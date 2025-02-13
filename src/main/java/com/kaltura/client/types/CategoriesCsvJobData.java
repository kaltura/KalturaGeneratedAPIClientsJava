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
import com.kaltura.client.types.CategoryFilter;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(CategoriesCsvJobData.Tokenizer.class)
public class CategoriesCsvJobData extends MappedObjectsCsvJobData {
	
	public interface Tokenizer extends MappedObjectsCsvJobData.Tokenizer {
		CategoryFilter.Tokenizer filter();
	}

	/**
	 * The filter should return the list of categories that need to be specified in the
	  csv.
	 */
	private CategoryFilter filter;

	// filter:
	public CategoryFilter getFilter(){
		return this.filter;
	}
	public void setFilter(CategoryFilter filter){
		this.filter = filter;
	}


	public CategoriesCsvJobData() {
		super();
	}

	public CategoriesCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), CategoryFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCategoriesCsvJobData");
		kparams.add("filter", this.filter);
		return kparams;
	}

}

