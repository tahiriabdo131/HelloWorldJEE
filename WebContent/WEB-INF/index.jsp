<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<form method="post" action="bonjour">
		        <p>
		            <label for="nom">Nom : </label>
		            <input type="text" name="nom" id="nom" />
		        </p>
		        <p>
		            <label for="prenom">Pr�nom : </label>
		            <input type="text" name="prenom" id="prenom" />
		        </p>
		        <input type="submit" />
	   	</form>
	    <ul>
	        <c:forEach var="utilisateur" items="${ utilisateurs }">
	            <li><c:out value="${ utilisateur.prenom }" /> <c:out value="${ utilisateur.nom }" /></li>
	        </c:forEach>
	    </ul>
	</body>
</html>