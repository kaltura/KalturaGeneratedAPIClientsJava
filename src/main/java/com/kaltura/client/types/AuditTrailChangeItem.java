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
@MultiRequestBuilder.Tokenizer(AuditTrailChangeItem.Tokenizer.class)
public class AuditTrailChangeItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String descriptor();
		String oldValue();
		String newValue();
	}

	private String descriptor;
	private String oldValue;
	private String newValue;

	// descriptor:
	public String getDescriptor(){
		return this.descriptor;
	}
	public void setDescriptor(String descriptor){
		this.descriptor = descriptor;
	}

	public void descriptor(String multirequestToken){
		setToken("descriptor", multirequestToken);
	}

	// oldValue:
	public String getOldValue(){
		return this.oldValue;
	}
	public void setOldValue(String oldValue){
		this.oldValue = oldValue;
	}

	public void oldValue(String multirequestToken){
		setToken("oldValue", multirequestToken);
	}

	// newValue:
	public String getNewValue(){
		return this.newValue;
	}
	public void setNewValue(String newValue){
		this.newValue = newValue;
	}

	public void newValue(String multirequestToken){
		setToken("newValue", multirequestToken);
	}


	public AuditTrailChangeItem() {
		super();
	}

	public AuditTrailChangeItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		descriptor = GsonParser.parseString(jsonObject.get("descriptor"));
		oldValue = GsonParser.parseString(jsonObject.get("oldValue"));
		newValue = GsonParser.parseString(jsonObject.get("newValue"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAuditTrailChangeItem");
		kparams.add("descriptor", this.descriptor);
		kparams.add("oldValue", this.oldValue);
		kparams.add("newValue", this.newValue);
		return kparams;
	}

}

