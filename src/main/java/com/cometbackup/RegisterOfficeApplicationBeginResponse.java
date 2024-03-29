
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RegisterOfficeApplicationBeginResponse
*/
public class RegisterOfficeApplicationBeginResponse {
	@JsonProperty("Continuation")
	public String Continuation = "";

	@JsonProperty("VerificationURL")
	public String VerificationURL = "";

	@JsonProperty("UserCode")
	public String UserCode = "";


	public RegisterOfficeApplicationBeginResponse(){ }

	/**
	* @return JSON representation of the RegisterOfficeApplicationBeginResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a RegisterOfficeApplicationBeginResponse
	* @return The deserialized RegisterOfficeApplicationBeginResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public RegisterOfficeApplicationBeginResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RegisterOfficeApplicationBeginResponse.class);
	}

}
