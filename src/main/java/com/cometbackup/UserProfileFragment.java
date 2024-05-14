
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UserProfileFragment
// deprecated since Comet version 23.3.5
*/
public class UserProfileFragment {
	@JsonProperty("Username")
	public String Username = "";


	public UserProfileFragment(){ }

	/**
	* @return JSON representation of the UserProfileFragment
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a UserProfileFragment
	* @return The deserialized UserProfileFragment
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public UserProfileFragment fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UserProfileFragment.class);
	}

}
