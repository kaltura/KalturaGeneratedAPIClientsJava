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
import com.kaltura.client.enums.EntityReferenceBy;
import com.kaltura.client.enums.PinType;
import com.kaltura.client.types.Pin;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PinService {

    public static RequestBuilder<Pin> get(EntityReferenceBy by, PinType type)  {
        return get(by, type, Integer.MIN_VALUE);
    }

	/**  Retrieve the parental or purchase PIN that applies for the household or user.
	  Includes specification of where the PIN was defined at – account, household or
	  user  level  */
    public static RequestBuilder<Pin> get(EntityReferenceBy by, PinType type, int ruleId)  {
        Params kparams = new Params();
        kparams.add("by", by);
        kparams.add("type", type);
        kparams.add("ruleId", ruleId);

        return new RequestBuilder<Pin>(Pin.class, "pin", "get", kparams);
    }

    public static RequestBuilder<Pin> update(EntityReferenceBy by, PinType type, Pin pin)  {
        return update(by, type, pin, Integer.MIN_VALUE);
    }

	/**  Set the parental or purchase PIN that applies for the user or the household.  */
    public static RequestBuilder<Pin> update(EntityReferenceBy by, PinType type, Pin pin, int ruleId)  {
        Params kparams = new Params();
        kparams.add("by", by);
        kparams.add("type", type);
        kparams.add("pin", pin);
        kparams.add("ruleId", ruleId);

        return new RequestBuilder<Pin>(Pin.class, "pin", "update", kparams);
    }

    public static RequestBuilder<Boolean> validate(String pin, PinType type)  {
        return validate(pin, type, Integer.MIN_VALUE);
    }

	/**  Validate a purchase or parental PIN for a user.  */
    public static RequestBuilder<Boolean> validate(String pin, PinType type, int ruleId)  {
        Params kparams = new Params();
        kparams.add("pin", pin);
        kparams.add("type", type);
        kparams.add("ruleId", ruleId);

        return new RequestBuilder<Boolean>(Boolean.class, "pin", "validate", kparams);
    }
}
