package fr.sdv.tpJDBC.dal;

import fr.sdv.tpJDBC.entities.Article;

import java.sql.SQLException;
import java.util.List;

public interface IArticleDAO {
    List<Article> findAll() throws SQLException;
    void insert(Article article) throws SQLException;
    void update(String ancienNom, String nouveauNom) throws SQLException;
    void delete(Article article) throws SQLException;
}
