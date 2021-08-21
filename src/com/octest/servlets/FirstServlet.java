package com.octest.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.BeanException;
import com.octest.beans.Utilisateur;
import com.octest.dao.*;

/**

 * Servlet implementation class Test

 */

@WebServlet("/test")
public class FirstServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;
    
    private UtilisateurDao utilisateurDao;
    
    public void init() throws ServletException {
        DaoFactory daoFactory = DaoFactory.getInstance();
        this.utilisateurDao = daoFactory.getUtilisateurDao();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("utilisateurs", utilisateurDao.lister());

        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }

    public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException {
    	try {
	        Utilisateur utilisateur = new Utilisateur();     
			utilisateur.setNom(request.getParameter("nom"));
	        utilisateur.setPrenom(request.getParameter("prenom"));
	        try {
				utilisateurDao.ajouter(utilisateur);
			} catch (DaoException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        request.setAttribute("utilisateurs", utilisateurDao.lister());
		} catch (BeanException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			request.setAttribute("erreur", e.getMessage());
		}


        this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);

    }
}