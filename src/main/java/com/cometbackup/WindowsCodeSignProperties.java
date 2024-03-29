
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* WindowsCodeSignProperties
*/
public class WindowsCodeSignProperties {
	//One of the WINDOWSCODESIGN_METHOD_ constants
	@JsonProperty("WindowsCodeSignMethod")
	public int WindowsCodeSignMethod;

	@JsonProperty("WindowsCodeSignPKCS12FilePath")
	public String WindowsCodeSignPKCS12FilePath = "";

	//One of the ENCRYPTIONMETHOD_ constants
	@JsonProperty("WindowsCodeSignPKCS12PasswordFormat")
	public long WindowsCodeSignPKCS12PasswordFormat;

	@JsonProperty("WindowsCodeSignPKCS12Password")
	public String WindowsCodeSignPKCS12Password = "";

	@JsonProperty("WindowsCodeSignPKCS11Engine")
	public String WindowsCodeSignPKCS11Engine = "";

	@JsonProperty("WindowsCodeSignPKCS11Module")
	public String WindowsCodeSignPKCS11Module = "";

	//This field was deprecated between 23.3.0 and 23.6.x, but is now used again.
	@JsonProperty("WindowsCodeSignPKCS11Certfile")
	public String WindowsCodeSignPKCS11Certfile = "";

	@JsonProperty("WindowsCodeSignPKCS11KeyID")
	public String WindowsCodeSignPKCS11KeyID = "";

	//One of the ENCRYPTIONMETHOD_ constants
	@JsonProperty("WindowsCodeSignPKCS11PasswordFormat")
	public long WindowsCodeSignPKCS11PasswordFormat;

	@JsonProperty("WindowsCodeSignPKCS11Password")
	public String WindowsCodeSignPKCS11Password = "";

	@JsonProperty("WindowsCodeSignAzureVaultName")
	public String WindowsCodeSignAzureVaultName = "";

	@JsonProperty("WindowsCodeSignAzureCertName")
	public String WindowsCodeSignAzureCertName = "";

	@JsonProperty("WindowsCodeSignAzureAppID")
	public String WindowsCodeSignAzureAppID = "";

	//One of the ENCRYPTIONMETHOD_ constants
	@JsonProperty("WindowsCodeSignAzureAppSecretFormat")
	public long WindowsCodeSignAzureAppSecretFormat;

	@JsonProperty("WindowsCodeSignAzureAppSecret")
	public String WindowsCodeSignAzureAppSecret = "";

	@JsonProperty("WindowsCodeSignAzureTenantID")
	public String WindowsCodeSignAzureTenantID = "";


	public WindowsCodeSignProperties(){ }

	/**
	* @return JSON representation of the WindowsCodeSignProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a WindowsCodeSignProperties
	* @return The deserialized WindowsCodeSignProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public WindowsCodeSignProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,WindowsCodeSignProperties.class);
	}

}
