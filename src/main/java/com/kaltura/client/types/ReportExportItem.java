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
import com.kaltura.client.enums.ReportExportItemType;
import com.kaltura.client.enums.ReportType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.ReportInputFilter;
import com.kaltura.client.types.ReportResponseOptions;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReportExportItem.Tokenizer.class)
public class ReportExportItem extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String reportTitle();
		String action();
		String reportType();
		ReportInputFilter.Tokenizer filter();
		String order();
		String objectIds();
		ReportResponseOptions.Tokenizer responseOptions();
	}

	private String reportTitle;
	private ReportExportItemType action;
	private ReportType reportType;
	private ReportInputFilter filter;
	private String order;
	private String objectIds;
	private ReportResponseOptions responseOptions;

	// reportTitle:
	public String getReportTitle(){
		return this.reportTitle;
	}
	public void setReportTitle(String reportTitle){
		this.reportTitle = reportTitle;
	}

	public void reportTitle(String multirequestToken){
		setToken("reportTitle", multirequestToken);
	}

	// action:
	public ReportExportItemType getAction(){
		return this.action;
	}
	public void setAction(ReportExportItemType action){
		this.action = action;
	}

	public void action(String multirequestToken){
		setToken("action", multirequestToken);
	}

	// reportType:
	public ReportType getReportType(){
		return this.reportType;
	}
	public void setReportType(ReportType reportType){
		this.reportType = reportType;
	}

	public void reportType(String multirequestToken){
		setToken("reportType", multirequestToken);
	}

	// filter:
	public ReportInputFilter getFilter(){
		return this.filter;
	}
	public void setFilter(ReportInputFilter filter){
		this.filter = filter;
	}

	// order:
	public String getOrder(){
		return this.order;
	}
	public void setOrder(String order){
		this.order = order;
	}

	public void order(String multirequestToken){
		setToken("order", multirequestToken);
	}

	// objectIds:
	public String getObjectIds(){
		return this.objectIds;
	}
	public void setObjectIds(String objectIds){
		this.objectIds = objectIds;
	}

	public void objectIds(String multirequestToken){
		setToken("objectIds", multirequestToken);
	}

	// responseOptions:
	public ReportResponseOptions getResponseOptions(){
		return this.responseOptions;
	}
	public void setResponseOptions(ReportResponseOptions responseOptions){
		this.responseOptions = responseOptions;
	}


	public ReportExportItem() {
		super();
	}

	public ReportExportItem(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		reportTitle = GsonParser.parseString(jsonObject.get("reportTitle"));
		action = ReportExportItemType.get(GsonParser.parseInt(jsonObject.get("action")));
		reportType = ReportType.get(GsonParser.parseString(jsonObject.get("reportType")));
		filter = GsonParser.parseObject(jsonObject.getAsJsonObject("filter"), ReportInputFilter.class);
		order = GsonParser.parseString(jsonObject.get("order"));
		objectIds = GsonParser.parseString(jsonObject.get("objectIds"));
		responseOptions = GsonParser.parseObject(jsonObject.getAsJsonObject("responseOptions"), ReportResponseOptions.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReportExportItem");
		kparams.add("reportTitle", this.reportTitle);
		kparams.add("action", this.action);
		kparams.add("reportType", this.reportType);
		kparams.add("filter", this.filter);
		kparams.add("order", this.order);
		kparams.add("objectIds", this.objectIds);
		kparams.add("responseOptions", this.responseOptions);
		return kparams;
	}

}

