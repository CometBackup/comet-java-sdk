
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* StorageVaultProviderPolicy
*/
public class StorageVaultProviderPolicy {
	@JsonProperty("ShouldRestrictProviderList")
	public boolean ShouldRestrictProviderList;

	@JsonProperty("AllowedProvidersWhenRestricted")
	public ArrayList<Long> AllowedProvidersWhenRestricted;


	public StorageVaultProviderPolicy(){ }

	/**
	* @return JSON representation of the StorageVaultProviderPolicy
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a StorageVaultProviderPolicy
	* @return The deserialized StorageVaultProviderPolicy
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public StorageVaultProviderPolicy fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,StorageVaultProviderPolicy.class);
	}

}