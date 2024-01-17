
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* VSSComponent
*/
public class VSSComponent {
	@JsonProperty("Path")
	public String Path = "";

	@JsonProperty("Name")
	public String Name = "";

	//"VSS_CT_DATABASE" or "VSS_CT_FILEGROUP"
	@JsonProperty("CType")
	public String CType = "";

	@JsonProperty("Selectable")
	public boolean Selectable;


	public VSSComponent(){ }

	/**
	* @return JSON representation of the VSSComponent
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a VSSComponent
	* @return The deserialized VSSComponent
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public VSSComponent fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,VSSComponent.class);
	}

}