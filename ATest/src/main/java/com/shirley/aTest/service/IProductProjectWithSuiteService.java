package com.shirley.aTest.service;

import java.util.List;

import com.shirley.aTest.entity.ProductProjectWithSuite;

/**
* @Description: TODO(这里用一句话描述这个类的作用)
*/
public interface IProductProjectWithSuiteService {
	public List<ProductProjectWithSuite> QueryProductProjectWithSuite(int currentPageNo, int pageSize, int productProjectId,int testSuiteId, String testSuiteName);

	public Boolean AddProductProjectWithSuite(ProductProjectWithSuite productProjectWithSuite);

	public Boolean DeleteProductProjectWithSuite(List<Integer> ids);
	
	public int QueryProductProjectWithSuiteCount(int productProjectId, int testSuiteId, String testSuiteName);

}
