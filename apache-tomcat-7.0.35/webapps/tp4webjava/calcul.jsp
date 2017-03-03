<%@page import="java.util.Date" %>

<% 
String operande = request.getParameter("o");
int droite=Integer.parseInt(request.getParameter("d"));
int gauche=Integer.parseInt(request.getParameter("g"));
int res;
String total=request.getParameter("g")+request.getParameter("o")+request.getParameter("d");
if(request.getParameter("o").equals("plus")){
res = gauche + droite;
total += "="+res;
}else if(request.getParameter("o").equals("-")){
	res = gauche - droite;
total += "="+res;
}else if(request.getParameter("o").equals("*")){
res = gauche * droite;
total += "="+res;
}else if(request.getParameter("o").equals("/")){
res = gauche / droite;
total += "="+res;
}
 %>

<html>
<body>
<h1><%= total%></h1>

</body>
</html>