package com.rudyrigot.staticwebsitecompiler.batch;

import java.util.List;

import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;


public interface BatchScripter {
	
	public String getWebsiteRoot();
	
	public List<WebsiteVersion> getWebsiteVersions();
	
	public CompilingActions getCompilingActions();
	

}
