package com.shirley.aTest.entity;

import java.io.Serializable;

/**
 * @Description: TODO(校验类)
 */
public class Asserts implements Serializable{
	private static final long serialVersionUID = 1L;
	private String key;
	private String method;
	private String value;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "\n" + "key=" + key + ", method=" + method + ", value=" + value;
	}

}
