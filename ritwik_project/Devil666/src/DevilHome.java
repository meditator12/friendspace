

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.sql.*;

/**
 * Servlet implementation class DevilHome
 */
@WebServlet("/home")
public class DevilHome extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static final String JDBC_DRIVER="com.mysql.jdbc.Driver";  
    static final String DB_URL="jdbc:mysql://localhost/EMP";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";
    
    Connection conn = null;
    Statement stmt = null;
    int val=0;

    /**
     * Default constructor. 
     */
    public DevilHome(){/*HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        // TODO Auto-generated constructor stub
    	HttpSession session = request.getSession();
		String foo = (String) session.getAttribute("firstname");
		if(foo.equals(""))
    		response.sendRedirect("/Devil666/signup");
    	else
    		response.sendRedirect("/Devil666/home");
		
    	System.out.println("hello");*/
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		String foo = (String) session.getAttribute("firstname");
		System.out.println("in home: "+foo);
		if(foo==null || foo.equals("")){
			System.out.println("in home: "+foo);
			response.sendRedirect("/Devil666/signup");
		}
		
    	//System.out.println("hello");

		 try{
	         // Register JDBC driver
	         Class.forName("com.mysql.jdbc.Driver");

	         // Open a connection
	         conn = DriverManager.getConnection(DB_URL,USER,PASS);

	         // Execute SQL query
	         stmt = conn.createStatement();
	         String sql;
	         sql = "SELECT post_id , user_id , post_description , post_type , post_date FROM post";
	        // System.out.println(sql);
	         ResultSet rs = stmt.executeQuery(sql);
	         String postDivs = "";
	         // Extract data from result set
	         while(rs.next()){
	            //Retrieve by column name
	        	// System.out.println("hellooo");
	            int post_id  = rs.getInt("post_id");
	            int user_id = rs.getInt("user_id");
	            String post_description = rs.getString("post_description");
	            String post_type = rs.getString("post_type");
	            String post_date = rs.getString("post_date");
	            
	            
	            postDivs += "<div class= 'interior-one' id='div"+post_id+"'>";
	            postDivs += "<div class= 'post'id='image"+post_id+"'>";
	            postDivs += "<img id='pic"+post_id+"'src='http://desktop.freewallpaper4.me/view/original/5904/jesus-and-the-devil.jpg' alt='devil' width='152px' height='130px'>";
	            postDivs += "</div>";
	            postDivs += "<div class= 'pose'id='write"+post_id+"'>";
	            postDivs += "<div class= 'sub_pose'id='above"+post_id+"'>";
	            postDivs += "<div class= 'one_part'>RItwik put it into the flame wall on"+post_date+"";
	            postDivs += "</div>";
	            postDivs += "<div class= 'second_part'id='edit"+post_id+"'>";
	            postDivs += "<img id='fire_pencil"+post_id+"'src='http://image.shutterstock.com/display_pic_with_logo/597991/597991,1320387303,1/stock-photo-pencil-idea-fire-burn-isolated-on-black-88053079.jpg' alt='devil' width='30' height='20'>";
	            postDivs += "</div>";
	            postDivs += "<div class= 'third_part'id='cross"+post_id+"'>";
	            postDivs += "<img id='fire_cross"+post_id+"'src='http://s.wallpaperhere.com/wallpapers/1920x1200/20120620/4fe16247be9e4.jpg' alt='devil' width='30' height='20'>";
				postDivs += "</div>";
				postDivs += "</div>";
				postDivs += "<div class= 'second_pose'id='posting_div"+post_id+"'>" +post_description+ "</div>";
				postDivs += "</div>";
				postDivs += "</div>";
				
				
	            val = post_id;
	            //Display values
	            /*System.out.println("post_id: " + post_id + "<br>");
	            System.out.println(", user_id: " + user_id + "<br>");
	            System.out.println(", post_description: " + post_description + "<br>");
	            System.out.println(", post_type: " + post_type + "<br>");
	            System.out.println(", post_date: " + post_date + "<br>");*/
	         }
	         
	         //System.out.println(val);
	         request.setAttribute("postDivs" , postDivs);
	         request.setAttribute("values" , val);
	         

	         // Clean-up environment
	         rs.close();
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

		request.getRequestDispatcher("/WEB-INF/ghar.jsp").include(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

	     
	   }
	}


