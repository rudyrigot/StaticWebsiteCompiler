package com.rudyrigot.staticwebsitecompiler.hoteltenorexample;

import java.util.ArrayList;
import java.util.List;

import com.rudyrigot.staticwebsitecompiler.batch.BatchScripter;
import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.DefaultWebsiteVersion;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class TenorBatchScripter implements BatchScripter {

	private String websiteRoot = "/home/rrigot/Macsf/workspace/hoteltenor.com";
	private List<WebsiteVersion> websiteVersions;
	
	public String getWebsiteRoot() {
		return this.websiteRoot;
	}

	public List<WebsiteVersion> getWebsiteVersions() {
		if (this.websiteVersions==null) {
			List<WebsiteVersion> websiteVersions = new ArrayList<WebsiteVersion>();
			websiteVersions.add(new DefaultWebsiteVersion());
			websiteVersions.add(new TenorEnWebsiteVersion());
			this.websiteVersions = websiteVersions;
		}
		return this.websiteVersions;
	}

	public CompilingActions getCompilingActions() {
		return new TenorCompilingActions();
	}

}
