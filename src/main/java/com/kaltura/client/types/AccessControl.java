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
public class AccessControl extends ObjectBase {

	/**  The id of the Access Control Profile  */
    private Integer id;
    private Integer partnerId;
	/**  The name of the Access Control Profile  */
    private String name;
	/**  System name of the Access Control Profile  */
    private String systemName;
	/**  The description of the Access Control Profile  */
    private String description;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  True if this Conversion Profile is the default  */
    private Boolean isDefault;
	/**  Array of Access Control Restrictions  */
    private List<BaseRestriction> restrictions;
	/**  Indicates that the access control profile is new and should be handled using
	  KalturaAccessControlProfile object and accessControlProfile service  */
    private Boolean containsUnsuportedRestrictions;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // systemName:
    public String getSystemName(){
        return this.systemName;
    }
    public void setSystemName(String systemName){
        this.systemName = systemName;
    }

    // description:
    public String getDescription(){
        return this.description;
    }
    public void setDescription(String description){
        this.description = description;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // isDefault:
    public Boolean getIsDefault(){
        return this.isDefault;
    }
    public void setIsDefault(Boolean isDefault){
        this.isDefault = isDefault;
    }

    // restrictions:
    public List<BaseRestriction> getRestrictions(){
        return this.restrictions;
    }
    public void setRestrictions(List<BaseRestriction> restrictions){
        this.restrictions = restrictions;
    }

    // containsUnsuportedRestrictions:
    public Boolean getContainsUnsuportedRestrictions(){
        return this.containsUnsuportedRestrictions;
    }
    public void setContainsUnsuportedRestrictions(Boolean containsUnsuportedRestrictions){
        this.containsUnsuportedRestrictions = containsUnsuportedRestrictions;
    }


    public AccessControl() {
       super();
    }

    public AccessControl(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        name = GsonParser.parseString(jsonObject.get("name"));
        systemName = GsonParser.parseString(jsonObject.get("systemName"));
        description = GsonParser.parseString(jsonObject.get("description"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        isDefault = GsonParser.parseBoolean(jsonObject.get("isDefault"));
        restrictions = GsonParser.parseArray(jsonObject.getAsJsonArray("restrictions"), BaseRestriction.class);
        containsUnsuportedRestrictions = GsonParser.parseBoolean(jsonObject.get("containsUnsuportedRestrictions"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAccessControl");
        kparams.add("name", this.name);
        kparams.add("systemName", this.systemName);
        kparams.add("description", this.description);
        kparams.add("isDefault", this.isDefault);
        kparams.add("restrictions", this.restrictions);
        return kparams;
    }

}

