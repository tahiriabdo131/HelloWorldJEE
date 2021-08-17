<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>Hello the communication between jsp and servlet passt successefully</h1>
		<% 
			String time = (String) request.getAttribute("time");
			if(time.equals("jours")){
				System.out.println("Bonjour !");
			}
			else{
				System.out.println("Bonsoir !");
			}
		%>
		<p>		
			<% 
				for(int i=0 ; i<10 ; i++){
					out.println("une ligne num "+i+"</br>");
				}
			%>		
		</p>
	</body>
</html>