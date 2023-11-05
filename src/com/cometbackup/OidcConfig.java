
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* OidcConfig
*/
public class OidcConfig {
	@JsonProperty("DisplayName")
	public String DisplayName = "";

	@JsonProperty("Hosts")
	public ArrayList<String> Hosts;

	@JsonProperty("OrganizationID")
	public String OrganizationID = "";

	@JsonProperty("Provider")
	public String Provider = "";

	@JsonProperty("ClientID")
	public String ClientID = "";

	@JsonProperty("ClientSecret")
	public String ClientSecret = "";

	@JsonProperty("SkipMFA")
	public boolean SkipMFA;

	@JsonProperty("Scopes")
	public ArrayList<String> Scopes;

	@JsonProperty("RequiredClaims")
	public ArrayList<OidcClaim> RequiredClaims;

	@JsonProperty("DiscoveryDocumentURL")
	public String GenericOP_DiscoveryDocumentURL = "";

	@JsonProperty("AzureTenantID")
	public String AzureADV2OP_TenantID = "";

	@JsonProperty("GoogleHostedDomain")
	public String GoogleOP_HostedDomain = "";


	public OidcConfig(){ }

	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	static public OidcConfig fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,OidcConfig.class);
	}

}
