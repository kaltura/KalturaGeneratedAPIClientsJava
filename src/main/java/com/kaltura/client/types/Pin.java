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

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.RuleLevel;
import com.kaltura.client.enums.PinType;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  PIN and its origin of definition  */
@SuppressWarnings("serial")
public class Pin extends ObjectBase {

	/**  PIN code  */
    private String pin;
	/**  Where the PIN was defined at – account, household or user  */
    private RuleLevel origin;
	/**  PIN type  */
    private PinType type;

    // pin:
    public String getPin(){
        return this.pin;
    }
    public void setPin(String pin){
        this.pin = pin;
    }

    // origin:
    public RuleLevel getOrigin(){
        return this.origin;
    }
    public void setOrigin(RuleLevel origin){
        this.origin = origin;
    }

    // type:
    public PinType getType(){
        return this.type;
    }
    public void setType(PinType type){
        this.type = type;
    }


    public Pin() {
       super();
    }

    public Pin(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        pin = GsonParser.parseString(jsonObject.get("pin"));
        origin = RuleLevel.get(GsonParser.parseString(jsonObject.get("origin")));
        type = PinType.get(GsonParser.parseString(jsonObject.get("type")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPin");
        kparams.add("pin", this.pin);
        kparams.add("origin", this.origin);
        kparams.add("type", this.type);
        return kparams;
    }

}

