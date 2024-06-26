
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SourceConfig
*/
public class SourceConfig {
	//One of the ENGINE_BUILTIN_ constants
	@JsonProperty("Engine")
	public String Engine = "";

	@JsonProperty("Description")
	public String Description = "";

	@JsonProperty("OwnerDevice")
	public String OwnerDevice = "";

	//Unix timestamp in seconds
	@JsonProperty("CreateTime")
	public long CreateTime;

	//Unix timestamp in seconds
	@JsonProperty("ModifyTime")
	public long ModifyTime;

	//Custom commands to run before the job
	@JsonProperty("PreExec")
	public ArrayList<String> PreExec;

	//Custom commands to run after taking a disk snapshot
	@JsonProperty("ThawExec")
	public ArrayList<String> ThawExec;

	//Custom commands to run after the job
	@JsonProperty("PostExec")
	public ArrayList<String> PostExec;

	//Configuration for the selected Protected Item type. Each "Engine" supports
	//different configuration options for the EngineProps values.
	//
	//For engine1/file, Comet understands the following EngineProp keys:
	//
	//- Any key starting with INCLUDE: A path that is included
	//- Any key starting with EXCLUDE: An exclusion (glob format)
	//- Any key starting with REXCLUDE: An exclusion (regular expression format)
	//- Any key starting with PINCLUDE: A SourceIncludePattern type encoded in JSON format, describing an advanced
	//inclusion in glob format
	//- Any key starting with RINCLUDE: A SourceIncludePattern type encoded in JSON format, describing an advanced
	//inclusion in regular expression format
	//- Any key starting with SMBAUTH: A set of Windows network share credentials in WinSMBAuth JSON format
	//- USE_WIN_VSS: If present, the 'Take filesystem snapshot' checkbox is checked
	//- CONFIRM_EFS: If present, the 'Dismiss EFS warning' checkbox is checked
	//- RESCAN_UNCHANGED: If present, the 'Rescan unchanged files' checkbox is checked
	//- EXTRA_ATTRIBUTES: If present, the 'Back up extra system permissions and attributes' checkbox is checked
	//
	//For engine1/mssql, Comet understands the following EngineProp keys:
	//
	//- ALL_DATABASES: If present, include all databases with specified exclusions. If not present, only back up the
	//specified inclusions
	//- Any key starting with DATABASE- : A database that is included. Only valid if ALL_DATABASES is not present.
	//- Any key starting with EXCEPT-DATABASE- : A database that is excluded. Only valid if ALL_DATABASES is present.
	//- INSTANCE: The Microsoft SQL Server instance name
	//- USERNAME: The username to connect to Microsoft SQL Server
	//- PASSWORD: The password to connect to Microsoft SQL Server
	//- AUTHMODE: Either "windows" or "native" (corresponding to the declared MSSQL_AUTH_WINDOWS and MSSQL_AUTH_NATIVE
	//constant values). If not present, use native authentication if the USERNAME and/or PASSWORD fields are filled in, use
	//windows authentication if they are blank
	//- METHOD: Either "OLEDB_NATIVE" or "OLEDB_32" (corresponding to the declared MSSQL_METHOD_OLEDB_NATIVE and
	//MSSQL_METHOD_OLEDB_32 constant values). If not present, defaults to Native
	//- DIFFBASE: If present, take a "Full (base image)" backup job. Otherwise, take a "Full (copy only)" backup job.
	//- DIFFERENTIAL: If present, take a "Differential increment" backup job. Otherwise, take a "Full (copy only)" backup
	//job.
	//- LOGTRUNC: If present, take a "Log (truncating)" backup job. Otherwise, take a "Full (copy only)" backup job.
	//- LOGNOTRUNC: If present, take a "Log (no truncation)" backup job. Otherwise, take a "Full (copy only)" backup job.
	//
	@JsonProperty("EngineProps")
	public HashMap<String, String> EngineProps;

	//If set, this SourceConfig was added from a Policy with the specified ID.
	@JsonProperty("PolicySourceID")
	public String PolicySourceID = "";

	//For a Policy-defined SourceConfig, this field controls whether the Protected Item will stay linked with the policy.
	@JsonProperty("ExistingUserUpdate")
	public boolean ExistingUserUpdate;

	//By default, backup jobs from this Protected Item will be subject
	//to the overall retention policy for the Storage Vault. You can override the policy
	//for specific Storage Vaults by putting their destination ID as a key here.
	@JsonProperty("OverrideDestinationRetention")
	public HashMap<String, RetentionPolicy> OverrideDestinationRetention;

	@JsonProperty("Statistics")
	public SourceStatistics Statistics;


	public SourceConfig(){ }

	/**
	* @return JSON representation of the SourceConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SourceConfig
	* @return The deserialized SourceConfig
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SourceConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SourceConfig.class);
	}

}
