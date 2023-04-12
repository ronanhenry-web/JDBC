package fr.sdv;

import fr.sdv.tp3.dal.IFournisseurDAO;
import fr.sdv.tp3.dal.jdbc.FournisseurDAO;
import fr.sdv.tp3.entities.Fournisseur;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;
import java.util.ResourceBundle;

public class App {


    public static void main(String[] args) {
        System.out.println("Hello world!");

        try {
            IFournisseurDAO dao = new FournisseurDAO();

            // Trouver tous les fournisseurs
            List<Fournisseur> fournisseurs = dao.findAll();
            fournisseurs.forEach(System.out::println);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }
}
