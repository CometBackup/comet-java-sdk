
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* SelfBackupExportOptions
*/
public class SelfBackupExportOptions {
	@JsonProperty("Location")
	public DestinationLocation Location;

	@JsonProperty("EncryptionKey")
	public String EncryptionKey = "";

	//One of the ENCRYPTIONMETHOD_ constants
	@JsonProperty("EncryptionKeyFormat")
	public long EncryptionKeyFormat;

	//One of the COMPRESS_LVL_ constants
	@JsonProperty("Compression")
	public int Compression;

	//The jobs database is often the largest component of the Server Self-Backup archive. By excluding it, you could run
	//the Server Self-Backup more often.
	@JsonProperty("ExcludeJobsDB")
	public boolean ExcludeJobsDB;

	@JsonProperty("IncludeServerLogs")
	public boolean IncludeServerLogs;

	@JsonProperty("RestrictToSingleOrgID")
	public String RestrictToSingleOrgID = "";

	@JsonProperty("Index")
	public int Index;


	public SelfBackupExportOptions(){ }

	/**
	* @return JSON representation of the SelfBackupExportOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a SelfBackupExportOptions
	* @return The deserialized SelfBackupExportOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public SelfBackupExportOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,SelfBackupExportOptions.class);
	}

}
