package com.octest.dao;

import java.util.List;
import com.octest.beans.Utilisateur;

public interface UtilisateurDao {
		//On met que la singature des m�thodes qu'on veut impl�menter 
    void ajouter( Utilisateur utilisateur ) throws DaoException;
    List<Utilisateur> lister();
}