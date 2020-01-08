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
// Copyright (C) 2006-2020  Kaltura Inc.
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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PartnerStatistics.Tokenizer.class)
public class PartnerStatistics extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String packageBandwidthAndStorage();
		String hosting();
		String bandwidth();
		String usage();
		String usagePercent();
		String reachedLimitDate();
	}

	/**
	 * Package total allowed bandwidth and storage
	 */
	private Integer packageBandwidthAndStorage;
	/**
	 * Partner total hosting in GB on the disk
	 */
	private Double hosting;
	/**
	 * Partner total bandwidth in GB
	 */
	private Double bandwidth;
	/**
	 * total usage in GB - including bandwidth and storage
	 */
	private Integer usage;
	/**
	 * Percent of usage out of partner's package. if usage is 5GB and package is 10GB,
	  this value will be 50
	 */
	private Double usagePercent;
	/**
	 * date when partner reached the limit of his package (timestamp)
	 */
	private Integer reachedLimitDate;

	// packageBandwidthAndStorage:
	public Integer getPackageBandwidthAndStorage(){
		return this.packageBandwidthAndStorage;
	}
	// hosting:
	public Double getHosting(){
		return this.hosting;
	}
	// bandwidth:
	public Double getBandwidth(){
		return this.bandwidth;
	}
	// usage:
	public Integer getUsage(){
		return this.usage;
	}
	// usagePercent:
	public Double getUsagePercent(){
		return this.usagePercent;
	}
	// reachedLimitDate:
	public Integer getReachedLimitDate(){
		return this.reachedLimitDate;
	}

	public PartnerStatistics() {
		super();
	}

	public PartnerStatistics(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		packageBandwidthAndStorage = GsonParser.parseInt(jsonObject.get("packageBandwidthAndStorage"));
		hosting = GsonParser.parseDouble(jsonObject.get("hosting"));
		bandwidth = GsonParser.parseDouble(jsonObject.get("bandwidth"));
		usage = GsonParser.parseInt(jsonObject.get("usage"));
		usagePercent = GsonParser.parseDouble(jsonObject.get("usagePercent"));
		reachedLimitDate = GsonParser.parseInt(jsonObject.get("reachedLimitDate"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPartnerStatistics");
		return kparams;
	}

}

