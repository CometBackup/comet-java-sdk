
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WebAuthnAuthenticatorSelection
*/
public class WebAuthnAuthenticatorSelection {
	@JsonProperty("authenticatorAttachment")
	public String AuthenticatorAttachment = "";

	@JsonProperty("requireResidentKey")
	public boolean RequireResidentKey;

	@JsonProperty("residentKey")
	public String ResidentKey = "";

	@JsonProperty("userVerification")
	public String UserVerification = "";


	public WebAuthnAuthenticatorSelection(){ }

	/**
	* @return JSON representation of the WebAuthnAuthenticatorSelection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WebAuthnAuthenticatorSelection
	* @return The deserialized WebAuthnAuthenticatorSelection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WebAuthnAuthenticatorSelection fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WebAuthnAuthenticatorSelection.class);
	}

}
