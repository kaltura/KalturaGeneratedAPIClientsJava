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

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class RequestBuilderData {
	
	protected Params params;
	
	protected RequestBuilderData(Params params) {
		this.params = params;
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
	 * Impersonated user id
	 * 
	 * @param userId
	 */
	public void setUserId(Integer userId){
		params.add("userId", userId);
	}
	
	/**
	 * Content language
	 * 
	 * @param language
	 */
	public void setLanguage(Integer language){
		params.add("language", language);
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
	
}
