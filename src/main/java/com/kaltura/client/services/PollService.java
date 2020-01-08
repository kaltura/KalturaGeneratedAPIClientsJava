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
// Copyright (C) 2006-2020  Kaltura Inc.
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

import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Poll service  The poll service works against the cache entirely no DB instance
  should be used here
 * 
 * @param pollType 
 * @param pollId 
 * @param userId 
 * @param pollId 
 * @param answerIds 
 * @param pollId 
 * @param pollId 
 * @param userId 
 * @param answerIds 
 */
public class PollService {
	
	public static class AddPollBuilder extends RequestBuilder<String, String, AddPollBuilder> {
		
		public AddPollBuilder(String pollType) {
			super(String.class, "poll_poll", "add");
			params.add("pollType", pollType);
		}
		
		public void pollType(String multirequestToken) {
			params.add("pollType", multirequestToken);
		}
	}

	public static AddPollBuilder add()  {
		return add("SINGLE_ANONYMOUS");
	}

	/**
	 * Add Action
	 * 
	 * @param pollType 
	 */
    public static AddPollBuilder add(String pollType)  {
		return new AddPollBuilder(pollType);
	}
	
	public static class GetVotePollBuilder extends RequestBuilder<String, String, GetVotePollBuilder> {
		
		public GetVotePollBuilder(String pollId, String userId) {
			super(String.class, "poll_poll", "getVote");
			params.add("pollId", pollId);
			params.add("userId", userId);
		}
		
		public void pollId(String multirequestToken) {
			params.add("pollId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
	}

	/**
	 * Vote Action
	 * 
	 * @param pollId 
	 * @param userId 
	 */
    public static GetVotePollBuilder getVote(String pollId, String userId)  {
		return new GetVotePollBuilder(pollId, userId);
	}
	
	public static class GetVotesPollBuilder extends RequestBuilder<String, String, GetVotesPollBuilder> {
		
		public GetVotesPollBuilder(String pollId, String answerIds) {
			super(String.class, "poll_poll", "getVotes");
			params.add("pollId", pollId);
			params.add("answerIds", answerIds);
		}
		
		public void pollId(String multirequestToken) {
			params.add("pollId", multirequestToken);
		}
		
		public void answerIds(String multirequestToken) {
			params.add("answerIds", multirequestToken);
		}
	}

	/**
	 * Get Votes Action
	 * 
	 * @param pollId 
	 * @param answerIds 
	 */
    public static GetVotesPollBuilder getVotes(String pollId, String answerIds)  {
		return new GetVotesPollBuilder(pollId, answerIds);
	}
	
	public static class ResetVotesPollBuilder extends NullRequestBuilder {
		
		public ResetVotesPollBuilder(String pollId) {
			super("poll_poll", "resetVotes");
			params.add("pollId", pollId);
		}
		
		public void pollId(String multirequestToken) {
			params.add("pollId", multirequestToken);
		}
	}

	/**
	 * Get resetVotes Action
	 * 
	 * @param pollId 
	 */
    public static ResetVotesPollBuilder resetVotes(String pollId)  {
		return new ResetVotesPollBuilder(pollId);
	}
	
	public static class VotePollBuilder extends RequestBuilder<String, String, VotePollBuilder> {
		
		public VotePollBuilder(String pollId, String userId, String answerIds) {
			super(String.class, "poll_poll", "vote");
			params.add("pollId", pollId);
			params.add("userId", userId);
			params.add("answerIds", answerIds);
		}
		
		public void pollId(String multirequestToken) {
			params.add("pollId", multirequestToken);
		}
		
		public void userId(String multirequestToken) {
			params.add("userId", multirequestToken);
		}
		
		public void answerIds(String multirequestToken) {
			params.add("answerIds", multirequestToken);
		}
	}

	/**
	 * Vote Action
	 * 
	 * @param pollId 
	 * @param userId 
	 * @param answerIds 
	 */
    public static VotePollBuilder vote(String pollId, String userId, String answerIds)  {
		return new VotePollBuilder(pollId, userId, answerIds);
	}
}
