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
// Copyright (C) 2006-2021  Kaltura Inc.
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

import com.kaltura.client.FileHolder;
import com.kaltura.client.Files;
import com.kaltura.client.enums.DistributionAction;
import com.kaltura.client.types.FilterPager;
import com.kaltura.client.types.GenericDistributionProviderAction;
import com.kaltura.client.types.GenericDistributionProviderActionFilter;
import com.kaltura.client.utils.request.ListResponseRequestBuilder;
import com.kaltura.client.utils.request.NullRequestBuilder;
import com.kaltura.client.utils.request.RequestBuilder;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

/**
 * Generic Distribution Provider Actions service
 * 
 * @param genericDistributionProviderAction 
 * @param id the id of the generic distribution provider action
 * @param xslData XSL MRSS transformation data
 * @param id the id of the generic distribution provider action
 * @param xslFile XSL MRSS transformation file
 * @param id the id of the generic distribution provider action
 * @param xsdData XSD MRSS validatation data
 * @param id the id of the generic distribution provider action
 * @param xsdFile XSD MRSS validatation file
 * @param id the id of the generic distribution provider action
 * @param transformData transformation data xsl, xPath or regex
 * @param id the id of the generic distribution provider action
 * @param transformFile transformation file xsl, xPath or regex
 * @param id 
 * @param genericDistributionProviderId 
 * @param actionType 
 * @param id 
 * @param genericDistributionProviderId 
 * @param actionType 
 * @param filter 
 * @param pager 
 * @param id 
 * @param genericDistributionProviderAction 
 * @param genericDistributionProviderId 
 * @param actionType 
 * @param genericDistributionProviderAction 
 */
public class GenericDistributionProviderActionService {
	
	public static class AddGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddGenericDistributionProviderActionBuilder> {
		
		public AddGenericDistributionProviderActionBuilder(GenericDistributionProviderAction genericDistributionProviderAction) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "add");
			params.add("genericDistributionProviderAction", genericDistributionProviderAction);
		}
	}

	/**
	 * Add new Generic Distribution Provider Action
	 * 
	 * @param genericDistributionProviderAction 
	 */
    public static AddGenericDistributionProviderActionBuilder add(GenericDistributionProviderAction genericDistributionProviderAction)  {
		return new AddGenericDistributionProviderActionBuilder(genericDistributionProviderAction);
	}
	
	public static class AddMrssTransformGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddMrssTransformGenericDistributionProviderActionBuilder> {
		
		public AddMrssTransformGenericDistributionProviderActionBuilder(int id, String xslData) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssTransform");
			params.add("id", id);
			params.add("xslData", xslData);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void xslData(String multirequestToken) {
			params.add("xslData", multirequestToken);
		}
	}

	/**
	 * Add MRSS transform file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param xslData XSL MRSS transformation data
	 */
    public static AddMrssTransformGenericDistributionProviderActionBuilder addMrssTransform(int id, String xslData)  {
		return new AddMrssTransformGenericDistributionProviderActionBuilder(id, xslData);
	}
	
	public static class AddMrssTransformFromFileGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddMrssTransformFromFileGenericDistributionProviderActionBuilder> {
		
		public AddMrssTransformFromFileGenericDistributionProviderActionBuilder(int id, FileHolder xslFile) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssTransformFromFile");
			params.add("id", id);
			files = new Files();
			files.add("xslFile", xslFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static AddMrssTransformFromFileGenericDistributionProviderActionBuilder addMrssTransformFromFile(int id, File xslFile)  {
		return addMrssTransformFromFile(id, new FileHolder(xslFile));
	}

	public static AddMrssTransformFromFileGenericDistributionProviderActionBuilder addMrssTransformFromFile(int id, InputStream xslFile, String xslFileMimeType, String xslFileName, long xslFileSize)  {
		return addMrssTransformFromFile(id, new FileHolder(xslFile, xslFileMimeType, xslFileName, xslFileSize));
	}

	public static AddMrssTransformFromFileGenericDistributionProviderActionBuilder addMrssTransformFromFile(int id, FileInputStream xslFile, String xslFileMimeType, String xslFileName)  {
		return addMrssTransformFromFile(id, new FileHolder(xslFile, xslFileMimeType, xslFileName));
	}

	/**
	 * Add MRSS transform file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param xslFile XSL MRSS transformation file
	 */
    public static AddMrssTransformFromFileGenericDistributionProviderActionBuilder addMrssTransformFromFile(int id, FileHolder xslFile)  {
		return new AddMrssTransformFromFileGenericDistributionProviderActionBuilder(id, xslFile);
	}
	
	public static class AddMrssValidateGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddMrssValidateGenericDistributionProviderActionBuilder> {
		
		public AddMrssValidateGenericDistributionProviderActionBuilder(int id, String xsdData) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssValidate");
			params.add("id", id);
			params.add("xsdData", xsdData);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void xsdData(String multirequestToken) {
			params.add("xsdData", multirequestToken);
		}
	}

	/**
	 * Add MRSS validate file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param xsdData XSD MRSS validatation data
	 */
    public static AddMrssValidateGenericDistributionProviderActionBuilder addMrssValidate(int id, String xsdData)  {
		return new AddMrssValidateGenericDistributionProviderActionBuilder(id, xsdData);
	}
	
	public static class AddMrssValidateFromFileGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddMrssValidateFromFileGenericDistributionProviderActionBuilder> {
		
		public AddMrssValidateFromFileGenericDistributionProviderActionBuilder(int id, FileHolder xsdFile) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addMrssValidateFromFile");
			params.add("id", id);
			files = new Files();
			files.add("xsdFile", xsdFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static AddMrssValidateFromFileGenericDistributionProviderActionBuilder addMrssValidateFromFile(int id, File xsdFile)  {
		return addMrssValidateFromFile(id, new FileHolder(xsdFile));
	}

	public static AddMrssValidateFromFileGenericDistributionProviderActionBuilder addMrssValidateFromFile(int id, InputStream xsdFile, String xsdFileMimeType, String xsdFileName, long xsdFileSize)  {
		return addMrssValidateFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName, xsdFileSize));
	}

	public static AddMrssValidateFromFileGenericDistributionProviderActionBuilder addMrssValidateFromFile(int id, FileInputStream xsdFile, String xsdFileMimeType, String xsdFileName)  {
		return addMrssValidateFromFile(id, new FileHolder(xsdFile, xsdFileMimeType, xsdFileName));
	}

	/**
	 * Add MRSS validate file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param xsdFile XSD MRSS validatation file
	 */
    public static AddMrssValidateFromFileGenericDistributionProviderActionBuilder addMrssValidateFromFile(int id, FileHolder xsdFile)  {
		return new AddMrssValidateFromFileGenericDistributionProviderActionBuilder(id, xsdFile);
	}
	
	public static class AddResultsTransformGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddResultsTransformGenericDistributionProviderActionBuilder> {
		
		public AddResultsTransformGenericDistributionProviderActionBuilder(int id, String transformData) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addResultsTransform");
			params.add("id", id);
			params.add("transformData", transformData);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
		
		public void transformData(String multirequestToken) {
			params.add("transformData", multirequestToken);
		}
	}

	/**
	 * Add results transform file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param transformData transformation data xsl, xPath or regex
	 */
    public static AddResultsTransformGenericDistributionProviderActionBuilder addResultsTransform(int id, String transformData)  {
		return new AddResultsTransformGenericDistributionProviderActionBuilder(id, transformData);
	}
	
	public static class AddResultsTransformFromFileGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, AddResultsTransformFromFileGenericDistributionProviderActionBuilder> {
		
		public AddResultsTransformFromFileGenericDistributionProviderActionBuilder(int id, FileHolder transformFile) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "addResultsTransformFromFile");
			params.add("id", id);
			files = new Files();
			files.add("transformFile", transformFile);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	public static AddResultsTransformFromFileGenericDistributionProviderActionBuilder addResultsTransformFromFile(int id, File transformFile)  {
		return addResultsTransformFromFile(id, new FileHolder(transformFile));
	}

	public static AddResultsTransformFromFileGenericDistributionProviderActionBuilder addResultsTransformFromFile(int id, InputStream transformFile, String transformFileMimeType, String transformFileName, long transformFileSize)  {
		return addResultsTransformFromFile(id, new FileHolder(transformFile, transformFileMimeType, transformFileName, transformFileSize));
	}

	public static AddResultsTransformFromFileGenericDistributionProviderActionBuilder addResultsTransformFromFile(int id, FileInputStream transformFile, String transformFileMimeType, String transformFileName)  {
		return addResultsTransformFromFile(id, new FileHolder(transformFile, transformFileMimeType, transformFileName));
	}

	/**
	 * Add MRSS transform file to generic distribution provider action
	 * 
	 * @param id the id of the generic distribution provider action
	 * @param transformFile transformation file xsl, xPath or regex
	 */
    public static AddResultsTransformFromFileGenericDistributionProviderActionBuilder addResultsTransformFromFile(int id, FileHolder transformFile)  {
		return new AddResultsTransformFromFileGenericDistributionProviderActionBuilder(id, transformFile);
	}
	
	public static class DeleteGenericDistributionProviderActionBuilder extends NullRequestBuilder {
		
		public DeleteGenericDistributionProviderActionBuilder(int id) {
			super("contentdistribution_genericdistributionprovideraction", "delete");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Delete Generic Distribution Provider Action by id
	 * 
	 * @param id 
	 */
    public static DeleteGenericDistributionProviderActionBuilder delete(int id)  {
		return new DeleteGenericDistributionProviderActionBuilder(id);
	}
	
	public static class DeleteByProviderIdGenericDistributionProviderActionBuilder extends NullRequestBuilder {
		
		public DeleteByProviderIdGenericDistributionProviderActionBuilder(int genericDistributionProviderId, DistributionAction actionType) {
			super("contentdistribution_genericdistributionprovideraction", "deleteByProviderId");
			params.add("genericDistributionProviderId", genericDistributionProviderId);
			params.add("actionType", actionType);
		}
		
		public void genericDistributionProviderId(String multirequestToken) {
			params.add("genericDistributionProviderId", multirequestToken);
		}
		
		public void actionType(String multirequestToken) {
			params.add("actionType", multirequestToken);
		}
	}

	/**
	 * Delete Generic Distribution Provider Action by provider id
	 * 
	 * @param genericDistributionProviderId 
	 * @param actionType 
	 */
    public static DeleteByProviderIdGenericDistributionProviderActionBuilder deleteByProviderId(int genericDistributionProviderId, DistributionAction actionType)  {
		return new DeleteByProviderIdGenericDistributionProviderActionBuilder(genericDistributionProviderId, actionType);
	}
	
	public static class GetGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, GetGenericDistributionProviderActionBuilder> {
		
		public GetGenericDistributionProviderActionBuilder(int id) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "get");
			params.add("id", id);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Get Generic Distribution Provider Action by id
	 * 
	 * @param id 
	 */
    public static GetGenericDistributionProviderActionBuilder get(int id)  {
		return new GetGenericDistributionProviderActionBuilder(id);
	}
	
	public static class GetByProviderIdGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, GetByProviderIdGenericDistributionProviderActionBuilder> {
		
		public GetByProviderIdGenericDistributionProviderActionBuilder(int genericDistributionProviderId, DistributionAction actionType) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "getByProviderId");
			params.add("genericDistributionProviderId", genericDistributionProviderId);
			params.add("actionType", actionType);
		}
		
		public void genericDistributionProviderId(String multirequestToken) {
			params.add("genericDistributionProviderId", multirequestToken);
		}
		
		public void actionType(String multirequestToken) {
			params.add("actionType", multirequestToken);
		}
	}

	/**
	 * Get Generic Distribution Provider Action by provider id
	 * 
	 * @param genericDistributionProviderId 
	 * @param actionType 
	 */
    public static GetByProviderIdGenericDistributionProviderActionBuilder getByProviderId(int genericDistributionProviderId, DistributionAction actionType)  {
		return new GetByProviderIdGenericDistributionProviderActionBuilder(genericDistributionProviderId, actionType);
	}
	
	public static class ListGenericDistributionProviderActionBuilder extends ListResponseRequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, ListGenericDistributionProviderActionBuilder> {
		
		public ListGenericDistributionProviderActionBuilder(GenericDistributionProviderActionFilter filter, FilterPager pager) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "list");
			params.add("filter", filter);
			params.add("pager", pager);
		}
	}

	public static ListGenericDistributionProviderActionBuilder list()  {
		return list(null);
	}

	public static ListGenericDistributionProviderActionBuilder list(GenericDistributionProviderActionFilter filter)  {
		return list(filter, null);
	}

	/**
	 * List all distribution providers
	 * 
	 * @param filter 
	 * @param pager 
	 */
    public static ListGenericDistributionProviderActionBuilder list(GenericDistributionProviderActionFilter filter, FilterPager pager)  {
		return new ListGenericDistributionProviderActionBuilder(filter, pager);
	}
	
	public static class UpdateGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, UpdateGenericDistributionProviderActionBuilder> {
		
		public UpdateGenericDistributionProviderActionBuilder(int id, GenericDistributionProviderAction genericDistributionProviderAction) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "update");
			params.add("id", id);
			params.add("genericDistributionProviderAction", genericDistributionProviderAction);
		}
		
		public void id(String multirequestToken) {
			params.add("id", multirequestToken);
		}
	}

	/**
	 * Update Generic Distribution Provider Action by id
	 * 
	 * @param id 
	 * @param genericDistributionProviderAction 
	 */
    public static UpdateGenericDistributionProviderActionBuilder update(int id, GenericDistributionProviderAction genericDistributionProviderAction)  {
		return new UpdateGenericDistributionProviderActionBuilder(id, genericDistributionProviderAction);
	}
	
	public static class UpdateByProviderIdGenericDistributionProviderActionBuilder extends RequestBuilder<GenericDistributionProviderAction, GenericDistributionProviderAction.Tokenizer, UpdateByProviderIdGenericDistributionProviderActionBuilder> {
		
		public UpdateByProviderIdGenericDistributionProviderActionBuilder(int genericDistributionProviderId, DistributionAction actionType, GenericDistributionProviderAction genericDistributionProviderAction) {
			super(GenericDistributionProviderAction.class, "contentdistribution_genericdistributionprovideraction", "updateByProviderId");
			params.add("genericDistributionProviderId", genericDistributionProviderId);
			params.add("actionType", actionType);
			params.add("genericDistributionProviderAction", genericDistributionProviderAction);
		}
		
		public void genericDistributionProviderId(String multirequestToken) {
			params.add("genericDistributionProviderId", multirequestToken);
		}
		
		public void actionType(String multirequestToken) {
			params.add("actionType", multirequestToken);
		}
	}

	/**
	 * Update Generic Distribution Provider Action by provider id
	 * 
	 * @param genericDistributionProviderId 
	 * @param actionType 
	 * @param genericDistributionProviderAction 
	 */
    public static UpdateByProviderIdGenericDistributionProviderActionBuilder updateByProviderId(int genericDistributionProviderId, DistributionAction actionType, GenericDistributionProviderAction genericDistributionProviderAction)  {
		return new UpdateByProviderIdGenericDistributionProviderActionBuilder(genericDistributionProviderId, actionType, genericDistributionProviderAction);
	}
}
