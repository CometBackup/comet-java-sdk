
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* VSphereConnection
*/
public class VSphereConnection {
	@JsonProperty("Hostname")
	public String Hostname = "";

	@JsonProperty("Https")
	public boolean Https;

	@JsonProperty("AllowInvalidCertificate")
	public boolean AllowInvalidCertificate;

	@JsonProperty("Username")
	public String Username = "";

	@JsonProperty("Password")
	public String Password = "";

	@JsonProperty("ThumbPrint")
	public String ThumbPrint = "";


	public VSphereConnection(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public VSphereConnection fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,VSphereConnection.class);
	}

}