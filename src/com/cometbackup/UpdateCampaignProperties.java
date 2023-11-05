
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UpdateCampaignProperties
*/
public class UpdateCampaignProperties {
	@JsonProperty("Active")
	public boolean Active;

	@JsonProperty("UpgradeOlder")
	public boolean UpgradeOlder;

	@JsonProperty("ReinstallCurrentVer")
	public boolean ReinstallCurrentVer;

	@JsonProperty("DowngradeNewer")
	public boolean DowngradeNewer;

	//Choose whether this bulk upgrade campaign is allowed to interrupt a running backup job.
	@JsonProperty("ForceUpgradeRunning")
	public boolean ForceUpgradeRunning;

	//If true, then the UserFilter will be used to restrict which accounts and devices will be eligible for the software
	//update. If false, all users and devices will be eligible for the software update.
	@JsonProperty("ApplyDeviceFilter")
	public boolean ApplyDeviceFilter;

	@JsonProperty("DeviceFilter")
	public SearchClause DeviceFilter;

	//Unix timestamp, in seconds
	@JsonProperty("StartTime")
	public long StartTime;

	@JsonProperty("TargetVersion")
	public String TargetVersion = "";


	public UpdateCampaignProperties(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public UpdateCampaignProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UpdateCampaignProperties.class);
	}

	public UpdateCampaignOptions GetEmbeddedUpdateCampaignOptions(){
		var ret = new UpdateCampaignOptions();
		ret.Active = this.Active;
		ret.UpgradeOlder = this.UpgradeOlder;
		ret.ReinstallCurrentVer = this.ReinstallCurrentVer;
		ret.DowngradeNewer = this.DowngradeNewer;
		ret.ForceUpgradeRunning = this.ForceUpgradeRunning;
		ret.ApplyDeviceFilter = this.ApplyDeviceFilter;
		ret.DeviceFilter = this.DeviceFilter;
		return ret;
	}
	public void SetEmbeddedUpdateCampaignOptions(UpdateCampaignOptions other){
		this.Active = other.Active;
		this.UpgradeOlder = other.UpgradeOlder;
		this.ReinstallCurrentVer = other.ReinstallCurrentVer;
		this.DowngradeNewer = other.DowngradeNewer;
		this.ForceUpgradeRunning = other.ForceUpgradeRunning;
		this.ApplyDeviceFilter = other.ApplyDeviceFilter;
		this.DeviceFilter = other.DeviceFilter;
	}

}
