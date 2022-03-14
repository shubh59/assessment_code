package collection.app;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller
 */
@WebServlet("/Controller")
public class Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Controller() {
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String data = request.getParameter("data");
		switch (data) {
		case "addEmp":
			RequestDispatcher rd=request.getRequestDispatcher("/addEmp");
			rd.forward(request, response);
			break;
			
		case "findEmp":
			RequestDispatcher rd1=request.getRequestDispatcher("/peter");
			rd1.forward(request, response);
			break;
			
		case "findEmp":
			RequestDispatcher rd1=request.getRequestDispatcher("/peter");
			rd1.forward(request, response);
			break;

		default:
			response.sendError(404);
			break;
		}
	}

}
