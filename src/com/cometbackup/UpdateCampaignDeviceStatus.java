
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UpdateCampaignDeviceStatus
*/
public class UpdateCampaignDeviceStatus {
	//One of the UPDATESTATUS_ constants
	@JsonProperty("Status")
	public int Status;


	public UpdateCampaignDeviceStatus(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public UpdateCampaignDeviceStatus fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UpdateCampaignDeviceStatus.class);
	}

}