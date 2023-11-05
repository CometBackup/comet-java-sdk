
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UpdateCampaignStatusDeviceEntry
*/
public class UpdateCampaignStatusDeviceEntry {
	@JsonProperty("Username")
	public String Username = "";

	@JsonProperty("DeviceID")
	public String DeviceID = "";

	//One of the UPDATESTATUS_ constants
	@JsonProperty("Status")
	public int Status;


	public UpdateCampaignStatusDeviceEntry(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public UpdateCampaignStatusDeviceEntry fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UpdateCampaignStatusDeviceEntry.class);
	}

	public UpdateCampaignDeviceStatus GetEmbeddedUpdateCampaignDeviceStatus(){
		var ret = new UpdateCampaignDeviceStatus();
		ret.Status = this.Status;
		return ret;
	}
	public void SetEmbeddedUpdateCampaignDeviceStatus(UpdateCampaignDeviceStatus other){
		this.Status = other.Status;
	}

}
