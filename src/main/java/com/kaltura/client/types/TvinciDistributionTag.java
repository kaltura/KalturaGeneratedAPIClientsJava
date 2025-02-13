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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(TvinciDistributionTag.Tokenizer.class)
public class TvinciDistributionTag extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String tagname();
		String extension();
		String protocol();
		String format();
		String filename();
		String ppvmodule();
	}

	private String tagname;
	private String extension;
	private String protocol;
	private String format;
	private String filename;
	private String ppvmodule;

	// tagname:
	public String getTagname(){
		return this.tagname;
	}
	public void setTagname(String tagname){
		this.tagname = tagname;
	}

	public void tagname(String multirequestToken){
		setToken("tagname", multirequestToken);
	}

	// extension:
	public String getExtension(){
		return this.extension;
	}
	public void setExtension(String extension){
		this.extension = extension;
	}

	public void extension(String multirequestToken){
		setToken("extension", multirequestToken);
	}

	// protocol:
	public String getProtocol(){
		return this.protocol;
	}
	public void setProtocol(String protocol){
		this.protocol = protocol;
	}

	public void protocol(String multirequestToken){
		setToken("protocol", multirequestToken);
	}

	// format:
	public String getFormat(){
		return this.format;
	}
	public void setFormat(String format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// filename:
	public String getFilename(){
		return this.filename;
	}
	public void setFilename(String filename){
		this.filename = filename;
	}

	public void filename(String multirequestToken){
		setToken("filename", multirequestToken);
	}

	// ppvmodule:
	public String getPpvmodule(){
		return this.ppvmodule;
	}
	public void setPpvmodule(String ppvmodule){
		this.ppvmodule = ppvmodule;
	}

	public void ppvmodule(String multirequestToken){
		setToken("ppvmodule", multirequestToken);
	}


	public TvinciDistributionTag() {
		super();
	}

	public TvinciDistributionTag(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		tagname = GsonParser.parseString(jsonObject.get("tagname"));
		extension = GsonParser.parseString(jsonObject.get("extension"));
		protocol = GsonParser.parseString(jsonObject.get("protocol"));
		format = GsonParser.parseString(jsonObject.get("format"));
		filename = GsonParser.parseString(jsonObject.get("filename"));
		ppvmodule = GsonParser.parseString(jsonObject.get("ppvmodule"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaTvinciDistributionTag");
		kparams.add("tagname", this.tagname);
		kparams.add("extension", this.extension);
		kparams.add("protocol", this.protocol);
		kparams.add("format", this.format);
		kparams.add("filename", this.filename);
		kparams.add("ppvmodule", this.ppvmodule);
		return kparams;
	}

}

