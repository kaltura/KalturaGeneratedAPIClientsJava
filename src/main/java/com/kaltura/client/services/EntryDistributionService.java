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
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.types.EntryDistribution;
import com.kaltura.client.types.EntryDistributionFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Entry Distribution service  */
public class EntryDistributionService {

	/**  Add new Entry Distribution  */
    public static RequestBuilder<EntryDistribution> add(EntryDistribution entryDistribution)  {
        Params kparams = new Params();
        kparams.add("entryDistribution", entryDistribution);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "add", kparams);
    }

	/**  Delete Entry Distribution by id  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("contentdistribution_entrydistribution", "delete", kparams);
    }

	/**  Get Entry Distribution by id  */
    public static RequestBuilder<EntryDistribution> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "get", kparams);
    }

    public static RequestBuilder<ListResponse<EntryDistribution>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<EntryDistribution>> list(EntryDistributionFilter filter)  {
        return list(filter, null);
    }

	/**  List all distribution providers  */
    public static RequestBuilder<ListResponse<EntryDistribution>> list(EntryDistributionFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "list", kparams);
    }

	/**  Retries last submit action  */
    public static RequestBuilder<EntryDistribution> retrySubmit(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "retrySubmit", kparams);
    }

	/**  Serves entry distribution returned data  */
    public static RequestBuilder<String> serveReturnedData(int id, DistributionAction actionType)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("actionType", actionType);

        return new ServeRequestBuilder("contentdistribution_entrydistribution", "serveReturnedData", kparams);
    }

	/**  Serves entry distribution sent data  */
    public static RequestBuilder<String> serveSentData(int id, DistributionAction actionType)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("actionType", actionType);

        return new ServeRequestBuilder("contentdistribution_entrydistribution", "serveSentData", kparams);
    }

    public static RequestBuilder<EntryDistribution> submitAdd(int id)  {
        return submitAdd(id, false);
    }

	/**  Submits Entry Distribution to the remote destination  */
    public static RequestBuilder<EntryDistribution> submitAdd(int id, boolean submitWhenReady)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("submitWhenReady", submitWhenReady);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "submitAdd", kparams);
    }

	/**  Deletes Entry Distribution from the remote destination  */
    public static RequestBuilder<EntryDistribution> submitDelete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "submitDelete", kparams);
    }

	/**  Submits Entry Distribution report request  */
    public static RequestBuilder<EntryDistribution> submitFetchReport(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "submitFetchReport", kparams);
    }

	/**  Submits Entry Distribution changes to the remote destination  */
    public static RequestBuilder<EntryDistribution> submitUpdate(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "submitUpdate", kparams);
    }

	/**  Update Entry Distribution by id  */
    public static RequestBuilder<EntryDistribution> update(int id, EntryDistribution entryDistribution)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("entryDistribution", entryDistribution);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "update", kparams);
    }

	/**  Validates Entry Distribution by id for submission  */
    public static RequestBuilder<EntryDistribution> validate(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EntryDistribution>(EntryDistribution.class, "contentdistribution_entrydistribution", "validate", kparams);
    }
}
