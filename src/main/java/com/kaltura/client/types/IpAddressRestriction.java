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
import com.kaltura.client.enums.IpAddressRestrictionType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(IpAddressRestriction.Tokenizer.class)
public class IpAddressRestriction extends BaseRestriction {
	
	public interface Tokenizer extends BaseRestriction.Tokenizer {
		String ipAddressRestrictionType();
		String ipAddressList();
	}

	/**
	 * Ip address restriction type (Allow or deny)
	 */
	private IpAddressRestrictionType ipAddressRestrictionType;
	/**
	 * Comma separated list of ip address to allow to deny
	 */
	private String ipAddressList;

	// ipAddressRestrictionType:
	public IpAddressRestrictionType getIpAddressRestrictionType(){
		return this.ipAddressRestrictionType;
	}
	public void setIpAddressRestrictionType(IpAddressRestrictionType ipAddressRestrictionType){
		this.ipAddressRestrictionType = ipAddressRestrictionType;
	}

	public void ipAddressRestrictionType(String multirequestToken){
		setToken("ipAddressRestrictionType", multirequestToken);
	}

	// ipAddressList:
	public String getIpAddressList(){
		return this.ipAddressList;
	}
	public void setIpAddressList(String ipAddressList){
		this.ipAddressList = ipAddressList;
	}

	public void ipAddressList(String multirequestToken){
		setToken("ipAddressList", multirequestToken);
	}


	public IpAddressRestriction() {
		super();
	}

	public IpAddressRestriction(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		ipAddressRestrictionType = IpAddressRestrictionType.get(GsonParser.parseInt(jsonObject.get("ipAddressRestrictionType")));
		ipAddressList = GsonParser.parseString(jsonObject.get("ipAddressList"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaIpAddressRestriction");
		kparams.add("ipAddressRestrictionType", this.ipAddressRestrictionType);
		kparams.add("ipAddressList", this.ipAddressList);
		return kparams;
	}

}

