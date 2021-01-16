package fa.training.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fa.training.dao.AccountDaoImpl;
import fa.training.entities.Account;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AccountDaoImpl accountDao = new AccountDaoImpl();
		String account = request.getParameter("username");
		String password = request.getParameter("password");

		Account userResult;
		response.setContentType("text/html;charset=UTF-8");
		PrintWriter out = response.getWriter();
		String error = null;
		try {
			if (accountDao.getAccountByAccount(account) == null) {
				error = "Wrong Username or password";
				out.println("<script type='text/javascript'>");
				out.println("alert('WRONG');");
				out.println("location='login.jsp'");
				out.println("</script>");
				out.close();
			} else {
				userResult = accountDao.getAccountByAccount(account);
				if (userResult.getPassword().equals(password)) {
					HttpSession session = request.getSession();
					session.setAttribute("account", userResult);
					out.println("<script type='text/javascript'>");
					out.println("alert('Login succesfully');");
					out.println("location='EmployeeListController'");
					out.println("</script>");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
