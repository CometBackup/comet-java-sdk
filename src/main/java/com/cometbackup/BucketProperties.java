
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* BucketProperties
*/
public class BucketProperties {
	@JsonProperty("OrganizationID")
	public String OrganizationID = "";

	//Unix timestamp, in seconds.
	@JsonProperty("CreateTime")
	public long CreateTime;

	//One of the PASSWORD_FORMAT_ constants
	@JsonProperty("ReadWriteKeyFormat")
	public int ReadWriteKeyFormat;

	@JsonProperty("ReadWriteKey")
	public String ReadWriteKey = "";

	@JsonProperty("Size")
	public SizeMeasurement Size;


	public BucketProperties(){ }

	/**
	* @return JSON representation of the BucketProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a BucketProperties
	* @return The deserialized BucketProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public BucketProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,BucketProperties.class);
	}

}
