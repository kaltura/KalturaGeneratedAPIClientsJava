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

/**  Used to ingest media that is available on remote server and accessible using the
  supplied URL, media file will be downloaded using import job in order to make
  the asset ready.  */
@SuppressWarnings("serial")
public class UrlResource extends ContentResource {

	/**  Remote URL, FTP, HTTP or HTTPS  */
    private String url;
	/**  Force Import Job  */
    private Boolean forceAsyncDownload;

    // url:
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    // forceAsyncDownload:
    public Boolean getForceAsyncDownload(){
        return this.forceAsyncDownload;
    }
    public void setForceAsyncDownload(Boolean forceAsyncDownload){
        this.forceAsyncDownload = forceAsyncDownload;
    }


    public UrlResource() {
       super();
    }

    public UrlResource(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        url = GsonParser.parseString(jsonObject.get("url"));
        forceAsyncDownload = GsonParser.parseBoolean(jsonObject.get("forceAsyncDownload"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUrlResource");
        kparams.add("url", this.url);
        kparams.add("forceAsyncDownload", this.forceAsyncDownload);
        return kparams;
    }

}

