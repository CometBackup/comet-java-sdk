
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* VMDKSnapshotViewOptions
*/
public class VMDKSnapshotViewOptions {
	//Request a list of stored objects in vmdk file. It should be always true for restoring single files from vmdk file
	@JsonProperty("Enabled")
	public boolean Enabled;

	//The vmdk filename inside subdirectory of disk image, should be end with .vmdk
	@JsonProperty("PartitionGUID")
	public String PartitionGUID = "";

	//Browse objects' paths inside vmdk file
	@JsonProperty("ListPath")
	public String ListPath = "";

	@JsonProperty("PartitionName")
	public String PartitionName = "";


	public VMDKSnapshotViewOptions(){ }

	/**
	* @return JSON representation of the VMDKSnapshotViewOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a VMDKSnapshotViewOptions
	* @return The deserialized VMDKSnapshotViewOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public VMDKSnapshotViewOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,VMDKSnapshotViewOptions.class);
	}

}