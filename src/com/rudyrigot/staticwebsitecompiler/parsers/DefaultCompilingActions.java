package com.rudyrigot.staticwebsitecompiler.parsers;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class DefaultCompilingActions implements CompilingActions {

	public String executeCompilingActions(WebsiteVersion version, String line, String fileName) {
		/** First, let's execute the most common actions */
		
		// Minifying the HTML
		line = line.replaceAll("[ \\n\\t]+", " ");
		
		
		/** Then, let's call for any other extendable stuff */
		line = extraCompilingActions(version, line, fileName);
		
		return line;
	}
	
	public String extraCompilingActions(WebsiteVersion version, String line, String fileName) {
		return line;
	}

}
