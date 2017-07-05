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
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.ParentalRule;
import com.kaltura.client.types.ParentalRuleFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ParentalRuleService {

	/**  Disables a parental rule that was previously defined by the household master.
	  Disable can be at specific user or household level.  */
    public static RequestBuilder<Boolean> disable(long ruleId, EntityReferenceBy entityReference)  {
        Params kparams = new Params();
        kparams.add("ruleId", ruleId);
        kparams.add("entityReference", entityReference);

        return new RequestBuilder<Boolean>(Boolean.class, "parentalrule", "disable", kparams);
    }

	/**  Disables a parental rule that was defined at account level. Disable can be at
	  specific user or household level.  */
    public static RequestBuilder<Boolean> disableDefault(EntityReferenceBy entityReference)  {
        Params kparams = new Params();
        kparams.add("entityReference", entityReference);

        return new RequestBuilder<Boolean>(Boolean.class, "parentalrule", "disableDefault", kparams);
    }

	/**  Enable a parental rules for a user  */
    public static RequestBuilder<Boolean> enable(long ruleId, EntityReferenceBy entityReference)  {
        Params kparams = new Params();
        kparams.add("ruleId", ruleId);
        kparams.add("entityReference", entityReference);

        return new RequestBuilder<Boolean>(Boolean.class, "parentalrule", "enable", kparams);
    }

	/**  Return the parental rules that applies for the user or household. Can include
	  rules that have been associated in account, household, or user level.           
	    Association level is also specified in the response.  */
    public static RequestBuilder<ListResponse<ParentalRule>> list(ParentalRuleFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new ListResponseRequestBuilder<ParentalRule>(ParentalRule.class, "parentalrule", "list", kparams);
    }
}
