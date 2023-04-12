package fr.sdv;

import fr.sdv.tpJDBC.dal.IArticleDAO;
import fr.sdv.tpJDBC.dal.IFournisseurDAO;
import fr.sdv.tpJDBC.dal.jdbc.ArticleDAO;
import fr.sdv.tpJDBC.dal.jdbc.FournisseurDAO;
import fr.sdv.tpJDBC.entities.Article;
import fr.sdv.tpJDBC.entities.Fournisseur;

import java.sql.SQLException;
import java.util.List;

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
