
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* RequestStorageVaultResponseMessage
*/
public class RequestStorageVaultResponseMessage {
	//If the operation was successful, the status will be in the 200-299 range.
	@JsonProperty("Status")
	public int Status;

	@JsonProperty("Message")
	public String Message = "";

	@JsonProperty("DestinationID")
	public String DestinationID = "";


	public RequestStorageVaultResponseMessage(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public RequestStorageVaultResponseMessage fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,RequestStorageVaultResponseMessage.class);
	}

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
