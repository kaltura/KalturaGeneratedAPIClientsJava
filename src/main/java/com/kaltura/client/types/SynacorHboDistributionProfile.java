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
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class SynacorHboDistributionProfile extends ConfigurableDistributionProfile {

    private String feedUrl;
    private String feedTitle;
    private String feedSubtitle;
    private String feedLink;
    private String feedAuthorName;

    // feedUrl:
    public String getFeedUrl(){
        return this.feedUrl;
    }
    public void setFeedUrl(String feedUrl){
        this.feedUrl = feedUrl;
    }

    // feedTitle:
    public String getFeedTitle(){
        return this.feedTitle;
    }
    public void setFeedTitle(String feedTitle){
        this.feedTitle = feedTitle;
    }

    // feedSubtitle:
    public String getFeedSubtitle(){
        return this.feedSubtitle;
    }
    public void setFeedSubtitle(String feedSubtitle){
        this.feedSubtitle = feedSubtitle;
    }

    // feedLink:
    public String getFeedLink(){
        return this.feedLink;
    }
    public void setFeedLink(String feedLink){
        this.feedLink = feedLink;
    }

    // feedAuthorName:
    public String getFeedAuthorName(){
        return this.feedAuthorName;
    }
    public void setFeedAuthorName(String feedAuthorName){
        this.feedAuthorName = feedAuthorName;
    }


    public SynacorHboDistributionProfile() {
       super();
    }

    public SynacorHboDistributionProfile(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        feedUrl = GsonParser.parseString(jsonObject.get("feedUrl"));
        feedTitle = GsonParser.parseString(jsonObject.get("feedTitle"));
        feedSubtitle = GsonParser.parseString(jsonObject.get("feedSubtitle"));
        feedLink = GsonParser.parseString(jsonObject.get("feedLink"));
        feedAuthorName = GsonParser.parseString(jsonObject.get("feedAuthorName"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaSynacorHboDistributionProfile");
        kparams.add("feedTitle", this.feedTitle);
        kparams.add("feedSubtitle", this.feedSubtitle);
        kparams.add("feedLink", this.feedLink);
        kparams.add("feedAuthorName", this.feedAuthorName);
        return kparams;
    }

}

