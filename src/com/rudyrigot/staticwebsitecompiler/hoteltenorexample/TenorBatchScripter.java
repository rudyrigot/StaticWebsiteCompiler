package com.rudyrigot.staticwebsitecompiler.hoteltenorexample;

import com.rudyrigot.staticwebsitecompiler.batch.BatchScripter;
import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.DefaultWebsiteVersion;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class TenorBatchScripter implements BatchScripter {

	private String websiteRoot = "/home/rrigot/Macsf/workspace/hoteltenor.com";
	
	public String getWebsiteRoot() {
		return this.websiteRoot;
	}

	public WebsiteVersion getWebsiteVersion(int versionNumber) {
		return (versionNumber==1 ? new DefaultWebsiteVersion() : new TenorEnWebsiteVersion());
	}

	public int getAmountOfVersions() {
		return 2;
	}

	public CompilingActions getCompilingActions() {
		return new TenorCompilingActions();
	}

}
