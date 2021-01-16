package fa.training.services;

import java.util.List;

import fa.training.entities.Employee;

public interface EmployeeService {
	List<Employee> listEmployeePagination(List<Employee> listAllEmployee, int from, int to) throws Exception;
}
