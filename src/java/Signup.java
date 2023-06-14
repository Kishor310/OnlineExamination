/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author DELL
 */
public class Signup extends HttpServlet {
  @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
   PrintWriter out=resp.getWriter();
   String uid=req.getParameter("txt1");
        String name=req.getParameter("txt2");
        String mail=req.getParameter("txt9");
        String uname=req.getParameter("txt6");
        String enterpass=req.getParameter("txt7");
       
       String event=req.getParameter("btn1");
        out.println(uid);
        out.println(name);
        out.println(mail);
        out.println(uname);
        out.println(enterpass);
        
         Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        
          if(event.equals("SignUp"))
        {
            
         String insert=db.Insert("insert into user(uid,name,email,username,pass_word)values('"+uid.toString()+"','"+name.toString()+"','"+mail.toString()+"','"+uname.toString()+"','"+enterpass.toString()+"')");
         out.println(insert);
         resp.setContentType("text/html");   
             out.println("<script type=\"text/javascript\">");
             out.println("alert('Signup Successfully');");
             out.println("location='signup.jsp';");
             out.println("</script>");
            }
            else
            {
             
             resp.setContentType("text/html");   
             out.println("<script type=\"text/javascript\">");
             out.println("alert('User or password incorrect');");
             out.println("location='signup.jsp';");
             out.println("</script>");
            }
            if (event.equals("LogIn"))
      {
         resp.sendRedirect("login.jsp");
      }
        }
}
