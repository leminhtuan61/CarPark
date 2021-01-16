package fa.training.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fa.training.dao.AccountDaoImpl;
import fa.training.dao.EmployeeDaoImpl;
import fa.training.entities.Account;
import fa.training.entities.Employee;

/**
 * Servlet implementation class AddController
 */
@WebServlet("/AddController")
public class AddController extends HttpServlet {
	AccountDaoImpl accountDao = new AccountDaoImpl();
	EmployeeDaoImpl employeeDao = new EmployeeDaoImpl();
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AddController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			String firstName = request.getParameter("firstname");
			String lastName = request.getParameter("lastname");
			String phoneNumber = request.getParameter("phonenumber");
			LocalDate dateOfBirth = LocalDate.parse(request.getParameter("dateofbirth"));
			int gender = Integer.parseInt(request.getParameter("gender"));
			String account = request.getParameter("account");
			PrintWriter out = response.getWriter();
			if (accountDao.getAccountByAccount(account) != null) {
				out.println("<script type='text/javascript'>");
				out.println("alert('Account has exist!');");
				out.println("location='addEmployee.jsp'");
				out.println("</script>");
			} else {

				String email = request.getParameter("email");
				String password = request.getParameter("password");
				String address = request.getParameter("address");
				int status = 0;
				if (request.getParameter("active") != null) {
					status = 1;
				}
				String department = request.getParameter("department");
				String remark = request.getParameter("remark");
				Employee emp = new Employee(firstName, lastName, gender, dateOfBirth, phoneNumber, address, department,
						remark);
				Account act = new Account(account, email, password, status, emp);
				emp.setAccount(act);
				employeeDao.save(emp);

				out.println("<script type='text/javascript'>");
				out.println("alert('Create Successfully');");
				out.println("location='addEmployee.jsp'");
				out.println("</script>");
			}
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
