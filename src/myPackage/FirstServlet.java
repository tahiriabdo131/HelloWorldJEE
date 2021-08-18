package myPackage;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.octest.beans.Auteur;



@WebServlet("/test")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FirstServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String nom = (String) request.getParameter("nom");
		//request.setAttribute("nom", nom);
		
		//String[] names = {"Moustapha","Abdelali", "Bilal"};
		//request.setAttribute("names", names);
		
		Auteur auteur = new Auteur();
		auteur.setPrenom("Abdelali");
		auteur.setNom("TAHIRI");
		auteur.setActif(true);
		
		request.setAttribute("auteur", auteur);
		
		 this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}
}