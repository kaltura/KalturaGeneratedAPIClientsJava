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
import com.kaltura.client.enums.GameObjectType;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(UserScorePropertiesFilter.Tokenizer.class)
public class UserScorePropertiesFilter extends UserScorePropertiesBaseFilter {
	
	public interface Tokenizer extends UserScorePropertiesBaseFilter.Tokenizer {
		String gameObjectId();
		String gameObjectType();
		String userIdEqual();
		String placesAboveUser();
		String placesBelowUser();
	}

	private String gameObjectId;
	private GameObjectType gameObjectType;
	private String userIdEqual;
	private Integer placesAboveUser;
	private Integer placesBelowUser;

	// gameObjectId:
	public String getGameObjectId(){
		return this.gameObjectId;
	}
	public void setGameObjectId(String gameObjectId){
		this.gameObjectId = gameObjectId;
	}

	public void gameObjectId(String multirequestToken){
		setToken("gameObjectId", multirequestToken);
	}

	// gameObjectType:
	public GameObjectType getGameObjectType(){
		return this.gameObjectType;
	}
	public void setGameObjectType(GameObjectType gameObjectType){
		this.gameObjectType = gameObjectType;
	}

	public void gameObjectType(String multirequestToken){
		setToken("gameObjectType", multirequestToken);
	}

	// userIdEqual:
	public String getUserIdEqual(){
		return this.userIdEqual;
	}
	public void setUserIdEqual(String userIdEqual){
		this.userIdEqual = userIdEqual;
	}

	public void userIdEqual(String multirequestToken){
		setToken("userIdEqual", multirequestToken);
	}

	// placesAboveUser:
	public Integer getPlacesAboveUser(){
		return this.placesAboveUser;
	}
	public void setPlacesAboveUser(Integer placesAboveUser){
		this.placesAboveUser = placesAboveUser;
	}

	public void placesAboveUser(String multirequestToken){
		setToken("placesAboveUser", multirequestToken);
	}

	// placesBelowUser:
	public Integer getPlacesBelowUser(){
		return this.placesBelowUser;
	}
	public void setPlacesBelowUser(Integer placesBelowUser){
		this.placesBelowUser = placesBelowUser;
	}

	public void placesBelowUser(String multirequestToken){
		setToken("placesBelowUser", multirequestToken);
	}


	public UserScorePropertiesFilter() {
		super();
	}

	public UserScorePropertiesFilter(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		gameObjectId = GsonParser.parseString(jsonObject.get("gameObjectId"));
		gameObjectType = GameObjectType.get(GsonParser.parseString(jsonObject.get("gameObjectType")));
		userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
		placesAboveUser = GsonParser.parseInt(jsonObject.get("placesAboveUser"));
		placesBelowUser = GsonParser.parseInt(jsonObject.get("placesBelowUser"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaUserScorePropertiesFilter");
		kparams.add("gameObjectId", this.gameObjectId);
		kparams.add("gameObjectType", this.gameObjectType);
		kparams.add("userIdEqual", this.userIdEqual);
		kparams.add("placesAboveUser", this.placesAboveUser);
		kparams.add("placesBelowUser", this.placesBelowUser);
		return kparams;
	}

}

