package com.shirley.aTest.service;

import java.util.List;

import com.shirley.aTest.entity.TestSuite;
import com.shirley.aTest.entity.TestSuiteWithCase;

/**
 * @Description: TODO()
 */
public interface ITestSuiteService {
	public List<TestSuite> QueryTestSuite(int currentPageNo, int pageSize, int id, String name, String testCaseName);

	public int QueryTestSuiteCount(int id, String name, String testCaseName);

	public TestSuite QueryTestSuiteById(int id);

	public Boolean AddTestSuite(TestSuite testSuite);

	public Boolean AddTestSuiteWithCases(List<TestSuiteWithCase> testSuiteWithCases);

	public Boolean DeleteTestSuites(List<Integer> ids);

	public Boolean UpdateTestSuite(TestSuite testSuite);
}
