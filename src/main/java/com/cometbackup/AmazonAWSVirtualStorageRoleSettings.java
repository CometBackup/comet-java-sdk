
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* AmazonAWSVirtualStorageRoleSettings
*/
public class AmazonAWSVirtualStorageRoleSettings {
	//If set, the Storage Template will generate Storage Vaults pointing to a subdirectory within this bucket. A single
	//dynamic IAM policy will cover all created Storage Vaults.
	//This is preferable for platforms that have limits on the total number of IAM policies. However, it requires a high
	//level of IAM compatibility.
	//If left blank, the Storage Template will generate Storage Vaults pointing to new, separate S3 buckets each time. An
	//additional IAM policy is created for each new Storage Vault.
	//This is preferable for platforms that have a lower level of IAM compatibility.
	@JsonProperty("MasterBucket")
	public String MasterBucket = "";

	@JsonProperty("AccessKey")
	public String AccessKey = "";

	@JsonProperty("SecretKey")
	public String SecretKey = "";


	// deprecated since Comet version 23.x.x
	@JsonProperty("UseObjectLock")
	public boolean UseObjectLock_Legacy_DoNotUse;

	//Control whether the resulting Storage Vaults are configured for Object Lock. One of the OBJECT_LOCK_ constants
	@JsonProperty("ObjectLockMode")
	public short ObjectLockMode;

	@JsonProperty("ObjectLockDays")
	public int ObjectLockDays;

	//Control whether the "Allow removal of deleted files" checkbox is enabled for Storage Vaults generated from this
	//Storage Template.
	//When configuring a Storage Template from the Comet Server web interface, this field is set automatically for Storage
	//Templates using Object Lock.
	@JsonProperty("RemoveDeleted")
	public boolean RemoveDeleted;


	public AmazonAWSVirtualStorageRoleSettings(){ }

	/**
	* @return JSON representation of the AmazonAWSVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a AmazonAWSVirtualStorageRoleSettings
	* @return The deserialized AmazonAWSVirtualStorageRoleSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public AmazonAWSVirtualStorageRoleSettings fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,AmazonAWSVirtualStorageRoleSettings.class);
	}

	/**
	* @return Returns a copy of the embedded ObjectLockStorageTemplateSettings
	*/
	public ObjectLockStorageTemplateSettings GetEmbeddedObjectLockStorageTemplateSettings(){
		var ret = new ObjectLockStorageTemplateSettings();
		ret.UseObjectLock_Legacy_DoNotUse = this.UseObjectLock_Legacy_DoNotUse;
		ret.ObjectLockMode = this.ObjectLockMode;
		ret.ObjectLockDays = this.ObjectLockDays;
		ret.RemoveDeleted = this.RemoveDeleted;
		return ret;
	}
	public void SetEmbeddedObjectLockStorageTemplateSettings(ObjectLockStorageTemplateSettings other){
		this.UseObjectLock_Legacy_DoNotUse = other.UseObjectLock_Legacy_DoNotUse;
		this.ObjectLockMode = other.ObjectLockMode;
		this.ObjectLockDays = other.ObjectLockDays;
		this.RemoveDeleted = other.RemoveDeleted;
	}

}
