package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.AssertResult;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public interface IAssertResultDAO {
	public List<AssertResult> QueryAsserts(int currentPageNo, int pageSize, int taskId);

	public int QueryAssertsCount(int taskId);

	public AssertResult QueryAssert(int assertId);

	public Boolean DeleteAssertsByTaskId(List<Integer> ids);

}
