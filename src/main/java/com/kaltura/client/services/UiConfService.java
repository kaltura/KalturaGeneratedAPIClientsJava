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
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.UiConf;
import com.kaltura.client.types.UiConfFilter;
import com.kaltura.client.types.UiConfTypeInfo;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  UiConf service lets you create and manage your UIConfs for the various flash
  components  This service is used by the KMC-ApplicationStudio  */
public class UiConfService {

	/**  UIConf Add action allows you to add a UIConf to Kaltura DB  */
    public static RequestBuilder<UiConf> add(UiConf uiConf)  {
        Params kparams = new Params();
        kparams.add("uiConf", uiConf);

        return new RequestBuilder<UiConf>(UiConf.class, "uiconf", "add", kparams);
    }

	/**  Clone an existing UIConf  */
    public static RequestBuilder<UiConf> clone(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<UiConf>(UiConf.class, "uiconf", "clone", kparams);
    }

	/**  Delete an existing UIConf  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("uiconf", "delete", kparams);
    }

	/**  Retrieve a UIConf by id  */
    public static RequestBuilder<UiConf> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<UiConf>(UiConf.class, "uiconf", "get", kparams);
    }

	/**  Retrieve a list of all available versions by object type  */
    public static RequestBuilder<List<UiConfTypeInfo>> getAvailableTypes()  {
        Params kparams = new Params();

        return new ArrayRequestBuilder<UiConfTypeInfo>(UiConfTypeInfo.class, "uiconf", "getAvailableTypes", kparams);
    }

    public static RequestBuilder<ListResponse<UiConf>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<UiConf>> list(UiConfFilter filter)  {
        return list(filter, null);
    }

	/**  Retrieve a list of available UIConfs  */
    public static RequestBuilder<ListResponse<UiConf>> list(UiConfFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<UiConf>(UiConf.class, "uiconf", "list", kparams);
    }

    public static RequestBuilder<ListResponse<UiConf>> listTemplates()  {
        return listTemplates(null);
    }

    public static RequestBuilder<ListResponse<UiConf>> listTemplates(UiConfFilter filter)  {
        return listTemplates(filter, null);
    }

	/**  retrieve a list of available template UIConfs  */
    public static RequestBuilder<ListResponse<UiConf>> listTemplates(UiConfFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<UiConf>(UiConf.class, "uiconf", "listTemplates", kparams);
    }

	/**  Update an existing UIConf  */
    public static RequestBuilder<UiConf> update(int id, UiConf uiConf)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("uiConf", uiConf);

        return new RequestBuilder<UiConf>(UiConf.class, "uiconf", "update", kparams);
    }
}
