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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AkamaiProvisionJobData.Tokenizer.class)
public class AkamaiProvisionJobData extends ProvisionJobData {
	
	public interface Tokenizer extends ProvisionJobData.Tokenizer {
		String wsdlUsername();
		String wsdlPassword();
		String cpcode();
		String emailId();
		String primaryContact();
		String secondaryContact();
	}

	private String wsdlUsername;
	private String wsdlPassword;
	private String cpcode;
	private String emailId;
	private String primaryContact;
	private String secondaryContact;

	// wsdlUsername:
	public String getWsdlUsername(){
		return this.wsdlUsername;
	}
	public void setWsdlUsername(String wsdlUsername){
		this.wsdlUsername = wsdlUsername;
	}

	public void wsdlUsername(String multirequestToken){
		setToken("wsdlUsername", multirequestToken);
	}

	// wsdlPassword:
	public String getWsdlPassword(){
		return this.wsdlPassword;
	}
	public void setWsdlPassword(String wsdlPassword){
		this.wsdlPassword = wsdlPassword;
	}

	public void wsdlPassword(String multirequestToken){
		setToken("wsdlPassword", multirequestToken);
	}

	// cpcode:
	public String getCpcode(){
		return this.cpcode;
	}
	public void setCpcode(String cpcode){
		this.cpcode = cpcode;
	}

	public void cpcode(String multirequestToken){
		setToken("cpcode", multirequestToken);
	}

	// emailId:
	public String getEmailId(){
		return this.emailId;
	}
	public void setEmailId(String emailId){
		this.emailId = emailId;
	}

	public void emailId(String multirequestToken){
		setToken("emailId", multirequestToken);
	}

	// primaryContact:
	public String getPrimaryContact(){
		return this.primaryContact;
	}
	public void setPrimaryContact(String primaryContact){
		this.primaryContact = primaryContact;
	}

	public void primaryContact(String multirequestToken){
		setToken("primaryContact", multirequestToken);
	}

	// secondaryContact:
	public String getSecondaryContact(){
		return this.secondaryContact;
	}
	public void setSecondaryContact(String secondaryContact){
		this.secondaryContact = secondaryContact;
	}

	public void secondaryContact(String multirequestToken){
		setToken("secondaryContact", multirequestToken);
	}


	public AkamaiProvisionJobData() {
		super();
	}

	public AkamaiProvisionJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		wsdlUsername = GsonParser.parseString(jsonObject.get("wsdlUsername"));
		wsdlPassword = GsonParser.parseString(jsonObject.get("wsdlPassword"));
		cpcode = GsonParser.parseString(jsonObject.get("cpcode"));
		emailId = GsonParser.parseString(jsonObject.get("emailId"));
		primaryContact = GsonParser.parseString(jsonObject.get("primaryContact"));
		secondaryContact = GsonParser.parseString(jsonObject.get("secondaryContact"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAkamaiProvisionJobData");
		kparams.add("wsdlUsername", this.wsdlUsername);
		kparams.add("wsdlPassword", this.wsdlPassword);
		kparams.add("cpcode", this.cpcode);
		kparams.add("emailId", this.emailId);
		kparams.add("primaryContact", this.primaryContact);
		kparams.add("secondaryContact", this.secondaryContact);
		return kparams;
	}

}

