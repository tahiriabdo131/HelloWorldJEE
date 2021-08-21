package com.octest.dao;

import java.util.List;
import com.octest.beans.Utilisateur;

public interface UtilisateurDao {
		//On met que la singature des méthodes qu'on veut implémenter 
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister();
}