package com.rudyrigot.staticwebsitecompiler.parsers;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public interface CompilingActions {
	
	public String executeCompilingActions(String websiteRoot, WebsiteVersion version, String line, String fileName);

}
