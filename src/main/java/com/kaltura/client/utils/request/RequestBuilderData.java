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
package com.kaltura.client.utils.request;

import com.kaltura.client.Params;
import com.kaltura.client.types.BaseResponseProfile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public abstract class RequestBuilderData {
	
	protected Params params = new Params();
	
	protected RequestBuilderData() {
	}
	
	/**
	 * @param clientTag
	 */
	public void setClientTag(String clientTag){
		params.add("clientTag", clientTag);
	}
	
	/**
	 * @param apiVersion
	 */
	public void setApiVersion(String apiVersion){
		params.add("apiVersion", apiVersion);
	}
	
	/**
	 * Impersonated partner id
	 * 
	 * @param partnerId
	 */
	public void setPartnerId(Integer partnerId){
		params.add("partnerId", partnerId);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param ks
	 */
	public void setKs(String ks){
		params.add("ks", ks);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param sessionId
	 */
	public void setSessionId(String sessionId){
		params.add("ks", sessionId);
	}
	
	/**
	 * Response profile - this attribute will be automatically unset after every API call.
	 * 
	 * @param responseProfile
	 */
	public void setResponseProfile(BaseResponseProfile responseProfile){
		params.add("responseProfile", responseProfile);
	}
	
}
