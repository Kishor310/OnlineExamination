
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dhiraj
 */
public class Profile extends HttpServlet {
String prn;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      
        
       PrintWriter out=resp.getWriter();
       prn=req.getParameter("prn");
       String name=req.getParameter("name");
       String moname=req.getParameter("moname");
       String email=req.getParameter("email");
       String contact=req.getParameter("contact");
       String gender=req.getParameter("gender");
       String exam=req.getParameter("subject");
       String add=req.getParameter("address");
       String user=req.getParameter("user");
       String pass=req.getParameter("pass");
       String event=req.getParameter("signup");
       
       out.println(prn);
       out.println(name);
       out.println(moname);
       out.println(email);
       out.println(contact);
       out.println(gender);
       out.println(exam);
       out.println(add);
       out.println(user);
       out.println(pass);
       out.println(event);
       
        Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
         if(event.equals("LaunchTest"))
        {
            try{
         String insert=db.Insert("insert into profile (prn,name,m_name,email,contact,gender,exam,addr,user,pass) values('"+prn.toString()+"','"+name.toString()+"','"+moname.toString()+"','"+email.toString()+"','"+contact.toString()+"','"+gender.toString()+"','"+exam.toString()+"','"+add.toString()+"','"+user.toString()+"','"+pass.toString()+"')");
         out.println(insert);
            }
            catch(Exception e)
            {
                System.out.println(e);
            }
        resp.setContentType("text/html");   
             out.println("<script type=\"text/javascript\">");
             out.println("alert('Profile created Successfully');");
             if(exam.toString()=="Java MCQ Test"){
           
             resp.sendRedirect("JavaTest.jsp");
             }
             else{
              resp.sendRedirect("JavaTest.jsp");
             }
             out.println("</script>");
            }
            else
            {
             
             resp.setContentType("text/html");   
             out.println("<script type=\"text/javascript\">");
             out.println("alert('User or password incorrect');");
             out.println("location='Profile.jsp';");
             out.println("</script>");
         
            }
         
         if (event.equals("Edit"))
      {
         resp.sendRedirect("index.jsp");
      }
//         if(event.equals("Signup"))
//         {
//             if(exam.contains("Python MCQ Test")){
//                  resp.sendRedirect("PythonTest.jsp");
//
//         }
//         
//           else{
//         resp.sendRedirect("JavaTest.jsp");
//         } 
//         }
         
         
         
         }
     public String getprn()
    {
        return prn;
    }
        }
       
    

