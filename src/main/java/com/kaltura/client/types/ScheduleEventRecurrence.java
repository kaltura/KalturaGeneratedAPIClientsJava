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
package com.kaltura.client.types;

import com.google.gson.JsonObject;
import com.kaltura.client.Params;
import com.kaltura.client.enums.ScheduleEventRecurrenceDay;
import com.kaltura.client.enums.ScheduleEventRecurrenceFrequency;
import com.kaltura.client.types.ObjectBase;
import com.kaltura.client.utils.GsonParser;
import com.kaltura.client.utils.request.MultiRequestBuilder;

/**
 * This class was generated using generate.php
 * against an XML schema provided by Kaltura.
 * 
 * MANUAL CHANGES TO THIS CLASS WILL BE OVERWRITTEN.
 */

@SuppressWarnings("serial")
@MultiRequestBuilder.Tokenizer(ScheduleEventRecurrence.Tokenizer.class)
public class ScheduleEventRecurrence extends ObjectBase {
	
	public interface Tokenizer extends ObjectBase.Tokenizer {
		String name();
		String frequency();
		String until();
		String timeZone();
		String count();
		String interval();
		String bySecond();
		String byMinute();
		String byHour();
		String byDay();
		String byMonthDay();
		String byYearDay();
		String byWeekNumber();
		String byMonth();
		String byOffset();
		String weekStartDay();
	}

	private String name;
	private ScheduleEventRecurrenceFrequency frequency;
	private Integer until;
	/**
	 * TimeZone String
	 */
	private String timeZone;
	private Integer count;
	private Integer interval;
	/**
	 * Comma separated numbers between 0 to 59
	 */
	private String bySecond;
	/**
	 * Comma separated numbers between 0 to 59
	 */
	private String byMinute;
	/**
	 * Comma separated numbers between 0 to 23
	 */
	private String byHour;
	/**
	 * Comma separated of KalturaScheduleEventRecurrenceDay   Each byDay value can also
	  be preceded by a positive (+n) or negative (-n) integer.   If present, this
	  indicates the nth occurrence of the specific day within the MONTHLY or YEARLY
	  RRULE.   For example, within a MONTHLY rule, +1MO (or simply 1MO) represents the
	  first Monday within the month, whereas -1MO represents the last Monday of the
	  month.   If an integer modifier is not present, it means all days of this type
	  within the specified frequency.   For example, within a MONTHLY rule, MO
	  represents all Mondays within the month.
	 */
	private String byDay;
	/**
	 * Comma separated of numbers between -31 to 31, excluding 0.   For example, -10
	  represents the tenth to the last day of the month.
	 */
	private String byMonthDay;
	/**
	 * Comma separated of numbers between -366 to 366, excluding 0.   For example, -1
	  represents the last day of the year (December 31st) and -306 represents the
	  306th to the last day of the year (March 1st).
	 */
	private String byYearDay;
	/**
	 * Comma separated of numbers between -53 to 53, excluding 0.   This corresponds to
	  weeks according to week numbering.   A week is defined as a seven day period,
	  starting on the day of the week defined to be the week start.   Week number one
	  of the calendar year is the first week which contains at least four (4) days in
	  that calendar year.   This rule part is only valid for YEARLY frequency.   For
	  example, 3 represents the third week of the year.
	 */
	private String byWeekNumber;
	/**
	 * Comma separated numbers between 1 to 12
	 */
	private String byMonth;
	/**
	 * Comma separated of numbers between -366 to 366, excluding 0.   Corresponds to
	  the nth occurrence within the set of events specified by the rule.   It must
	  only be used in conjunction with another byrule part.   For example "the last
	  work day of the month" could be represented as:
	  frequency=MONTHLY;byDay=MO,TU,WE,TH,FR;byOffset=-1   Each byOffset value can
	  include a positive (+n) or negative (-n) integer.   If present, this indicates
	  the nth occurrence of the specific occurrence within the set of events specified
	  by the rule.
	 */
	private String byOffset;
	private ScheduleEventRecurrenceDay weekStartDay;

	// name:
	public String getName(){
		return this.name;
	}
	public void setName(String name){
		this.name = name;
	}

	public void name(String multirequestToken){
		setToken("name", multirequestToken);
	}

	// frequency:
	public ScheduleEventRecurrenceFrequency getFrequency(){
		return this.frequency;
	}
	public void setFrequency(ScheduleEventRecurrenceFrequency frequency){
		this.frequency = frequency;
	}

	public void frequency(String multirequestToken){
		setToken("frequency", multirequestToken);
	}

	// until:
	public Integer getUntil(){
		return this.until;
	}
	public void setUntil(Integer until){
		this.until = until;
	}

	public void until(String multirequestToken){
		setToken("until", multirequestToken);
	}

	// timeZone:
	public String getTimeZone(){
		return this.timeZone;
	}
	public void setTimeZone(String timeZone){
		this.timeZone = timeZone;
	}

	public void timeZone(String multirequestToken){
		setToken("timeZone", multirequestToken);
	}

	// count:
	public Integer getCount(){
		return this.count;
	}
	public void setCount(Integer count){
		this.count = count;
	}

	public void count(String multirequestToken){
		setToken("count", multirequestToken);
	}

	// interval:
	public Integer getInterval(){
		return this.interval;
	}
	public void setInterval(Integer interval){
		this.interval = interval;
	}

	public void interval(String multirequestToken){
		setToken("interval", multirequestToken);
	}

	// bySecond:
	public String getBySecond(){
		return this.bySecond;
	}
	public void setBySecond(String bySecond){
		this.bySecond = bySecond;
	}

	public void bySecond(String multirequestToken){
		setToken("bySecond", multirequestToken);
	}

	// byMinute:
	public String getByMinute(){
		return this.byMinute;
	}
	public void setByMinute(String byMinute){
		this.byMinute = byMinute;
	}

	public void byMinute(String multirequestToken){
		setToken("byMinute", multirequestToken);
	}

	// byHour:
	public String getByHour(){
		return this.byHour;
	}
	public void setByHour(String byHour){
		this.byHour = byHour;
	}

	public void byHour(String multirequestToken){
		setToken("byHour", multirequestToken);
	}

	// byDay:
	public String getByDay(){
		return this.byDay;
	}
	public void setByDay(String byDay){
		this.byDay = byDay;
	}

	public void byDay(String multirequestToken){
		setToken("byDay", multirequestToken);
	}

	// byMonthDay:
	public String getByMonthDay(){
		return this.byMonthDay;
	}
	public void setByMonthDay(String byMonthDay){
		this.byMonthDay = byMonthDay;
	}

	public void byMonthDay(String multirequestToken){
		setToken("byMonthDay", multirequestToken);
	}

	// byYearDay:
	public String getByYearDay(){
		return this.byYearDay;
	}
	public void setByYearDay(String byYearDay){
		this.byYearDay = byYearDay;
	}

	public void byYearDay(String multirequestToken){
		setToken("byYearDay", multirequestToken);
	}

	// byWeekNumber:
	public String getByWeekNumber(){
		return this.byWeekNumber;
	}
	public void setByWeekNumber(String byWeekNumber){
		this.byWeekNumber = byWeekNumber;
	}

	public void byWeekNumber(String multirequestToken){
		setToken("byWeekNumber", multirequestToken);
	}

	// byMonth:
	public String getByMonth(){
		return this.byMonth;
	}
	public void setByMonth(String byMonth){
		this.byMonth = byMonth;
	}

	public void byMonth(String multirequestToken){
		setToken("byMonth", multirequestToken);
	}

	// byOffset:
	public String getByOffset(){
		return this.byOffset;
	}
	public void setByOffset(String byOffset){
		this.byOffset = byOffset;
	}

	public void byOffset(String multirequestToken){
		setToken("byOffset", multirequestToken);
	}

	// weekStartDay:
	public ScheduleEventRecurrenceDay getWeekStartDay(){
		return this.weekStartDay;
	}
	public void setWeekStartDay(ScheduleEventRecurrenceDay weekStartDay){
		this.weekStartDay = weekStartDay;
	}

	public void weekStartDay(String multirequestToken){
		setToken("weekStartDay", multirequestToken);
	}


	public ScheduleEventRecurrence() {
		super();
	}

	public ScheduleEventRecurrence(JsonObject jsonObject) throws APIException {
		super(jsonObject);

		if(jsonObject == null) return;

		// set members values:
		name = GsonParser.parseString(jsonObject.get("name"));
		frequency = ScheduleEventRecurrenceFrequency.get(GsonParser.parseString(jsonObject.get("frequency")));
		until = GsonParser.parseInt(jsonObject.get("until"));
		timeZone = GsonParser.parseString(jsonObject.get("timeZone"));
		count = GsonParser.parseInt(jsonObject.get("count"));
		interval = GsonParser.parseInt(jsonObject.get("interval"));
		bySecond = GsonParser.parseString(jsonObject.get("bySecond"));
		byMinute = GsonParser.parseString(jsonObject.get("byMinute"));
		byHour = GsonParser.parseString(jsonObject.get("byHour"));
		byDay = GsonParser.parseString(jsonObject.get("byDay"));
		byMonthDay = GsonParser.parseString(jsonObject.get("byMonthDay"));
		byYearDay = GsonParser.parseString(jsonObject.get("byYearDay"));
		byWeekNumber = GsonParser.parseString(jsonObject.get("byWeekNumber"));
		byMonth = GsonParser.parseString(jsonObject.get("byMonth"));
		byOffset = GsonParser.parseString(jsonObject.get("byOffset"));
		weekStartDay = ScheduleEventRecurrenceDay.get(GsonParser.parseString(jsonObject.get("weekStartDay")));

	}

	public Params toParams() {
		Params kparams = super.toParams();
		kparams.add("objectType", "KalturaScheduleEventRecurrence");
		kparams.add("name", this.name);
		kparams.add("frequency", this.frequency);
		kparams.add("until", this.until);
		kparams.add("timeZone", this.timeZone);
		kparams.add("count", this.count);
		kparams.add("interval", this.interval);
		kparams.add("bySecond", this.bySecond);
		kparams.add("byMinute", this.byMinute);
		kparams.add("byHour", this.byHour);
		kparams.add("byDay", this.byDay);
		kparams.add("byMonthDay", this.byMonthDay);
		kparams.add("byYearDay", this.byYearDay);
		kparams.add("byWeekNumber", this.byWeekNumber);
		kparams.add("byMonth", this.byMonth);
		kparams.add("byOffset", this.byOffset);
		kparams.add("weekStartDay", this.weekStartDay);
		return kparams;
	}

}

