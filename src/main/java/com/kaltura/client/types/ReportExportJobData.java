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

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportExportJobData.Tokenizer.class)
public class ReportExportJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String recipientEmail();
		String recipientName();
		RequestBuilder.ListTokenizer<ReportExportItem.Tokenizer> reportItems();
		String filePaths();
		String reportsGroup();
		RequestBuilder.ListTokenizer<ReportExportFile.Tokenizer> files();
		String baseUrl();
	}

	private String recipientEmail;
	private String recipientName;
	private List<ReportExportItem> reportItems;
	private String filePaths;
	private String reportsGroup;
	private List<ReportExportFile> files;
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

	// reportItems:
	public List<ReportExportItem> getReportItems(){
		return this.reportItems;
	}
	public void setReportItems(List<ReportExportItem> reportItems){
		this.reportItems = reportItems;
	}

	// filePaths:
	public String getFilePaths(){
		return this.filePaths;
	}
	public void setFilePaths(String filePaths){
		this.filePaths = filePaths;
	}

	public void filePaths(String multirequestToken){
		setToken("filePaths", multirequestToken);
	}

	// reportsGroup:
	public String getReportsGroup(){
		return this.reportsGroup;
	}
	public void setReportsGroup(String reportsGroup){
		this.reportsGroup = reportsGroup;
	}

	public void reportsGroup(String multirequestToken){
		setToken("reportsGroup", multirequestToken);
	}

	// files:
	public List<ReportExportFile> getFiles(){
		return this.files;
	}
	public void setFiles(List<ReportExportFile> files){
		this.files = files;
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


	public ReportExportJobData() {
		super();
	}

	public ReportExportJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		recipientEmail = GsonParser.parseString(jsonObject.get("recipientEmail"));
		recipientName = GsonParser.parseString(jsonObject.get("recipientName"));
		reportItems = GsonParser.parseArray(jsonObject.getAsJsonArray("reportItems"), ReportExportItem.class);
		filePaths = GsonParser.parseString(jsonObject.get("filePaths"));
		reportsGroup = GsonParser.parseString(jsonObject.get("reportsGroup"));
		files = GsonParser.parseArray(jsonObject.getAsJsonArray("files"), ReportExportFile.class);
		baseUrl = GsonParser.parseString(jsonObject.get("baseUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportExportJobData");
		kparams.add("recipientEmail", this.recipientEmail);
		kparams.add("recipientName", this.recipientName);
		kparams.add("reportItems", this.reportItems);
		kparams.add("filePaths", this.filePaths);
		kparams.add("reportsGroup", this.reportsGroup);
		kparams.add("files", this.files);
		kparams.add("baseUrl", this.baseUrl);
		return kparams;
	}

}

