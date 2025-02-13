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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IpAddressCondition.Tokenizer.class)
public class IpAddressCondition extends MatchCondition {
	
	public interface Tokenizer extends MatchCondition.Tokenizer {
		String acceptInternalIps();
		String httpHeader();
	}

	/**
	 * allow internal ips
	 */
	private Boolean acceptInternalIps;
	/**
	 * http header name for extracting the ip
	 */
	private String httpHeader;

	// acceptInternalIps:
	public Boolean getAcceptInternalIps(){
		return this.acceptInternalIps;
	}
	public void setAcceptInternalIps(Boolean acceptInternalIps){
		this.acceptInternalIps = acceptInternalIps;
	}

	public void acceptInternalIps(String multirequestToken){
		setToken("acceptInternalIps", multirequestToken);
	}

	// httpHeader:
	public String getHttpHeader(){
		return this.httpHeader;
	}
	public void setHttpHeader(String httpHeader){
		this.httpHeader = httpHeader;
	}

	public void httpHeader(String multirequestToken){
		setToken("httpHeader", multirequestToken);
	}


	public IpAddressCondition() {
		super();
	}

	public IpAddressCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		acceptInternalIps = GsonParser.parseBoolean(jsonObject.get("acceptInternalIps"));
		httpHeader = GsonParser.parseString(jsonObject.get("httpHeader"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIpAddressCondition");
		kparams.add("acceptInternalIps", this.acceptInternalIps);
		kparams.add("httpHeader", this.httpHeader);
		return kparams;
	}

}

