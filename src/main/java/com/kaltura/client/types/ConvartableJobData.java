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
import com.kaltura.client.types.FlavorParamsOutput;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class ConvartableJobData extends JobData {

    private String srcFileSyncLocalPath;
	/**  The translated path as used by the scheduler  */
    private String actualSrcFileSyncLocalPath;
    private String srcFileSyncRemoteUrl;
    private List<SourceFileSyncDescriptor> srcFileSyncs;
    private Integer engineVersion;
    private Integer flavorParamsOutputId;
    private FlavorParamsOutput flavorParamsOutput;
    private Integer mediaInfoId;
    private Integer currentOperationSet;
    private Integer currentOperationIndex;
    private List<KeyValue> pluginData;

    // srcFileSyncLocalPath:
    public String getSrcFileSyncLocalPath(){
        return this.srcFileSyncLocalPath;
    }
    public void setSrcFileSyncLocalPath(String srcFileSyncLocalPath){
        this.srcFileSyncLocalPath = srcFileSyncLocalPath;
    }

    // actualSrcFileSyncLocalPath:
    public String getActualSrcFileSyncLocalPath(){
        return this.actualSrcFileSyncLocalPath;
    }
    public void setActualSrcFileSyncLocalPath(String actualSrcFileSyncLocalPath){
        this.actualSrcFileSyncLocalPath = actualSrcFileSyncLocalPath;
    }

    // srcFileSyncRemoteUrl:
    public String getSrcFileSyncRemoteUrl(){
        return this.srcFileSyncRemoteUrl;
    }
    public void setSrcFileSyncRemoteUrl(String srcFileSyncRemoteUrl){
        this.srcFileSyncRemoteUrl = srcFileSyncRemoteUrl;
    }

    // srcFileSyncs:
    public List<SourceFileSyncDescriptor> getSrcFileSyncs(){
        return this.srcFileSyncs;
    }
    public void setSrcFileSyncs(List<SourceFileSyncDescriptor> srcFileSyncs){
        this.srcFileSyncs = srcFileSyncs;
    }

    // engineVersion:
    public Integer getEngineVersion(){
        return this.engineVersion;
    }
    public void setEngineVersion(Integer engineVersion){
        this.engineVersion = engineVersion;
    }

    // flavorParamsOutputId:
    public Integer getFlavorParamsOutputId(){
        return this.flavorParamsOutputId;
    }
    public void setFlavorParamsOutputId(Integer flavorParamsOutputId){
        this.flavorParamsOutputId = flavorParamsOutputId;
    }

    // flavorParamsOutput:
    public FlavorParamsOutput getFlavorParamsOutput(){
        return this.flavorParamsOutput;
    }
    public void setFlavorParamsOutput(FlavorParamsOutput flavorParamsOutput){
        this.flavorParamsOutput = flavorParamsOutput;
    }

    // mediaInfoId:
    public Integer getMediaInfoId(){
        return this.mediaInfoId;
    }
    public void setMediaInfoId(Integer mediaInfoId){
        this.mediaInfoId = mediaInfoId;
    }

    // currentOperationSet:
    public Integer getCurrentOperationSet(){
        return this.currentOperationSet;
    }
    public void setCurrentOperationSet(Integer currentOperationSet){
        this.currentOperationSet = currentOperationSet;
    }

    // currentOperationIndex:
    public Integer getCurrentOperationIndex(){
        return this.currentOperationIndex;
    }
    public void setCurrentOperationIndex(Integer currentOperationIndex){
        this.currentOperationIndex = currentOperationIndex;
    }

    // pluginData:
    public List<KeyValue> getPluginData(){
        return this.pluginData;
    }
    public void setPluginData(List<KeyValue> pluginData){
        this.pluginData = pluginData;
    }


    public ConvartableJobData() {
       super();
    }

    public ConvartableJobData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        srcFileSyncLocalPath = GsonParser.parseString(jsonObject.get("srcFileSyncLocalPath"));
        actualSrcFileSyncLocalPath = GsonParser.parseString(jsonObject.get("actualSrcFileSyncLocalPath"));
        srcFileSyncRemoteUrl = GsonParser.parseString(jsonObject.get("srcFileSyncRemoteUrl"));
        srcFileSyncs = GsonParser.parseArray(jsonObject.getAsJsonArray("srcFileSyncs"), SourceFileSyncDescriptor.class);
        engineVersion = GsonParser.parseInt(jsonObject.get("engineVersion"));
        flavorParamsOutputId = GsonParser.parseInt(jsonObject.get("flavorParamsOutputId"));
        flavorParamsOutput = GsonParser.parseObject(jsonObject.getAsJsonObject("flavorParamsOutput"), FlavorParamsOutput.class);
        mediaInfoId = GsonParser.parseInt(jsonObject.get("mediaInfoId"));
        currentOperationSet = GsonParser.parseInt(jsonObject.get("currentOperationSet"));
        currentOperationIndex = GsonParser.parseInt(jsonObject.get("currentOperationIndex"));
        pluginData = GsonParser.parseArray(jsonObject.getAsJsonArray("pluginData"), KeyValue.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaConvartableJobData");
        kparams.add("srcFileSyncLocalPath", this.srcFileSyncLocalPath);
        kparams.add("actualSrcFileSyncLocalPath", this.actualSrcFileSyncLocalPath);
        kparams.add("srcFileSyncRemoteUrl", this.srcFileSyncRemoteUrl);
        kparams.add("srcFileSyncs", this.srcFileSyncs);
        kparams.add("engineVersion", this.engineVersion);
        kparams.add("flavorParamsOutputId", this.flavorParamsOutputId);
        kparams.add("flavorParamsOutput", this.flavorParamsOutput);
        kparams.add("mediaInfoId", this.mediaInfoId);
        kparams.add("currentOperationSet", this.currentOperationSet);
        kparams.add("currentOperationIndex", this.currentOperationIndex);
        kparams.add("pluginData", this.pluginData);
        return kparams;
    }

}
