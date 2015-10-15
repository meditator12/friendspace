

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PostBack
 */
@WebServlet("/postback")
public class PostBack extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
    static final String DB_URL="jdbc:mysql://localhost/EMP";
    

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    
    Connection conn = null;
    Statement stmt = null;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostBack() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String number = (String) session.getAttribute("user_id");
		int sinner_id = Integer.parseInt(number);
		System.out.println(sinner_id);
		String post_value = request.getParameter("take");
		System.out.println(post_value);
		 // JDBC driver name and database URL
	      

	      // Set response content type
	      response.setContentType("text/html");
	      

	      try{
	         // Register JDBC driver
	         Class.forName("com.mysql.jdbc.Driver");

	         // Open a connection
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);
	         
	         // Execute SQL query
	         stmt = conn.createStatement();
	         String sql;
	         sql = "INSERT INTO post VALUES (0,"+sinner_id+",'"+ post_value + "','text', '2014/07/28')"; 	         
	         System.out.println(sql);
	         stmt.executeUpdate(sql);

	         

	         // Clean-up environment
	         stmt.close();
	         conn.close();
	      }catch(SQLException se){
	         //Handle errors for JDBC
	         se.printStackTrace();
	      }catch(Exception e){
	         //Handle errors for Class.forName
	         e.printStackTrace();
	      }finally{
	         //finally block used to close resources
	         try{
	            if(stmt!=null)
	               stmt.close();
	         }catch(SQLException se2){
	         }// nothing we can do
	         try{
	            if(conn!=null)
	            conn.close();
	         }catch(SQLException se){
	            se.printStackTrace();
	         }//end finally try
	      } //end try
	}

}
