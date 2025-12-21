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
import com.kaltura.client.enums.ESearchScoreFunctionBoostMode;
import com.kaltura.client.enums.ESearchScoreFunctionDecayAlgorithm;
import com.kaltura.client.enums.ESearchScoreFunctionField;
import com.kaltura.client.enums.ESearchScoreFunctionOrigin;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ESearchScoreFunctionParams.Tokenizer.class)
public class ESearchScoreFunctionParams extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String decayAlgorithm();
		String functionField();
		String boostMode();
		String origin();
		String weight();
		String scale();
		String decay();
	}

	private ESearchScoreFunctionDecayAlgorithm decayAlgorithm;
	private ESearchScoreFunctionField functionField;
	private ESearchScoreFunctionBoostMode boostMode;
	private ESearchScoreFunctionOrigin origin;
	private Double weight;
	private String scale;
	private Double decay;

	// decayAlgorithm:
	public ESearchScoreFunctionDecayAlgorithm getDecayAlgorithm(){
		return this.decayAlgorithm;
	}
	public void setDecayAlgorithm(ESearchScoreFunctionDecayAlgorithm decayAlgorithm){
		this.decayAlgorithm = decayAlgorithm;
	}

	public void decayAlgorithm(String multirequestToken){
		setToken("decayAlgorithm", multirequestToken);
	}

	// functionField:
	public ESearchScoreFunctionField getFunctionField(){
		return this.functionField;
	}
	public void setFunctionField(ESearchScoreFunctionField functionField){
		this.functionField = functionField;
	}

	public void functionField(String multirequestToken){
		setToken("functionField", multirequestToken);
	}

	// boostMode:
	public ESearchScoreFunctionBoostMode getBoostMode(){
		return this.boostMode;
	}
	public void setBoostMode(ESearchScoreFunctionBoostMode boostMode){
		this.boostMode = boostMode;
	}

	public void boostMode(String multirequestToken){
		setToken("boostMode", multirequestToken);
	}

	// origin:
	public ESearchScoreFunctionOrigin getOrigin(){
		return this.origin;
	}
	public void setOrigin(ESearchScoreFunctionOrigin origin){
		this.origin = origin;
	}

	public void origin(String multirequestToken){
		setToken("origin", multirequestToken);
	}

	// weight:
	public Double getWeight(){
		return this.weight;
	}
	public void setWeight(Double weight){
		this.weight = weight;
	}

	public void weight(String multirequestToken){
		setToken("weight", multirequestToken);
	}

	// scale:
	public String getScale(){
		return this.scale;
	}
	public void setScale(String scale){
		this.scale = scale;
	}

	public void scale(String multirequestToken){
		setToken("scale", multirequestToken);
	}

	// decay:
	public Double getDecay(){
		return this.decay;
	}
	public void setDecay(Double decay){
		this.decay = decay;
	}

	public void decay(String multirequestToken){
		setToken("decay", multirequestToken);
	}


	public ESearchScoreFunctionParams() {
		super();
	}

	public ESearchScoreFunctionParams(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		decayAlgorithm = ESearchScoreFunctionDecayAlgorithm.get(GsonParser.parseString(jsonObject.get("decayAlgorithm")));
		functionField = ESearchScoreFunctionField.get(GsonParser.parseString(jsonObject.get("functionField")));
		boostMode = ESearchScoreFunctionBoostMode.get(GsonParser.parseString(jsonObject.get("boostMode")));
		origin = ESearchScoreFunctionOrigin.get(GsonParser.parseString(jsonObject.get("origin")));
		weight = GsonParser.parseDouble(jsonObject.get("weight"));
		scale = GsonParser.parseString(jsonObject.get("scale"));
		decay = GsonParser.parseDouble(jsonObject.get("decay"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaESearchScoreFunctionParams");
		kparams.add("decayAlgorithm", this.decayAlgorithm);
		kparams.add("functionField", this.functionField);
		kparams.add("boostMode", this.boostMode);
		kparams.add("origin", this.origin);
		kparams.add("weight", this.weight);
		kparams.add("scale", this.scale);
		kparams.add("decay", this.decay);
		return kparams;
	}

}

