
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SourceIncludePattern SourceIncludePattern is used for pattern inclusions for File and Folder Protected Items
* (ENGINE_BUILTIN_FILE).
* It should be marshalled as JSON and then stored in the PINCLUDE / RINCLUDE EngineProp keys.
*/
public class SourceIncludePattern {
	//The filesystem path to search within, for matches
	@JsonProperty("TopDirectory")
	public String TopDirectory = "";

	//The pattern (glob or regex format) to match
	@JsonProperty("Value")
	public String Value = "";


	public SourceIncludePattern(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public SourceIncludePattern fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SourceIncludePattern.class);
	}

}
