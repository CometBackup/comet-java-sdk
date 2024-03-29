
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* AvailableDownload
*/
public class AvailableDownload {
	@JsonProperty("Category")
	public String Category = "";

	@JsonProperty("Description")
	public String Description = "";

	@JsonProperty("Recommended")
	public boolean Recommended;


	public AvailableDownload(){ }

	/**
	* @return JSON representation of the AvailableDownload
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a AvailableDownload
	* @return The deserialized AvailableDownload
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public AvailableDownload fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,AvailableDownload.class);
	}

}
