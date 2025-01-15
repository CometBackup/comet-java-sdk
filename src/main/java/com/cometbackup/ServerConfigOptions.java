
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ServerConfigOptions
*/
public class ServerConfigOptions {
	@JsonProperty("AdminUsers")
	public ArrayList<AllowedAdminUser> AdminUsers;

	@JsonProperty("AuthenticationRole")
	public AuthenticationRoleOptions AuthenticationRole;

	@JsonProperty("Branding")
	public BrandingOptions Branding;

	@JsonProperty("ConstellationRole")
	public ConstellationRoleOptions ConstellationRole;

	//This field is defined for compatibility with 17.x.x versions of Comet Server. Do not rely on this field. In Comet
	//23.2.x, if this field is defined, it is imported into the replacement 'ConstellationRole' field under the assumption
	//that you are upgrading this Comet Server from a 17.x.x version. In Comet 23.3.x and later, this field is ignored and
	//will not be respected during the import process.
	@JsonProperty("OverseerRole")
	public ConstellationRoleOptions ConstellationRole_Legacy;

	@JsonProperty("Email")
	public EmailOptions Email;

	//An array of GUIDs that can enable additional early-access functionality
	@JsonProperty("ExperimentalOptions")
	public ArrayList<String> ExperimentalOptions;

	@JsonProperty("ExternalAdminUserSources")
	public HashMap<String, ExternalAuthenticationSource> ExternalAdminUserSources;

	//The Comet Server can enforce a bandwidth limit based on the target IP address
	@JsonProperty("IPRateLimit")
	public RatelimitOptions IPRateLimit;

	@JsonProperty("LoginProtection")
	public LoginProtectionOptions LoginProtection;

	@JsonProperty("License")
	public LicenseOptions License;

	//Configure ip, port, and SSL settings for this self-hosted Comet Server.
	@JsonProperty("ListenAddresses")
	public ArrayList<HTTPConnectorOptions> ListenAddresses;

	//Tenants
	@JsonProperty("Organizations")
	public HashMap<String, Organization> Organizations;

	@JsonProperty("PSAConfigs")
	public ArrayList<PSAConfig> PSAConfigs;

	//Automatically create backup zip files of this Comet Server's configuration
	@JsonProperty("SelfBackup")
	public SelfBackupOptions SelfBackup;

	//Control how long admin accounts can remain logged in to the Comet Server web interface
	@JsonProperty("SessionSettings")
	public SessionOptions SessionSettings;

	@JsonProperty("SoftwareBuildRole")
	public SoftwareBuildRoleOptions SoftwareBuildRole;

	@JsonProperty("StorageRole")
	public StorageRoleOptions StorageRole;

	//If true, the X-Forwarded-For header will be trusted for the purposes of IP allowlisting. This should only be enabled
	//when you explicitly configure Comet Server behind a reverse proxy, otherwise it could allow malicious users to bypass
	//the IP allowlist.
	@JsonProperty("TrustXForwardedFor")
	public boolean TrustXForwardedFor;

	@JsonProperty("WebhookOptions")
	public HashMap<String, WebhookOption> WebhookOptions;

	@JsonProperty("AuditFileOptions")
	public HashMap<String, FileOption> AuditFileOptions;


	public ServerConfigOptions(){ }

	/**
	* @return JSON representation of the ServerConfigOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a ServerConfigOptions
	* @return The deserialized ServerConfigOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public ServerConfigOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ServerConfigOptions.class);
	}

}
