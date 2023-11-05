
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ConstellationStats
*/
public class ConstellationStats {
	//Unix timestamp, in seconds.
	@JsonProperty("LastCheckStart")
	public long LastCheckStart;

	//The total number of Constellation bucket report scans that have been performed since this Comet Server was last
	//restarted
	@JsonProperty("TotalChecksStarted")
	public long TotalChecksStarted;

	//The total number of buckets that Constellation has successfully deleted since this Comet Server was last restarted
	@JsonProperty("TotalBucketsDeleted")
	public long TotalBucketsDeleted;

	@JsonProperty("ChecksCurrentlyActive")
	public long ChecksCurrentlyActive;


	public ConstellationStats(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public ConstellationStats fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ConstellationStats.class);
	}

}