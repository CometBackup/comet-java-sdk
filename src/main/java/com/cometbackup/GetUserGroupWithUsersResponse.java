
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* GetUserGroupWithUsersResponse
*/
public class GetUserGroupWithUsersResponse {
	@JsonProperty("UserGroup")
	public UserGroup UserGroup;

	@JsonProperty("Users")
	public HashMap<String, UserProfileConfig> Users;


	public GetUserGroupWithUsersResponse(){ }

	/**
	* @return JSON representation of the GetUserGroupWithUsersResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a GetUserGroupWithUsersResponse
	* @return The deserialized GetUserGroupWithUsersResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public GetUserGroupWithUsersResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,GetUserGroupWithUsersResponse.class);
	}

}
