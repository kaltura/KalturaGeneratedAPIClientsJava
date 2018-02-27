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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * A representation of a live stream recording entry configuration
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(LiveEntryRecordingOptions.Tokenizer.class)
public class LiveEntryRecordingOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String shouldCopyEntitlement();
		String shouldCopyScheduling();
		String shouldCopyThumbnail();
		String shouldMakeHidden();
	}

	private Boolean shouldCopyEntitlement;
	private Boolean shouldCopyScheduling;
	private Boolean shouldCopyThumbnail;
	private Boolean shouldMakeHidden;

	// shouldCopyEntitlement:
	public Boolean getShouldCopyEntitlement(){
		return this.shouldCopyEntitlement;
	}
	public void setShouldCopyEntitlement(Boolean shouldCopyEntitlement){
		this.shouldCopyEntitlement = shouldCopyEntitlement;
	}

	public void shouldCopyEntitlement(String multirequestToken){
		setToken("shouldCopyEntitlement", multirequestToken);
	}

	// shouldCopyScheduling:
	public Boolean getShouldCopyScheduling(){
		return this.shouldCopyScheduling;
	}
	public void setShouldCopyScheduling(Boolean shouldCopyScheduling){
		this.shouldCopyScheduling = shouldCopyScheduling;
	}

	public void shouldCopyScheduling(String multirequestToken){
		setToken("shouldCopyScheduling", multirequestToken);
	}

	// shouldCopyThumbnail:
	public Boolean getShouldCopyThumbnail(){
		return this.shouldCopyThumbnail;
	}
	public void setShouldCopyThumbnail(Boolean shouldCopyThumbnail){
		this.shouldCopyThumbnail = shouldCopyThumbnail;
	}

	public void shouldCopyThumbnail(String multirequestToken){
		setToken("shouldCopyThumbnail", multirequestToken);
	}

	// shouldMakeHidden:
	public Boolean getShouldMakeHidden(){
		return this.shouldMakeHidden;
	}
	public void setShouldMakeHidden(Boolean shouldMakeHidden){
		this.shouldMakeHidden = shouldMakeHidden;
	}

	public void shouldMakeHidden(String multirequestToken){
		setToken("shouldMakeHidden", multirequestToken);
	}


	public LiveEntryRecordingOptions() {
		super();
	}

	public LiveEntryRecordingOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		shouldCopyEntitlement = GsonParser.parseBoolean(jsonObject.get("shouldCopyEntitlement"));
		shouldCopyScheduling = GsonParser.parseBoolean(jsonObject.get("shouldCopyScheduling"));
		shouldCopyThumbnail = GsonParser.parseBoolean(jsonObject.get("shouldCopyThumbnail"));
		shouldMakeHidden = GsonParser.parseBoolean(jsonObject.get("shouldMakeHidden"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaLiveEntryRecordingOptions");
		kparams.add("shouldCopyEntitlement", this.shouldCopyEntitlement);
		kparams.add("shouldCopyScheduling", this.shouldCopyScheduling);
		kparams.add("shouldCopyThumbnail", this.shouldCopyThumbnail);
		kparams.add("shouldMakeHidden", this.shouldMakeHidden);
		return kparams;
	}

}

