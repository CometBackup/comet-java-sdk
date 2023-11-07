
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* CountJobsResponse
*/
public class CountJobsResponse {
	@JsonProperty("Count")
	public long Count;


	public CountJobsResponse(){ }

	/**
	* @return JSON representation of the CountJobsResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a CountJobsResponse
	* @return The deserialized CountJobsResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public CountJobsResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,CountJobsResponse.class);
	}

}
