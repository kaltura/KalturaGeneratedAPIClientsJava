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
// Copyright (C) 2006-2022  Kaltura Inc.
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

import com.kaltura.client.types.AuditTrail;
import com.kaltura.client.types.AuditTrailFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * The Audit Trail service allows you to keep track of changes made to various
  Kaltura objects.   This service is disabled by default.
 * 
 * @param auditTrail 
 * @param id 
 * @param filter 
 * @param pager 
 */
public class AuditTrailService {
	
	public static class AddAuditTrailBuilder extends RequestBuilder<AuditTrail, AuditTrail.Tokenizer, AddAuditTrailBuilder> {
		
		public AddAuditTrailBuilder(AuditTrail auditTrail) {
			super(AuditTrail.class, "audit_audittrail", "add");
			params.add("auditTrail", auditTrail);
		}
	}

	/**
	 * Allows you to add an audit trail object and audit trail content associated with
	  Kaltura object
	 * 
	 * @param auditTrail 
	 */
    public static AddAuditTrailBuilder add(AuditTrail auditTrail)  {
		return new AddAuditTrailBuilder(auditTrail);
	}
	
	public static class GetAuditTrailBuilder extends RequestBuilder<AuditTrail, AuditTrail.Tokenizer, GetAuditTrailBuilder> {
		
		public GetAuditTrailBuilder(int id) {
			super(AuditTrail.class, "audit_audittrail", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Retrieve an audit trail object by id
	 * 
	 * @param id 
	 */
    public static GetAuditTrailBuilder get(int id)  {
		return new GetAuditTrailBuilder(id);
	}
	
	public static class ListAuditTrailBuilder extends ListResponseRequestBuilder<AuditTrail, AuditTrail.Tokenizer, ListAuditTrailBuilder> {
		
		public ListAuditTrailBuilder(AuditTrailFilter filter, FilterPager pager) {
			super(AuditTrail.class, "audit_audittrail", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListAuditTrailBuilder list()  {
		return list(null);
	}

	public static ListAuditTrailBuilder list(AuditTrailFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List audit trail objects by filter and pager
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListAuditTrailBuilder list(AuditTrailFilter filter, FilterPager pager)  {
		return new ListAuditTrailBuilder(filter, pager);
	}
}
