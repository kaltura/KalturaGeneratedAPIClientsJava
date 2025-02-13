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

/**
 * API class for recipient provider containing a static list of email recipients.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EmailNotificationStaticRecipientProvider.Tokenizer.class)
public class EmailNotificationStaticRecipientProvider extends EmailNotificationRecipientProvider {
	
	public interface Tokenizer extends EmailNotificationRecipientProvider.Tokenizer {
		RequestBuilder.ListTokenizer<EmailNotificationRecipient.Tokenizer> emailRecipients();
	}

	/**
	 * Email to emails and names
	 */
	private List<EmailNotificationRecipient> emailRecipients;

	// emailRecipients:
	public List<EmailNotificationRecipient> getEmailRecipients(){
		return this.emailRecipients;
	}
	public void setEmailRecipients(List<EmailNotificationRecipient> emailRecipients){
		this.emailRecipients = emailRecipients;
	}


	public EmailNotificationStaticRecipientProvider() {
		super();
	}

	public EmailNotificationStaticRecipientProvider(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		emailRecipients = GsonParser.parseArray(jsonObject.getAsJsonArray("emailRecipients"), EmailNotificationRecipient.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationStaticRecipientProvider");
		kparams.add("emailRecipients", this.emailRecipients);
		return kparams;
	}

}

