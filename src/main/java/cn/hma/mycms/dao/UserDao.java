package cn.hma.mycms.dao;

import org.springframework.data.repository.CrudRepository;

import cn.hma.mycms.model.User;

public interface UserDao extends CrudRepository<User, Long>{
 
	 

}
