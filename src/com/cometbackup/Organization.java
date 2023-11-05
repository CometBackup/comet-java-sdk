
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* Organization
*/
public class Organization {
	@JsonProperty("AuditFileOptions")
	public HashMap<String, FileOption> AuditFileOptions;

	@JsonProperty("Branding")
	public BrandingOptions Branding;

	@JsonProperty("ConstellationRole")
	public ConstellationRoleOptions ConstellationRole;

	@JsonProperty("Email")
	public EmailOptions Email;

	@JsonProperty("ExperimentalOptions")
	public ArrayList<String> ExperimentalOptions;

	@JsonProperty("Hosts")
	public ArrayList<String> Hosts;

	@JsonProperty("Name")
	public String Name = "";

	@JsonProperty("IsSuspended")
	public boolean IsSuspended;

	@JsonProperty("PSAConfigs")
	public ArrayList<PSAConfig> PSAConfigs;

	@JsonProperty("RemoteStorage")
	public ArrayList<RemoteStorageOption> RemoteStorage;

	@JsonProperty("SoftwareBuildRole")
	public SoftwareBuildRoleOptions SoftwareBuildRole;

	@JsonProperty("WebhookOptions")
	public HashMap<String, WebhookOption> WebhookOptions;


	public Organization(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public Organization fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,Organization.class);
	}

}
