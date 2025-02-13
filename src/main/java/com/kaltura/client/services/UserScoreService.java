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
package com.kaltura.client.services;

import com.kaltura.client.enums.GameObjectType;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.UserScorePropertiesFilter;
import com.kaltura.client.types.UserScorePropertiesResponse;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UserScoreService {
	
	public static class DeleteUserScoreBuilder extends RequestBuilder<UserScorePropertiesResponse, UserScorePropertiesResponse.Tokenizer, DeleteUserScoreBuilder> {
		
		public DeleteUserScoreBuilder(String gameObjectId, GameObjectType gameObjectType, String userId) {
			super(UserScorePropertiesResponse.class, "game_userscore", "delete");
			params.add("gameObjectId", gameObjectId);
			params.add("gameObjectType", gameObjectType);
			params.add("userId", userId);
		}
		
		public void gameObjectId(String multirequestToken) {
			params.add("gameObjectId", multirequestToken);
		}
		
		public void gameObjectType(String multirequestToken) {
			params.add("gameObjectType", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

    public static DeleteUserScoreBuilder delete(String gameObjectId, GameObjectType gameObjectType, String userId)  {
		return new DeleteUserScoreBuilder(gameObjectId, gameObjectType, userId);
	}
	
	public static class ListUserScoreBuilder extends RequestBuilder<UserScorePropertiesResponse, UserScorePropertiesResponse.Tokenizer, ListUserScoreBuilder> {
		
		public ListUserScoreBuilder(UserScorePropertiesFilter filter, FilterPager pager) {
			super(UserScorePropertiesResponse.class, "game_userscore", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListUserScoreBuilder list(UserScorePropertiesFilter filter)  {
		return list(filter, null);
	}

    public static ListUserScoreBuilder list(UserScorePropertiesFilter filter, FilterPager pager)  {
		return new ListUserScoreBuilder(filter, pager);
	}
	
	public static class UpdateUserScoreBuilder extends RequestBuilder<UserScorePropertiesResponse, UserScorePropertiesResponse.Tokenizer, UpdateUserScoreBuilder> {
		
		public UpdateUserScoreBuilder(String gameObjectId, GameObjectType gameObjectType, String userId, int score) {
			super(UserScorePropertiesResponse.class, "game_userscore", "update");
			params.add("gameObjectId", gameObjectId);
			params.add("gameObjectType", gameObjectType);
			params.add("userId", userId);
			params.add("score", score);
		}
		
		public void gameObjectId(String multirequestToken) {
			params.add("gameObjectId", multirequestToken);
		}
		
		public void gameObjectType(String multirequestToken) {
			params.add("gameObjectType", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void score(String multirequestToken) {
			params.add("score", multirequestToken);
		}
	}

    public static UpdateUserScoreBuilder update(String gameObjectId, GameObjectType gameObjectType, String userId, int score)  {
		return new UpdateUserScoreBuilder(gameObjectId, gameObjectType, userId, score);
	}
}
