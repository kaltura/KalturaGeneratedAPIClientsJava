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
// Copyright (C) 2006-2017  Kaltura Inc.
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

import com.kaltura.client.Params;
import com.kaltura.client.enums.UserAssetsListItemType;
import com.kaltura.client.enums.UserAssetsListType;
import com.kaltura.client.types.UserAssetsListItem;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class UserAssetsListItemService {

	/**  Adds a new item to user’s private asset list  */
    public static RequestBuilder<UserAssetsListItem> add(UserAssetsListItem userAssetsListItem)  {
        Params kparams = new Params();
        kparams.add("userAssetsListItem", userAssetsListItem);

        return new RequestBuilder<UserAssetsListItem>(UserAssetsListItem.class, "userassetslistitem", "add", kparams);
    }

	/**  Deletes an item from user’s private asset list  */
    public static RequestBuilder<Boolean> delete(String assetId, UserAssetsListType listType)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("listType", listType);

        return new RequestBuilder<Boolean>(Boolean.class, "userassetslistitem", "delete", kparams);
    }

	/**  Get an item from user’s private asset list  */
    public static RequestBuilder<UserAssetsListItem> get(String assetId, UserAssetsListType listType, UserAssetsListItemType itemType)  {
        Params kparams = new Params();
        kparams.add("assetId", assetId);
        kparams.add("listType", listType);
        kparams.add("itemType", itemType);

        return new RequestBuilder<UserAssetsListItem>(UserAssetsListItem.class, "userassetslistitem", "get", kparams);
    }
}
