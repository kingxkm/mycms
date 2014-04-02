package org.kingxkm.myssm.dao;

import org.kingxkm.myssm.model.Article;

public interface ArticleDao {

	void save(Article a);

	void update(Article a);

	void delete(int id);

}
