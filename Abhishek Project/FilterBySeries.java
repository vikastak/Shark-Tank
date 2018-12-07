
import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;


public class FilterBySeries extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FilterBySeries() {
		super();


	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Append: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String series=request.getParameter("series");
		InsertToDb insertToDb=new InsertToDb();
		ArrayList result=insertToDb.FilterBySeries(series);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Seriesdisplay.jsp");
		request.setAttribute("serieslist", result);
		requestDispatcher.forward(request, response);
	}

}
