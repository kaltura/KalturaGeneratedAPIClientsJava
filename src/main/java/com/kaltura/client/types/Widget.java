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
import com.kaltura.client.enums.WidgetSecurityType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(Widget.Tokenizer.class)
public class Widget extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String id();
		String sourceWidgetId();
		String rootWidgetId();
		String partnerId();
		String entryId();
		String uiConfId();
		String securityType();
		String securityPolicy();
		String createdAt();
		String updatedAt();
		String partnerData();
		String widgetHTML();
		String enforceEntitlement();
		String privacyContext();
		String addEmbedHtml5Support();
		String roles();
	}

	private String id;
	private String sourceWidgetId;
	private String rootWidgetId;
	private Integer partnerId;
	private String entryId;
	private Integer uiConfId;
	private WidgetSecurityType securityType;
	private Integer securityPolicy;
	private Integer createdAt;
	private Integer updatedAt;
	/**
	 * Can be used to store various partner related data as a string
	 */
	private String partnerData;
	private String widgetHTML;
	/**
	 * Should enforce entitlement on feed entries
	 */
	private Boolean enforceEntitlement;
	/**
	 * Set privacy context for search entries that assiged to private and public
	  categories within a category privacy context.
	 */
	private String privacyContext;
	/**
	 * Addes the HTML5 script line to the widget's embed code
	 */
	private Boolean addEmbedHtml5Support;
	private String roles;

	// id:
	public String getId(){
		return this.id;
	}
	public void setId(String id){
		this.id = id;
	}

	public void id(String multirequestToken){
		setToken("id", multirequestToken);
	}

	// sourceWidgetId:
	public String getSourceWidgetId(){
		return this.sourceWidgetId;
	}
	public void setSourceWidgetId(String sourceWidgetId){
		this.sourceWidgetId = sourceWidgetId;
	}

	public void sourceWidgetId(String multirequestToken){
		setToken("sourceWidgetId", multirequestToken);
	}

	// rootWidgetId:
	public String getRootWidgetId(){
		return this.rootWidgetId;
	}
	public void setRootWidgetId(String rootWidgetId){
		this.rootWidgetId = rootWidgetId;
	}

	public void rootWidgetId(String multirequestToken){
		setToken("rootWidgetId", multirequestToken);
	}

	// partnerId:
	public Integer getPartnerId(){
		return this.partnerId;
	}
	public void setPartnerId(Integer partnerId){
		this.partnerId = partnerId;
	}

	public void partnerId(String multirequestToken){
		setToken("partnerId", multirequestToken);
	}

	// entryId:
	public String getEntryId(){
		return this.entryId;
	}
	public void setEntryId(String entryId){
		this.entryId = entryId;
	}

	public void entryId(String multirequestToken){
		setToken("entryId", multirequestToken);
	}

	// uiConfId:
	public Integer getUiConfId(){
		return this.uiConfId;
	}
	public void setUiConfId(Integer uiConfId){
		this.uiConfId = uiConfId;
	}

	public void uiConfId(String multirequestToken){
		setToken("uiConfId", multirequestToken);
	}

	// securityType:
	public WidgetSecurityType getSecurityType(){
		return this.securityType;
	}
	public void setSecurityType(WidgetSecurityType securityType){
		this.securityType = securityType;
	}

	public void securityType(String multirequestToken){
		setToken("securityType", multirequestToken);
	}

	// securityPolicy:
	public Integer getSecurityPolicy(){
		return this.securityPolicy;
	}
	public void setSecurityPolicy(Integer securityPolicy){
		this.securityPolicy = securityPolicy;
	}

	public void securityPolicy(String multirequestToken){
		setToken("securityPolicy", multirequestToken);
	}

	// createdAt:
	public Integer getCreatedAt(){
		return this.createdAt;
	}
	public void setCreatedAt(Integer createdAt){
		this.createdAt = createdAt;
	}

	public void createdAt(String multirequestToken){
		setToken("createdAt", multirequestToken);
	}

	// updatedAt:
	public Integer getUpdatedAt(){
		return this.updatedAt;
	}
	public void setUpdatedAt(Integer updatedAt){
		this.updatedAt = updatedAt;
	}

	public void updatedAt(String multirequestToken){
		setToken("updatedAt", multirequestToken);
	}

	// partnerData:
	public String getPartnerData(){
		return this.partnerData;
	}
	public void setPartnerData(String partnerData){
		this.partnerData = partnerData;
	}

	public void partnerData(String multirequestToken){
		setToken("partnerData", multirequestToken);
	}

	// widgetHTML:
	public String getWidgetHTML(){
		return this.widgetHTML;
	}
	public void setWidgetHTML(String widgetHTML){
		this.widgetHTML = widgetHTML;
	}

	public void widgetHTML(String multirequestToken){
		setToken("widgetHTML", multirequestToken);
	}

	// enforceEntitlement:
	public Boolean getEnforceEntitlement(){
		return this.enforceEntitlement;
	}
	public void setEnforceEntitlement(Boolean enforceEntitlement){
		this.enforceEntitlement = enforceEntitlement;
	}

	public void enforceEntitlement(String multirequestToken){
		setToken("enforceEntitlement", multirequestToken);
	}

	// privacyContext:
	public String getPrivacyContext(){
		return this.privacyContext;
	}
	public void setPrivacyContext(String privacyContext){
		this.privacyContext = privacyContext;
	}

	public void privacyContext(String multirequestToken){
		setToken("privacyContext", multirequestToken);
	}

	// addEmbedHtml5Support:
	public Boolean getAddEmbedHtml5Support(){
		return this.addEmbedHtml5Support;
	}
	public void setAddEmbedHtml5Support(Boolean addEmbedHtml5Support){
		this.addEmbedHtml5Support = addEmbedHtml5Support;
	}

	public void addEmbedHtml5Support(String multirequestToken){
		setToken("addEmbedHtml5Support", multirequestToken);
	}

	// roles:
	public String getRoles(){
		return this.roles;
	}
	public void setRoles(String roles){
		this.roles = roles;
	}

	public void roles(String multirequestToken){
		setToken("roles", multirequestToken);
	}


	public Widget() {
		super();
	}

	public Widget(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		id = GsonParser.parseString(jsonObject.get("id"));
		sourceWidgetId = GsonParser.parseString(jsonObject.get("sourceWidgetId"));
		rootWidgetId = GsonParser.parseString(jsonObject.get("rootWidgetId"));
		partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		uiConfId = GsonParser.parseInt(jsonObject.get("uiConfId"));
		securityType = WidgetSecurityType.get(GsonParser.parseInt(jsonObject.get("securityType")));
		securityPolicy = GsonParser.parseInt(jsonObject.get("securityPolicy"));
		createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
		updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));
		partnerData = GsonParser.parseString(jsonObject.get("partnerData"));
		widgetHTML = GsonParser.parseString(jsonObject.get("widgetHTML"));
		enforceEntitlement = GsonParser.parseBoolean(jsonObject.get("enforceEntitlement"));
		privacyContext = GsonParser.parseString(jsonObject.get("privacyContext"));
		addEmbedHtml5Support = GsonParser.parseBoolean(jsonObject.get("addEmbedHtml5Support"));
		roles = GsonParser.parseString(jsonObject.get("roles"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaWidget");
		kparams.add("sourceWidgetId", this.sourceWidgetId);
		kparams.add("entryId", this.entryId);
		kparams.add("uiConfId", this.uiConfId);
		kparams.add("securityType", this.securityType);
		kparams.add("securityPolicy", this.securityPolicy);
		kparams.add("partnerData", this.partnerData);
		kparams.add("enforceEntitlement", this.enforceEntitlement);
		kparams.add("privacyContext", this.privacyContext);
		kparams.add("addEmbedHtml5Support", this.addEmbedHtml5Support);
		kparams.add("roles", this.roles);
		return kparams;
	}

}

