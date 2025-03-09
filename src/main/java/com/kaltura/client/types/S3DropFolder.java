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
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(S3DropFolder.Tokenizer.class)
public class S3DropFolder extends DropFolder {
	
	public interface Tokenizer extends DropFolder.Tokenizer {
		String s3Host();
		String s3Region();
		String s3UserId();
		String s3Password();
		String useS3Arn();
		String s3Arn();
	}

	private String s3Host;
	private String s3Region;
	private String s3UserId;
	private String s3Password;
	private Boolean useS3Arn;
	private String s3Arn;

	// s3Host:
	public String getS3Host(){
		return this.s3Host;
	}
	public void setS3Host(String s3Host){
		this.s3Host = s3Host;
	}

	public void s3Host(String multirequestToken){
		setToken("s3Host", multirequestToken);
	}

	// s3Region:
	public String getS3Region(){
		return this.s3Region;
	}
	public void setS3Region(String s3Region){
		this.s3Region = s3Region;
	}

	public void s3Region(String multirequestToken){
		setToken("s3Region", multirequestToken);
	}

	// s3UserId:
	public String getS3UserId(){
		return this.s3UserId;
	}
	public void setS3UserId(String s3UserId){
		this.s3UserId = s3UserId;
	}

	public void s3UserId(String multirequestToken){
		setToken("s3UserId", multirequestToken);
	}

	// s3Password:
	public String getS3Password(){
		return this.s3Password;
	}
	public void setS3Password(String s3Password){
		this.s3Password = s3Password;
	}

	public void s3Password(String multirequestToken){
		setToken("s3Password", multirequestToken);
	}

	// useS3Arn:
	public Boolean getUseS3Arn(){
		return this.useS3Arn;
	}
	public void setUseS3Arn(Boolean useS3Arn){
		this.useS3Arn = useS3Arn;
	}

	public void useS3Arn(String multirequestToken){
		setToken("useS3Arn", multirequestToken);
	}

	// s3Arn:
	public String getS3Arn(){
		return this.s3Arn;
	}

	public S3DropFolder() {
		super();
	}

	public S3DropFolder(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		s3Host = GsonParser.parseString(jsonObject.get("s3Host"));
		s3Region = GsonParser.parseString(jsonObject.get("s3Region"));
		s3UserId = GsonParser.parseString(jsonObject.get("s3UserId"));
		s3Password = GsonParser.parseString(jsonObject.get("s3Password"));
		useS3Arn = GsonParser.parseBoolean(jsonObject.get("useS3Arn"));
		s3Arn = GsonParser.parseString(jsonObject.get("s3Arn"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaS3DropFolder");
		kparams.add("s3Host", this.s3Host);
		kparams.add("s3Region", this.s3Region);
		kparams.add("s3UserId", this.s3UserId);
		kparams.add("s3Password", this.s3Password);
		kparams.add("useS3Arn", this.useS3Arn);
		return kparams;
	}

}

