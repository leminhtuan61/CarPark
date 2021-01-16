package fa.training.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fa.training.dao.EmployeeDaoImpl;
import fa.training.entities.Employee;
import fa.training.services.EmployeeServiceImpl;

/**
 * Servlet implementation class EmployeeListController
 */
@WebServlet("/EmployeeListController")
public class EmployeeListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	EmployeeDaoImpl employeeDao;
	EmployeeServiceImpl employeeSevice;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public EmployeeListController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		employeeDao = new EmployeeDaoImpl();

		try {
			int pageSize = 3;
			employeeSevice = new EmployeeServiceImpl();
			List<Employee> listAllEmployees = null;
			HttpSession session = request.getSession();
			List<Employee> listEmployee = null;
			// check command
			if (request.getParameter("page") == null) {
				// new request to list, return page 1
				// put listEmployee into session
				if (session.getAttribute("listEmployee") == null || request.getAttribute("listEmployeeRE") == null) {
					listAllEmployees = employeeDao.getAllEmployee();
					session.setAttribute("listEmployee", listAllEmployees);
				} else {
					listAllEmployees = (List<Employee>) session.getAttribute("listEmployee");
				}
				listEmployee = employeeSevice.listEmployeePagination(listAllEmployees, 0, pageSize);
				request.setAttribute("currentPage", 1);
			} else {
				// get page, return list from page* pageSize -
				listAllEmployees = (List<Employee>) session.getAttribute("listEmployee");
				int page = Integer.parseInt(request.getParameter("page"));

				int from = (page - 1) * pageSize;
				listEmployee = employeeSevice.listEmployeePagination(listAllEmployees, from, from + pageSize);
				request.setAttribute("currentPage", page);
			}
			int totalPage = listAllEmployees.size() % 3 == 0 ? listAllEmployees.size() / 3
					: listAllEmployees.size() / 3 + 1;
			request.setAttribute("totalPage", totalPage);
			request.setAttribute("listEmployee", listEmployee);
			request.getRequestDispatcher("index.jsp").forward(request, response);

		} catch (Exception e) {
			// TODO Auto-generated catch block
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
