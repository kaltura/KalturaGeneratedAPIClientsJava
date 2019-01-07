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
// Copyright (C) 2006-2019  Kaltura Inc.
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
import com.kaltura.client.enums.DocumentType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DocumentEntry.Tokenizer.class)
public class DocumentEntry extends BaseEntry {
	
	public interface Tokenizer extends BaseEntry.Tokenizer {
		String documentType();
		String assetParamsIds();
	}

	/**
	 * The type of the document
	 */
	private DocumentType documentType;
	/**
	 * Comma separated asset params ids that exists for this media entry
	 */
	private String assetParamsIds;

	// documentType:
	public DocumentType getDocumentType(){
		return this.documentType;
	}
	public void setDocumentType(DocumentType documentType){
		this.documentType = documentType;
	}

	public void documentType(String multirequestToken){
		setToken("documentType", multirequestToken);
	}

	// assetParamsIds:
	public String getAssetParamsIds(){
		return this.assetParamsIds;
	}

	public DocumentEntry() {
		super();
	}

	public DocumentEntry(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		documentType = DocumentType.get(GsonParser.parseInt(jsonObject.get("documentType")));
		assetParamsIds = GsonParser.parseString(jsonObject.get("assetParamsIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDocumentEntry");
		kparams.add("documentType", this.documentType);
		return kparams;
	}

}

