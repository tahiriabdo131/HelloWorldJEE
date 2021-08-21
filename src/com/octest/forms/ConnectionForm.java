package com.octest.forms;

import javax.servlet.http.HttpServletRequest;

public class ConnectionForm {
	private String resultat;
	
	public void verifierIdentifiants(HttpServletRequest request) {
		String login = request.getParameter("login");
		String password = request.getParameter("password");
		
		if(password.equals(login+"123")) {
			resultat = "Vous etes bien connecté !";
		}
		else {
			resultat = "Identifiants Incorrects !";
		}
	}

	public String getResultat() {
		return resultat;
	}

	public void setResultat(String resultat) {
		this.resultat = resultat;
	}	
}
