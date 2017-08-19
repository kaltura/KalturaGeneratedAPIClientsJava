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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportTable.Tokenizer.class)
public class ReportTable extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String header();
		String data();
		String totalCount();
	}

	private String header;
	private String data;
	private Integer totalCount;

	// header:
	public String getHeader(){
		return this.header;
	}
	public void setHeader(String header){
		this.header = header;
	}

	public void header(String multirequestToken){
		setToken("header", multirequestToken);
	}

	// data:
	public String getData(){
		return this.data;
	}
	public void setData(String data){
		this.data = data;
	}

	public void data(String multirequestToken){
		setToken("data", multirequestToken);
	}

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


	public ReportTable() {
		super();
	}

	public ReportTable(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		header = GsonParser.parseString(jsonObject.get("header"));
		data = GsonParser.parseString(jsonObject.get("data"));
		totalCount = GsonParser.parseInt(jsonObject.get("totalCount"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportTable");
		return kparams;
	}

}

