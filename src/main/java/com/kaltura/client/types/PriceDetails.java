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
import com.kaltura.client.types.Price;
import java.util.List;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Price details  */
@SuppressWarnings("serial")
public class PriceDetails extends ObjectBase {

	/**  The price code identifier  */
    private Integer id;
	/**  The price code name  */
    private String name;
	/**  The price  */
    private Price price;
	/**  A list of the descriptions for this price on different languages (language code
	  and translation)  */
    private List<TranslationToken> descriptions;

    // id:
    public Integer getId(){
        return this.id;
    }
    public void setId(Integer id){
        this.id = id;
    }

    // name:
    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name = name;
    }

    // price:
    public Price getPrice(){
        return this.price;
    }
    public void setPrice(Price price){
        this.price = price;
    }

    // descriptions:
    public List<TranslationToken> getDescriptions(){
        return this.descriptions;
    }
    public void setDescriptions(List<TranslationToken> descriptions){
        this.descriptions = descriptions;
    }


    public PriceDetails() {
       super();
    }

    public PriceDetails(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseInt(jsonObject.get("id"));
        name = GsonParser.parseString(jsonObject.get("name"));
        price = GsonParser.parseObject(jsonObject.getAsJsonObject("price"), Price.class);
        descriptions = GsonParser.parseArray(jsonObject.getAsJsonArray("descriptions"), TranslationToken.class);

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaPriceDetails");
        kparams.add("id", this.id);
        kparams.add("name", this.name);
        kparams.add("price", this.price);
        kparams.add("descriptions", this.descriptions);
        return kparams;
    }

}

