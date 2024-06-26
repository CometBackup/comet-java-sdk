
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ImpossibleCloudIAMTemplateSettings
* @since Version : 24.3.1
*/
public class ImpossibleCloudIAMTemplateSettings {
	@JsonProperty("AccessKey")
	public String AccessKey = "";

	@JsonProperty("SecretKey")
	public String SecretKey = "";

	//Optional. The region for both IAM communication and for provisioning new buckets. If blank, uses the default region
	//for Impossible Cloud (eu-central-2).
	@JsonProperty("Region")
	public String Region = "";


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


	public ImpossibleCloudIAMTemplateSettings(){ }

	/**
	* @return JSON representation of the ImpossibleCloudIAMTemplateSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a ImpossibleCloudIAMTemplateSettings
	* @return The deserialized ImpossibleCloudIAMTemplateSettings
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public ImpossibleCloudIAMTemplateSettings fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ImpossibleCloudIAMTemplateSettings.class);
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
