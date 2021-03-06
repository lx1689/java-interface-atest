package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.Environment;

/**
 * @Description: TODO(环境DAO接口)
 */
public interface IEnvironmentDAO {
	public List<Environment> QueryEnvironment(int currentPageNo, int pageSize, String name, String url);

	public int QueryEnvironmentCount(String name, String url);

	public Boolean AddEnvironment(Environment environment);

	public Boolean DeleteEnvironments(List<Integer> ids);

	public Boolean UpdateEnvironment(Environment environment);

	public Environment QueryEnvironmentById(int id);

}
