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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.MediaType;
import com.kaltura.client.enums.SearchProviderType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Search.Tokenizer.class)
public class Search extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String keyWords();
		String searchSource();
		String mediaType();
		String extraData();
		String authData();
	}

	private String keyWords;
	private SearchProviderType searchSource;
	private MediaType mediaType;
	/**
	 * Use this field to pass dynamic data for searching   For example - if you set
	  this field to "mymovies_$partner_id"   The $partner_id will be automatically
	  replcaed with your real partner Id
	 */
	private String extraData;
	private String authData;

	// keyWords:
	public String getKeyWords(){
		return this.keyWords;
	}
	public void setKeyWords(String keyWords){
		this.keyWords = keyWords;
	}

	public void keyWords(String multirequestToken){
		setToken("keyWords", multirequestToken);
	}

	// searchSource:
	public SearchProviderType getSearchSource(){
		return this.searchSource;
	}
	public void setSearchSource(SearchProviderType searchSource){
		this.searchSource = searchSource;
	}

	public void searchSource(String multirequestToken){
		setToken("searchSource", multirequestToken);
	}

	// mediaType:
	public MediaType getMediaType(){
		return this.mediaType;
	}
	public void setMediaType(MediaType mediaType){
		this.mediaType = mediaType;
	}

	public void mediaType(String multirequestToken){
		setToken("mediaType", multirequestToken);
	}

	// extraData:
	public String getExtraData(){
		return this.extraData;
	}
	public void setExtraData(String extraData){
		this.extraData = extraData;
	}

	public void extraData(String multirequestToken){
		setToken("extraData", multirequestToken);
	}

	// authData:
	public String getAuthData(){
		return this.authData;
	}
	public void setAuthData(String authData){
		this.authData = authData;
	}

	public void authData(String multirequestToken){
		setToken("authData", multirequestToken);
	}


	public Search() {
		super();
	}

	public Search(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keyWords = GsonParser.parseString(jsonObject.get("keyWords"));
		searchSource = SearchProviderType.get(GsonParser.parseInt(jsonObject.get("searchSource")));
		mediaType = MediaType.get(GsonParser.parseInt(jsonObject.get("mediaType")));
		extraData = GsonParser.parseString(jsonObject.get("extraData"));
		authData = GsonParser.parseString(jsonObject.get("authData"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearch");
		kparams.add("keyWords", this.keyWords);
		kparams.add("searchSource", this.searchSource);
		kparams.add("mediaType", this.mediaType);
		kparams.add("extraData", this.extraData);
		kparams.add("authData", this.authData);
		return kparams;
	}

}

