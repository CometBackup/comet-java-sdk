
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* MySQLConnection
*/
public class MySQLConnection {
	@JsonProperty("Host")
	public String Host = "";

	@JsonProperty("Port")
	public String Port = "";

	//Optional
	@JsonProperty("Username")
	public String Username = "";

	//Optional
	@JsonProperty("Password")
	public String Password = "";

	@JsonProperty("UseTLS")
	public boolean UseTLS;

	@JsonProperty("TLSSkipVerify")
	public boolean TLSSkipVerify;

	@JsonProperty("TLSCustomServerCAPath")
	public String TLSCustomServerCAPath = "";

	@JsonProperty("TLSCustomClientCrtPath")
	public String TLSCustomClientCrtPath = "";

	@JsonProperty("TLSCustomClientKeyPath")
	public String TLSCustomClientKeyPath = "";


	public MySQLConnection(){ }

	/**
	* @return JSON representation of the MySQLConnection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a MySQLConnection
	* @return The deserialized MySQLConnection
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public MySQLConnection fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,MySQLConnection.class);
	}

}