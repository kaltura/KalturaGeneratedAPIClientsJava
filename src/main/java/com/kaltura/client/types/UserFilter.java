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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class UserFilter extends UserBaseFilter {

    private String idOrScreenNameStartsWith;
    private String idEqual;
    private String idIn;
    private Boolean loginEnabledEqual;
    private String roleIdEqual;
    private String roleIdsEqual;
    private String roleIdsIn;
    private String firstNameOrLastNameStartsWith;
	/**  Permission names filter expression  */
    private String permissionNamesMultiLikeOr;
	/**  Permission names filter expression  */
    private String permissionNamesMultiLikeAnd;

    // idOrScreenNameStartsWith:
    public String getIdOrScreenNameStartsWith(){
        return this.idOrScreenNameStartsWith;
    }
    public void setIdOrScreenNameStartsWith(String idOrScreenNameStartsWith){
        this.idOrScreenNameStartsWith = idOrScreenNameStartsWith;
    }

    // idEqual:
    public String getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(String idEqual){
        this.idEqual = idEqual;
    }

    // idIn:
    public String getIdIn(){
        return this.idIn;
    }
    public void setIdIn(String idIn){
        this.idIn = idIn;
    }

    // loginEnabledEqual:
    public Boolean getLoginEnabledEqual(){
        return this.loginEnabledEqual;
    }
    public void setLoginEnabledEqual(Boolean loginEnabledEqual){
        this.loginEnabledEqual = loginEnabledEqual;
    }

    // roleIdEqual:
    public String getRoleIdEqual(){
        return this.roleIdEqual;
    }
    public void setRoleIdEqual(String roleIdEqual){
        this.roleIdEqual = roleIdEqual;
    }

    // roleIdsEqual:
    public String getRoleIdsEqual(){
        return this.roleIdsEqual;
    }
    public void setRoleIdsEqual(String roleIdsEqual){
        this.roleIdsEqual = roleIdsEqual;
    }

    // roleIdsIn:
    public String getRoleIdsIn(){
        return this.roleIdsIn;
    }
    public void setRoleIdsIn(String roleIdsIn){
        this.roleIdsIn = roleIdsIn;
    }

    // firstNameOrLastNameStartsWith:
    public String getFirstNameOrLastNameStartsWith(){
        return this.firstNameOrLastNameStartsWith;
    }
    public void setFirstNameOrLastNameStartsWith(String firstNameOrLastNameStartsWith){
        this.firstNameOrLastNameStartsWith = firstNameOrLastNameStartsWith;
    }

    // permissionNamesMultiLikeOr:
    public String getPermissionNamesMultiLikeOr(){
        return this.permissionNamesMultiLikeOr;
    }
    public void setPermissionNamesMultiLikeOr(String permissionNamesMultiLikeOr){
        this.permissionNamesMultiLikeOr = permissionNamesMultiLikeOr;
    }

    // permissionNamesMultiLikeAnd:
    public String getPermissionNamesMultiLikeAnd(){
        return this.permissionNamesMultiLikeAnd;
    }
    public void setPermissionNamesMultiLikeAnd(String permissionNamesMultiLikeAnd){
        this.permissionNamesMultiLikeAnd = permissionNamesMultiLikeAnd;
    }


    public UserFilter() {
       super();
    }

    public UserFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idOrScreenNameStartsWith = GsonParser.parseString(jsonObject.get("idOrScreenNameStartsWith"));
        idEqual = GsonParser.parseString(jsonObject.get("idEqual"));
        idIn = GsonParser.parseString(jsonObject.get("idIn"));
        loginEnabledEqual = GsonParser.parseBoolean(jsonObject.get("loginEnabledEqual"));
        roleIdEqual = GsonParser.parseString(jsonObject.get("roleIdEqual"));
        roleIdsEqual = GsonParser.parseString(jsonObject.get("roleIdsEqual"));
        roleIdsIn = GsonParser.parseString(jsonObject.get("roleIdsIn"));
        firstNameOrLastNameStartsWith = GsonParser.parseString(jsonObject.get("firstNameOrLastNameStartsWith"));
        permissionNamesMultiLikeOr = GsonParser.parseString(jsonObject.get("permissionNamesMultiLikeOr"));
        permissionNamesMultiLikeAnd = GsonParser.parseString(jsonObject.get("permissionNamesMultiLikeAnd"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUserFilter");
        kparams.add("idOrScreenNameStartsWith", this.idOrScreenNameStartsWith);
        kparams.add("idEqual", this.idEqual);
        kparams.add("idIn", this.idIn);
        kparams.add("loginEnabledEqual", this.loginEnabledEqual);
        kparams.add("roleIdEqual", this.roleIdEqual);
        kparams.add("roleIdsEqual", this.roleIdsEqual);
        kparams.add("roleIdsIn", this.roleIdsIn);
        kparams.add("firstNameOrLastNameStartsWith", this.firstNameOrLastNameStartsWith);
        kparams.add("permissionNamesMultiLikeOr", this.permissionNamesMultiLikeOr);
        kparams.add("permissionNamesMultiLikeAnd", this.permissionNamesMultiLikeAnd);
        return kparams;
    }

}

