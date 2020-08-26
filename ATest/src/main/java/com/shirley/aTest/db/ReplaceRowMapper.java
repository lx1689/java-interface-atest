package com.shirley.aTest.db;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.jdbc.core.RowMapper;

import com.google.gson.Gson;
import com.shirley.aTest.entity.Replace;

/**
 * @Description: TODO(这里用一句话描述这个类的作用)
 */
public class ReplaceRowMapper implements RowMapper<Replace> {

	@Override
	public Replace mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		int id=rs.getInt("id");
		String name = rs.getString("name");
		String description = rs.getString("description");
		String replaceUrl=rs.getString("replace_url");
		String replaceData=rs.getString("replace_data");
		String split=rs.getString("replace_split");
		Map<String, Object> map = new HashMap<String,Object>();
		Map<String, String> urlMap = new HashMap<String,String>();
		Gson gson = new Gson();
		Replace replace = new Replace();
		replace.setId(id);
		replace.setName(name);
		replace.setDescription(description);
		replace.setSplit(split);
		try{
		replace.setReplaceUrl(gson.fromJson(replaceUrl, urlMap.getClass()));
		replace.setReplaceData(gson.fromJson(replaceData, map.getClass()));
		}catch(Exception e){
			e.printStackTrace();
		}
		return replace;
	}

}
