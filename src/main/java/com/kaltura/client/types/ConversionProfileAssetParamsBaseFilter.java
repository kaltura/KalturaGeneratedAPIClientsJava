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
import com.kaltura.client.enums.AssetParamsOrigin;
import com.kaltura.client.enums.FlavorReadyBehaviorType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConversionProfileAssetParamsBaseFilter.Tokenizer.class)
public abstract class ConversionProfileAssetParamsBaseFilter extends RelatedFilter {
	
	public interface Tokenizer extends RelatedFilter.Tokenizer {
		String conversionProfileIdEqual();
		String conversionProfileIdIn();
		String assetParamsIdEqual();
		String assetParamsIdIn();
		String readyBehaviorEqual();
		String readyBehaviorIn();
		String originEqual();
		String originIn();
		String systemNameEqual();
		String systemNameIn();
	}

	private Integer conversionProfileIdEqual;
	private String conversionProfileIdIn;
	private Integer assetParamsIdEqual;
	private String assetParamsIdIn;
	private FlavorReadyBehaviorType readyBehaviorEqual;
	private String readyBehaviorIn;
	private AssetParamsOrigin originEqual;
	private String originIn;
	private String systemNameEqual;
	private String systemNameIn;

	// conversionProfileIdEqual:
	public Integer getConversionProfileIdEqual(){
		return this.conversionProfileIdEqual;
	}
	public void setConversionProfileIdEqual(Integer conversionProfileIdEqual){
		this.conversionProfileIdEqual = conversionProfileIdEqual;
	}

	public void conversionProfileIdEqual(String multirequestToken){
		setToken("conversionProfileIdEqual", multirequestToken);
	}

	// conversionProfileIdIn:
	public String getConversionProfileIdIn(){
		return this.conversionProfileIdIn;
	}
	public void setConversionProfileIdIn(String conversionProfileIdIn){
		this.conversionProfileIdIn = conversionProfileIdIn;
	}

	public void conversionProfileIdIn(String multirequestToken){
		setToken("conversionProfileIdIn", multirequestToken);
	}

	// assetParamsIdEqual:
	public Integer getAssetParamsIdEqual(){
		return this.assetParamsIdEqual;
	}
	public void setAssetParamsIdEqual(Integer assetParamsIdEqual){
		this.assetParamsIdEqual = assetParamsIdEqual;
	}

	public void assetParamsIdEqual(String multirequestToken){
		setToken("assetParamsIdEqual", multirequestToken);
	}

	// assetParamsIdIn:
	public String getAssetParamsIdIn(){
		return this.assetParamsIdIn;
	}
	public void setAssetParamsIdIn(String assetParamsIdIn){
		this.assetParamsIdIn = assetParamsIdIn;
	}

	public void assetParamsIdIn(String multirequestToken){
		setToken("assetParamsIdIn", multirequestToken);
	}

	// readyBehaviorEqual:
	public FlavorReadyBehaviorType getReadyBehaviorEqual(){
		return this.readyBehaviorEqual;
	}
	public void setReadyBehaviorEqual(FlavorReadyBehaviorType readyBehaviorEqual){
		this.readyBehaviorEqual = readyBehaviorEqual;
	}

	public void readyBehaviorEqual(String multirequestToken){
		setToken("readyBehaviorEqual", multirequestToken);
	}

	// readyBehaviorIn:
	public String getReadyBehaviorIn(){
		return this.readyBehaviorIn;
	}
	public void setReadyBehaviorIn(String readyBehaviorIn){
		this.readyBehaviorIn = readyBehaviorIn;
	}

	public void readyBehaviorIn(String multirequestToken){
		setToken("readyBehaviorIn", multirequestToken);
	}

	// originEqual:
	public AssetParamsOrigin getOriginEqual(){
		return this.originEqual;
	}
	public void setOriginEqual(AssetParamsOrigin originEqual){
		this.originEqual = originEqual;
	}

	public void originEqual(String multirequestToken){
		setToken("originEqual", multirequestToken);
	}

	// originIn:
	public String getOriginIn(){
		return this.originIn;
	}
	public void setOriginIn(String originIn){
		this.originIn = originIn;
	}

	public void originIn(String multirequestToken){
		setToken("originIn", multirequestToken);
	}

	// systemNameEqual:
	public String getSystemNameEqual(){
		return this.systemNameEqual;
	}
	public void setSystemNameEqual(String systemNameEqual){
		this.systemNameEqual = systemNameEqual;
	}

	public void systemNameEqual(String multirequestToken){
		setToken("systemNameEqual", multirequestToken);
	}

	// systemNameIn:
	public String getSystemNameIn(){
		return this.systemNameIn;
	}
	public void setSystemNameIn(String systemNameIn){
		this.systemNameIn = systemNameIn;
	}

	public void systemNameIn(String multirequestToken){
		setToken("systemNameIn", multirequestToken);
	}


	public ConversionProfileAssetParamsBaseFilter() {
		super();
	}

	public ConversionProfileAssetParamsBaseFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		conversionProfileIdEqual = GsonParser.parseInt(jsonObject.get("conversionProfileIdEqual"));
		conversionProfileIdIn = GsonParser.parseString(jsonObject.get("conversionProfileIdIn"));
		assetParamsIdEqual = GsonParser.parseInt(jsonObject.get("assetParamsIdEqual"));
		assetParamsIdIn = GsonParser.parseString(jsonObject.get("assetParamsIdIn"));
		readyBehaviorEqual = FlavorReadyBehaviorType.get(GsonParser.parseInt(jsonObject.get("readyBehaviorEqual")));
		readyBehaviorIn = GsonParser.parseString(jsonObject.get("readyBehaviorIn"));
		originEqual = AssetParamsOrigin.get(GsonParser.parseInt(jsonObject.get("originEqual")));
		originIn = GsonParser.parseString(jsonObject.get("originIn"));
		systemNameEqual = GsonParser.parseString(jsonObject.get("systemNameEqual"));
		systemNameIn = GsonParser.parseString(jsonObject.get("systemNameIn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConversionProfileAssetParamsBaseFilter");
		kparams.add("conversionProfileIdEqual", this.conversionProfileIdEqual);
		kparams.add("conversionProfileIdIn", this.conversionProfileIdIn);
		kparams.add("assetParamsIdEqual", this.assetParamsIdEqual);
		kparams.add("assetParamsIdIn", this.assetParamsIdIn);
		kparams.add("readyBehaviorEqual", this.readyBehaviorEqual);
		kparams.add("readyBehaviorIn", this.readyBehaviorIn);
		kparams.add("originEqual", this.originEqual);
		kparams.add("originIn", this.originIn);
		kparams.add("systemNameEqual", this.systemNameEqual);
		kparams.add("systemNameIn", this.systemNameIn);
		return kparams;
	}

}

