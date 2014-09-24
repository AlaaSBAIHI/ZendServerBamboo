package com.zend.zendserver.bamboo.Env;

public interface BuildEnv {
	public String getVersion() throws Exception;
	public String getWorkingDir();
	public String getZpkDir();
	public String getZpkPath() throws Exception;
	public String getZpkFileName() throws Exception;
}
