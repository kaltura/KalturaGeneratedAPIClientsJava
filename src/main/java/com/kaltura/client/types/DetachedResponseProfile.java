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
import com.kaltura.client.enums.ResponseProfileType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.RelatedFilter;
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
@MultiRequestBuilder.Tokenizer(DetachedResponseProfile.Tokenizer.class)
public class DetachedResponseProfile extends BaseResponseProfile {
	
	public interface Tokenizer extends BaseResponseProfile.Tokenizer {
		String name();
		String type();
		String fields();
		RelatedFilter.Tokenizer filter();
		FilterPager.Tokenizer pager();
		RequestBuilder.ListTokenizer<DetachedResponseProfile.Tokenizer> relatedProfiles();
		RequestBuilder.ListTokenizer<ResponseProfileMapping.Tokenizer> mappings();
	}

	/**
	 * Friendly name
	 */
	private String name;
	private ResponseProfileType type;
	/**
	 * Comma separated fields list to be included or excluded
	 */
	private String fields;
	private RelatedFilter filter;
	private FilterPager pager;
	private List<DetachedResponseProfile> relatedProfiles;
	private List<ResponseProfileMapping> mappings;

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// type:
	public ResponseProfileType getType(){
		return this.type;
	}
	public void setType(ResponseProfileType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// fields:
	public String getFields(){
		return this.fields;
	}
	public void setFields(String fields){
		this.fields = fields;
	}

	public void fields(String multirequestToken){
		setToken("fields", multirequestToken);
	}

	// filter:
	public RelatedFilter getFilter(){
		return this.filter;
	}
	public void setFilter(RelatedFilter filter){
		this.filter = filter;
	}

	// pager:
	public FilterPager getPager(){
		return this.pager;
	}
	public void setPager(FilterPager pager){
		this.pager = pager;
	}

	// relatedProfiles:
	public List<DetachedResponseProfile> getRelatedProfiles(){
		return this.relatedProfiles;
	}
	public void setRelatedProfiles(List<DetachedResponseProfile> relatedProfiles){
		this.relatedProfiles = relatedProfiles;
	}

	// mappings:
	public List<ResponseProfileMapping> getMappings(){
		return this.mappings;
	}
	public void setMappings(List<ResponseProfileMapping> mappings){
		this.mappings = mappings;
	}


	public DetachedResponseProfile() {
		super();
	}

	public DetachedResponseProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		type = ResponseProfileType.get(GsonParser.parseInt(jsonObject.get("type")));
		fields = GsonParser.parseString(jsonObject.get("fields"));
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), RelatedFilter.class);
		pager = GsonParser.parseObject(jsonObject.getAsJsonObject("pager"), FilterPager.class);
		relatedProfiles = GsonParser.parseArray(jsonObject.getAsJsonArray("relatedProfiles"), DetachedResponseProfile.class);
		mappings = GsonParser.parseArray(jsonObject.getAsJsonArray("mappings"), ResponseProfileMapping.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDetachedResponseProfile");
		kparams.add("name", this.name);
		kparams.add("type", this.type);
		kparams.add("fields", this.fields);
		kparams.add("filter", this.filter);
		kparams.add("pager", this.pager);
		kparams.add("relatedProfiles", this.relatedProfiles);
		kparams.add("mappings", this.mappings);
		return kparams;
	}

}

