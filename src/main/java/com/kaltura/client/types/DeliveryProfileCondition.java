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
import com.kaltura.client.utils.request.MultiRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(DeliveryProfileCondition.Tokenizer.class)
public class DeliveryProfileCondition extends Condition {
	
	public interface Tokenizer extends Condition.Tokenizer {
		RequestBuilder.ListTokenizer<IntegerValue.Tokenizer> deliveryProfileIds();
	}

	/**  The delivery ids that are accepted by this condition  */
	private List<IntegerValue> deliveryProfileIds;

	// deliveryProfileIds:
	public List<IntegerValue> getDeliveryProfileIds(){
		return this.deliveryProfileIds;
	}
	public void setDeliveryProfileIds(List<IntegerValue> deliveryProfileIds){
		this.deliveryProfileIds = deliveryProfileIds;
	}


	public DeliveryProfileCondition() {
		super();
	}

	public DeliveryProfileCondition(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		deliveryProfileIds = GsonParser.parseArray(jsonObject.getAsJsonArray("deliveryProfileIds"), IntegerValue.class);

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaDeliveryProfileCondition");
		kparams.add("deliveryProfileIds", this.deliveryProfileIds);
		return kparams;
	}

}

