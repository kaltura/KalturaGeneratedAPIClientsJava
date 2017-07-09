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
public class IndexTagsByPrivacyContextJobData extends JobData {

    private Integer changedCategoryId;
    private String deletedPrivacyContexts;
    private String addedPrivacyContexts;

    // changedCategoryId:
    public Integer getChangedCategoryId(){
        return this.changedCategoryId;
    }
    public void setChangedCategoryId(Integer changedCategoryId){
        this.changedCategoryId = changedCategoryId;
    }

    // deletedPrivacyContexts:
    public String getDeletedPrivacyContexts(){
        return this.deletedPrivacyContexts;
    }
    public void setDeletedPrivacyContexts(String deletedPrivacyContexts){
        this.deletedPrivacyContexts = deletedPrivacyContexts;
    }

    // addedPrivacyContexts:
    public String getAddedPrivacyContexts(){
        return this.addedPrivacyContexts;
    }
    public void setAddedPrivacyContexts(String addedPrivacyContexts){
        this.addedPrivacyContexts = addedPrivacyContexts;
    }


    public IndexTagsByPrivacyContextJobData() {
       super();
    }

    public IndexTagsByPrivacyContextJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        changedCategoryId = GsonParser.parseInt(jsonObject.get("changedCategoryId"));
        deletedPrivacyContexts = GsonParser.parseString(jsonObject.get("deletedPrivacyContexts"));
        addedPrivacyContexts = GsonParser.parseString(jsonObject.get("addedPrivacyContexts"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaIndexTagsByPrivacyContextJobData");
        kparams.add("changedCategoryId", this.changedCategoryId);
        kparams.add("deletedPrivacyContexts", this.deletedPrivacyContexts);
        kparams.add("addedPrivacyContexts", this.addedPrivacyContexts);
        return kparams;
    }

}
