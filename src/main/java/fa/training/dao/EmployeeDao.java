package fa.training.dao;

import java.util.List;

import fa.training.entities.Employee;

public interface EmployeeDao {
	List<Employee> getAllEmployee() throws Exception;
	List<Employee> getAllEmployeeByFilter(String filter, String searchKeyword) throws Exception;
	List<Employee> getAllEmployeeByName(String searchKeyword) throws Exception;
	int getTotalRecordEmployee() throws Exception;
	List<Employee> getEmployeePagination(int form, int to) throws Exception;
	boolean save(Employee emp) throws Exception;
}
