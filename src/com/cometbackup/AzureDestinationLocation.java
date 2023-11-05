
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* AzureDestinationLocation AzureDestinationLocation allows configuring connection settings for storage locations using
* the Azure Blob Storage API (DESTINATIONTYPE_AZURE).
*/
public class AzureDestinationLocation {
	@JsonProperty("AZBAccountName")
	public String AZBAccountName = "";

	@JsonProperty("AZBAccountKey")
	public String AZBAccountKey = "";

	@JsonProperty("AZBContainer")
	public String AZBContainer = "";

	//The base URL for the Azure Blob Storage service. Leave blank to use the global default URL.
	@JsonProperty("AZBRealm")
	public String AZBRealm = "";

	@JsonProperty("AZBPrefix")
	public String AZBPrefix = "";


	public AzureDestinationLocation(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public AzureDestinationLocation fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,AzureDestinationLocation.class);
	}

}
