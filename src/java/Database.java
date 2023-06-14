
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dhiraj
 */
public class Database extends HttpServlet {

 Connection cn=null;
    Statement st=null;
    
    String connectdb()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            cn=DriverManager.getConnection("jdbc:mysql://localhost:3306/onlineexamination?autoReconnect=true&useSSL=false","root","root");
            return ("database Connected");
            
        }
        catch(Exception ex)
        {
            return (ex.toString());
        }
    }
    
     
    String Insert(String sql)
    {
        try
        {
            st=cn.createStatement();
            st.executeUpdate(sql);
            return ("Record Inserted");
            
        }
        catch(Exception ex)
        {
            return (ex.toString());
        }
    }
    String Update(String sql)
    {
        try
        {
            st=cn.createStatement();
            st.executeUpdate(sql);
            return ("Record Updated");
            
        }
        catch(Exception ex)
        {
            return (ex.toString());
        }
    }
}