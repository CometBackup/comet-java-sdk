
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* StorjVirtualStorageRoleSetting
*/
public class StorjVirtualStorageRoleSetting {
	@JsonProperty("SatelliteAddress")
	public String SatelliteAddress = "";

	@JsonProperty("APIKey")
	public String APIKey = "";

	@JsonProperty("Passphrase")
	public String Passphrase = "";

	@JsonProperty("Bucket")
	public String Bucket = "";


	public StorjVirtualStorageRoleSetting(){ }

	/**
	* @return JSON representation of the StorjVirtualStorageRoleSetting
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a StorjVirtualStorageRoleSetting
	* @return The deserialized StorjVirtualStorageRoleSetting
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public StorjVirtualStorageRoleSetting fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,StorjVirtualStorageRoleSetting.class);
	}

}
