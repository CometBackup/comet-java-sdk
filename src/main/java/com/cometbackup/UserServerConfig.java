
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UserServerConfig
*/
public class UserServerConfig {
	@JsonProperty("RandomDelaySecs")
	public long RandomDelaySecs;


	public UserServerConfig(){ }

	/**
	* @return JSON representation of the UserServerConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a UserServerConfig
	* @return The deserialized UserServerConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public UserServerConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UserServerConfig.class);
	}

}
