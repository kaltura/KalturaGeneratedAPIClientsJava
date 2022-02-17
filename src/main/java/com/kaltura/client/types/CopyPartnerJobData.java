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
@MultiRequestBuilder.Tokenizer(CopyPartnerJobData.Tokenizer.class)
public class CopyPartnerJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String fromPartnerId();
		String toPartnerId();
	}

	/**
	 * Id of the partner to copy from
	 */
	private Integer fromPartnerId;
	/**
	 * Id of the partner to copy to
	 */
	private Integer toPartnerId;

	// fromPartnerId:
	public Integer getFromPartnerId(){
		return this.fromPartnerId;
	}
	public void setFromPartnerId(Integer fromPartnerId){
		this.fromPartnerId = fromPartnerId;
	}

	public void fromPartnerId(String multirequestToken){
		setToken("fromPartnerId", multirequestToken);
	}

	// toPartnerId:
	public Integer getToPartnerId(){
		return this.toPartnerId;
	}
	public void setToPartnerId(Integer toPartnerId){
		this.toPartnerId = toPartnerId;
	}

	public void toPartnerId(String multirequestToken){
		setToken("toPartnerId", multirequestToken);
	}


	public CopyPartnerJobData() {
		super();
	}

	public CopyPartnerJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fromPartnerId = GsonParser.parseInt(jsonObject.get("fromPartnerId"));
		toPartnerId = GsonParser.parseInt(jsonObject.get("toPartnerId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaCopyPartnerJobData");
		kparams.add("fromPartnerId", this.fromPartnerId);
		kparams.add("toPartnerId", this.toPartnerId);
		return kparams;
	}

}

