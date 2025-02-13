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
import com.kaltura.client.enums.EntryType;
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
@MultiRequestBuilder.Tokenizer(ExportToCsvOptions.Tokenizer.class)
public class ExportToCsvOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String format();
		String typeEqual();
		String defaultHeader();
	}

	/**
	 * The format of the outputted date string. There are also several predefined date
	  constants that may be used instead, so for example DATE_RSS contains the format
	  string 'D, d M Y H:i:s'.   https://www.php.net/manual/en/function.date.php
	 */
	private String format;
	/**
	 * Setting this property will cause additional columns to be added to the final
	  report. The columns will be related to the specific object type passed
	  (currently only MEDIA_CLIP is supported).   Please note that this property will
	  NOT change the result filter in any way (i.e passing MEDIA_CLIP here will not
	  force the report to return only media items).
	 */
	private EntryType typeEqual;
	private Boolean defaultHeader;

	// format:
	public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// typeEqual:
	public EntryType getTypeEqual(){
		return this.typeEqual;
	}
	public void setTypeEqual(EntryType typeEqual){
		this.typeEqual = typeEqual;
	}

	public void typeEqual(String multirequestToken){
		setToken("typeEqual", multirequestToken);
	}

	// defaultHeader:
	public Boolean getDefaultHeader(){
		return this.defaultHeader;
	}
	public void setDefaultHeader(Boolean defaultHeader){
		this.defaultHeader = defaultHeader;
	}

	public void defaultHeader(String multirequestToken){
		setToken("defaultHeader", multirequestToken);
	}


	public ExportToCsvOptions() {
		super();
	}

	public ExportToCsvOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		format = GsonParser.parseString(jsonObject.get("format"));
		typeEqual = EntryType.get(GsonParser.parseString(jsonObject.get("typeEqual")));
		defaultHeader = GsonParser.parseBoolean(jsonObject.get("defaultHeader"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaExportToCsvOptions");
		kparams.add("format", this.format);
		kparams.add("typeEqual", this.typeEqual);
		kparams.add("defaultHeader", this.defaultHeader);
		return kparams;
	}

}

