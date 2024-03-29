
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WebAuthnCredentialParameter
*/
public class WebAuthnCredentialParameter {
	@JsonProperty("type")
	public String Type = "";

	@JsonProperty("alg")
	public int Algorithm;


	public WebAuthnCredentialParameter(){ }

	/**
	* @return JSON representation of the WebAuthnCredentialParameter
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WebAuthnCredentialParameter
	* @return The deserialized WebAuthnCredentialParameter
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WebAuthnCredentialParameter fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WebAuthnCredentialParameter.class);
	}

}
