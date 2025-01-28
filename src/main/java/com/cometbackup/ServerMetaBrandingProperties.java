
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* ServerMetaBrandingProperties
*/
public class ServerMetaBrandingProperties {
	@JsonProperty("BrandName")
	public String BrandName = "";

	@JsonProperty("ProductName")
	public String ProductName = "";

	//If true, this Comet Server has an image configured for its main logo. You can access it from the /gen/logo.img
	//endpoint. If false, this Comet Server has text configured for its main logo.
	@JsonProperty("HasImage")
	public boolean HasImage;

	//A value that will change if the branding image (/gen/logo.img) changes. You can use this as a cache key.
	@JsonProperty("ImageEtag")
	public String ImageEtag = "";

	//Colour in RGB hex format (e.g. "#FFFFFF")
	@JsonProperty("TopColor")
	public String TopColor = "";

	//Colour in RGB hex format (e.g. "#FFFFFF")
	@JsonProperty("AccentColor")
	public String AccentColor = "";

	@JsonProperty("HideNewsArea")
	public boolean HideNewsArea;

	@JsonProperty("AllowUnauthenticatedDownloads")
	public boolean AllowUnauthenticatedDownloads;

	@JsonProperty("AllowAuthenticatedDownloads")
	public boolean AllowAuthenticatedDownloads;

	@JsonProperty("PruneLogsAfterDays")
	public long PruneLogsAfterDays;

	@JsonProperty("ExpiredInSeconds")
	public long ExpiredInSeconds;

	@JsonProperty("ExternalAuthenticationSources")
	public ArrayList<ExternalAuthenticationSourceDisplay> ExternalAuthenticationSources;

	//If true, this Comet Server currently has no admins or users.
	@JsonProperty("ServerIsEmpty")
	public boolean ServerIsEmpty;

	@JsonProperty("CloudStorageName")
	public String CloudStorageName = "";

	//Will hide the "Pre-built software client" option from the server settings. Only properly enforced when custom
	//branding is enforced via the license.
	@JsonProperty("AdminHidePreBuiltClientOption")
	public boolean AdminHidePreBuiltClientOption;

	//Will hide Comet Storage from everywhere, including the admin view. Only properly enforced when custom branding is
	//enforced via the license.
	@JsonProperty("AdminHideBrandedCloudStorage")
	public boolean AdminHideBrandedCloudStorage;


	public ServerMetaBrandingProperties(){ }

	/**
	* @return JSON representation of the ServerMetaBrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a ServerMetaBrandingProperties
	* @return The deserialized ServerMetaBrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public ServerMetaBrandingProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,ServerMetaBrandingProperties.class);
	}

}
