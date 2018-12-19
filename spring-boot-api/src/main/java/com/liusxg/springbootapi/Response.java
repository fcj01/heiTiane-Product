package com.liusxg.springbootapi;


import java.io.Serializable;

public class Response implements Serializable {
	
	private static final long serialVersionUID = 6567060950890060686L;
	
	String result = "";
    
    public Response(String str){
    	this.result = str;
    }

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}
    
    
}
