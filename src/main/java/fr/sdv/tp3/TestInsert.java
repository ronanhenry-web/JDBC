package fr.sdv.tp3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

public class TestInsert {
    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.password");
    }

    public static void main(String[] args) {
        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            Statement st = cnx.createStatement()) {

            // execute Update que pour le DELETE, INSERT et UPDATE
            int nb = st.executeUpdate("INSERT INTO fournisseur (NOM) VALUES ('La Maison de la Peinture')");
            System.out.println(nb);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
