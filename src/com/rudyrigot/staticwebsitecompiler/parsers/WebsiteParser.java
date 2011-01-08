package com.rudyrigot.staticwebsitecompiler.parsers;

import java.util.List;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class WebsiteParser {
	
	private String websiteRoot;
	private List<String> files;
	private WebsiteVersion version;
	private CompilingActions compilingActions;
	
	public WebsiteParser(String websiteRoot, List<String> files, WebsiteVersion version, CompilingActions compilingActions) {
		this.websiteRoot = websiteRoot;
		this.files = files;
		this.version = version;
		this.compilingActions = compilingActions;
	}

}
