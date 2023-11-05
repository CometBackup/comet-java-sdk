
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* TimeSpan
*/
public class TimeSpan {
	//SCHEDULE_FREQUENCY_<TYPE>
	@JsonProperty("FrequencyType")
	public long FrequencyType;

	//Used for Periodic and Once Only
	@JsonProperty("Seconds")
	public long Seconds;


	public TimeSpan(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public TimeSpan fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,TimeSpan.class);
	}

}
