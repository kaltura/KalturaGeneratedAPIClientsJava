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
// Copyright (C) 2006-2018  Kaltura Inc.
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

import com.kaltura.client.enums.ReportInterval;
import com.kaltura.client.types.FeatureStatus;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.Partner;
import com.kaltura.client.types.PartnerFilter;
import com.kaltura.client.types.PartnerStatistics;
import com.kaltura.client.types.PartnerUsage;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * partner service allows you to change/manage your partner personal details and
  settings as well
 * 
 * @param filter 
 * @param id 
 * @param partnerId 
 * @param adminEmail 
 * @param cmsPassword 
 * @param year 
 * @param month 
 * @param resolution 
 * @param filter 
 * @param pager 
 * @param partnerFilter 
 * @param pager 
 * @param partner 
 * @param cmsPassword 
 * @param templatePartnerId 
 * @param silent 
 * @param partner 
 * @param allowEmpty 
 */
public class PartnerService {
	
	public static class CountPartnerBuilder extends RequestBuilder<Integer, String, CountPartnerBuilder> {
		
		public CountPartnerBuilder(PartnerFilter filter) {
			super(Integer.class, "partner", "count");
			params.add("filter", filter);
		}
	}

	public static CountPartnerBuilder count()  {
		return count(null);
	}

	/**
	 * Count partner's existing sub-publishers (count includes the partner itself).
	 * 
	 * @param filter 
	 */
    public static CountPartnerBuilder count(PartnerFilter filter)  {
		return new CountPartnerBuilder(filter);
	}
	
	public static class GetPartnerBuilder extends RequestBuilder<Partner, Partner.Tokenizer, GetPartnerBuilder> {
		
		public GetPartnerBuilder(int id) {
			super(Partner.class, "partner", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static GetPartnerBuilder get()  {
		return get(Integer.MIN_VALUE);
	}

	/**
	 * Retrieve partner object by Id
	 * 
	 * @param id 
	 */
    public static GetPartnerBuilder get(int id)  {
		return new GetPartnerBuilder(id);
	}
	
	public static class GetInfoPartnerBuilder extends RequestBuilder<Partner, Partner.Tokenizer, GetInfoPartnerBuilder> {
		
		public GetInfoPartnerBuilder() {
			super(Partner.class, "partner", "getInfo");
		}
	}

	/**
	 * Retrieve all info attributed to the partner   This action expects no parameters.
	  It returns information for the current KS partnerId.
	 */
    public static GetInfoPartnerBuilder getInfo()  {
		return new GetInfoPartnerBuilder();
	}
	
	public static class GetSecretsPartnerBuilder extends RequestBuilder<Partner, Partner.Tokenizer, GetSecretsPartnerBuilder> {
		
		public GetSecretsPartnerBuilder(int partnerId, String adminEmail, String cmsPassword) {
			super(Partner.class, "partner", "getSecrets");
			params.add("partnerId", partnerId);
			params.add("adminEmail", adminEmail);
			params.add("cmsPassword", cmsPassword);
		}
		
		public void partnerId(String multirequestToken) {
			params.add("partnerId", multirequestToken);
		}
		
		public void adminEmail(String multirequestToken) {
			params.add("adminEmail", multirequestToken);
		}
		
		public void cmsPassword(String multirequestToken) {
			params.add("cmsPassword", multirequestToken);
		}
	}

	/**
	 * Retrieve partner secret and admin secret
	 * 
	 * @param partnerId 
	 * @param adminEmail 
	 * @param cmsPassword 
	 */
    public static GetSecretsPartnerBuilder getSecrets(int partnerId, String adminEmail, String cmsPassword)  {
		return new GetSecretsPartnerBuilder(partnerId, adminEmail, cmsPassword);
	}
	
	public static class GetStatisticsPartnerBuilder extends RequestBuilder<PartnerStatistics, PartnerStatistics.Tokenizer, GetStatisticsPartnerBuilder> {
		
		public GetStatisticsPartnerBuilder() {
			super(PartnerStatistics.class, "partner", "getStatistics");
		}
	}

	/**
	 * Get usage statistics for a partner   Calculation is done according to partner's
	  package
	 */
    public static GetStatisticsPartnerBuilder getStatistics()  {
		return new GetStatisticsPartnerBuilder();
	}
	
	public static class GetUsagePartnerBuilder extends RequestBuilder<PartnerUsage, PartnerUsage.Tokenizer, GetUsagePartnerBuilder> {
		
		public GetUsagePartnerBuilder(int year, int month, ReportInterval resolution) {
			super(PartnerUsage.class, "partner", "getUsage");
			params.add("year", year);
			params.add("month", month);
			params.add("resolution", resolution);
		}
		
		public void year(String multirequestToken) {
			params.add("year", multirequestToken);
		}
		
		public void month(String multirequestToken) {
			params.add("month", multirequestToken);
		}
		
		public void resolution(String multirequestToken) {
			params.add("resolution", multirequestToken);
		}
	}

	public static GetUsagePartnerBuilder getUsage()  {
		return getUsage();
	}

	public static GetUsagePartnerBuilder getUsage(int year)  {
		return getUsage(year, 1);
	}

	public static GetUsagePartnerBuilder getUsage(int year, int month)  {
		return getUsage(year, month, null);
	}

	/**
	 * Get usage statistics for a partner   Calculation is done according to partner's
	  package   Additional data returned is a graph points of streaming usage in a
	  time frame   The resolution can be "days" or "months"
	 * 
	 * @param year 
	 * @param month 
	 * @param resolution 
	 */
    public static GetUsagePartnerBuilder getUsage(int year, int month, ReportInterval resolution)  {
		return new GetUsagePartnerBuilder(year, month, resolution);
	}
	
	public static class ListPartnerBuilder extends ListResponseRequestBuilder<Partner, Partner.Tokenizer, ListPartnerBuilder> {
		
		public ListPartnerBuilder(PartnerFilter filter, FilterPager pager) {
			super(Partner.class, "partner", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListPartnerBuilder list()  {
		return list(null);
	}

	public static ListPartnerBuilder list(PartnerFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List partners by filter with paging support   Current implementation will only
	  list the sub partners of the partner initiating the API call (using the current
	  KS).   This action is only partially implemented to support listing sub partners
	  of a VAR partner.
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListPartnerBuilder list(PartnerFilter filter, FilterPager pager)  {
		return new ListPartnerBuilder(filter, pager);
	}
	
	public static class ListFeatureStatusPartnerBuilder extends ListResponseRequestBuilder<FeatureStatus, FeatureStatus.Tokenizer, ListFeatureStatusPartnerBuilder> {
		
		public ListFeatureStatusPartnerBuilder() {
			super(FeatureStatus.class, "partner", "listFeatureStatus");
		}
	}

	/**
	 * List partner's current processes' statuses
	 */
    public static ListFeatureStatusPartnerBuilder listFeatureStatus()  {
		return new ListFeatureStatusPartnerBuilder();
	}
	
	public static class ListPartnersForUserPartnerBuilder extends ListResponseRequestBuilder<Partner, Partner.Tokenizer, ListPartnersForUserPartnerBuilder> {
		
		public ListPartnersForUserPartnerBuilder(PartnerFilter partnerFilter, FilterPager pager) {
			super(Partner.class, "partner", "listPartnersForUser");
			params.add("partnerFilter", partnerFilter);
			params.add("pager", pager);
		}
	}

	public static ListPartnersForUserPartnerBuilder listPartnersForUser()  {
		return listPartnersForUser(null);
	}

	public static ListPartnersForUserPartnerBuilder listPartnersForUser(PartnerFilter partnerFilter)  {
		return listPartnersForUser(partnerFilter, null);
	}

	/**
	 * Retrieve a list of partner objects which the current user is allowed to access.
	 * 
	 * @param partnerFilter 
	 * @param pager 
	 */
    public static ListPartnersForUserPartnerBuilder listPartnersForUser(PartnerFilter partnerFilter, FilterPager pager)  {
		return new ListPartnersForUserPartnerBuilder(partnerFilter, pager);
	}
	
	public static class RegisterPartnerBuilder extends RequestBuilder<Partner, Partner.Tokenizer, RegisterPartnerBuilder> {
		
		public RegisterPartnerBuilder(Partner partner, String cmsPassword, int templatePartnerId, boolean silent) {
			super(Partner.class, "partner", "register");
			params.add("partner", partner);
			params.add("cmsPassword", cmsPassword);
			params.add("templatePartnerId", templatePartnerId);
			params.add("silent", silent);
		}
		
		public void cmsPassword(String multirequestToken) {
			params.add("cmsPassword", multirequestToken);
		}
		
		public void templatePartnerId(String multirequestToken) {
			params.add("templatePartnerId", multirequestToken);
		}
		
		public void silent(String multirequestToken) {
			params.add("silent", multirequestToken);
		}
	}

	public static RegisterPartnerBuilder register(Partner partner)  {
		return register(partner, "");
	}

	public static RegisterPartnerBuilder register(Partner partner, String cmsPassword)  {
		return register(partner, cmsPassword, Integer.MIN_VALUE);
	}

	public static RegisterPartnerBuilder register(Partner partner, String cmsPassword, int templatePartnerId)  {
		return register(partner, cmsPassword, templatePartnerId, false);
	}

	/**
	 * Create a new Partner object
	 * 
	 * @param partner 
	 * @param cmsPassword 
	 * @param templatePartnerId 
	 * @param silent 
	 */
    public static RegisterPartnerBuilder register(Partner partner, String cmsPassword, int templatePartnerId, boolean silent)  {
		return new RegisterPartnerBuilder(partner, cmsPassword, templatePartnerId, silent);
	}
	
	public static class UpdatePartnerBuilder extends RequestBuilder<Partner, Partner.Tokenizer, UpdatePartnerBuilder> {
		
		public UpdatePartnerBuilder(Partner partner, boolean allowEmpty) {
			super(Partner.class, "partner", "update");
			params.add("partner", partner);
			params.add("allowEmpty", allowEmpty);
		}
		
		public void allowEmpty(String multirequestToken) {
			params.add("allowEmpty", multirequestToken);
		}
	}

	public static UpdatePartnerBuilder update(Partner partner)  {
		return update(partner, false);
	}

	/**
	 * Update details and settings of an existing partner
	 * 
	 * @param partner 
	 * @param allowEmpty 
	 */
    public static UpdatePartnerBuilder update(Partner partner, boolean allowEmpty)  {
		return new UpdatePartnerBuilder(partner, allowEmpty);
	}
}
