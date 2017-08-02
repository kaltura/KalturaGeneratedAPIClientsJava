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
import com.kaltura.client.enums.UiConfObjType;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Info about uiconf type  */
@SuppressWarnings("serial")
public class UiConfTypeInfo extends ObjectBase {

	/**  UiConf Type  */
    private UiConfObjType type;
	/**  Available versions  */
    private List<StringHolder> versions;
	/**  The direcotry this type is saved at  */
    private String directory;
	/**  Filename for this UiConf type  */
    private String filename;

    // type:
    public UiConfObjType getType(){
        return this.type;
    }
    public void setType(UiConfObjType type){
        this.type = type;
    }

    // versions:
    public List<StringHolder> getVersions(){
        return this.versions;
    }
    public void setVersions(List<StringHolder> versions){
        this.versions = versions;
    }

    // directory:
    public String getDirectory(){
        return this.directory;
    }
    public void setDirectory(String directory){
        this.directory = directory;
    }

    // filename:
    public String getFilename(){
        return this.filename;
    }
    public void setFilename(String filename){
        this.filename = filename;
    }


    public UiConfTypeInfo() {
       super();
    }

    public UiConfTypeInfo(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        type = UiConfObjType.get(GsonParser.parseInt(jsonObject.get("type")));
        versions = GsonParser.parseArray(jsonObject.getAsJsonArray("versions"), StringHolder.class);
        directory = GsonParser.parseString(jsonObject.get("directory"));
        filename = GsonParser.parseString(jsonObject.get("filename"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUiConfTypeInfo");
        kparams.add("type", this.type);
        kparams.add("versions", this.versions);
        kparams.add("directory", this.directory);
        kparams.add("filename", this.filename);
        return kparams;
    }

}

