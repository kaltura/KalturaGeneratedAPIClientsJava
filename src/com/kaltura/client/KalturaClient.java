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
package com.kaltura.client;
import com.kaltura.client.services.KalturaAccessControlProfileService;
import com.kaltura.client.services.KalturaAccessControlService;
import com.kaltura.client.services.KalturaAdminUserService;
import com.kaltura.client.services.KalturaBaseEntryService;
import com.kaltura.client.services.KalturaBulkUploadService;
import com.kaltura.client.services.KalturaCategoryEntryService;
import com.kaltura.client.services.KalturaCategoryService;
import com.kaltura.client.services.KalturaCategoryUserService;
import com.kaltura.client.services.KalturaConversionProfileAssetParamsService;
import com.kaltura.client.services.KalturaConversionProfileService;
import com.kaltura.client.services.KalturaDataService;
import com.kaltura.client.services.KalturaDeliveryProfileService;
import com.kaltura.client.services.KalturaDocumentService;
import com.kaltura.client.services.KalturaEmailIngestionProfileService;
import com.kaltura.client.services.KalturaFileAssetService;
import com.kaltura.client.services.KalturaFlavorAssetService;
import com.kaltura.client.services.KalturaFlavorParamsOutputService;
import com.kaltura.client.services.KalturaFlavorParamsService;
import com.kaltura.client.services.KalturaGroupUserService;
import com.kaltura.client.services.KalturaLiveChannelSegmentService;
import com.kaltura.client.services.KalturaLiveChannelService;
import com.kaltura.client.services.KalturaLiveReportsService;
import com.kaltura.client.services.KalturaLiveStatsService;
import com.kaltura.client.services.KalturaLiveStreamService;
import com.kaltura.client.services.KalturaMediaInfoService;
import com.kaltura.client.services.KalturaMediaServerService;
import com.kaltura.client.services.KalturaMediaService;
import com.kaltura.client.services.KalturaMixingService;
import com.kaltura.client.services.KalturaNotificationService;
import com.kaltura.client.services.KalturaPartnerService;
import com.kaltura.client.services.KalturaPermissionItemService;
import com.kaltura.client.services.KalturaPermissionService;
import com.kaltura.client.services.KalturaPlaylistService;
import com.kaltura.client.services.KalturaReportService;
import com.kaltura.client.services.KalturaResponseProfileService;
import com.kaltura.client.services.KalturaSchemaService;
import com.kaltura.client.services.KalturaSearchService;
import com.kaltura.client.services.KalturaSessionService;
import com.kaltura.client.services.KalturaStatsService;
import com.kaltura.client.services.KalturaStorageProfileService;
import com.kaltura.client.services.KalturaSyndicationFeedService;
import com.kaltura.client.services.KalturaSystemService;
import com.kaltura.client.services.KalturaThumbAssetService;
import com.kaltura.client.services.KalturaThumbParamsOutputService;
import com.kaltura.client.services.KalturaThumbParamsService;
import com.kaltura.client.services.KalturaUiConfService;
import com.kaltura.client.services.KalturaUploadService;
import com.kaltura.client.services.KalturaUploadTokenService;
import com.kaltura.client.services.KalturaUserRoleService;
import com.kaltura.client.services.KalturaUserService;
import com.kaltura.client.services.KalturaWidgetService;
import com.kaltura.client.services.KalturaXInternalService;
import com.kaltura.client.services.KalturaMetadataService;
import com.kaltura.client.services.KalturaMetadataProfileService;
import com.kaltura.client.services.KalturaDocumentsService;
import com.kaltura.client.services.KalturaSystemPartnerService;
import com.kaltura.client.services.KalturaEntryAdminService;
import com.kaltura.client.services.KalturaUiConfAdminService;
import com.kaltura.client.services.KalturaReportAdminService;
import com.kaltura.client.services.KalturaKalturaInternalToolsSystemHelperService;
import com.kaltura.client.services.KalturaVirusScanProfileService;
import com.kaltura.client.services.KalturaDistributionProfileService;
import com.kaltura.client.services.KalturaEntryDistributionService;
import com.kaltura.client.services.KalturaDistributionProviderService;
import com.kaltura.client.services.KalturaGenericDistributionProviderService;
import com.kaltura.client.services.KalturaGenericDistributionProviderActionService;
import com.kaltura.client.services.KalturaCuePointService;
import com.kaltura.client.services.KalturaAnnotationService;
import com.kaltura.client.services.KalturaShortLinkService;
import com.kaltura.client.services.KalturaBulkService;
import com.kaltura.client.services.KalturaDropFolderService;
import com.kaltura.client.services.KalturaDropFolderFileService;
import com.kaltura.client.services.KalturaCaptionAssetService;
import com.kaltura.client.services.KalturaCaptionParamsService;
import com.kaltura.client.services.KalturaCaptionAssetItemService;
import com.kaltura.client.services.KalturaAttachmentAssetService;
import com.kaltura.client.services.KalturaTagService;
import com.kaltura.client.services.KalturaLikeService;
import com.kaltura.client.services.KalturaVarConsoleService;
import com.kaltura.client.services.KalturaEventNotificationTemplateService;
import com.kaltura.client.services.KalturaExternalMediaService;
import com.kaltura.client.services.KalturaScheduledTaskProfileService;
import com.kaltura.client.types.KalturaBaseResponseProfile;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * @date Tue, 28 Apr 15 00:19:49 -0400
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class KalturaClient extends KalturaClientBase {
	
	public KalturaClient(KalturaConfiguration config) {
		super(config);
		
		this.setClientTag("java:15-04-28");
		this.setApiVersion("3.2.0");
	}
	
	protected KalturaAccessControlProfileService accessControlProfileService;
	public KalturaAccessControlProfileService getAccessControlProfileService() {
		if(this.accessControlProfileService == null)
			this.accessControlProfileService = new KalturaAccessControlProfileService(this);
	
		return this.accessControlProfileService;
	}
	
	protected KalturaAccessControlService accessControlService;
	public KalturaAccessControlService getAccessControlService() {
		if(this.accessControlService == null)
			this.accessControlService = new KalturaAccessControlService(this);
	
		return this.accessControlService;
	}
	
	protected KalturaAdminUserService adminUserService;
	public KalturaAdminUserService getAdminUserService() {
		if(this.adminUserService == null)
			this.adminUserService = new KalturaAdminUserService(this);
	
		return this.adminUserService;
	}
	
	protected KalturaBaseEntryService baseEntryService;
	public KalturaBaseEntryService getBaseEntryService() {
		if(this.baseEntryService == null)
			this.baseEntryService = new KalturaBaseEntryService(this);
	
		return this.baseEntryService;
	}
	
	protected KalturaBulkUploadService bulkUploadService;
	public KalturaBulkUploadService getBulkUploadService() {
		if(this.bulkUploadService == null)
			this.bulkUploadService = new KalturaBulkUploadService(this);
	
		return this.bulkUploadService;
	}
	
	protected KalturaCategoryEntryService categoryEntryService;
	public KalturaCategoryEntryService getCategoryEntryService() {
		if(this.categoryEntryService == null)
			this.categoryEntryService = new KalturaCategoryEntryService(this);
	
		return this.categoryEntryService;
	}
	
	protected KalturaCategoryService categoryService;
	public KalturaCategoryService getCategoryService() {
		if(this.categoryService == null)
			this.categoryService = new KalturaCategoryService(this);
	
		return this.categoryService;
	}
	
	protected KalturaCategoryUserService categoryUserService;
	public KalturaCategoryUserService getCategoryUserService() {
		if(this.categoryUserService == null)
			this.categoryUserService = new KalturaCategoryUserService(this);
	
		return this.categoryUserService;
	}
	
	protected KalturaConversionProfileAssetParamsService conversionProfileAssetParamsService;
	public KalturaConversionProfileAssetParamsService getConversionProfileAssetParamsService() {
		if(this.conversionProfileAssetParamsService == null)
			this.conversionProfileAssetParamsService = new KalturaConversionProfileAssetParamsService(this);
	
		return this.conversionProfileAssetParamsService;
	}
	
	protected KalturaConversionProfileService conversionProfileService;
	public KalturaConversionProfileService getConversionProfileService() {
		if(this.conversionProfileService == null)
			this.conversionProfileService = new KalturaConversionProfileService(this);
	
		return this.conversionProfileService;
	}
	
	protected KalturaDataService dataService;
	public KalturaDataService getDataService() {
		if(this.dataService == null)
			this.dataService = new KalturaDataService(this);
	
		return this.dataService;
	}
	
	protected KalturaDeliveryProfileService deliveryProfileService;
	public KalturaDeliveryProfileService getDeliveryProfileService() {
		if(this.deliveryProfileService == null)
			this.deliveryProfileService = new KalturaDeliveryProfileService(this);
	
		return this.deliveryProfileService;
	}
	
	protected KalturaDocumentService documentService;
	public KalturaDocumentService getDocumentService() {
		if(this.documentService == null)
			this.documentService = new KalturaDocumentService(this);
	
		return this.documentService;
	}
	
	protected KalturaEmailIngestionProfileService EmailIngestionProfileService;
	public KalturaEmailIngestionProfileService getEmailIngestionProfileService() {
		if(this.EmailIngestionProfileService == null)
			this.EmailIngestionProfileService = new KalturaEmailIngestionProfileService(this);
	
		return this.EmailIngestionProfileService;
	}
	
	protected KalturaFileAssetService fileAssetService;
	public KalturaFileAssetService getFileAssetService() {
		if(this.fileAssetService == null)
			this.fileAssetService = new KalturaFileAssetService(this);
	
		return this.fileAssetService;
	}
	
	protected KalturaFlavorAssetService flavorAssetService;
	public KalturaFlavorAssetService getFlavorAssetService() {
		if(this.flavorAssetService == null)
			this.flavorAssetService = new KalturaFlavorAssetService(this);
	
		return this.flavorAssetService;
	}
	
	protected KalturaFlavorParamsOutputService flavorParamsOutputService;
	public KalturaFlavorParamsOutputService getFlavorParamsOutputService() {
		if(this.flavorParamsOutputService == null)
			this.flavorParamsOutputService = new KalturaFlavorParamsOutputService(this);
	
		return this.flavorParamsOutputService;
	}
	
	protected KalturaFlavorParamsService flavorParamsService;
	public KalturaFlavorParamsService getFlavorParamsService() {
		if(this.flavorParamsService == null)
			this.flavorParamsService = new KalturaFlavorParamsService(this);
	
		return this.flavorParamsService;
	}
	
	protected KalturaGroupUserService groupUserService;
	public KalturaGroupUserService getGroupUserService() {
		if(this.groupUserService == null)
			this.groupUserService = new KalturaGroupUserService(this);
	
		return this.groupUserService;
	}
	
	protected KalturaLiveChannelSegmentService liveChannelSegmentService;
	public KalturaLiveChannelSegmentService getLiveChannelSegmentService() {
		if(this.liveChannelSegmentService == null)
			this.liveChannelSegmentService = new KalturaLiveChannelSegmentService(this);
	
		return this.liveChannelSegmentService;
	}
	
	protected KalturaLiveChannelService liveChannelService;
	public KalturaLiveChannelService getLiveChannelService() {
		if(this.liveChannelService == null)
			this.liveChannelService = new KalturaLiveChannelService(this);
	
		return this.liveChannelService;
	}
	
	protected KalturaLiveReportsService liveReportsService;
	public KalturaLiveReportsService getLiveReportsService() {
		if(this.liveReportsService == null)
			this.liveReportsService = new KalturaLiveReportsService(this);
	
		return this.liveReportsService;
	}
	
	protected KalturaLiveStatsService liveStatsService;
	public KalturaLiveStatsService getLiveStatsService() {
		if(this.liveStatsService == null)
			this.liveStatsService = new KalturaLiveStatsService(this);
	
		return this.liveStatsService;
	}
	
	protected KalturaLiveStreamService liveStreamService;
	public KalturaLiveStreamService getLiveStreamService() {
		if(this.liveStreamService == null)
			this.liveStreamService = new KalturaLiveStreamService(this);
	
		return this.liveStreamService;
	}
	
	protected KalturaMediaInfoService mediaInfoService;
	public KalturaMediaInfoService getMediaInfoService() {
		if(this.mediaInfoService == null)
			this.mediaInfoService = new KalturaMediaInfoService(this);
	
		return this.mediaInfoService;
	}
	
	protected KalturaMediaServerService mediaServerService;
	public KalturaMediaServerService getMediaServerService() {
		if(this.mediaServerService == null)
			this.mediaServerService = new KalturaMediaServerService(this);
	
		return this.mediaServerService;
	}
	
	protected KalturaMediaService mediaService;
	public KalturaMediaService getMediaService() {
		if(this.mediaService == null)
			this.mediaService = new KalturaMediaService(this);
	
		return this.mediaService;
	}
	
	protected KalturaMixingService mixingService;
	public KalturaMixingService getMixingService() {
		if(this.mixingService == null)
			this.mixingService = new KalturaMixingService(this);
	
		return this.mixingService;
	}
	
	protected KalturaNotificationService notificationService;
	public KalturaNotificationService getNotificationService() {
		if(this.notificationService == null)
			this.notificationService = new KalturaNotificationService(this);
	
		return this.notificationService;
	}
	
	protected KalturaPartnerService partnerService;
	public KalturaPartnerService getPartnerService() {
		if(this.partnerService == null)
			this.partnerService = new KalturaPartnerService(this);
	
		return this.partnerService;
	}
	
	protected KalturaPermissionItemService permissionItemService;
	public KalturaPermissionItemService getPermissionItemService() {
		if(this.permissionItemService == null)
			this.permissionItemService = new KalturaPermissionItemService(this);
	
		return this.permissionItemService;
	}
	
	protected KalturaPermissionService permissionService;
	public KalturaPermissionService getPermissionService() {
		if(this.permissionService == null)
			this.permissionService = new KalturaPermissionService(this);
	
		return this.permissionService;
	}
	
	protected KalturaPlaylistService playlistService;
	public KalturaPlaylistService getPlaylistService() {
		if(this.playlistService == null)
			this.playlistService = new KalturaPlaylistService(this);
	
		return this.playlistService;
	}
	
	protected KalturaReportService reportService;
	public KalturaReportService getReportService() {
		if(this.reportService == null)
			this.reportService = new KalturaReportService(this);
	
		return this.reportService;
	}
	
	protected KalturaResponseProfileService responseProfileService;
	public KalturaResponseProfileService getResponseProfileService() {
		if(this.responseProfileService == null)
			this.responseProfileService = new KalturaResponseProfileService(this);
	
		return this.responseProfileService;
	}
	
	protected KalturaSchemaService schemaService;
	public KalturaSchemaService getSchemaService() {
		if(this.schemaService == null)
			this.schemaService = new KalturaSchemaService(this);
	
		return this.schemaService;
	}
	
	protected KalturaSearchService searchService;
	public KalturaSearchService getSearchService() {
		if(this.searchService == null)
			this.searchService = new KalturaSearchService(this);
	
		return this.searchService;
	}
	
	protected KalturaSessionService sessionService;
	public KalturaSessionService getSessionService() {
		if(this.sessionService == null)
			this.sessionService = new KalturaSessionService(this);
	
		return this.sessionService;
	}
	
	protected KalturaStatsService statsService;
	public KalturaStatsService getStatsService() {
		if(this.statsService == null)
			this.statsService = new KalturaStatsService(this);
	
		return this.statsService;
	}
	
	protected KalturaStorageProfileService storageProfileService;
	public KalturaStorageProfileService getStorageProfileService() {
		if(this.storageProfileService == null)
			this.storageProfileService = new KalturaStorageProfileService(this);
	
		return this.storageProfileService;
	}
	
	protected KalturaSyndicationFeedService syndicationFeedService;
	public KalturaSyndicationFeedService getSyndicationFeedService() {
		if(this.syndicationFeedService == null)
			this.syndicationFeedService = new KalturaSyndicationFeedService(this);
	
		return this.syndicationFeedService;
	}
	
	protected KalturaSystemService systemService;
	public KalturaSystemService getSystemService() {
		if(this.systemService == null)
			this.systemService = new KalturaSystemService(this);
	
		return this.systemService;
	}
	
	protected KalturaThumbAssetService thumbAssetService;
	public KalturaThumbAssetService getThumbAssetService() {
		if(this.thumbAssetService == null)
			this.thumbAssetService = new KalturaThumbAssetService(this);
	
		return this.thumbAssetService;
	}
	
	protected KalturaThumbParamsOutputService thumbParamsOutputService;
	public KalturaThumbParamsOutputService getThumbParamsOutputService() {
		if(this.thumbParamsOutputService == null)
			this.thumbParamsOutputService = new KalturaThumbParamsOutputService(this);
	
		return this.thumbParamsOutputService;
	}
	
	protected KalturaThumbParamsService thumbParamsService;
	public KalturaThumbParamsService getThumbParamsService() {
		if(this.thumbParamsService == null)
			this.thumbParamsService = new KalturaThumbParamsService(this);
	
		return this.thumbParamsService;
	}
	
	protected KalturaUiConfService uiConfService;
	public KalturaUiConfService getUiConfService() {
		if(this.uiConfService == null)
			this.uiConfService = new KalturaUiConfService(this);
	
		return this.uiConfService;
	}
	
	protected KalturaUploadService uploadService;
	public KalturaUploadService getUploadService() {
		if(this.uploadService == null)
			this.uploadService = new KalturaUploadService(this);
	
		return this.uploadService;
	}
	
	protected KalturaUploadTokenService uploadTokenService;
	public KalturaUploadTokenService getUploadTokenService() {
		if(this.uploadTokenService == null)
			this.uploadTokenService = new KalturaUploadTokenService(this);
	
		return this.uploadTokenService;
	}
	
	protected KalturaUserRoleService userRoleService;
	public KalturaUserRoleService getUserRoleService() {
		if(this.userRoleService == null)
			this.userRoleService = new KalturaUserRoleService(this);
	
		return this.userRoleService;
	}
	
	protected KalturaUserService userService;
	public KalturaUserService getUserService() {
		if(this.userService == null)
			this.userService = new KalturaUserService(this);
	
		return this.userService;
	}
	
	protected KalturaWidgetService widgetService;
	public KalturaWidgetService getWidgetService() {
		if(this.widgetService == null)
			this.widgetService = new KalturaWidgetService(this);
	
		return this.widgetService;
	}
	
	protected KalturaXInternalService xInternalService;
	public KalturaXInternalService getXInternalService() {
		if(this.xInternalService == null)
			this.xInternalService = new KalturaXInternalService(this);
	
		return this.xInternalService;
	}
	
	protected KalturaMetadataService metadataService;
	public KalturaMetadataService getMetadataService() {
		if(this.metadataService == null)
			this.metadataService = new KalturaMetadataService(this);
	
		return this.metadataService;
	}
	
	protected KalturaMetadataProfileService metadataProfileService;
	public KalturaMetadataProfileService getMetadataProfileService() {
		if(this.metadataProfileService == null)
			this.metadataProfileService = new KalturaMetadataProfileService(this);
	
		return this.metadataProfileService;
	}
	
	protected KalturaDocumentsService documentsService;
	public KalturaDocumentsService getDocumentsService() {
		if(this.documentsService == null)
			this.documentsService = new KalturaDocumentsService(this);
	
		return this.documentsService;
	}
	
	protected KalturaSystemPartnerService systemPartnerService;
	public KalturaSystemPartnerService getSystemPartnerService() {
		if(this.systemPartnerService == null)
			this.systemPartnerService = new KalturaSystemPartnerService(this);
	
		return this.systemPartnerService;
	}
	
	protected KalturaEntryAdminService entryAdminService;
	public KalturaEntryAdminService getEntryAdminService() {
		if(this.entryAdminService == null)
			this.entryAdminService = new KalturaEntryAdminService(this);
	
		return this.entryAdminService;
	}
	
	protected KalturaUiConfAdminService uiConfAdminService;
	public KalturaUiConfAdminService getUiConfAdminService() {
		if(this.uiConfAdminService == null)
			this.uiConfAdminService = new KalturaUiConfAdminService(this);
	
		return this.uiConfAdminService;
	}
	
	protected KalturaReportAdminService reportAdminService;
	public KalturaReportAdminService getReportAdminService() {
		if(this.reportAdminService == null)
			this.reportAdminService = new KalturaReportAdminService(this);
	
		return this.reportAdminService;
	}
	
	protected KalturaKalturaInternalToolsSystemHelperService kalturaInternalToolsSystemHelperService;
	public KalturaKalturaInternalToolsSystemHelperService getKalturaInternalToolsSystemHelperService() {
		if(this.kalturaInternalToolsSystemHelperService == null)
			this.kalturaInternalToolsSystemHelperService = new KalturaKalturaInternalToolsSystemHelperService(this);
	
		return this.kalturaInternalToolsSystemHelperService;
	}
	
	protected KalturaVirusScanProfileService virusScanProfileService;
	public KalturaVirusScanProfileService getVirusScanProfileService() {
		if(this.virusScanProfileService == null)
			this.virusScanProfileService = new KalturaVirusScanProfileService(this);
	
		return this.virusScanProfileService;
	}
	
	protected KalturaDistributionProfileService distributionProfileService;
	public KalturaDistributionProfileService getDistributionProfileService() {
		if(this.distributionProfileService == null)
			this.distributionProfileService = new KalturaDistributionProfileService(this);
	
		return this.distributionProfileService;
	}
	
	protected KalturaEntryDistributionService entryDistributionService;
	public KalturaEntryDistributionService getEntryDistributionService() {
		if(this.entryDistributionService == null)
			this.entryDistributionService = new KalturaEntryDistributionService(this);
	
		return this.entryDistributionService;
	}
	
	protected KalturaDistributionProviderService distributionProviderService;
	public KalturaDistributionProviderService getDistributionProviderService() {
		if(this.distributionProviderService == null)
			this.distributionProviderService = new KalturaDistributionProviderService(this);
	
		return this.distributionProviderService;
	}
	
	protected KalturaGenericDistributionProviderService genericDistributionProviderService;
	public KalturaGenericDistributionProviderService getGenericDistributionProviderService() {
		if(this.genericDistributionProviderService == null)
			this.genericDistributionProviderService = new KalturaGenericDistributionProviderService(this);
	
		return this.genericDistributionProviderService;
	}
	
	protected KalturaGenericDistributionProviderActionService genericDistributionProviderActionService;
	public KalturaGenericDistributionProviderActionService getGenericDistributionProviderActionService() {
		if(this.genericDistributionProviderActionService == null)
			this.genericDistributionProviderActionService = new KalturaGenericDistributionProviderActionService(this);
	
		return this.genericDistributionProviderActionService;
	}
	
	protected KalturaCuePointService cuePointService;
	public KalturaCuePointService getCuePointService() {
		if(this.cuePointService == null)
			this.cuePointService = new KalturaCuePointService(this);
	
		return this.cuePointService;
	}
	
	protected KalturaAnnotationService annotationService;
	public KalturaAnnotationService getAnnotationService() {
		if(this.annotationService == null)
			this.annotationService = new KalturaAnnotationService(this);
	
		return this.annotationService;
	}
	
	protected KalturaShortLinkService shortLinkService;
	public KalturaShortLinkService getShortLinkService() {
		if(this.shortLinkService == null)
			this.shortLinkService = new KalturaShortLinkService(this);
	
		return this.shortLinkService;
	}
	
	protected KalturaBulkService bulkService;
	public KalturaBulkService getBulkService() {
		if(this.bulkService == null)
			this.bulkService = new KalturaBulkService(this);
	
		return this.bulkService;
	}
	
	protected KalturaDropFolderService dropFolderService;
	public KalturaDropFolderService getDropFolderService() {
		if(this.dropFolderService == null)
			this.dropFolderService = new KalturaDropFolderService(this);
	
		return this.dropFolderService;
	}
	
	protected KalturaDropFolderFileService dropFolderFileService;
	public KalturaDropFolderFileService getDropFolderFileService() {
		if(this.dropFolderFileService == null)
			this.dropFolderFileService = new KalturaDropFolderFileService(this);
	
		return this.dropFolderFileService;
	}
	
	protected KalturaCaptionAssetService captionAssetService;
	public KalturaCaptionAssetService getCaptionAssetService() {
		if(this.captionAssetService == null)
			this.captionAssetService = new KalturaCaptionAssetService(this);
	
		return this.captionAssetService;
	}
	
	protected KalturaCaptionParamsService captionParamsService;
	public KalturaCaptionParamsService getCaptionParamsService() {
		if(this.captionParamsService == null)
			this.captionParamsService = new KalturaCaptionParamsService(this);
	
		return this.captionParamsService;
	}
	
	protected KalturaCaptionAssetItemService captionAssetItemService;
	public KalturaCaptionAssetItemService getCaptionAssetItemService() {
		if(this.captionAssetItemService == null)
			this.captionAssetItemService = new KalturaCaptionAssetItemService(this);
	
		return this.captionAssetItemService;
	}
	
	protected KalturaAttachmentAssetService attachmentAssetService;
	public KalturaAttachmentAssetService getAttachmentAssetService() {
		if(this.attachmentAssetService == null)
			this.attachmentAssetService = new KalturaAttachmentAssetService(this);
	
		return this.attachmentAssetService;
	}
	
	protected KalturaTagService tagService;
	public KalturaTagService getTagService() {
		if(this.tagService == null)
			this.tagService = new KalturaTagService(this);
	
		return this.tagService;
	}
	
	protected KalturaLikeService likeService;
	public KalturaLikeService getLikeService() {
		if(this.likeService == null)
			this.likeService = new KalturaLikeService(this);
	
		return this.likeService;
	}
	
	protected KalturaVarConsoleService varConsoleService;
	public KalturaVarConsoleService getVarConsoleService() {
		if(this.varConsoleService == null)
			this.varConsoleService = new KalturaVarConsoleService(this);
	
		return this.varConsoleService;
	}
	
	protected KalturaEventNotificationTemplateService eventNotificationTemplateService;
	public KalturaEventNotificationTemplateService getEventNotificationTemplateService() {
		if(this.eventNotificationTemplateService == null)
			this.eventNotificationTemplateService = new KalturaEventNotificationTemplateService(this);
	
		return this.eventNotificationTemplateService;
	}
	
	protected KalturaExternalMediaService externalMediaService;
	public KalturaExternalMediaService getExternalMediaService() {
		if(this.externalMediaService == null)
			this.externalMediaService = new KalturaExternalMediaService(this);
	
		return this.externalMediaService;
	}
	
	protected KalturaScheduledTaskProfileService scheduledTaskProfileService;
	public KalturaScheduledTaskProfileService getScheduledTaskProfileService() {
		if(this.scheduledTaskProfileService == null)
			this.scheduledTaskProfileService = new KalturaScheduledTaskProfileService(this);
	
		return this.scheduledTaskProfileService;
	}
	
	/**
	 * @param String $clientTag
	 */
	public void setClientTag(String clientTag)
	{
		this.clientConfiguration.put("clientTag", clientTag);
	}
	
	/**
	 * @return String
	 */
	public String getClientTag()
	{
		if(this.clientConfiguration.containsKey("clientTag"))
		{
			return (String) this.clientConfiguration.get("clientTag");
		}
		
		return null;
	}
	
	/**
	 * @param String $apiVersion
	 */
	public void setApiVersion(String apiVersion)
	{
		this.clientConfiguration.put("apiVersion", apiVersion);
	}
	
	/**
	 * @return String
	 */
	public String getApiVersion()
	{
		if(this.clientConfiguration.containsKey("apiVersion"))
		{
			return (String) this.clientConfiguration.get("apiVersion");
		}
		
		return null;
	}
	
	/**
	 * Impersonated partner id
	 * 
	 * @param Integer $partnerId
	 */
	public void setPartnerId(Integer partnerId)
	{
		this.requestConfiguration.put("partnerId", partnerId);
	}
	
	/**
	 * Impersonated partner id
	 * 
	 * @return Integer
	 */
	public Integer getPartnerId()
	{
		if(this.requestConfiguration.containsKey("partnerId"))
		{
			return (Integer) this.requestConfiguration.get("partnerId");
		}
		
		return null;
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param String $ks
	 */
	public void setKs(String ks)
	{
		this.requestConfiguration.put("ks", ks);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @return String
	 */
	public String getKs()
	{
		if(this.requestConfiguration.containsKey("ks"))
		{
			return (String) this.requestConfiguration.get("ks");
		}
		
		return null;
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @param String $sessionId
	 */
	public void setSessionId(String sessionId)
	{
		this.requestConfiguration.put("ks", sessionId);
	}
	
	/**
	 * Kaltura API session
	 * 
	 * @return String
	 */
	public String getSessionId()
	{
		if(this.requestConfiguration.containsKey("ks"))
		{
			return (String) this.requestConfiguration.get("ks");
		}
		
		return null;
	}
	
	/**
	 * Response profile
	 * 
	 * @param KalturaBaseResponseProfile $responseProfile
	 */
	public void setResponseProfile(KalturaBaseResponseProfile responseProfile)
	{
		this.requestConfiguration.put("responseProfile", responseProfile);
	}
	
	/**
	 * Response profile
	 * 
	 * @return KalturaBaseResponseProfile
	 */
	public KalturaBaseResponseProfile getResponseProfile()
	{
		if(this.requestConfiguration.containsKey("responseProfile"))
		{
			return (KalturaBaseResponseProfile) this.requestConfiguration.get("responseProfile");
		}
		
		return null;
	}
	
}
