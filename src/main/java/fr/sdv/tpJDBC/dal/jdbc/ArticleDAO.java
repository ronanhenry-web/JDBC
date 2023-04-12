package fr.sdv.tpJDBC.dal.jdbc;

import fr.sdv.tpJDBC.entities.Article;
import fr.sdv.tpJDBC.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class ArticleDAO {
    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.password");
    }

    //@Override
    public List<Article> findAll() throws SQLException {
        List<Article> articles = new ArrayList();
        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM article");
            ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                articles.add(new Article(rs.getInt("ID"), rs.getString("REF"), rs.getString("DESINATION"), rs.getInt("PRIX"), rs.getInt("ID_FOU")));
            }
            //fournisseurs.forEach(System.out::println);
        }
        return articles;
    }
}
