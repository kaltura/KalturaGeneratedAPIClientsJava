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
public class AccessControlScope extends ObjectBase {

	/**  URL to be used to test domain conditions.  */
    private String referrer;
	/**  IP to be used to test geographic location conditions.  */
    private String ip;
	/**  Kaltura session to be used to test session and user conditions.  */
    private String ks;
	/**  Browser or client application to be used to test agent conditions.  */
    private String userAgent;
	/**  Unix timestamp (In seconds) to be used to test entry scheduling, keep null to
	  use now.  */
    private Integer time;
	/**  Indicates what contexts should be tested. No contexts means any context.  */
    private List<AccessControlContextTypeHolder> contexts;
	/**  Array of hashes to pass to the access control profile scope  */
    private List<KeyValue> hashes;

    // referrer:
    public String getReferrer(){
        return this.referrer;
    }
    public void setReferrer(String referrer){
        this.referrer = referrer;
    }

    // ip:
    public String getIp(){
        return this.ip;
    }
    public void setIp(String ip){
        this.ip = ip;
    }

    // ks:
    public String getKs(){
        return this.ks;
    }
    public void setKs(String ks){
        this.ks = ks;
    }

    // userAgent:
    public String getUserAgent(){
        return this.userAgent;
    }
    public void setUserAgent(String userAgent){
        this.userAgent = userAgent;
    }

    // time:
    public Integer getTime(){
        return this.time;
    }
    public void setTime(Integer time){
        this.time = time;
    }

    // contexts:
    public List<AccessControlContextTypeHolder> getContexts(){
        return this.contexts;
    }
    public void setContexts(List<AccessControlContextTypeHolder> contexts){
        this.contexts = contexts;
    }

    // hashes:
    public List<KeyValue> getHashes(){
        return this.hashes;
    }
    public void setHashes(List<KeyValue> hashes){
        this.hashes = hashes;
    }


    public AccessControlScope() {
       super();
    }

    public AccessControlScope(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        referrer = GsonParser.parseString(jsonObject.get("referrer"));
        ip = GsonParser.parseString(jsonObject.get("ip"));
        ks = GsonParser.parseString(jsonObject.get("ks"));
        userAgent = GsonParser.parseString(jsonObject.get("userAgent"));
        time = GsonParser.parseInt(jsonObject.get("time"));
        contexts = GsonParser.parseArray(jsonObject.getAsJsonArray("contexts"), AccessControlContextTypeHolder.class);
        hashes = GsonParser.parseArray(jsonObject.getAsJsonArray("hashes"), KeyValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAccessControlScope");
        kparams.add("referrer", this.referrer);
        kparams.add("ip", this.ip);
        kparams.add("ks", this.ks);
        kparams.add("userAgent", this.userAgent);
        kparams.add("time", this.time);
        kparams.add("contexts", this.contexts);
        kparams.add("hashes", this.hashes);
        return kparams;
    }

}

