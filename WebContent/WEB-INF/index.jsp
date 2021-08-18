<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
        <p>Bonjour ${ auteur.prenom } ${auteur.nom }</p>
        ${ auteur.actif ? 'You are connected' : 'Deconnected'  }<p></p>
	</body>
</html>