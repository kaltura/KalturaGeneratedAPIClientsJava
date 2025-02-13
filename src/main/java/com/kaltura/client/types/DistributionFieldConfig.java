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
import com.kaltura.client.enums.DistributionFieldRequiredStatus;
import com.kaltura.client.types.ObjectBase;
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
@MultiRequestBuilder.Tokenizer(DistributionFieldConfig.Tokenizer.class)
public class DistributionFieldConfig extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String fieldName();
		String userFriendlyFieldName();
		String entryMrssXslt();
		String isRequired();
		String type();
		String updateOnChange();
		RequestBuilder.ListTokenizer<StringHolder.Tokenizer> updateParams();
		String isDefault();
		String triggerDeleteOnError();
	}

	/**
	 * A value taken from a connector field enum which associates the current
	  configuration to that connector field      Field enum class should be returned
	  by the provider's getFieldEnumClass function.
	 */
	private String fieldName;
	/**
	 * A string that will be shown to the user as the field name in error messages
	  related to the current field
	 */
	private String userFriendlyFieldName;
	/**
	 * An XSLT string that extracts the right value from the Kaltura entry MRSS XML.   
	    The value of the current connector field will be the one that is returned from
	  transforming the Kaltura entry MRSS XML using this XSLT string.
	 */
	private String entryMrssXslt;
	/**
	 * Is the field required to have a value for submission ?
	 */
	private DistributionFieldRequiredStatus isRequired;
	private String type;
	/**
	 * Trigger distribution update when this field changes or not ?
	 */
	private Boolean updateOnChange;
	/**
	 * Entry column or metadata xpath that should trigger an update
	 */
	private List<StringHolder> updateParams;
	/**
	 * Is this field config is the default for the distribution provider?
	 */
	private Boolean isDefault;
	/**
	 * Is an error on this field going to trigger deletion of distributed content?
	 */
	private Boolean triggerDeleteOnError;

	// fieldName:
	public String getFieldName(){
		return this.fieldName;
	}
	public void setFieldName(String fieldName){
		this.fieldName = fieldName;
	}

	public void fieldName(String multirequestToken){
		setToken("fieldName", multirequestToken);
	}

	// userFriendlyFieldName:
	public String getUserFriendlyFieldName(){
		return this.userFriendlyFieldName;
	}
	public void setUserFriendlyFieldName(String userFriendlyFieldName){
		this.userFriendlyFieldName = userFriendlyFieldName;
	}

	public void userFriendlyFieldName(String multirequestToken){
		setToken("userFriendlyFieldName", multirequestToken);
	}

	// entryMrssXslt:
	public String getEntryMrssXslt(){
		return this.entryMrssXslt;
	}
	public void setEntryMrssXslt(String entryMrssXslt){
		this.entryMrssXslt = entryMrssXslt;
	}

	public void entryMrssXslt(String multirequestToken){
		setToken("entryMrssXslt", multirequestToken);
	}

	// isRequired:
	public DistributionFieldRequiredStatus getIsRequired(){
		return this.isRequired;
	}
	public void setIsRequired(DistributionFieldRequiredStatus isRequired){
		this.isRequired = isRequired;
	}

	public void isRequired(String multirequestToken){
		setToken("isRequired", multirequestToken);
	}

	// type:
	public String getType(){
		return this.type;
	}
	public void setType(String type){
		this.type = type;
	}

	public void type(String multirequestToken){
		setToken("type", multirequestToken);
	}

	// updateOnChange:
	public Boolean getUpdateOnChange(){
		return this.updateOnChange;
	}
	public void setUpdateOnChange(Boolean updateOnChange){
		this.updateOnChange = updateOnChange;
	}

	public void updateOnChange(String multirequestToken){
		setToken("updateOnChange", multirequestToken);
	}

	// updateParams:
	public List<StringHolder> getUpdateParams(){
		return this.updateParams;
	}
	public void setUpdateParams(List<StringHolder> updateParams){
		this.updateParams = updateParams;
	}

	// isDefault:
	public Boolean getIsDefault(){
		return this.isDefault;
	}
	// triggerDeleteOnError:
	public Boolean getTriggerDeleteOnError(){
		return this.triggerDeleteOnError;
	}
	public void setTriggerDeleteOnError(Boolean triggerDeleteOnError){
		this.triggerDeleteOnError = triggerDeleteOnError;
	}

	public void triggerDeleteOnError(String multirequestToken){
		setToken("triggerDeleteOnError", multirequestToken);
	}


	public DistributionFieldConfig() {
		super();
	}

	public DistributionFieldConfig(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		fieldName = GsonParser.parseString(jsonObject.get("fieldName"));
		userFriendlyFieldName = GsonParser.parseString(jsonObject.get("userFriendlyFieldName"));
		entryMrssXslt = GsonParser.parseString(jsonObject.get("entryMrssXslt"));
		isRequired = DistributionFieldRequiredStatus.get(GsonParser.parseInt(jsonObject.get("isRequired")));
		type = GsonParser.parseString(jsonObject.get("type"));
		updateOnChange = GsonParser.parseBoolean(jsonObject.get("updateOnChange"));
		updateParams = GsonParser.parseArray(jsonObject.getAsJsonArray("updateParams"), StringHolder.class);
		isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
		triggerDeleteOnError = GsonParser.parseBoolean(jsonObject.get("triggerDeleteOnError"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDistributionFieldConfig");
		kparams.add("fieldName", this.fieldName);
		kparams.add("userFriendlyFieldName", this.userFriendlyFieldName);
		kparams.add("entryMrssXslt", this.entryMrssXslt);
		kparams.add("isRequired", this.isRequired);
		kparams.add("type", this.type);
		kparams.add("updateOnChange", this.updateOnChange);
		kparams.add("updateParams", this.updateParams);
		kparams.add("triggerDeleteOnError", this.triggerDeleteOnError);
		return kparams;
	}

}

