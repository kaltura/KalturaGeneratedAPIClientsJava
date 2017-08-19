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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Annotation.Tokenizer.class)
public class Annotation extends CuePoint {
	
	public interface Tokenizer extends CuePoint.Tokenizer {
		String parentId();
		String text();
		String endTime();
		String duration();
		String depth();
		String childrenCount();
		String directChildrenCount();
		String isPublic();
		String searchableOnEntry();
	}

	private String parentId;
	private String text;
	/**  End time in milliseconds  */
	private Integer endTime;
	/**  Duration in milliseconds  */
	private Integer duration;
	/**  Depth in the tree  */
	private Integer depth;
	/**  Number of all descendants  */
	private Integer childrenCount;
	/**  Number of children, first generation only.  */
	private Integer directChildrenCount;
	/**  Is the annotation public.  */
	private Boolean isPublic;
	/**  Should the cue point get indexed on the entry.  */
	private Boolean searchableOnEntry;

	// parentId:
	public String getParentId(){
		return this.parentId;
	}
	public void setParentId(String parentId){
		this.parentId = parentId;
	}

	public void parentId(String multirequestToken){
		setToken("parentId", multirequestToken);
	}

	// text:
	public String getText(){
		return this.text;
	}
	public void setText(String text){
		this.text = text;
	}

	public void text(String multirequestToken){
		setToken("text", multirequestToken);
	}

	// endTime:
	public Integer getEndTime(){
		return this.endTime;
	}
	public void setEndTime(Integer endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// duration:
	public Integer getDuration(){
		return this.duration;
	}
	public void setDuration(Integer duration){
		this.duration = duration;
	}

	public void duration(String multirequestToken){
		setToken("duration", multirequestToken);
	}

	// depth:
	public Integer getDepth(){
		return this.depth;
	}
	public void setDepth(Integer depth){
		this.depth = depth;
	}

	public void depth(String multirequestToken){
		setToken("depth", multirequestToken);
	}

	// childrenCount:
	public Integer getChildrenCount(){
		return this.childrenCount;
	}
	public void setChildrenCount(Integer childrenCount){
		this.childrenCount = childrenCount;
	}

	public void childrenCount(String multirequestToken){
		setToken("childrenCount", multirequestToken);
	}

	// directChildrenCount:
	public Integer getDirectChildrenCount(){
		return this.directChildrenCount;
	}
	public void setDirectChildrenCount(Integer directChildrenCount){
		this.directChildrenCount = directChildrenCount;
	}

	public void directChildrenCount(String multirequestToken){
		setToken("directChildrenCount", multirequestToken);
	}

	// isPublic:
	public Boolean getIsPublic(){
		return this.isPublic;
	}
	public void setIsPublic(Boolean isPublic){
		this.isPublic = isPublic;
	}

	public void isPublic(String multirequestToken){
		setToken("isPublic", multirequestToken);
	}

	// searchableOnEntry:
	public Boolean getSearchableOnEntry(){
		return this.searchableOnEntry;
	}
	public void setSearchableOnEntry(Boolean searchableOnEntry){
		this.searchableOnEntry = searchableOnEntry;
	}

	public void searchableOnEntry(String multirequestToken){
		setToken("searchableOnEntry", multirequestToken);
	}


	public Annotation() {
		super();
	}

	public Annotation(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		parentId = GsonParser.parseString(jsonObject.get("parentId"));
		text = GsonParser.parseString(jsonObject.get("text"));
		endTime = GsonParser.parseInt(jsonObject.get("endTime"));
		duration = GsonParser.parseInt(jsonObject.get("duration"));
		depth = GsonParser.parseInt(jsonObject.get("depth"));
		childrenCount = GsonParser.parseInt(jsonObject.get("childrenCount"));
		directChildrenCount = GsonParser.parseInt(jsonObject.get("directChildrenCount"));
		isPublic = GsonParser.parseBoolean(jsonObject.get("isPublic"));
		searchableOnEntry = GsonParser.parseBoolean(jsonObject.get("searchableOnEntry"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAnnotation");
		kparams.add("parentId", this.parentId);
		kparams.add("text", this.text);
		kparams.add("endTime", this.endTime);
		kparams.add("isPublic", this.isPublic);
		kparams.add("searchableOnEntry", this.searchableOnEntry);
		return kparams;
	}

}

