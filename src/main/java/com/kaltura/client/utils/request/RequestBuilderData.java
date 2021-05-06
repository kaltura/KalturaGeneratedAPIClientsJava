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
// Copyright (C) 2006-2021  Kaltura Inc.
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

public abstract class RequestBuilderData<SelfType> {
	
	protected Params params = new Params();
	
	protected RequestBuilderData() {
	}
	
	/**
	 * @param clientTag 
	 */
	public SelfType setClientTag(String clientTag){
		params.add("clientTag", clientTag);
		return (SelfType) this;
	}
	
	/**
	 * @param apiVersion 
	 */
	public SelfType setApiVersion(String apiVersion){
		params.add("apiVersion", apiVersion);
		return (SelfType) this;
	}
	
	/**
	 * @param partnerId Impersonated partner id
	 */
	public SelfType setPartnerId(Integer partnerId){
		params.add("partnerId", partnerId);
		return (SelfType) this;
	}
	
	/**
	 * @param ks Kaltura API session
	 */
	public SelfType setKs(String ks){
		params.add("ks", ks);
		return (SelfType) this;
	}
	
	/**
	 * @param sessionId Kaltura API session
	 */
	public SelfType setSessionId(String sessionId){
		params.add("ks", sessionId);
		return (SelfType) this;
	}
	
	/**
	 * @param responseProfile Response profile - this attribute will be automatically unset after every API call.
	 */
	public SelfType setResponseProfile(BaseResponseProfile responseProfile){
		params.add("responseProfile", responseProfile);
		return (SelfType) this;
	}
	
}
