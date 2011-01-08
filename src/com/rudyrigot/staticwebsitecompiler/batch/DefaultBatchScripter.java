package com.rudyrigot.staticwebsitecompiler.batch;

import java.util.ArrayList;
import java.util.List;

import com.rudyrigot.staticwebsitecompiler.hoteltenorexample.TenorEnWebsiteVersion;
import com.rudyrigot.staticwebsitecompiler.parsers.CompilingActions;
import com.rudyrigot.staticwebsitecompiler.parsers.DefaultCompilingActions;
import com.rudyrigot.staticwebsitecompiler.websiteversion.DefaultWebsiteVersion;
import com.rudyrigot.staticwebsitecompiler.websiteversion.WebsiteVersion;

public class DefaultBatchScripter implements BatchScripter {
	
	String websiteRoot = "/var/www/website";
	List<WebsiteVersion> websiteVersions;

	public String getWebsiteRoot() {
		return websiteRoot;
	}

	public List<WebsiteVersion> getWebsiteVersions() {
		if (this.websiteVersions==null) {
			List<WebsiteVersion> websiteVersions = new ArrayList<WebsiteVersion>();
			websiteVersions.add(new DefaultWebsiteVersion());
			websiteVersions.add(new TenorEnWebsiteVersion(2));
			this.websiteVersions = websiteVersions;
		}
		return this.websiteVersions;
	}

	public int getAmountOfVersions() {
		return 1;
	}

	public CompilingActions getCompilingActions() {
		return new DefaultCompilingActions();
	}

}
