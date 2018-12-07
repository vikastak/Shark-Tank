
import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;


public class FilterByRow extends HttpServlet {
	private static final long serialVersionUID = 1l;

	public FilterByRow() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Append: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String row=request.getParameter("row");
		InsertToDb insertToDb=new InsertToDb();
		ArrayList result=insertToDb.FilterByRow(row);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Rowdisplay.jsp");
		request.setAttribute("rowlist", result);
		requestDispatcher.forward(request, response);
	}

}
