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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * The KalturaPager object enables paging management to be applied upon service
  list/search actions.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Pager.Tokenizer.class)
public class Pager extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String pageSize();
		String pageIndex();
	}

	/**
	 * The number of objects to retrieve. (Default is 30, maximum page size is 500).
	 */
	private Integer pageSize;
	/**
	 * The page number for which {pageSize} of objects should be retrieved (Default is
	  1).
	 */
	private Integer pageIndex;

	// pageSize:
	public Integer getPageSize(){
		return this.pageSize;
	}
	public void setPageSize(Integer pageSize){
		this.pageSize = pageSize;
	}

	public void pageSize(String multirequestToken){
		setToken("pageSize", multirequestToken);
	}

	// pageIndex:
	public Integer getPageIndex(){
		return this.pageIndex;
	}
	public void setPageIndex(Integer pageIndex){
		this.pageIndex = pageIndex;
	}

	public void pageIndex(String multirequestToken){
		setToken("pageIndex", multirequestToken);
	}


	public Pager() {
		super();
	}

	public Pager(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		pageSize = GsonParser.parseInt(jsonObject.get("pageSize"));
		pageIndex = GsonParser.parseInt(jsonObject.get("pageIndex"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPager");
		kparams.add("pageSize", this.pageSize);
		kparams.add("pageIndex", this.pageIndex);
		return kparams;
	}

}

