
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WebAuthnSignRequest
*/
public class WebAuthnSignRequest {
	@JsonProperty("ChallengeID")
	public String ChallengeID = "";

	@JsonProperty("Assertion")
	public WebAuthnCredentialAssertion Assertion;


	public WebAuthnSignRequest(){ }

	/**
	* @return JSON representation of the WebAuthnSignRequest
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WebAuthnSignRequest
	* @return The deserialized WebAuthnSignRequest
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WebAuthnSignRequest fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WebAuthnSignRequest.class);
	}

}