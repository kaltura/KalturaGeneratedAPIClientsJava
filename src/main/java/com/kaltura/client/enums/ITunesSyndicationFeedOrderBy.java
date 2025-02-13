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
package com.kaltura.client.enums;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum ITunesSyndicationFeedOrderBy implements EnumAsString {
	CREATED_AT_ASC("+createdAt"),
	NAME_ASC("+name"),
	PLAYLIST_ID_ASC("+playlistId"),
	TYPE_ASC("+type"),
	UPDATED_AT_ASC("+updatedAt"),
	CREATED_AT_DESC("-createdAt"),
	NAME_DESC("-name"),
	PLAYLIST_ID_DESC("-playlistId"),
	TYPE_DESC("-type"),
	UPDATED_AT_DESC("-updatedAt");

	private String value;

	ITunesSyndicationFeedOrderBy(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static ITunesSyndicationFeedOrderBy get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over ITunesSyndicationFeedOrderBy defined values and compare the inner value with the given one:
		for(ITunesSyndicationFeedOrderBy item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return ITunesSyndicationFeedOrderBy.values().length > 0 ? ITunesSyndicationFeedOrderBy.values()[0]: null;
   }
}
