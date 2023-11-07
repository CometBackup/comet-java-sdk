
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ReplicaServer
*/
public class ReplicaServer {
	@JsonProperty("Type")
	public String Type = "";

	@JsonProperty("Description")
	public String Description = "";

	@JsonProperty("RemoteAddress")
	public String RemoteAddress = "";

	@JsonProperty("Username")
	public String Username = "";

	@JsonProperty("Password")
	public String Password = "";

	@JsonProperty("LDAP")
	public ExternalLDAPAuthenticationSourceSettings LDAP;

	@JsonProperty("OIDC")
	public OidcConfig OIDC;

	@JsonProperty("B2")
	public B2VirtualStorageRoleSettings B2;

	@JsonProperty("Wasabi")
	public WasabiVirtualStorageRoleSettings Wasabi;

	@JsonProperty("Custom")
	public CustomRemoteBucketSettings Custom;

	@JsonProperty("S3")
	public S3GenericVirtualStorageRole S3;

	//Amazon AWS - Virtual Storage Role
	@JsonProperty("AWS")
	public AmazonAWSVirtualStorageRoleSettings AWS;

	@JsonProperty("Storj")
	public StorjVirtualStorageRoleSetting Storj;

	@JsonProperty("ReplicaDeletionStrategy")
	public String ReplicaDeletionStrategy = "";


	public ReplicaServer(){ }

	/**
	* @return JSON representation of the ReplicaServer
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a ReplicaServer
	* @return The deserialized ReplicaServer
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public ReplicaServer fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ReplicaServer.class);
	}

	/**
	* @return Returns a copy of the embedded RemoteServerAddress
	*/
	public RemoteServerAddress GetEmbeddedRemoteServerAddress(){
		var ret = new RemoteServerAddress();
		ret.Type = this.Type;
		ret.Description = this.Description;
		ret.RemoteAddress = this.RemoteAddress;
		ret.Username = this.Username;
		ret.Password = this.Password;
		ret.LDAP = this.LDAP;
		ret.OIDC = this.OIDC;
		ret.B2 = this.B2;
		ret.Wasabi = this.Wasabi;
		ret.Custom = this.Custom;
		ret.S3 = this.S3;
		ret.AWS = this.AWS;
		ret.Storj = this.Storj;
		return ret;
	}
	public void SetEmbeddedRemoteServerAddress(RemoteServerAddress other){
		this.Type = other.Type;
		this.Description = other.Description;
		this.RemoteAddress = other.RemoteAddress;
		this.Username = other.Username;
		this.Password = other.Password;
		this.LDAP = other.LDAP;
		this.OIDC = other.OIDC;
		this.B2 = other.B2;
		this.Wasabi = other.Wasabi;
		this.Custom = other.Custom;
		this.S3 = other.S3;
		this.AWS = other.AWS;
		this.Storj = other.Storj;
	}

}
