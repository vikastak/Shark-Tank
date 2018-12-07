
import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;


public class FilterBySeason extends HttpServlet {
	private static final long serialVersionUID = 1l;

	public FilterBySeason() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Append: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String season=request.getParameter("season");
		InsertToDb insertToDb=new InsertToDb();
		ArrayList result=insertToDb.FilterByGender(season);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Seasondisplay.jsp");
		request.setAttribute("seasonlist", result);
		requestDispatcher.forward(request, response);
	}

}
