package com.shirley.aTest.entity;

import java.util.Map;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public class Mock {
	private int id;
	private String name;
	private Map<String, String> bindVariableMocks;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Map<String, String> getBindVariableMocks() {
		return bindVariableMocks;
	}

	public void setBindVariableMocks(Map<String, String> bindVariableMocks) {
		this.bindVariableMocks = bindVariableMocks;
	}

}
