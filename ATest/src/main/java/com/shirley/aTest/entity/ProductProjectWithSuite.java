package com.shirley.aTest.entity;
/**
* @Description: TODO(这里用一句话描述这个类的作用)
*/
public class ProductProjectWithSuite {
	private int id;
	private int productProjectId;
	private int testSuiteId;
	private String testSuiteName;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getProductProjectId() {
		return productProjectId;
	}
	public void setProductProjectId(int productProjectId) {
		this.productProjectId = productProjectId;
	}
	public int getTestSuiteId() {
		return testSuiteId;
	}
	public void setTestSuiteId(int testSuiteId) {
		this.testSuiteId = testSuiteId;
	}
	public String getTestSuiteName() {
		return testSuiteName;
	}
	public void setTestSuiteName(String testSuiteName) {
		this.testSuiteName = testSuiteName;
	}
	
	

}
