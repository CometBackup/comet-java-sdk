
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* BrowseVSSResponse
*/
public class BrowseVSSResponse {
	//If the operation was successful, the status will be in the 200-299 range.
	@JsonProperty("Status")
	public int Status;

	@JsonProperty("Message")
	public String Message = "";

	@JsonProperty("VSSWriters")
	public HashMap<String, VSSWriterInfo> VSSWriters;


	public BrowseVSSResponse(){ }

	/**
	* @return JSON representation of the BrowseVSSResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a BrowseVSSResponse
	* @return The deserialized BrowseVSSResponse
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public BrowseVSSResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,BrowseVSSResponse.class);
	}

	/**
	* @return Returns a copy of the embedded CometAPIResponseMessage
	*/
	public CometAPIResponseMessage GetEmbeddedCometAPIResponseMessage(){
		var ret = new CometAPIResponseMessage();
		ret.Status = this.Status;
		ret.Message = this.Message;
		return ret;
	}
	public void SetEmbeddedCometAPIResponseMessage(CometAPIResponseMessage other){
		this.Status = other.Status;
		this.Message = other.Message;
	}

}