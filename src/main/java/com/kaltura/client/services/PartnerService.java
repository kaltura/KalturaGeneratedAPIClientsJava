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
import com.kaltura.client.enums.ReportInterval;
import com.kaltura.client.types.FeatureStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.ListResponse;
import com.kaltura.client.types.Partner;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.types.PartnerStatistics;
import com.kaltura.client.types.PartnerUsage;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**  partner service allows you to change/manage your partner personal details and
  settings as well  */
public class PartnerService {

    public static RequestBuilder<Integer> count()  {
        return count(null);
    }

	/**  Count partner's existing sub-publishers (count includes the partner itself).  */
    public static RequestBuilder<Integer> count(PartnerFilter filter)  {
        Params kparams = new Params();
        kparams.add("filter", filter);

        return new RequestBuilder<Integer>(Integer.class, "partner", "count", kparams);
    }

    public static RequestBuilder<Partner> get()  {
        return get(Integer.MIN_VALUE);
    }

	/**  Retrieve partner object by Id  */
    public static RequestBuilder<Partner> get(int id)  {
        Params kparams = new Params();
        kparams.add("id", id);

        return new RequestBuilder<Partner>(Partner.class, "partner", "get", kparams);
    }

	/**  Retrieve all info attributed to the partner   This action expects no parameters.
	  It returns information for the current KS partnerId.  */
    public static RequestBuilder<Partner> getInfo()  {
        Params kparams = new Params();

        return new RequestBuilder<Partner>(Partner.class, "partner", "getInfo", kparams);
    }

	/**  Retrieve partner secret and admin secret  */
    public static RequestBuilder<Partner> getSecrets(int partnerId, String adminEmail, String cmsPassword)  {
        Params kparams = new Params();
        kparams.add("partnerId", partnerId);
        kparams.add("adminEmail", adminEmail);
        kparams.add("cmsPassword", cmsPassword);

        return new RequestBuilder<Partner>(Partner.class, "partner", "getSecrets", kparams);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package  */
    public static RequestBuilder<PartnerStatistics> getStatistics()  {
        Params kparams = new Params();

        return new RequestBuilder<PartnerStatistics>(PartnerStatistics.class, "partner", "getStatistics", kparams);
    }

    public static RequestBuilder<PartnerUsage> getUsage()  {
        return getUsage();
    }

    public static RequestBuilder<PartnerUsage> getUsage(int year)  {
        return getUsage(year, 1);
    }

    public static RequestBuilder<PartnerUsage> getUsage(int year, int month)  {
        return getUsage(year, month, null);
    }

	/**  Get usage statistics for a partner   Calculation is done according to partner's
	  package   Additional data returned is a graph points of streaming usage in a
	  timeframe   The resolution can be "days" or "months"  */
    public static RequestBuilder<PartnerUsage> getUsage(int year, int month, ReportInterval resolution)  {
        Params kparams = new Params();
        kparams.add("year", year);
        kparams.add("month", month);
        kparams.add("resolution", resolution);

        return new RequestBuilder<PartnerUsage>(PartnerUsage.class, "partner", "getUsage", kparams);
    }

    public static RequestBuilder<ListResponse<Partner>> list()  {
        return list(null);
    }

    public static RequestBuilder<ListResponse<Partner>> list(PartnerFilter filter)  {
        return list(filter, null);
    }

	/**  List partners by filter with paging support   Current implementation will only
	  list the sub partners of the partner initiating the api call (using the current
	  KS).   This action is only partially implemented to support listing sub partners
	  of a VAR partner.  */
    public static RequestBuilder<ListResponse<Partner>> list(PartnerFilter filter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("filter", filter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Partner>(Partner.class, "partner", "list", kparams);
    }

	/**  List partner's current processes' statuses  */
    public static RequestBuilder<ListResponse<FeatureStatus>> listFeatureStatus()  {
        Params kparams = new Params();

        return new ListResponseRequestBuilder<FeatureStatus>(FeatureStatus.class, "partner", "listFeatureStatus", kparams);
    }

    public static RequestBuilder<ListResponse<Partner>> listPartnersForUser()  {
        return listPartnersForUser(null);
    }

    public static RequestBuilder<ListResponse<Partner>> listPartnersForUser(PartnerFilter partnerFilter)  {
        return listPartnersForUser(partnerFilter, null);
    }

	/**  Retrieve a list of partner objects which the current user is allowed to access.  */
    public static RequestBuilder<ListResponse<Partner>> listPartnersForUser(PartnerFilter partnerFilter, FilterPager pager)  {
        Params kparams = new Params();
        kparams.add("partnerFilter", partnerFilter);
        kparams.add("pager", pager);

        return new ListResponseRequestBuilder<Partner>(Partner.class, "partner", "listPartnersForUser", kparams);
    }

    public static RequestBuilder<Partner> register(Partner partner)  {
        return register(partner, "");
    }

    public static RequestBuilder<Partner> register(Partner partner, String cmsPassword)  {
        return register(partner, cmsPassword, Integer.MIN_VALUE);
    }

    public static RequestBuilder<Partner> register(Partner partner, String cmsPassword, int templatePartnerId)  {
        return register(partner, cmsPassword, templatePartnerId, false);
    }

	/**  Create a new Partner object  */
    public static RequestBuilder<Partner> register(Partner partner, String cmsPassword, int templatePartnerId, boolean silent)  {
        Params kparams = new Params();
        kparams.add("partner", partner);
        kparams.add("cmsPassword", cmsPassword);
        kparams.add("templatePartnerId", templatePartnerId);
        kparams.add("silent", silent);

        return new RequestBuilder<Partner>(Partner.class, "partner", "register", kparams);
    }

    public static RequestBuilder<Partner> update(Partner partner)  {
        return update(partner, false);
    }

	/**  Update details and settings of an existing partner  */
    public static RequestBuilder<Partner> update(Partner partner, boolean allowEmpty)  {
        Params kparams = new Params();
        kparams.add("partner", partner);
        kparams.add("allowEmpty", allowEmpty);

        return new RequestBuilder<Partner>(Partner.class, "partner", "update", kparams);
    }
}
