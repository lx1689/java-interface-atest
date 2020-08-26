package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.SuiteWithCaseController;

/**
* @Description: TODO(这里用一句话描述这个类的作用)
*/
public interface ISuiteWithCaseControllerDAO {

	public List<SuiteWithCaseController> QueryControllerByTestSuiteId(int testSuiteId);

	public Boolean AddSuiteWithCaseController(SuiteWithCaseController suiteWithCaseController);
	
	public Boolean DeleteSuiteWithCaseController(int id);

	public Boolean UpdateSuiteWithCaseController(SuiteWithCaseController suiteWithCaseController);
	
	public void DeleteSuiteWithCaseControllersBySuiteId(List<Integer> ids);

	public String QueryAssertsById(int id);

	public Boolean UpdateAsserts(int id, String asserts);

}
