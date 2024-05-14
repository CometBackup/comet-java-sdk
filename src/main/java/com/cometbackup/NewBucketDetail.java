
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* NewBucketDetail
*/
public class NewBucketDetail {
	@JsonProperty("NewBucketID")
	public String NewBucketID = "";

	@JsonProperty("NewBucketKey")
	public String NewBucketKey = "";


	public NewBucketDetail(){ }

	/**
	* @return JSON representation of the NewBucketDetail
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a NewBucketDetail
	* @return The deserialized NewBucketDetail
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public NewBucketDetail fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,NewBucketDetail.class);
	}

}
