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
@MultiRequestBuilder.Tokenizer(DocumentEntryBaseFilter.Tokenizer.class)
public abstract class DocumentEntryBaseFilter extends BaseEntryFilter {
	
	public interface Tokenizer extends BaseEntryFilter.Tokenizer {
		String documentTypeEqual();
		String documentTypeIn();
		String assetParamsIdsMatchOr();
		String assetParamsIdsMatchAnd();
	}

	private DocumentType documentTypeEqual;
	private String documentTypeIn;
	private String assetParamsIdsMatchOr;
	private String assetParamsIdsMatchAnd;

	// documentTypeEqual:
	public DocumentType getDocumentTypeEqual(){
		return this.documentTypeEqual;
	}
	public void setDocumentTypeEqual(DocumentType documentTypeEqual){
		this.documentTypeEqual = documentTypeEqual;
	}

	public void documentTypeEqual(String multirequestToken){
		setToken("documentTypeEqual", multirequestToken);
	}

	// documentTypeIn:
	public String getDocumentTypeIn(){
		return this.documentTypeIn;
	}
	public void setDocumentTypeIn(String documentTypeIn){
		this.documentTypeIn = documentTypeIn;
	}

	public void documentTypeIn(String multirequestToken){
		setToken("documentTypeIn", multirequestToken);
	}

	// assetParamsIdsMatchOr:
	public String getAssetParamsIdsMatchOr(){
		return this.assetParamsIdsMatchOr;
	}
	public void setAssetParamsIdsMatchOr(String assetParamsIdsMatchOr){
		this.assetParamsIdsMatchOr = assetParamsIdsMatchOr;
	}

	public void assetParamsIdsMatchOr(String multirequestToken){
		setToken("assetParamsIdsMatchOr", multirequestToken);
	}

	// assetParamsIdsMatchAnd:
	public String getAssetParamsIdsMatchAnd(){
		return this.assetParamsIdsMatchAnd;
	}
	public void setAssetParamsIdsMatchAnd(String assetParamsIdsMatchAnd){
		this.assetParamsIdsMatchAnd = assetParamsIdsMatchAnd;
	}

	public void assetParamsIdsMatchAnd(String multirequestToken){
		setToken("assetParamsIdsMatchAnd", multirequestToken);
	}


	public DocumentEntryBaseFilter() {
		super();
	}

	public DocumentEntryBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		documentTypeEqual = DocumentType.get(GsonParser.parseInt(jsonObject.get("documentTypeEqual")));
		documentTypeIn = GsonParser.parseString(jsonObject.get("documentTypeIn"));
		assetParamsIdsMatchOr = GsonParser.parseString(jsonObject.get("assetParamsIdsMatchOr"));
		assetParamsIdsMatchAnd = GsonParser.parseString(jsonObject.get("assetParamsIdsMatchAnd"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDocumentEntryBaseFilter");
		kparams.add("documentTypeEqual", this.documentTypeEqual);
		kparams.add("documentTypeIn", this.documentTypeIn);
		kparams.add("assetParamsIdsMatchOr", this.assetParamsIdsMatchOr);
		kparams.add("assetParamsIdsMatchAnd", this.assetParamsIdsMatchAnd);
		return kparams;
	}

}

