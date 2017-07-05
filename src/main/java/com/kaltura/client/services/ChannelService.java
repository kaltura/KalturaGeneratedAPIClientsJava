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
import com.kaltura.client.types.Channel;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

public class ChannelService {

	/**  Insert new channel for partner. Currently supports only KSQL channel  */
    public static RequestBuilder<Channel> add(Channel channel)  {
        Params kparams = new Params();
        kparams.add("channel", channel);

        return new RequestBuilder<Channel>(Channel.class, "channel", "add", kparams);
    }

	/**  Delete channel by its channel id  */
    public static RequestBuilder<Boolean> delete(int channelId)  {
        Params kparams = new Params();
        kparams.add("channelId", channelId);

        return new RequestBuilder<Boolean>(Boolean.class, "channel", "delete", kparams);
    }

	/**  Returns channel info  */
    public static RequestBuilder<Channel> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Channel>(Channel.class, "channel", "get", kparams);
    }

	/**  Update channel details. Currently supports only KSQL channel  */
    public static RequestBuilder<Channel> update(int channelId, Channel channel)  {
        Params kparams = new Params();
        kparams.add("channelId", channelId);
        kparams.add("channel", channel);

        return new RequestBuilder<Channel>(Channel.class, "channel", "update", kparams);
    }
}
