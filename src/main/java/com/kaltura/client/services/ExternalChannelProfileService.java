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
import com.kaltura.client.types.ExternalChannelProfile;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ExternalChannelProfileService {

	/**  Insert new External channel for partner  */
    public static RequestBuilder<ExternalChannelProfile> add(ExternalChannelProfile externalChannel)  {
        Params kparams = new Params();
        kparams.add("externalChannel", externalChannel);

        return new RequestBuilder<ExternalChannelProfile>(ExternalChannelProfile.class, "externalchannelprofile", "add", kparams);
    }

	/**  Delete External channel by External channel id  */
    public static RequestBuilder<Boolean> delete(int externalChannelId)  {
        Params kparams = new Params();
        kparams.add("externalChannelId", externalChannelId);

        return new RequestBuilder<Boolean>(Boolean.class, "externalchannelprofile", "delete", kparams);
    }

	/**  Returns all External channels for partner  */
    public static RequestBuilder<ListResponse<ExternalChannelProfile>> list()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<ExternalChannelProfile>(ExternalChannelProfile.class, "externalchannelprofile", "list", kparams);
    }

	/**  Update External channel details  */
    public static RequestBuilder<ExternalChannelProfile> update(int externalChannelId, ExternalChannelProfile externalChannel)  {
        Params kparams = new Params();
        kparams.add("externalChannelId", externalChannelId);
        kparams.add("externalChannel", externalChannel);

        return new RequestBuilder<ExternalChannelProfile>(ExternalChannelProfile.class, "externalchannelprofile", "update", kparams);
    }
}
