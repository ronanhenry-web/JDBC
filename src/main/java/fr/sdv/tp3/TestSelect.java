package fr.sdv.tp3;

import fr.sdv.tp3.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TestSelect {
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
            Statement st = cnx.createStatement();
            // execute Query que pour le SELECT
            ResultSet rs = st.executeQuery("SELECT * FROM fournisseur");) {

            List<Fournisseur> fournisseurs = new ArrayList();

            while (rs.next()) {
                fournisseurs.add( new Fournisseur(rs.getInt("ID"), rs.getString(2)));
            }

            fournisseurs.forEach(System.out::println);

            /*for (Fournisseur item : fournisseurs) {
                System.out.println(fournisseurs);
            }*/

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }

}
