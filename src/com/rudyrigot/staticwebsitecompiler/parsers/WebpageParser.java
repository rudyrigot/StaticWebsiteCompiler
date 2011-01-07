package com.rudyrigot.staticwebsitecompiler.parsers;

public class WebpageParser {
	
	public static int FILETYPE_ROOTPAGE = 1;
	public static int FILETYPE_MODULE = 2;
	
	private String fileName;
	private StringBuffer output;
	
	public WebpageParser(String fileName, int fileType) {
		this.fileName = fileName;
		this.output = new StringBuffer();
	}
	
	public String getFileName() {
		return this.fileName;
	}
	
	public StringBuffer parse() {
		return output;
	}

}
