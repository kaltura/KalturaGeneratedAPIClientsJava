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
package com.kaltura.client.enums;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum DistributionProviderType implements EnumAsString {
	ATT_UVERSE("attUverseDistribution.ATT_UVERSE"),
	AVN("avnDistribution.AVN"),
	COMCAST_MRSS("comcastMrssDistribution.COMCAST_MRSS"),
	CORTEX_API("cortexApiDistribution.CORTEX_API"),
	CROSS_KALTURA("crossKalturaDistribution.CROSS_KALTURA"),
	DAILYMOTION("dailymotionDistribution.DAILYMOTION"),
	DOUBLECLICK("doubleClickDistribution.DOUBLECLICK"),
	FACEBOOK("facebookDistribution.FACEBOOK"),
	FREEWHEEL("freewheelDistribution.FREEWHEEL"),
	FREEWHEEL_GENERIC("freewheelGenericDistribution.FREEWHEEL_GENERIC"),
	FTP("ftpDistribution.FTP"),
	FTP_SCHEDULED("ftpDistribution.FTP_SCHEDULED"),
	HULU("huluDistribution.HULU"),
	IDETIC("ideticDistribution.IDETIC"),
	METRO_PCS("metroPcsDistribution.METRO_PCS"),
	MSN("msnDistribution.MSN"),
	NDN("ndnDistribution.NDN"),
	PODCAST("podcastDistribution.PODCAST"),
	PUSH_TO_NEWS("pushToNewsDistribution.PUSH_TO_NEWS"),
	QUICKPLAY("quickPlayDistribution.QUICKPLAY"),
	SYNACOR_HBO("synacorHboDistribution.SYNACOR_HBO"),
	TIME_WARNER("timeWarnerDistribution.TIME_WARNER"),
	TVCOM("tvComDistribution.TVCOM"),
	TVINCI("tvinciDistribution.TVINCI"),
	UNICORN("unicornDistribution.UNICORN"),
	UVERSE_CLICK_TO_ORDER("uverseClickToOrderDistribution.UVERSE_CLICK_TO_ORDER"),
	UVERSE("uverseDistribution.UVERSE"),
	VERIZON_VCAST("verizonVcastDistribution.VERIZON_VCAST"),
	YAHOO("yahooDistribution.YAHOO"),
	YOUTUBE("youTubeDistribution.YOUTUBE"),
	YOUTUBE_API("youtubeApiDistribution.YOUTUBE_API"),
	GENERIC("1"),
	SYNDICATION("2");

	private String value;

	DistributionProviderType(String value) {
		this.value = value;
	}

	@Override
	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public static DistributionProviderType get(String value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over DistributionProviderType defined values and compare the inner value with the given one:
		for(DistributionProviderType item: values()) {
			if(item.getValue().equals(value)) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return DistributionProviderType.values().length > 0 ? DistributionProviderType.values()[0]: null;
   }
}
