package org.kingxkm.myssm.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.kingxkm.myssm.model.Article;
import org.kingxkm.myssm.model.User;

public interface UserDao {
	
	@Results(value = {
			 @Result(property = "age", column = "userAge")
			 })
	@Select("SELECT * FROM t_user where id = #{id} ")
	User getUserById(int i);
	User getUser(int u);
	List<User> search(Map<String, Object> parameters);
//	@Results(value = {
	//		 @Result(property = "age", column = "userAge")
		//	 })
	//@Select("SELECT * FROM t_user")
	//List<User> getUserList();
	List<User> getUserList(String username);
	List<Article> getUserArticles(int id);
	
	void save(User user);
	void update(User user);
	void delete(int id);

}
