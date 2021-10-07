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
import com.kaltura.client.types.ObjectBase;
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
@MultiRequestBuilder.Tokenizer(ReportExportParams.Tokenizer.class)
public class ReportExportParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String recipientEmail();
		String timeZoneOffset();
		RequestBuilder.ListTokenizer<ReportExportItem.Tokenizer> reportItems();
		String reportsItemsGroup();
		String baseUrl();
	}

	private String recipientEmail;
	/**
	 * Time zone offset in minutes (between client to UTC)
	 */
	private Integer timeZoneOffset;
	private List<ReportExportItem> reportItems;
	private String reportsItemsGroup;
	private String baseUrl;

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

	// timeZoneOffset:
	public Integer getTimeZoneOffset(){
		return this.timeZoneOffset;
	}
	public void setTimeZoneOffset(Integer timeZoneOffset){
		this.timeZoneOffset = timeZoneOffset;
	}

	public void timeZoneOffset(String multirequestToken){
		setToken("timeZoneOffset", multirequestToken);
	}

	// reportItems:
	public List<ReportExportItem> getReportItems(){
		return this.reportItems;
	}
	public void setReportItems(List<ReportExportItem> reportItems){
		this.reportItems = reportItems;
	}

	// reportsItemsGroup:
	public String getReportsItemsGroup(){
		return this.reportsItemsGroup;
	}
	public void setReportsItemsGroup(String reportsItemsGroup){
		this.reportsItemsGroup = reportsItemsGroup;
	}

	public void reportsItemsGroup(String multirequestToken){
		setToken("reportsItemsGroup", multirequestToken);
	}

	// baseUrl:
	public String getBaseUrl(){
		return this.baseUrl;
	}
	public void setBaseUrl(String baseUrl){
		this.baseUrl = baseUrl;
	}

	public void baseUrl(String multirequestToken){
		setToken("baseUrl", multirequestToken);
	}


	public ReportExportParams() {
		super();
	}

	public ReportExportParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recipientEmail = GsonParser.parseString(jsonObject.get("recipientEmail"));
		timeZoneOffset = GsonParser.parseInt(jsonObject.get("timeZoneOffset"));
		reportItems = GsonParser.parseArray(jsonObject.getAsJsonArray("reportItems"), ReportExportItem.class);
		reportsItemsGroup = GsonParser.parseString(jsonObject.get("reportsItemsGroup"));
		baseUrl = GsonParser.parseString(jsonObject.get("baseUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportExportParams");
		kparams.add("recipientEmail", this.recipientEmail);
		kparams.add("timeZoneOffset", this.timeZoneOffset);
		kparams.add("reportItems", this.reportItems);
		kparams.add("reportsItemsGroup", this.reportsItemsGroup);
		kparams.add("baseUrl", this.baseUrl);
		return kparams;
	}

}

