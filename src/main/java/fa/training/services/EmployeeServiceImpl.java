package fa.training.services;

import java.util.ArrayList;
import java.util.List;

import fa.training.entities.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	@Override
	public List<Employee> listEmployeePagination(List<Employee> listAllEmployee, int from, int to) throws Exception{
		List<Employee> listResult = new ArrayList<>();
		for (int i = from; i < to; i++) {
			if(i> listAllEmployee.size() -1) {
				break;
			}
			listResult.add(listAllEmployee.get(i));
		}
		return listResult;
	}

}
