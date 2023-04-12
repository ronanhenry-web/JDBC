package fr.sdv.tpJDBC.dal;

import fr.sdv.tpJDBC.entities.Fournisseur;

import java.sql.SQLException;
import java.util.List;

public interface IFournisseurDAO {
    List<Fournisseur> findAll() throws SQLException;
    void insert(Fournisseur fournisseur) throws SQLException;
    void update(String ancienNom, String nouveauNom) throws SQLException;
    void delete(Fournisseur fournisseur) throws SQLException;
}
