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
import com.kaltura.client.types.PlayReadyContentKey;
import com.kaltura.client.types.PlayReadyLicenseDetails;
import com.kaltura.client.utils.request.ArrayRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class PlayReadyDrmService {

	/**  Generate key id and content key for PlayReady encryption  */
    public static RequestBuilder<PlayReadyContentKey> generateKey()  {
        Params kparams = new Params();

        return new RequestBuilder<PlayReadyContentKey>(PlayReadyContentKey.class, "playready_playreadydrm", "generateKey", kparams);
    }

	/**  Get content keys for input key ids  */
    public static RequestBuilder<List<PlayReadyContentKey>> getContentKeys(String keyIds)  {
        Params kparams = new Params();
        kparams.add("keyIds", keyIds);

        return new ArrayRequestBuilder<PlayReadyContentKey>(PlayReadyContentKey.class, "playready_playreadydrm", "getContentKeys", kparams);
    }

    public static RequestBuilder<PlayReadyContentKey> getEntryContentKey(String entryId)  {
        return getEntryContentKey(entryId, false);
    }

	/**  Get content key and key id for the given entry  */
    public static RequestBuilder<PlayReadyContentKey> getEntryContentKey(String entryId, boolean createIfMissing)  {
        Params kparams = new Params();
        kparams.add("entryId", entryId);
        kparams.add("createIfMissing", createIfMissing);

        return new RequestBuilder<PlayReadyContentKey>(PlayReadyContentKey.class, "playready_playreadydrm", "getEntryContentKey", kparams);
    }

    public static RequestBuilder<PlayReadyLicenseDetails> getLicenseDetails(String keyId, String deviceId, int deviceType)  {
        return getLicenseDetails(keyId, deviceId, deviceType, null);
    }

    public static RequestBuilder<PlayReadyLicenseDetails> getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId)  {
        return getLicenseDetails(keyId, deviceId, deviceType, entryId, null);
    }

	/**  Get Play Ready policy and dates for license creation  */
    public static RequestBuilder<PlayReadyLicenseDetails> getLicenseDetails(String keyId, String deviceId, int deviceType, String entryId, String referrer)  {
        Params kparams = new Params();
        kparams.add("keyId", keyId);
        kparams.add("deviceId", deviceId);
        kparams.add("deviceType", deviceType);
        kparams.add("entryId", entryId);
        kparams.add("referrer", referrer);

        return new RequestBuilder<PlayReadyLicenseDetails>(PlayReadyLicenseDetails.class, "playready_playreadydrm", "getLicenseDetails", kparams);
    }
}
