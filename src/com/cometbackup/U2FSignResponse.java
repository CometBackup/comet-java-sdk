
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* U2FSignResponse
// deprecated since Comet version 21.12.0
*/
public class U2FSignResponse {
	@JsonProperty("ChallengeID")
	public String ChallengeID = "";

	@JsonProperty("KeyHandle")
	public String KeyHandle = "";

	@JsonProperty("Signature")
	public String Signature = "";

	@JsonProperty("ClientData")
	public String ClientData = "";


	public U2FSignResponse(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public U2FSignResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,U2FSignResponse.class);
	}

}
