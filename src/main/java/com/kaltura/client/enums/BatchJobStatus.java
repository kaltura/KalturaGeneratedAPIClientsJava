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
// Copyright (C) 2006-2019  Kaltura Inc.
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
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */
public enum BatchJobStatus implements EnumAsInt {
	PENDING(0),
	QUEUED(1),
	PROCESSING(2),
	PROCESSED(3),
	MOVEFILE(4),
	FINISHED(5),
	FAILED(6),
	ABORTED(7),
	ALMOST_DONE(8),
	RETRY(9),
	FATAL(10),
	DONT_PROCESS(11),
	FINISHED_PARTIALLY(12),
	SUSPEND(13),
	SUSPEND_ALMOST_DONE(14);

	private int value;

	BatchJobStatus(int value) {
		this.value = value;
	}

	@Override
	public int getValue() {
		return this.value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public static BatchJobStatus get(Integer value) {
		if(value == null)
		{
			return null;
		}
		
		// goes over BatchJobStatus defined values and compare the inner value with the given one:
		for(BatchJobStatus item: values()) {
			if(item.getValue() == value) {
				return item;
			}
		}
		// in case the requested value was not found in the enum values, we return the first item as default.
		return BatchJobStatus.values().length > 0 ? BatchJobStatus.values()[0]: null;
   }
}
