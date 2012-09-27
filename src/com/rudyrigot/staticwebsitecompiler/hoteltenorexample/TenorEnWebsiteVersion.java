package com.rudyrigot.staticwebsitecompiler.hoteltenorexample;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class TenorEnWebsiteVersion implements WebsiteVersion {
	
	private int versionNumber;
	
	public TenorEnWebsiteVersion(int versionNumber) {
		this.versionNumber = versionNumber;
	}

	public String getSubfolderName() {
		return "";
	}

	public String getFilenamePrefix() {
		return "";
	}

	public String getFilenameSuffixe() {
		return "-en";
	}

	public int getVersionNumber() {
		return versionNumber;
	}
	
}
