
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* S3GenericVirtualStorageRole
*/
public class S3GenericVirtualStorageRole {
	@JsonProperty("S3Endpoint")
	public String S3Endpoint = "";

	@JsonProperty("IAMEndpoint")
	public String IAMEndpoint = "";

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


	public S3GenericVirtualStorageRole(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public S3GenericVirtualStorageRole fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,S3GenericVirtualStorageRole.class);
	}

}