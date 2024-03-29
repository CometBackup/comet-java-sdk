
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WasabiVirtualStorageRoleSettings
*/
public class WasabiVirtualStorageRoleSettings {
	@JsonProperty("MasterBucket")
	public String MasterBucket = "";

	@JsonProperty("AccessKey")
	public String AccessKey = "";

	@JsonProperty("SecretKey")
	public String SecretKey = "";

	@JsonProperty("UseObjectLock")
	public boolean UseObjectLock_Legacy_DoNotUse;

	@JsonProperty("ObjectLockMode")
	public short ObjectLockMode;

	@JsonProperty("ObjectLockDays")
	public int ObjectLockDays;

	@JsonProperty("RemoveDeleted")
	public boolean RemoveDeleted;


	public WasabiVirtualStorageRoleSettings(){ }

	/**
	* @return JSON representation of the WasabiVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WasabiVirtualStorageRoleSettings
	* @return The deserialized WasabiVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WasabiVirtualStorageRoleSettings fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WasabiVirtualStorageRoleSettings.class);
	}

}
