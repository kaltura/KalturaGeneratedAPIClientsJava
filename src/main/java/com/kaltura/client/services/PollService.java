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
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Poll service  The poll service works against the cache entirely no DB instance
  should be used here  */
public class PollService {

    public static RequestBuilder<String> add()  {
        return add("SINGLE_ANONYMOUS");
    }

	/**  Add Action  */
    public static RequestBuilder<String> add(String pollType)  {
        Params kparams = new Params();
        kparams.add("pollType", pollType);

        return new RequestBuilder<String>(String.class, "poll_poll", "add", kparams);
    }

	/**  Vote Action  */
    public static RequestBuilder<String> getVote(String pollId, String userId)  {
        Params kparams = new Params();
        kparams.add("pollId", pollId);
        kparams.add("userId", userId);

        return new RequestBuilder<String>(String.class, "poll_poll", "getVote", kparams);
    }

	/**  Get Votes Action  */
    public static RequestBuilder<String> getVotes(String pollId, String answerIds)  {
        Params kparams = new Params();
        kparams.add("pollId", pollId);
        kparams.add("answerIds", answerIds);

        return new RequestBuilder<String>(String.class, "poll_poll", "getVotes", kparams);
    }

	/**  Get resetVotes Action  */
    public static RequestBuilder<Void> resetVotes(String pollId)  {
        Params kparams = new Params();
        kparams.add("pollId", pollId);

        return new NullRequestBuilder("poll_poll", "resetVotes", kparams);
    }

	/**  Vote Action  */
    public static RequestBuilder<String> vote(String pollId, String userId, String answerIds)  {
        Params kparams = new Params();
        kparams.add("pollId", pollId);
        kparams.add("userId", userId);
        kparams.add("answerIds", answerIds);

        return new RequestBuilder<String>(String.class, "poll_poll", "vote", kparams);
    }
}
