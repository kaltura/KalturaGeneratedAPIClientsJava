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
@MultiRequestBuilder.Tokenizer(DeliveryProfileLivePackagerHls.Tokenizer.class)
public class DeliveryProfileLivePackagerHls extends DeliveryProfileLivePackager {
	
	public interface Tokenizer extends DeliveryProfileLivePackager.Tokenizer {
		String disableExtraAttributes();
		String forceProxy();
	}

	private Boolean disableExtraAttributes;
	private Boolean forceProxy;

	// disableExtraAttributes:
	public Boolean getDisableExtraAttributes(){
		return this.disableExtraAttributes;
	}
	public void setDisableExtraAttributes(Boolean disableExtraAttributes){
		this.disableExtraAttributes = disableExtraAttributes;
	}

	public void disableExtraAttributes(String multirequestToken){
		setToken("disableExtraAttributes", multirequestToken);
	}

	// forceProxy:
	public Boolean getForceProxy(){
		return this.forceProxy;
	}
	public void setForceProxy(Boolean forceProxy){
		this.forceProxy = forceProxy;
	}

	public void forceProxy(String multirequestToken){
		setToken("forceProxy", multirequestToken);
	}


	public DeliveryProfileLivePackagerHls() {
		super();
	}

	public DeliveryProfileLivePackagerHls(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		disableExtraAttributes = GsonParser.parseBoolean(jsonObject.get("disableExtraAttributes"));
		forceProxy = GsonParser.parseBoolean(jsonObject.get("forceProxy"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileLivePackagerHls");
		kparams.add("disableExtraAttributes", this.disableExtraAttributes);
		kparams.add("forceProxy", this.forceProxy);
		return kparams;
	}

}

