
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* StorageFreeSpaceInfo
*/
public class StorageFreeSpaceInfo {
	@JsonProperty("Unlimited")
	public boolean Unlimited;

	@JsonProperty("UsedPercent")
	public double UsedPercent;

	@JsonProperty("AvailableBytes")
	public long AvailableBytes;

	@JsonProperty("Spanned")
	public SpannedStorageExtraInfo Spanned;

	@JsonProperty("B2")
	public B2StorageExtraInfo B2;


	public StorageFreeSpaceInfo(){ }

	/**
	* @return JSON representation of the StorageFreeSpaceInfo
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a StorageFreeSpaceInfo
	* @return The deserialized StorageFreeSpaceInfo
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public StorageFreeSpaceInfo fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,StorageFreeSpaceInfo.class);
	}

}
