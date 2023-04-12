package fr.sdv.tp3.dal;

import fr.sdv.tp3.entities.Fournisseur;

import java.sql.SQLException;
import java.util.List;

public interface IFournisseurDAO {
    List<Fournisseur> findAll() throws SQLException;
    void insert(Fournisseur fournisseur) throws SQLException;
    void update(String ancienNom, String nouveauNom) throws SQLException;
    void delete(Fournisseur fournisseur) throws SQLException;
}
