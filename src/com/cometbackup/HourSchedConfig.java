
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

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public HourSchedConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,HourSchedConfig.class);
	}

}