package com.shirley.aTest.entity;

import java.util.Arrays;

import org.apache.http.Header;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public class ResponseContent {
	private Header[] headers;
	private String responseCode;
	private String content;

	public Header[] getHeaders() {
		return headers;
	}

	public void setHeaders(Header[] headers) {
		this.headers = headers;
	}

	public String getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(String responseCode) {
		this.responseCode = responseCode;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return "响应头：" + Arrays.toString(headers) + "\n" + "响应码：" + responseCode + "\n" + "响应内容：" + content;
	}

}
