package com.rudyrigot.staticwebsitecompiler.hoteltenorexample;

import com.rudyrigot.staticwebsitecompiler.batch.BatchScripter;

public class TenorBatchScripter implements BatchScripter {

	private String websiteRoot = "/home/rrigot/Macsf/workspace/hoteltenor.com";
	
	public String getWebsiteRoot() {
		return this.websiteRoot;
	}

}
