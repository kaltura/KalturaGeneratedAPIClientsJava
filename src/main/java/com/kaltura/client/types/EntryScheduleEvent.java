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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryScheduleEvent.Tokenizer.class)
public abstract class EntryScheduleEvent extends ScheduleEvent {
	
	public interface Tokenizer extends ScheduleEvent.Tokenizer {
		String templateEntryId();
		String entryIds();
		String categoryIds();
		RequestBuilder.ListTokenizer<ScheduleEvent.Tokenizer> blackoutConflicts();
	}

	/**
	 * Entry to be used as template during content ingestion
	 */
	private String templateEntryId;
	/**
	 * Entries that associated with this event
	 */
	private String entryIds;
	/**
	 * Categories that associated with this event
	 */
	private String categoryIds;
	/**
	 * Blackout schedule events the conflict with this event
	 */
	private List<ScheduleEvent> blackoutConflicts;

	// templateEntryId:
	public String getTemplateEntryId(){
		return this.templateEntryId;
	}
	public void setTemplateEntryId(String templateEntryId){
		this.templateEntryId = templateEntryId;
	}

	public void templateEntryId(String multirequestToken){
		setToken("templateEntryId", multirequestToken);
	}

	// entryIds:
	public String getEntryIds(){
		return this.entryIds;
	}
	public void setEntryIds(String entryIds){
		this.entryIds = entryIds;
	}

	public void entryIds(String multirequestToken){
		setToken("entryIds", multirequestToken);
	}

	// categoryIds:
	public String getCategoryIds(){
		return this.categoryIds;
	}
	public void setCategoryIds(String categoryIds){
		this.categoryIds = categoryIds;
	}

	public void categoryIds(String multirequestToken){
		setToken("categoryIds", multirequestToken);
	}

	// blackoutConflicts:
	public List<ScheduleEvent> getBlackoutConflicts(){
		return this.blackoutConflicts;
	}

	public EntryScheduleEvent() {
		super();
	}

	public EntryScheduleEvent(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		templateEntryId = GsonParser.parseString(jsonObject.get("templateEntryId"));
		entryIds = GsonParser.parseString(jsonObject.get("entryIds"));
		categoryIds = GsonParser.parseString(jsonObject.get("categoryIds"));
		blackoutConflicts = GsonParser.parseArray(jsonObject.getAsJsonArray("blackoutConflicts"), ScheduleEvent.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryScheduleEvent");
		kparams.add("templateEntryId", this.templateEntryId);
		kparams.add("entryIds", this.entryIds);
		kparams.add("categoryIds", this.categoryIds);
		return kparams;
	}

}

