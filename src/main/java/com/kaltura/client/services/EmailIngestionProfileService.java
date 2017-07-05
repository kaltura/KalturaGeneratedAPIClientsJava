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
import com.kaltura.client.types.EmailIngestionProfile;
import com.kaltura.client.types.MediaEntry;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  EmailIngestionProfile service lets you manage email ingestion profile records  */
public class EmailIngestionProfileService {

	/**  EmailIngestionProfile Add action allows you to add a EmailIngestionProfile to
	  Kaltura DB  */
    public static RequestBuilder<EmailIngestionProfile> add(EmailIngestionProfile EmailIP)  {
        Params kparams = new Params();
        kparams.add("EmailIP", EmailIP);

        return new RequestBuilder<EmailIngestionProfile>(EmailIngestionProfile.class, "emailingestionprofile", "add", kparams);
    }

	/**  add KalturaMediaEntry from email ingestion  */
    public static RequestBuilder<MediaEntry> addMediaEntry(MediaEntry mediaEntry, String uploadTokenId, int emailProfId, String fromAddress, String emailMsgId)  {
        Params kparams = new Params();
        kparams.add("mediaEntry", mediaEntry);
        kparams.add("uploadTokenId", uploadTokenId);
        kparams.add("emailProfId", emailProfId);
        kparams.add("fromAddress", fromAddress);
        kparams.add("emailMsgId", emailMsgId);

        return new RequestBuilder<MediaEntry>(MediaEntry.class, "emailingestionprofile", "addMediaEntry", kparams);
    }

	/**  Delete an existing EmailIngestionProfile  */
    public static RequestBuilder<Void> delete(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new NullRequestBuilder("emailingestionprofile", "delete", kparams);
    }

	/**  Retrieve a EmailIngestionProfile by id  */
    public static RequestBuilder<EmailIngestionProfile> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<EmailIngestionProfile>(EmailIngestionProfile.class, "emailingestionprofile", "get", kparams);
    }

	/**  Retrieve a EmailIngestionProfile by email address  */
    public static RequestBuilder<EmailIngestionProfile> getByEmailAddress(String emailAddress)  {
        Params kparams = new Params();
        kparams.add("emailAddress", emailAddress);

        return new RequestBuilder<EmailIngestionProfile>(EmailIngestionProfile.class, "emailingestionprofile", "getByEmailAddress", kparams);
    }

	/**  Update an existing EmailIngestionProfile  */
    public static RequestBuilder<EmailIngestionProfile> update(int id, EmailIngestionProfile EmailIP)  {
        Params kparams = new Params();
        kparams.add("id", id);
        kparams.add("EmailIP", EmailIP);

        return new RequestBuilder<EmailIngestionProfile>(EmailIngestionProfile.class, "emailingestionprofile", "update", kparams);
    }
}
