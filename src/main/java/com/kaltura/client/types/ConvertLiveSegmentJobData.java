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
import com.kaltura.client.enums.EntryServerNodeType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ConvertLiveSegmentJobData.Tokenizer.class)
public class ConvertLiveSegmentJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String entryId();
		String assetId();
		String mediaServerIndex();
		String fileIndex();
		String srcFilePath();
		String destFilePath();
		String endTime();
		String destDataFilePath();
	}

	/**
	 * Live stream entry id
	 */
	private String entryId;
	private String assetId;
	/**
	 * Primary or secondary media server
	 */
	private EntryServerNodeType mediaServerIndex;
	/**
	 * The index of the file within the entry
	 */
	private Integer fileIndex;
	/**
	 * The recorded live media
	 */
	private String srcFilePath;
	/**
	 * The output file
	 */
	private String destFilePath;
	/**
	 * Duration of the live entry including all recorded segments including the current
	 */
	private Double endTime;
	/**
	 * The data output file
	 */
	private String destDataFilePath;

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

	// mediaServerIndex:
	public EntryServerNodeType getMediaServerIndex(){
		return this.mediaServerIndex;
	}
	public void setMediaServerIndex(EntryServerNodeType mediaServerIndex){
		this.mediaServerIndex = mediaServerIndex;
	}

	public void mediaServerIndex(String multirequestToken){
		setToken("mediaServerIndex", multirequestToken);
	}

	// fileIndex:
	public Integer getFileIndex(){
		return this.fileIndex;
	}
	public void setFileIndex(Integer fileIndex){
		this.fileIndex = fileIndex;
	}

	public void fileIndex(String multirequestToken){
		setToken("fileIndex", multirequestToken);
	}

	// srcFilePath:
	public String getSrcFilePath(){
		return this.srcFilePath;
	}
	public void setSrcFilePath(String srcFilePath){
		this.srcFilePath = srcFilePath;
	}

	public void srcFilePath(String multirequestToken){
		setToken("srcFilePath", multirequestToken);
	}

	// destFilePath:
	public String getDestFilePath(){
		return this.destFilePath;
	}
	public void setDestFilePath(String destFilePath){
		this.destFilePath = destFilePath;
	}

	public void destFilePath(String multirequestToken){
		setToken("destFilePath", multirequestToken);
	}

	// endTime:
	public Double getEndTime(){
		return this.endTime;
	}
	public void setEndTime(Double endTime){
		this.endTime = endTime;
	}

	public void endTime(String multirequestToken){
		setToken("endTime", multirequestToken);
	}

	// destDataFilePath:
	public String getDestDataFilePath(){
		return this.destDataFilePath;
	}
	public void setDestDataFilePath(String destDataFilePath){
		this.destDataFilePath = destDataFilePath;
	}

	public void destDataFilePath(String multirequestToken){
		setToken("destDataFilePath", multirequestToken);
	}


	public ConvertLiveSegmentJobData() {
		super();
	}

	public ConvertLiveSegmentJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		entryId = GsonParser.parseString(jsonObject.get("entryId"));
		assetId = GsonParser.parseString(jsonObject.get("assetId"));
		mediaServerIndex = EntryServerNodeType.get(GsonParser.parseString(jsonObject.get("mediaServerIndex")));
		fileIndex = GsonParser.parseInt(jsonObject.get("fileIndex"));
		srcFilePath = GsonParser.parseString(jsonObject.get("srcFilePath"));
		destFilePath = GsonParser.parseString(jsonObject.get("destFilePath"));
		endTime = GsonParser.parseDouble(jsonObject.get("endTime"));
		destDataFilePath = GsonParser.parseString(jsonObject.get("destDataFilePath"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaConvertLiveSegmentJobData");
		kparams.add("entryId", this.entryId);
		kparams.add("assetId", this.assetId);
		kparams.add("mediaServerIndex", this.mediaServerIndex);
		kparams.add("fileIndex", this.fileIndex);
		kparams.add("srcFilePath", this.srcFilePath);
		kparams.add("destFilePath", this.destFilePath);
		kparams.add("endTime", this.endTime);
		kparams.add("destDataFilePath", this.destDataFilePath);
		return kparams;
	}

}

