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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UrlRecognizerAkamaiG2O.Tokenizer.class)
public class UrlRecognizerAkamaiG2O extends UrlRecognizer {
	
	public interface Tokenizer extends UrlRecognizer.Tokenizer {
		String headerData();
		String headerSign();
		String timeout();
		String salt();
	}

	/**
	 * headerData
	 */
	private String headerData;
	/**
	 * headerSign
	 */
	private String headerSign;
	/**
	 * timeout
	 */
	private Integer timeout;
	/**
	 * salt
	 */
	private String salt;

	// headerData:
	public String getHeaderData(){
		return this.headerData;
	}
	public void setHeaderData(String headerData){
		this.headerData = headerData;
	}

	public void headerData(String multirequestToken){
		setToken("headerData", multirequestToken);
	}

	// headerSign:
	public String getHeaderSign(){
		return this.headerSign;
	}
	public void setHeaderSign(String headerSign){
		this.headerSign = headerSign;
	}

	public void headerSign(String multirequestToken){
		setToken("headerSign", multirequestToken);
	}

	// timeout:
	public Integer getTimeout(){
		return this.timeout;
	}
	public void setTimeout(Integer timeout){
		this.timeout = timeout;
	}

	public void timeout(String multirequestToken){
		setToken("timeout", multirequestToken);
	}

	// salt:
	public String getSalt(){
		return this.salt;
	}
	public void setSalt(String salt){
		this.salt = salt;
	}

	public void salt(String multirequestToken){
		setToken("salt", multirequestToken);
	}


	public UrlRecognizerAkamaiG2O() {
		super();
	}

	public UrlRecognizerAkamaiG2O(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		headerData = GsonParser.parseString(jsonObject.get("headerData"));
		headerSign = GsonParser.parseString(jsonObject.get("headerSign"));
		timeout = GsonParser.parseInt(jsonObject.get("timeout"));
		salt = GsonParser.parseString(jsonObject.get("salt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUrlRecognizerAkamaiG2O");
		kparams.add("headerData", this.headerData);
		kparams.add("headerSign", this.headerSign);
		kparams.add("timeout", this.timeout);
		kparams.add("salt", this.salt);
		return kparams;
	}

}

