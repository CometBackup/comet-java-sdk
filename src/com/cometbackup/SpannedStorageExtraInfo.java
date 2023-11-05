
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SpannedStorageExtraInfo
*/
public class SpannedStorageExtraInfo {
	@JsonProperty("Targets")
	public ArrayList<StorageFreeSpaceInfo> Targets;


	public SpannedStorageExtraInfo(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public SpannedStorageExtraInfo fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SpannedStorageExtraInfo.class);
	}

}
