
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* LocalStorageDirectory
*/
public class LocalStorageDirectory {
	@JsonProperty("Path")
	public String Path = "";


	public LocalStorageDirectory(){ }

	/**
	* @return JSON representation of the LocalStorageDirectory
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a LocalStorageDirectory
	* @return The deserialized LocalStorageDirectory
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public LocalStorageDirectory fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,LocalStorageDirectory.class);
	}

}