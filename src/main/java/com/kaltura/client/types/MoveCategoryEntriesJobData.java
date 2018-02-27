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
@MultiRequestBuilder.Tokenizer(MoveCategoryEntriesJobData.Tokenizer.class)
public class MoveCategoryEntriesJobData extends JobData {
	
	public interface Tokenizer extends JobData.Tokenizer {
		String srcCategoryId();
		String destCategoryId();
		String lastMovedCategoryId();
		String lastMovedCategoryPageIndex();
		String lastMovedCategoryEntryPageIndex();
		String moveFromChildren();
		String destCategoryFullIds();
	}

	/**
	 * Source category id
	 */
	private Integer srcCategoryId;
	/**
	 * Destination category id
	 */
	private Integer destCategoryId;
	/**
	 * Saves the last category id that its entries moved completely      In case of
	  crash the batch will restart from that point
	 */
	private Integer lastMovedCategoryId;
	/**
	 * Saves the last page index of the child categories filter pager      In case of
	  crash the batch will restart from that point
	 */
	private Integer lastMovedCategoryPageIndex;
	/**
	 * Saves the last page index of the category entries filter pager      In case of
	  crash the batch will restart from that point
	 */
	private Integer lastMovedCategoryEntryPageIndex;
	/**
	 * All entries from all child categories will be moved as well
	 */
	private Boolean moveFromChildren;
	/**
	 * Destination categories fallback ids
	 */
	private String destCategoryFullIds;

	// srcCategoryId:
	public Integer getSrcCategoryId(){
		return this.srcCategoryId;
	}
	public void setSrcCategoryId(Integer srcCategoryId){
		this.srcCategoryId = srcCategoryId;
	}

	public void srcCategoryId(String multirequestToken){
		setToken("srcCategoryId", multirequestToken);
	}

	// destCategoryId:
	public Integer getDestCategoryId(){
		return this.destCategoryId;
	}
	public void setDestCategoryId(Integer destCategoryId){
		this.destCategoryId = destCategoryId;
	}

	public void destCategoryId(String multirequestToken){
		setToken("destCategoryId", multirequestToken);
	}

	// lastMovedCategoryId:
	public Integer getLastMovedCategoryId(){
		return this.lastMovedCategoryId;
	}
	public void setLastMovedCategoryId(Integer lastMovedCategoryId){
		this.lastMovedCategoryId = lastMovedCategoryId;
	}

	public void lastMovedCategoryId(String multirequestToken){
		setToken("lastMovedCategoryId", multirequestToken);
	}

	// lastMovedCategoryPageIndex:
	public Integer getLastMovedCategoryPageIndex(){
		return this.lastMovedCategoryPageIndex;
	}
	public void setLastMovedCategoryPageIndex(Integer lastMovedCategoryPageIndex){
		this.lastMovedCategoryPageIndex = lastMovedCategoryPageIndex;
	}

	public void lastMovedCategoryPageIndex(String multirequestToken){
		setToken("lastMovedCategoryPageIndex", multirequestToken);
	}

	// lastMovedCategoryEntryPageIndex:
	public Integer getLastMovedCategoryEntryPageIndex(){
		return this.lastMovedCategoryEntryPageIndex;
	}
	public void setLastMovedCategoryEntryPageIndex(Integer lastMovedCategoryEntryPageIndex){
		this.lastMovedCategoryEntryPageIndex = lastMovedCategoryEntryPageIndex;
	}

	public void lastMovedCategoryEntryPageIndex(String multirequestToken){
		setToken("lastMovedCategoryEntryPageIndex", multirequestToken);
	}

	// moveFromChildren:
	public Boolean getMoveFromChildren(){
		return this.moveFromChildren;
	}
	public void setMoveFromChildren(Boolean moveFromChildren){
		this.moveFromChildren = moveFromChildren;
	}

	public void moveFromChildren(String multirequestToken){
		setToken("moveFromChildren", multirequestToken);
	}

	// destCategoryFullIds:
	public String getDestCategoryFullIds(){
		return this.destCategoryFullIds;
	}
	public void setDestCategoryFullIds(String destCategoryFullIds){
		this.destCategoryFullIds = destCategoryFullIds;
	}

	public void destCategoryFullIds(String multirequestToken){
		setToken("destCategoryFullIds", multirequestToken);
	}


	public MoveCategoryEntriesJobData() {
		super();
	}

	public MoveCategoryEntriesJobData(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		srcCategoryId = GsonParser.parseInt(jsonObject.get("srcCategoryId"));
		destCategoryId = GsonParser.parseInt(jsonObject.get("destCategoryId"));
		lastMovedCategoryId = GsonParser.parseInt(jsonObject.get("lastMovedCategoryId"));
		lastMovedCategoryPageIndex = GsonParser.parseInt(jsonObject.get("lastMovedCategoryPageIndex"));
		lastMovedCategoryEntryPageIndex = GsonParser.parseInt(jsonObject.get("lastMovedCategoryEntryPageIndex"));
		moveFromChildren = GsonParser.parseBoolean(jsonObject.get("moveFromChildren"));
		destCategoryFullIds = GsonParser.parseString(jsonObject.get("destCategoryFullIds"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaMoveCategoryEntriesJobData");
		kparams.add("srcCategoryId", this.srcCategoryId);
		kparams.add("destCategoryId", this.destCategoryId);
		kparams.add("lastMovedCategoryId", this.lastMovedCategoryId);
		kparams.add("lastMovedCategoryPageIndex", this.lastMovedCategoryPageIndex);
		kparams.add("lastMovedCategoryEntryPageIndex", this.lastMovedCategoryEntryPageIndex);
		kparams.add("moveFromChildren", this.moveFromChildren);
		kparams.add("destCategoryFullIds", this.destCategoryFullIds);
		return kparams;
	}

}

