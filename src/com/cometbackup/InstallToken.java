
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* InstallToken
*/
public class InstallToken {
	@JsonProperty("Username")
	public String Username = "";

	//The URL of the Comet Server (Auth Role) for the target user to log in to.
	@JsonProperty("Server")
	public String Server = "";

	//The token for use with the "/TOKEN=" silent install flag.
	@JsonProperty("Token")
	public String Token = "";

	//Unix timestamp, in seconds.
	@JsonProperty("CreateTime")
	public long CreateTime;

	//If the token has been used, it cannot be used again.
	@JsonProperty("Used")
	public boolean Used;

	//Unix timestamp, in seconds.
	@JsonProperty("ExpireTime")
	public long ExpireTime;


	public InstallToken(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public InstallToken fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,InstallToken.class);
	}

}
