package cn.hma.mycms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.hma.mycms.dao.UserDao;
import cn.hma.mycms.model.Article;
import cn.hma.mycms.model.User;

import com.alibaba.fastjson.JSON;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/applicationContext.xml")
public class TestUserDaoWithSpring {

	@Autowired
	private UserDao userDao;

	@Test
	public void tgetUser() {

		User user = userDao.getUserById(8);
		System.out.println(JSON.toJSONString(user));

	}

	@Test
	public void tgetUsers() {

		List<User> users = userDao.getUserList("雄杰");
		System.out.println(JSON.toJSONString(users));

	}

	@Test
	public void tupdateUser() {

		User user = userDao.getUserById(5);
		System.out.println(JSON.toJSONString(user));
		System.out.println("-------------------");
		user.setUserAddress("中华人民共和国");
		userDao.update(user);
		System.out.println(JSON.toJSONString(user));

	}

	@Test
	public void tsaveUser() {
		User u = new User();
		u.setUserAddress("红河县跑马路社区1");
		u.setAge(34);
		u.setUserName("s马雄杰");

		userDao.save(u);
		System.out.println(u);

	}

	@Test
	public void tgetUserArticles() {

		List<Article> arts = userDao.getUserArticles(5);
		System.out.println(JSON.toJSONString(arts));

		for (Article art : arts) {
			System.out.println(art.getTitle() + ":" + art.getContent()
					+ ":作者是:" + art.getUser().getUserName() + ":地址:"
					+ art.getUser().getUserAddress());
		}
		System.out.println(userDao.getUser(1).getUserName() + "发布的文章有：");
		// for(Iterator it = arts.iterator(); it.hasNext(); ) {
		// Article a = (Article)it.next();
		// System.out.println(a.getUser().getUserName());
		// }

	}

}
