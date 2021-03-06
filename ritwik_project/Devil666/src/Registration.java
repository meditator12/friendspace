

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

/**
 * Servlet implementation class Registration
 */
@WebServlet("/registration")
public class Registration extends HttpServlet {
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
    public Registration() {
        super();
       System.out.println("hell");
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/WEB-INF/reg.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String fname = request.getParameter("firstname");
		String lname = request.getParameter("lastname");
		String pswd = request.getParameter("pwd");
		String cpwd = request.getParameter("cpwd");
		String gender = request.getParameter("sex");
		String email = request.getParameter("E-mailid");
		String[] check = request.getParameterValues("vehicle");
		int i,bik = 0,ca = 0,othe = 0;
		
	/*	System.out.println(check[0]+"-"+check[1]+"-"+check[2]);
		for(i = 0; i <= 2; i++)
		{	
			System.out.println(check[i]);
			if(check[i].equals("bike"))
				bik = 1;
			System.out.println(bik);
			System.out.println(check[i]);
			if(check[i].equals("car"))
				ca = 1;
			if(check[i].equals("other"))
				othe = 1;
			System.out.println(othe);
			
		}*/
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
	         sql = "INSERT INTO registration VALUES (0,'" +fname+ "' , '"+lname+"','" +pswd+ "', '"+cpwd+"', '"+gender+"' , '"+email+"' , '"+bik+"' , '"+ca+"' , '"+othe+"')";	         
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
	      response.sendRedirect("/Devil666/signup");
	}

}
