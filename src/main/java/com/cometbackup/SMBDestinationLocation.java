
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SMBDestinationLocation
*/
public class SMBDestinationLocation {
	@JsonProperty("SMBServer")
	public String SMBServer = "";

	@JsonProperty("SMBShare")
	public String SMBShare = "";

	@JsonProperty("SMBDirectory")
	public String SMBDirectory = "";

	@JsonProperty("SMBUsername")
	public String SMBUsername = "";

	@JsonProperty("SMBPassword")
	public String SMBPassword = "";


	public SMBDestinationLocation(){ }

	/**
	* @return JSON representation of the SMBDestinationLocation
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SMBDestinationLocation
	* @return The deserialized SMBDestinationLocation
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SMBDestinationLocation fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SMBDestinationLocation.class);
	}

}
