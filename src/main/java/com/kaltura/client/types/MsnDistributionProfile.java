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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(MsnDistributionProfile.Tokenizer.class)
public class MsnDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String username();
		String password();
		String domain();
		String csId();
		String source();
		String sourceFriendlyName();
		String pageGroup();
		String sourceFlavorParamsId();
		String wmvFlavorParamsId();
		String flvFlavorParamsId();
		String slFlavorParamsId();
		String slHdFlavorParamsId();
		String msnvideoCat();
		String msnvideoTop();
		String msnvideoTopCat();
	}

	private String username;
	private String password;
	private String domain;
	private String csId;
	private String source;
	private String sourceFriendlyName;
	private String pageGroup;
	private Integer sourceFlavorParamsId;
	private Integer wmvFlavorParamsId;
	private Integer flvFlavorParamsId;
	private Integer slFlavorParamsId;
	private Integer slHdFlavorParamsId;
	private String msnvideoCat;
	private String msnvideoTop;
	private String msnvideoTopCat;

	// username:
	public String getUsername(){
		return this.username;
	}
	public void setUsername(String username){
		this.username = username;
	}

	public void username(String multirequestToken){
		setToken("username", multirequestToken);
	}

	// password:
	public String getPassword(){
		return this.password;
	}
	public void setPassword(String password){
		this.password = password;
	}

	public void password(String multirequestToken){
		setToken("password", multirequestToken);
	}

	// domain:
	public String getDomain(){
		return this.domain;
	}
	public void setDomain(String domain){
		this.domain = domain;
	}

	public void domain(String multirequestToken){
		setToken("domain", multirequestToken);
	}

	// csId:
	public String getCsId(){
		return this.csId;
	}
	public void setCsId(String csId){
		this.csId = csId;
	}

	public void csId(String multirequestToken){
		setToken("csId", multirequestToken);
	}

	// source:
	public String getSource(){
		return this.source;
	}
	public void setSource(String source){
		this.source = source;
	}

	public void source(String multirequestToken){
		setToken("source", multirequestToken);
	}

	// sourceFriendlyName:
	public String getSourceFriendlyName(){
		return this.sourceFriendlyName;
	}
	public void setSourceFriendlyName(String sourceFriendlyName){
		this.sourceFriendlyName = sourceFriendlyName;
	}

	public void sourceFriendlyName(String multirequestToken){
		setToken("sourceFriendlyName", multirequestToken);
	}

	// pageGroup:
	public String getPageGroup(){
		return this.pageGroup;
	}
	public void setPageGroup(String pageGroup){
		this.pageGroup = pageGroup;
	}

	public void pageGroup(String multirequestToken){
		setToken("pageGroup", multirequestToken);
	}

	// sourceFlavorParamsId:
	public Integer getSourceFlavorParamsId(){
		return this.sourceFlavorParamsId;
	}
	public void setSourceFlavorParamsId(Integer sourceFlavorParamsId){
		this.sourceFlavorParamsId = sourceFlavorParamsId;
	}

	public void sourceFlavorParamsId(String multirequestToken){
		setToken("sourceFlavorParamsId", multirequestToken);
	}

	// wmvFlavorParamsId:
	public Integer getWmvFlavorParamsId(){
		return this.wmvFlavorParamsId;
	}
	public void setWmvFlavorParamsId(Integer wmvFlavorParamsId){
		this.wmvFlavorParamsId = wmvFlavorParamsId;
	}

	public void wmvFlavorParamsId(String multirequestToken){
		setToken("wmvFlavorParamsId", multirequestToken);
	}

	// flvFlavorParamsId:
	public Integer getFlvFlavorParamsId(){
		return this.flvFlavorParamsId;
	}
	public void setFlvFlavorParamsId(Integer flvFlavorParamsId){
		this.flvFlavorParamsId = flvFlavorParamsId;
	}

	public void flvFlavorParamsId(String multirequestToken){
		setToken("flvFlavorParamsId", multirequestToken);
	}

	// slFlavorParamsId:
	public Integer getSlFlavorParamsId(){
		return this.slFlavorParamsId;
	}
	public void setSlFlavorParamsId(Integer slFlavorParamsId){
		this.slFlavorParamsId = slFlavorParamsId;
	}

	public void slFlavorParamsId(String multirequestToken){
		setToken("slFlavorParamsId", multirequestToken);
	}

	// slHdFlavorParamsId:
	public Integer getSlHdFlavorParamsId(){
		return this.slHdFlavorParamsId;
	}
	public void setSlHdFlavorParamsId(Integer slHdFlavorParamsId){
		this.slHdFlavorParamsId = slHdFlavorParamsId;
	}

	public void slHdFlavorParamsId(String multirequestToken){
		setToken("slHdFlavorParamsId", multirequestToken);
	}

	// msnvideoCat:
	public String getMsnvideoCat(){
		return this.msnvideoCat;
	}
	public void setMsnvideoCat(String msnvideoCat){
		this.msnvideoCat = msnvideoCat;
	}

	public void msnvideoCat(String multirequestToken){
		setToken("msnvideoCat", multirequestToken);
	}

	// msnvideoTop:
	public String getMsnvideoTop(){
		return this.msnvideoTop;
	}
	public void setMsnvideoTop(String msnvideoTop){
		this.msnvideoTop = msnvideoTop;
	}

	public void msnvideoTop(String multirequestToken){
		setToken("msnvideoTop", multirequestToken);
	}

	// msnvideoTopCat:
	public String getMsnvideoTopCat(){
		return this.msnvideoTopCat;
	}
	public void setMsnvideoTopCat(String msnvideoTopCat){
		this.msnvideoTopCat = msnvideoTopCat;
	}

	public void msnvideoTopCat(String multirequestToken){
		setToken("msnvideoTopCat", multirequestToken);
	}


	public MsnDistributionProfile() {
		super();
	}

	public MsnDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		domain = GsonParser.parseString(jsonObject.get("domain"));
		csId = GsonParser.parseString(jsonObject.get("csId"));
		source = GsonParser.parseString(jsonObject.get("source"));
		sourceFriendlyName = GsonParser.parseString(jsonObject.get("sourceFriendlyName"));
		pageGroup = GsonParser.parseString(jsonObject.get("pageGroup"));
		sourceFlavorParamsId = GsonParser.parseInt(jsonObject.get("sourceFlavorParamsId"));
		wmvFlavorParamsId = GsonParser.parseInt(jsonObject.get("wmvFlavorParamsId"));
		flvFlavorParamsId = GsonParser.parseInt(jsonObject.get("flvFlavorParamsId"));
		slFlavorParamsId = GsonParser.parseInt(jsonObject.get("slFlavorParamsId"));
		slHdFlavorParamsId = GsonParser.parseInt(jsonObject.get("slHdFlavorParamsId"));
		msnvideoCat = GsonParser.parseString(jsonObject.get("msnvideoCat"));
		msnvideoTop = GsonParser.parseString(jsonObject.get("msnvideoTop"));
		msnvideoTopCat = GsonParser.parseString(jsonObject.get("msnvideoTopCat"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMsnDistributionProfile");
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("domain", this.domain);
		kparams.add("csId", this.csId);
		kparams.add("source", this.source);
		kparams.add("sourceFriendlyName", this.sourceFriendlyName);
		kparams.add("pageGroup", this.pageGroup);
		kparams.add("sourceFlavorParamsId", this.sourceFlavorParamsId);
		kparams.add("wmvFlavorParamsId", this.wmvFlavorParamsId);
		kparams.add("flvFlavorParamsId", this.flvFlavorParamsId);
		kparams.add("slFlavorParamsId", this.slFlavorParamsId);
		kparams.add("slHdFlavorParamsId", this.slHdFlavorParamsId);
		kparams.add("msnvideoCat", this.msnvideoCat);
		kparams.add("msnvideoTop", this.msnvideoTop);
		kparams.add("msnvideoTopCat", this.msnvideoTopCat);
		return kparams;
	}

}

