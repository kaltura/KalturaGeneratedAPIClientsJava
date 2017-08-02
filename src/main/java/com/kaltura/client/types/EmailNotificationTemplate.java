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
import com.kaltura.client.enums.EmailNotificationFormat;
import com.kaltura.client.enums.EmailNotificationTemplatePriority;
import com.kaltura.client.types.EmailNotificationRecipientProvider;
import com.kaltura.client.utils.GsonParser;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class EmailNotificationTemplate extends EventNotificationTemplate {

	/**  Define the email body format  */
    private EmailNotificationFormat format;
	/**  Define the email subject  */
    private String subject;
	/**  Define the email body content  */
    private String body;
	/**  Define the email sender email  */
    private String fromEmail;
	/**  Define the email sender name  */
    private String fromName;
	/**  Email recipient emails and names  */
    private EmailNotificationRecipientProvider to;
	/**  Email recipient emails and names  */
    private EmailNotificationRecipientProvider cc;
	/**  Email recipient emails and names  */
    private EmailNotificationRecipientProvider bcc;
	/**  Default email addresses to whom the reply should be sent.  */
    private EmailNotificationRecipientProvider replyTo;
	/**  Define the email priority  */
    private EmailNotificationTemplatePriority priority;
	/**  Email address that a reading confirmation will be sent  */
    private String confirmReadingTo;
	/**  Hostname to use in Message-Id and Received headers and as default HELLO string. 
	    If empty, the value returned by SERVER_NAME is used or
	  'localhost.localdomain'.  */
    private String hostname;
	/**  Sets the message ID to be used in the Message-Id header.   If empty, a unique id
	  will be generated.  */
    private String messageID;
	/**  Adds a e-mail custom header  */
    private List<KeyValue> customHeaders;

    // format:
    public EmailNotificationFormat getFormat(){
        return this.format;
    }
    public void setFormat(EmailNotificationFormat format){
        this.format = format;
    }

    // subject:
    public String getSubject(){
        return this.subject;
    }
    public void setSubject(String subject){
        this.subject = subject;
    }

    // body:
    public String getBody(){
        return this.body;
    }
    public void setBody(String body){
        this.body = body;
    }

    // fromEmail:
    public String getFromEmail(){
        return this.fromEmail;
    }
    public void setFromEmail(String fromEmail){
        this.fromEmail = fromEmail;
    }

    // fromName:
    public String getFromName(){
        return this.fromName;
    }
    public void setFromName(String fromName){
        this.fromName = fromName;
    }

    // to:
    public EmailNotificationRecipientProvider getTo(){
        return this.to;
    }
    public void setTo(EmailNotificationRecipientProvider to){
        this.to = to;
    }

    // cc:
    public EmailNotificationRecipientProvider getCc(){
        return this.cc;
    }
    public void setCc(EmailNotificationRecipientProvider cc){
        this.cc = cc;
    }

    // bcc:
    public EmailNotificationRecipientProvider getBcc(){
        return this.bcc;
    }
    public void setBcc(EmailNotificationRecipientProvider bcc){
        this.bcc = bcc;
    }

    // replyTo:
    public EmailNotificationRecipientProvider getReplyTo(){
        return this.replyTo;
    }
    public void setReplyTo(EmailNotificationRecipientProvider replyTo){
        this.replyTo = replyTo;
    }

    // priority:
    public EmailNotificationTemplatePriority getPriority(){
        return this.priority;
    }
    public void setPriority(EmailNotificationTemplatePriority priority){
        this.priority = priority;
    }

    // confirmReadingTo:
    public String getConfirmReadingTo(){
        return this.confirmReadingTo;
    }
    public void setConfirmReadingTo(String confirmReadingTo){
        this.confirmReadingTo = confirmReadingTo;
    }

    // hostname:
    public String getHostname(){
        return this.hostname;
    }
    public void setHostname(String hostname){
        this.hostname = hostname;
    }

    // messageID:
    public String getMessageID(){
        return this.messageID;
    }
    public void setMessageID(String messageID){
        this.messageID = messageID;
    }

    // customHeaders:
    public List<KeyValue> getCustomHeaders(){
        return this.customHeaders;
    }
    public void setCustomHeaders(List<KeyValue> customHeaders){
        this.customHeaders = customHeaders;
    }


    public EmailNotificationTemplate() {
       super();
    }

    public EmailNotificationTemplate(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        format = EmailNotificationFormat.get(GsonParser.parseString(jsonObject.get("format")));
        subject = GsonParser.parseString(jsonObject.get("subject"));
        body = GsonParser.parseString(jsonObject.get("body"));
        fromEmail = GsonParser.parseString(jsonObject.get("fromEmail"));
        fromName = GsonParser.parseString(jsonObject.get("fromName"));
        to = GsonParser.parseObject(jsonObject.getAsJsonObject("to"), EmailNotificationRecipientProvider.class);
        cc = GsonParser.parseObject(jsonObject.getAsJsonObject("cc"), EmailNotificationRecipientProvider.class);
        bcc = GsonParser.parseObject(jsonObject.getAsJsonObject("bcc"), EmailNotificationRecipientProvider.class);
        replyTo = GsonParser.parseObject(jsonObject.getAsJsonObject("replyTo"), EmailNotificationRecipientProvider.class);
        priority = EmailNotificationTemplatePriority.get(GsonParser.parseInt(jsonObject.get("priority")));
        confirmReadingTo = GsonParser.parseString(jsonObject.get("confirmReadingTo"));
        hostname = GsonParser.parseString(jsonObject.get("hostname"));
        messageID = GsonParser.parseString(jsonObject.get("messageID"));
        customHeaders = GsonParser.parseArray(jsonObject.getAsJsonArray("customHeaders"), KeyValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaEmailNotificationTemplate");
        kparams.add("format", this.format);
        kparams.add("subject", this.subject);
        kparams.add("body", this.body);
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

