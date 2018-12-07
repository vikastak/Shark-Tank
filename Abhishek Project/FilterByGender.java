
import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;


public class FilterByGender extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public FilterByGender() {
        super();

    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Append: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String gender=request.getParameter("gender");
		InsertToDb insertToDb=new InsertToDb();
	    ArrayList result=insertToDb.FilterByGender(gender);
	    RequestDispatcher requestDispatcher = request.getRequestDispatcher("Genderdisplay.jsp");
	    request.setAttribute("genderlist", result);
	    requestDispatcher.forward(request, response);
	}

}
