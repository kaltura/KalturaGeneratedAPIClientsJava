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
import com.kaltura.client.enums.EditorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MixEntry.Tokenizer.class)
public class MixEntry extends PlayableEntry {
	
	public interface Tokenizer extends PlayableEntry.Tokenizer {
		String hasRealThumbnail();
		String editorType();
		String dataContent();
	}

	/**  Indicates whether the user has submited a real thumbnail to the mix (Not the one
	  that was generated automaticaly)  */
	private Boolean hasRealThumbnail;
	/**  The editor type used to edit the metadata  */
	private EditorType editorType;
	/**  The xml data of the mix  */
	private String dataContent;

	// hasRealThumbnail:
	public Boolean getHasRealThumbnail(){
		return this.hasRealThumbnail;
	}
	public void setHasRealThumbnail(Boolean hasRealThumbnail){
		this.hasRealThumbnail = hasRealThumbnail;
	}

	public void hasRealThumbnail(String multirequestToken){
		setToken("hasRealThumbnail", multirequestToken);
	}

	// editorType:
	public EditorType getEditorType(){
		return this.editorType;
	}
	public void setEditorType(EditorType editorType){
		this.editorType = editorType;
	}

	public void editorType(String multirequestToken){
		setToken("editorType", multirequestToken);
	}

	// dataContent:
	public String getDataContent(){
		return this.dataContent;
	}
	public void setDataContent(String dataContent){
		this.dataContent = dataContent;
	}

	public void dataContent(String multirequestToken){
		setToken("dataContent", multirequestToken);
	}


	public MixEntry() {
		super();
	}

	public MixEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hasRealThumbnail = GsonParser.parseBoolean(jsonObject.get("hasRealThumbnail"));
		editorType = EditorType.get(GsonParser.parseInt(jsonObject.get("editorType")));
		dataContent = GsonParser.parseString(jsonObject.get("dataContent"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMixEntry");
		kparams.add("editorType", this.editorType);
		kparams.add("dataContent", this.dataContent);
		return kparams;
	}

}

