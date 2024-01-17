
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* DaysOfWeekConfig
*/
public class DaysOfWeekConfig {
	@JsonProperty("Sunday")
	public boolean Sunday;

	@JsonProperty("Monday")
	public boolean Monday;

	@JsonProperty("Tuesday")
	public boolean Tuesday;

	@JsonProperty("Wednesday")
	public boolean Wednesday;

	@JsonProperty("Thursday")
	public boolean Thursday;

	@JsonProperty("Friday")
	public boolean Friday;

	@JsonProperty("Saturday")
	public boolean Saturday;


	public DaysOfWeekConfig(){ }

	/**
	* @return JSON representation of the DaysOfWeekConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a DaysOfWeekConfig
	* @return The deserialized DaysOfWeekConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public DaysOfWeekConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,DaysOfWeekConfig.class);
	}

}