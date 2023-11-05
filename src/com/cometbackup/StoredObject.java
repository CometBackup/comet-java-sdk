
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* StoredObject
*/
public class StoredObject {
	//The name of the stored object. It is unique within this directory tree.
	@JsonProperty("name")
	public String Name = "";

	//Unix timestamp in seconds
	@JsonProperty("mtime")
	public long ModifyTime;

	//One of the STOREDOBJECTTYPE_... constant values
	@JsonProperty("type")
	public String Type = "";

	//If this StoredObject represents a directory, this value can be used to recursively select the directory contents.
	@JsonProperty("subtree")
	public String Subtree = "";

	//Bytes
	@JsonProperty("size")
	public long Size;

	@JsonProperty("dname")
	public String DisplayName = "";

	@JsonProperty("itemClass")
	public String ItemClass = "";

	@JsonProperty("from")
	public String From = "";

	@JsonProperty("to")
	public String To = "";

	@JsonProperty("rtime")
	public long ReceivedDateTime;

	@JsonProperty("has_attachments")
	public boolean HasAttachments;

	//Unix timestamp in seconds
	@JsonProperty("stime")
	public long StartTime;

	//Unix timestamp in seconds
	@JsonProperty("etime")
	public long EndTime;

	@JsonProperty("r")
	public boolean RecursiveCountKnown;

	@JsonProperty("f")
	public long RecursiveFiles;

	@JsonProperty("b")
	public long RecursiveBytes;

	@JsonProperty("d")
	public long RecursiveFolders;


	public StoredObject(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public StoredObject fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,StoredObject.class);
	}

}
