
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* U2FSignRequest
// deprecated since Comet version 21.12.0
*/
public class U2FSignRequest {
	@JsonProperty("ChallengeID")
	public String ChallengeID = "";

	@JsonProperty("ChallengeData")
	public String ChallengeData = "";

	@JsonProperty("AppID")
	public String AppID = "";

	@JsonProperty("RegisteredKeys")
	public ArrayList<U2FRegisteredKey> RegisteredKeys;


	public U2FSignRequest(){ }

	/**
	* @return JSON representation of the U2FSignRequest
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a U2FSignRequest
	* @return The deserialized U2FSignRequest
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public U2FSignRequest fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,U2FSignRequest.class);
	}

}
