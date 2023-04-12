package fr.sdv.tp3.dal.jdbc;

import fr.sdv.tp3.dal.IFournisseurDAO;
import fr.sdv.tp3.entities.Fournisseur;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class FournisseurDAO implements IFournisseurDAO {
    private static final String DB_URL;
    private static final String DB_LOGIN;
    private static final String DB_PWD;

    static {
        ResourceBundle bundle = ResourceBundle.getBundle("db");
        DB_URL = bundle.getString("db.url");
        DB_LOGIN = bundle.getString("db.user");
        DB_PWD = bundle.getString("db.password");
    }
    @Override
    public List<Fournisseur> findAll() throws SQLException {
        List<Fournisseur> fournisseurs = new ArrayList();
        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            PreparedStatement pst = cnx.prepareStatement("SELECT * FROM fournisseur");
            ResultSet rs = pst.executeQuery()) {

            while (rs.next()) {
                fournisseurs.add(new Fournisseur(rs.getInt("ID"), rs.getString("NOM")));
            }
            fournisseurs.forEach(System.out::println);
        }
        return fournisseurs;
    }

    @Override
    public void insert(Fournisseur fournisseur) throws SQLException {
        try (Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
             PreparedStatement ps = cnx.prepareStatement("INSERT INTO fournisseur (NOM) VALUES (?)")) {

            ps.setString(1, fournisseur.getNom());
            int nb = ps.executeUpdate();
            System.out.println(nb);
        }
    }

    @Override
    public void update(String ancienNom, String nouveauNom) throws SQLException {
        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            PreparedStatement ps = cnx.prepareStatement("UPDATE fournisseur SET NOM = ? WHERE NOM = ?");) {

            ps.setString(1, nouveauNom);
            ps.setString(2, ancienNom);

            int nb = ps.executeUpdate();
            System.out.println(nb);
        }
    }

    @Override
    public void delete(Fournisseur fournisseur) throws SQLException {
        try(Connection cnx = DriverManager.getConnection(DB_URL, DB_LOGIN, DB_PWD);
            PreparedStatement ps = cnx.prepareStatement("DELETE FROM fournisseur WHERE NOM = ?");) {

            ps.setString(1, fournisseur.getNom());

            int nb = ps.executeUpdate();
            System.out.println(nb);
        }
    }
}
