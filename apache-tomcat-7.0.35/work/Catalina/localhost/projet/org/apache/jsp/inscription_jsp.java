/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.35
 * Generated at: 2017-03-03 10:08:23 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class inscription_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("<html>\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("  <title>Inscription</title>\r\n");
      out.write("  <meta charset=\"utf-8\">\r\n");
      out.write("  <!--FEUILLE DE STYLE-->\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./styles/inscription.css\" />\r\n");
      out.write("\r\n");
      out.write("  <link rel=\"stylesheet\" type=\"text/css\" href=\"./styles/themeGeneral.css\" />\r\n");
      out.write("\r\n");
      out.write("  <!--POLICE UTILISE -->\r\n");
      out.write("  <link href='https://fonts.googleapis.com/css?family=Montserrat|Pacifico' rel='stylesheet' type='text/css'>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("  <div align=\"center\">\r\n");
      out.write("    <form method=\"POST\" action=\"\" id=\"formInscription\">\r\n");
      out.write("      <h2 id=\"txtInscription\">inscription</h2>\r\n");
      out.write("      <?php\r\n");
      out.write("      echo getErreur();\r\n");
      out.write("      ?>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <input type=\"text\" placeholder=\"Votre prenom \" id=\"prenom\" name=\"prenom\" value=\"\" /><br>\r\n");
      out.write("          <input type=\"text\" placeholder=\"Votre nom\" id=\"nom\" name=\"nom\" value=\"\" /><br>\r\n");
      out.write("          <input type=\"email\" placeholder=\"Votre mail\" id=\"mail\" name=\"mail\" value=\"\" /><br>\r\n");
      out.write("          <input type=\"email\" placeholder=\"Confirmez votre mail\" id=\"mail2\" name=\"mail2\" value=\"\" /><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <p>Afficher les exigences de mot de passe<span>\r\n");
      out.write("\r\n");
      out.write("            * Au moins 6 caractÃ¨res<br>\r\n");
      out.write("            * Pas de caracteres spÃ©ciaux<br>\r\n");
      out.write("            * Au moins une lettre et un chiffre<br>\r\n");
      out.write("            * Au moins une lettre majuscule<br>\r\n");
      out.write("\r\n");
      out.write("          </span></p>\r\n");
      out.write("          <input type=\"password\" placeholder=\"Votre mot de passe\" id=\"mdp\" name=\"mdp\" /><br>\r\n");
      out.write("          <input type=\"password\" placeholder=\"Confirmez votre mot de passe\" id=\"mdp2\" name=\"mdp2\" /><br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("          <input type=\"submit\" name=\"forminscription\" value=\"Je m'inscris\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </form>\r\n");
      out.write("        <a id=\"dejaInscrit\" href=\"./index.php\">Je suis dÃ©jÃ  inscrit</a>\r\n");
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
      out.write("    </html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
