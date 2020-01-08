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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.enums.LicenseType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(SearchResult.Tokenizer.class)
public class SearchResult extends Search {
	
	public interface Tokenizer extends Search.Tokenizer {
		String id();
		String title();
		String thumbUrl();
		String description();
		String tags();
		String url();
		String sourceLink();
		String credit();
		String licenseType();
		String flashPlaybackType();
		String fileExt();
	}

	private String id;
	private String title;
	private String thumbUrl;
	private String description;
	private String tags;
	private String url;
	private String sourceLink;
	private String credit;
	private LicenseType licenseType;
	private String flashPlaybackType;
	private String fileExt;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// thumbUrl:
	public String getThumbUrl(){
		return this.thumbUrl;
	}
	public void setThumbUrl(String thumbUrl){
		this.thumbUrl = thumbUrl;
	}

	public void thumbUrl(String multirequestToken){
		setToken("thumbUrl", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
	}

	// sourceLink:
	public String getSourceLink(){
		return this.sourceLink;
	}
	public void setSourceLink(String sourceLink){
		this.sourceLink = sourceLink;
	}

	public void sourceLink(String multirequestToken){
		setToken("sourceLink", multirequestToken);
	}

	// credit:
	public String getCredit(){
		return this.credit;
	}
	public void setCredit(String credit){
		this.credit = credit;
	}

	public void credit(String multirequestToken){
		setToken("credit", multirequestToken);
	}

	// licenseType:
	public LicenseType getLicenseType(){
		return this.licenseType;
	}
	public void setLicenseType(LicenseType licenseType){
		this.licenseType = licenseType;
	}

	public void licenseType(String multirequestToken){
		setToken("licenseType", multirequestToken);
	}

	// flashPlaybackType:
	public String getFlashPlaybackType(){
		return this.flashPlaybackType;
	}
	public void setFlashPlaybackType(String flashPlaybackType){
		this.flashPlaybackType = flashPlaybackType;
	}

	public void flashPlaybackType(String multirequestToken){
		setToken("flashPlaybackType", multirequestToken);
	}

	// fileExt:
	public String getFileExt(){
		return this.fileExt;
	}
	public void setFileExt(String fileExt){
		this.fileExt = fileExt;
	}

	public void fileExt(String multirequestToken){
		setToken("fileExt", multirequestToken);
	}


	public SearchResult() {
		super();
	}

	public SearchResult(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		title = GsonParser.parseString(jsonObject.get("title"));
		thumbUrl = GsonParser.parseString(jsonObject.get("thumbUrl"));
		description = GsonParser.parseString(jsonObject.get("description"));
		tags = GsonParser.parseString(jsonObject.get("tags"));
		url = GsonParser.parseString(jsonObject.get("url"));
		sourceLink = GsonParser.parseString(jsonObject.get("sourceLink"));
		credit = GsonParser.parseString(jsonObject.get("credit"));
		licenseType = LicenseType.get(GsonParser.parseInt(jsonObject.get("licenseType")));
		flashPlaybackType = GsonParser.parseString(jsonObject.get("flashPlaybackType"));
		fileExt = GsonParser.parseString(jsonObject.get("fileExt"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaSearchResult");
		kparams.add("id", this.id);
		kparams.add("title", this.title);
		kparams.add("thumbUrl", this.thumbUrl);
		kparams.add("description", this.description);
		kparams.add("tags", this.tags);
		kparams.add("url", this.url);
		kparams.add("sourceLink", this.sourceLink);
		kparams.add("credit", this.credit);
		kparams.add("licenseType", this.licenseType);
		kparams.add("flashPlaybackType", this.flashPlaybackType);
		kparams.add("fileExt", this.fileExt);
		return kparams;
	}

}

