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
import com.kaltura.client.types.ESearchEntryParams;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MediaEsearchExportToCsvJobData.Tokenizer.class)
public class MediaEsearchExportToCsvJobData extends ExportCsvJobData {
	
	public interface Tokenizer extends ExportCsvJobData.Tokenizer {
		ESearchEntryParams.Tokenizer searchParams();
		RequestBuilder.ListTokenizer<ExportToCsvOptions.Tokenizer> options();
	}

	/**
	 * Esearch parameters for the entry search
	 */
	private ESearchEntryParams searchParams;
	/**
	 * options
	 */
	private List<ExportToCsvOptions> options;

	// searchParams:
	public ESearchEntryParams getSearchParams(){
		return this.searchParams;
	}
	public void setSearchParams(ESearchEntryParams searchParams){
		this.searchParams = searchParams;
	}

	// options:
	public List<ExportToCsvOptions> getOptions(){
		return this.options;
	}
	public void setOptions(List<ExportToCsvOptions> options){
		this.options = options;
	}


	public MediaEsearchExportToCsvJobData() {
		super();
	}

	public MediaEsearchExportToCsvJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		searchParams = GsonParser.parseObject(jsonObject.getAsJsonObject("searchParams"), ESearchEntryParams.class);
		options = GsonParser.parseArray(jsonObject.getAsJsonArray("options"), ExportToCsvOptions.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMediaEsearchExportToCsvJobData");
		kparams.add("searchParams", this.searchParams);
		kparams.add("options", this.options);
		return kparams;
	}

}

