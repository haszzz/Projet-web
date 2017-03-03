<%@page import="java.util.ArrayList" %>



<html>
<body>
<h1>
<% 
String action = request.getParameter("action");
ArrayList<String> produits = new ArrayList<String>();
String prod = " ";
if(action.equals("consulter")){
	for(String s : produits){
		prod += s +"\n";
	}
	out.println(prod);
}else if(action.equals("ajouter") ){
	String p = request.getParameter("produit");
	produits.add(p);
}
 %>
</h1>
</body>
</html>