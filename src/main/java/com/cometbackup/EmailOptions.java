
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* EmailOptions
*/
public class EmailOptions {
	@JsonProperty("FromEmail")
	public String FromEmail = "";

	@JsonProperty("FromName")
	public String FromName = "";

	//One of the EMAIL_DELIVERY_ constants
	@JsonProperty("Mode")
	public String Mode = "";

	@JsonProperty("EmailReportingOptions")
	public ArrayList<EmailReportingOption> EmailReportingOptions;

	@JsonProperty("SMTPHost")
	public String SMTPHost = "";

	@JsonProperty("SMTPPort")
	public int SMTPPort;

	@JsonProperty("SMTPUsername")
	public String SMTPUsername = "";

	@JsonProperty("SMTPPassword")
	public String SMTPPassword = "";

	@JsonProperty("SMTPAllowInvalidCertificate")
	public boolean SMTPAllowInvalidCertificate;

	@JsonProperty("SMTPAllowUnencrypted")
	public boolean SMTPAllowUnencrypted;

	//Override the HELO/EHLO hostname for SMTP or MX Direct modes. If blank, uses system default HELO/EHLO hostname.
	@JsonProperty("SMTPCustomEhlo")
	public String SMTPCustomEhlo = "";


	public EmailOptions(){ }

	/**
	* @return JSON representation of the EmailOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a EmailOptions
	* @return The deserialized EmailOptions
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public EmailOptions fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,EmailOptions.class);
	}

	/**
	* @return Returns a copy of the embedded AdminEmailOptions
	*/
	public AdminEmailOptions GetEmbeddedAdminEmailOptions(){
		var ret = new AdminEmailOptions();
		ret.FromEmail = this.FromEmail;
		ret.FromName = this.FromName;
		return ret;
	}
	public void SetEmbeddedAdminEmailOptions(AdminEmailOptions other){
		this.FromEmail = other.FromEmail;
		this.FromName = other.FromName;
	}

}
