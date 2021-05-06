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
// Copyright (C) 2006-2021  Kaltura Inc.
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
import com.kaltura.client.enums.EmailNotificationTemplatePriority;
import com.kaltura.client.types.EmailNotificationRecipientJobData;
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
@MultiRequestBuilder.Tokenizer(EmailNotificationDispatchJobData.Tokenizer.class)
public class EmailNotificationDispatchJobData extends EventNotificationDispatchJobData {
	
	public interface Tokenizer extends EventNotificationDispatchJobData.Tokenizer {
		String fromEmail();
		String fromName();
		EmailNotificationRecipientJobData.Tokenizer to();
		EmailNotificationRecipientJobData.Tokenizer cc();
		EmailNotificationRecipientJobData.Tokenizer bcc();
		EmailNotificationRecipientJobData.Tokenizer replyTo();
		String priority();
		String confirmReadingTo();
		String hostname();
		String messageID();
		RequestBuilder.ListTokenizer<KeyValue.Tokenizer> customHeaders();
	}

	/**
	 * Define the email sender email
	 */
	private String fromEmail;
	/**
	 * Define the email sender name
	 */
	private String fromName;
	/**
	 * Email recipient emails and names, key is mail address and value is the name
	 */
	private EmailNotificationRecipientJobData to;
	/**
	 * Email cc emails and names, key is mail address and value is the name
	 */
	private EmailNotificationRecipientJobData cc;
	/**
	 * Email bcc emails and names, key is mail address and value is the name
	 */
	private EmailNotificationRecipientJobData bcc;
	/**
	 * Email addresses that a replies should be sent to, key is mail address and value
	  is the name
	 */
	private EmailNotificationRecipientJobData replyTo;
	/**
	 * Define the email priority
	 */
	private EmailNotificationTemplatePriority priority;
	/**
	 * Email address that a reading confirmation will be sent to
	 */
	private String confirmReadingTo;
	/**
	 * Hostname to use in Message-Id and Received headers and as default HELO string.  
	   If empty, the value returned by SERVER_NAME is used or 'localhost.localdomain'.
	 */
	private String hostname;
	/**
	 * Sets the message ID to be used in the Message-Id header.   If empty, a unique id
	  will be generated.
	 */
	private String messageID;
	/**
	 * Adds a e-mail custom header
	 */
	private List<KeyValue> customHeaders;

	// fromEmail:
	public String getFromEmail(){
		return this.fromEmail;
	}
	public void setFromEmail(String fromEmail){
		this.fromEmail = fromEmail;
	}

	public void fromEmail(String multirequestToken){
		setToken("fromEmail", multirequestToken);
	}

	// fromName:
	public String getFromName(){
		return this.fromName;
	}
	public void setFromName(String fromName){
		this.fromName = fromName;
	}

	public void fromName(String multirequestToken){
		setToken("fromName", multirequestToken);
	}

	// to:
	public EmailNotificationRecipientJobData getTo(){
		return this.to;
	}
	public void setTo(EmailNotificationRecipientJobData to){
		this.to = to;
	}

	// cc:
	public EmailNotificationRecipientJobData getCc(){
		return this.cc;
	}
	public void setCc(EmailNotificationRecipientJobData cc){
		this.cc = cc;
	}

	// bcc:
	public EmailNotificationRecipientJobData getBcc(){
		return this.bcc;
	}
	public void setBcc(EmailNotificationRecipientJobData bcc){
		this.bcc = bcc;
	}

	// replyTo:
	public EmailNotificationRecipientJobData getReplyTo(){
		return this.replyTo;
	}
	public void setReplyTo(EmailNotificationRecipientJobData replyTo){
		this.replyTo = replyTo;
	}

	// priority:
	public EmailNotificationTemplatePriority getPriority(){
		return this.priority;
	}
	public void setPriority(EmailNotificationTemplatePriority priority){
		this.priority = priority;
	}

	public void priority(String multirequestToken){
		setToken("priority", multirequestToken);
	}

	// confirmReadingTo:
	public String getConfirmReadingTo(){
		return this.confirmReadingTo;
	}
	public void setConfirmReadingTo(String confirmReadingTo){
		this.confirmReadingTo = confirmReadingTo;
	}

	public void confirmReadingTo(String multirequestToken){
		setToken("confirmReadingTo", multirequestToken);
	}

	// hostname:
	public String getHostname(){
		return this.hostname;
	}
	public void setHostname(String hostname){
		this.hostname = hostname;
	}

	public void hostname(String multirequestToken){
		setToken("hostname", multirequestToken);
	}

	// messageID:
	public String getMessageID(){
		return this.messageID;
	}
	public void setMessageID(String messageID){
		this.messageID = messageID;
	}

	public void messageID(String multirequestToken){
		setToken("messageID", multirequestToken);
	}

	// customHeaders:
	public List<KeyValue> getCustomHeaders(){
		return this.customHeaders;
	}
	public void setCustomHeaders(List<KeyValue> customHeaders){
		this.customHeaders = customHeaders;
	}


	public EmailNotificationDispatchJobData() {
		super();
	}

	public EmailNotificationDispatchJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fromEmail = GsonParser.parseString(jsonObject.get("fromEmail"));
		fromName = GsonParser.parseString(jsonObject.get("fromName"));
		to = GsonParser.parseObject(jsonObject.getAsJsonObject("to"), EmailNotificationRecipientJobData.class);
		cc = GsonParser.parseObject(jsonObject.getAsJsonObject("cc"), EmailNotificationRecipientJobData.class);
		bcc = GsonParser.parseObject(jsonObject.getAsJsonObject("bcc"), EmailNotificationRecipientJobData.class);
		replyTo = GsonParser.parseObject(jsonObject.getAsJsonObject("replyTo"), EmailNotificationRecipientJobData.class);
		priority = EmailNotificationTemplatePriority.get(GsonParser.parseInt(jsonObject.get("priority")));
		confirmReadingTo = GsonParser.parseString(jsonObject.get("confirmReadingTo"));
		hostname = GsonParser.parseString(jsonObject.get("hostname"));
		messageID = GsonParser.parseString(jsonObject.get("messageID"));
		customHeaders = GsonParser.parseArray(jsonObject.getAsJsonArray("customHeaders"), KeyValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEmailNotificationDispatchJobData");
		kparams.add("fromEmail", this.fromEmail);
		kparams.add("fromName", this.fromName);
		kparams.add("to", this.to);
		kparams.add("cc", this.cc);
		kparams.add("bcc", this.bcc);
		kparams.add("replyTo", this.replyTo);
		kparams.add("priority", this.priority);
		kparams.add("confirmReadingTo", this.confirmReadingTo);
		kparams.add("hostname", this.hostname);
		kparams.add("messageID", this.messageID);
		kparams.add("customHeaders", this.customHeaders);
		return kparams;
	}

}

