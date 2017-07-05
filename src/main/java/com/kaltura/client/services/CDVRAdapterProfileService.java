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
import com.kaltura.client.types.CDVRAdapterProfile;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class CDVRAdapterProfileService {

	/**  Insert new C-DVR adapter for partner  */
    public static RequestBuilder<CDVRAdapterProfile> add(CDVRAdapterProfile adapter)  {
        Params kparams = new Params();
        kparams.add("adapter", adapter);

        return new RequestBuilder<CDVRAdapterProfile>(CDVRAdapterProfile.class, "cdvradapterprofile", "add", kparams);
    }

	/**  Delete C-DVR adapter by C-DVR adapter id  */
    public static RequestBuilder<Boolean> delete(int adapterId)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);

        return new RequestBuilder<Boolean>(Boolean.class, "cdvradapterprofile", "delete", kparams);
    }

	/**  Generate C-DVR adapter shared secret  */
    public static RequestBuilder<CDVRAdapterProfile> generateSharedSecret(int adapterId)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);

        return new RequestBuilder<CDVRAdapterProfile>(CDVRAdapterProfile.class, "cdvradapterprofile", "generateSharedSecret", kparams);
    }

	/**  Returns all C-DVR adapters for partner  */
    public static RequestBuilder<ListResponse<CDVRAdapterProfile>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<CDVRAdapterProfile>(CDVRAdapterProfile.class, "cdvradapterprofile", "list", kparams);
    }

	/**  Update C-DVR adapter details  */
    public static RequestBuilder<CDVRAdapterProfile> update(int adapterId, CDVRAdapterProfile adapter)  {
        Params kparams = new Params();
        kparams.add("adapterId", adapterId);
        kparams.add("adapter", adapter);

        return new RequestBuilder<CDVRAdapterProfile>(CDVRAdapterProfile.class, "cdvradapterprofile", "update", kparams);
    }
}
