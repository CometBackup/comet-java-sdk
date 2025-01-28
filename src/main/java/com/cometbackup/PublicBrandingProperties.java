
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* PublicBrandingProperties
*/
public class PublicBrandingProperties {
	@JsonProperty("ProductName")
	public String ProductName = "";

	@JsonProperty("CompanyName")
	public String CompanyName = "";

	@JsonProperty("HelpURL")
	public String HelpURL = "";

	@JsonProperty("HelpIsPopup")
	public boolean HelpIsPopup;

	@JsonProperty("DefaultLoginServerURL")
	public String DefaultLoginServerURL = "";

	@JsonProperty("TileBackgroundColor")
	public String TileBackgroundColor = "";

	@JsonProperty("AccountRegisterURL")
	public String AccountRegisterURL = "";

	@JsonProperty("HideBackgroundLogo")
	public boolean HideBackgroundLogo;

	@JsonProperty("CloudStorageName")
	public String CloudStorageName = "";

	@JsonProperty("AdminHidePreBuiltClientOption")
	public boolean AdminHidePreBuiltClientOption;

	@JsonProperty("AdminHideBrandedCloudStorage")
	public boolean AdminHideBrandedCloudStorage;


	public PublicBrandingProperties(){ }

	/**
	* @return JSON representation of the PublicBrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a PublicBrandingProperties
	* @return The deserialized PublicBrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public PublicBrandingProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,PublicBrandingProperties.class);
	}

}
