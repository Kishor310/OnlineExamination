package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         \n");
      out.write("        <style>\n");
      out.write("        .div1\n");
      out.write("             {\n");
      out.write("                 background-color: #999999;\n");
      out.write("                height: 400px;\n");
      out.write("                width: 50%;\n");
      out.write("                float: left;\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             } \n");
      out.write("             \n");
      out.write("             .div2\n");
      out.write("             {\n");
      out.write("                background-color: white;\n");
      out.write("                height: 400px;\n");
      out.write("                width: 50%;\n");
      out.write("                float: right;\n");
      out.write("             \n");
      out.write("             \n");
      out.write("             \n");
      out.write("             }  \n");
      out.write("        .jumbotron\n");
      out.write("        {\n");
      out.write("          \n");
      out.write("             position: relative;\n");
      out.write("                 z-index: 2;\n");
      out.write("                 box-shadow: 0px 8px 30px  ;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        label\n");
      out.write("        {\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        u\n");
      out.write("        {\n");
      out.write("            color: #ffff33;\n");
      out.write("            \n");
      out.write("        }\n");
      out.write("        center\n");
      out.write("        {\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("         input[type=text]\n");
      out.write("            {\n");
      out.write("                border: none;\n");
      out.write("\t        border-bottom: 1px solid #00cc00;\n");
      out.write("\t        background: transparent;\n");
      out.write("      \t        outline: none;\n");
      out.write("                color: black;\n");
      out.write("\t        height: 25px;\n");
      out.write("\t\n");
      out.write("\tfont-size: 16px;\n");
      out.write("            }\n");
      out.write("            input[type=password]\n");
      out.write("            {\n");
      out.write("                border: none;\n");
      out.write("\tborder-bottom: 1px solid #00cc00;\n");
      out.write("\tbackground: transparent;\n");
      out.write("\toutline: none;\n");
      out.write("        color: black;\n");
      out.write("\theight: 25px;\n");
      out.write("\t\n");
      out.write("\tfont-size: 16px;\n");
      out.write("            }\n");
      out.write("           \n");
      out.write("         input[type=submit]\n");
      out.write("             {\n");
      out.write("               border: none;\n");
      out.write("\toutline: none;\n");
      out.write("\theight: 40px;\n");
      out.write("        width: 60px;\n");
      out.write("        color: #ffff33;\n");
      out.write("\tfont-size: 16px;\n");
      out.write("\tbackground: #00cc00;\n");
      out.write("\tcursor: pointer;\n");
      out.write("\tborder-radius: 20px;\n");
      out.write("             }   \n");
      out.write("             input[type=submit]:hover\n");
      out.write("             {\n");
      out.write("                 background: #efed40;\n");
      out.write("\tcolor: #262626;\n");
      out.write("             }\n");
      out.write("            a\n");
      out.write("{\n");
      out.write("    color: #00cc00;\n");
      out.write("\tfont-size: 14px;\n");
      out.write("\tfont-weight: bold;\n");
      out.write("\ttext-decoration: none;\n");
      out.write("        float: right;\n");
      out.write("}\n");
      out.write("               \n");
      out.write("        </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body >\n");
      out.write("       \n");
      out.write("        \n");
      out.write("        <script src=\"validation.js\"></script>\n");
      out.write("        <form name=\"login\" action=\"Login\" method=\"post\">\n");
      out.write("        \n");
      out.write("            <div class=\"jumbotron\" style=\"margin-left:300px;width: 50% ;margin-top: 100px;height: 400px  \">\n");
      out.write("                <div class=\"div1\"> \n");
      out.write("                   \n");
      out.write("                    <center>\n");
      out.write("                        <br><br><br>\n");
      out.write("                        <h1 Style=\"color: #ffffff;text-shadow:  2px 3px 6px black;font-family: serif\"> User Login </h1></center>\n");
      out.write("                    <br><br>\n");
      out.write("                    <center><hr style=\"height:2px;width: 50px;border:none;color: #ffff33;background-color: #ffff33\"><br><br >\n");
      out.write("                        You are just few seconds away from<br> our World.Just tell us a little<br> information about you.\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("                 <div class=\"div2\"><br>\n");
      out.write("                     <center> <img src=\"user.png\" class=\"user\"><br><br>\n");
      out.write("                      <span class=\"user\"><i class=\"fa fa-user\"></i></span> \n");
      out.write("                      <input type=\"text\" name=\"txt1\" placeholder=\"Enter User Name\" >\n");
      out.write("                     <br><br>\n");
      out.write("                     <input type=\"password\" name=\"txt2\" placeholder=\"Enter Password\">\n");
      out.write("                     </center>\n");
      out.write("                     <br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                     <input type=\"submit\" name=\"btn1\" value=\"LogIn\" class=\"btn btn-success\">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                     <input type=\"submit\" name=\"btn1\" value=\"SignUp\" class=\"btn btn-primary\">\n");
      out.write("                     \n");
      out.write("                     <br><br>\n");
      out.write("                     \n");
      out.write("                 </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("        </form>   \n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
