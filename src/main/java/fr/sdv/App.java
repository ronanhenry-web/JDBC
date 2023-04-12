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

            // Ajouter un nouveau fournisseur
            //Fournisseur nouveauFournisseur = new Fournisseur("L’Espace Création");
            //dao.insert(nouveauFournisseur);

            // Mettre à jour un fournisseur
            //dao.update("La Maison des Chaises", "La Maison des Voitures");

            // Supprimer un fournisseur
            //Fournisseur fournisseurASupprimer = new Fournisseur("La Maison des Vins");
            //dao.delete(fournisseurASupprimer);

        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }


    }
}
