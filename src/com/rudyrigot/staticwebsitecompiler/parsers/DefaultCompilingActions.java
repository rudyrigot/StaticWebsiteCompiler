package com.rudyrigot.staticwebsitecompiler.parsers;

public class DefaultCompilingActions implements CompilingActions {

	// The default one only minifies HTML
	public String executeCompilingAction(String line, String fileName, StringBuffer output) {
		return line.replaceAll("[ \\n\\t]*", " ");
	}

}
