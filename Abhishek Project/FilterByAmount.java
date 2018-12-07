
import java.io.IOException;

import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connectionpackage.*;


public class FilterByAmount extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public FilterByAmount() {
		super();

	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.getWriter().append("Append: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String amount=request.getParameter("amount");
		InsertToDb insertToDb=new InsertToDb();
		ArrayList result=insertToDb.FilterByGender(amount);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("Amountdisplay.jsp");
		request.setAttribute("amountlist", result);
		requestDispatcher.forward(request, response);
	}

}

