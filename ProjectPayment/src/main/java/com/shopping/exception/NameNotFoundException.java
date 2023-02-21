package com.shopping.exception;

public class NameNotFoundException extends RuntimeException {
	String msg;
	public NameNotFoundException(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
