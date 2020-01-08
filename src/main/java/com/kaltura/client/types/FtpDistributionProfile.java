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
// Copyright (C) 2006-2020  Kaltura Inc.
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

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(FtpDistributionProfile.Tokenizer.class)
public class FtpDistributionProfile extends ConfigurableDistributionProfile {
	
	public interface Tokenizer extends ConfigurableDistributionProfile.Tokenizer {
		String protocol();
		String host();
		String port();
		String basePath();
		String username();
		String password();
		String passphrase();
		String sftpPublicKey();
		String sftpPrivateKey();
		String disableMetadata();
		String metadataXslt();
		String metadataFilenameXslt();
		String flavorAssetFilenameXslt();
		String thumbnailAssetFilenameXslt();
		String assetFilenameXslt();
		String asperaPublicKey();
		String asperaPrivateKey();
		String sendMetadataAfterAssets();
	}

	private DistributionProtocol protocol;
	private String host;
	private Integer port;
	private String basePath;
	private String username;
	private String password;
	private String passphrase;
	private String sftpPublicKey;
	private String sftpPrivateKey;
	private Boolean disableMetadata;
	private String metadataXslt;
	private String metadataFilenameXslt;
	private String flavorAssetFilenameXslt;
	private String thumbnailAssetFilenameXslt;
	private String assetFilenameXslt;
	private String asperaPublicKey;
	private String asperaPrivateKey;
	private Boolean sendMetadataAfterAssets;

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

	// host:
	public String getHost(){
		return this.host;
	}
	public void setHost(String host){
		this.host = host;
	}

	public void host(String multirequestToken){
		setToken("host", multirequestToken);
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

	// basePath:
	public String getBasePath(){
		return this.basePath;
	}
	public void setBasePath(String basePath){
		this.basePath = basePath;
	}

	public void basePath(String multirequestToken){
		setToken("basePath", multirequestToken);
	}

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

	// sftpPublicKey:
	public String getSftpPublicKey(){
		return this.sftpPublicKey;
	}
	public void setSftpPublicKey(String sftpPublicKey){
		this.sftpPublicKey = sftpPublicKey;
	}

	public void sftpPublicKey(String multirequestToken){
		setToken("sftpPublicKey", multirequestToken);
	}

	// sftpPrivateKey:
	public String getSftpPrivateKey(){
		return this.sftpPrivateKey;
	}
	public void setSftpPrivateKey(String sftpPrivateKey){
		this.sftpPrivateKey = sftpPrivateKey;
	}

	public void sftpPrivateKey(String multirequestToken){
		setToken("sftpPrivateKey", multirequestToken);
	}

	// disableMetadata:
	public Boolean getDisableMetadata(){
		return this.disableMetadata;
	}
	public void setDisableMetadata(Boolean disableMetadata){
		this.disableMetadata = disableMetadata;
	}

	public void disableMetadata(String multirequestToken){
		setToken("disableMetadata", multirequestToken);
	}

	// metadataXslt:
	public String getMetadataXslt(){
		return this.metadataXslt;
	}
	public void setMetadataXslt(String metadataXslt){
		this.metadataXslt = metadataXslt;
	}

	public void metadataXslt(String multirequestToken){
		setToken("metadataXslt", multirequestToken);
	}

	// metadataFilenameXslt:
	public String getMetadataFilenameXslt(){
		return this.metadataFilenameXslt;
	}
	public void setMetadataFilenameXslt(String metadataFilenameXslt){
		this.metadataFilenameXslt = metadataFilenameXslt;
	}

	public void metadataFilenameXslt(String multirequestToken){
		setToken("metadataFilenameXslt", multirequestToken);
	}

	// flavorAssetFilenameXslt:
	public String getFlavorAssetFilenameXslt(){
		return this.flavorAssetFilenameXslt;
	}
	public void setFlavorAssetFilenameXslt(String flavorAssetFilenameXslt){
		this.flavorAssetFilenameXslt = flavorAssetFilenameXslt;
	}

	public void flavorAssetFilenameXslt(String multirequestToken){
		setToken("flavorAssetFilenameXslt", multirequestToken);
	}

	// thumbnailAssetFilenameXslt:
	public String getThumbnailAssetFilenameXslt(){
		return this.thumbnailAssetFilenameXslt;
	}
	public void setThumbnailAssetFilenameXslt(String thumbnailAssetFilenameXslt){
		this.thumbnailAssetFilenameXslt = thumbnailAssetFilenameXslt;
	}

	public void thumbnailAssetFilenameXslt(String multirequestToken){
		setToken("thumbnailAssetFilenameXslt", multirequestToken);
	}

	// assetFilenameXslt:
	public String getAssetFilenameXslt(){
		return this.assetFilenameXslt;
	}
	public void setAssetFilenameXslt(String assetFilenameXslt){
		this.assetFilenameXslt = assetFilenameXslt;
	}

	public void assetFilenameXslt(String multirequestToken){
		setToken("assetFilenameXslt", multirequestToken);
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

	// sendMetadataAfterAssets:
	public Boolean getSendMetadataAfterAssets(){
		return this.sendMetadataAfterAssets;
	}
	public void setSendMetadataAfterAssets(Boolean sendMetadataAfterAssets){
		this.sendMetadataAfterAssets = sendMetadataAfterAssets;
	}

	public void sendMetadataAfterAssets(String multirequestToken){
		setToken("sendMetadataAfterAssets", multirequestToken);
	}


	public FtpDistributionProfile() {
		super();
	}

	public FtpDistributionProfile(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		protocol = DistributionProtocol.get(GsonParser.parseInt(jsonObject.get("protocol")));
		host = GsonParser.parseString(jsonObject.get("host"));
		port = GsonParser.parseInt(jsonObject.get("port"));
		basePath = GsonParser.parseString(jsonObject.get("basePath"));
		username = GsonParser.parseString(jsonObject.get("username"));
		password = GsonParser.parseString(jsonObject.get("password"));
		passphrase = GsonParser.parseString(jsonObject.get("passphrase"));
		sftpPublicKey = GsonParser.parseString(jsonObject.get("sftpPublicKey"));
		sftpPrivateKey = GsonParser.parseString(jsonObject.get("sftpPrivateKey"));
		disableMetadata = GsonParser.parseBoolean(jsonObject.get("disableMetadata"));
		metadataXslt = GsonParser.parseString(jsonObject.get("metadataXslt"));
		metadataFilenameXslt = GsonParser.parseString(jsonObject.get("metadataFilenameXslt"));
		flavorAssetFilenameXslt = GsonParser.parseString(jsonObject.get("flavorAssetFilenameXslt"));
		thumbnailAssetFilenameXslt = GsonParser.parseString(jsonObject.get("thumbnailAssetFilenameXslt"));
		assetFilenameXslt = GsonParser.parseString(jsonObject.get("assetFilenameXslt"));
		asperaPublicKey = GsonParser.parseString(jsonObject.get("asperaPublicKey"));
		asperaPrivateKey = GsonParser.parseString(jsonObject.get("asperaPrivateKey"));
		sendMetadataAfterAssets = GsonParser.parseBoolean(jsonObject.get("sendMetadataAfterAssets"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaFtpDistributionProfile");
		kparams.add("protocol", this.protocol);
		kparams.add("host", this.host);
		kparams.add("port", this.port);
		kparams.add("basePath", this.basePath);
		kparams.add("username", this.username);
		kparams.add("password", this.password);
		kparams.add("passphrase", this.passphrase);
		kparams.add("sftpPublicKey", this.sftpPublicKey);
		kparams.add("sftpPrivateKey", this.sftpPrivateKey);
		kparams.add("disableMetadata", this.disableMetadata);
		kparams.add("metadataXslt", this.metadataXslt);
		kparams.add("metadataFilenameXslt", this.metadataFilenameXslt);
		kparams.add("flavorAssetFilenameXslt", this.flavorAssetFilenameXslt);
		kparams.add("thumbnailAssetFilenameXslt", this.thumbnailAssetFilenameXslt);
		kparams.add("assetFilenameXslt", this.assetFilenameXslt);
		kparams.add("asperaPublicKey", this.asperaPublicKey);
		kparams.add("asperaPrivateKey", this.asperaPrivateKey);
		kparams.add("sendMetadataAfterAssets", this.sendMetadataAfterAssets);
		return kparams;
	}

}

