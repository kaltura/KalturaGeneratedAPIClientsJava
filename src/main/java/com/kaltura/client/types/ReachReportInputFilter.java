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
import com.kaltura.client.enums.VendorServiceFeature;
import com.kaltura.client.enums.VendorServiceTurnAroundTime;
import com.kaltura.client.enums.VendorServiceType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ReachReportInputFilter.Tokenizer.class)
public class ReachReportInputFilter extends ReportInputFilter {
	
	public interface Tokenizer extends ReportInputFilter.Tokenizer {
		String serviceType();
		String serviceFeature();
		String turnAroundTime();
	}

	private VendorServiceType serviceType;
	private VendorServiceFeature serviceFeature;
	private VendorServiceTurnAroundTime turnAroundTime;

	// serviceType:
	public VendorServiceType getServiceType(){
		return this.serviceType;
	}
	public void setServiceType(VendorServiceType serviceType){
		this.serviceType = serviceType;
	}

	public void serviceType(String multirequestToken){
		setToken("serviceType", multirequestToken);
	}

	// serviceFeature:
	public VendorServiceFeature getServiceFeature(){
		return this.serviceFeature;
	}
	public void setServiceFeature(VendorServiceFeature serviceFeature){
		this.serviceFeature = serviceFeature;
	}

	public void serviceFeature(String multirequestToken){
		setToken("serviceFeature", multirequestToken);
	}

	// turnAroundTime:
	public VendorServiceTurnAroundTime getTurnAroundTime(){
		return this.turnAroundTime;
	}
	public void setTurnAroundTime(VendorServiceTurnAroundTime turnAroundTime){
		this.turnAroundTime = turnAroundTime;
	}

	public void turnAroundTime(String multirequestToken){
		setToken("turnAroundTime", multirequestToken);
	}


	public ReachReportInputFilter() {
		super();
	}

	public ReachReportInputFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		serviceType = VendorServiceType.get(GsonParser.parseInt(jsonObject.get("serviceType")));
		serviceFeature = VendorServiceFeature.get(GsonParser.parseInt(jsonObject.get("serviceFeature")));
		turnAroundTime = VendorServiceTurnAroundTime.get(GsonParser.parseInt(jsonObject.get("turnAroundTime")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaReachReportInputFilter");
		kparams.add("serviceType", this.serviceType);
		kparams.add("serviceFeature", this.serviceFeature);
		kparams.add("turnAroundTime", this.turnAroundTime);
		return kparams;
	}

}

