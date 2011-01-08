package com.rudyrigot.staticwebsitecompiler.parsers;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class WebpageParser {
	
	public static int FILETYPE_ROOTPAGE = 1;
	public static int FILETYPE_MODULE = 2;

	private String websiteRoot;
	private WebsiteVersion version;
	private CompilingActions compilingActions;
	private String fileName;
	private int fileType;
	private StringBuffer output;
	
	public WebpageParser(String websiteRoot, WebsiteVersion version, CompilingActions compilingActions, String fileName, int fileType) {
		this.websiteRoot = websiteRoot;
		this.version = version;
		this.compilingActions = compilingActions;
		this.fileName = fileName;
		this.fileType = fileType;
		this.output = new StringBuffer();
	}

	public StringBuffer parse() {
		return output;
	}

}
