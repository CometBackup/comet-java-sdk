
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SearchResultFileInfo SearchResultFileInfo describes a single result entry when searching for files within a Storage
* Vault snapshot.
*/
public class SearchResultFileInfo {
	//Path to the file within the selected snapshot, using forwardslash (/) separators
	@JsonProperty("path")
	public String Path = "";

	//Filename
	@JsonProperty("name")
	public String Name = "";

	//One of the STOREDOBJECTTYPE_ constants
	@JsonProperty("type")
	public String Type = "";

	@JsonProperty("mode")
	public String Mode = "";

	//Timestamp in RFC3339 format with subsecond precision and time zone offset. See the Golang time.RFC3339Nano for more
	//information.
	@JsonProperty("mtime")
	public String ModTime = "";

	//Timestamp in RFC3339 format with subsecond precision and time zone offset. See the Golang time.RFC3339Nano for more
	//information.
	@JsonProperty("atime")
	public String AccessTime = "";

	//Timestamp in RFC3339 format with subsecond precision and time zone offset. See the Golang time.RFC3339Nano for more
	//information.
	@JsonProperty("ctime")
	public String ChangeTime = "";

	//Bytes
	@JsonProperty("size")
	public long Size;


	public SearchResultFileInfo(){ }

	/**
	* @return JSON representation of the SearchResultFileInfo
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SearchResultFileInfo
	* @return The deserialized SearchResultFileInfo
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SearchResultFileInfo fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SearchResultFileInfo.class);
	}

}