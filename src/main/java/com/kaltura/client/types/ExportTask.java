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
import com.kaltura.client.enums.ExportDataType;
import com.kaltura.client.enums.ExportType;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Bulk export task  */
@SuppressWarnings("serial")
public class ExportTask extends ObjectBase {

	/**  Task identifier  */
    private Long id;
	/**  Alias for the task used to solicit an export using API  */
    private String alias;
	/**  Task display name  */
    private String name;
	/**  The data type exported in this task  */
    private ExportDataType dataType;
	/**  Filter to apply on the export, utilize KSQL.              Note: KSQL currently
	  applies to media assets only. It cannot be used for USERS filtering  */
    private String filter;
	/**  Type of export batch – full or incremental  */
    private ExportType exportType;
	/**  How often the export should occur, reasonable minimum threshold should apply,
	  configurable in minutes  */
    private Long frequency;
	/**  The URL for sending a notification when the task&amp;#39;s export process is
	  done  */
    private String notificationUrl;
	/**  List of media type identifiers (as configured in TVM) to export. used only in
	  case data_type = vod  */
    private List<IntegerValue> vodTypes;
	/**  Indicates if the task is active or not  */
    private Boolean isActive;

    // id:
    public Long getId(){
        return this.id;
    }
    public void setId(Long id){
        this.id = id;
    }

    // alias:
    public String getAlias(){
        return this.alias;
    }
    public void setAlias(String alias){
        this.alias = alias;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // dataType:
    public ExportDataType getDataType(){
        return this.dataType;
    }
    public void setDataType(ExportDataType dataType){
        this.dataType = dataType;
    }

    // filter:
    public String getFilter(){
        return this.filter;
    }
    public void setFilter(String filter){
        this.filter = filter;
    }

    // exportType:
    public ExportType getExportType(){
        return this.exportType;
    }
    public void setExportType(ExportType exportType){
        this.exportType = exportType;
    }

    // frequency:
    public Long getFrequency(){
        return this.frequency;
    }
    public void setFrequency(Long frequency){
        this.frequency = frequency;
    }

    // notificationUrl:
    public String getNotificationUrl(){
        return this.notificationUrl;
    }
    public void setNotificationUrl(String notificationUrl){
        this.notificationUrl = notificationUrl;
    }

    // vodTypes:
    public List<IntegerValue> getVodTypes(){
        return this.vodTypes;
    }
    public void setVodTypes(List<IntegerValue> vodTypes){
        this.vodTypes = vodTypes;
    }

    // isActive:
    public Boolean getIsActive(){
        return this.isActive;
    }
    public void setIsActive(Boolean isActive){
        this.isActive = isActive;
    }


    public ExportTask() {
       super();
    }

    public ExportTask(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseLong(jsonObject.get("id"));
        alias = GsonParser.parseString(jsonObject.get("alias"));
        name = GsonParser.parseString(jsonObject.get("name"));
        dataType = ExportDataType.get(GsonParser.parseString(jsonObject.get("dataType")));
        filter = GsonParser.parseString(jsonObject.get("filter"));
        exportType = ExportType.get(GsonParser.parseString(jsonObject.get("exportType")));
        frequency = GsonParser.parseLong(jsonObject.get("frequency"));
        notificationUrl = GsonParser.parseString(jsonObject.get("notificationUrl"));
        vodTypes = GsonParser.parseArray(jsonObject.getAsJsonArray("vodTypes"), IntegerValue.class);
        isActive = GsonParser.parseBoolean(jsonObject.get("isActive"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaExportTask");
        kparams.add("alias", this.alias);
        kparams.add("name", this.name);
        kparams.add("dataType", this.dataType);
        kparams.add("filter", this.filter);
        kparams.add("exportType", this.exportType);
        kparams.add("frequency", this.frequency);
        kparams.add("notificationUrl", this.notificationUrl);
        kparams.add("vodTypes", this.vodTypes);
        kparams.add("isActive", this.isActive);
        return kparams;
    }

}

