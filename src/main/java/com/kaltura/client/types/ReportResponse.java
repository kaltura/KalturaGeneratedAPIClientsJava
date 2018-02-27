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
@MultiRequestBuilder.Tokenizer(ReportResponse.Tokenizer.class)
public class ReportResponse extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String columns();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> results();
	}

	private String columns;
	private List<StringHolder> results;

	// columns:
	public String getColumns(){
		return this.columns;
	}
	public void setColumns(String columns){
		this.columns = columns;
	}

	public void columns(String multirequestToken){
		setToken("columns", multirequestToken);
	}

	// results:
	public List<StringHolder> getResults(){
		return this.results;
	}
	public void setResults(List<StringHolder> results){
		this.results = results;
	}


	public ReportResponse() {
		super();
	}

	public ReportResponse(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		columns = GsonParser.parseString(jsonObject.get("columns"));
		results = GsonParser.parseArray(jsonObject.getAsJsonArray("results"), StringHolder.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportResponse");
		kparams.add("columns", this.columns);
		kparams.add("results", this.results);
		return kparams;
	}

}

