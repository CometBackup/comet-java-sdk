
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* U2FRegisteredKey
// deprecated since Comet version 21.12.0
*/
public class U2FRegisteredKey {
	@JsonProperty("AppID")
	public String AppID = "";

	@JsonProperty("KeyHandle")
	public String KeyHandle = "";

	@JsonProperty("Version")
	public String Version = "";


	public U2FRegisteredKey(){ }

	/**
	* @return JSON representation of the U2FRegisteredKey
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a U2FRegisteredKey
	* @return The deserialized U2FRegisteredKey
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public U2FRegisteredKey fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,U2FRegisteredKey.class);
	}

}
