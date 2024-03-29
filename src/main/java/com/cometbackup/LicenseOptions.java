
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* LicenseOptions
*/
public class LicenseOptions {
	@JsonProperty("Email")
	public String Email = "";

	@JsonProperty("SerialNumber")
	public String SerialNumber = "";


	public LicenseOptions(){ }

	/**
	* @return JSON representation of the LicenseOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a LicenseOptions
	* @return The deserialized LicenseOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public LicenseOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,LicenseOptions.class);
	}

}
