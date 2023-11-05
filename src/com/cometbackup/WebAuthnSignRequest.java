
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

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public WebAuthnSignRequest fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WebAuthnSignRequest.class);
	}

}