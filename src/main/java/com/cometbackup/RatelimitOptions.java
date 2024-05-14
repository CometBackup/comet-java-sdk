
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RatelimitOptions
*/
public class RatelimitOptions {
	@JsonProperty("Rules")
	public ArrayList<RatelimitRule> Rules;


	public RatelimitOptions(){ }

	/**
	* @return JSON representation of the RatelimitOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a RatelimitOptions
	* @return The deserialized RatelimitOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public RatelimitOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RatelimitOptions.class);
	}

}
