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

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.utils.GsonParser;
import java.util.ArrayList;
import java.util.List;

/**
 * This class was generated using exec.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
public class AnswerCuePoint extends CuePoint {

    private String parentId;
    private String quizUserEntryId;
    private String answerKey;
    private Boolean isCorrect;
	/**  Array of string  */
    private List<StringHolder> correctAnswerKeys;
    private String explanation;

    // parentId:
    public String getParentId(){
        return this.parentId;
    }
    public void setParentId(String parentId){
        this.parentId = parentId;
    }

    // quizUserEntryId:
    public String getQuizUserEntryId(){
        return this.quizUserEntryId;
    }
    public void setQuizUserEntryId(String quizUserEntryId){
        this.quizUserEntryId = quizUserEntryId;
    }

    // answerKey:
    public String getAnswerKey(){
        return this.answerKey;
    }
    public void setAnswerKey(String answerKey){
        this.answerKey = answerKey;
    }

    // isCorrect:
    public Boolean getIsCorrect(){
        return this.isCorrect;
    }
    public void setIsCorrect(Boolean isCorrect){
        this.isCorrect = isCorrect;
    }

    // correctAnswerKeys:
    public List<StringHolder> getCorrectAnswerKeys(){
        return this.correctAnswerKeys;
    }
    public void setCorrectAnswerKeys(List<StringHolder> correctAnswerKeys){
        this.correctAnswerKeys = correctAnswerKeys;
    }

    // explanation:
    public String getExplanation(){
        return this.explanation;
    }
    public void setExplanation(String explanation){
        this.explanation = explanation;
    }


    public AnswerCuePoint() {
       super();
    }

    public AnswerCuePoint(JsonObject jsonObject) throws APIException {
        super(jsonObject);

        if(jsonObject == null) return;

        // set members values:
        parentId = GsonParser.parseString(jsonObject.get("parentId"));
        quizUserEntryId = GsonParser.parseString(jsonObject.get("quizUserEntryId"));
        answerKey = GsonParser.parseString(jsonObject.get("answerKey"));
        isCorrect = GsonParser.parseBoolean(jsonObject.get("isCorrect"));
        correctAnswerKeys = GsonParser.parseArray(jsonObject.getAsJsonArray("correctAnswerKeys"), StringHolder.class);
        explanation = GsonParser.parseString(jsonObject.get("explanation"));

    }

    public Params toParams() {
        Params kparams = super.toParams();
        kparams.add("objectType", "KalturaAnswerCuePoint");
        kparams.add("parentId", this.parentId);
        kparams.add("quizUserEntryId", this.quizUserEntryId);
        kparams.add("answerKey", this.answerKey);
        return kparams;
    }

}

