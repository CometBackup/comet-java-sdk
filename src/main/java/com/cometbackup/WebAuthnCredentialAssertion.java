
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WebAuthnCredentialAssertion
*/
public class WebAuthnCredentialAssertion {
	@JsonProperty("publicKey")
	public WebAuthnPublicKeyCredentialRequestOptions Response;


	public WebAuthnCredentialAssertion(){ }

	/**
	* @return JSON representation of the WebAuthnCredentialAssertion
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WebAuthnCredentialAssertion
	* @return The deserialized WebAuthnCredentialAssertion
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WebAuthnCredentialAssertion fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WebAuthnCredentialAssertion.class);
	}

}