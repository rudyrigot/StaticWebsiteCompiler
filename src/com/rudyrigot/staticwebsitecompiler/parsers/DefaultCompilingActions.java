package com.rudyrigot.staticwebsitecompiler.parsers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class DefaultCompilingActions implements CompilingActions {

	private int versionBeingParsed = 0;
	private static Pattern versions0nelinerPattern = Pattern.compile("\\{([^\\}]*)\\}");
	private static Pattern moduleIncluderPattern = Pattern.compile("module\\(([a-z\\-_]+)\\)");
	
	public String executeCompilingActions(String websiteRoot, WebsiteVersion version, String line, String fileName) {
		/** First, let's execute the most common actions */
		
		// Minifying the HTML
		line = line.replaceAll("[ \\n\\t]+", " ");
		
		// Dealing with versions
		// One-liners first
		if (versionBeingParsed == 0) {
			Matcher m = versions0nelinerPattern.matcher(line);
			StringBuffer sb = new StringBuffer();
			while (m.find()) {
				String [] versionsStrings = m.group(1).split("//");
				if (versionsStrings.length>=version.getVersionNumber())
					m.appendReplacement(sb, versionsStrings[version.getVersionNumber()-1]);
				else m.appendReplacement(sb, "");
			}
			m.appendTail(sb);
			line = sb.toString();
		}
		// and then the others
		if (versionBeingParsed == 0 && line.trim().equals("{")) {
			versionBeingParsed = 1;
			return "";
		}
		if (versionBeingParsed>0 && line.trim().equals("//")) {
			versionBeingParsed++;
			return "";
		}
		if (versionBeingParsed>0 && line.trim().equals("}")) {
			versionBeingParsed = 0;
			return "";
		}
		if (versionBeingParsed!=0 && versionBeingParsed!=version.getVersionNumber()) return "";
		
		// Modules
		Matcher m = moduleIncluderPattern.matcher(line);
		if (m.find()) {
			WebpageParser webpageParser = new WebpageParser(websiteRoot, version, this, m.group(1)+".html", WebpageParser.FILETYPE_MODULE);
			return webpageParser.parse();
		}
		
		/** Then, let's call for any other extendable stuff */
		line = extraCompilingActions(version, line, fileName);
		
		return line;
	}
	
	public String extraCompilingActions(WebsiteVersion version, String line, String fileName) {
		return line;
	}

}
