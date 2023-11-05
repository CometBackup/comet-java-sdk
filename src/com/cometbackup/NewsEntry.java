
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* NewsEntry
*/
public class NewsEntry {
	@JsonProperty("OrganizationID")
	public String OrganizationID = "";

	//Unix timestamp, in seconds.
	@JsonProperty("DateTime")
	public long DateTime;

	@JsonProperty("TextContent")
	public String TextContent = "";


	public NewsEntry(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public NewsEntry fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,NewsEntry.class);
	}

}
