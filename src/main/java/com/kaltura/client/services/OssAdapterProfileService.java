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
import com.kaltura.client.types.OSSAdapterProfile;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class OssAdapterProfileService {

	/**  Insert new OSS adapter for partner  */
    public static RequestBuilder<OSSAdapterProfile> add(OSSAdapterProfile ossAdapter)  {
        Params kparams = new Params();
        kparams.add("ossAdapter", ossAdapter);

        return new RequestBuilder<OSSAdapterProfile>(OSSAdapterProfile.class, "ossadapterprofile", "add", kparams);
    }

	/**  Delete OSS adapter by OSS adapter id  */
    public static RequestBuilder<Boolean> delete(int ossAdapterId)  {
        Params kparams = new Params();
        kparams.add("ossAdapterId", ossAdapterId);

        return new RequestBuilder<Boolean>(Boolean.class, "ossadapterprofile", "delete", kparams);
    }

	/**  Generate oss adapter shared secret  */
    public static RequestBuilder<OSSAdapterProfile> generateSharedSecret(int ossAdapterId)  {
        Params kparams = new Params();
        kparams.add("ossAdapterId", ossAdapterId);

        return new RequestBuilder<OSSAdapterProfile>(OSSAdapterProfile.class, "ossadapterprofile", "generateSharedSecret", kparams);
    }

	/**  Update OSS adapter details  */
    public static RequestBuilder<OSSAdapterProfile> update(int ossAdapterId, OSSAdapterProfile ossAdapter)  {
        Params kparams = new Params();
        kparams.add("ossAdapterId", ossAdapterId);
        kparams.add("ossAdapter", ossAdapter);

        return new RequestBuilder<OSSAdapterProfile>(OSSAdapterProfile.class, "ossadapterprofile", "update", kparams);
    }
}
