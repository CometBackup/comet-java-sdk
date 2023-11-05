
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* UninstallConfig UninstallConfig allows configuring whether the target device will be uninstalled or not.
*/
public class UninstallConfig {
	//If this option is true, the target device will receive a message asking it to uninstall the Comet Backup app.
	@JsonProperty("UninstallFlag")
	public boolean UninstallFlag;

	//This controls the "Remove all user settings from this device" option.
	@JsonProperty("RemoveConfigFile")
	public boolean RemoveConfigFile;


	public UninstallConfig(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public UninstallConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,UninstallConfig.class);
	}

}