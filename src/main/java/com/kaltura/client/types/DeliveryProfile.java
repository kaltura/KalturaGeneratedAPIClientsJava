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
// Copyright (C) 2006-2018  Kaltura Inc.
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
import com.kaltura.client.enums.DeliveryProfileType;
import com.kaltura.client.enums.DeliveryStatus;
import com.kaltura.client.enums.PlaybackProtocol;
import com.kaltura.client.types.AssetFilter;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.types.UrlRecognizer;
import com.kaltura.client.types.UrlTokenizer;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfile.Tokenizer.class)
public class DeliveryProfile extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String name();
		String type();
		String systemName();
		String description();
		String streamerType();
		String url();
		String status();
		UrlRecognizer.Tokenizer recognizer();
		UrlTokenizer.Tokenizer tokenizer();
		String mediaProtocols();
		String priority();
		String extraParams();
		AssetFilter.Tokenizer supplementaryAssetsFilter();
	}

	/**
	 * The id of the Delivery
	 */
	private Integer id;
	private Integer partnerId;
	/**
	 * The name of the Delivery
	 */
	private String name;
	/**
	 * Delivery type
	 */
	private DeliveryProfileType type;
	/**
	 * System name of the delivery
	 */
	private String systemName;
	/**
	 * The description of the Delivery
	 */
	private String description;
	/**
	 * Creation time as Unix timestamp (In seconds)
	 */
	private Integer createdAt;
	/**
	 * Update time as Unix timestamp (In seconds)
	 */
	private Integer updatedAt;
	private PlaybackProtocol streamerType;
	private String url;
	/**
	 * the host part of the url
	 */
	private String hostName;
	private DeliveryStatus status;
	private UrlRecognizer recognizer;
	private UrlTokenizer tokenizer;
	/**
	 * True if this is the systemwide default for the protocol
	 */
	private Boolean isDefault;
	/**
	 * the object from which this object was cloned (or 0)
	 */
	private Integer parentId;
	/**
	 * Comma separated list of supported media protocols. f.i. rtmpe
	 */
	private String mediaProtocols;
	/**
	 * priority used for ordering similar delivery profiles
	 */
	private Integer priority;
	/**
	 * Extra query string parameters that should be added to the url
	 */
	private String extraParams;
	/**
	 * A filter that can be used to include additional assets in the URL (e.g.
	  captions)
	 */
	private AssetFilter supplementaryAssetsFilter;

	// id:
	public Integer getId(){
		return this.id;
	}
	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// type:
	public DeliveryProfileType getType(){
		return this.type;
	}
	public void setType(DeliveryProfileType type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// systemName:
	public String getSystemName(){
		return this.systemName;
	}
	public void setSystemName(String systemName){
		this.systemName = systemName;
	}

	public void systemName(String multirequestToken){
		setToken("systemName", multirequestToken);
	}

	// description:
	public String getDescription(){
		return this.description;
	}
	public void setDescription(String description){
		this.description = description;
	}

	public void description(String multirequestToken){
		setToken("description", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	// streamerType:
	public PlaybackProtocol getStreamerType(){
		return this.streamerType;
	}
	public void setStreamerType(PlaybackProtocol streamerType){
		this.streamerType = streamerType;
	}

	public void streamerType(String multirequestToken){
		setToken("streamerType", multirequestToken);
	}

	// url:
	public String getUrl(){
		return this.url;
	}
	public void setUrl(String url){
		this.url = url;
	}

	public void url(String multirequestToken){
		setToken("url", multirequestToken);
	}

	// hostName:
	public String getHostName(){
		return this.hostName;
	}
	// status:
	public DeliveryStatus getStatus(){
		return this.status;
	}
	public void setStatus(DeliveryStatus status){
		this.status = status;
	}

	public void status(String multirequestToken){
		setToken("status", multirequestToken);
	}

	// recognizer:
	public UrlRecognizer getRecognizer(){
		return this.recognizer;
	}
	public void setRecognizer(UrlRecognizer recognizer){
		this.recognizer = recognizer;
	}

	// tokenizer:
	public UrlTokenizer getTokenizer(){
		return this.tokenizer;
	}
	public void setTokenizer(UrlTokenizer tokenizer){
		this.tokenizer = tokenizer;
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	// parentId:
	public Integer getParentId(){
		return this.parentId;
	}
	// mediaProtocols:
	public String getMediaProtocols(){
		return this.mediaProtocols;
	}
	public void setMediaProtocols(String mediaProtocols){
		this.mediaProtocols = mediaProtocols;
	}

	public void mediaProtocols(String multirequestToken){
		setToken("mediaProtocols", multirequestToken);
	}

	// priority:
	public Integer getPriority(){
		return this.priority;
	}
	public void setPriority(Integer priority){
		this.priority = priority;
	}

	public void priority(String multirequestToken){
		setToken("priority", multirequestToken);
	}

	// extraParams:
	public String getExtraParams(){
		return this.extraParams;
	}
	public void setExtraParams(String extraParams){
		this.extraParams = extraParams;
	}

	public void extraParams(String multirequestToken){
		setToken("extraParams", multirequestToken);
	}

	// supplementaryAssetsFilter:
	public AssetFilter getSupplementaryAssetsFilter(){
		return this.supplementaryAssetsFilter;
	}
	public void setSupplementaryAssetsFilter(AssetFilter supplementaryAssetsFilter){
		this.supplementaryAssetsFilter = supplementaryAssetsFilter;
	}


	public DeliveryProfile() {
		super();
	}

	public DeliveryProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseInt(jsonObject.get("id"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		name = GsonParser.parseString(jsonObject.get("name"));
		type = DeliveryProfileType.get(GsonParser.parseString(jsonObject.get("type")));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		description = GsonParser.parseString(jsonObject.get("description"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		streamerType = PlaybackProtocol.get(GsonParser.parseString(jsonObject.get("streamerType")));
		url = GsonParser.parseString(jsonObject.get("url"));
		hostName = GsonParser.parseString(jsonObject.get("hostName"));
		status = DeliveryStatus.get(GsonParser.parseInt(jsonObject.get("status")));
		recognizer = GsonParser.parseObject(jsonObject.getAsJsonObject("recognizer"), UrlRecognizer.class);
		tokenizer = GsonParser.parseObject(jsonObject.getAsJsonObject("tokenizer"), UrlTokenizer.class);
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		parentId = GsonParser.parseInt(jsonObject.get("parentId"));
		mediaProtocols = GsonParser.parseString(jsonObject.get("mediaProtocols"));
		priority = GsonParser.parseInt(jsonObject.get("priority"));
		extraParams = GsonParser.parseString(jsonObject.get("extraParams"));
		supplementaryAssetsFilter = GsonParser.parseObject(jsonObject.getAsJsonObject("supplementaryAssetsFilter"), AssetFilter.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfile");
		kparams.add("name", this.name);
		kparams.add("type", this.type);
		kparams.add("systemName", this.systemName);
		kparams.add("description", this.description);
		kparams.add("streamerType", this.streamerType);
		kparams.add("url", this.url);
		kparams.add("status", this.status);
		kparams.add("recognizer", this.recognizer);
		kparams.add("tokenizer", this.tokenizer);
		kparams.add("mediaProtocols", this.mediaProtocols);
		kparams.add("priority", this.priority);
		kparams.add("extraParams", this.extraParams);
		kparams.add("supplementaryAssetsFilter", this.supplementaryAssetsFilter);
		return kparams;
	}

}

