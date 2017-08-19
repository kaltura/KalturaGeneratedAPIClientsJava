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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Advanced configuration for entry replacement process  */
@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(EntryReplacementOptions.Tokenizer.class)
public class EntryReplacementOptions extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String keepManualThumbnails();
		RequestBuilder.ListTokenizer<PluginReplacementOptionsItem.Tokenizer> pluginOptionItems();
	}

	/**  If true manually created thumbnails will not be deleted on entry replacement  */
	private Integer keepManualThumbnails;
	/**  Array of plugin replacement options  */
	private List<PluginReplacementOptionsItem> pluginOptionItems;

	// keepManualThumbnails:
	public Integer getKeepManualThumbnails(){
		return this.keepManualThumbnails;
	}
	public void setKeepManualThumbnails(Integer keepManualThumbnails){
		this.keepManualThumbnails = keepManualThumbnails;
	}

	public void keepManualThumbnails(String multirequestToken){
		setToken("keepManualThumbnails", multirequestToken);
	}

	// pluginOptionItems:
	public List<PluginReplacementOptionsItem> getPluginOptionItems(){
		return this.pluginOptionItems;
	}
	public void setPluginOptionItems(List<PluginReplacementOptionsItem> pluginOptionItems){
		this.pluginOptionItems = pluginOptionItems;
	}


	public EntryReplacementOptions() {
		super();
	}

	public EntryReplacementOptions(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		keepManualThumbnails = GsonParser.parseInt(jsonObject.get("keepManualThumbnails"));
		pluginOptionItems = GsonParser.parseArray(jsonObject.getAsJsonArray("pluginOptionItems"), PluginReplacementOptionsItem.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaEntryReplacementOptions");
		kparams.add("keepManualThumbnails", this.keepManualThumbnails);
		kparams.add("pluginOptionItems", this.pluginOptionItems);
		return kparams;
	}

}

