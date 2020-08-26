package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.TestSuite;
import com.shirley.aTest.entity.TestSuiteWithCase;

/**
 * @Description: TODO(测试集DAO接口)
 */
public interface ITestSuiteDAO {
	public List<TestSuite> QueryTestSuite(int currentPageNo, int pageSize, int id, String name, String testCaseName);

	public int QueryTestSuiteCount(int id, String name, String testCaseName);

	public TestSuite QueryTestSuiteById(int id);

	public Boolean AddTestSuite(TestSuite testSuite);

	public Boolean AddTestSuiteWithCase(TestSuiteWithCase testSuiteWithCase);

	public Boolean DeleteTestSuites(List<Integer> ids);

	public Boolean UpdateTestSuite(TestSuite testSuite);

}
