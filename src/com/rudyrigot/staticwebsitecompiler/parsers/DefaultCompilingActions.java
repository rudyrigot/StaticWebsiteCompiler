package com.rudyrigot.staticwebsitecompiler.parsers;

public class DefaultCompilingActions implements CompilingActions {

	public String executeCompilingActions(String line, String fileName) {
		/** First, let's execute the most common actions */
		
		// Minifying the HTML
		line = line.replaceAll("[ \\n\\t]*", " ");
		
		
		/** Then, let's call for any other extendable stuff */
		line = extraCompilingActions(line, fileName);
		
		return line;
	}
	
	public String extraCompilingActions(String line, String fileName) {
		return line;
	}

}
