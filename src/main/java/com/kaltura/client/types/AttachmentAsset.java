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
import com.kaltura.client.enums.AttachmentAssetStatus;
import com.kaltura.client.enums.AttachmentType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(AttachmentAsset.Tokenizer.class)
public class AttachmentAsset extends Asset {
	
	public interface Tokenizer extends Asset.Tokenizer {
		String filename();
		String title();
		String format();
	}

	/**
	 * The filename of the attachment asset content
	 */
	private String filename;
	/**
	 * Attachment asset title
	 */
	private String title;
	/**
	 * The attachment format
	 */
	private AttachmentType format;
	/**
	 * The status of the asset
	 */
	private AttachmentAssetStatus status;

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

	// title:
	public String getTitle(){
		return this.title;
	}
	public void setTitle(String title){
		this.title = title;
	}

	public void title(String multirequestToken){
		setToken("title", multirequestToken);
	}

	// format:
	public AttachmentType getFormat(){
		return this.format;
	}
	public void setFormat(AttachmentType format){
		this.format = format;
	}

	public void format(String multirequestToken){
		setToken("format", multirequestToken);
	}

	// status:
	public AttachmentAssetStatus getStatus(){
		return this.status;
	}

	public AttachmentAsset() {
		super();
	}

	public AttachmentAsset(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		filename = GsonParser.parseString(jsonObject.get("filename"));
		title = GsonParser.parseString(jsonObject.get("title"));
		format = AttachmentType.get(GsonParser.parseString(jsonObject.get("format")));
		status = AttachmentAssetStatus.get(GsonParser.parseInt(jsonObject.get("status")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaAttachmentAsset");
		kparams.add("filename", this.filename);
		kparams.add("title", this.title);
		kparams.add("format", this.format);
		return kparams;
	}

}

