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
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.enums.UploadTokenStatus;
import com.google.gson.JsonObject;


/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class UploadToken extends ObjectBase {

	/**  Upload token unique ID  */
    private String id;
	/**  Partner ID of the upload token  */
    private Integer partnerId;
	/**  User id for the upload token  */
    private String userId;
	/**  Status of the upload token  */
    private UploadTokenStatus status;
	/**  Name of the file for the upload token, can be empty when the upload token is
	  created and will be updated internally after the file is uploaded  */
    private String fileName;
	/**  File size in bytes, can be empty when the upload token is created and will be
	  updated internally after the file is uploaded  */
    private Double fileSize;
	/**  Uploaded file size in bytes, can be used to identify how many bytes were
	  uploaded before resuming  */
    private Double uploadedFileSize;
	/**  Creation date as Unix timestamp (In seconds)  */
    private Integer createdAt;
	/**  Last update date as Unix timestamp (In seconds)  */
    private Integer updatedAt;

    // id:
    public String getId(){
        return this.id;
    }
    public void setId(String id){
        this.id = id;
    }

    // partnerId:
    public Integer getPartnerId(){
        return this.partnerId;
    }
    public void setPartnerId(Integer partnerId){
        this.partnerId = partnerId;
    }

    // userId:
    public String getUserId(){
        return this.userId;
    }
    public void setUserId(String userId){
        this.userId = userId;
    }

    // status:
    public UploadTokenStatus getStatus(){
        return this.status;
    }
    public void setStatus(UploadTokenStatus status){
        this.status = status;
    }

    // fileName:
    public String getFileName(){
        return this.fileName;
    }
    public void setFileName(String fileName){
        this.fileName = fileName;
    }

    // fileSize:
    public Double getFileSize(){
        return this.fileSize;
    }
    public void setFileSize(Double fileSize){
        this.fileSize = fileSize;
    }

    // uploadedFileSize:
    public Double getUploadedFileSize(){
        return this.uploadedFileSize;
    }
    public void setUploadedFileSize(Double uploadedFileSize){
        this.uploadedFileSize = uploadedFileSize;
    }

    // createdAt:
    public Integer getCreatedAt(){
        return this.createdAt;
    }
    public void setCreatedAt(Integer createdAt){
        this.createdAt = createdAt;
    }

    // updatedAt:
    public Integer getUpdatedAt(){
        return this.updatedAt;
    }
    public void setUpdatedAt(Integer updatedAt){
        this.updatedAt = updatedAt;
    }


    public UploadToken() {
       super();
    }

    public UploadToken(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        id = GsonParser.parseString(jsonObject.get("id"));
        partnerId = GsonParser.parseInt(jsonObject.get("partnerId"));
        userId = GsonParser.parseString(jsonObject.get("userId"));
        status = UploadTokenStatus.get(GsonParser.parseInt(jsonObject.get("status")));
        fileName = GsonParser.parseString(jsonObject.get("fileName"));
        fileSize = GsonParser.parseDouble(jsonObject.get("fileSize"));
        uploadedFileSize = GsonParser.parseDouble(jsonObject.get("uploadedFileSize"));
        createdAt = GsonParser.parseInt(jsonObject.get("createdAt"));
        updatedAt = GsonParser.parseInt(jsonObject.get("updatedAt"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaUploadToken");
        kparams.add("fileName", this.fileName);
        kparams.add("fileSize", this.fileSize);
        return kparams;
    }

}

