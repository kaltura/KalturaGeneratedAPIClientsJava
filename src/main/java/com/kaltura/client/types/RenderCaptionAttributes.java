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
import com.kaltura.client.enums.BorderStyle;
import com.kaltura.client.enums.CaptionsAlignment;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(RenderCaptionAttributes.Tokenizer.class)
public class RenderCaptionAttributes extends CaptionAttributes {
	
	public interface Tokenizer extends CaptionAttributes.Tokenizer {
		String fontName();
		String fontSize();
		String primaryColour();
		String borderStyle();
		String backColour();
		String outlineColour();
		String shadow();
		String bold();
		String italic();
		String underline();
		String alignment();
		String captionAssetId();
	}

	private String fontName;
	private Integer fontSize;
	private String primaryColour;
	private BorderStyle borderStyle;
	private String backColour;
	private String outlineColour;
	private Integer shadow;
	private Boolean bold;
	private Boolean italic;
	private Boolean underline;
	private CaptionsAlignment alignment;
	private String captionAssetId;

	// fontName:
	public String getFontName(){
		return this.fontName;
	}
	public void setFontName(String fontName){
		this.fontName = fontName;
	}

	public void fontName(String multirequestToken){
		setToken("fontName", multirequestToken);
	}

	// fontSize:
	public Integer getFontSize(){
		return this.fontSize;
	}
	public void setFontSize(Integer fontSize){
		this.fontSize = fontSize;
	}

	public void fontSize(String multirequestToken){
		setToken("fontSize", multirequestToken);
	}

	// primaryColour:
	public String getPrimaryColour(){
		return this.primaryColour;
	}
	public void setPrimaryColour(String primaryColour){
		this.primaryColour = primaryColour;
	}

	public void primaryColour(String multirequestToken){
		setToken("primaryColour", multirequestToken);
	}

	// borderStyle:
	public BorderStyle getBorderStyle(){
		return this.borderStyle;
	}
	public void setBorderStyle(BorderStyle borderStyle){
		this.borderStyle = borderStyle;
	}

	public void borderStyle(String multirequestToken){
		setToken("borderStyle", multirequestToken);
	}

	// backColour:
	public String getBackColour(){
		return this.backColour;
	}
	public void setBackColour(String backColour){
		this.backColour = backColour;
	}

	public void backColour(String multirequestToken){
		setToken("backColour", multirequestToken);
	}

	// outlineColour:
	public String getOutlineColour(){
		return this.outlineColour;
	}
	public void setOutlineColour(String outlineColour){
		this.outlineColour = outlineColour;
	}

	public void outlineColour(String multirequestToken){
		setToken("outlineColour", multirequestToken);
	}

	// shadow:
	public Integer getShadow(){
		return this.shadow;
	}
	public void setShadow(Integer shadow){
		this.shadow = shadow;
	}

	public void shadow(String multirequestToken){
		setToken("shadow", multirequestToken);
	}

	// bold:
	public Boolean getBold(){
		return this.bold;
	}
	public void setBold(Boolean bold){
		this.bold = bold;
	}

	public void bold(String multirequestToken){
		setToken("bold", multirequestToken);
	}

	// italic:
	public Boolean getItalic(){
		return this.italic;
	}
	public void setItalic(Boolean italic){
		this.italic = italic;
	}

	public void italic(String multirequestToken){
		setToken("italic", multirequestToken);
	}

	// underline:
	public Boolean getUnderline(){
		return this.underline;
	}
	public void setUnderline(Boolean underline){
		this.underline = underline;
	}

	public void underline(String multirequestToken){
		setToken("underline", multirequestToken);
	}

	// alignment:
	public CaptionsAlignment getAlignment(){
		return this.alignment;
	}
	public void setAlignment(CaptionsAlignment alignment){
		this.alignment = alignment;
	}

	public void alignment(String multirequestToken){
		setToken("alignment", multirequestToken);
	}

	// captionAssetId:
	public String getCaptionAssetId(){
		return this.captionAssetId;
	}
	public void setCaptionAssetId(String captionAssetId){
		this.captionAssetId = captionAssetId;
	}

	public void captionAssetId(String multirequestToken){
		setToken("captionAssetId", multirequestToken);
	}


	public RenderCaptionAttributes() {
		super();
	}

	public RenderCaptionAttributes(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fontName = GsonParser.parseString(jsonObject.get("fontName"));
		fontSize = GsonParser.parseInt(jsonObject.get("fontSize"));
		primaryColour = GsonParser.parseString(jsonObject.get("primaryColour"));
		borderStyle = BorderStyle.get(GsonParser.parseInt(jsonObject.get("borderStyle")));
		backColour = GsonParser.parseString(jsonObject.get("backColour"));
		outlineColour = GsonParser.parseString(jsonObject.get("outlineColour"));
		shadow = GsonParser.parseInt(jsonObject.get("shadow"));
		bold = GsonParser.parseBoolean(jsonObject.get("bold"));
		italic = GsonParser.parseBoolean(jsonObject.get("italic"));
		underline = GsonParser.parseBoolean(jsonObject.get("underline"));
		alignment = CaptionsAlignment.get(GsonParser.parseInt(jsonObject.get("alignment")));
		captionAssetId = GsonParser.parseString(jsonObject.get("captionAssetId"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaRenderCaptionAttributes");
		kparams.add("fontName", this.fontName);
		kparams.add("fontSize", this.fontSize);
		kparams.add("primaryColour", this.primaryColour);
		kparams.add("borderStyle", this.borderStyle);
		kparams.add("backColour", this.backColour);
		kparams.add("outlineColour", this.outlineColour);
		kparams.add("shadow", this.shadow);
		kparams.add("bold", this.bold);
		kparams.add("italic", this.italic);
		kparams.add("underline", this.underline);
		kparams.add("alignment", this.alignment);
		kparams.add("captionAssetId", this.captionAssetId);
		return kparams;
	}

}

