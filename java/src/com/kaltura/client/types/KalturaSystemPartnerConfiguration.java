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
// Copyright (C) 2006-2015  Kaltura Inc.
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

import org.w3c.dom.Element;
import com.kaltura.client.KalturaParams;
import com.kaltura.client.KalturaApiException;
import com.kaltura.client.KalturaObjectBase;
import com.kaltura.client.enums.KalturaStorageServePriority;
import com.kaltura.client.enums.KalturaPartnerGroupType;
import com.kaltura.client.enums.KalturaSourceType;
import com.kaltura.client.enums.KalturaLanguageCode;
import java.util.ArrayList;
import com.kaltura.client.utils.ParseUtils;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;


/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Fri, 20 Mar 15 00:20:31 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaSystemPartnerConfiguration extends KalturaObjectBase {
    public int id = Integer.MIN_VALUE;
    public String partnerName;
    public String description;
    public String adminName;
    public String adminEmail;
    public String host;
    public String cdnHost;
    public String thumbnailHost;
    public int partnerPackage = Integer.MIN_VALUE;
    public int monitorUsage = Integer.MIN_VALUE;
    public boolean moderateContent;
    public boolean storageDeleteFromKaltura;
    public KalturaStorageServePriority storageServePriority;
    public int kmcVersion = Integer.MIN_VALUE;
    public int restrictThumbnailByKs = Integer.MIN_VALUE;
    public boolean supportAnimatedThumbnails;
    public int defThumbOffset = Integer.MIN_VALUE;
    public int defThumbDensity = Integer.MIN_VALUE;
    public int userSessionRoleId = Integer.MIN_VALUE;
    public int adminSessionRoleId = Integer.MIN_VALUE;
    public String alwaysAllowedPermissionNames;
    public boolean importRemoteSourceForConvert;
    public ArrayList<KalturaPermission> permissions;
    public String notificationsConfig;
    public boolean allowMultiNotification;
    public int loginBlockPeriod = Integer.MIN_VALUE;
    public int numPrevPassToKeep = Integer.MIN_VALUE;
    public int passReplaceFreq = Integer.MIN_VALUE;
    public boolean isFirstLogin;
    public KalturaPartnerGroupType partnerGroupType;
    public int partnerParentId = Integer.MIN_VALUE;
    public ArrayList<KalturaSystemPartnerLimit> limits;
	/**  http/rtmp/hdnetwork     */
    public String streamerType;
	/**  http/https, rtmp/rtmpe     */
    public String mediaProtocol;
    public String extendedFreeTrailExpiryReason;
	/**  Unix timestamp (In seconds)     */
    public int extendedFreeTrailExpiryDate = Integer.MIN_VALUE;
    public int extendedFreeTrail = Integer.MIN_VALUE;
    public String crmId;
    public String referenceId;
    public String crmLink;
    public String verticalClasiffication;
    public String partnerPackageClassOfService;
    public boolean enableBulkUploadNotificationsEmails;
    public String deliveryProfileIds;
    public boolean enforceDelivery;
    public String bulkUploadNotificationsEmail;
    public boolean internalUse;
    public KalturaSourceType defaultLiveStreamEntrySourceType;
    public String liveStreamProvisionParams;
    public KalturaBaseEntryFilter autoModerateEntryFilter;
    public String logoutUrl;
    public boolean defaultEntitlementEnforcement;
    public int cacheFlavorVersion = Integer.MIN_VALUE;
    public int apiAccessControlId = Integer.MIN_VALUE;
    public String defaultDeliveryType;
    public String defaultEmbedCodeType;
    public ArrayList<KalturaKeyBooleanValue> customDeliveryTypes;
    public boolean restrictEntryByMetadata;
    public KalturaLanguageCode language;
    public String audioThumbEntryId;
    public String liveThumbEntryId;

    public KalturaSystemPartnerConfiguration() {
    }

    public KalturaSystemPartnerConfiguration(Element node) throws KalturaApiException {
        NodeList childNodes = node.getChildNodes();
        for (int i = 0; i < childNodes.getLength(); i++) {
            Node aNode = childNodes.item(i);
            String nodeName = aNode.getNodeName();
            String txt = aNode.getTextContent();
            if (nodeName.equals("id")) {
                this.id = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("partnerName")) {
                this.partnerName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("description")) {
                this.description = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("adminName")) {
                this.adminName = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("adminEmail")) {
                this.adminEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("host")) {
                this.host = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("cdnHost")) {
                this.cdnHost = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("thumbnailHost")) {
                this.thumbnailHost = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerPackage")) {
                this.partnerPackage = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("monitorUsage")) {
                this.monitorUsage = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("moderateContent")) {
                this.moderateContent = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("storageDeleteFromKaltura")) {
                this.storageDeleteFromKaltura = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("storageServePriority")) {
                this.storageServePriority = KalturaStorageServePriority.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("kmcVersion")) {
                this.kmcVersion = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("restrictThumbnailByKs")) {
                this.restrictThumbnailByKs = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("supportAnimatedThumbnails")) {
                this.supportAnimatedThumbnails = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("defThumbOffset")) {
                this.defThumbOffset = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("defThumbDensity")) {
                this.defThumbDensity = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("userSessionRoleId")) {
                this.userSessionRoleId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("adminSessionRoleId")) {
                this.adminSessionRoleId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("alwaysAllowedPermissionNames")) {
                this.alwaysAllowedPermissionNames = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("importRemoteSourceForConvert")) {
                this.importRemoteSourceForConvert = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("permissions")) {
                this.permissions = ParseUtils.parseArray(KalturaPermission.class, aNode);
                continue;
            } else if (nodeName.equals("notificationsConfig")) {
                this.notificationsConfig = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("allowMultiNotification")) {
                this.allowMultiNotification = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("loginBlockPeriod")) {
                this.loginBlockPeriod = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("numPrevPassToKeep")) {
                this.numPrevPassToKeep = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("passReplaceFreq")) {
                this.passReplaceFreq = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("isFirstLogin")) {
                this.isFirstLogin = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("partnerGroupType")) {
                this.partnerGroupType = KalturaPartnerGroupType.get(ParseUtils.parseInt(txt));
                continue;
            } else if (nodeName.equals("partnerParentId")) {
                this.partnerParentId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("limits")) {
                this.limits = ParseUtils.parseArray(KalturaSystemPartnerLimit.class, aNode);
                continue;
            } else if (nodeName.equals("streamerType")) {
                this.streamerType = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("mediaProtocol")) {
                this.mediaProtocol = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("extendedFreeTrailExpiryReason")) {
                this.extendedFreeTrailExpiryReason = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("extendedFreeTrailExpiryDate")) {
                this.extendedFreeTrailExpiryDate = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("extendedFreeTrail")) {
                this.extendedFreeTrail = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("crmId")) {
                this.crmId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("referenceId")) {
                this.referenceId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("crmLink")) {
                this.crmLink = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("verticalClasiffication")) {
                this.verticalClasiffication = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("partnerPackageClassOfService")) {
                this.partnerPackageClassOfService = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("enableBulkUploadNotificationsEmails")) {
                this.enableBulkUploadNotificationsEmails = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("deliveryProfileIds")) {
                this.deliveryProfileIds = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("enforceDelivery")) {
                this.enforceDelivery = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("bulkUploadNotificationsEmail")) {
                this.bulkUploadNotificationsEmail = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("internalUse")) {
                this.internalUse = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("defaultLiveStreamEntrySourceType")) {
                this.defaultLiveStreamEntrySourceType = KalturaSourceType.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("liveStreamProvisionParams")) {
                this.liveStreamProvisionParams = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("autoModerateEntryFilter")) {
                this.autoModerateEntryFilter = ParseUtils.parseObject(KalturaBaseEntryFilter.class, aNode);
                continue;
            } else if (nodeName.equals("logoutUrl")) {
                this.logoutUrl = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("defaultEntitlementEnforcement")) {
                this.defaultEntitlementEnforcement = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("cacheFlavorVersion")) {
                this.cacheFlavorVersion = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("apiAccessControlId")) {
                this.apiAccessControlId = ParseUtils.parseInt(txt);
                continue;
            } else if (nodeName.equals("defaultDeliveryType")) {
                this.defaultDeliveryType = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("defaultEmbedCodeType")) {
                this.defaultEmbedCodeType = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("customDeliveryTypes")) {
                this.customDeliveryTypes = ParseUtils.parseArray(KalturaKeyBooleanValue.class, aNode);
                continue;
            } else if (nodeName.equals("restrictEntryByMetadata")) {
                this.restrictEntryByMetadata = ParseUtils.parseBool(txt);
                continue;
            } else if (nodeName.equals("language")) {
                this.language = KalturaLanguageCode.get(ParseUtils.parseString(txt));
                continue;
            } else if (nodeName.equals("audioThumbEntryId")) {
                this.audioThumbEntryId = ParseUtils.parseString(txt);
                continue;
            } else if (nodeName.equals("liveThumbEntryId")) {
                this.liveThumbEntryId = ParseUtils.parseString(txt);
                continue;
            } 
        }
    }

    public KalturaParams toParams() {
        KalturaParams kparams = super.toParams();
        kparams.add("objectType", "KalturaSystemPartnerConfiguration");
        kparams.add("partnerName", this.partnerName);
        kparams.add("description", this.description);
        kparams.add("adminName", this.adminName);
        kparams.add("adminEmail", this.adminEmail);
        kparams.add("host", this.host);
        kparams.add("cdnHost", this.cdnHost);
        kparams.add("thumbnailHost", this.thumbnailHost);
        kparams.add("partnerPackage", this.partnerPackage);
        kparams.add("monitorUsage", this.monitorUsage);
        kparams.add("moderateContent", this.moderateContent);
        kparams.add("storageDeleteFromKaltura", this.storageDeleteFromKaltura);
        kparams.add("storageServePriority", this.storageServePriority);
        kparams.add("kmcVersion", this.kmcVersion);
        kparams.add("restrictThumbnailByKs", this.restrictThumbnailByKs);
        kparams.add("supportAnimatedThumbnails", this.supportAnimatedThumbnails);
        kparams.add("defThumbOffset", this.defThumbOffset);
        kparams.add("defThumbDensity", this.defThumbDensity);
        kparams.add("userSessionRoleId", this.userSessionRoleId);
        kparams.add("adminSessionRoleId", this.adminSessionRoleId);
        kparams.add("alwaysAllowedPermissionNames", this.alwaysAllowedPermissionNames);
        kparams.add("importRemoteSourceForConvert", this.importRemoteSourceForConvert);
        kparams.add("permissions", this.permissions);
        kparams.add("notificationsConfig", this.notificationsConfig);
        kparams.add("allowMultiNotification", this.allowMultiNotification);
        kparams.add("loginBlockPeriod", this.loginBlockPeriod);
        kparams.add("numPrevPassToKeep", this.numPrevPassToKeep);
        kparams.add("passReplaceFreq", this.passReplaceFreq);
        kparams.add("isFirstLogin", this.isFirstLogin);
        kparams.add("partnerGroupType", this.partnerGroupType);
        kparams.add("partnerParentId", this.partnerParentId);
        kparams.add("limits", this.limits);
        kparams.add("streamerType", this.streamerType);
        kparams.add("mediaProtocol", this.mediaProtocol);
        kparams.add("extendedFreeTrailExpiryReason", this.extendedFreeTrailExpiryReason);
        kparams.add("extendedFreeTrailExpiryDate", this.extendedFreeTrailExpiryDate);
        kparams.add("extendedFreeTrail", this.extendedFreeTrail);
        kparams.add("crmId", this.crmId);
        kparams.add("referenceId", this.referenceId);
        kparams.add("crmLink", this.crmLink);
        kparams.add("verticalClasiffication", this.verticalClasiffication);
        kparams.add("partnerPackageClassOfService", this.partnerPackageClassOfService);
        kparams.add("enableBulkUploadNotificationsEmails", this.enableBulkUploadNotificationsEmails);
        kparams.add("deliveryProfileIds", this.deliveryProfileIds);
        kparams.add("enforceDelivery", this.enforceDelivery);
        kparams.add("bulkUploadNotificationsEmail", this.bulkUploadNotificationsEmail);
        kparams.add("internalUse", this.internalUse);
        kparams.add("defaultLiveStreamEntrySourceType", this.defaultLiveStreamEntrySourceType);
        kparams.add("liveStreamProvisionParams", this.liveStreamProvisionParams);
        kparams.add("autoModerateEntryFilter", this.autoModerateEntryFilter);
        kparams.add("logoutUrl", this.logoutUrl);
        kparams.add("defaultEntitlementEnforcement", this.defaultEntitlementEnforcement);
        kparams.add("cacheFlavorVersion", this.cacheFlavorVersion);
        kparams.add("apiAccessControlId", this.apiAccessControlId);
        kparams.add("defaultDeliveryType", this.defaultDeliveryType);
        kparams.add("defaultEmbedCodeType", this.defaultEmbedCodeType);
        kparams.add("customDeliveryTypes", this.customDeliveryTypes);
        kparams.add("restrictEntryByMetadata", this.restrictEntryByMetadata);
        kparams.add("language", this.language);
        kparams.add("audioThumbEntryId", this.audioThumbEntryId);
        kparams.add("liveThumbEntryId", this.liveThumbEntryId);
        return kparams;
    }

}

