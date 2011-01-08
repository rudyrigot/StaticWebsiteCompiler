package com.rudyrigot.staticwebsitecompiler.batch;

import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;


public interface BatchScripter {
	
	public String getWebsiteRoot();
	
	public WebsiteVersion getWebsiteVersion(int versionNumber);
	public int getAmountOfVersions();
	
	public CompilingActions getCompilingActions();
	

}
