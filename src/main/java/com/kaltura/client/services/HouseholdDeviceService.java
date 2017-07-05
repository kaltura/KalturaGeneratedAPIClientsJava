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
import com.kaltura.client.enums.DeviceStatus;
import com.kaltura.client.types.DevicePin;
import com.kaltura.client.types.HouseholdDevice;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class HouseholdDeviceService {

	/**  Registers a device to a household using pin code  */
    public static RequestBuilder<HouseholdDevice> add(HouseholdDevice device)  {
        Params kparams = new Params();
        kparams.add("device", device);

        return new RequestBuilder<HouseholdDevice>(HouseholdDevice.class, "householddevice", "add", kparams);
    }

	/**  Registers a device to a household using pin code  */
    public static RequestBuilder<HouseholdDevice> addByPin(String deviceName, String pin)  {
        Params kparams = new Params();
        kparams.add("deviceName", deviceName);
        kparams.add("pin", pin);

        return new RequestBuilder<HouseholdDevice>(HouseholdDevice.class, "householddevice", "addByPin", kparams);
    }

	/**  Removes a device from household  */
    public static RequestBuilder<Boolean> delete(String udid)  {
        Params kparams = new Params();
        kparams.add("udid", udid);

        return new RequestBuilder<Boolean>(Boolean.class, "householddevice", "delete", kparams);
    }

	/**  Generates device pin to use when adding a device to household by pin  */
    public static RequestBuilder<DevicePin> generatePin(String udid, int brandId)  {
        Params kparams = new Params();
        kparams.add("udid", udid);
        kparams.add("brandId", brandId);

        return new RequestBuilder<DevicePin>(DevicePin.class, "householddevice", "generatePin", kparams);
    }

	/**  Returns device registration status to the supplied household  */
    public static RequestBuilder<HouseholdDevice> get()  {
        Params kparams = new Params();

        return new RequestBuilder<HouseholdDevice>(HouseholdDevice.class, "householddevice", "get", kparams);
    }

	/**  Update the name of the device by UDID  */
    public static RequestBuilder<HouseholdDevice> update(String udid, HouseholdDevice device)  {
        Params kparams = new Params();
        kparams.add("udid", udid);
        kparams.add("device", device);

        return new RequestBuilder<HouseholdDevice>(HouseholdDevice.class, "householddevice", "update", kparams);
    }

	/**  Update the name of the device by UDID  */
    public static RequestBuilder<Boolean> updateStatus(String udid, DeviceStatus status)  {
        Params kparams = new Params();
        kparams.add("udid", udid);
        kparams.add("status", status);

        return new RequestBuilder<Boolean>(Boolean.class, "householddevice", "updateStatus", kparams);
    }
}
