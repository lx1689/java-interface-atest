package com.shirley.aTest.dao;

import java.util.List;

import com.shirley.aTest.entity.Email;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public interface IEmailDAO {
	public List<Email> QueryEmail(int currentPageNo, int pageSize, int id, String name, String from, String receives);

	public int QueryEmailCount(int id, String name, String from, String receives);

	public Boolean AddEmail(Email email);

	public Boolean DeleteEmails(List<Integer> ids);

	public Boolean UpdateEmail(Email email);

	public Email QueryEmailById(int id);
}
