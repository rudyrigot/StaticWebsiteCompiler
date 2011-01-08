package com.rudyrigot.staticwebsitecompiler.batch;

import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.parsers.DefaultCompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.DefaultWebsiteVersion;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class DefaultBatchScripter implements BatchScripter {
	
	String websiteRoot = "~/website";

	public String getWebsiteRoot() {
		return websiteRoot;
	}

	public WebsiteVersion getWebsiteVersion(int versionNumber) {
		return new DefaultWebsiteVersion();
	}

	public int getAmountOfVersions() {
		return 1;
	}

	public CompilingActions getCompilingActions() {
		return new DefaultCompilingActions();
	}

}
