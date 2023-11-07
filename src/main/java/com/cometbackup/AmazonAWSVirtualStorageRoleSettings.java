
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* AmazonAWSVirtualStorageRoleSettings
*/
public class AmazonAWSVirtualStorageRoleSettings {
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


	public AmazonAWSVirtualStorageRoleSettings(){ }

	/**
	* @return JSON representation of the AmazonAWSVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a AmazonAWSVirtualStorageRoleSettings
	* @return The deserialized AmazonAWSVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public AmazonAWSVirtualStorageRoleSettings fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,AmazonAWSVirtualStorageRoleSettings.class);
	}

}
