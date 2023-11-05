
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* U2FRegistrationChallengeResponse
// deprecated since Comet version 21.12.0
*/
public class U2FRegistrationChallengeResponse {
	//If the operation was successful, the status will be in the 200-299 range.
	@JsonProperty("Status")
	public int Status;

	@JsonProperty("Message")
	public String Message = "";

	@JsonProperty("ChallengeID")
	public String ChallengeID = "";

	@JsonProperty("AppID")
	public String AppID = "";

	@JsonProperty("RegisteredKeys")
	public ArrayList<U2FRegisteredKey> RegisteredKeys;

	@JsonProperty("RegisterRequests")
	public ArrayList<U2FRegisterRequest> RegisterRequests;


	public U2FRegistrationChallengeResponse(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public U2FRegistrationChallengeResponse fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,U2FRegistrationChallengeResponse.class);
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