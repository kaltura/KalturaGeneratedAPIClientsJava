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
@MultiRequestBuilder.Tokenizer(UnicornDistributionJobProviderData.Tokenizer.class)
public class UnicornDistributionJobProviderData extends ConfigurableDistributionJobProviderData {
	
	public interface Tokenizer extends ConfigurableDistributionJobProviderData.Tokenizer {
		String catalogGuid();
		String title();
		String mediaChanged();
		String flavorAssetVersion();
		String notificationBaseUrl();
	}

	/**
	 * The Catalog GUID the video is in or will be ingested into.
	 */
	private String catalogGuid;
	/**
	 * The Title assigned to the video. The Foreign Key will be used if no title is
	  provided.
	 */
	private String title;
	/**
	 * Indicates that the media content changed and therefore the job should wait for
	  HTTP callback notification to be closed.
	 */
	private Boolean mediaChanged;
	/**
	 * Flavor asset version.
	 */
	private String flavorAssetVersion;
	/**
	 * The schema and host name to the Kaltura server, e.g. http://www.kaltura.com
	 */
	private String notificationBaseUrl;

	// catalogGuid:
	public String getCatalogGuid(){
		return this.catalogGuid;
	}
	public void setCatalogGuid(String catalogGuid){
		this.catalogGuid = catalogGuid;
	}

	public void catalogGuid(String multirequestToken){
		setToken("catalogGuid", multirequestToken);
	}

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// mediaChanged:
	public Boolean getMediaChanged(){
		return this.mediaChanged;
	}
	public void setMediaChanged(Boolean mediaChanged){
		this.mediaChanged = mediaChanged;
	}

	public void mediaChanged(String multirequestToken){
		setToken("mediaChanged", multirequestToken);
	}

	// flavorAssetVersion:
	public String getFlavorAssetVersion(){
		return this.flavorAssetVersion;
	}
	public void setFlavorAssetVersion(String flavorAssetVersion){
		this.flavorAssetVersion = flavorAssetVersion;
	}

	public void flavorAssetVersion(String multirequestToken){
		setToken("flavorAssetVersion", multirequestToken);
	}

	// notificationBaseUrl:
	public String getNotificationBaseUrl(){
		return this.notificationBaseUrl;
	}
	public void setNotificationBaseUrl(String notificationBaseUrl){
		this.notificationBaseUrl = notificationBaseUrl;
	}

	public void notificationBaseUrl(String multirequestToken){
		setToken("notificationBaseUrl", multirequestToken);
	}


	public UnicornDistributionJobProviderData() {
		super();
	}

	public UnicornDistributionJobProviderData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		catalogGuid = GsonParser.parseString(jsonObject.get("catalogGuid"));
		title = GsonParser.parseString(jsonObject.get("title"));
		mediaChanged = GsonParser.parseBoolean(jsonObject.get("mediaChanged"));
		flavorAssetVersion = GsonParser.parseString(jsonObject.get("flavorAssetVersion"));
		notificationBaseUrl = GsonParser.parseString(jsonObject.get("notificationBaseUrl"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUnicornDistributionJobProviderData");
		kparams.add("catalogGuid", this.catalogGuid);
		kparams.add("title", this.title);
		kparams.add("mediaChanged", this.mediaChanged);
		kparams.add("flavorAssetVersion", this.flavorAssetVersion);
		kparams.add("notificationBaseUrl", this.notificationBaseUrl);
		return kparams;
	}

}

