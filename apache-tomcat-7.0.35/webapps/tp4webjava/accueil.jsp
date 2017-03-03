<%@page import="java.util.Date" %>

<% 
String nom = request.getParameter("nom");
String sexe=" ";

if(request.getParameter("sexe").equals("m")){
	sexe ="monsieur";
}else if(request.getParameter("sexe").equals("f")){
	sexe ="madame";
}
Date today = new Date(); %>

<html>
<body>
<h1>Bonjour <%= sexe.toString() + " " + nom%> on est le <%= today.toString() %>!</h1>

</body>
</html>