
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* Office365CustomSettingV2 Office365CustomSettingV2 is used in the EngineProps for an Office 365 Protected Item (see
* ENGINE_BUILTIN_MSOFFICE).
* @since Version : 21.9.xx
*/
public class Office365CustomSettingV2 {
	//If true, then backup the entire Office 365 Tenant except the selected members. If false, backup the selected members
	//only.
	@JsonProperty("Organization")
	public boolean Organization;

	//Key can be the ID of user, group or SharePoint
	//Value is a bitset of the SERVICE_ constants, to select which services to back up for this member.
	@JsonProperty("BackupOptions")
	public HashMap<String, Long> BackupOptions;

	//Key must be a group ID
	//Value is a bitset of the SERVICE_ constants, to select which services to back up for this member.
	@JsonProperty("MemberBackupOptions")
	public HashMap<String, Long> MemberBackupOptions;


	public Office365CustomSettingV2(){ }

	/**
	* @return JSON representation of the Office365CustomSettingV2
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a Office365CustomSettingV2
	* @return The deserialized Office365CustomSettingV2
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public Office365CustomSettingV2 fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,Office365CustomSettingV2.class);
	}

}
