package com.shirley.aTest.service;

import java.util.List;

import com.shirley.aTest.entity.TaskWithTestSuite;

/**
 * @Description: TODO()
 */
public interface ITaskWithTestSuiteService {
	public List<TaskWithTestSuite> QueryTaskWithTestSuite(int currentPageNo, int pageSize,
			int taskId, int testSuiteId, String testSuiteName);

	public Boolean AddTaskWithTestSuite(TaskWithTestSuite taskWithTestSuite);

	public Boolean DeleteTaskWithTestSuite(List<Integer> ids);

	public int QueryProductProjectWithSuiteCount(int taskId, int testSuiteId, String testSuiteName);
	
	public void AddTaskWithTestSuites(List<TaskWithTestSuite> taskWithTestSuites);
}
