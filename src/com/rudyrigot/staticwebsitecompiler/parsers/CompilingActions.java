package com.rudyrigot.staticwebsitecompiler.parsers;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public interface CompilingActions {
	
	public String executeCompilingActions(WebsiteVersion version, String line, String fileName);

}
