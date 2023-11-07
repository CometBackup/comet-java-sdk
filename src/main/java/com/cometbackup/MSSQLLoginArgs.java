
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* MSSQLLoginArgs
*/
public class MSSQLLoginArgs {
	@JsonProperty("Instance")
	public String Instance = "";

	@JsonProperty("AuthMode")
	public String AuthMode = "";

	@JsonProperty("Username")
	public String Username = "";

	@JsonProperty("Password")
	public String Password = "";

	@JsonProperty("MethodIsOledb32Bit")
	public boolean MethodIsOledb32Bit;

	//If this MSSQLLoginArgs structure is used for a restore job (RestoreJobAdvancedOptions) using RESTORETYPE_MSSQL, then,
	//this field controls the RECOVERY / NO RECOVERY option state.
	@JsonProperty("RestoreNoRecovery")
	public boolean RestoreNoRecovery;


	public MSSQLLoginArgs(){ }

	/**
	* @return JSON representation of the MSSQLLoginArgs
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a MSSQLLoginArgs
	* @return The deserialized MSSQLLoginArgs
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public MSSQLLoginArgs fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,MSSQLLoginArgs.class);
	}

}
