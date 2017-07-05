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
import com.kaltura.client.types.CDNAdapterProfile;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class CdnAdapterProfileService {

	/**  Insert new CDN adapter for partner  */
    public static RequestBuilder<CDNAdapterProfile> add(CDNAdapterProfile adapter)  {
        Params kparams = new Params();
        kparams.add("adapter", adapter);

        return new RequestBuilder<CDNAdapterProfile>(CDNAdapterProfile.class, "cdnadapterprofile", "add", kparams);
    }

	/**  Delete CDN adapter by CDN adapter id  */
    public static RequestBuilder<Boolean> delete(int adapterId)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);

        return new RequestBuilder<Boolean>(Boolean.class, "cdnadapterprofile", "delete", kparams);
    }

	/**  Generate CDN adapter shared secret  */
    public static RequestBuilder<CDNAdapterProfile> generateSharedSecret(int adapterId)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);

        return new RequestBuilder<CDNAdapterProfile>(CDNAdapterProfile.class, "cdnadapterprofile", "generateSharedSecret", kparams);
    }

	/**  Returns all CDN adapters for partner  */
    public static RequestBuilder<ListResponse<CDNAdapterProfile>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<CDNAdapterProfile>(CDNAdapterProfile.class, "cdnadapterprofile", "list", kparams);
    }

	/**  Update CDN adapter details  */
    public static RequestBuilder<CDNAdapterProfile> update(int adapterId, CDNAdapterProfile adapter)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);
        kparams.add("adapter", adapter);

        return new RequestBuilder<CDNAdapterProfile>(CDNAdapterProfile.class, "cdnadapterprofile", "update", kparams);
    }
}
