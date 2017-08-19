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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileRtmp.Tokenizer.class)
public class DeliveryProfileRtmp extends DeliveryProfile {
	
	public interface Tokenizer extends DeliveryProfile.Tokenizer {
		String enforceRtmpe();
		String prefix();
	}

	/**  enforceRtmpe  */
	private Boolean enforceRtmpe;
	/**  a prefix that is added to all stream urls (replaces storageProfile::rtmpPrefix)  */
	private String prefix;

	// enforceRtmpe:
	public Boolean getEnforceRtmpe(){
		return this.enforceRtmpe;
	}
	public void setEnforceRtmpe(Boolean enforceRtmpe){
		this.enforceRtmpe = enforceRtmpe;
	}

	public void enforceRtmpe(String multirequestToken){
		setToken("enforceRtmpe", multirequestToken);
	}

	// prefix:
	public String getPrefix(){
		return this.prefix;
	}
	public void setPrefix(String prefix){
		this.prefix = prefix;
	}

	public void prefix(String multirequestToken){
		setToken("prefix", multirequestToken);
	}


	public DeliveryProfileRtmp() {
		super();
	}

	public DeliveryProfileRtmp(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		enforceRtmpe = GsonParser.parseBoolean(jsonObject.get("enforceRtmpe"));
		prefix = GsonParser.parseString(jsonObject.get("prefix"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileRtmp");
		kparams.add("enforceRtmpe", this.enforceRtmpe);
		kparams.add("prefix", this.prefix);
		return kparams;
	}

}

