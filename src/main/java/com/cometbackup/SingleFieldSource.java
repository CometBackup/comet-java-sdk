
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SingleFieldSource
*/
public class SingleFieldSource {
	@JsonProperty("FieldName")
	public String FieldName = "";

	//One of "bool" / "int" / "string"
	@JsonProperty("FieldType")
	public String FieldType = "";

	@JsonProperty("BoolVal")
	public boolean BoolVal;

	@JsonProperty("IntVal")
	public long IntVal;

	@JsonProperty("StrVal")
	public String StrVal = "";


	public SingleFieldSource(){ }

	/**
	* @return JSON representation of the SingleFieldSource
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SingleFieldSource
	* @return The deserialized SingleFieldSource
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SingleFieldSource fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SingleFieldSource.class);
	}

}
