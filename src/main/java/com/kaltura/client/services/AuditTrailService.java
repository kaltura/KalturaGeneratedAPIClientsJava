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
package com.kaltura.client.services;

import com.kaltura.client.Params;
import com.kaltura.client.types.AuditTrail;
import com.kaltura.client.types.AuditTrailFilter;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  Audit Trail service  */
public class AuditTrailService {

	/**  Allows you to add an audit trail object and audit trail content associated with
	  Kaltura object  */
    public static RequestBuilder<AuditTrail> add(AuditTrail auditTrail)  {
        Params kparams = new Params();
        kparams.add("auditTrail", auditTrail);

        return new RequestBuilder<AuditTrail>(AuditTrail.class, "audit_audittrail", "add", kparams);
    }

	/**  Retrieve an audit trail object by id  */
    public static RequestBuilder<AuditTrail> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<AuditTrail>(AuditTrail.class, "audit_audittrail", "get", kparams);
    }

    public static RequestBuilder<ListResponse<AuditTrail>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<AuditTrail>> list(AuditTrailFilter filter)  {
        return list(filter, null);
    }

	/**  List audit trail objects by filter and pager  */
    public static RequestBuilder<ListResponse<AuditTrail>> list(AuditTrailFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<AuditTrail>(AuditTrail.class, "audit_audittrail", "list", kparams);
    }
}
