
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RetentionRange The Type field controls which fields of this data type are used. For additional information, see the
* notes on the RETENTIONRANGE_ constants.
*/
public class RetentionRange {
	//One of the RETENTIONRANGE_ constants
	@JsonProperty("Type")
	public long Type;

	//Unix timestamp, in seconds. Used by RETENTIONRANGE_NEWER_THAN_X.
	@JsonProperty("Timestamp")
	public long Timestamp;

	@JsonProperty("Jobs")
	public long Jobs;

	@JsonProperty("Days")
	public long Days;

	@JsonProperty("Weeks")
	public long Weeks;

	@JsonProperty("Months")
	public long Months;

	//0: Sunday, 6: Saturday
	@JsonProperty("WeekOffset")
	public long WeekOffset;

	//1: 1st, 31: 31st
	//Prior to Comet version 23.6.2, 31 was treated as 30.
	//For months that do not have a day equal to the specified offset, no backup will be retained.
	//For example, if the offset is set to 30, no backup will be kept for February.
	@JsonProperty("MonthOffset")
	public long MonthOffset;


	public RetentionRange(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public RetentionRange fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RetentionRange.class);
	}

}