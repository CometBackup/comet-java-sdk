
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* InstallCreds
*/
public class InstallCreds {
	@JsonProperty("Username")
	public String Username = "";

	@JsonProperty("Password")
	public String Password = "";

	@JsonProperty("TOTPCode")
	public String TOTPCode = "";

	@JsonProperty("Server")
	public String Server = "";

	@JsonProperty("AutoLogin")
	public boolean AutoLogin;


	public InstallCreds(){ }

	/**
	* @return JSON representation of the InstallCreds
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a InstallCreds
	* @return The deserialized InstallCreds
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public InstallCreds fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,InstallCreds.class);
	}

}
