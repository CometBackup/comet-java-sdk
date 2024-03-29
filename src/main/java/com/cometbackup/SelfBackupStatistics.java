
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SelfBackupStatistics
*/
public class SelfBackupStatistics {
	@JsonProperty("CurrentRunStart")
	public long CurrentRunStart;

	@JsonProperty("LastRunStart")
	public long LastRunStart;

	@JsonProperty("LastRunEnd")
	public long LastRunEnd;

	@JsonProperty("LastRunSuccess")
	public boolean LastRunSuccess;

	@JsonProperty("LastRunSize")
	public long LastRunSize;


	public SelfBackupStatistics(){ }

	/**
	* @return JSON representation of the SelfBackupStatistics
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SelfBackupStatistics
	* @return The deserialized SelfBackupStatistics
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SelfBackupStatistics fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SelfBackupStatistics.class);
	}

}
