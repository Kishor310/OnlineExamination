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
public class JavaTest extends HttpServlet {

   int score=0;
//    String prno;
//    JavaTest()
//    {
//    Profile pr =new Profile();
//     prno=pr.getprn();
//    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       
        PrintWriter out=resp.getWriter();
        String q1=req.getParameter("q1");
        String q2=req.getParameter("q2");
        String q3=req.getParameter("q3");
        String q4=req.getParameter("q4");
        String q5=req.getParameter("q5");
        String q6=req.getParameter("q6");
        String q7=req.getParameter("q7");
        String q8=req.getParameter("q8");
        String q9=req.getParameter("q9");
        String q10=req.getParameter("q10");
        String event=req.getParameter("Submit");
        
        
        out.println(q1);
        out.println(q2);
        out.println(q3);
        out.println(q4);
        out.println(q5);
        out.println(q6);
        out.println(q7);
        out.println(q8);
        out.println(q9);
        out.println(q10);
        
        
        if(q1=="c"){
            score++;
        }
        if(q2=="d"){
            score++;
        }
        if(q3=="b"){
            score++;
        }
        if(q4=="a"){
            score++;
        }
        if(q5=="a"){
            score++;
        }
        if(q6=="a"){
            score++;
        }
        if(q7=="b"){
            score++;
        }
        if(q8=="a"){
            score++;
        }
        if(q9=="a"){
            score++;
        }
        if(q10=="b"){
            score++;
        }
        
      
         Database db=new Database();
        String result=db.connectdb();
        out.println(result);
        
        
//         if(event.equals("Submit"))
//        {
//            try{
//                
//                 resp.setContentType("text/html");   
//             out.println("<script type=\"text/javascript\">");
//             out.println("alert('score is:'+score);");
//             out.println("</script>");
//             Profile pr= new Profile("prn");
//               int p1=Integer.parseInt(pr.getprn());
////         String insert=db.Insert("insert into profile(score)values('"+score+"') where prn='"+p1+"'");
////               String update=db.Update("UPDATE profile SET score='"+score+"' WHERE prn='"+pr+"'" );
////         out.println(update);
//                 String update=db.Update("update profile set score='"+score+"' where prn='"+pr+"' ");
//         out.println(update);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
          if(event.equals("Submit"))
        {
          out.println("alert('Profile Updated Successfully');");  
          out.println(score);
          String Update=db.Update("Update into profile set score='"+score+"'");
          out.println(Update);
//            try{
//                Profile pr= new Profile("prn");
////               int p1=Integer.parseInt(pr.getprn());
////               float prn=Float.parseFloat(p1.getprn());
//                String Update=db.Update("update into profile set score='"+score+"' where prn='"+pr.prn+"'") ;
//         out.println(Update);
//            }
//            catch(Exception e)
//            {
//                System.out.println(e);
//            }
//        resp.setContentType("text/html");   
//             out.println("<script type=\"text/javascript\">");
//             out.println("alert('Profile Updated Successfully');");
//             out.println("</script>");
//            }
//            else
//            {
//             
//             resp.setContentType("text/html");   
//             out.println("<script type=\"text/javascript\">");
//             out.println("alert('User or password incorrect');");
//             out.println("location='Profile.jsp';");
//             out.println("</script>");
//         
//            }
//        
        
    }
    } 

  public static void main(String [] args)
    {
        JavaTest jt=new JavaTest();
       
    }
}