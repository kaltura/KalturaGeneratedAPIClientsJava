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
import com.kaltura.client.types.ObjectBase;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class PlaybackSource extends ObjectBase {

    private String deliveryProfileId;
	/**  source format according to delivery profile streamer type (applehttp, mpegdash
	  etc.)  */
    private String format;
	/**  comma separated string according to deliveryProfile media protocols
	  ('http,https' etc.)  */
    private String protocols;
	/**  comma separated string of flavor ids  */
    private String flavorIds;
    private String url;
	/**  drm data object containing relevant license url ,scheme name and certificate  */
    private List<DrmPlaybackPluginData> drm;

    // deliveryProfileId:
    public String getDeliveryProfileId(){
        return this.deliveryProfileId;
    }
    public void setDeliveryProfileId(String deliveryProfileId){
        this.deliveryProfileId = deliveryProfileId;
    }

    // format:
    public String getFormat(){
        return this.format;
    }
    public void setFormat(String format){
        this.format = format;
    }

    // protocols:
    public String getProtocols(){
        return this.protocols;
    }
    public void setProtocols(String protocols){
        this.protocols = protocols;
    }

    // flavorIds:
    public String getFlavorIds(){
        return this.flavorIds;
    }
    public void setFlavorIds(String flavorIds){
        this.flavorIds = flavorIds;
    }

    // url:
    public String getUrl(){
        return this.url;
    }
    public void setUrl(String url){
        this.url = url;
    }

    // drm:
    public List<DrmPlaybackPluginData> getDrm(){
        return this.drm;
    }
    public void setDrm(List<DrmPlaybackPluginData> drm){
        this.drm = drm;
    }


    public PlaybackSource() {
       super();
    }

    public PlaybackSource(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        deliveryProfileId = GsonParser.parseString(jsonObject.get("deliveryProfileId"));
        format = GsonParser.parseString(jsonObject.get("format"));
        protocols = GsonParser.parseString(jsonObject.get("protocols"));
        flavorIds = GsonParser.parseString(jsonObject.get("flavorIds"));
        url = GsonParser.parseString(jsonObject.get("url"));
        drm = GsonParser.parseArray(jsonObject.getAsJsonArray("drm"), DrmPlaybackPluginData.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPlaybackSource");
        kparams.add("deliveryProfileId", this.deliveryProfileId);
        kparams.add("format", this.format);
        kparams.add("protocols", this.protocols);
        kparams.add("flavorIds", this.flavorIds);
        kparams.add("url", this.url);
        kparams.add("drm", this.drm);
        return kparams;
    }

}

