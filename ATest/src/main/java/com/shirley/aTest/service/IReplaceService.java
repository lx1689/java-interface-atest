package com.shirley.aTest.service;

import java.util.List;

import com.shirley.aTest.entity.Replace;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public interface IReplaceService {
	public List<Replace> QueryReplaces(int currentPageNo, int pageSize, int id, String name);

	public int QueryReplaceCount(int id, String name);

	public Replace QueryReplaceById(int id);

	public Boolean AddReplace(Replace replace);

	public Boolean DeleteReplaces(List<Integer> ids);

	public Boolean UpdateReplace(Replace replace);
}
