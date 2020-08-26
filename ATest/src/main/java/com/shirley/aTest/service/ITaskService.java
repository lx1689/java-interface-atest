package com.shirley.aTest.service;

import java.util.List;

import com.shirley.aTest.entity.Task;

/**
 * @Description: TODO()
 */
public interface ITaskService {
	public List<Task> QueryTask(int currentPageNo, int pageSize, int id, String name);

	public int QueryTaskCount(int id, String name);

	public Task QueryTaskById(int id);

	public Boolean AddTask(Task task);

	public Boolean DeleteTasks(List<Integer> ids);

	public Boolean UpdateTask(Task task);

	public Boolean UpdateTaskStatus(Task task);

	public Boolean UpdateTaskStatus(int id, int status);

	public Boolean UpdateTaskConfig(Task task);

	public Boolean UpdateTaskIsLoop(Task task);
	
	public Boolean UpdateTaskIsSend(Task task);
}
