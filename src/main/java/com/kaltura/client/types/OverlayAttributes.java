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
import com.kaltura.client.enums.MediaCompositionAlignment;
import com.kaltura.client.enums.OverlayShape;
import com.kaltura.client.types.AudioAttributes;
import com.kaltura.client.types.ContentResource;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(OverlayAttributes.Tokenizer.class)
public class OverlayAttributes extends MediaCompositionAttributes {
	
	public interface Tokenizer extends MediaCompositionAttributes.Tokenizer {
		ContentResource.Tokenizer resource();
		RequestBuilder.ListTokenizer<MediaCompositionAttributes.Tokenizer> resourceMediaCompositionAttributesArray();
		String marginsPercentage();
		String overlayScalePercentage();
		String overlayPlacement();
		String overlayShape();
		AudioAttributes.Tokenizer audioAttributes();
	}

	/**
	 * Only KalturaEntryResource and KalturaAssetResource are supported
	 */
	private ContentResource resource;
	/**
	 * Only KalturaReplaceBackgroundAttributes is supported
	 */
	private List<MediaCompositionAttributes> resourceMediaCompositionAttributesArray;
	private Double marginsPercentage;
	private Double overlayScalePercentage;
	private MediaCompositionAlignment overlayPlacement;
	private OverlayShape overlayShape;
	private AudioAttributes audioAttributes;

	// resource:
	public ContentResource getResource(){
		return this.resource;
	}
	public void setResource(ContentResource resource){
		this.resource = resource;
	}

	// resourceMediaCompositionAttributesArray:
	public List<MediaCompositionAttributes> getResourceMediaCompositionAttributesArray(){
		return this.resourceMediaCompositionAttributesArray;
	}
	public void setResourceMediaCompositionAttributesArray(List<MediaCompositionAttributes> resourceMediaCompositionAttributesArray){
		this.resourceMediaCompositionAttributesArray = resourceMediaCompositionAttributesArray;
	}

	// marginsPercentage:
	public Double getMarginsPercentage(){
		return this.marginsPercentage;
	}
	public void setMarginsPercentage(Double marginsPercentage){
		this.marginsPercentage = marginsPercentage;
	}

	public void marginsPercentage(String multirequestToken){
		setToken("marginsPercentage", multirequestToken);
	}

	// overlayScalePercentage:
	public Double getOverlayScalePercentage(){
		return this.overlayScalePercentage;
	}
	public void setOverlayScalePercentage(Double overlayScalePercentage){
		this.overlayScalePercentage = overlayScalePercentage;
	}

	public void overlayScalePercentage(String multirequestToken){
		setToken("overlayScalePercentage", multirequestToken);
	}

	// overlayPlacement:
	public MediaCompositionAlignment getOverlayPlacement(){
		return this.overlayPlacement;
	}
	public void setOverlayPlacement(MediaCompositionAlignment overlayPlacement){
		this.overlayPlacement = overlayPlacement;
	}

	public void overlayPlacement(String multirequestToken){
		setToken("overlayPlacement", multirequestToken);
	}

	// overlayShape:
	public OverlayShape getOverlayShape(){
		return this.overlayShape;
	}
	public void setOverlayShape(OverlayShape overlayShape){
		this.overlayShape = overlayShape;
	}

	public void overlayShape(String multirequestToken){
		setToken("overlayShape", multirequestToken);
	}

	// audioAttributes:
	public AudioAttributes getAudioAttributes(){
		return this.audioAttributes;
	}
	public void setAudioAttributes(AudioAttributes audioAttributes){
		this.audioAttributes = audioAttributes;
	}


	public OverlayAttributes() {
		super();
	}

	public OverlayAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		resource = GsonParser.parseObject(jsonObject.getAsJsonObject("resource"), ContentResource.class);
		resourceMediaCompositionAttributesArray = GsonParser.parseArray(jsonObject.getAsJsonArray("resourceMediaCompositionAttributesArray"), MediaCompositionAttributes.class);
		marginsPercentage = GsonParser.parseDouble(jsonObject.get("marginsPercentage"));
		overlayScalePercentage = GsonParser.parseDouble(jsonObject.get("overlayScalePercentage"));
		overlayPlacement = MediaCompositionAlignment.get(GsonParser.parseInt(jsonObject.get("overlayPlacement")));
		overlayShape = OverlayShape.get(GsonParser.parseInt(jsonObject.get("overlayShape")));
		audioAttributes = GsonParser.parseObject(jsonObject.getAsJsonObject("audioAttributes"), AudioAttributes.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaOverlayAttributes");
		kparams.add("resource", this.resource);
		kparams.add("resourceMediaCompositionAttributesArray", this.resourceMediaCompositionAttributesArray);
		kparams.add("marginsPercentage", this.marginsPercentage);
		kparams.add("overlayScalePercentage", this.overlayScalePercentage);
		kparams.add("overlayPlacement", this.overlayPlacement);
		kparams.add("overlayShape", this.overlayShape);
		kparams.add("audioAttributes", this.audioAttributes);
		return kparams;
	}

}

