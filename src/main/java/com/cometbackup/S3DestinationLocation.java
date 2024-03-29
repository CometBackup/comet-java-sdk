
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* S3DestinationLocation
*/
public class S3DestinationLocation {
	@JsonProperty("S3Server")
	public String S3Server = "";

	@JsonProperty("S3UsesTLS")
	public boolean S3UsesTLS;

	@JsonProperty("S3AccessKey")
	public String S3AccessKey = "";

	@JsonProperty("S3SecretKey")
	public String S3SecretKey = "";

	@JsonProperty("S3BucketName")
	public String S3BucketName = "";

	@JsonProperty("S3Subdir")
	public String S3Subdir = "";

	@JsonProperty("S3CustomRegion")
	public String S3CustomRegion = "";

	//If true, use legacy v2 signing. If false (default), use modern v4 signing
	@JsonProperty("S3UsesV2Signing")
	public boolean S3UsesV2Signing;

	@JsonProperty("S3RemoveDeleted")
	public boolean S3RemoveDeleted;

	@JsonProperty("S3ObjectLockMode")
	public short S3ObjectLockMode;

	@JsonProperty("S3ObjectLockDays")
	public int S3ObjectLockDays;


	public S3DestinationLocation(){ }

	/**
	* @return JSON representation of the S3DestinationLocation
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a S3DestinationLocation
	* @return The deserialized S3DestinationLocation
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public S3DestinationLocation fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,S3DestinationLocation.class);
	}

}
