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
import com.kaltura.client.enums.HouseholdFrequencyType;
import com.kaltura.client.types.Household;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HouseholdService {

	/**  Creates a household for the user  */
    public static RequestBuilder<Household> add(Household household)  {
        Params kparams = new Params();
        kparams.add("household", household);

        return new RequestBuilder<Household>(Household.class, "household", "add", kparams);
    }

	/**  Fully delete a household. Delete all of the household information, including
	  users, devices, transactions and assets.  */
    public static RequestBuilder<Boolean> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Boolean>(Boolean.class, "household", "delete", kparams);
    }

    public static RequestBuilder<Household> get()  {
        return get(Integer.MIN_VALUE);
    }

	/**  Returns the household model  */
    public static RequestBuilder<Household> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Household>(Household.class, "household", "get", kparams);
    }

	/**  Reset a household’s time limitation for removing user or device  */
    public static RequestBuilder<Household> resetFrequency(HouseholdFrequencyType frequencyType)  {
        Params kparams = new Params();
        kparams.add("frequencyType", frequencyType);

        return new RequestBuilder<Household>(Household.class, "household", "resetFrequency", kparams);
    }

	/**  Resumed a given household service to its previous service settings  */
    public static RequestBuilder<Boolean> resume()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "household", "resume", kparams);
    }

	/**  Suspend a given household service. Sets the household status to
	  “suspended&amp;quot;.The household service settings are maintained for later
	  resume  */
    public static RequestBuilder<Boolean> suspend()  {
        Params kparams = new Params();

        return new RequestBuilder<Boolean>(Boolean.class, "household", "suspend", kparams);
    }

	/**  Update the household name and description  */
    public static RequestBuilder<Household> update(Household household)  {
        Params kparams = new Params();
        kparams.add("household", household);

        return new RequestBuilder<Household>(Household.class, "household", "update", kparams);
    }
}
