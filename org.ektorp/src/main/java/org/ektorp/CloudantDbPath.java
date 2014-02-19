package org.ektorp;

import org.ektorp.DbPath;

//	Created this,
//	since DbPath doesn't support query parameters like q=3&n=3

public class CloudantDbPath extends DbPath {
	String params = "";
	
	public CloudantDbPath(String s) {
		super(s);
	}
	
	public void addParameter(String key, String value) {
		if(params.length() == 0) {
			params += "?" + key + "=" + escape(value);
		}
		else {
			params += "&" + key + "=" + escape(value);
		}
	}
	
	@Override
	public String getPath() {
		// TODO Auto-generated method stub
		return super.getPath() + params;
	}

}
