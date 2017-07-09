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
package com.kaltura.client.types;

import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.enums.AuditTrailStatus;
import com.kaltura.client.enums.AuditTrailObjectType;
import com.kaltura.client.enums.AuditTrailAction;
import com.kaltura.client.enums.AuditTrailContext;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public abstract class AuditTrailBaseFilter extends RelatedFilter {

    private Integer idEqual;
    private Integer createdAtGreaterThanOrEqual;
    private Integer createdAtLessThanOrEqual;
    private Integer parsedAtGreaterThanOrEqual;
    private Integer parsedAtLessThanOrEqual;
    private AuditTrailStatus statusEqual;
    private String statusIn;
    private AuditTrailObjectType auditObjectTypeEqual;
    private String auditObjectTypeIn;
    private String objectIdEqual;
    private String objectIdIn;
    private String relatedObjectIdEqual;
    private String relatedObjectIdIn;
    private AuditTrailObjectType relatedObjectTypeEqual;
    private String relatedObjectTypeIn;
    private String entryIdEqual;
    private String entryIdIn;
    private Integer masterPartnerIdEqual;
    private String masterPartnerIdIn;
    private Integer partnerIdEqual;
    private String partnerIdIn;
    private String requestIdEqual;
    private String requestIdIn;
    private String userIdEqual;
    private String userIdIn;
    private AuditTrailAction actionEqual;
    private String actionIn;
    private String ksEqual;
    private AuditTrailContext contextEqual;
    private String contextIn;
    private String entryPointEqual;
    private String entryPointIn;
    private String serverNameEqual;
    private String serverNameIn;
    private String ipAddressEqual;
    private String ipAddressIn;
    private String clientTagEqual;

    // idEqual:
    public Integer getIdEqual(){
        return this.idEqual;
    }
    public void setIdEqual(Integer idEqual){
        this.idEqual = idEqual;
    }

    // createdAtGreaterThanOrEqual:
    public Integer getCreatedAtGreaterThanOrEqual(){
        return this.createdAtGreaterThanOrEqual;
    }
    public void setCreatedAtGreaterThanOrEqual(Integer createdAtGreaterThanOrEqual){
        this.createdAtGreaterThanOrEqual = createdAtGreaterThanOrEqual;
    }

    // createdAtLessThanOrEqual:
    public Integer getCreatedAtLessThanOrEqual(){
        return this.createdAtLessThanOrEqual;
    }
    public void setCreatedAtLessThanOrEqual(Integer createdAtLessThanOrEqual){
        this.createdAtLessThanOrEqual = createdAtLessThanOrEqual;
    }

    // parsedAtGreaterThanOrEqual:
    public Integer getParsedAtGreaterThanOrEqual(){
        return this.parsedAtGreaterThanOrEqual;
    }
    public void setParsedAtGreaterThanOrEqual(Integer parsedAtGreaterThanOrEqual){
        this.parsedAtGreaterThanOrEqual = parsedAtGreaterThanOrEqual;
    }

    // parsedAtLessThanOrEqual:
    public Integer getParsedAtLessThanOrEqual(){
        return this.parsedAtLessThanOrEqual;
    }
    public void setParsedAtLessThanOrEqual(Integer parsedAtLessThanOrEqual){
        this.parsedAtLessThanOrEqual = parsedAtLessThanOrEqual;
    }

    // statusEqual:
    public AuditTrailStatus getStatusEqual(){
        return this.statusEqual;
    }
    public void setStatusEqual(AuditTrailStatus statusEqual){
        this.statusEqual = statusEqual;
    }

    // statusIn:
    public String getStatusIn(){
        return this.statusIn;
    }
    public void setStatusIn(String statusIn){
        this.statusIn = statusIn;
    }

    // auditObjectTypeEqual:
    public AuditTrailObjectType getAuditObjectTypeEqual(){
        return this.auditObjectTypeEqual;
    }
    public void setAuditObjectTypeEqual(AuditTrailObjectType auditObjectTypeEqual){
        this.auditObjectTypeEqual = auditObjectTypeEqual;
    }

    // auditObjectTypeIn:
    public String getAuditObjectTypeIn(){
        return this.auditObjectTypeIn;
    }
    public void setAuditObjectTypeIn(String auditObjectTypeIn){
        this.auditObjectTypeIn = auditObjectTypeIn;
    }

    // objectIdEqual:
    public String getObjectIdEqual(){
        return this.objectIdEqual;
    }
    public void setObjectIdEqual(String objectIdEqual){
        this.objectIdEqual = objectIdEqual;
    }

    // objectIdIn:
    public String getObjectIdIn(){
        return this.objectIdIn;
    }
    public void setObjectIdIn(String objectIdIn){
        this.objectIdIn = objectIdIn;
    }

    // relatedObjectIdEqual:
    public String getRelatedObjectIdEqual(){
        return this.relatedObjectIdEqual;
    }
    public void setRelatedObjectIdEqual(String relatedObjectIdEqual){
        this.relatedObjectIdEqual = relatedObjectIdEqual;
    }

    // relatedObjectIdIn:
    public String getRelatedObjectIdIn(){
        return this.relatedObjectIdIn;
    }
    public void setRelatedObjectIdIn(String relatedObjectIdIn){
        this.relatedObjectIdIn = relatedObjectIdIn;
    }

    // relatedObjectTypeEqual:
    public AuditTrailObjectType getRelatedObjectTypeEqual(){
        return this.relatedObjectTypeEqual;
    }
    public void setRelatedObjectTypeEqual(AuditTrailObjectType relatedObjectTypeEqual){
        this.relatedObjectTypeEqual = relatedObjectTypeEqual;
    }

    // relatedObjectTypeIn:
    public String getRelatedObjectTypeIn(){
        return this.relatedObjectTypeIn;
    }
    public void setRelatedObjectTypeIn(String relatedObjectTypeIn){
        this.relatedObjectTypeIn = relatedObjectTypeIn;
    }

    // entryIdEqual:
    public String getEntryIdEqual(){
        return this.entryIdEqual;
    }
    public void setEntryIdEqual(String entryIdEqual){
        this.entryIdEqual = entryIdEqual;
    }

    // entryIdIn:
    public String getEntryIdIn(){
        return this.entryIdIn;
    }
    public void setEntryIdIn(String entryIdIn){
        this.entryIdIn = entryIdIn;
    }

    // masterPartnerIdEqual:
    public Integer getMasterPartnerIdEqual(){
        return this.masterPartnerIdEqual;
    }
    public void setMasterPartnerIdEqual(Integer masterPartnerIdEqual){
        this.masterPartnerIdEqual = masterPartnerIdEqual;
    }

    // masterPartnerIdIn:
    public String getMasterPartnerIdIn(){
        return this.masterPartnerIdIn;
    }
    public void setMasterPartnerIdIn(String masterPartnerIdIn){
        this.masterPartnerIdIn = masterPartnerIdIn;
    }

    // partnerIdEqual:
    public Integer getPartnerIdEqual(){
        return this.partnerIdEqual;
    }
    public void setPartnerIdEqual(Integer partnerIdEqual){
        this.partnerIdEqual = partnerIdEqual;
    }

    // partnerIdIn:
    public String getPartnerIdIn(){
        return this.partnerIdIn;
    }
    public void setPartnerIdIn(String partnerIdIn){
        this.partnerIdIn = partnerIdIn;
    }

    // requestIdEqual:
    public String getRequestIdEqual(){
        return this.requestIdEqual;
    }
    public void setRequestIdEqual(String requestIdEqual){
        this.requestIdEqual = requestIdEqual;
    }

    // requestIdIn:
    public String getRequestIdIn(){
        return this.requestIdIn;
    }
    public void setRequestIdIn(String requestIdIn){
        this.requestIdIn = requestIdIn;
    }

    // userIdEqual:
    public String getUserIdEqual(){
        return this.userIdEqual;
    }
    public void setUserIdEqual(String userIdEqual){
        this.userIdEqual = userIdEqual;
    }

    // userIdIn:
    public String getUserIdIn(){
        return this.userIdIn;
    }
    public void setUserIdIn(String userIdIn){
        this.userIdIn = userIdIn;
    }

    // actionEqual:
    public AuditTrailAction getActionEqual(){
        return this.actionEqual;
    }
    public void setActionEqual(AuditTrailAction actionEqual){
        this.actionEqual = actionEqual;
    }

    // actionIn:
    public String getActionIn(){
        return this.actionIn;
    }
    public void setActionIn(String actionIn){
        this.actionIn = actionIn;
    }

    // ksEqual:
    public String getKsEqual(){
        return this.ksEqual;
    }
    public void setKsEqual(String ksEqual){
        this.ksEqual = ksEqual;
    }

    // contextEqual:
    public AuditTrailContext getContextEqual(){
        return this.contextEqual;
    }
    public void setContextEqual(AuditTrailContext contextEqual){
        this.contextEqual = contextEqual;
    }

    // contextIn:
    public String getContextIn(){
        return this.contextIn;
    }
    public void setContextIn(String contextIn){
        this.contextIn = contextIn;
    }

    // entryPointEqual:
    public String getEntryPointEqual(){
        return this.entryPointEqual;
    }
    public void setEntryPointEqual(String entryPointEqual){
        this.entryPointEqual = entryPointEqual;
    }

    // entryPointIn:
    public String getEntryPointIn(){
        return this.entryPointIn;
    }
    public void setEntryPointIn(String entryPointIn){
        this.entryPointIn = entryPointIn;
    }

    // serverNameEqual:
    public String getServerNameEqual(){
        return this.serverNameEqual;
    }
    public void setServerNameEqual(String serverNameEqual){
        this.serverNameEqual = serverNameEqual;
    }

    // serverNameIn:
    public String getServerNameIn(){
        return this.serverNameIn;
    }
    public void setServerNameIn(String serverNameIn){
        this.serverNameIn = serverNameIn;
    }

    // ipAddressEqual:
    public String getIpAddressEqual(){
        return this.ipAddressEqual;
    }
    public void setIpAddressEqual(String ipAddressEqual){
        this.ipAddressEqual = ipAddressEqual;
    }

    // ipAddressIn:
    public String getIpAddressIn(){
        return this.ipAddressIn;
    }
    public void setIpAddressIn(String ipAddressIn){
        this.ipAddressIn = ipAddressIn;
    }

    // clientTagEqual:
    public String getClientTagEqual(){
        return this.clientTagEqual;
    }
    public void setClientTagEqual(String clientTagEqual){
        this.clientTagEqual = clientTagEqual;
    }


    public AuditTrailBaseFilter() {
       super();
    }

    public AuditTrailBaseFilter(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        idEqual = GsonParser.parseInt(jsonObject.get("idEqual"));
        createdAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtGreaterThanOrEqual"));
        createdAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("createdAtLessThanOrEqual"));
        parsedAtGreaterThanOrEqual = GsonParser.parseInt(jsonObject.get("parsedAtGreaterThanOrEqual"));
        parsedAtLessThanOrEqual = GsonParser.parseInt(jsonObject.get("parsedAtLessThanOrEqual"));
        statusEqual = AuditTrailStatus.get(GsonParser.parseInt(jsonObject.get("statusEqual")));
        statusIn = GsonParser.parseString(jsonObject.get("statusIn"));
        auditObjectTypeEqual = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("auditObjectTypeEqual")));
        auditObjectTypeIn = GsonParser.parseString(jsonObject.get("auditObjectTypeIn"));
        objectIdEqual = GsonParser.parseString(jsonObject.get("objectIdEqual"));
        objectIdIn = GsonParser.parseString(jsonObject.get("objectIdIn"));
        relatedObjectIdEqual = GsonParser.parseString(jsonObject.get("relatedObjectIdEqual"));
        relatedObjectIdIn = GsonParser.parseString(jsonObject.get("relatedObjectIdIn"));
        relatedObjectTypeEqual = AuditTrailObjectType.get(GsonParser.parseString(jsonObject.get("relatedObjectTypeEqual")));
        relatedObjectTypeIn = GsonParser.parseString(jsonObject.get("relatedObjectTypeIn"));
        entryIdEqual = GsonParser.parseString(jsonObject.get("entryIdEqual"));
        entryIdIn = GsonParser.parseString(jsonObject.get("entryIdIn"));
        masterPartnerIdEqual = GsonParser.parseInt(jsonObject.get("masterPartnerIdEqual"));
        masterPartnerIdIn = GsonParser.parseString(jsonObject.get("masterPartnerIdIn"));
        partnerIdEqual = GsonParser.parseInt(jsonObject.get("partnerIdEqual"));
        partnerIdIn = GsonParser.parseString(jsonObject.get("partnerIdIn"));
        requestIdEqual = GsonParser.parseString(jsonObject.get("requestIdEqual"));
        requestIdIn = GsonParser.parseString(jsonObject.get("requestIdIn"));
        userIdEqual = GsonParser.parseString(jsonObject.get("userIdEqual"));
        userIdIn = GsonParser.parseString(jsonObject.get("userIdIn"));
        actionEqual = AuditTrailAction.get(GsonParser.parseString(jsonObject.get("actionEqual")));
        actionIn = GsonParser.parseString(jsonObject.get("actionIn"));
        ksEqual = GsonParser.parseString(jsonObject.get("ksEqual"));
        contextEqual = AuditTrailContext.get(GsonParser.parseInt(jsonObject.get("contextEqual")));
        contextIn = GsonParser.parseString(jsonObject.get("contextIn"));
        entryPointEqual = GsonParser.parseString(jsonObject.get("entryPointEqual"));
        entryPointIn = GsonParser.parseString(jsonObject.get("entryPointIn"));
        serverNameEqual = GsonParser.parseString(jsonObject.get("serverNameEqual"));
        serverNameIn = GsonParser.parseString(jsonObject.get("serverNameIn"));
        ipAddressEqual = GsonParser.parseString(jsonObject.get("ipAddressEqual"));
        ipAddressIn = GsonParser.parseString(jsonObject.get("ipAddressIn"));
        clientTagEqual = GsonParser.parseString(jsonObject.get("clientTagEqual"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAuditTrailBaseFilter");
        kparams.add("idEqual", this.idEqual);
        kparams.add("createdAtGreaterThanOrEqual", this.createdAtGreaterThanOrEqual);
        kparams.add("createdAtLessThanOrEqual", this.createdAtLessThanOrEqual);
        kparams.add("parsedAtGreaterThanOrEqual", this.parsedAtGreaterThanOrEqual);
        kparams.add("parsedAtLessThanOrEqual", this.parsedAtLessThanOrEqual);
        kparams.add("statusEqual", this.statusEqual);
        kparams.add("statusIn", this.statusIn);
        kparams.add("auditObjectTypeEqual", this.auditObjectTypeEqual);
        kparams.add("auditObjectTypeIn", this.auditObjectTypeIn);
        kparams.add("objectIdEqual", this.objectIdEqual);
        kparams.add("objectIdIn", this.objectIdIn);
        kparams.add("relatedObjectIdEqual", this.relatedObjectIdEqual);
        kparams.add("relatedObjectIdIn", this.relatedObjectIdIn);
        kparams.add("relatedObjectTypeEqual", this.relatedObjectTypeEqual);
        kparams.add("relatedObjectTypeIn", this.relatedObjectTypeIn);
        kparams.add("entryIdEqual", this.entryIdEqual);
        kparams.add("entryIdIn", this.entryIdIn);
        kparams.add("masterPartnerIdEqual", this.masterPartnerIdEqual);
        kparams.add("masterPartnerIdIn", this.masterPartnerIdIn);
        kparams.add("partnerIdEqual", this.partnerIdEqual);
        kparams.add("partnerIdIn", this.partnerIdIn);
        kparams.add("requestIdEqual", this.requestIdEqual);
        kparams.add("requestIdIn", this.requestIdIn);
        kparams.add("userIdEqual", this.userIdEqual);
        kparams.add("userIdIn", this.userIdIn);
        kparams.add("actionEqual", this.actionEqual);
        kparams.add("actionIn", this.actionIn);
        kparams.add("ksEqual", this.ksEqual);
        kparams.add("contextEqual", this.contextEqual);
        kparams.add("contextIn", this.contextIn);
        kparams.add("entryPointEqual", this.entryPointEqual);
        kparams.add("entryPointIn", this.entryPointIn);
        kparams.add("serverNameEqual", this.serverNameEqual);
        kparams.add("serverNameIn", this.serverNameIn);
        kparams.add("ipAddressEqual", this.ipAddressEqual);
        kparams.add("ipAddressIn", this.ipAddressIn);
        kparams.add("clientTagEqual", this.clientTagEqual);
        return kparams;
    }

}

