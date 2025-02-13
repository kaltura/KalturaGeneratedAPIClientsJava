// ===================================================================================================
//                           _  __     _ _
//                          | |/ /__ _| | |_ _  _ _ _ __ _
//                          | ' </ _` | |  _| || | '_/ _` |
//                          |_|\_\__,_|_|\__|\_,_|_| \__,_|
//
// This file is part of the Kaltura Collaborative Media Suite which allows users
// to do with audio, video, and animation what Wiki platforms allow them to do with
// text.
//
// Copyright (C) 2006-2023  Kaltura Inc.
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
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(PartnerUsage.Tokenizer.class)
public class PartnerUsage extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String hostingGB();
		String Percent();
		String packageBW();
		String usageGB();
		String reachedLimitDate();
		String usageGraph();
	}

	/**
	 * Partner total hosting in GB on the disk
	 */
	private Double hostingGB;
	/**
	 * percent of usage out of partner's package. if usageGB is 5 and package is 10GB,
	  this value will be 50
	 */
	private Double Percent;
	/**
	 * package total BW - actually this is usage, which represents BW+storage
	 */
	private Integer packageBW;
	/**
	 * total usage in GB - including bandwidth and storage
	 */
	private Double usageGB;
	/**
	 * date when partner reached the limit of his package (timestamp)
	 */
	private Integer reachedLimitDate;
	/**
	 * a semi-colon separated list of comma-separated key-values to represent a usage
	  graph.   keys could be 1-12 for a year view (1,1.2;2,1.1;3,0.9;...;12,1.4;)  
	  keys could be 1-[28,29,30,31] depending on the requested month, for a daily view
	  in a given month (1,0.4;2,0.2;...;31,0.1;)
	 */
	private String usageGraph;

	// hostingGB:
	public Double getHostingGB(){
		return this.hostingGB;
	}
	// Percent:
	public Double getPercent(){
		return this.Percent;
	}
	// packageBW:
	public Integer getPackageBW(){
		return this.packageBW;
	}
	// usageGB:
	public Double getUsageGB(){
		return this.usageGB;
	}
	// reachedLimitDate:
	public Integer getReachedLimitDate(){
		return this.reachedLimitDate;
	}
	// usageGraph:
	public String getUsageGraph(){
		return this.usageGraph;
	}

	public PartnerUsage() {
		super();
	}

	public PartnerUsage(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		hostingGB = GsonParser.parseDouble(jsonObject.get("hostingGB"));
		Percent = GsonParser.parseDouble(jsonObject.get("Percent"));
		packageBW = GsonParser.parseInt(jsonObject.get("packageBW"));
		usageGB = GsonParser.parseDouble(jsonObject.get("usageGB"));
		reachedLimitDate = GsonParser.parseInt(jsonObject.get("reachedLimitDate"));
		usageGraph = GsonParser.parseString(jsonObject.get("usageGraph"));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaPartnerUsage");
		return kparams;
	}

}

