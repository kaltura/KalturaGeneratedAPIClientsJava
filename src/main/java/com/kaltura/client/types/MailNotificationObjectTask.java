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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MailNotificationObjectTask.Tokenizer.class)
public class MailNotificationObjectTask extends ObjectTask {
	
	public interface Tokenizer extends ObjectTask.Tokenizer {
		String mailTo();
		String sender();
		String subject();
		String message();
		String footer();
		String link();
		String sendToUsers();
	}

	/**
	 * The mail to send the notification to
	 */
	private String mailTo;
	/**
	 * The sender in the mail
	 */
	private String sender;
	/**
	 * The subject of the entry
	 */
	private String subject;
	/**
	 * The message to send in the notification mail
	 */
	private String message;
	/**
	 * The footer of the message to send in the notification mail
	 */
	private String footer;
	/**
	 * The basic link for the KMC site
	 */
	private String link;
	/**
	 * Send the mail to each user
	 */
	private Boolean sendToUsers;

	// mailTo:
	public String getMailTo(){
		return this.mailTo;
	}
	public void setMailTo(String mailTo){
		this.mailTo = mailTo;
	}

	public void mailTo(String multirequestToken){
		setToken("mailTo", multirequestToken);
	}

	// sender:
	public String getSender(){
		return this.sender;
	}
	public void setSender(String sender){
		this.sender = sender;
	}

	public void sender(String multirequestToken){
		setToken("sender", multirequestToken);
	}

	// subject:
	public String getSubject(){
		return this.subject;
	}
	public void setSubject(String subject){
		this.subject = subject;
	}

	public void subject(String multirequestToken){
		setToken("subject", multirequestToken);
	}

	// message:
	public String getMessage(){
		return this.message;
	}
	public void setMessage(String message){
		this.message = message;
	}

	public void message(String multirequestToken){
		setToken("message", multirequestToken);
	}

	// footer:
	public String getFooter(){
		return this.footer;
	}
	public void setFooter(String footer){
		this.footer = footer;
	}

	public void footer(String multirequestToken){
		setToken("footer", multirequestToken);
	}

	// link:
	public String getLink(){
		return this.link;
	}
	public void setLink(String link){
		this.link = link;
	}

	public void link(String multirequestToken){
		setToken("link", multirequestToken);
	}

	// sendToUsers:
	public Boolean getSendToUsers(){
		return this.sendToUsers;
	}
	public void setSendToUsers(Boolean sendToUsers){
		this.sendToUsers = sendToUsers;
	}

	public void sendToUsers(String multirequestToken){
		setToken("sendToUsers", multirequestToken);
	}


	public MailNotificationObjectTask() {
		super();
	}

	public MailNotificationObjectTask(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		mailTo = GsonParser.parseString(jsonObject.get("mailTo"));
		sender = GsonParser.parseString(jsonObject.get("sender"));
		subject = GsonParser.parseString(jsonObject.get("subject"));
		message = GsonParser.parseString(jsonObject.get("message"));
		footer = GsonParser.parseString(jsonObject.get("footer"));
		link = GsonParser.parseString(jsonObject.get("link"));
		sendToUsers = GsonParser.parseBoolean(jsonObject.get("sendToUsers"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMailNotificationObjectTask");
		kparams.add("mailTo", this.mailTo);
		kparams.add("sender", this.sender);
		kparams.add("subject", this.subject);
		kparams.add("message", this.message);
		kparams.add("footer", this.footer);
		kparams.add("link", this.link);
		kparams.add("sendToUsers", this.sendToUsers);
		return kparams;
	}

}

