
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RetentionPolicy
*/
public class RetentionPolicy {
	//One of the RETENTIONMODE_ constants
	@JsonProperty("Mode")
	public long Mode;

	@JsonProperty("Ranges")
	public ArrayList<RetentionRange> Ranges;


	public RetentionPolicy(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public RetentionPolicy fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RetentionPolicy.class);
	}

}