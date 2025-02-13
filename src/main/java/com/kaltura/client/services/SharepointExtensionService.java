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
package com.kaltura.client.services;

import com.kaltura.client.types.UiConf;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Kaltura Sharepoint Extension Service
 * 
 * @param serverMajor 
 * @param serverMinor 
 * @param serverBuild 
 */
public class SharepointExtensionService {
	
	public static class IsVersionSupportedSharepointExtensionBuilder extends RequestBuilder<Boolean, String, IsVersionSupportedSharepointExtensionBuilder> {
		
		public IsVersionSupportedSharepointExtensionBuilder(int serverMajor, int serverMinor, int serverBuild) {
			super(Boolean.class, "kalturasharepointextension_sharepointextension", "isVersionSupported");
			params.add("serverMajor", serverMajor);
			params.add("serverMinor", serverMinor);
			params.add("serverBuild", serverBuild);
		}
		
		public void serverMajor(String multirequestToken) {
			params.add("serverMajor", multirequestToken);
		}
		
		public void serverMinor(String multirequestToken) {
			params.add("serverMinor", multirequestToken);
		}
		
		public void serverBuild(String multirequestToken) {
			params.add("serverBuild", multirequestToken);
		}
	}

	/**
	 * Is this Kaltura-Sharepoint-Server-Plugin supports minimum version of
	  $major.$minor.$build (which is required by the extension)
	 * 
	 * @param serverMajor 
	 * @param serverMinor 
	 * @param serverBuild 
	 */
    public static IsVersionSupportedSharepointExtensionBuilder isVersionSupported(int serverMajor, int serverMinor, int serverBuild)  {
		return new IsVersionSupportedSharepointExtensionBuilder(serverMajor, serverMinor, serverBuild);
	}
	
	public static class ListUiconfsSharepointExtensionBuilder extends ListResponseRequestBuilder<UiConf, UiConf.Tokenizer, ListUiconfsSharepointExtensionBuilder> {
		
		public ListUiconfsSharepointExtensionBuilder() {
			super(UiConf.class, "kalturasharepointextension_sharepointextension", "listUiconfs");
		}
	}

	/**
	 * list uiconfs for sharepoint extension
	 */
    public static ListUiconfsSharepointExtensionBuilder listUiconfs()  {
		return new ListUiconfsSharepointExtensionBuilder();
	}
}
