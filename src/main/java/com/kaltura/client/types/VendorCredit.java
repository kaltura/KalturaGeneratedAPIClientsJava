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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(VendorCredit.Tokenizer.class)
public class VendorCredit extends BaseVendorCredit {
	
	public interface Tokenizer extends BaseVendorCredit.Tokenizer {
		String credit();
		String fromDate();
		String overageCredit();
		String addOn();
	}

	private Integer credit;
	private Integer fromDate;
	private Integer overageCredit;
	private Integer addOn;

	// credit:
	public Integer getCredit(){
		return this.credit;
	}
	public void setCredit(Integer credit){
		this.credit = credit;
	}

	public void credit(String multirequestToken){
		setToken("credit", multirequestToken);
	}

	// fromDate:
	public Integer getFromDate(){
		return this.fromDate;
	}
	public void setFromDate(Integer fromDate){
		this.fromDate = fromDate;
	}

	public void fromDate(String multirequestToken){
		setToken("fromDate", multirequestToken);
	}

	// overageCredit:
	public Integer getOverageCredit(){
		return this.overageCredit;
	}
	public void setOverageCredit(Integer overageCredit){
		this.overageCredit = overageCredit;
	}

	public void overageCredit(String multirequestToken){
		setToken("overageCredit", multirequestToken);
	}

	// addOn:
	public Integer getAddOn(){
		return this.addOn;
	}
	public void setAddOn(Integer addOn){
		this.addOn = addOn;
	}

	public void addOn(String multirequestToken){
		setToken("addOn", multirequestToken);
	}


	public VendorCredit() {
		super();
	}

	public VendorCredit(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		credit = GsonParser.parseInt(jsonObject.get("credit"));
		fromDate = GsonParser.parseInt(jsonObject.get("fromDate"));
		overageCredit = GsonParser.parseInt(jsonObject.get("overageCredit"));
		addOn = GsonParser.parseInt(jsonObject.get("addOn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaVendorCredit");
		kparams.add("credit", this.credit);
		kparams.add("fromDate", this.fromDate);
		kparams.add("overageCredit", this.overageCredit);
		kparams.add("addOn", this.addOn);
		return kparams;
	}

}

