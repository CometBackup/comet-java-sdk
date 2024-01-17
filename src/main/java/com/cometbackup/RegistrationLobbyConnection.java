
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RegistrationLobbyConnection
*/
public class RegistrationLobbyConnection {
	@JsonProperty("DeviceID")
	public String DeviceID = "";

	@JsonProperty("OrganizationID")
	public String OrganizationID = "";

	@JsonProperty("FriendlyName")
	public String FriendlyName = "";

	@JsonProperty("ReportedVersion")
	public String ReportedVersion = "";

	@JsonProperty("ReportedPlatform")
	public String ReportedPlatform = "";

	@JsonProperty("ReportedPlatformVersion")
	public OSInfo ReportedPlatformVersion;

	@JsonProperty("DeviceTimeZone")
	public String DeviceTimeZone = "";

	@JsonProperty("IPAddress")
	public String IPAddress = "";

	@JsonProperty("ConnectionTime")
	public long ConnectionTime;


	public RegistrationLobbyConnection(){ }

	/**
	* @return JSON representation of the RegistrationLobbyConnection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a RegistrationLobbyConnection
	* @return The deserialized RegistrationLobbyConnection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public RegistrationLobbyConnection fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RegistrationLobbyConnection.class);
	}

}