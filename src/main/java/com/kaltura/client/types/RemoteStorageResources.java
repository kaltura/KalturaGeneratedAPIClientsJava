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
// Copyright (C) 2006-2022  Kaltura Inc.
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
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Used to ingest media that is available on remote server and accessible using the
  supplied URL, the media file won't be downloaded but a file sync object of URL
  type will point to the media URL.
 */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RemoteStorageResources.Tokenizer.class)
public class RemoteStorageResources extends ContentResource {
	
	public interface Tokenizer extends ContentResource.Tokenizer {
		RequestBuilder.ListTokenizer<RemoteStorageResource.Tokenizer> resources();
	}

	/**
	 * Array of remote stoage resources
	 */
	private List<RemoteStorageResource> resources;

	// resources:
	public List<RemoteStorageResource> getResources(){
		return this.resources;
	}
	public void setResources(List<RemoteStorageResource> resources){
		this.resources = resources;
	}


	public RemoteStorageResources() {
		super();
	}

	public RemoteStorageResources(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resources = GsonParser.parseArray(jsonObject.getAsJsonArray("resources"), RemoteStorageResource.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRemoteStorageResources");
		kparams.add("resources", this.resources);
		return kparams;
	}

}

