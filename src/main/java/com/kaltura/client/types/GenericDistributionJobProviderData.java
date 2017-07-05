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
import com.kaltura.client.enums.GenericDistributionProviderParser;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class GenericDistributionJobProviderData extends DistributionJobProviderData {

    private String xml;
    private String resultParseData;
    private GenericDistributionProviderParser resultParserType;

    // xml:
    public String getXml(){
        return this.xml;
    }
    public void setXml(String xml){
        this.xml = xml;
    }

    // resultParseData:
    public String getResultParseData(){
        return this.resultParseData;
    }
    public void setResultParseData(String resultParseData){
        this.resultParseData = resultParseData;
    }

    // resultParserType:
    public GenericDistributionProviderParser getResultParserType(){
        return this.resultParserType;
    }
    public void setResultParserType(GenericDistributionProviderParser resultParserType){
        this.resultParserType = resultParserType;
    }


    public GenericDistributionJobProviderData() {
       super();
    }

    public GenericDistributionJobProviderData(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        xml = GsonParser.parseString(jsonObject.get("xml"));
        resultParseData = GsonParser.parseString(jsonObject.get("resultParseData"));
        resultParserType = GenericDistributionProviderParser.get(GsonParser.parseInt(jsonObject.get("resultParserType")));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaGenericDistributionJobProviderData");
        kparams.add("xml", this.xml);
        kparams.add("resultParseData", this.resultParseData);
        kparams.add("resultParserType", this.resultParserType);
        return kparams;
    }

}

