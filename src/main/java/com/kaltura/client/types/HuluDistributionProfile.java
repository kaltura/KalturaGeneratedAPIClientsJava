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
import com.kaltura.client.enums.DistributionProtocol;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(HuluDistributionProfile.Tokenizer.class)
public class HuluDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String sftpHost();
		String sftpLogin();
		String sftpPass();
		String seriesChannel();
		String seriesPrimaryCategory();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> seriesAdditionalCategories();
		String seasonNumber();
		String seasonSynopsis();
		String seasonTuneInInformation();
		String videoMediaType();
		String disableEpisodeNumberCustomValidation();
		String protocol();
		String asperaHost();
		String asperaLogin();
		String asperaPass();
		String port();
		String passphrase();
		String asperaPublicKey();
		String asperaPrivateKey();
	}

	private String sftpHost;
	private String sftpLogin;
	private String sftpPass;
	private String seriesChannel;
	private String seriesPrimaryCategory;
	private List<StringHolder> seriesAdditionalCategories;
	private String seasonNumber;
	private String seasonSynopsis;
	private String seasonTuneInInformation;
	private String videoMediaType;
	private Boolean disableEpisodeNumberCustomValidation;
	private DistributionProtocol protocol;
	private String asperaHost;
	private String asperaLogin;
	private String asperaPass;
	private Integer port;
	private String passphrase;
	private String asperaPublicKey;
	private String asperaPrivateKey;

	// sftpHost:
	public String getSftpHost(){
		return this.sftpHost;
	}
	public void setSftpHost(String sftpHost){
		this.sftpHost = sftpHost;
	}

	public void sftpHost(String multirequestToken){
		setToken("sftpHost", multirequestToken);
	}

	// sftpLogin:
	public String getSftpLogin(){
		return this.sftpLogin;
	}
	public void setSftpLogin(String sftpLogin){
		this.sftpLogin = sftpLogin;
	}

	public void sftpLogin(String multirequestToken){
		setToken("sftpLogin", multirequestToken);
	}

	// sftpPass:
	public String getSftpPass(){
		return this.sftpPass;
	}
	public void setSftpPass(String sftpPass){
		this.sftpPass = sftpPass;
	}

	public void sftpPass(String multirequestToken){
		setToken("sftpPass", multirequestToken);
	}

	// seriesChannel:
	public String getSeriesChannel(){
		return this.seriesChannel;
	}
	public void setSeriesChannel(String seriesChannel){
		this.seriesChannel = seriesChannel;
	}

	public void seriesChannel(String multirequestToken){
		setToken("seriesChannel", multirequestToken);
	}

	// seriesPrimaryCategory:
	public String getSeriesPrimaryCategory(){
		return this.seriesPrimaryCategory;
	}
	public void setSeriesPrimaryCategory(String seriesPrimaryCategory){
		this.seriesPrimaryCategory = seriesPrimaryCategory;
	}

	public void seriesPrimaryCategory(String multirequestToken){
		setToken("seriesPrimaryCategory", multirequestToken);
	}

	// seriesAdditionalCategories:
	public List<StringHolder> getSeriesAdditionalCategories(){
		return this.seriesAdditionalCategories;
	}
	public void setSeriesAdditionalCategories(List<StringHolder> seriesAdditionalCategories){
		this.seriesAdditionalCategories = seriesAdditionalCategories;
	}

	// seasonNumber:
	public String getSeasonNumber(){
		return this.seasonNumber;
	}
	public void setSeasonNumber(String seasonNumber){
		this.seasonNumber = seasonNumber;
	}

	public void seasonNumber(String multirequestToken){
		setToken("seasonNumber", multirequestToken);
	}

	// seasonSynopsis:
	public String getSeasonSynopsis(){
		return this.seasonSynopsis;
	}
	public void setSeasonSynopsis(String seasonSynopsis){
		this.seasonSynopsis = seasonSynopsis;
	}

	public void seasonSynopsis(String multirequestToken){
		setToken("seasonSynopsis", multirequestToken);
	}

	// seasonTuneInInformation:
	public String getSeasonTuneInInformation(){
		return this.seasonTuneInInformation;
	}
	public void setSeasonTuneInInformation(String seasonTuneInInformation){
		this.seasonTuneInInformation = seasonTuneInInformation;
	}

	public void seasonTuneInInformation(String multirequestToken){
		setToken("seasonTuneInInformation", multirequestToken);
	}

	// videoMediaType:
	public String getVideoMediaType(){
		return this.videoMediaType;
	}
	public void setVideoMediaType(String videoMediaType){
		this.videoMediaType = videoMediaType;
	}

	public void videoMediaType(String multirequestToken){
		setToken("videoMediaType", multirequestToken);
	}

	// disableEpisodeNumberCustomValidation:
	public Boolean getDisableEpisodeNumberCustomValidation(){
		return this.disableEpisodeNumberCustomValidation;
	}
	public void setDisableEpisodeNumberCustomValidation(Boolean disableEpisodeNumberCustomValidation){
		this.disableEpisodeNumberCustomValidation = disableEpisodeNumberCustomValidation;
	}

	public void disableEpisodeNumberCustomValidation(String multirequestToken){
		setToken("disableEpisodeNumberCustomValidation", multirequestToken);
	}

	// protocol:
	public DistributionProtocol getProtocol(){
		return this.protocol;
	}
	public void setProtocol(DistributionProtocol protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// asperaHost:
	public String getAsperaHost(){
		return this.asperaHost;
	}
	public void setAsperaHost(String asperaHost){
		this.asperaHost = asperaHost;
	}

	public void asperaHost(String multirequestToken){
		setToken("asperaHost", multirequestToken);
	}

	// asperaLogin:
	public String getAsperaLogin(){
		return this.asperaLogin;
	}
	public void setAsperaLogin(String asperaLogin){
		this.asperaLogin = asperaLogin;
	}

	public void asperaLogin(String multirequestToken){
		setToken("asperaLogin", multirequestToken);
	}

	// asperaPass:
	public String getAsperaPass(){
		return this.asperaPass;
	}
	public void setAsperaPass(String asperaPass){
		this.asperaPass = asperaPass;
	}

	public void asperaPass(String multirequestToken){
		setToken("asperaPass", multirequestToken);
	}

	// port:
	public Integer getPort(){
		return this.port;
	}
	public void setPort(Integer port){
		this.port = port;
	}

	public void port(String multirequestToken){
		setToken("port", multirequestToken);
	}

	// passphrase:
	public String getPassphrase(){
		return this.passphrase;
	}
	public void setPassphrase(String passphrase){
		this.passphrase = passphrase;
	}

	public void passphrase(String multirequestToken){
		setToken("passphrase", multirequestToken);
	}

	// asperaPublicKey:
	public String getAsperaPublicKey(){
		return this.asperaPublicKey;
	}
	public void setAsperaPublicKey(String asperaPublicKey){
		this.asperaPublicKey = asperaPublicKey;
	}

	public void asperaPublicKey(String multirequestToken){
		setToken("asperaPublicKey", multirequestToken);
	}

	// asperaPrivateKey:
	public String getAsperaPrivateKey(){
		return this.asperaPrivateKey;
	}
	public void setAsperaPrivateKey(String asperaPrivateKey){
		this.asperaPrivateKey = asperaPrivateKey;
	}

	public void asperaPrivateKey(String multirequestToken){
		setToken("asperaPrivateKey", multirequestToken);
	}


	public HuluDistributionProfile() {
		super();
	}

	public HuluDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		sftpHost = GsonParser.parseString(jsonObject.get("sftpHost"));
		sftpLogin = GsonParser.parseString(jsonObject.get("sftpLogin"));
		sftpPass = GsonParser.parseString(jsonObject.get("sftpPass"));
		seriesChannel = GsonParser.parseString(jsonObject.get("seriesChannel"));
		seriesPrimaryCategory = GsonParser.parseString(jsonObject.get("seriesPrimaryCategory"));
		seriesAdditionalCategories = GsonParser.parseArray(jsonObject.getAsJsonArray("seriesAdditionalCategories"), StringHolder.class);
		seasonNumber = GsonParser.parseString(jsonObject.get("seasonNumber"));
		seasonSynopsis = GsonParser.parseString(jsonObject.get("seasonSynopsis"));
		seasonTuneInInformation = GsonParser.parseString(jsonObject.get("seasonTuneInInformation"));
		videoMediaType = GsonParser.parseString(jsonObject.get("videoMediaType"));
		disableEpisodeNumberCustomValidation = GsonParser.parseBoolean(jsonObject.get("disableEpisodeNumberCustomValidation"));
		protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
		asperaHost = GsonParser.parseString(jsonObject.get("asperaHost"));
		asperaLogin = GsonParser.parseString(jsonObject.get("asperaLogin"));
		asperaPass = GsonParser.parseString(jsonObject.get("asperaPass"));
		port = GsonParser.parseInt(jsonObject.get("port"));
		passphrase = GsonParser.parseString(jsonObject.get("passphrase"));
		asperaPublicKey = GsonParser.parseString(jsonObject.get("asperaPublicKey"));
		asperaPrivateKey = GsonParser.parseString(jsonObject.get("asperaPrivateKey"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaHuluDistributionProfile");
		kparams.add("sftpHost", this.sftpHost);
		kparams.add("sftpLogin", this.sftpLogin);
		kparams.add("sftpPass", this.sftpPass);
		kparams.add("seriesChannel", this.seriesChannel);
		kparams.add("seriesPrimaryCategory", this.seriesPrimaryCategory);
		kparams.add("seriesAdditionalCategories", this.seriesAdditionalCategories);
		kparams.add("seasonNumber", this.seasonNumber);
		kparams.add("seasonSynopsis", this.seasonSynopsis);
		kparams.add("seasonTuneInInformation", this.seasonTuneInInformation);
		kparams.add("videoMediaType", this.videoMediaType);
		kparams.add("disableEpisodeNumberCustomValidation", this.disableEpisodeNumberCustomValidation);
		kparams.add("protocol", this.protocol);
		kparams.add("asperaHost", this.asperaHost);
		kparams.add("asperaLogin", this.asperaLogin);
		kparams.add("asperaPass", this.asperaPass);
		kparams.add("port", this.port);
		kparams.add("passphrase", this.passphrase);
		kparams.add("asperaPublicKey", this.asperaPublicKey);
		kparams.add("asperaPrivateKey", this.asperaPrivateKey);
		return kparams;
	}

}

