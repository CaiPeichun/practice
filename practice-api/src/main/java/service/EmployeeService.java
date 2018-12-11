package service;

import entity.Employee;

/**
 * 对员工表的
 * @author Administrator
 *
 */
public interface EmployeeService {
	public String addEmp(Employee employee);
	public String deleteEmp(Integer id);
	public String updateEmp(Integer id);
	public Employee queryEmp(Integer id);
}
