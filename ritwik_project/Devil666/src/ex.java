

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex
 */
@WebServlet("/ex")
public class ex extends HttpServlet {
	private static final long serialVersionUID = 1L;
	String name,city;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    
		

		request.getRequestDispatcher("/WEB-INF/prac.jsp").include(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		name = request.getParameter("name");
		city = request.getParameter("city");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.write(name + city);
        
	}
	
	

}
