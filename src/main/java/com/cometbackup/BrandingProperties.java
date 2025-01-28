
// AUTOGENERATED, DO NOT EDIT\n\n"
package com.cometbackup;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.*;

/**
* BrandingProperties
*/
public class BrandingProperties {
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

	//One of the CLIENTBRANDINGBUILD_ constants
	@JsonProperty("BuildMode")
	public int BuildMode;

	@JsonProperty("PathIcoFile")
	public String PathIcoFile = "";

	@JsonProperty("PathIcnsFile")
	public String PathIcnsFile = "";

	@JsonProperty("PathMenuBarIcnsFile")
	public String PathMenuBarIcnsFile = "";

	@JsonProperty("PathEulaRtf")
	public String PathEulaRtf = "";

	@JsonProperty("PathTilePng")
	public String PathTilePng = "";

	@JsonProperty("PathHeaderImage")
	public String PathHeaderImage = "";

	@JsonProperty("PathAppIconImage")
	public String PathAppIconImage = "";

	@JsonProperty("PackageIdentifier")
	public String PackageIdentifier = "";

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

	@JsonProperty("MacOSCodeSign")
	public MacOSCodeSignProperties MacOSCodeSign;


	public BrandingProperties(){ }

	/**
	* @return JSON representation of the BrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	public String toJson() throws JsonProcessingException {
		return CometAPI.getObjectMapper().writeValueAsString(this);
	}

	/**
	* @param jsStr JSON representation of a BrandingProperties
	* @return The deserialized BrandingProperties
	* @throws JsonProcessingException If JSON is malformed (should not happen)
	*/
	static public BrandingProperties fromJson(String jsStr) throws JsonProcessingException {
		return CometAPI.getObjectMapper().readValue(jsStr,BrandingProperties.class);
	}

	/**
	* @return Returns a copy of the embedded PublicBrandingProperties
	*/
	public PublicBrandingProperties GetEmbeddedPublicBrandingProperties(){
		var ret = new PublicBrandingProperties();
		ret.ProductName = this.ProductName;
		ret.CompanyName = this.CompanyName;
		ret.HelpURL = this.HelpURL;
		ret.HelpIsPopup = this.HelpIsPopup;
		ret.DefaultLoginServerURL = this.DefaultLoginServerURL;
		ret.TileBackgroundColor = this.TileBackgroundColor;
		ret.AccountRegisterURL = this.AccountRegisterURL;
		ret.HideBackgroundLogo = this.HideBackgroundLogo;
		ret.CloudStorageName = this.CloudStorageName;
		ret.AdminHidePreBuiltClientOption = this.AdminHidePreBuiltClientOption;
		ret.AdminHideBrandedCloudStorage = this.AdminHideBrandedCloudStorage;
		return ret;
	}
	public void SetEmbeddedPublicBrandingProperties(PublicBrandingProperties other){
		this.ProductName = other.ProductName;
		this.CompanyName = other.CompanyName;
		this.HelpURL = other.HelpURL;
		this.HelpIsPopup = other.HelpIsPopup;
		this.DefaultLoginServerURL = other.DefaultLoginServerURL;
		this.TileBackgroundColor = other.TileBackgroundColor;
		this.AccountRegisterURL = other.AccountRegisterURL;
		this.HideBackgroundLogo = other.HideBackgroundLogo;
		this.CloudStorageName = other.CloudStorageName;
		this.AdminHidePreBuiltClientOption = other.AdminHidePreBuiltClientOption;
		this.AdminHideBrandedCloudStorage = other.AdminHideBrandedCloudStorage;
	}

	/**
	* @return Returns a copy of the embedded PrivateBrandingProperties
	*/
	public PrivateBrandingProperties GetEmbeddedPrivateBrandingProperties(){
		var ret = new PrivateBrandingProperties();
		ret.BuildMode = this.BuildMode;
		ret.PathIcoFile = this.PathIcoFile;
		ret.PathIcnsFile = this.PathIcnsFile;
		ret.PathMenuBarIcnsFile = this.PathMenuBarIcnsFile;
		ret.PathEulaRtf = this.PathEulaRtf;
		ret.PathTilePng = this.PathTilePng;
		ret.PathHeaderImage = this.PathHeaderImage;
		ret.PathAppIconImage = this.PathAppIconImage;
		ret.PackageIdentifier = this.PackageIdentifier;
		ret.WindowsCodeSignMethod = this.WindowsCodeSignMethod;
		ret.WindowsCodeSignPKCS12FilePath = this.WindowsCodeSignPKCS12FilePath;
		ret.WindowsCodeSignPKCS12PasswordFormat = this.WindowsCodeSignPKCS12PasswordFormat;
		ret.WindowsCodeSignPKCS12Password = this.WindowsCodeSignPKCS12Password;
		ret.WindowsCodeSignPKCS11Engine = this.WindowsCodeSignPKCS11Engine;
		ret.WindowsCodeSignPKCS11Module = this.WindowsCodeSignPKCS11Module;
		ret.WindowsCodeSignPKCS11Certfile = this.WindowsCodeSignPKCS11Certfile;
		ret.WindowsCodeSignPKCS11KeyID = this.WindowsCodeSignPKCS11KeyID;
		ret.WindowsCodeSignPKCS11PasswordFormat = this.WindowsCodeSignPKCS11PasswordFormat;
		ret.WindowsCodeSignPKCS11Password = this.WindowsCodeSignPKCS11Password;
		ret.WindowsCodeSignAzureVaultName = this.WindowsCodeSignAzureVaultName;
		ret.WindowsCodeSignAzureCertName = this.WindowsCodeSignAzureCertName;
		ret.WindowsCodeSignAzureAppID = this.WindowsCodeSignAzureAppID;
		ret.WindowsCodeSignAzureAppSecretFormat = this.WindowsCodeSignAzureAppSecretFormat;
		ret.WindowsCodeSignAzureAppSecret = this.WindowsCodeSignAzureAppSecret;
		ret.WindowsCodeSignAzureTenantID = this.WindowsCodeSignAzureTenantID;
		ret.MacOSCodeSign = this.MacOSCodeSign;
		return ret;
	}
	public void SetEmbeddedPrivateBrandingProperties(PrivateBrandingProperties other){
		this.BuildMode = other.BuildMode;
		this.PathIcoFile = other.PathIcoFile;
		this.PathIcnsFile = other.PathIcnsFile;
		this.PathMenuBarIcnsFile = other.PathMenuBarIcnsFile;
		this.PathEulaRtf = other.PathEulaRtf;
		this.PathTilePng = other.PathTilePng;
		this.PathHeaderImage = other.PathHeaderImage;
		this.PathAppIconImage = other.PathAppIconImage;
		this.PackageIdentifier = other.PackageIdentifier;
		this.WindowsCodeSignMethod = other.WindowsCodeSignMethod;
		this.WindowsCodeSignPKCS12FilePath = other.WindowsCodeSignPKCS12FilePath;
		this.WindowsCodeSignPKCS12PasswordFormat = other.WindowsCodeSignPKCS12PasswordFormat;
		this.WindowsCodeSignPKCS12Password = other.WindowsCodeSignPKCS12Password;
		this.WindowsCodeSignPKCS11Engine = other.WindowsCodeSignPKCS11Engine;
		this.WindowsCodeSignPKCS11Module = other.WindowsCodeSignPKCS11Module;
		this.WindowsCodeSignPKCS11Certfile = other.WindowsCodeSignPKCS11Certfile;
		this.WindowsCodeSignPKCS11KeyID = other.WindowsCodeSignPKCS11KeyID;
		this.WindowsCodeSignPKCS11PasswordFormat = other.WindowsCodeSignPKCS11PasswordFormat;
		this.WindowsCodeSignPKCS11Password = other.WindowsCodeSignPKCS11Password;
		this.WindowsCodeSignAzureVaultName = other.WindowsCodeSignAzureVaultName;
		this.WindowsCodeSignAzureCertName = other.WindowsCodeSignAzureCertName;
		this.WindowsCodeSignAzureAppID = other.WindowsCodeSignAzureAppID;
		this.WindowsCodeSignAzureAppSecretFormat = other.WindowsCodeSignAzureAppSecretFormat;
		this.WindowsCodeSignAzureAppSecret = other.WindowsCodeSignAzureAppSecret;
		this.WindowsCodeSignAzureTenantID = other.WindowsCodeSignAzureTenantID;
		this.MacOSCodeSign = other.MacOSCodeSign;
	}

}
