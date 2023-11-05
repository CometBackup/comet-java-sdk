
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* EmailReportConfig
*/
public class EmailReportConfig {
	//One of the EMAILREPORTTYPE_ constants
	@JsonProperty("ReportType")
	public int ReportType;

	//Used as a list of scheduled times to send
	@JsonProperty("SummaryFrequency")
	public ArrayList<ScheduleConfig> SummaryFrequency;

	//Used to the determine the time bounds of a report
	@JsonProperty("TimeSpan")
	public TimeSpan TimeSpan;

	@JsonProperty("Filter")
	public SearchClause Filter;


	public EmailReportConfig(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public EmailReportConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,EmailReportConfig.class);
	}

}