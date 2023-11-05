
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* DeviceConfig
*/
public class DeviceConfig {
	@JsonProperty("FriendlyName")
	public String FriendlyName = "";

	//Unix timestamp in seconds
	@JsonProperty("RegistrationTime")
	public long RegistrationTime;

	//The operating system that the device uses.
	@JsonProperty("PlatformVersion")
	public OSInfo PlatformVersion;

	//Minimal information about the device's private Protected Items, so that other devices can safely run retention passes
	//on a shared Storage Vault.
	@JsonProperty("Sources")
	public HashMap<String, SourceBasicInfo> Sources;

	//The device's reported timezone in IANA format.
	@JsonProperty("DeviceTimezone")
	public String DeviceTimezone = "";

	@JsonProperty("ClientVersion")
	public String ClientVersion = "";


	public DeviceConfig(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public DeviceConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,DeviceConfig.class);
	}

}
