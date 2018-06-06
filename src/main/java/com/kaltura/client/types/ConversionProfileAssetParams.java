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
import com.kaltura.client.enums.AssetParamsDeletePolicy;
import com.kaltura.client.enums.AssetParamsOrigin;
import com.kaltura.client.enums.FlavorReadyBehaviorType;
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
@MultiRequestBuilder.Tokenizer(ConversionProfileAssetParams.Tokenizer.class)
public class ConversionProfileAssetParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String readyBehavior();
		String origin();
		String systemName();
		String forceNoneComplied();
		String deletePolicy();
		String isEncrypted();
		String contentAwareness();
		String chunkedEncodeMode();
		String twoPass();
		String tags();
	}

	/**
	 * The id of the conversion profile
	 */
	private Integer conversionProfileId;
	/**
	 * The id of the asset params
	 */
	private Integer assetParamsId;
	/**
	 * The ingestion origin of the asset params
	 */
	private FlavorReadyBehaviorType readyBehavior;
	/**
	 * The ingestion origin of the asset params
	 */
	private AssetParamsOrigin origin;
	/**
	 * Asset params system name
	 */
	private String systemName;
	/**
	 * Starts conversion even if the decision layer reduced the configuration to comply
	  with the source
	 */
	private Boolean forceNoneComplied;
	/**
	 * Specifies how to treat the flavor after conversion is finished
	 */
	private AssetParamsDeletePolicy deletePolicy;
	private Boolean isEncrypted;
	private Double contentAwareness;
	private Integer chunkedEncodeMode;
	private Boolean twoPass;
	private String tags;

	// conversionProfileId:
	public Integer getConversionProfileId(){
		return this.conversionProfileId;
	}
	// assetParamsId:
	public Integer getAssetParamsId(){
		return this.assetParamsId;
	}
	// readyBehavior:
	public FlavorReadyBehaviorType getReadyBehavior(){
		return this.readyBehavior;
	}
	public void setReadyBehavior(FlavorReadyBehaviorType readyBehavior){
		this.readyBehavior = readyBehavior;
	}

	public void readyBehavior(String multirequestToken){
		setToken("readyBehavior", multirequestToken);
	}

	// origin:
	public AssetParamsOrigin getOrigin(){
		return this.origin;
	}
	public void setOrigin(AssetParamsOrigin origin){
		this.origin = origin;
	}

	public void origin(String multirequestToken){
		setToken("origin", multirequestToken);
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

	// forceNoneComplied:
	public Boolean getForceNoneComplied(){
		return this.forceNoneComplied;
	}
	public void setForceNoneComplied(Boolean forceNoneComplied){
		this.forceNoneComplied = forceNoneComplied;
	}

	public void forceNoneComplied(String multirequestToken){
		setToken("forceNoneComplied", multirequestToken);
	}

	// deletePolicy:
	public AssetParamsDeletePolicy getDeletePolicy(){
		return this.deletePolicy;
	}
	public void setDeletePolicy(AssetParamsDeletePolicy deletePolicy){
		this.deletePolicy = deletePolicy;
	}

	public void deletePolicy(String multirequestToken){
		setToken("deletePolicy", multirequestToken);
	}

	// isEncrypted:
	public Boolean getIsEncrypted(){
		return this.isEncrypted;
	}
	public void setIsEncrypted(Boolean isEncrypted){
		this.isEncrypted = isEncrypted;
	}

	public void isEncrypted(String multirequestToken){
		setToken("isEncrypted", multirequestToken);
	}

	// contentAwareness:
	public Double getContentAwareness(){
		return this.contentAwareness;
	}
	public void setContentAwareness(Double contentAwareness){
		this.contentAwareness = contentAwareness;
	}

	public void contentAwareness(String multirequestToken){
		setToken("contentAwareness", multirequestToken);
	}

	// chunkedEncodeMode:
	public Integer getChunkedEncodeMode(){
		return this.chunkedEncodeMode;
	}
	public void setChunkedEncodeMode(Integer chunkedEncodeMode){
		this.chunkedEncodeMode = chunkedEncodeMode;
	}

	public void chunkedEncodeMode(String multirequestToken){
		setToken("chunkedEncodeMode", multirequestToken);
	}

	// twoPass:
	public Boolean getTwoPass(){
		return this.twoPass;
	}
	public void setTwoPass(Boolean twoPass){
		this.twoPass = twoPass;
	}

	public void twoPass(String multirequestToken){
		setToken("twoPass", multirequestToken);
	}

	// tags:
	public String getTags(){
		return this.tags;
	}
	public void setTags(String tags){
		this.tags = tags;
	}

	public void tags(String multirequestToken){
		setToken("tags", multirequestToken);
	}


	public ConversionProfileAssetParams() {
		super();
	}

	public ConversionProfileAssetParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conversionProfileId = GsonParser.parseInt(jsonObject.get("conversionProfileId"));
		assetParamsId = GsonParser.parseInt(jsonObject.get("assetParamsId"));
		readyBehavior = FlavorReadyBehaviorType.get(GsonParser.parseInt(jsonObject.get("readyBehavior")));
		origin = AssetParamsOrigin.get(GsonParser.parseInt(jsonObject.get("origin")));
		systemName = GsonParser.parseString(jsonObject.get("systemName"));
		forceNoneComplied = GsonParser.parseBoolean(jsonObject.get("forceNoneComplied"));
		deletePolicy = AssetParamsDeletePolicy.get(GsonParser.parseInt(jsonObject.get("deletePolicy")));
		isEncrypted = GsonParser.parseBoolean(jsonObject.get("isEncrypted"));
		contentAwareness = GsonParser.parseDouble(jsonObject.get("contentAwareness"));
		chunkedEncodeMode = GsonParser.parseInt(jsonObject.get("chunkedEncodeMode"));
		twoPass = GsonParser.parseBoolean(jsonObject.get("twoPass"));
		tags = GsonParser.parseString(jsonObject.get("tags"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConversionProfileAssetParams");
		kparams.add("readyBehavior", this.readyBehavior);
		kparams.add("origin", this.origin);
		kparams.add("systemName", this.systemName);
		kparams.add("forceNoneComplied", this.forceNoneComplied);
		kparams.add("deletePolicy", this.deletePolicy);
		kparams.add("isEncrypted", this.isEncrypted);
		kparams.add("contentAwareness", this.contentAwareness);
		kparams.add("chunkedEncodeMode", this.chunkedEncodeMode);
		kparams.add("twoPass", this.twoPass);
		kparams.add("tags", this.tags);
		return kparams;
	}

}

