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
public class CrossKalturaDistributionJobProviderData extends ConfigurableDistributionJobProviderData {

	/**  Key-value array where the keys are IDs of distributed flavor assets in the
	  source account and the values are the matching IDs in the target account  */
    private String distributedFlavorAssets;
	/**  Key-value array where the keys are IDs of distributed thumb assets in the source
	  account and the values are the matching IDs in the target account  */
    private String distributedThumbAssets;
	/**  Key-value array where the keys are IDs of distributed metadata objects in the
	  source account and the values are the matching IDs in the target account  */
    private String distributedMetadata;
	/**  Key-value array where the keys are IDs of distributed caption assets in the
	  source account and the values are the matching IDs in the target account  */
    private String distributedCaptionAssets;
	/**  Key-value array where the keys are IDs of distributed cue points in the source
	  account and the values are the matching IDs in the target account  */
    private String distributedCuePoints;

    // distributedFlavorAssets:
    public String getDistributedFlavorAssets(){
        return this.distributedFlavorAssets;
    }
    public void setDistributedFlavorAssets(String distributedFlavorAssets){
        this.distributedFlavorAssets = distributedFlavorAssets;
    }

    // distributedThumbAssets:
    public String getDistributedThumbAssets(){
        return this.distributedThumbAssets;
    }
    public void setDistributedThumbAssets(String distributedThumbAssets){
        this.distributedThumbAssets = distributedThumbAssets;
    }

    // distributedMetadata:
    public String getDistributedMetadata(){
        return this.distributedMetadata;
    }
    public void setDistributedMetadata(String distributedMetadata){
        this.distributedMetadata = distributedMetadata;
    }

    // distributedCaptionAssets:
    public String getDistributedCaptionAssets(){
        return this.distributedCaptionAssets;
    }
    public void setDistributedCaptionAssets(String distributedCaptionAssets){
        this.distributedCaptionAssets = distributedCaptionAssets;
    }

    // distributedCuePoints:
    public String getDistributedCuePoints(){
        return this.distributedCuePoints;
    }
    public void setDistributedCuePoints(String distributedCuePoints){
        this.distributedCuePoints = distributedCuePoints;
    }


    public CrossKalturaDistributionJobProviderData() {
       super();
    }

    public CrossKalturaDistributionJobProviderData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        distributedFlavorAssets = GsonParser.parseString(jsonObject.get("distributedFlavorAssets"));
        distributedThumbAssets = GsonParser.parseString(jsonObject.get("distributedThumbAssets"));
        distributedMetadata = GsonParser.parseString(jsonObject.get("distributedMetadata"));
        distributedCaptionAssets = GsonParser.parseString(jsonObject.get("distributedCaptionAssets"));
        distributedCuePoints = GsonParser.parseString(jsonObject.get("distributedCuePoints"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaCrossKalturaDistributionJobProviderData");
        kparams.add("distributedFlavorAssets", this.distributedFlavorAssets);
        kparams.add("distributedThumbAssets", this.distributedThumbAssets);
        kparams.add("distributedMetadata", this.distributedMetadata);
        kparams.add("distributedCaptionAssets", this.distributedCaptionAssets);
        kparams.add("distributedCuePoints", this.distributedCuePoints);
        return kparams;
    }

}

