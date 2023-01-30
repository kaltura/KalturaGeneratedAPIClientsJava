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
import com.kaltura.client.enums.LanguageCode;
import com.kaltura.client.enums.MailJobStatus;
import com.kaltura.client.enums.MailType;
import com.kaltura.client.types.DynamicEmailContents;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MailJobData.Tokenizer.class)
public class MailJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String mailType();
		String mailPriority();
		String status();
		String recipientName();
		String recipientEmail();
		String recipientId();
		String fromName();
		String fromEmail();
		String bodyParams();
		String subjectParams();
		DynamicEmailContents.Tokenizer dynamicEmailContents();
		String templatePath();
		String language();
		String campaignId();
		String minSendDate();
		String isHtml();
		String separator();
	}

	private MailType mailType;
	private Integer mailPriority;
	private MailJobStatus status;
	private String recipientName;
	private String recipientEmail;
	/**
	 * kuserId
	 */
	private Integer recipientId;
	private String fromName;
	private String fromEmail;
	private String bodyParams;
	private String subjectParams;
	private DynamicEmailContents dynamicEmailContents;
	private String templatePath;
	private LanguageCode language;
	private Integer campaignId;
	private Integer minSendDate;
	private Boolean isHtml;
	private String separator;

	// mailType:
	public MailType getMailType(){
		return this.mailType;
	}
	public void setMailType(MailType mailType){
		this.mailType = mailType;
	}

	public void mailType(String multirequestToken){
		setToken("mailType", multirequestToken);
	}

	// mailPriority:
	public Integer getMailPriority(){
		return this.mailPriority;
	}
	public void setMailPriority(Integer mailPriority){
		this.mailPriority = mailPriority;
	}

	public void mailPriority(String multirequestToken){
		setToken("mailPriority", multirequestToken);
	}

	// status:
	public MailJobStatus getStatus(){
		return this.status;
	}
	public void setStatus(MailJobStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// recipientName:
	public String getRecipientName(){
		return this.recipientName;
	}
	public void setRecipientName(String recipientName){
		this.recipientName = recipientName;
	}

	public void recipientName(String multirequestToken){
		setToken("recipientName", multirequestToken);
	}

	// recipientEmail:
	public String getRecipientEmail(){
		return this.recipientEmail;
	}
	public void setRecipientEmail(String recipientEmail){
		this.recipientEmail = recipientEmail;
	}

	public void recipientEmail(String multirequestToken){
		setToken("recipientEmail", multirequestToken);
	}

	// recipientId:
	public Integer getRecipientId(){
		return this.recipientId;
	}
	public void setRecipientId(Integer recipientId){
		this.recipientId = recipientId;
	}

	public void recipientId(String multirequestToken){
		setToken("recipientId", multirequestToken);
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

	// bodyParams:
	public String getBodyParams(){
		return this.bodyParams;
	}
	public void setBodyParams(String bodyParams){
		this.bodyParams = bodyParams;
	}

	public void bodyParams(String multirequestToken){
		setToken("bodyParams", multirequestToken);
	}

	// subjectParams:
	public String getSubjectParams(){
		return this.subjectParams;
	}
	public void setSubjectParams(String subjectParams){
		this.subjectParams = subjectParams;
	}

	public void subjectParams(String multirequestToken){
		setToken("subjectParams", multirequestToken);
	}

	// dynamicEmailContents:
	public DynamicEmailContents getDynamicEmailContents(){
		return this.dynamicEmailContents;
	}
	public void setDynamicEmailContents(DynamicEmailContents dynamicEmailContents){
		this.dynamicEmailContents = dynamicEmailContents;
	}

	// templatePath:
	public String getTemplatePath(){
		return this.templatePath;
	}
	public void setTemplatePath(String templatePath){
		this.templatePath = templatePath;
	}

	public void templatePath(String multirequestToken){
		setToken("templatePath", multirequestToken);
	}

	// language:
	public LanguageCode getLanguage(){
		return this.language;
	}
	public void setLanguage(LanguageCode language){
		this.language = language;
	}

	public void language(String multirequestToken){
		setToken("language", multirequestToken);
	}

	// campaignId:
	public Integer getCampaignId(){
		return this.campaignId;
	}
	public void setCampaignId(Integer campaignId){
		this.campaignId = campaignId;
	}

	public void campaignId(String multirequestToken){
		setToken("campaignId", multirequestToken);
	}

	// minSendDate:
	public Integer getMinSendDate(){
		return this.minSendDate;
	}
	public void setMinSendDate(Integer minSendDate){
		this.minSendDate = minSendDate;
	}

	public void minSendDate(String multirequestToken){
		setToken("minSendDate", multirequestToken);
	}

	// isHtml:
	public Boolean getIsHtml(){
		return this.isHtml;
	}
	public void setIsHtml(Boolean isHtml){
		this.isHtml = isHtml;
	}

	public void isHtml(String multirequestToken){
		setToken("isHtml", multirequestToken);
	}

	// separator:
	public String getSeparator(){
		return this.separator;
	}
	public void setSeparator(String separator){
		this.separator = separator;
	}

	public void separator(String multirequestToken){
		setToken("separator", multirequestToken);
	}


	public MailJobData() {
		super();
	}

	public MailJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		mailType = MailType.get(GsonParser.parseString(jsonObject.get("mailType")));
		mailPriority = GsonParser.parseInt(jsonObject.get("mailPriority"));
		status = MailJobStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		recipientName = GsonParser.parseString(jsonObject.get("recipientName"));
		recipientEmail = GsonParser.parseString(jsonObject.get("recipientEmail"));
		recipientId = GsonParser.parseInt(jsonObject.get("recipientId"));
		fromName = GsonParser.parseString(jsonObject.get("fromName"));
		fromEmail = GsonParser.parseString(jsonObject.get("fromEmail"));
		bodyParams = GsonParser.parseString(jsonObject.get("bodyParams"));
		subjectParams = GsonParser.parseString(jsonObject.get("subjectParams"));
		dynamicEmailContents = GsonParser.parseObject(jsonObject.getAsJsonObject("dynamicEmailContents"), DynamicEmailContents.class);
		templatePath = GsonParser.parseString(jsonObject.get("templatePath"));
		language = LanguageCode.get(GsonParser.parseString(jsonObject.get("language")));
		campaignId = GsonParser.parseInt(jsonObject.get("campaignId"));
		minSendDate = GsonParser.parseInt(jsonObject.get("minSendDate"));
		isHtml = GsonParser.parseBoolean(jsonObject.get("isHtml"));
		separator = GsonParser.parseString(jsonObject.get("separator"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMailJobData");
		kparams.add("mailType", this.mailType);
		kparams.add("mailPriority", this.mailPriority);
		kparams.add("status", this.status);
		kparams.add("recipientName", this.recipientName);
		kparams.add("recipientEmail", this.recipientEmail);
		kparams.add("recipientId", this.recipientId);
		kparams.add("fromName", this.fromName);
		kparams.add("fromEmail", this.fromEmail);
		kparams.add("bodyParams", this.bodyParams);
		kparams.add("subjectParams", this.subjectParams);
		kparams.add("dynamicEmailContents", this.dynamicEmailContents);
		kparams.add("templatePath", this.templatePath);
		kparams.add("language", this.language);
		kparams.add("campaignId", this.campaignId);
		kparams.add("minSendDate", this.minSendDate);
		kparams.add("isHtml", this.isHtml);
		kparams.add("separator", this.separator);
		return kparams;
	}

}

