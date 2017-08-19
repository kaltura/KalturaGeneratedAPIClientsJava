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
import com.kaltura.client.types.GenericDistributionProfileAction;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(GenericDistributionProfile.Tokenizer.class)
public class GenericDistributionProfile extends DistributionProfile {
	
	public interface Tokenizer extends DistributionProfile.Tokenizer {
		String genericProviderId();
		GenericDistributionProfileAction.Tokenizer submitAction();
		GenericDistributionProfileAction.Tokenizer updateAction();
		GenericDistributionProfileAction.Tokenizer deleteAction();
		GenericDistributionProfileAction.Tokenizer fetchReportAction();
		String updateRequiredEntryFields();
		String updateRequiredMetadataXPaths();
	}

	private Integer genericProviderId;
	private GenericDistributionProfileAction submitAction;
	private GenericDistributionProfileAction updateAction;
	private GenericDistributionProfileAction deleteAction;
	private GenericDistributionProfileAction fetchReportAction;
	private String updateRequiredEntryFields;
	private String updateRequiredMetadataXPaths;

	// genericProviderId:
	public Integer getGenericProviderId(){
		return this.genericProviderId;
	}
	public void setGenericProviderId(Integer genericProviderId){
		this.genericProviderId = genericProviderId;
	}

	public void genericProviderId(String multirequestToken){
		setToken("genericProviderId", multirequestToken);
	}

	// submitAction:
	public GenericDistributionProfileAction getSubmitAction(){
		return this.submitAction;
	}
	public void setSubmitAction(GenericDistributionProfileAction submitAction){
		this.submitAction = submitAction;
	}

	// updateAction:
	public GenericDistributionProfileAction getUpdateAction(){
		return this.updateAction;
	}
	public void setUpdateAction(GenericDistributionProfileAction updateAction){
		this.updateAction = updateAction;
	}

	// deleteAction:
	public GenericDistributionProfileAction getDeleteAction(){
		return this.deleteAction;
	}
	public void setDeleteAction(GenericDistributionProfileAction deleteAction){
		this.deleteAction = deleteAction;
	}

	// fetchReportAction:
	public GenericDistributionProfileAction getFetchReportAction(){
		return this.fetchReportAction;
	}
	public void setFetchReportAction(GenericDistributionProfileAction fetchReportAction){
		this.fetchReportAction = fetchReportAction;
	}

	// updateRequiredEntryFields:
	public String getUpdateRequiredEntryFields(){
		return this.updateRequiredEntryFields;
	}
	public void setUpdateRequiredEntryFields(String updateRequiredEntryFields){
		this.updateRequiredEntryFields = updateRequiredEntryFields;
	}

	public void updateRequiredEntryFields(String multirequestToken){
		setToken("updateRequiredEntryFields", multirequestToken);
	}

	// updateRequiredMetadataXPaths:
	public String getUpdateRequiredMetadataXPaths(){
		return this.updateRequiredMetadataXPaths;
	}
	public void setUpdateRequiredMetadataXPaths(String updateRequiredMetadataXPaths){
		this.updateRequiredMetadataXPaths = updateRequiredMetadataXPaths;
	}

	public void updateRequiredMetadataXPaths(String multirequestToken){
		setToken("updateRequiredMetadataXPaths", multirequestToken);
	}


	public GenericDistributionProfile() {
		super();
	}

	public GenericDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		genericProviderId = GsonParser.parseInt(jsonObject.get("genericProviderId"));
		submitAction = GsonParser.parseObject(jsonObject.getAsJsonObject("submitAction"), GenericDistributionProfileAction.class);
		updateAction = GsonParser.parseObject(jsonObject.getAsJsonObject("updateAction"), GenericDistributionProfileAction.class);
		deleteAction = GsonParser.parseObject(jsonObject.getAsJsonObject("deleteAction"), GenericDistributionProfileAction.class);
		fetchReportAction = GsonParser.parseObject(jsonObject.getAsJsonObject("fetchReportAction"), GenericDistributionProfileAction.class);
		updateRequiredEntryFields = GsonParser.parseString(jsonObject.get("updateRequiredEntryFields"));
		updateRequiredMetadataXPaths = GsonParser.parseString(jsonObject.get("updateRequiredMetadataXPaths"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaGenericDistributionProfile");
		kparams.add("genericProviderId", this.genericProviderId);
		kparams.add("submitAction", this.submitAction);
		kparams.add("updateAction", this.updateAction);
		kparams.add("deleteAction", this.deleteAction);
		kparams.add("fetchReportAction", this.fetchReportAction);
		kparams.add("updateRequiredEntryFields", this.updateRequiredEntryFields);
		kparams.add("updateRequiredMetadataXPaths", this.updateRequiredMetadataXPaths);
		return kparams;
	}

}

