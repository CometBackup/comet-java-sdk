
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* OSInfo OSInfo represents the common set of version information between all operating systems
*/
public class OSInfo {
	//The primary version number (e.g. on Windows: 1703 / 2009, on Linux: 20.04 / 22.04)
	@JsonProperty("version")
	public String Version = "";

	//The primary presentation name (e.g. "Windows 10 Pro", "debian", "Synology DSM")
	@JsonProperty("distribution")
	public String Distribution = "";

	//The detailed build number (e.g. 19043)
	@JsonProperty("build")
	public String Build = "";

	//The GOOS value
	@JsonProperty("os")
	public String OS = "";

	//The GOARCH value
	@JsonProperty("arch")
	public String Arch = "";


	public OSInfo(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public OSInfo fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,OSInfo.class);
	}

}
