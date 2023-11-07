
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ExternalLDAPAuthenticationSourceSettings
*/
public class ExternalLDAPAuthenticationSourceSettings {
	@JsonProperty("Hostname")
	public String Hostname = "";

	@JsonProperty("Port")
	public int Port;

	//One of the LDAPSECURITYMETHOD_ constants (e.g. "plain" / "ldaps" / "starttls")
	@JsonProperty("SecurityMethod")
	public String SecurityMethod = "";

	@JsonProperty("AcceptInvalidSSL")
	public boolean AcceptInvalidSSL;

	@JsonProperty("FallbackServers")
	public ArrayList<ExternalLDAPAuthenticationSourceServer> FallbackServers;

	@JsonProperty("BindUser")
	public String BindUser = "";

	@JsonProperty("BindPassword")
	public String BindPassword = "";

	@JsonProperty("SearchDN")
	public String SearchDN = "";

	@JsonProperty("SearchFilter")
	public String SearchFilter = "";


	public ExternalLDAPAuthenticationSourceSettings(){ }

	/**
	* @return JSON representation of the ExternalLDAPAuthenticationSourceSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a ExternalLDAPAuthenticationSourceSettings
	* @return The deserialized ExternalLDAPAuthenticationSourceSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public ExternalLDAPAuthenticationSourceSettings fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ExternalLDAPAuthenticationSourceSettings.class);
	}

	/**
	* @return Returns a copy of the embedded ExternalLDAPAuthenticationSourceServer
	*/
	public ExternalLDAPAuthenticationSourceServer GetEmbeddedExternalLDAPAuthenticationSourceServer(){
		var ret = new ExternalLDAPAuthenticationSourceServer();
		ret.Hostname = this.Hostname;
		ret.Port = this.Port;
		ret.SecurityMethod = this.SecurityMethod;
		ret.AcceptInvalidSSL = this.AcceptInvalidSSL;
		return ret;
	}
	public void SetEmbeddedExternalLDAPAuthenticationSourceServer(ExternalLDAPAuthenticationSourceServer other){
		this.Hostname = other.Hostname;
		this.Port = other.Port;
		this.SecurityMethod = other.SecurityMethod;
		this.AcceptInvalidSSL = other.AcceptInvalidSSL;
	}

}
