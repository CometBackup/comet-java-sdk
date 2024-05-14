
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RatelimitRule
*/
public class RatelimitRule {
	@JsonProperty("MatchRegex")
	public String MatchRegex = "";

	@JsonProperty("BytesPerSecond")
	public long BytesPerSecond;


	public RatelimitRule(){ }

	/**
	* @return JSON representation of the RatelimitRule
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a RatelimitRule
	* @return The deserialized RatelimitRule
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public RatelimitRule fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RatelimitRule.class);
	}

}
