
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* HourSchedConfig
*/
public class HourSchedConfig {
	@JsonProperty("Hour")
	public long Hour;

	@JsonProperty("Minutes")
	public long Minutes;


	public HourSchedConfig(){ }

	/**
	* @return JSON representation of the HourSchedConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a HourSchedConfig
	* @return The deserialized HourSchedConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public HourSchedConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,HourSchedConfig.class);
	}

}