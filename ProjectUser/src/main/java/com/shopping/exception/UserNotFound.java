package com.shopping.exception;

public class UserNotFound extends RuntimeException {
	String msg;
	public UserNotFound(String msg) {
		super();
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

}
