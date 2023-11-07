
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* Office365MixedVirtualAccount
*/
public class Office365MixedVirtualAccount {
	@JsonProperty("id")
	public String ID = "";

	@JsonProperty("Type")
	public long Type;

	@JsonProperty("DisplayName")
	public String DisplayName = "";

	@JsonProperty("Mail")
	public String Mail = "";

	@JsonProperty("JobTitle")
	public String JobTitle = "";

	@JsonProperty("SiteID")
	public String SiteID = "";

	@JsonProperty("WebID")
	public String WebID = "";

	@JsonProperty("WebURL")
	public String WebURL = "";

	@JsonProperty("UserPrincipalName")
	public String UserPrincipalName = "";

	@JsonProperty("EnabledServiceOption")
	public long EnabledServiceOption;

	@JsonProperty("Members")
	public ArrayList<String> Members;

	@JsonProperty("ServiceOptions")
	public long ServiceOptions;

	@JsonProperty("MemberServiceOptions")
	public long MemberServiceOptions;

	@JsonProperty("hasLicense")
	public boolean HasLicense;


	public Office365MixedVirtualAccount(){ }

	/**
	* @return JSON representation of the Office365MixedVirtualAccount
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a Office365MixedVirtualAccount
	* @return The deserialized Office365MixedVirtualAccount
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public Office365MixedVirtualAccount fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,Office365MixedVirtualAccount.class);
	}

}
