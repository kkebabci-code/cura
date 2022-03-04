package com.kkebabci.cura.model;

public class Header {
	
	private String requestId;
	
	private String code;
	
	private String message;
	
	public Header() {
		super();
	}

	public Header(String requestId, String code, String message) {
		super();
		this.requestId = requestId;
		this.code = code;
		this.message = message;
	}

	public String getRequestId() {
		return requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	

	
}
