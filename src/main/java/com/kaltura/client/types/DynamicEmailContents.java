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
@MultiRequestBuilder.Tokenizer(DynamicEmailContents.Tokenizer.class)
public class DynamicEmailContents extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String emailSubject();
		String emailBody();
	}

	/**
	 * The subject of the customized email
	 */
	private String emailSubject;
	/**
	 * The body of the customized email
	 */
	private String emailBody;

	// emailSubject:
	public String getEmailSubject(){
		return this.emailSubject;
	}
	public void setEmailSubject(String emailSubject){
		this.emailSubject = emailSubject;
	}

	public void emailSubject(String multirequestToken){
		setToken("emailSubject", multirequestToken);
	}

	// emailBody:
	public String getEmailBody(){
		return this.emailBody;
	}
	public void setEmailBody(String emailBody){
		this.emailBody = emailBody;
	}

	public void emailBody(String multirequestToken){
		setToken("emailBody", multirequestToken);
	}


	public DynamicEmailContents() {
		super();
	}

	public DynamicEmailContents(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		emailSubject = GsonParser.parseString(jsonObject.get("emailSubject"));
		emailBody = GsonParser.parseString(jsonObject.get("emailBody"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDynamicEmailContents");
		kparams.add("emailSubject", this.emailSubject);
		kparams.add("emailBody", this.emailBody);
		return kparams;
	}

}

