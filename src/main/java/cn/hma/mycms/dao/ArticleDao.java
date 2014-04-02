package cn.hma.mycms.dao;

import cn.hma.mycms.model.Article;

public interface ArticleDao {

	void save(Article a);

	void update(Article a);

	void delete(int id);

}
