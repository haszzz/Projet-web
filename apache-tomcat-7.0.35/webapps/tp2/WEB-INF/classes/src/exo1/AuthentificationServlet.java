package exo1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthentificationServlet {
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException { 
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
	    String title = "Bonjour Veuillez vous authentifier";

        out.println("<html>");
        
        out.println("<body bgcolor=\"red\">");

        out.println("<h1>" + title + " big boss" + "</h1>");
        
        out.println("<input type=\"text\" name=\"fname\"><br>");
        out.println("<input type=\"password\" name=\"fname\"><br>");
        out.println("</body>");
        out.println("</html>");
    }
}
