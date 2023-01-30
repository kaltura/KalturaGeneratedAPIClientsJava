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
import com.kaltura.client.enums.ContainerFormat;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AssetParamsOutput.Tokenizer.class)
public class AssetParamsOutput extends AssetParams {
	
	public interface Tokenizer extends AssetParams.Tokenizer {
		String assetParamsId();
		String assetParamsVersion();
		String assetId();
		String assetVersion();
		String readyBehavior();
		String format();
	}

	private Integer assetParamsId;
	private String assetParamsVersion;
	private String assetId;
	private String assetVersion;
	private Integer readyBehavior;
	/**
	 * The container format of the Flavor Params
	 */
	private ContainerFormat format;

	// assetParamsId:
	public Integer getAssetParamsId(){
		return this.assetParamsId;
	}
	public void setAssetParamsId(Integer assetParamsId){
		this.assetParamsId = assetParamsId;
	}

	public void assetParamsId(String multirequestToken){
		setToken("assetParamsId", multirequestToken);
	}

	// assetParamsVersion:
	public String getAssetParamsVersion(){
		return this.assetParamsVersion;
	}
	public void setAssetParamsVersion(String assetParamsVersion){
		this.assetParamsVersion = assetParamsVersion;
	}

	public void assetParamsVersion(String multirequestToken){
		setToken("assetParamsVersion", multirequestToken);
	}

	// assetId:
	public String getAssetId(){
		return this.assetId;
	}
	public void setAssetId(String assetId){
		this.assetId = assetId;
	}

	public void assetId(String multirequestToken){
		setToken("assetId", multirequestToken);
	}

	// assetVersion:
	public String getAssetVersion(){
		return this.assetVersion;
	}
	public void setAssetVersion(String assetVersion){
		this.assetVersion = assetVersion;
	}

	public void assetVersion(String multirequestToken){
		setToken("assetVersion", multirequestToken);
	}

	// readyBehavior:
	public Integer getReadyBehavior(){
		return this.readyBehavior;
	}
	public void setReadyBehavior(Integer readyBehavior){
		this.readyBehavior = readyBehavior;
	}

	public void readyBehavior(String multirequestToken){
		setToken("readyBehavior", multirequestToken);
	}

	// format:
	public ContainerFormat getFormat(){
		return this.format;
	}
	public void setFormat(ContainerFormat format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}


	public AssetParamsOutput() {
		super();
	}

	public AssetParamsOutput(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		assetParamsId = GsonParser.parseInt(jsonObject.get("assetParamsId"));
		assetParamsVersion = GsonParser.parseString(jsonObject.get("assetParamsVersion"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));
		assetVersion = GsonParser.parseString(jsonObject.get("assetVersion"));
		readyBehavior = GsonParser.parseInt(jsonObject.get("readyBehavior"));
		format = ContainerFormat.get(GsonParser.parseString(jsonObject.get("format")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAssetParamsOutput");
		kparams.add("assetParamsId", this.assetParamsId);
		kparams.add("assetParamsVersion", this.assetParamsVersion);
		kparams.add("assetId", this.assetId);
		kparams.add("assetVersion", this.assetVersion);
		kparams.add("readyBehavior", this.readyBehavior);
		kparams.add("format", this.format);
		return kparams;
	}

}

