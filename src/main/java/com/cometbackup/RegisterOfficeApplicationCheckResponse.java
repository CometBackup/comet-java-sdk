
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RegisterOfficeApplicationCheckResponse
*/
public class RegisterOfficeApplicationCheckResponse {
	@JsonProperty("Continuation")
	public String Continuation = "";

	@JsonProperty("Completed")
	public boolean Completed;

	@JsonProperty("Error")
	public String Error = "";

	@JsonProperty("Result")
	public Office365Credential Result;


	public RegisterOfficeApplicationCheckResponse(){ }

	/**
	* @return JSON representation of the RegisterOfficeApplicationCheckResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a RegisterOfficeApplicationCheckResponse
	* @return The deserialized RegisterOfficeApplicationCheckResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public RegisterOfficeApplicationCheckResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RegisterOfficeApplicationCheckResponse.class);
	}

}
