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
package com.kaltura.client.services;

import com.kaltura.client.enums.SchemaType;
import com.kaltura.client.utils.request.ServeRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Expose the schema definitions for syndication MRSS, bulk upload XML and other
  schema types.
 * 
 * @param type 
 */
public class SchemaService {
	
	public static class ServeSchemaBuilder extends ServeRequestBuilder {
		
		public ServeSchemaBuilder(SchemaType type) {
			super("schema", "serve");
			params.add("type", type);
		}
		
		public void type(String multirequestToken) {
			params.add("type", multirequestToken);
		}
	}

	/**
	 * Serves the requested XSD according to the type and name.
	 * 
	 * @param type 
	 */
    public static ServeSchemaBuilder serve(SchemaType type)  {
		return new ServeSchemaBuilder(type);
	}
}
