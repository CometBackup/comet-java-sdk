
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SoftwareBuildRoleOptions
*/
public class SoftwareBuildRoleOptions {
	@JsonProperty("RoleEnabled")
	public boolean RoleEnabled;

	@JsonProperty("AllowUnauthenticatedDownloads")
	public boolean AllowUnauthenticatedDownloads;

	//0 will default to CPU core count - 2
	@JsonProperty("MaxBuilders")
	public int MaxBuilders;


	public SoftwareBuildRoleOptions(){ }

	/**
	* @return JSON representation of the SoftwareBuildRoleOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SoftwareBuildRoleOptions
	* @return The deserialized SoftwareBuildRoleOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SoftwareBuildRoleOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SoftwareBuildRoleOptions.class);
	}

}
