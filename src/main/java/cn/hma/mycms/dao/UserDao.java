package cn.hma.mycms.dao;

import java.util.List;

import cn.hma.mycms.model.Article;
import cn.hma.mycms.model.User;

public interface UserDao {
 
	List<User> getUserList(String username);
	List<Article> getUserArticles(int id);
	
	void save(User user);
	void update(User user);
	void delete(int id);
	User getUserById(int i);

}
