package com.rudyrigot.staticwebsitecompiler.parsers;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

/**
 * The website that is being parsed. This class mostly makes sure which files will be treated, and passes the info on to the WebpageParser
 * 
 * @author rudyrigot
 *
 */
public class WebsiteParser {
	
	private String websiteRoot;
	/**
	 * If null, then is populated in the constructor with all the rootpages available
	 */
	private List<String> files;
	private WebsiteVersion version;
	private CompilingActions compilingActions;
	
	public WebsiteParser(String websiteRoot, List<String> files, WebsiteVersion version, CompilingActions compilingActions) {
		this.websiteRoot = websiteRoot;
		if (files==null) findAndIndexAllFiles();
		else this.files = files;
		this.version = version;
		this.compilingActions = compilingActions;
	}
	
	public void parse() {
		for(String file : files) {
			new WebpageParser(websiteRoot, version, compilingActions, file, WebpageParser.FILETYPE_ROOTPAGE).parse();
		}
	}
	
	/**
	 * Finds and places in the instance variable "files" all the rootpages available for this site
	 */
	private void findAndIndexAllFiles() {
		files = new ArrayList<String>();
		File websiteRootpagesDir = new File(websiteRoot+"/sources/rootpages");
		String[] websiteRootpagesNames = websiteRootpagesDir.list();
		for (int i=0; i<websiteRootpagesNames.length; i++)
			files.add(websiteRootpagesNames[i]);
	}

}
