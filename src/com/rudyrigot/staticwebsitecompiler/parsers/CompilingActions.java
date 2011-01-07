package com.rudyrigot.staticwebsitecompiler.parsers;

public interface CompilingActions {
	
	public String executeCompilingAction(String line, String fileName, StringBuffer output);

}
