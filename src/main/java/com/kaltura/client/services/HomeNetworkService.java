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
import com.kaltura.client.types.HomeNetwork;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HomeNetworkService {

	/**  Add a new home network to a household  */
    public static RequestBuilder<HomeNetwork> add(HomeNetwork homeNetwork)  {
        Params kparams = new Params();
        kparams.add("homeNetwork", homeNetwork);

        return new RequestBuilder<HomeNetwork>(HomeNetwork.class, "homenetwork", "add", kparams);
    }

	/**  Delete household’s existing home network  */
    public static RequestBuilder<Boolean> delete(String externalId)  {
        Params kparams = new Params();
        kparams.add("externalId", externalId);

        return new RequestBuilder<Boolean>(Boolean.class, "homenetwork", "delete", kparams);
    }

	/**  Retrieve the household’s home networks  */
    public static RequestBuilder<ListResponse<HomeNetwork>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<HomeNetwork>(HomeNetwork.class, "homenetwork", "list", kparams);
    }

	/**  Update and existing home network for a household  */
    public static RequestBuilder<HomeNetwork> update(String externalId, HomeNetwork homeNetwork)  {
        Params kparams = new Params();
        kparams.add("externalId", externalId);
        kparams.add("homeNetwork", homeNetwork);

        return new RequestBuilder<HomeNetwork>(HomeNetwork.class, "homenetwork", "update", kparams);
    }
}
